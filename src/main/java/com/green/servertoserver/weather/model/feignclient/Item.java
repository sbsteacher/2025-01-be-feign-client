package com.green.servertoserver.weather.model.feignclient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String category;
    private String obsrValue;
}
