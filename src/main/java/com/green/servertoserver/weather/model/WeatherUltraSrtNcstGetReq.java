package com.green.servertoserver.weather.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WeatherUltraSrtNcstGetReq {
    private String baseDate;
    private String baseTime;
    private int nx;
    private int ny;
}
