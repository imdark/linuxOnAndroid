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

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

import com.actionbarsherlock.app.SherlockFragment;

public class Install_Debian_3 extends SherlockFragment {

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
		View v = inflater.inflate(R.layout.install_debian_3, container, false);
		
		return v;
	}

	private OnClickListener btn_donationad_onClick = new OnClickListener() {
		public void onClick(View v) {
			gotoLink(CFG.playStoreURL_donation);
		}
	};

	private void gotoLink(String linkAdr) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setData(Uri.parse(linkAdr));
		startActivity(intent);
	}
}
