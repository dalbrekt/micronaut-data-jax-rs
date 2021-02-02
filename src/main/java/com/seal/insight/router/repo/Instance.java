package com.seal.insight.router.repo;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.UUID;

@MappedEntity
public class Instance {

    @Id
    @GeneratedValue
    private UUID id;

    private final String account;
    private final String instance;

    public Instance(String account, String instance) {
        this.account = account;
        this.instance = instance;
    }

    public String getAccount() {
        return account;
    }


    public String getInstance() {
        return instance;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Route{");
        sb.append("id=").append(id);
        sb.append(", account='").append(account).append('\'');
        sb.append(", instance='").append(instance).append('\'');
        sb.append('}');
        return sb.toString();
    }
}