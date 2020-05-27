package org.himanshu.state.machine.states;

public class AutoState implements IState {

    String autoState;

    public AutoState(String autoState) {
        this.autoState = autoState;
    }

    @Override
    public void handle() {
        System.out.println(autoState);
    }

    public String getAutoState() {
        return autoState;
    }

    public void setAutoState(String autoState) {
        this.autoState = autoState;
    }

    @Override
    public String toString() {
        return "AutoState{" +
                "autoState='" + autoState + '\'' +
                '}';
    }
}
