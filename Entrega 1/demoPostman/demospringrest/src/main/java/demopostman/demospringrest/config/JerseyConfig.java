package demopostman.demospringrest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        this.packages("demopostman.demospringrest.controllers");
    }
}