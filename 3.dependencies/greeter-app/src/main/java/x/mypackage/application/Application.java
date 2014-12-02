package x.mypackage.application;

import x.mypackage.api.GreeterService;
import x.mypackage.api.Mood;

public class Application {
    public static void main(String... args) {
        GreeterService greeterService = ServiceLoader.loadGreetingService();

        Mood mood = Mood.valueOf(args[0]);

        System.out.println(greeterService.greeting(mood).asString());
    }
}
