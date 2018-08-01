package javastar920905.entity;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

/**
 * @author ouzhx  on ${date}
 */
public class User implements Serializable {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
