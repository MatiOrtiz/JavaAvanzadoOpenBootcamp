package demopostman.demospringrest.controllers;

import org.springframework.stereotype.Component;
import demopostman.demospringrest.models.Bootcamper;
import demopostman.demospringrest.services.BootcamperService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootCampersController {
    private BootcamperService bootcamperService;

    public BootCampersController(BootcamperService bootcamperService) {
        this.bootcamperService= bootcamperService;

        this.bootcamperService.addToList(new Bootcamper("Uno", Math.random()));
        this.bootcamperService.addToList(new Bootcamper("Dos", Math.random()));
        this.bootcamperService.addToList(new Bootcamper("Tres", Math.random()));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getList();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper enlistarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response agregarBootcamper(Bootcamper bootcamper) {
        bootcamperService.addToList(bootcamper);

        return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
    }

}
