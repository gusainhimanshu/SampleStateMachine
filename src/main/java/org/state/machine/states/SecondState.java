package org.state.machine.states;

public class SecondState implements IState {

    String secondState;

    public SecondState(String secondState) {
        this.secondState = secondState;
    }

    @Override
    public void handle() {
        System.out.println("Current state is : " + secondState);
    }

    public String getSecondState() {
        return secondState;
    }

    public void setSecondState(String secondState) {
        this.secondState = secondState;
    }

    @Override
    public String toString() {
        return "SecondState{" +
                "secondState='" + secondState + '\'' +
                '}';
    }
}
