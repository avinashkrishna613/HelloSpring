package com.hello.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    int id;
    String name;

    @Autowired
//    @Qualifier(value = "defaultAddress") // if multiple address beans , then prioritize this bean
    Address address;

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, Address address) {
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
