package com.gipl.samplemvvm.ui.modles;

/**
 * Creted by User on 05-Jan-19
 */
public class User  {
    private String name;
    private String pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
