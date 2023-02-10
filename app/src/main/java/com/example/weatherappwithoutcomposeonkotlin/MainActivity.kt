package com.example.weatherappwithoutcomposeonkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.weatherappwithoutcomposeonkotlin.weathertype.WeatherType
import java.util.Random

class MainActivity : AppCompatActivity(){

    private lateinit var swipeView : SwipeRefreshLayout
    private lateinit var handler : Handler
    private lateinit var runnable: Runnable
    private lateinit var random: Random
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherName: TextView = findViewById(R.id.weather_name)
        val weatherLogo: ImageView = findViewById(R.id.weather_logo)
        val temperature: TextView = findViewById(R.id.temperature)
        val valueOfWind: TextView = findViewById(R.id.value_of_wind)
        val valueOfHumidity: TextView = findViewById(R.id.value_of_humidity)
        val valueOfVisibility: TextView = findViewById(R.id.value_of_visibility)

        handler = Handler()
        random = Random()
        swipeView = findViewById(R.id.swipeView)

        swipeView.setOnRefreshListener {
            runnable = Runnable {
                val values = WeatherType.values()
                var i = values.random()
                when(i){
                    WeatherType.SUNNY -> {
                        weatherName.text = WeatherType.SUNNY.weatherName
                        weatherLogo.setImageResource(R.drawable.ic_sunny)
                        temperature.text = WeatherType.SUNNY.temperature
                        valueOfWind.text = WeatherType.SUNNY.wind
                        valueOfHumidity.text = WeatherType.SUNNY.humidity
                        valueOfVisibility.text = WeatherType.SUNNY.visibility
                    }
                    WeatherType.CLOUDY -> {
                        weatherName.text = WeatherType.CLOUDY.weatherName
                        weatherLogo.setImageResource(R.drawable.ic_cloudy)
                        temperature.text = WeatherType.CLOUDY.temperature
                        valueOfWind.text = WeatherType.CLOUDY.wind
                        valueOfHumidity.text = WeatherType.CLOUDY.humidity
                        valueOfVisibility.text = WeatherType.CLOUDY.visibility
                    }
                    WeatherType.RAINY -> {
                        weatherName.text = WeatherType.RAINY.weatherName
                        weatherLogo.setImageResource(R.drawable.ic_rainy)
                        temperature.text = WeatherType.RAINY.temperature
                        valueOfWind.text = WeatherType.RAINY.wind
                        valueOfHumidity.text = WeatherType.RAINY.humidity
                        valueOfVisibility.text = WeatherType.RAINY.visibility
                    }
                    WeatherType.STORMY -> {
                        weatherName.text = WeatherType.STORMY.weatherName
                        weatherLogo.setImageResource(R.drawable.ic_stormy)
                        temperature.text = WeatherType.STORMY.temperature
                        valueOfWind.text = WeatherType.STORMY.wind
                        valueOfHumidity.text = WeatherType.STORMY.humidity
                        valueOfVisibility.text = WeatherType.STORMY.visibility
                    }
                }
                swipeView.isRefreshing = false
            }
            handler.postDelayed(runnable, 3000.toLong())

        }
        swipeView.setColorSchemeColors(Color.BLUE, Color.CYAN, Color.GREEN, Color.RED)
    }
}