package com.company;

class DatabaseServer implements Server {


    @Override
    public boolean checkHealth() {
        if (isResponseQuerySuccess())
            return true;
        else {
            sendNotify();
            return false;
        }
    }

    private boolean isResponseQuerySuccess() {
        return true;
    }

    private void sendNotify() {
        Notify notify = new Notify();
        notify.sendSms();
    }
}
