package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Mentor extends Character implements Joinable{
    String title;
    ArrayList<Quest> questsOverseen = new ArrayList<>();

    public Mentor(String name, String title) {
        super(name, "mentor");
        this.title = title;
    }

    public void overseeQuest(Quest quest) {
        questsOverseen.add(quest);
    }

    public void removeQuest(Quest quest) {
        // implementation of removeQuest() lol
    }

    public void notify(Quest notifier, String action, Quest q2) {
        if (Objects.equals(action, "remove"))
            removeQuest(notifier);

        if (Objects.equals(action, "add"))
            overseeQuest(q2);
    }

    public void notify(Quest notifier, String action) {
        notify(notifier, action, notifier);
    }

    @Override
    public void joinQuest(Quest q) {
        overseeQuest(q);
    }
}
