package com.green.servertoserver.weather;

import com.green.servertoserver.weather.model.WeatherUltraSrtNcstGetReq;
import com.green.servertoserver.weather.model.feignclient.ResponseParent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/ultra_srt_ncst")
    public ResponseParent ultraSrtNcst(@ModelAttribute WeatherUltraSrtNcstGetReq req) {
        log.info("req: {}", req);
        return weatherService.ultraSrtNcst(req);
    }
}
