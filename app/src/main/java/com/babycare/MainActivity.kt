package com.babycare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTrackDiaper = findViewById<Button>(R.id.btnTrackDiaper)
        val btnTrackFeeding = findViewById<Button>(R.id.btnTrackFeeding)
        val btnViewReports = findViewById<Button>(R.id.btnViewReports)

        btnTrackDiaper.setOnClickListener {
            startActivity(Intent(this, DiaperActivity::class.java))
        }

        btnTrackFeeding.setOnClickListener {
            startActivity(Intent(this, FeedingActivity::class.java))
        }

        btnViewReports.setOnClickListener {
            startActivity(Intent(this, ReportsActivity::class.java))
        }
    }
}
