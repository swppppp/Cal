package com.siwon.mycalender.ui.intro

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.siwon.mycalender.MainActivity
import com.siwon.mycalender.R
import com.siwon.mycalender.databinding.SplashBinding

class Splash : AppCompatActivity() {

    lateinit var bb: SplashBinding
    val DURATION:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bb = DataBindingUtil.setContentView(this, R.layout.splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, DURATION)
    }

    override fun onBackPressed() {
    }
}