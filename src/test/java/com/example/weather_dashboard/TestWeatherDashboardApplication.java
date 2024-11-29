package com.example.weather_dashboard;

import org.springframework.boot.SpringApplication;

public class TestWeatherDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.from(WeatherDashboardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
