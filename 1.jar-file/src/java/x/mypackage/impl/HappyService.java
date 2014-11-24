package x.mypackage.impl;

import x.mypackage.api.GreeterService;

public class HappyService implements GreeterService {
    @Override
    public String greeting() {
        return "Hello!";
    }
}
