package com.song.dubbo.dubbo_demo_api.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 7318984091634598278L;
    private Integer id;
    private String name;
    private Computer computer;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
