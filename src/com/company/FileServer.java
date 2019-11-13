package com.company;

public class FileServer implements Server {

    @Override
    public boolean checkHealth() {
        if (isUploadFileSuccess())
            return true;
        else {
            sendNotify();
            return false;
        }
    }

    private boolean isUploadFileSuccess() {
        return false;
    }

    private void sendNotify() {
        Notify notify = new Notify();
        notify.sendEmail();
    }
}
