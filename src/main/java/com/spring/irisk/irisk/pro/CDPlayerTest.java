package com.spring.irisk.irisk.pro;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RunWith(SpringJUnit4ClassRunner.class)
@RestController
public class CDPlayerTest {

    @Autowired()
    @Qualifier(value = "lonelyHeartClub")
    private CompactDisc sg;

    @RequestMapping("/akali")
    public void cdShouldNotBeNull(){

        System.out.println(" sg " );
        sg.play();
    }

}
