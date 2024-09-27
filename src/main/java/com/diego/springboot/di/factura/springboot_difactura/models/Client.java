package com.diego.springboot.di.factura.springboot_difactura.models;

import org.springframework.stereotype.Component;

@Component
public class Client {

    private String name;
    private String lastName;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
