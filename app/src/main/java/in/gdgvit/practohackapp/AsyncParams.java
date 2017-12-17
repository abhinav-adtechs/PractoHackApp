package in.gdgvit.practohackapp;

import java.io.File;

class AsyncParams {
    String url;
    File file ;

    public AsyncParams(String url, File file) {
        this.url = url;
        this.file = file;
    }
}
