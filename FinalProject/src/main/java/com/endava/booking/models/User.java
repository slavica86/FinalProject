package com.endava.booking.models;


import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //geteri, seteri, equal.... umesto toga mozemo da koristimo bibliotekom lombok maven- ubacimo je kao dependence u pom file
    //plus instaliramo File/Setings/ Plugin/ Lombok -> instal + Restart + Enable proceses
}
