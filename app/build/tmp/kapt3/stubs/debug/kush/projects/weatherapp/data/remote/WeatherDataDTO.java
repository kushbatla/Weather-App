package kush.projects.weatherapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003Ji\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006 "}, d2 = {"Lkush/projects/weatherapp/data/remote/WeatherDataDTO;", "", "time", "", "", "temperatureData", "", "weatherCodes", "", "windSpeedData", "apparentTemperatureData", "humidityData", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getApparentTemperatureData", "()Ljava/util/List;", "getHumidityData", "getTemperatureData", "getTime", "getWeatherCodes", "getWindSpeedData", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherDataDTO {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> time = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "temperature_2m")
    private final java.util.List<java.lang.Double> temperatureData = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weathercode")
    private final java.util.List<java.lang.Integer> weatherCodes = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "windspeed_10m")
    private final java.util.List<java.lang.Double> windSpeedData = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "apparent_temperature")
    private final java.util.List<java.lang.Double> apparentTemperatureData = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "relativehumidity_2m")
    private final java.util.List<java.lang.Double> humidityData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kush.projects.weatherapp.data.remote.WeatherDataDTO copy(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> time, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> temperatureData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> weatherCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> windSpeedData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> apparentTemperatureData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> humidityData) {
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
    
    public WeatherDataDTO(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> time, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> temperatureData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> weatherCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> windSpeedData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> apparentTemperatureData, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Double> humidityData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> getTemperatureData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getWeatherCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> getWindSpeedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> getApparentTemperatureData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Double> getHumidityData() {
        return null;
    }
}