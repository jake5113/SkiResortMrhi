package com.jake.android.skiresort

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.jake.android.skiresort.databinding.ActivityDetailBinding
import com.jake.android.skiresort.databinding.ActivityMainBinding
import com.jake.android.skiresort.databinding.FragmentListBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SkiResort)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        // 1. 페이지 데이터를 로드
        val list = listOf(FragmentList(), FragmentMap(), FragmentShop())
        //2. 아답터를 생성
        val pagerAdapter = FragmentPagerAdapter(list, this)
        //3. 아답터와 뷰페이저 연결
        with(binding) {
            viewPager.adapter = pagerAdapter

            //4. 탭 메뉴의 개수만큼 제목을 목록으로 생성
            val titles = listOf("List", "Map", "Tracker")

            //5. 탭레이아웃과 뷰페이저 연결
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = titles.get(position)
            }.attach()
        }
    }

    class FragmentPagerAdapter(
        val fragmentList: List<Fragment>,
        fragmentActivity: FragmentActivity
    ) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount() = fragmentList.size

        override fun createFragment(position: Int) = fragmentList.get(position)

    }
}