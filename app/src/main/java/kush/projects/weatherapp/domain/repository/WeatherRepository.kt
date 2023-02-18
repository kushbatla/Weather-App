package kush.projects.weatherapp.domain.repository

import kush.projects.weatherapp.domain.util.Resource
import kush.projects.weatherapp.domain.weather.WeatherInfo

//weather repository abstraction
interface WeatherRepository {

    suspend fun fetchWeatherData(lat:Double,long:Double): Resource<WeatherInfo>
}