package com.company.notify;

import static com.company.utils.CommonUtils.isCellNumberValid;

public class CallNotify implements Notify {
    private String number;

    public CallNotify(String number) throws Exception {
        //
        if (isCellNumberValid(number))
            this.number = number;
        else
            throw new Exception("Number is not valid");
    }

    @Override
    public void sendNotify() {
        System.out.println("Call to " + number + " is successfully done");
    }
}
