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

import android.os.Bundle;

public class Tips extends BaseActivity {

	public void onCreate(Bundle paramBundle) {
		mTitleRes = R.string.frontpage_btn_Tips;
		super.onCreate(paramBundle);
		setContentView(R.layout.tips);
		setSlidingActionBarEnabled(false);

	}


}
