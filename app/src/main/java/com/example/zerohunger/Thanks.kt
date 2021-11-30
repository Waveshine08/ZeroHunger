package com.example.zerohunger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class Thanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        val viewPagerTh: ViewPager2 = findViewById(R.id.pagerTh)
        val fragments: ArrayList<Fragment> = arrayListOf(
            ThankFragment(),
            SecondFragment()
        )
        val adapter = ViewPagerAdapter(fragments,this)
        viewPagerTh.adapter = adapter
    }
}