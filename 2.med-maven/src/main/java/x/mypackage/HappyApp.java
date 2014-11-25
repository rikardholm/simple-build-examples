package x.mypackage;

import x.mypackage.api.GreeterService;
import x.mypackage.impl.HappyService;

public class HappyApp {
    public static void main(String[] args) {
        GreeterService greeterService = new HappyService();

        String greeting = greeterService.greeting();

        System.out.println(greeting);
    }
}
