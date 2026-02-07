package com.example.restaurants

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class MenuDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main
        )) { v, insets ->
            val systemBars =
                insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top,
                systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }


        val menuName = intent.getStringExtra("NAME")
        val menuAwaitingTime =
            intent.getStringExtra("AWAITING_TIME")
        val menuLocation = intent.getStringExtra("LOCATION")
        val menuPrice = intent.getStringExtra("PRICE")
        val menuImage = intent.getStringExtra("IMAGE")
    }
}