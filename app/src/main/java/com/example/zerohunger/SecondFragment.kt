package com.example.zerohunger

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

class SecondFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val Depo = LatLng(26.933865501528736, -105.67498466382821)
        googleMap.addMarker(MarkerOptions().position(Depo).title("Deportiva Vanessa Zamboti"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Depo))
        val Zara = LatLng(26.92852385189197, -105.66894003865228)
        googleMap.addMarker(MarkerOptions().position(Zara).title("Parque Zaragoza"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Zara))
        val Templo = LatLng(26.93774118835599, -105.70192969553516)
        googleMap.addMarker(MarkerOptions().position(Templo).title("Templo Sagrada Familia"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Templo))
        val OXXO = LatLng(26.921150908802254, -105.6775960855606)
        googleMap.addMarker(MarkerOptions().position(OXXO).title("OXXO colonia Juarez"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(OXXO))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}