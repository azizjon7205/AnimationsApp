package com.example.animationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.airbnb.lottie.LottieAnimationView
import com.example.animationsapp.adapter.ViewPagerAdapter
import com.example.animationsapp.fragment.SliderFragment
import com.matthewtamlin.sliding_intro_screen_library.indicators.DotIndicator
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class IntroSliderActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var dotsIndicator: DotsIndicator
    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_slider)

        initViews()
    }

    private fun initViews(){
        lottieAnimationView = findViewById(R.id.lottie_anim_intro)
        viewPager = findViewById(R.id.view_pager_intro)

        refreshAdapter()

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {

            }

            override fun onPageSelected(position: Int) {
                when(position){
                    0 -> {
                        lottieAnimationView.setAnimation("telegram.json")
                        lottieAnimationView.playAnimation()
                    }
                    1 -> {
                        lottieAnimationView.setAnimation("speed.json")
                        lottieAnimationView.playAnimation()
                    }
                    2 -> {
                        lottieAnimationView.setAnimation("infinity.json")
                        lottieAnimationView.playAnimation()
                    }
                    3 -> {
                        lottieAnimationView.setAnimation("secure.json")
                        lottieAnimationView.playAnimation()
                    }
                    else -> {
                        lottieAnimationView.setAnimation("secure.json")
                        lottieAnimationView.playAnimation()
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })

        dotsIndicator = findViewById(R.id.dot_indicators)
        dotsIndicator.setViewPager(viewPager)
    }

    private fun refreshAdapter(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.add(SliderFragment("Telegram X","The world`s fastest messaging app.\nIt`s free and secure." ))
        adapter.add(SliderFragment("Fast","Telegram delivers messages\nfaster than other applications."))
        adapter.add(SliderFragment("Powerful","Telegram has no limits on\nthe size of your media and chats."))
        adapter.add(SliderFragment("Secure","Telegram keeps your messages\nsafe from hacker attacks."))


        viewPager.adapter = adapter
    }
}