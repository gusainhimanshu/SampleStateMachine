package org.state.machine.controller;

import org.state.machine.states.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StateController {

    public static void main(String[] args) {
        IState basePremium = new BaseState("BasePremium");
        IState autoState = new AutoState("AutoState");
        IState secondState = new SecondState("SecondState");
        IState thirdState = new ThirdState("ThirdState");


        Rules rule1 = new Rules("AutoRule");
        Rules rule2 = new Rules("Rule2");
        Rules rule3 = new Rules("Rule3");
        Rules rule4 = new Rules("Rule4");
        Set<Rules> ruleSet1 = new HashSet<Rules>();
        Set<Rules> ruleSet2 = new HashSet<Rules>();
        Set<Rules> ruleSet3 = new HashSet<Rules>();
        Set<Rules> ruleSet4 = new HashSet<Rules>();
        ruleSet1.add(rule1);
        ruleSet2.add(rule2);
        ruleSet3.add(rule3);
        ruleSet4.add(rule4);

        List<Transition> transitions = new ArrayList<Transition>();

        transitions.add(new Transition(basePremium, ruleSet1, autoState));
        transitions.add(new Transition(basePremium,ruleSet2,secondState));
        transitions.add(new Transition(basePremium, ruleSet3, thirdState));
        transitions.add(new Transition(thirdState,ruleSet1,autoState));


        StateMachine machine = new StateMachine(transitions,basePremium);
        System.out.println(machine.currentState.toString()); // "one"
        machine.apply(ruleSet3);
        //System.out.println(machine.currentState.toString()); // "three
        machine.currentState.handle();

        machine.apply(ruleSet1);
        machine.currentState.handle();
    }
}
