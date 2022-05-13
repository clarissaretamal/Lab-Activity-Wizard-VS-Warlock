public class App {
    public static void main(String[] args) throws Exception {
     
        System.out.println("**********************");
        System.out.println("WIZARDS Vs. WARLOCKS");
       

        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         * 
         * 
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         * 
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         * 
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */
        Wizard Merlin = new Wizard("");
        Warlock Saruman = new Warlock("");
        //display details for the wizard character
        System.out.println("**********************************************************************");
        System.out.println("---- WIZARD ----");
        Merlin.display();
        Merlin.stats();
        System.out.println("-----Spells-----");
        System.out.println("Fire Storm (Damage = -50) (Mana Cost = -100)");
        System.out.println("Fire Cannon (Damage = -40) (Mana Cost = -50)");
        System.out.println("Fire Heal (Additional Health = +20) (Additional Mana = +15)");
        System.out.println("**********************************************************************");

        //display details for the warlock character
        System.out.println("---- WARLOCK ----");
        Saruman.display();
        Saruman.stats();
        System.out.println("------Spells------");
        System.out.println("Ice Tornado (Damage = -50) (Mana Cost = -100)");
        System.out.println("Ice Meteor (Damage = -45) (Mana Cost = -60)");
        System.out.println("Ice Heal (Additional Health = +20) (Additional Mana = +15)");
        System.out.println("**********************************************************************");

        //sequence of the attacks of the both characters
        System.out.println("--------3---------");
        System.out.println("--------2---------");
        System.out.println("--------1---------");
        System.out.println("------FIGHT-------");
        System.out.println("------------------");
        Merlin.fireStorm(Saruman);
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Saruman.Icemeteor(Merlin);
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Merlin.fireCannon(Saruman);
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Saruman.iceheal(Saruman);
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Saruman.Icetornado(Merlin);
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Merlin.fireheal(Merlin);
        System.out.println("--------------------");
        Merlin.display();
        Merlin.stats();
        System.out.println("--------------------");
        Saruman.display();
        Saruman.stats();
        System.out.println("--------------------");
        Merlin.fireCannon(Saruman);
        System.out.println("--------------------");
        System.out.println("--------------------");
        Merlin.display();
        Merlin.increaselevel();
        System.out.println("--------------------");
    }
}//end of main method