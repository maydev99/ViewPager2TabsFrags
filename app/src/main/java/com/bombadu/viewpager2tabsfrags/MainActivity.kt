package com.bombadu.viewpager2tabsfrags

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2WithFragments()
    }

    private fun initViewPager2WithFragments() {
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager)
        val adapter = StateAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        // If you want to scroll the ViewPager Vertical uncomment the next line:
        //viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val names: Array<String> = arrayOf("Chat", "Support", "Call")
        TabLayoutMediator(tabLayout,viewPager2) {tab, position ->
            tab.text = names[position]
        }.attach()
    }
}