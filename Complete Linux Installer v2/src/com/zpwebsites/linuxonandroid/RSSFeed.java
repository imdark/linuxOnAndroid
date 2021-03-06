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

import java.util.List;
import java.util.Vector;

public class RSSFeed {
	private String title = null;
	private String description = null;
	private String link = null;
	private String pubdate = null;
	private List<RSSItem> itemList;
	
	RSSFeed(){
		itemList = new Vector<RSSItem>(0);
	}
	
	void addItem(RSSItem item){
		itemList.add(item);
	}
	
	RSSItem getItem(int location){
		return itemList.get(location);
	}
	
	List<RSSItem> getList(){
		return itemList;
	}
	
	void setTitle(String value)
	{
		title = value;
	}
	void setDescription(String value)
	{
		description = value;
	}
	void setLink(String value)
	{
		link = value;
	}
	void setPubdate(String value)
	{
		pubdate = value;
	}
	
	String getTitle()
	{
		return title;
	}
	String getDescription()
	{
		return description;
	}
	String getLink()
	{
		return link;
	}
	String getPubdate()
	{
		return pubdate;
	}

}
