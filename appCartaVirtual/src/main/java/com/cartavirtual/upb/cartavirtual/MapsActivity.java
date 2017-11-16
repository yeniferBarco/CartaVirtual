package com.cartavirtual.upb.cartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.app.Activity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

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
        LatLng suc1 = new LatLng(6.242536899999999,-75.58923900000002);
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)).position(suc1).title("Sucursal A - UPB, Laureles, Medellín, Antioquia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng(6.242536899999999,-75.58923900000002),2));

        LatLng suc2 = new LatLng(6.22382982295081,-75.57999852371216);
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).position(suc2).title(" Sucursal B - Cl.20 #43g-185, Medellín, Antioqia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng(6.22382982295081,-75.57999852371216),2));

        LatLng suc3 = new LatLng(6.267667871611764,-75.5725371837616);
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).position(suc3).title("Sucursal C - Cra. 64 # 67B-39, Medellin, Antioquia, Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng(6.267667871611764,-75.5725371837616),2));

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        //aqui agregar las lineas de comandos para personalizar el mapa
        //3 marcadores en medellin
        //cada marcador desplegar informacion
        //personalizar marcadores
    }
}
