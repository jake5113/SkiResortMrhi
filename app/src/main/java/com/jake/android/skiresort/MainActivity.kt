package com.jake.android.skiresort


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.*
import com.google.android.material.bottomnavigation.BottomNavigationView


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SkiResort)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNav.setOnNavigationItemSelectedListener(navListner)
    }

    val navListner = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.tab_list -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, FragmentList()).commit()
            }
            R.id.tab_map -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, FragmentMap()).commit()
            }
        }
        true
    }

    val transaction = supportFragmentManager.beginTransaction()

}