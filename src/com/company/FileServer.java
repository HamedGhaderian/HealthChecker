package com.company;

public class FileServer implements Server {

    @Override
    public boolean checkHealth() {
        if (isUploadFileSuccess())
            return true;
        else {
            return false;
        }
    }

    private boolean isUploadFileSuccess() {
        return false;
    }


}
