package com.tecspro.agrimensoft.view.Generic;

/**
 * Created by rodrigo on 11/11/16.
 */

public class Field {
    private String name;
    private Class[] type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class[] getType() {
        return type;
    }

    public void setType(Class[] type) {
        this.type = type;
    }
}
