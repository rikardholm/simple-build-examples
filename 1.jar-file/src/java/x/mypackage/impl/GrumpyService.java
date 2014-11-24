package x.mypackage.impl;

import x.mypackage.api.GreeterService;

public class GrumpyService implements GreeterService {
    @Override
    public String greeting() {
        return "Buuuu...";
    }
}
