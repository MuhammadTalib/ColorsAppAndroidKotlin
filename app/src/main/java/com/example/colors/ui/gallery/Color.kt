package com.example.colors.ui.gallery

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.colors.BuildConfig
import com.example.colors.R


class Color : AppCompatActivity() {
    private var position = 0
    val colors = getColors()
    override fun onCreate(savedInstanceState: Bundle?) {
        position = intent.getStringExtra("position")!!.toInt()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        if (BuildConfig.DEBUG && supportActionBar == null) {
            error("Assertion failed")
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val cardView: CardView = findViewById(R.id.colorMainCard)

        cardView.setCardBackgroundColor(Color.parseColor(colors[position].hex))
//        cardView.setOnTouchListener { v, event ->{
//
//        }  }
        cardView.setOnClickListener {
            if(position>=colors.size-1){
                position=0
            }else position++
            cardView.setCardBackgroundColor(Color.parseColor(colors[position].hex))
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}