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

public class CFG {

	public static final String scriptPath = "/data/data/com.zpwebsites.linuxonandroid/files/bootscript.sh";
	public static final String scriptPath_AutoBoot = "/data/data/com.zpwebsites.linuxonandroid/files/autobootscript.sh";
	public static final String busyBoxPath = "/data/data/com.zpwebsites.linuxonandroid/files/busybox";

	public static final String MNT = "/data/local/mnt"; // This HAS to be the
														// same as $mnt in the
														// boot scripts!

	// Script updater
	public static final String updater_VersionsFile = "http://sourceforge.net/projects/linuxonandroid/files/latest-scripts.txt"; // Latest
																																	// versions,
																																	// is
																																	// in
																																	// script
																																	// svn
	public static final String updater_LatestBoot = "http://sourceforge.net/projects/linuxonandroid/files/bootscript.sh"; // url
																															// to
																															// the
																															// boot
																															// script
	public static final String updater_LatestBoot43 = "http://sourceforge.net/projects/linuxonandroid/files/bootscript4-3.sh"; // url
																																// to
																																// the
																																// boot
																																// script
	public static final String updater_LatestAutoboot = "http://sourceforge.net/projects/linuxonandroid/files/autobootscript.sh"; // url
																																	// to
																																	// the
																																	// auto
																																	// boot
																																	// script

	// Ubuntu 13.04 sourceforge & script links
	public static final String imageURL_Ubuntu13_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Core/ubuntu-13.04.CORE.ext2.v2.zip/download";
	public static final String imageURL_Ubuntu13_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Small/ubuntu-13.04.SMALL.ext2.v2.zip/download";
	public static final String imageURL_Ubuntu13_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Large/ubuntu-13.04.LARGE.ext2.v2.zip/download";
	public static final String imageURL_Ubuntu13_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Core/ubuntu-13.04.CORE.ext4.v2.zip/download";
	public static final String imageURL_Ubuntu13_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Small/ubuntu-13.04.SMALL.ext4.v2.zip/download";
	public static final String imageURL_Ubuntu13_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Large/ubuntu-13.04.LARGE.ext4.v2.zip/download";

	// Ubuntu 13.04 torrent links (If torrents don't exist just put "" and the
	// popup won't show!)
	public static final String torrentURL_Ubuntu13_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Core/ubuntu-13.04.CORE.ext2.v2.zip.torrent/download";
	public static final String torrentURL_Ubuntu13_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Small/ubuntu-13.04.SMALL.ext2.v2.zip.torrent/download";
	public static final String torrentURL_Ubuntu13_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Large/ubuntu-13.04.LARGE.ext2.v2.zip.torrent/download";
	public static final String torrentURL_Ubuntu13_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Core/ubuntu-13.04.CORE.ext4.v2.zip.torrent/download";
	public static final String torrentURL_Ubuntu13_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Small/ubuntu-13.04.SMALL.ext4.v2.zip.torrent/download";
	public static final String torrentURL_Ubuntu13_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.04/Large/ubuntu-13.04.LARGE.ext4.v2.zip.torrent/download";

	// Ubuntu 13.10 sourceforge & script links
	public static final String imageURL_Ubuntu1310_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Core/ubuntu-13.10.CORE.ext2.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Small/ubuntu-13.10.SMALL.ext2.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Large/ubuntu-13.10.LARGE.ext2.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Core/ubuntu-13.10.CORE.ext4.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Small/ubuntu-13.10.SMALL.ext4.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Large/ubuntu-13.10.LARGE.ext4.v2.zip/download";

	public static final String imageURL_Ubuntu1310_Large_ext2_x86 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/x86/ubuntu-13.10.SMALL.x86.ext2.v1.zip/download";
	public static final String imageURL_Ubuntu1310_Small_ext2_x86 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/x86/ubuntu-13.10.LARGE.x86.ext2.v1.zip/download";

	// Ubuntu 13.10 torrent links (If torrents don't exist just put "" and the
	// popup won't show!)
	public static final String torrentURL_Ubuntu1310_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Core/ubuntu-13.10.CORE.ext2.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Small/ubuntu-13.10.SMALL.ext2.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Large/ubuntu-13.10.LARGE.ext2.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Core/ubuntu-13.10.CORE.ext4.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Small/ubuntu-13.10.SMALL.ext4.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/Large/ubuntu-13.10.LARGE.ext4.v2.zip.torrent/download";

	public static final String torrentURL_Ubuntu1310_Small_ext2_x86 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/x86/ubuntu-13.10.SMALL.x86.ext2.v1.zip.torrent/download";
	public static final String torrentURL_Ubuntu1310_Large_ext2_x86 = "http://sourceforge.net/projects/linuxonandroid/files/Ubuntu/13.10/x86/ubuntu-13.10.LARGE.x86.ext2.v1.zip.torrent/download";

	// Debian sourceforge & script links
	public static final String imageURL_Debian_Core = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Image/Core/debian-v4-core.zip/download";
	public static final String imageURL_Debian_Small = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Image/Small/debian-v4-small.zip/download";
	public static final String imageURL_Debian_Large = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Image/Large/debian-v4-large.zip/download";

	// Debian torrent links (If torrents don't exist just put "" and the popup
	// won't show!)
	public static final String torrentURL_Debian_Core = "http://zpwebsitefiles.com/torrents/app/debian-v4-core.torrent";
	public static final String torrentURL_Debian_Small = "http://zpwebsitefiles.com/torrents/app/debian-v4-small.torrent";
	public static final String torrentURL_Debian_Large = "http://zpwebsitefiles.com/torrents/app/debian-v4-large.torrent";

	// Debian Testing sourceforge & script links
	public static final String imageURL_Debian_Testing_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Core/debian-8.CORE.ext2.20131012.zip/download";
	public static final String imageURL_Debian_Testing_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Small/debian-8.SMALL.ext2.20131013.zip/download";
	public static final String imageURL_Debian_Testing_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Large/debian-8.LARGE.ext2.20131017.zip/download";
	public static final String imageURL_Debian_Testing_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Core/debian-8.CORE.ext4.20131012.zip/download";
	public static final String imageURL_Debian_Testing_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Small/debian-8.SMALL.ext4.20131013.zip/download";
	public static final String imageURL_Debian_Testing_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Large/debian-testing.LARGE.ext4.20131031.zip/download";

	// Debian testing torrent links (If torrents don't exist just put "" and the
	// popup
	// won't show!)
	public static final String torrentURL_Debian_Testing_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Core/debian-8.CORE.ext2.20131012.zip.torrent/download";
	public static final String torrentURL_Debian_Testing_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Small/debian-8.SMALL.ext2.20131013.zip.torrent/download";
	public static final String torrentURL_Debian_Testing_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Large/debian-8.LARGE.ext2.20131017.zip.torrent/download";
	public static final String torrentURL_Debian_Testing_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Core/debian-8.CORE.ext4.20131012.zip.torrent/download";
	public static final String torrentURL_Debian_Testing_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Small/debian-8.SMALL.ext4.20131013.zip.torrent/download	";
	public static final String torrentURL_Debian_Testing_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Debian/Testing/Large/debian-testing.LARGE.ext4.20131031.torrent/download";

	// Archlinux sourceforge links
	public static final String imageURL_Arch_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Core/archlinux-CORE.ext2.20131010.zip/download";
	public static final String imageURL_Arch_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Small/archlinux-SMALL.ext2.20131011.zip/download";
	public static final String imageURL_Arch_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Large/archlinux-LARGE.ext2.20131010.zip/download";
	public static final String imageURL_Arch_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Core/archlinux-CORE.ext4.20131010.zip/download";
	public static final String imageURL_Arch_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Small/archlinux-SMALL.ext4.20131011.zip/download";
	public static final String imageURL_Arch_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Large/archlinux-LARGE.ext4.20131010.zip/download";
	// Archlinux torrent links (If torrents don't exist just put "" and the
	// popup won't show!)
	public static final String torrentURL_Arch_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Core/archlinux-CORE.ext2.20131010.zip.torrent/download";
	public static final String torrentURL_Arch_Small_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Small/archlinux-SMALL.ext2.20131011.zip.torrent/download";
	public static final String torrentURL_Arch_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Large/archlinux-LARGE.ext2.20131010.zip.torrent/download";
	public static final String torrentURL_Arch_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Core/archlinux-CORE.ext4.20131010.zip.torrent/download";
	public static final String torrentURL_Arch_Small_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Small/archlinux-SMALL.ext4.20131011.zip.torrent/download";
	public static final String torrentURL_Arch_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/ArchLinux/Large/archlinux-LARGE.ext4.20131010.zip.torrent/download";

	// Fedora sourceforge links
	public static final String imageURL_Fedora_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Fedora/19/fedora-19.LARGE.ext2.v3.zip/download";
	public static final String imageURL_Fedora_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Fedora/19/fedora-19.LARGE.ext4.v3.zip/download";

	// Fedora torrent links (If torrents don't exist just put "" and the popup
	// won't show!)
	public static final String torrentURL_Fedora_Large_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Fedora/19/fedora-19.LARGE.ext2.v3.zip.torrent/download";
	public static final String torrentURL_Fedora_Large_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Fedora/19/fedora-19.LARGE.ext4.v3.zip.torrent/download";

	// Kali sourceforge & script links
	public static final String imageURL_Kali_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.BASIC.ext2.20131012.zip/download";
	public static final String imageURL_Kali_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.BASIC.ext4.20131012.zip/download";
	public static final String imageURL_Kali_Full_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.FULL.ext2.20131031.zip/download";
	public static final String imageURL_Kali_Full_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.FULL.ext4.20131031.zip/download";

	// Kali torrent links (If torrents don't exist just put "" and the
	// popup won't show!)
	public static final String torrentURL_Kali_Core_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.BASIC.ext2.20131012.zip.torrent/download";
	public static final String torrentURL_Kali_Core_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.BASIC.ext4.20131012.zip.torrent/download";
	public static final String torrentURL_Kali_Full_ext2 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.FULL.ext2.20131031.zip.torrent/download";
	public static final String torrentURL_Kali_Full_ext4 = "http://sourceforge.net/projects/linuxonandroid/files/Kali%20Linux/kalilinux.FULL.ext4.20131031.torrent/download";

	// Play Store links to the needed apps
	public static final String playStoreURL_term = "market://details?id=jackpal.androidterm";
	public static final String playStoreURL_vnc = "market://details?id=android.androidVNC";
	public static final String playStoreURL_donation = "https://play.google.com/store/apps/details?id=com.zpwebsites.backtrackinstallguide";
}
