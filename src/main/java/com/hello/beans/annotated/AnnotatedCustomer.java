package com.hello.beans.annotated;

import org.springframework.stereotype.Component;

@Component(value = "Customer")
public class AnnotatedCustomer {

    int id;
    String name;
    AnnotatedAddress address;

    public AnnotatedCustomer() {
    }

    public AnnotatedCustomer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AnnotatedCustomer(int id, String name, AnnotatedAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void initCustomer() {
        System.out.println("Initializing customer bean....");
    }

    public void destroyCustomer() {
        System.out.println("Destroying customer bean....");
    }
}
