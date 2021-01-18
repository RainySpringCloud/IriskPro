package com.spring.irisk.irisk.transactional;

import org.springframework.stereotype.Service;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("cashier")
public class CashierImpl implements Cashier {

    private BookShopService bookShopService;

    @Transactional
    @Override
    public void checkout(int userId, List<String> isbns) {
        for(String isbn:isbns){
            bookShopService.purchase(userId,isbn);
        }

    }
}
