package com.cybertek.enums;

import lombok.Getter;


public enum Status {

    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
