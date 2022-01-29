package com.example.animationsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val fragments = ArrayList<Fragment>()
    private val fragmentTitles = ArrayList<String>()

    fun add(fragment: Fragment){
        fragments.add(fragment)
    }

    override fun getCount() = fragments.size

    override fun getItem(position: Int) = fragments[position]

}