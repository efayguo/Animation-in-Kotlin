package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun bounceClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.bounce)
        textView.startAnimation(bounceAnimatino)
    }
    fun fadeInClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        textView.startAnimation(bounceAnimatino)
    }
    fun fadeOutClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.fade_out)
        textView.startAnimation(bounceAnimatino)
    }
    fun rotateClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.rotate)
        textView.startAnimation(bounceAnimatino)
    }
    fun slideDownClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.slide_down)
        textView.startAnimation(bounceAnimatino)
    }
    fun slideUpClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.slide_up)
        textView.startAnimation(bounceAnimatino)
    }
    fun zoomInClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
        textView.startAnimation(bounceAnimatino)
    }
    fun zoomOutClicked (view: View){
        val bounceAnimatino = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
        textView.startAnimation(bounceAnimatino)
    }

}