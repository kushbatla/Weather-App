package kush.projects.weatherapp.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lkush/projects/weatherapp/presentation/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lkush/projects/weatherapp/domain/repository/WeatherRepository;", "locationTracker", "Lkush/projects/weatherapp/domain/location/LocationTracker;", "app", "Landroid/app/Application;", "(Lkush/projects/weatherapp/domain/repository/WeatherRepository;Lkush/projects/weatherapp/domain/location/LocationTracker;Landroid/app/Application;)V", "<set-?>", "Lkush/projects/weatherapp/presentation/viewmodel/WeatherState;", "state", "getState", "()Lkush/projects/weatherapp/presentation/viewmodel/WeatherState;", "setState", "(Lkush/projects/weatherapp/presentation/viewmodel/WeatherState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "loadWeatherInfo", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final kush.projects.weatherapp.domain.repository.WeatherRepository repository = null;
    private final kush.projects.weatherapp.domain.location.LocationTracker locationTracker = null;
    private final android.app.Application app = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    kush.projects.weatherapp.domain.repository.WeatherRepository repository, @org.jetbrains.annotations.NotNull()
    kush.projects.weatherapp.domain.location.LocationTracker locationTracker, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kush.projects.weatherapp.presentation.viewmodel.WeatherState getState() {
        return null;
    }
    
    private final void setState(kush.projects.weatherapp.presentation.viewmodel.WeatherState p0) {
    }
    
    public final void loadWeatherInfo() {
    }
}