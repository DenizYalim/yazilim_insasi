package org.example;

public class QuestManagementSystem
{
    public static void main( String[] args )
    {
        Adventurer adv1 = new Adventurer("Frodo", Adventurer.Races.Human);
        Adventurer adv2 = new Adventurer("Aragon", Adventurer.Races.Human);
        Adventurer adv3 = new Adventurer("Lego", Adventurer.Races.Elf);
        Adventurer adv4 = new Adventurer("Gibli", Adventurer.Races.Human);

        Quest q1 = new Quest();
        Quest q2 = new Quest();

        Mentor mentor = new Mentor("Gandalf", "the Grey");
    }
}
