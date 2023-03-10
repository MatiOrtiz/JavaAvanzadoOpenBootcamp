package demopostman.demospringrest.services;

import demopostman.demospringrest.models.Bootcamper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BootcamperService {
    
    private List<Bootcamper> bootcampers = new ArrayList<>();

    public List<Bootcamper> getList() {
        return bootcampers;
    }

    public void addToList(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }
    
    public Bootcamper get(String nombre) {
        for(Bootcamper bootcamper: bootcampers) {
            if(bootcamper.getNombre().equalsIgnoreCase(nombre))
                return bootcamper;
        }
        return null;
    }
}
