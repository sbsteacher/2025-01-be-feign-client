package com.green.servertoserver.weather.model.feignclient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Body {
    private ParentItem items;
}
