package com.company.server;

import com.company.notify.Notify;

import java.util.List;

public abstract class Server {

    private List<Notify> notifyList;

    public Server(List<Notify> notifyList) throws Exception {
        if (notifyList != null && !notifyList.isEmpty())
            this.notifyList = notifyList;
        else
            throw new Exception("notifyList is empty");
    }

    abstract boolean checkHealthAndSendNotify();

    List<Notify> getNotifyList() {
        return notifyList;
    }
}
