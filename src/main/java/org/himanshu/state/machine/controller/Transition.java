package org.himanshu.state.machine.controller;

import java.util.Set;

public class Transition {

    State fromState;
    Set<Rules> rules;
    State toState;

    public Transition(State fromState, Set<Rules> rules, State toState) {
        this.fromState = fromState;
        this.rules = rules;
        this.toState = toState;
    }

    public State getFromState() {
        return fromState;
    }

    public void setFromState(State fromState) {
        this.fromState = fromState;
    }

    public Set<Rules> getRules() {
        return rules;
    }

    public void setRules(Set<Rules> rules) {
        this.rules = rules;
    }

    public State getToState() {
        return toState;
    }

    public void setToState(State toState) {
        this.toState = toState;
    }
}
