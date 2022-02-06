package com.example.animationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class LottiesActivity : AppCompatActivity() {
    private lateinit var lotties: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotties)

        initViews()
    }

    private fun initViews(){
        val btn_twitter = findViewById<Button>(R.id.btn_twitter)
        val btn_facebook = findViewById<Button>(R.id.btn_facebook)
        val btn_youtube = findViewById<Button>(R.id.btn_youtube)

        lotties = findViewById(R.id.lottie_task)

        btn_twitter.setOnClickListener {
            lotties.setAnimation("twitter.json")
            lotties.playAnimation()
        }
        btn_facebook.setOnClickListener {
            lotties.setAnimation("facebook.json")
            lotties.playAnimation()
        }
        btn_youtube.setOnClickListener {
            lotties.setAnimation("youtube.json")
            lotties.playAnimation()
        }

    }
}