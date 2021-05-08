package com.company;

public enum Passed {
    PASSED("Passed"),
    PASSED_WITH_HONOR("Passed with honor"),
    NOT_PASSED("Not passed");

    private String description;

    private Passed(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
