package org.state.machine.states;

public class BaseState implements IState {

    String state;

    public BaseState(String state) {
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

    @Override
    public void handle() {
        System.out.println(state);
    }
}
