package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.crashlytics.FirebaseCrashlytics



class MainActivity : AppCompatActivity() {

    lateinit var crashButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        crashButton = findViewById(R.id.crash_button)
        crashButton.setOnClickListener {
            FirebaseCrashlytics.getInstance().recordException(Exception("test crash app"))
            throw RuntimeException("Test Crash")
        }
    }


}