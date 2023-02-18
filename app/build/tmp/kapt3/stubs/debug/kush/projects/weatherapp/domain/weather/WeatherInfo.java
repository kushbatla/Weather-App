package kush.projects.weatherapp.domain.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u00c6\u0003JO\u0010\u0017\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherInfo;", "", "weatherDataPerDay", "", "", "", "Lkush/projects/weatherapp/domain/weather/WeatherData;", "currentWeatherData", "nextDayWeatherData", "dailyWeatherInfo", "Lkush/projects/weatherapp/domain/weather/DailyWeatherInfo;", "(Ljava/util/Map;Lkush/projects/weatherapp/domain/weather/WeatherData;Lkush/projects/weatherapp/domain/weather/WeatherData;Ljava/util/List;)V", "getCurrentWeatherData", "()Lkush/projects/weatherapp/domain/weather/WeatherData;", "getDailyWeatherInfo", "()Ljava/util/List;", "getNextDayWeatherData", "getWeatherDataPerDay", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class WeatherInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, java.util.List<kush.projects.weatherapp.domain.weather.WeatherData>> weatherDataPerDay = null;
    @org.jetbrains.annotations.Nullable()
    private final kush.projects.weatherapp.domain.weather.WeatherData currentWeatherData = null;
    @org.jetbrains.annotations.Nullable()
    private final kush.projects.weatherapp.domain.weather.WeatherData nextDayWeatherData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<kush.projects.weatherapp.domain.weather.DailyWeatherInfo> dailyWeatherInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kush.projects.weatherapp.domain.weather.WeatherInfo copy(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<kush.projects.weatherapp.domain.weather.WeatherData>> weatherDataPerDay, @org.jetbrains.annotations.Nullable()
    kush.projects.weatherapp.domain.weather.WeatherData currentWeatherData, @org.jetbrains.annotations.Nullable()
    kush.projects.weatherapp.domain.weather.WeatherData nextDayWeatherData, @org.jetbrains.annotations.Nullable()
    java.util.List<kush.projects.weatherapp.domain.weather.DailyWeatherInfo> dailyWeatherInfo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherInfo(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<kush.projects.weatherapp.domain.weather.WeatherData>> weatherDataPerDay, @org.jetbrains.annotations.Nullable()
    kush.projects.weatherapp.domain.weather.WeatherData currentWeatherData, @org.jetbrains.annotations.Nullable()
    kush.projects.weatherapp.domain.weather.WeatherData nextDayWeatherData, @org.jetbrains.annotations.Nullable()
    java.util.List<kush.projects.weatherapp.domain.weather.DailyWeatherInfo> dailyWeatherInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<kush.projects.weatherapp.domain.weather.WeatherData>> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<kush.projects.weatherapp.domain.weather.WeatherData>> getWeatherDataPerDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kush.projects.weatherapp.domain.weather.WeatherData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kush.projects.weatherapp.domain.weather.WeatherData getCurrentWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kush.projects.weatherapp.domain.weather.WeatherData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kush.projects.weatherapp.domain.weather.WeatherData getNextDayWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<kush.projects.weatherapp.domain.weather.DailyWeatherInfo> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<kush.projects.weatherapp.domain.weather.DailyWeatherInfo> getDailyWeatherInfo() {
        return null;
    }
}