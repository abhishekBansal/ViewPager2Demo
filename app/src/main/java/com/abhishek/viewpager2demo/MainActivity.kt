package com.abhishek.viewpager2demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pagerAdapter: ViewPager2Adapter by lazy { ViewPager2Adapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager2.offscreenPageLimit = 4
        viewpager2.adapter = pagerAdapter
        TabLayoutMediator(tabLayout, viewpager2) { tab, position ->
            tab.text = when (pagerAdapter.fragmentList[position]) {
                ViewPager2Adapter.FragmentName.WHITE -> "White- 1"

                ViewPager2Adapter.FragmentName.RED -> "Red- 1"

                ViewPager2Adapter.FragmentName.GREEN -> "Green- 2"

                ViewPager2Adapter.FragmentName.BLUE -> "Blue- 3"
            }
        }.attach()

        pagerAdapter.add(ViewPager2Adapter.FragmentName.WHITE)
        pagerAdapter.add(ViewPager2Adapter.FragmentName.RED)
//        pagerAdapter.add(ViewPager2Adapter.FragmentName.GREEN)
        pagerAdapter.add(ViewPager2Adapter.FragmentName.BLUE)
    }
}