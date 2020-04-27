package com.abhishek.viewpager2demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    val fragmentList: MutableList<FragmentName> = mutableListOf()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (fragmentList[position]) {
            FragmentName.WHITE -> WhiteFragment()
            FragmentName.RED -> RedFragment()
            FragmentName.GREEN -> GreenFragment()
            FragmentName.BLUE -> BlueFragment()
        }
    }

    override fun getItemId(position: Int): Long {
        return fragmentList[position].ordinal.toLong()
    }

    override fun containsItem(itemId: Long): Boolean {
        val fragment = FragmentName.values()[itemId.toInt()]
        return fragmentList.contains(fragment)
    }

    fun add(fragment: FragmentName) {
        fragmentList.add(fragment)
        notifyDataSetChanged()
    }

    fun add(index: Int, fragment: FragmentName) {
        fragmentList.add(index, fragment)
        notifyDataSetChanged()
    }

    fun remove(index: Int) {
        fragmentList.removeAt(index)
        notifyDataSetChanged()
    }

    fun remove(name: FragmentName) {
        fragmentList.remove(name)
        notifyDataSetChanged()
    }

    enum class FragmentName {
        WHITE,
        RED,
        GREEN,
        BLUE
    }
}