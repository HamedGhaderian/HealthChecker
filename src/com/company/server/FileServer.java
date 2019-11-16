package com.company.server;

import com.company.notify.Notify;

import java.util.List;

public class FileServer extends Server {


    public FileServer(List<Notify> notifyList) throws Exception {
        super(notifyList);
    }

    @Override
    public boolean checkHealthAndSendNotify() {
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
        for (Notify notify : getNotifyList()) {
            notify.sendNotify();
        }
    }
}
