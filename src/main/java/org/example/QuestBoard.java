package org.example;

// Assigns quests to characters that implement Questable
public class QuestBoard {
    public QuestBoard(){
    }

    public void assignQuest(Questable a, String questName){
        a.acceptQuest(questName);
    }
}
