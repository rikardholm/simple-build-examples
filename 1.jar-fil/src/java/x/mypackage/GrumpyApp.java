package x.mypackage;

import x.mypackage.api.GreeterService;
import x.mypackage.impl.GrumpyService;

public class GrumpyApp {
    public static void main(String[] args) {
        GreeterService greeterService = new GrumpyService();

        String greeting = greeterService.greeting();

        System.out.println(greeting);
    }
}
