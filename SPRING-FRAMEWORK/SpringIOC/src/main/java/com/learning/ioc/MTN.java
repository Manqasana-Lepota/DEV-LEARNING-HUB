package com.learning.ioc;

public class MTN implements SimCard{
    @Override
    public void calling() {
        System.out.println("Calling using MTN sim card");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using MTN mobile data");

    }
}
