package com.example.openlhj.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Openhj {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int number;
}
