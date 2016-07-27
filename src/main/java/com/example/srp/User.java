package com.example.srp;

import java.time.Duration;
import java.util.List;

public class User {
    private String creditCardNumber;
    private String name;
    private String address;
    private int age;
    private Duration accountAge;
    private List<ContactMethod> allowedContactMethods;
    public enum ContactMethod {
        PHONE, EMAIL, SMS
    }

}
