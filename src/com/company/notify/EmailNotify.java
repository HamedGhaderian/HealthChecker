package com.company.notify;

import static com.company.utils.CommonUtils.isEmailValid;

public class EmailNotify implements Notify {
    private final String message;
    private final String email;

    public EmailNotify(String email, String message) throws Exception {
        //
        if (message != null && !message.isEmpty())
            this.message = message;
        else
            throw new Exception("message is not valid");
        //
        if (isEmailValid(email))
            this.email = email;
        else
            throw new Exception("Number is not valid");
    }

    @Override
    public void sendNotify() {
        System.out.println("Message( " + message + " ) successfully send  to " + email);
    }
}
