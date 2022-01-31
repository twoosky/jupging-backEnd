package com.jupging.jupgingServer.user.domain;


import com.jupging.jupgingServer.user.domain.enums.GenderType;

import javax.persistence.*;

public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = true)
    private String image;

    @Column(nullable = true)
    private Float height;

    @Column(nullable = true)
    private Float weight;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private GenderType genderType;
}
