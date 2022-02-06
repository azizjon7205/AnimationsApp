package com.example.animationsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var iv_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews(){
        iv_image = findViewById(R.id.iv_image)
        val btn_zoom: Button = findViewById(R.id.btn_zoom)
        val btn_rotate: Button = findViewById(R.id.btn_rotate)
        val btn_fade: Button = findViewById(R.id.btn_fade)
        val btn_blink: Button = findViewById(R.id.btn_blink)
        val btn_move: Button = findViewById(R.id.btn_move)
        val btn_slide: Button = findViewById(R.id.btn_slide)

        val btn_bounce: Button = findViewById(R.id.btn_bounce)
        val btn_sequential: Button = findViewById(R.id.btn_sequential)
        val btn_together: Button = findViewById(R.id.btn_together)

        val btn_lotties: Button = findViewById(R.id.btn_lotties)

        btn_zoom.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            iv_image.startAnimation(animation)
        }
        btn_rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            iv_image.startAnimation(animation)
        }
        btn_fade.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
            iv_image.startAnimation(animation)
        }
        btn_blink.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            iv_image.startAnimation(animation)
        }
        btn_move.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
            iv_image.startAnimation(animation)
        }
        btn_slide.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
            iv_image.startAnimation(animation)
        }
        btn_bounce.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
            iv_image.startAnimation(animation)
        }
        btn_sequential.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)
            iv_image.startAnimation(animation)
        }
        btn_together.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.together)
            iv_image.startAnimation(animation)
        }

        btn_lotties.setOnClickListener {
            val intent = Intent(this, LottiesActivity::class.java)
            startActivity(intent)
        }
    }
}