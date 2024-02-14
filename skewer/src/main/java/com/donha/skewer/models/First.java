package com.donha.skewer.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "first")
public class First implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}
