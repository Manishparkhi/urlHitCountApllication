package com.Counter.HitCounter.Controller;

import com.Counter.HitCounter.Model.Counter;
import com.Counter.HitCounter.Services.urlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")

public class UrlHitController {


    @Autowired
    urlHitService urlHitService;
    @GetMapping(value = "/Count")

    public Counter getHitCount(@RequestParam String name){
       return urlHitService.hitCount(name);
    }
}
