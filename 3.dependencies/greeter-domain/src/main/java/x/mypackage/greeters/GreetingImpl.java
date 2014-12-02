package x.mypackage.greeters;

import x.mypackage.api.Greeting;

public class GreetingImpl implements Greeting {
    private String message;

    public GreetingImpl(String message) {
        this.message = message;
    }

    @Override
    public String asString() {
        return message;
    }
}
