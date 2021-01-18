package com.spring.irisk.irisk.pro.Repository;

import com.spring.irisk.irisk.pro.CompactDisc;
import org.springframework.stereotype.Component;

@Component(value = "lonelyHeartClub")
public class SgtPeppers implements CompactDisc {

    public void play() {

        System.out.println(" cd player");
    }
}
