package com.jake.android.skiresort

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.*
import androidx.navigation.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.gms.maps.MapFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jake.android.skiresort.databinding.ActivityDetailBinding
import com.jake.android.skiresort.databinding.ActivityMainBinding
import com.jake.android.skiresort.databinding.FragmentListBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SkiResort)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
//
//        bottomNav.setOnNavigationItemSelectedListener(navListner)
//    }
//
//    val navListner = BottomNavigationView.OnNavigationItemSelectedListener {
//        when (it.itemId) {
//            R.id.tab_list -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainerView, FragmentList()).commit()
//            }
//            R.id.tab_map -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainerView, FragmentMap()).commit()
//            }
//        }
//        true
  }

    val transaction = supportFragmentManager.beginTransaction()

}