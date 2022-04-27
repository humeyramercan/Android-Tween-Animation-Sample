package com.humeyramercan.project02_tweenanimationexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.humeyramercan.project02_tweenanimationexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.startButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.startButton.id->{
                val mixed_anim : Animation= AnimationUtils.loadAnimation(this,R.anim.mixed_anim)
                binding.imageView.startAnimation(mixed_anim)
            }
        }
    }
}