package com.green.servertoserver.weather;

import com.green.servertoserver.config.constants.ConstKma;
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
    private final ConstKma constKma;

    public ResponseParent ultraSrtNcst(WeatherUltraSrtNcstGetReq req) {
        ResponseParent responseParent = weatherFeignClient.getUltraSrtNcst(constKma.getServiceKey(), constKma.getDataType()
                , req.getBaseDate(), req.getBaseTime(), req.getNx(), req.getNy());

        //로직

        return responseParent;
    }
}
