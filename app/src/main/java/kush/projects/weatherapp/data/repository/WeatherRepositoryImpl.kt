package kush.projects.weatherapp.data.repository

import android.app.Application
import kush.projects.weatherapp.R
import kush.projects.weatherapp.data.mappers.toWeatherInfo
import kush.projects.weatherapp.data.remote.WeatherAPI
import kush.projects.weatherapp.domain.repository.WeatherRepository
import kush.projects.weatherapp.domain.util.Resource
import kush.projects.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api:WeatherAPI,
    private val app:Application
):WeatherRepository {
    override suspend fun fetchWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(   
                data = api.fetchWeatherData(lat = lat , long = long).toWeatherInfo()
            )
        } catch (e:Exception){
            e.printStackTrace()
            Resource.Error(e.message?:app.getString(R.string.unknown_error))
        }
    }
}