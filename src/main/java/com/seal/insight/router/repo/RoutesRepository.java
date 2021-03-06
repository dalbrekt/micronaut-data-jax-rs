package com.seal.insight.router.repo;


import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@JdbcRepository(dialect = Dialect.H2)
public interface RoutesRepository  extends CrudRepository<Instance, UUID> {

    List<Instance> findAll();
}
