package com.company.notify;

import com.company.Notify;

public class SmsNotify implements Notify {

    private String number;

    public SmsNotify(String number) {
        this.number = number;
    }

    @Override
    public void sendNotify() {
        System.out.println("Send SMS to" + number + "is successfully");
    }
}
