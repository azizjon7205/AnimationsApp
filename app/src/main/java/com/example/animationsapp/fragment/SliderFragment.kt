package com.example.animationsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.animationsapp.R

class SliderFragment(val title: String,val text: String): Fragment() {
    private lateinit var tv_text: TextView
    private lateinit var tv_title: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_intro_slider, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        tv_text = view.findViewById(R.id.tv_intro_text)
        tv_title= view.findViewById(R.id.tv_intro_text_title)
        tv_text.text = text
        tv_title.text = title
    }
}