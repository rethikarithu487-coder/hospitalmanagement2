package com.example.hospitalmanagement2.entiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String patientCode;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String lastName;

    @Column(nullable = true, length = 20)
    private String age;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String bloodgrp;

    @Column(nullable = false, unique = true)
    private Long aadhar;

    @Column(nullable = false, unique = true)
    private Long number;

}
