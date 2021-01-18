package com.spring.irisk.irisk.transactional;

import java.util.List;

public interface Cashier {

    void checkout(int userId, List<String> isbns);
}
