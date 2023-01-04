package com.jake.android.skiresort

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentMap : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

    val callback = OnMapReadyCallback { googleMap ->
        //지도 시작 위치를 한국으로 보여준다
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(middleLocation, 7.0F))
        //데이터를 받아와서 구글맵에 스키장 위치 마커 표시
        for (i in FragmentList().list.indices) {
            val newLatLng = FragmentList().list[i].LatLng
            val newName = FragmentList().list[i].name
            val newColor = FragmentList().list[i].color
            val newUrl = FragmentList().list[i].url
            val newImg = FragmentList().list[i].profile
            googleMap.addMarker(
                MarkerOptions().position(newLatLng).title(newName)
                    .icon(BitmapDescriptorFactory.defaultMarker(newColor))
            )
            //마커 클릭시 화면 이동
            googleMap.setOnInfoWindowClickListener { marker ->
                //DetailActivity로 화면전환
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra("name", marker.title)
                intent.putExtra("LatLng", marker.position)
                //Url color intent 추가!!!!!!!!!
                intent.putExtra("url", newUrl)
                intent.putExtra("img", newImg)
                startActivity(intent)
            }
        }
    }

    val middleLocation = LatLng(36.886480, 127.936701)
    val konjiamLocation = LatLng(37.336944, 127.293611)
    val bearsLocation = LatLng(37.798056, 127.247222)
    val yangjiLocation = LatLng(37.211944, 127.295)
    val jisanLocation = LatLng(37.216667, 127.345278)
    val elysianLocation = LatLng(37.8163989, 127.587019)
    val vivaldiLocation = LatLng(37.645, 127.681944)
    val alpensiaLocation = LatLng(37.661592, 128.679861)
    val oakvallyLocation = LatLng(37.407778, 127.808889)
    val o2Location = LatLng(37.1775, 128.947778)
    val yongpyongLocation = LatLng(37.647054, 128.683702)
    val wellyhillyLocation = LatLng(37.490556, 128.250556)
    val high1Location = LatLng(37.208056, 128.826111)
    val phoenixLocation = LatLng(37.579894, 128.320203)
    val mujuLocation = LatLng(35.890833, 127.736944)
    val edenLocation = LatLng(35.428889, 128.984444)
}