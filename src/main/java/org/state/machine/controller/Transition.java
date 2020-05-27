package org.state.machine.controller;

import org.state.machine.states.BaseState;
import org.state.machine.states.IState;

import java.util.Set;

public class Transition {

    IState fromState;
    Set<Rules> rules;
    IState toState;

    public Transition(IState fromState, Set<Rules> rules, IState toState) {
        this.fromState = fromState;
        this.rules = rules;
        this.toState = toState;
    }

    public IState getFromState() {
        return fromState;
    }

    public void setFromState(BaseState fromBaseState) {
        this.fromState = fromBaseState;
    }

    public Set<Rules> getRules() {
        return rules;
    }

    public void setRules(Set<Rules> rules) {
        this.rules = rules;
    }

    public IState getToState() {
        return toState;
    }

    public void setToState(BaseState toBaseState) {
        this.toState = toBaseState;
    }
}
