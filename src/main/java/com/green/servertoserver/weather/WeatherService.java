package com.green.servertoserver.weather;

import com.green.servertoserver.weather.model.feignclient.ResponseParent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherFeignClient weatherFeignClient;

    public ResponseParent ultraSrtNcst() {
        String serviceKey = "fte7et4WjQ2QQTSP51SJ6VZ%2FXA3aDUYv054aZFUsGdrVOKFJxQnmrKJGh%2Box%2FcnwsvpeJmLazXr4je1K01Uoow%3D%3D";
        String dataType = "json";
        String baseDate = "20250715";
        String baseTime = "1300";
        int nx = 89;
        int ny = 91;
        return weatherFeignClient.getUltraSrtNcst(serviceKey, dataType, baseDate, baseTime, nx, ny);
    }
}
