package kush.projects.weatherapp.presentation.viewmodel

import kush.projects.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading:Boolean = false,
    val cityName:String? = "",
    val error:String? = null
)