package com.Counter.HitCounter.Services;

import com.Counter.HitCounter.Model.Counter;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service

public class urlHitService {

    HashMap<String,Integer> map = new HashMap<>();
    public Counter hitCount(String str) {


        int  counter =  map.put(str , map.getOrDefault(str , 0)+ 1);


        Counter val = new Counter(str , counter++);
       return val;


    }
}
