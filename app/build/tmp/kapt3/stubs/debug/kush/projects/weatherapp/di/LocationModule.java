package kush.projects.weatherapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lkush/projects/weatherapp/di/LocationModule;", "", "()V", "bindsLocationTracker", "Lkush/projects/weatherapp/domain/location/LocationTracker;", "defaultLocationTracker", "Lkush/projects/weatherapp/data/location/DefaultLocationTracker;", "app_debug"})
@dagger.Module()
public abstract class LocationModule {
    
    public LocationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract kush.projects.weatherapp.domain.location.LocationTracker bindsLocationTracker(@org.jetbrains.annotations.NotNull()
    kush.projects.weatherapp.data.location.DefaultLocationTracker defaultLocationTracker);
}