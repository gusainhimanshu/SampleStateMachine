package org.himanshu.state.machine.controller;

import java.util.List;
import java.util.Set;

public class StateMachine {

    List<Transition> transitions;
    State currentState;

    public StateMachine(List<Transition> transitions, State startState) {
        this.transitions = transitions;
        this.currentState = startState;
    }

    public void apply(Set<Rules> rules){
        currentState= getNextState(rules);
    }

    private State getNextState(Set<Rules> rules) {
        for (Transition transition: transitions) {
            boolean currentStateMatches = transition.fromState.equals(currentState);
            boolean currentConditionMatches = transition.rules.equals(rules);
            if(currentStateMatches && currentConditionMatches){
                return transition.toState;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "StateMachine{" +
                "transitions=" + transitions +
                ", currentState=" + currentState +
                '}';
    }
}
