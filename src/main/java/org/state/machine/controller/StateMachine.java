package org.state.machine.controller;

import org.state.machine.states.IState;

import java.util.List;
import java.util.Set;

public class StateMachine {

    List<Transition> transitions;
    IState currentState;

    public StateMachine(List<Transition> transitions, IState startState) {
        this.transitions = transitions;
        this.currentState = startState;
    }

    public void apply(Set<Rules> rules){
        currentState= getNextState(rules);
    }

    private IState getNextState(Set<Rules> rules) {
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
