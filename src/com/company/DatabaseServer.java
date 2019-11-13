package com.company;

class DatabaseServer implements Server {


    @Override
    public boolean checkHealth() {
        if (isResponseQuerySuccess())
            return true;
        else {
            return false;
        }
    }

    private boolean isResponseQuerySuccess() {
        return true;
    }

}
