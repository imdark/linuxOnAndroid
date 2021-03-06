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

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockFragment;

public class Install_Debian_Testing_2 extends SherlockFragment {
	public static Fragment newInstance() {
		Fragment f = new Fragment();
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.install_debian_testing_2, container,
				false);

		Button btn_DownloadImage = (Button) v
				.findViewById(R.id.btn_DownloadImage);
		btn_DownloadImage.setOnClickListener(btn_DownloadImage_onClick);

		Button btn_DownloadVNC = (Button) v.findViewById(R.id.btn_DownloadVNC);
		btn_DownloadVNC.setOnClickListener(btn_DownloadVNC_onClick);

		Button btn_DownloadTerminal = (Button) v
				.findViewById(R.id.btn_DownloadTerminal);
		btn_DownloadTerminal.setOnClickListener(btn_DownloadTerminal_onClick);

		
		return v;
	}

	private void gotoLink(String linkAdr) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setData(Uri.parse(linkAdr));
		startActivity(intent);
	}

	private OnClickListener btn_DownloadImage_onClick = new OnClickListener() {
		public void onClick(View v) {
			downloads(v.getContext());
		}

	};

	private OnClickListener btn_DownloadVNC_onClick = new OnClickListener() {
		public void onClick(View v) {
			gotoLink(CFG.playStoreURL_vnc);
		}
	};

	private OnClickListener btn_DownloadTerminal_onClick = new OnClickListener() {
		public void onClick(View v) {
			gotoLink(CFG.playStoreURL_term);
		}
	};

	private void downloads(Context context) {
		final Dialog dialog = new Dialog(context);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.download_debian_menu);
		dialog.setCancelable(true);

		Button btn_DownloadLarge = (Button) dialog
				.findViewById(R.id.btn_DownloadLarge);
		btn_DownloadLarge.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (AppPreferences.getPrefs().getString("ANDROID", "1")
						.equals("4.3")) {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Large_ext4,
							CFG.imageURL_Debian_Testing_Large_ext4);
				} else {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Large_ext2,
							CFG.imageURL_Debian_Testing_Large_ext2);
				}
				dialog.dismiss();
			}
		});

		Button btn_DownloadSmall = (Button) dialog
				.findViewById(R.id.btn_DownloadSmall);
		btn_DownloadSmall.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (AppPreferences.getPrefs().getString("ANDROID", "1")
						.equals("4.3")) {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Small_ext4,
							CFG.imageURL_Debian_Testing_Small_ext4);
				} else {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Small_ext2,
							CFG.imageURL_Debian_Testing_Small_ext2);
				}
				dialog.dismiss();
			}
		});

		Button btn_DownloadCore = (Button) dialog
				.findViewById(R.id.btn_DownloadCore);
		btn_DownloadCore.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (AppPreferences.getPrefs().getString("ANDROID", "1")
						.equals("4.3")) {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Core_ext4,
							CFG.imageURL_Debian_Testing_Core_ext4);
				} else {
					downloadImage(v.getContext(),
							CFG.torrentURL_Debian_Testing_Core_ext2,
							CFG.imageURL_Debian_Testing_Core_ext2);
				}
				dialog.dismiss();
			}
		});
		dialog.show();
	}

	private void downloadImage(Context context, final String torrentName,
			final String sourceforgeName) {
		if (torrentName.equals("")) {
			Intent localIntent = new Intent("android.intent.action.VIEW");
			localIntent.setData(Uri.parse(sourceforgeName));
			startActivity(localIntent);
			return;
		}

		final Dialog dialog = new Dialog(context);
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.dialog_download_type_selector);
		dialog.setCancelable(true);

		Button btn_Torrent = (Button) dialog.findViewById(R.id.btn_Torrent);
		btn_Torrent.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent localIntent = new Intent("android.intent.action.VIEW");
				localIntent.setData(Uri.parse(torrentName));
				startActivity(localIntent);
				dialog.dismiss();
			}
		});

		Button btn_Sourceforge = (Button) dialog
				.findViewById(R.id.btn_Sourceforge);
		btn_Sourceforge.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent localIntent = new Intent("android.intent.action.VIEW");
				localIntent.setData(Uri.parse(sourceforgeName));
				startActivity(localIntent);
				dialog.dismiss();
			}
		});

		Button btn_Cancel = (Button) dialog.findViewById(R.id.btn_Cancel);
		btn_Cancel.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		dialog.show();
	}
}
