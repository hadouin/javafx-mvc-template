package com.hadouin.javafxmvctemplate;

public class Context {
    private Controller controller;
    private String theString;

    public Context(String theString) {
        this.theString = theString;
    }

    public String getTheString() {
        return theString;
    }

    public void setTheString(String theString) {
        this.theString = theString;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
