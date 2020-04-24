# ViewPager2Demo
ViewPager 2 in action

This repo tries to reproduce an issue in Viewpager2 where adding removing fragment at index makes everything go haywire.


Run this app and use toogle button to add Green fragment then remove it and again add then scroll to green fragment.
YOu will see that in place of green fragment there is blue fragment. Blue fragment is duplicated.
![Screenshot](Screenshot.png)