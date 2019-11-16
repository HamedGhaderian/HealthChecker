package com.company;

import com.company.notify.CallNotify;
import com.company.notify.EmailNotify;
import com.company.notify.Notify;
import com.company.notify.SmsNotify;
import com.company.server.DatabaseServer;
import com.company.server.FileServer;
import com.company.server.WebServer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<Notify> fileServerNotifyList = new ArrayList<>();
            fileServerNotifyList.add(new SmsNotify("09123456789", "file server is not working"));
            //
            FileServer fileServer = new FileServer(fileServerNotifyList);
            fileServer.checkHealthAndSendNotify();
            //
            List<Notify> webServerNotifyList = new ArrayList<>();
            webServerNotifyList.add(new CallNotify("09123456789"));
            webServerNotifyList.add(new SmsNotify("09123456789", "Web server is not working"));
            webServerNotifyList.add(new EmailNotify("test@test.com", "Web server is not working"));
            //
            WebServer webServer = new WebServer(webServerNotifyList);
            webServer.checkHealthAndSendNotify();
            //
            List<Notify> databaseServerNotifyList = new ArrayList<>();
            databaseServerNotifyList.add(new SmsNotify("09123456789", "Database server is not working"));
            databaseServerNotifyList.add(new EmailNotify("test@test.com", "Database server is not working"));
            //
            DatabaseServer databaseServer = new DatabaseServer(databaseServerNotifyList);
            databaseServer.checkHealthAndSendNotify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
