package com.example.weather_dashboard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class WeatherDashboardApplicationTests {

	@Test
	void contextLoads() {
	}

}
