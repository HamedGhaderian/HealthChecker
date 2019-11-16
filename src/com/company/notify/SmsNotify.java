package com.company.notify;

import static com.company.utils.CommonUtils.isCellNumberValid;

public class SmsNotify implements Notify {

    private final String message;
    private final String number;

    public SmsNotify(String number, String message) throws Exception {
        //
        if (message != null && !message.isEmpty())
            this.message = message;
        else
            throw new Exception("message is not valid");
        //
        if (isCellNumberValid(number))
            this.number = number;
        else
            throw new Exception("Number is not valid");
    }


    @Override
    public void sendNotify() {
        System.out.println("Message( " + message + " ) successfully send  to " + number + " with SMS");
    }
}
