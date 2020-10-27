package com.example.wunderkind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager2 = findViewById(R.id.viewPagerImageSlider)

        var sliderItems:List<SliderItem> = listOf(SliderItem(R.drawable.sobak1))


        viewPager2.adapter = SliderAdapter(sliderItems,viewPager2)
    }
}