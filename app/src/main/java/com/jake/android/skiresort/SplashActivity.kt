@file:Suppress("DEPRECATION")

package com.jake.android.skiresort

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        imageView = findViewById(R.id.imageView)

        Glide.with(this)
            .load(R.raw.bear)
            .into(imageView)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}