package com.example.weatherappwithoutcomposeonkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity(){

    private lateinit var swipeView : SwipeRefreshLayout
    private lateinit var handler : Handler
    private lateinit var runnable: Runnable
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler = Handler()

        swipeView = findViewById(R.id.swipeView)

        swipeView.setOnRefreshListener {
            runnable = Runnable {
                swipeView.isRefreshing = false
            }
            handler.postDelayed(runnable, 3000.toLong())

        }
        swipeView.setColorSchemeColors(Color.BLUE, Color.CYAN, Color.GREEN, Color.RED)
    }
}