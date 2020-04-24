package com.abhishek.viewpager2demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_white.*

class WhiteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_white, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toggleGreenBtn?.setOnClickListener {
            val adapter = (activity as? MainActivity)?.pagerAdapter
            val fragment = adapter?.fragmentList!![2]
            if (fragment == ViewPager2Adapter.FragmentName.GREEN) {
                adapter.remove(ViewPager2Adapter.FragmentName.GREEN)
            } else {
                adapter.add(2, ViewPager2Adapter.FragmentName.GREEN)
            }
        }
    }
}
