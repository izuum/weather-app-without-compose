package com.example.weatherappwithoutcomposeonkotlin.weathertype

import com.example.weatherappwithoutcomposeonkotlin.R

enum class WeatherType {

    SUNNY{
        override val weatherName: String = "Sunny"
        override val wind: String = "0 m/h"
        override val humidity: String = "3%"
        override val visibility: String = "25 km"
        override val temperature: String = "35°"
        override val image: Any = R.drawable.ic_sunny
    },
    RAINY{
        override val weatherName: String = "Rainy"
        override val wind: String = "5 m/h"
        override val humidity: String = "118%"
        override val visibility: String = "5 km"
        override val temperature: String = "5°"
        override val image: Any = R.drawable.ic_rainy
    },
    CLOUDY{
        override val weatherName: String = "Cloudy"
        override val wind: String = "7 m/h"
        override val humidity: String = "5%"
        override val visibility: String = "15 km"
        override val temperature: String = "15°"
        override val image: Any = R.drawable.ic_cloudy
    },
    STORMY{
        override val weatherName: String = "Stormy"
        override val wind: String = "50 m/h"
        override val humidity: String = "250%"
        override val visibility: String = "0 km"
        override val temperature: String = "0°"
        override val image: Any = R.drawable.ic_stormy
    };

    abstract val weatherName: String
    abstract val wind: String
    abstract val humidity: String
    abstract val visibility: String
    abstract val temperature: String
    abstract val image: Any

}