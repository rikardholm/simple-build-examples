package x.mypackage;

import x.mypackage.api.GreeterService;
import x.mypackage.impl.DynamicService;

public class DynamicApp {
    public static void main(String[] args) {
        GreeterService greeterService = new DynamicService("/message.txt");

        String greeting = greeterService.greeting();

        System.out.println(greeting);
    }
}
