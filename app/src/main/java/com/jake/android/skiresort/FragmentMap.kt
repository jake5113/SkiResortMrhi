package com.jake.android.skiresort

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentMap : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        val konjiam = LatLng(37.336944, 127.293611)
        googleMap.addMarker(MarkerOptions().position(konjiam).title("곤지암리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(konjiam))

        val bears = LatLng(37.798056, 127.247222)
        googleMap.addMarker(MarkerOptions().position(bears).title("베어스타운 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bears))

        val yangji = LatLng(37.211944, 127.295)
        googleMap.addMarker(MarkerOptions().position(yangji).title("양지 파인 스키밸리"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(yangji))

        val jisan = LatLng(37.216667, 127.345278)
        googleMap.addMarker(MarkerOptions().position(jisan).title("지산 포레스트 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(jisan))

        val elisian = LatLng(37.8163989, 127.587019)
        googleMap.addMarker(MarkerOptions().position(elisian).title("엘리시안 강촌"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(elisian))

        val vivaldi = LatLng(37.645, 127.681944)
        googleMap.addMarker(MarkerOptions().position(vivaldi).title("비발디파크"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(vivaldi))

        val alpensia = LatLng(37.661592, 128.679861)
        googleMap.addMarker(MarkerOptions().position(alpensia).title("알펜시아 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(alpensia))

        val oakvally = LatLng(37.407778, 127.808889)
        googleMap.addMarker(MarkerOptions().position(oakvally).title("오크밸리 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(oakvally))

        val o2 = LatLng(37.1775, 128.947778)
        googleMap.addMarker(MarkerOptions().position(o2).title("오투 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(o2))

        val yongpyeng = LatLng(37.647054, 128.683702)
        googleMap.addMarker(MarkerOptions().position(yongpyeng).title("용평 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(yongpyeng))

        val wellyhilly = LatLng(37.490556, 128.250556)
        googleMap.addMarker(MarkerOptions().position(wellyhilly).title("웰리힐리 파크"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(wellyhilly))

        val high1 = LatLng(37.208056, 128.826111)
        googleMap.addMarker(MarkerOptions().position(high1).title("하이원 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(high1))

        val hwnix = LatLng(37.579894, 128.320203)
        googleMap.addMarker(MarkerOptions().position(hwnix).title("휘닉스 평창 스노우파크"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hwnix))

        val muju = LatLng(35.890833, 127.736944)
        googleMap.addMarker(MarkerOptions().position(muju).title("무주 덕유산 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(muju))

        val eden = LatLng(35.428889, 128.984444)
        googleMap.addMarker(MarkerOptions().position(eden).title("에덴밸리 리조트"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(eden))
    }


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
}