package com.company.model;

import javax.persistence.*;

@Entity
@Table(name = "GROUPS")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public int getGroupId() {
        return id;
    }

    public String getGroupName() {
        return name;
    }
}
