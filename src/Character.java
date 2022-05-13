
public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        characterName = name;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    //method to display the character name
    public void display(){
        System.out.println("Character Initialized: "+characterName); 
       
    }   
    //method to display the level, health, and mana of the character
    public void stats(){
        System.out.println("Level: "+level); 
        System.out.println("Health: "+healthPoints); 
        System.out.println("Mana: "+manaPoints); 
    }
    //method for increasing the level
    public void increaselevel(){
        int addlevel = level+10;
        System.out.println(characterName+ " Level is increased by 10");
        System.out.println(characterName+ " Level: " +addlevel);
        System.out.println("------------------------------");
        System.out.println("Character Initialized: "+characterName);
        System.out.println("Level: "+addlevel); 
        System.out.println("Health: "+healthPoints); 
        System.out.println("Mana: "+manaPoints); 
        System.out.println("------------------------------");

    }
   
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int mana){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        manaPoints -= mana;
        System.out.println(enemyCharacter.characterName+" Health Left = " + enemyCharacter.healthPoints);
        System.out.println(characterName+ " Mana Left = " +manaPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

         //if enemy character health is 0 or below
         //the enemy character defeated
        if (enemyCharacter.healthPoints <= 0){
            System.out.println(enemyCharacter.characterName+" has no health remaining to continue to fight....");
            System.out.println(enemyCharacter.characterName+" DEFEATED");
            System.out.println("**********************");
            System.out.println(characterName+" WINS");
            System.out.println("**********************");
        }
    }

    //method of casting heal spells for the characters
    public void healing(Character selfCharacter, int health, int mana ){
                healthPoints += health;
                manaPoints += mana;
                System.out.println(characterName+" is Healing.......");
                System.out.println(characterName+" Health = " +healthPoints);
                System.out.println(characterName+ " Mana = " +manaPoints);
        
    }
   

}