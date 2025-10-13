package com.learning.ioc;

public class Telkom implements SimCard{
    @Override
    public void calling() {
        System.out.println("Calling using Telkom sim card");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Telkom mobile data");

    }
}
