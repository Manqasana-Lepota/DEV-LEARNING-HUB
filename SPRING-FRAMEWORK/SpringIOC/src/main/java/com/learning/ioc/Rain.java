package com.learning.ioc;

public class Rain implements SimCard{
    @Override
    public void calling() {
        System.out.println("Calling using Rain sim card");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Rain mobile data");

    }
}
