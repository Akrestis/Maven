package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Persons> persons = new ArrayList<>();

    public Group(String name, List<Persons> persons) {
        this.name = name;
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Group: " + name + '\n' + persons;
    }
}
