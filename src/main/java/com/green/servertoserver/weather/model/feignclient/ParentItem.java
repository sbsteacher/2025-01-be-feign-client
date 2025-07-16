package com.green.servertoserver.weather.model.feignclient;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParentItem {
    private List<Item> item;
}
