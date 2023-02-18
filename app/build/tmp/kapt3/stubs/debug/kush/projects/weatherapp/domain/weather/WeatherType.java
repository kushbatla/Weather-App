package kush.projects.weatherapp.domain.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u001c\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u001b\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u001b%&\'()*+,-./0123456789:;<=>?\u00a8\u0006@"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType;", "", "weatherDesc", "", "iconRes", "(II)V", "getIconRes", "()I", "getWeatherDesc", "ClearSky", "Companion", "DenseDrizzle", "DenseFreezingDrizzle", "DepositingRimeFog", "Foggy", "HeavyFreezingRain", "HeavyHailThunderstorm", "HeavyRain", "HeavySnowFall", "HeavySnowShowers", "LightDrizzle", "LightFreezingDrizzle", "MainlyClear", "ModerateDrizzle", "ModerateRain", "ModerateRainShowers", "ModerateSnowFall", "ModerateThunderstorm", "Overcast", "PartlyCloudy", "SlightHailThunderstorm", "SlightRain", "SlightRainShowers", "SlightSnowFall", "SlightSnowShowers", "SnowGrains", "ViolentRainShowers", "Lkush/projects/weatherapp/domain/weather/WeatherType$ClearSky;", "Lkush/projects/weatherapp/domain/weather/WeatherType$MainlyClear;", "Lkush/projects/weatherapp/domain/weather/WeatherType$PartlyCloudy;", "Lkush/projects/weatherapp/domain/weather/WeatherType$Overcast;", "Lkush/projects/weatherapp/domain/weather/WeatherType$Foggy;", "Lkush/projects/weatherapp/domain/weather/WeatherType$DepositingRimeFog;", "Lkush/projects/weatherapp/domain/weather/WeatherType$LightDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType$DenseDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType$LightFreezingDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType$DenseFreezingDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SlightRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyFreezingRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SlightSnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateSnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType$HeavySnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SnowGrains;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SlightRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ViolentRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SlightSnowShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType$HeavySnowShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateThunderstorm;", "Lkush/projects/weatherapp/domain/weather/WeatherType$SlightHailThunderstorm;", "Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyHailThunderstorm;", "app_debug"})
public abstract class WeatherType {
    private final int weatherDesc = 0;
    private final int iconRes = 0;
    @org.jetbrains.annotations.NotNull()
    public static final kush.projects.weatherapp.domain.weather.WeatherType.Companion Companion = null;
    
    private WeatherType(@androidx.annotation.StringRes()
    int weatherDesc, @androidx.annotation.RawRes()
    int iconRes) {
        super();
    }
    
    public final int getWeatherDesc() {
        return 0;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ClearSky;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ClearSky extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ClearSky INSTANCE = null;
        
        private ClearSky() {
            super(0, 0);
        }
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$MainlyClear;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class MainlyClear extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.MainlyClear INSTANCE = null;
        
        private MainlyClear() {
            super(0, 0);
        }
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$PartlyCloudy;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class PartlyCloudy extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.PartlyCloudy INSTANCE = null;
        
        private PartlyCloudy() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$Overcast;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Overcast extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.Overcast INSTANCE = null;
        
        private Overcast() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$Foggy;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Foggy extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.Foggy INSTANCE = null;
        
        private Foggy() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$DepositingRimeFog;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DepositingRimeFog extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.DepositingRimeFog INSTANCE = null;
        
        private DepositingRimeFog() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$LightDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class LightDrizzle extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.LightDrizzle INSTANCE = null;
        
        private LightDrizzle() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateDrizzle extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ModerateDrizzle INSTANCE = null;
        
        private ModerateDrizzle() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$DenseDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DenseDrizzle extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.DenseDrizzle INSTANCE = null;
        
        private DenseDrizzle() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$LightFreezingDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class LightFreezingDrizzle extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.LightFreezingDrizzle INSTANCE = null;
        
        private LightFreezingDrizzle() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$DenseFreezingDrizzle;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DenseFreezingDrizzle extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.DenseFreezingDrizzle INSTANCE = null;
        
        private DenseFreezingDrizzle() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SlightRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightRain extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SlightRain INSTANCE = null;
        
        private SlightRain() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRain extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ModerateRain INSTANCE = null;
        
        private ModerateRain() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyRain extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.HeavyRain INSTANCE = null;
        
        private HeavyRain() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyFreezingRain;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyFreezingRain extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.HeavyFreezingRain INSTANCE = null;
        
        private HeavyFreezingRain() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SlightSnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightSnowFall extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SlightSnowFall INSTANCE = null;
        
        private SlightSnowFall() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateSnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateSnowFall extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ModerateSnowFall INSTANCE = null;
        
        private ModerateSnowFall() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$HeavySnowFall;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavySnowFall extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.HeavySnowFall INSTANCE = null;
        
        private HeavySnowFall() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SnowGrains;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SnowGrains extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SnowGrains INSTANCE = null;
        
        private SnowGrains() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SlightRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightRainShowers extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SlightRainShowers INSTANCE = null;
        
        private SlightRainShowers() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRainShowers extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ModerateRainShowers INSTANCE = null;
        
        private ModerateRainShowers() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ViolentRainShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ViolentRainShowers extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ViolentRainShowers INSTANCE = null;
        
        private ViolentRainShowers() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SlightSnowShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightSnowShowers extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SlightSnowShowers INSTANCE = null;
        
        private SlightSnowShowers() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$HeavySnowShowers;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavySnowShowers extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.HeavySnowShowers INSTANCE = null;
        
        private HeavySnowShowers() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$ModerateThunderstorm;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateThunderstorm extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.ModerateThunderstorm INSTANCE = null;
        
        private ModerateThunderstorm() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$SlightHailThunderstorm;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightHailThunderstorm extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.SlightHailThunderstorm INSTANCE = null;
        
        private SlightHailThunderstorm() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$HeavyHailThunderstorm;", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyHailThunderstorm extends kush.projects.weatherapp.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull()
        public static final kush.projects.weatherapp.domain.weather.WeatherType.HeavyHailThunderstorm INSTANCE = null;
        
        private HeavyHailThunderstorm() {
            super(0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkush/projects/weatherapp/domain/weather/WeatherType$Companion;", "", "()V", "fromWMO", "Lkush/projects/weatherapp/domain/weather/WeatherType;", "code", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kush.projects.weatherapp.domain.weather.WeatherType fromWMO(int code) {
            return null;
        }
    }
}