package com.green.servertoserver.weather;

import com.green.servertoserver.weather.model.WeatherUltraSrtNcstGetReq;
import com.green.servertoserver.weather.model.feignclient.ResponseParent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherFeignClient weatherFeignClient;

    public ResponseParent ultraSrtNcst(WeatherUltraSrtNcstGetReq req) {
        String serviceKey = "fte7et4WjQ2QQTSP51SJ6VZ%2FXA3aDUYv054aZFUsGdrVOKFJxQnmrKJGh%2Box%2FcnwsvpeJmLazXr4je1K01Uoow%3D%3D";
        String dataType = "json";

        ResponseParent responseParent = weatherFeignClient.getUltraSrtNcst(serviceKey, dataType
                , req.getBaseDate(), req.getBaseTime(), req.getNx(), req.getNy());

        //로직

        return responseParent;
    }
}
