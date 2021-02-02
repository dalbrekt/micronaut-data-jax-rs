package com.seal.insight.router;

import com.seal.insight.router.repo.Instance;
import com.seal.insight.router.repo.RoutesRepository;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {

    @Inject
    RoutesRepository routesRepository;

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

    @EventListener
    public void init(StartupEvent event) {

        routesRepository.save(new Instance("ds-1", "instance-a"));
        routesRepository.save(new Instance("ds-2", "instance-2"));
        routesRepository.save(new Instance("ds-3", "instance-3"));
    }
}
