package x.mypackage.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import x.mypackage.api.GreeterService;

import java.io.IOException;
import java.util.Properties;

class ServiceLoader {
    private static Logger log = LoggerFactory.getLogger(ServiceLoader.class);

    public static GreeterService loadGreetingService() {
        try {
            return load();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static GreeterService load() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties serviceProperties = new Properties();
        serviceProperties.load(Application.class.getResourceAsStream("/greeter-services.properties"));
        String clazzName = serviceProperties.getProperty("service");
        log.info("Instantiating service of class {}", clazzName);
        return (GreeterService) Application.class.getClassLoader().loadClass(clazzName).newInstance();
    }
}
