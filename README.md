# ViewPager2Demo
ViewPager 2 in action

## Update
Turns out that you need to override these two methods if you are working with `mutable` collections in `ViewPager2`

```kotlin
override fun getItemId(position: Int): Long {
        return fragmentList[position].ordinal.toLong()
    }

    override fun containsItem(itemId: Long): Boolean {
        val fragment = FragmentName.values()[itemId.toInt()]
        return fragmentList.contains(fragment)
    }
```
Adding these two in my current adapter fixes the problem

--------------------------------------------------------

This repo tries to reproduce an issue in Viewpager2 where adding removing fragment at index makes everything go haywire.
Run this app and use toogle button to add Green fragment then remove it and again add then scroll to green fragment.
YOu will see that in place of green fragment there is blue fragment. Blue fragment is duplicated.
![Screenshot](Screenshot.png)