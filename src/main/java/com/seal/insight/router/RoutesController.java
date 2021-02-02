package com.seal.insight.router;

import com.seal.insight.router.repo.Instance;
import com.seal.insight.router.repo.RoutesRepository;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Singleton
@Path("/instances")
public class RoutesController {

    private final RoutesRepository routesRepository;

    public RoutesController(RoutesRepository routesRepository) {
        this.routesRepository = routesRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Instance> getRoutes() {
        return routesRepository.findAll();
    }
}
