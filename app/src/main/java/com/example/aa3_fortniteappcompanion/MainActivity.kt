package com.example.aa3_fortniteappcompanion

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.analytics.FirebaseAnalytics

private lateinit var analytics : FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analytics = FirebaseAnalytics.getInstance(this)

        analytics.logEvent("MyFirstEvent",null)

        val bundle = Bundle().apply {
            putString("portrait_orientation", (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT).toString())
        }

        analytics.logEvent("OpenAppSettings", bundle)
        
    }
}