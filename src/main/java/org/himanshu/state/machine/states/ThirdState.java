package org.himanshu.state.machine.states;

public class ThirdState implements IState {

    String thirdState;

    public ThirdState(String thirdState) {
        this.thirdState = thirdState;
    }

    @Override
    public void handle() {
        System.out.println(thirdState);
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
