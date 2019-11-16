package com.company.server;

import com.company.notify.Notify;

import java.util.List;

public class WebServer extends Server {


    public WebServer(List<Notify> notifyList) throws Exception {
        super(notifyList);
    }

    @Override
    public boolean checkHealthAndSendNotify() {
        if (isResponseOfRequestSuccess())
            return true;
        else {
            sendNotify();
            return false;
        }
    }

    private boolean isResponseOfRequestSuccess() {
        return false;
    }

    private void sendNotify() {
        for (Notify notify : getNotifyList()) {
            notify.sendNotify();
        }
    }
}
