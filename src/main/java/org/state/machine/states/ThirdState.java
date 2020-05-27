package org.state.machine.states;

public class ThirdState implements IState {

    String thirdState;

    public ThirdState(String thirdState) {
        this.thirdState = thirdState;
    }

    @Override
    public void handle() {
        System.out.println("Current state is : " + thirdState);
    }

    public String getThirdState() {
        return thirdState;
    }

    public void setThirdState(String thirdState) {
        this.thirdState = thirdState;
    }

    @Override
    public String toString() {
        return "ThirdState{" +
                "thirdState='" + thirdState + '\'' +
                '}';
    }
}
