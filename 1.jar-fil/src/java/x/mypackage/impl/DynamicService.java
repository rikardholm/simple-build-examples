package x.mypackage.impl;

import x.mypackage.api.GreeterService;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DynamicService implements GreeterService {
    @Override
    public String greeting() {
        InputStream inputStream = this.getClass().getResourceAsStream("message.txt");
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "Hm..";
    }
}
