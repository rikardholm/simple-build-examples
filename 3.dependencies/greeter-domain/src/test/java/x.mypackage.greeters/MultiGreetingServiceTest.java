package x.mypackage.greeters;


import org.junit.Test;
import x.mypackage.api.GreeterService;
import x.mypackage.api.Mood;

import static org.junit.Assert.assertEquals;

public class MultiGreetingServiceTest {
    @Test
    public void returns_happy_greeting() throws Exception {
        GreeterService greeterService = new MultiGreetingService();

        assertEquals("Weeee", greeterService.greeting(Mood.HAPPY).asString());
    }

    @Test
    public void returns_grumpy_greeting() throws Exception {
        GreeterService greeterService = new MultiGreetingService();

        assertEquals("Blah", greeterService.greeting(Mood.GRUMPY).asString());
    }
}