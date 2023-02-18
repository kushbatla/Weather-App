package kush.projects.weatherapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kush.projects.weatherapp.data.location.DefaultLocationTracker
import kush.projects.weatherapp.domain.location.LocationTracker
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindsLocationTracker(defaultLocationTracker: DefaultLocationTracker):LocationTracker
}