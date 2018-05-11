package com.nodomain.mappointer;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_maps );
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.map );
        mapFragment.getMapAsync( this );
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


        // Add a marker in Delhi and move the camera
        LatLng delhi = new LatLng( 28, 77 );
        mMap.addMarker( new MarkerOptions().position( delhi ).title( "Delhi" ).snippet("Connaught Place - 110001")).showInfoWindow();
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom( delhi,4 ) );

        // Add a marker in Kerla and move the camera
        LatLng kerla = new LatLng( 10, 76 );
        mMap.addMarker( new MarkerOptions().position( kerla ).title( "Kerla" ).snippet("Update this value!")).showInfoWindow();
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom( kerla,4 ) );

        // Add a marker in Chennai and move the camera
        LatLng mumbai = new LatLng( 19, 73 );
        mMap.addMarker( new MarkerOptions().position( mumbai ).title( "Chennai" ).snippet("Update this value!")).showInfoWindow();
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom( mumbai,4 ) );
    }
}
