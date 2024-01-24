package com.design_pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);

}


class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (var member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }
}
