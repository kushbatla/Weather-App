package kush.projects.weatherapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lkush/projects/weatherapp/data/repository/WeatherRepositoryImpl;", "Lkush/projects/weatherapp/domain/repository/WeatherRepository;", "api", "Lkush/projects/weatherapp/data/remote/WeatherAPI;", "app", "Landroid/app/Application;", "(Lkush/projects/weatherapp/data/remote/WeatherAPI;Landroid/app/Application;)V", "fetchWeatherData", "Lkush/projects/weatherapp/domain/util/Resource;", "Lkush/projects/weatherapp/domain/weather/WeatherInfo;", "lat", "", "long", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImpl implements kush.projects.weatherapp.domain.repository.WeatherRepository {
    private final kush.projects.weatherapp.data.remote.WeatherAPI api = null;
    private final android.app.Application app = null;
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kush.projects.weatherapp.data.remote.WeatherAPI api, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchWeatherData(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kush.projects.weatherapp.domain.util.Resource<kush.projects.weatherapp.domain.weather.WeatherInfo>> continuation) {
        return null;
    }
}