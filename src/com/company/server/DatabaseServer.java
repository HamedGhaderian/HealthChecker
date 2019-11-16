package com.company.server;

import com.company.notify.Notify;

import java.util.List;

public class DatabaseServer extends Server {


    public DatabaseServer(List<Notify> notifyList) throws Exception {
        super(notifyList);
    }

    @Override
    public boolean checkHealthAndSendNotify() {
        if (isResponseQuerySuccess())
            return true;
        else {
            sendNotify();
            return false;
        }
    }

    private boolean isResponseQuerySuccess() {
        return false;
    }

    private void sendNotify() {
        for (Notify notify : getNotifyList()) {
            notify.sendNotify();
        }
    }
}
