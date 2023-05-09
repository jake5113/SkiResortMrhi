package com.jake.android.skiresort

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.core.motion.utils.TypedValues
import com.google.android.gms.common.internal.ImagesContract
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.jake.android.skiresort.databinding.ActivityDetailBinding
import kotlin.jvm.internal.Intrinsics

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    val callback: OnMapReadyCallback = `DetailActivity$$ExternalSyntheticLambda1`(this)
    private var mapView: MapView? = null

    /* access modifiers changed from: protected */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var inflate: ActivityDetailBinding? = ActivityDetailBinding.inflate(layoutInflater)
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)")
        binding = inflate
        var activityDetailBinding: ActivityDetailBinding? = null
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding")
            inflate = null
        }
        setContentView(inflate!!.root as View)
        val findViewById = findViewById<View>(C0291R.C0294id.mapView)
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.mapView)")
        var mapView2: MapView? = findViewById as MapView
        mapView = mapView2
        if (mapView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView")
            mapView2 = null
        }
        mapView2!!.getMapAsync(callback)
        var mapView3 = mapView
        if (mapView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapView")
            mapView3 = null
        }
        mapView3!!.onCreate(savedInstanceState)
        val newImg = intent.getIntExtra("img", 0)
        var activityDetailBinding2 = binding
        if (activityDetailBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding")
            activityDetailBinding2 = null
        }
        activityDetailBinding2.skiImg.setImageResource(newImg)
        val activityDetailBinding3 = binding
        if (activityDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding")
        } else {
            activityDetailBinding = activityDetailBinding3
        }
        activityDetailBinding.btnToHomePage.setOnClickListener(
            `DetailActivity$$ExternalSyntheticLambda0`(this)
        )
    }

    companion object {
        /* access modifiers changed from: private */ /* renamed from: onCreate$lambda-0  reason: not valid java name */
        fun `m93onCreate$lambda0`(`this$0`: DetailActivity, it: View?) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            `this$0`.startActivity(
                Intent(
                    "android.intent.action.VIEW",
                    Uri.parse(`this$0`.intent.getStringExtra(ImagesContract.URL))
                )
            )
        }

        /* access modifiers changed from: private */ /* renamed from: callback$lambda-1  reason: not valid java name */
        fun `m92callback$lambda1`(`this$0`: DetailActivity, googleMap: GoogleMap) {
            Intrinsics.checkNotNullParameter(`this$0`, "this$0")
            Intrinsics.checkNotNullParameter(googleMap, "googleMap")
            val parcelableExtra = `this$0`.intent.getParcelableExtra<Parcelable>("LatLng")
            Intrinsics.checkNotNull(parcelableExtra)
            val newLatLng = parcelableExtra as LatLng?
            val newName = `this$0`.intent.getStringExtra("name")
            val newColor = `this$0`.intent.getFloatExtra(TypedValues.Custom.S_COLOR, 0.0f)
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(newLatLng!!, 7.3f))
            val addMarker = googleMap.addMarker(
                MarkerOptions().position(newLatLng).title(newName)
                    .icon(BitmapDescriptorFactory.defaultMarker(newColor))
            )
            addMarker?.showInfoWindow()
            googleMap.uiSettings.isMapToolbarEnabled = false
        }
    }
}


/*
package com.jake.android.skiresort

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jake.android.skiresort.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.HPbtn.setOnClickListener {
            intent.getStringExtra("url")

        }
    }
}*/
