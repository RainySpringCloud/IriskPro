package com.spring.irisk.irisk.transactional;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BookShopServiceImpl  implements  BookShopService{


    //  设置事务传播机制 required 和 隔离级别 默认
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Override
    public void purchase(int userId, String isbn) {


    }
}
