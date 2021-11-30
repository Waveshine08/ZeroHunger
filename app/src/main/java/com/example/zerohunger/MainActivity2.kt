package com.example.zerohunger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val viewPager: ViewPager2 = findViewById(R.id.pager)
        val fragments: ArrayList<Fragment> = arrayListOf(
            FirstFragment(),
            aboutUs()
        )
        val tablayout: TabLayout = findViewById(R.id.tablayout)
        val adapter = ViewPagerAdapter(fragments,this)
        viewPager.adapter = adapter

        TabLayoutMediator(tablayout,viewPager){tab,position->
            when(position){
                0->{
                    tab.text = "Donaciones"
                }
                1->{
                    tab.text = "Acerca de Nosotros"
                }
            }
        }.attach()
        val butta: Button = findViewById(R.id.butthanks)
        val intel: Intent = Intent(this@MainActivity2,Thanks::class.java)
        butta.setOnClickListener {
            startActivity(intel)
        }
    }
}