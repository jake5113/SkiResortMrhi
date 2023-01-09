package com.jake.android.skiresort

import com.google.android.gms.maps.model.LatLng

class User(
    val profile: Int,
    val name: String,
    val region: String,
    val LatLng: LatLng,
    val color: Float,
    val url: String,
){
}