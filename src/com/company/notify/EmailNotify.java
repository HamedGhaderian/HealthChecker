package com.company.notify;

import com.company.Notify;

public class EmailNotify implements Notify {
    private String email;

    public EmailNotify(String email) {
        this.email = email;
    }

    @Override
    public void sendNotify() {
        System.out.println("Send Email to" + email + "is successfully");
    }
}
