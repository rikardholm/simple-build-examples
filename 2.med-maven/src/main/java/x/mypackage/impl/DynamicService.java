package x.mypackage.impl;

import x.mypackage.api.GreeterService;

import java.io.InputStream;
import java.util.Scanner;

public class DynamicService implements GreeterService {

    private String messageFilePath;

    public DynamicService(String messageFilePath) {
        this.messageFilePath = messageFilePath;
    }

    @Override
    public String greeting() {
        InputStream inputStream = this.getClass().getResourceAsStream(messageFilePath);
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "Hm..";
    }
}
