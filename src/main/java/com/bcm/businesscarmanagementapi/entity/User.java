package com.bcm.businesscarmanagementapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
}
