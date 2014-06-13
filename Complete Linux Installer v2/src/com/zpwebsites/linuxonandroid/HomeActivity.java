/*
* Copyright (C) 2014 linuxonandroid.org
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.zpwebsites.linuxonandroid;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;

public class HomeActivity extends BaseActivity implements Runnable {
		private static String	TAG		= "Complete Linux Installer";		// Used when logging as app name
		private static String	NAME 	= "Splash";	
		static final int		CHECK_LICENSE_REQUEST		= 1;

		// The next 3 is the package names of the paid apps that now functions as donation files
		static boolean						keyChecked			= false;

	    final Context context = this;
		private ProgressDialog progressDialog;
		//A thread, that will be used to execute code in parallel with the UI thread
		private Thread thread;
		//Create a Thread handler to queue code execution on a thread
		private Handler handler;

		//public static SharedPreferences sharedpreferences;
		SharedPreferences.Editor editor;

		public void onCreate(Bundle savedInstanceState) {
			mTitleRes = R.string.app_name;
			//Change to use singleton class for shared preferences object so other classes have access
	    	//sharedpreferences = getSharedPreferences("PrefFile", MODE_PRIVATE); 
			AppPreferences.init(this);
	        editor = AppPreferences.getPrefs().edit();
	    	super.onCreate(savedInstanceState);
	        setContentView(R.layout.splash);
	        setSlidingActionBarEnabled(false);
	        
	        boolean complete = AppPreferences.getPrefs().getBoolean("COMPLETE", false);
			if (complete){
				toggle();
			}else{
		        AlertDialog.Builder builder = new AlertDialog.Builder(this);
		        builder.setTitle(R.string.first_alert)
		        	.setMessage(R.string.first_text)
		            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int id) {
		                	finish();
		                }
		            })
		            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int id) {
		                	progressDialog = new ProgressDialog(HomeActivity.this);
		        			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		        			progressDialog.setTitle(R.string.first_install);
		        			progressDialog.setMessage(getString(R.string.check_system));
		        			progressDialog.setCancelable(false);
		        			progressDialog.setIndeterminate(false);
		        			progressDialog.setMax(100);
		        			progressDialog.setProgress(0);
		        			progressDialog.show();
		        			//Initialize the handler
		        	        handler = new Handler();
		        	        //Initialize the thread
		        	        thread = new Thread(HomeActivity.this, "ProgressDialogThread");
		        	        //start the thread
		        	        thread.start();
	
		                }
		            });
		            ;
		        AlertDialog alert = builder.create();
		        alert.show();
			}
			
	    }

		//Initialize a counter integer to zero
		int counter = 0;

		@Override
		public void run()
		{
			try
			{
				synchronized (thread)
				{
					boolean complete = AppPreferences.getPrefs().getBoolean("COMPLETE", false);
					if (!complete){
						checkSystem();
						handler.post(new Runnable()
						{
							@Override
							public void run()
							{
								progressDialog.setMessage(getString(R.string.install_busybox));
								progressDialog.setProgress(20);
							}
						});
						thread.wait(1000);
						copyBusyBox();
						handler.post(new Runnable()
						{
							@Override
							public void run()
							{
								progressDialog.setMessage(getString(R.string.copy_busybox));
								progressDialog.setProgress(40);
							}
						});
						thread.wait(1000);
						copyScript();
						handler.post(new Runnable()
						{
							@Override
							public void run()
							{
								progressDialog.setMessage(getString(R.string.copy_bootscript));
								progressDialog.setProgress(60);
							}
						});
						thread.wait(1000);
						copyAutoBootScript();
						handler.post(new Runnable()
						{
							@Override
							public void run()
							{
								progressDialog.setProgress(80);
							}
						});
						thread.wait(1000);
						@SuppressWarnings("unused")
						SharedPreferences settings = this.getSharedPreferences("MyApp",0);						
						

						handler.post(new Runnable()
						{
							@Override
							public void run()
							{
								progressDialog.setMessage(getString(R.string.complete));
								progressDialog.setProgress(100);
							}
						});
						thread.wait(1000);

					}

			        Log.i(TAG, "Language = " + Locale.getDefault().getISO3Language());
				}
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}


			//This works just like the onPostExecute method from the AsyncTask class
			handler.post(new Runnable()
			{
				@Override
				public void run()
				{
					progressDialog.dismiss();
					toggle();
					editor.putBoolean("COMPLETE", true);
					editor.commit();
			    	
				}
			});

			//Try to "kill" the thread, by interrupting its execution
			synchronized (thread)
			{
				thread.interrupt();
			}
		}

		private void copyBusyBox() {
			String outPath = "/data/data/" + this.getPackageName() + "/files";
			File busyBox = new File(outPath + "/busybox");
			File dir = new File(outPath);

			if (busyBox.exists()) return;	// return if file already is copied
			if (!dir.exists()) dir.mkdir(); // Create folder if not found

			AssetManager assetManager = getAssets();
			try {
		        String arch = AppPreferences.getPrefs().getString("ARCH", "ARM");
		        InputStream in;
		        if (arch.equals("X86")){
					in = assetManager.open("busyboxx86");
		        }else{
					in = assetManager.open("busybox");
		        }
				FileOutputStream out = new FileOutputStream(busyBox);

				byte[] buffer = new byte[1024];
				int read;
				while((read = in.read(buffer)) != -1){
					out.write(buffer, 0, read);
				}

				in.close();
				in = null;
				out.flush();
				out.close();
				out = null;

				Log.i(TAG, NAME + ": Busybox copied to " + outPath);

				// Now the file is copied we chmod it so it can be executed
				String script = "chmod 755 "+ outPath  + "/busybox\n";
				runAsRoot(script);

			} catch(Exception e) {
				Log.e(TAG, NAME + ": " + e.getMessage());
			}
		}

		

		@Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			if (requestCode == CHECK_LICENSE_REQUEST) {
				if (resultCode == RESULT_OK) {
					editor.putBoolean("full", true);
					editor.commit();
					keyChecked = true;
//					setContentView(R.layout.splash);

					Log.i(TAG, NAME + ": Liense check success, running in full mode");

				} else {
					editor.putBoolean("full", false);
					editor.commit();				
					keyChecked = true;
//					setContentView(R.layout.splash); // Here we can set another layout for free mode if we have to in the future

					Log.i(TAG, NAME + ": License check failed, running in free mode");
				}
			}
		}

		public static boolean runAsRoot(String script) {
			Process p;
			try {
				p = Runtime.getRuntime().exec("su"); 
				DataOutputStream os = new DataOutputStream(p.getOutputStream());

				os.writeBytes(script);
				os.writeBytes("exit\n");
				os.flush();

				try {
					p.waitFor();
					if (p.exitValue() != 255) {
						return true;
					}
					else {
						return false;
					}
				} catch (InterruptedException e) {
					return false;
				}

			} catch (IOException e) {
				Log.e (TAG, NAME + ": runAsRoot error: " + e.getMessage());
				return false;
			}
		}

		private void copyAutoBootScript() {
			String outPath = "/data/data/" + this.getPackageName() + "/files";
			File script = new File(outPath + "/autobootscript.sh");

			if (script.exists()) return;	// return if file already is copied

			AssetManager assetManager = getAssets();
			try {
				InputStream in = assetManager.open("autobootscript.sh");
				FileOutputStream out = new FileOutputStream(script);

				byte[] buffer = new byte[1024];
				int read;
				while((read = in.read(buffer)) != -1){
					out.write(buffer, 0, read);
				}

				in.close();
				in = null;
				out.flush();
				out.close();
				out = null;

				Log.i(TAG, NAME + ": autobootscript.sh copied to " + outPath);

			} catch(Exception e) {
				Log.e(TAG, NAME + ": Error copying auto boot script! " + e.getMessage());
			}
		}

		private void copyScript() {
			String outPath = "/data/data/" + this.getPackageName() + "/files";
			File script = new File(outPath + "/bootscript.sh");
//			File dir = new File(outPath);
			
			if (script.exists()) return;	// return if file already is copied
//			if (!dir.exists()) dir.mkdir(); // Create folder if not found
			String bootscriptopen = "";
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
				bootscriptopen = "bootscript4-3.sh";
			}else{
				bootscriptopen = "bootscript.sh";
			}
			AssetManager assetManager = getAssets();
			try {
				InputStream in = assetManager.open(bootscriptopen);
				FileOutputStream out = new FileOutputStream(script);

				byte[] buffer = new byte[1024];
				int read;
				while((read = in.read(buffer)) != -1){
					out.write(buffer, 0, read);
				}

				in.close();
				in = null;
				out.flush();
				out.close();
				out = null;

				Log.i(TAG, NAME + ": bootscript.sh copied to " + outPath);

			} catch(Exception e) {
				Log.e(TAG, NAME + ": Error copying boot script! " + e.getMessage());
			}
		}

		
		public void checkSystem(){
			String androidV;
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
				androidV = "4.3";
			}else{
				androidV = "1";
			}			
			String arch = System.getProperty("os.arch");    
			String arc = arch.substring(0, 3).toUpperCase();
			
			editor.putString("ANDROID", androidV);
			editor.putString("ARCH", arc);
			editor.commit();
		}
	}