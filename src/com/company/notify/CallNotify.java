package com.company.notify;

import com.company.Notify;

public class CallNotify implements Notify {
    private String number;

    public CallNotify(String number) {
        this.number = number;
    }

    @Override
    public void sendNotify() {
        System.out.println("Call to" + number + "is successfully");
    }
}
