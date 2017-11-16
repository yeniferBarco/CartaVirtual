package com.example.asus.cartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng SEDE1 = new LatLng(6.24253699999999,-75.58923900000002);
        mMap.addMarker(new MarkerOptions().position(SEDE1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title("Sucursal A - UPB, Laureles, Medellin, Antioquia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(6.24253699999999,-75.58923900000002)));

        LatLng SEDE2 = new LatLng(6.22382982295081,-75.57299852371216);
        mMap.addMarker(new MarkerOptions().position(SEDE2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title("Sucursal B - Cl. 20 #43g-69 a 43g-185, Medellín, Antioquia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(6.22382982295081,-75.57299852371216)));

        LatLng SEDE3 = new LatLng(6.267667871611764,-75.5725371837616);
        mMap.addMarker(new MarkerOptions().position(SEDE3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title("Sucursal C - Cra. 64 #67B-39, Medellín, Antioquia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(6.267667871611764,-75.5725371837616)));

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
}
