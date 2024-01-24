package com.design_pattern.behavioral.mediator;

public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);

}


abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();

}


class Hobbit extends PartyMemberBase {

    @Override
    public String toString() {
        return "Hobbit";
    }

}


class Hunter extends PartyMemberBase {

    @Override
    public String toString() {
        return "Hunter";
    }
}


class Rogue extends PartyMemberBase {

    @Override
    public String toString() {
        return "Rogue";
    }

}


class Wizard extends PartyMemberBase {

    @Override
    public String toString() {
        return "Wizard";
    }

}
