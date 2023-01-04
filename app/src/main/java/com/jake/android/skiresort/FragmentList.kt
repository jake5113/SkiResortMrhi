package com.jake.android.skiresort

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.FragmentTransaction
import com.jake.android.skiresort.databinding.FragmentListBinding
import android.content.Intent as Intent

class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding = FragmentListBinding.inflate(inflater, container, false)

        val list = arrayListOf<User>(
            User(R.drawable.ski10, "곤지암리조트", "경기", "2022-2023"),
            User(R.drawable.ski1, "베어스타운 리조트", "경기", "2022-2023"),
            User(R.drawable.ski4, "양지 파인 스키밸리", "경기", "2022-2023"),
            User(R.drawable.ski3, "지산 포레스트 리조트", "경기", "2022-2023"),
            User(R.drawable.ski2, "엘리시안 강촌", "강원", "2022-2023"),
            User(R.drawable.ski5, "비발디파크", "강원", "2022-2023"),
            User(R.drawable.ski6, "알펜시아 리조트", "강원", "2022-2023"),
            User(R.drawable.ski7, "오크밸리 리조트", "강원", "2022-2023"),
            User(R.drawable.ski8, "오투 리조트", "강원", "2022-2023"),
            User(R.drawable.ski14, "용평 리조트", "강원", "2022-2023"),
            User(R.drawable.ski10, "웰리힐리 파크", "강원", "2022-2023"),
            User(R.drawable.ski11, "하이원 리조트", "강원", "2022-2023"),
            User(R.drawable.ski12, "휘닉스 평창 스노우파크", "강원", "2022-2023"),
            User(R.drawable.ski13, "무주 덕유산 리조트", "충청/전라", "2022-2023"),
            User(R.drawable.ski1, "에덴밸리 리조트", "경상", "2022-2023")
        )

        val adapter = UserAdapter(this, list)
        binding.skiList.adapter = adapter

        binding.skiList.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(activity, DetailActivity::class.java)
            startActivity(intent)
        }


        return binding.root
    }
}



