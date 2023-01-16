package com.jake.android.skiresort

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jake.android.skiresort.databinding.FragmentListBinding


class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentListBinding.inflate(inflater, container, false)

        val adapter = UserAdapter(this, list)
        binding.skiList.adapter = adapter
        binding.skiList.setOnItemClickListener { parent, view, position, id ->

            //DetailActivity로 화면전환
            val intent = Intent(activity, DetailActivity::class.java)
            //스키장 위치 및 이름 데이터 전송
            intent.putExtra("name", list[position].name)
            intent.putExtra("LatLng", list[position].LatLng)
            intent.putExtra("color", list[position].color)
            intent.putExtra("url", list[position].url)
            intent.putExtra("img", list[position].profile)

            startActivity(intent)
        }
        return binding.root
    }

    val konjiamUrl = "https://m.konjiamresort.co.kr/ski/skiList.dev"
    val bearsUrl = "https://bearstown.com/SkiBoard_01"
    val yangjiUrl = "https://www.pineresort.com/Ski/Information.aspx"
    val jisanUrl = "https://www.jisanresort.co.kr/w/ski/"
    val elysianUrl = "https://www.elysian.co.kr/gangchon/ski/ski_cost.asp"
    val vivaldiUrl = "https://www.sonohotelsresorts.com/daemyung.vp.skiworld.index.ds/dmparse.dm"
    val alpensiaUrl = "https://www.alpensia.com/ski/main.do"
    val oakvallyUrl = "http://www.oakvalley.co.kr/oak_new/new_skimain.asp"
    val o2Url = "https://www.o2resort.com/SKI/basicInfo.jsp"
    val yongpyongUrl = "https://www.yongpyong.co.kr/kor/skiNboard/introduce.do"
    val wellyhillyUrl = "https://www.wellihillipark.com/snowpark"
    val high1Url = "https://www.high1.com/ski/index.do"
    val phoenixUrl = "https://phoenixhnr.co.kr/static/pyeongchang/snowpark/slope-lift"
    val mujuUrl = "https://www.mdysresort.com/ski/slope.asp"
    val edenUrl = "http://www.edenvalley.co.kr/ski/View.asp?location=01"

    val list = arrayListOf<User>(
        User(
            R.drawable.ski_kon,
            "곤지암리조트",
            "경기",
            FragmentMap().konjiamLocation,
            0f,
            konjiamUrl
        ),
        User(
            R.drawable.ski_bears,
            "베어스타운 리조트",
            "경기",
            FragmentMap().bearsLocation,
            30f,
            bearsUrl
        ),
        User(
            R.drawable.ski_yangji,
            "양지 파인 스키밸리",
            "경기",
            FragmentMap().yangjiLocation,
            60f,
            yangjiUrl
        ),
        User(
            R.drawable.ski_jisan,
            "지산 포레스트 리조트",
            "경기",
            FragmentMap().jisanLocation,
            90f,
            jisanUrl
        ),
        User(
            R.drawable.ski_elysian,
            "엘리시안 강촌",
            "강원",
            FragmentMap().elysianLocation,
            120f,
            elysianUrl
        ),
        User(
            R.drawable.ski_vivaldi,
            "비발디파크",
            "강원",
            FragmentMap().vivaldiLocation,
            150f,
            vivaldiUrl
        ),
        User(
            R.drawable.ski_alpensia,
            "알펜시아 리조트",
            "강원",
            FragmentMap().alpensiaLocation,
            180f,
            alpensiaUrl
        ),
        User(
            R.drawable.ski_oak,
            "오크밸리 리조트",
            "강원",
            FragmentMap().oakvallyLocation,
            210f,
            oakvallyUrl
        ),
        User(
            R.drawable.ski_o2,
            "오투 리조트",
            "강원",
            FragmentMap().o2Location,
            240f,
            o2Url
        ),
        User(
            R.drawable.ski_yongpyong,
            "용평 리조트",
            "강원",
            FragmentMap().yongpyongLocation,
            270f,
            yongpyongUrl
        ),
        User(
            R.drawable.ski_welly,
            "웰리힐리 파크",
            "강원",
            FragmentMap().wellyhillyLocation,
            300f,
            wellyhillyUrl
        ),
        User(
            R.drawable.ski_high1,
            "하이원 리조트",
            "강원",
            FragmentMap().high1Location,
            330f,
            high1Url
        ),
        User(
            R.drawable.ski_phoenix,
            "휘닉스 평창",
            "강원",
            FragmentMap().phoenixLocation,
            285f,
            phoenixUrl
        ),
        User(
            R.drawable.ski_muju,
            "무주 덕유산 리조트",
            "충청/전라",
            FragmentMap().mujuLocation,
            180f,
            mujuUrl
        ),
        User(
            R.drawable.ski_eden,
            "에덴밸리 리조트",
            "경상",
            FragmentMap().edenLocation,
            15f,
            edenUrl
        )
    )
}


