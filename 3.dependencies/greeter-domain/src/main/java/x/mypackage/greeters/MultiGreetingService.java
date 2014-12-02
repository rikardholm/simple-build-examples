package x.mypackage.greeters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import x.mypackage.api.GreeterService;
import x.mypackage.api.Greeting;
import x.mypackage.api.Mood;

import java.util.EnumMap;
import java.util.Map;

public class MultiGreetingService implements GreeterService {
    private static Logger log = LoggerFactory.getLogger(MultiGreetingService.class);

    private static Map<Mood, String> greetings = new EnumMap<Mood, String>(Mood.class);

    static {
        greetings.put(Mood.GRUMPY, "Blah");
        greetings.put(Mood.HAPPY, "Weeee");
    }

    @Override
    public Greeting greeting(Mood mood) {
        log.info("Returning message for mood {}", mood);
        String message = greetings.get(mood);
        return new GreetingImpl(message);
    }
}
