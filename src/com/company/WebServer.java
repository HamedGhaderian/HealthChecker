package com.company;

public class WebServer implements Server {
    @Override
    public boolean checkHealth() {
        if (isResponseOfRequestSuccess())
            return true;
        else {
            return false;
        }
    }

    private boolean isResponseOfRequestSuccess() {
        return true;
    }


}
