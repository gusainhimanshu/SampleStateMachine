package org.himanshu.state.machine.controller;

public class State {

    String state;

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                '}';
    }
}
