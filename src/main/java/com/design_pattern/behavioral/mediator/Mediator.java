package com.design_pattern.behavioral.mediator;

public class Mediator {
    public static void main(String[] args) {

        // create party and members
        Party party = new PartyImpl();
        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();
        // add party members
        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);
        System.out.println("<---------->");
        // perform actions -> the other party members
        // are notified by the party
        hobbit.act(Action.ENEMY);
        System.out.println("<---------->");
        wizard.act(Action.TALE);
        System.out.println("<---------->");
        rogue.act(Action.GOLD);
        System.out.println("<---------->");
        hunter.act(Action.HUNT);
    }
}
