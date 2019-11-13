package com.company;

public class WebServer implements Server {
    @Override
    public boolean checkHealth() {
        if (isResponseOfRequestSuccess())
            return true;
        else {
            sendNotify();
            return false;
        }
    }

    private boolean isResponseOfRequestSuccess() {
        return true;
    }

    private void sendNotify() {
        Notify notify = new Notify();
        notify.callNumber();
        notify.sendSms();
        notify.sendEmail();
    }


}
