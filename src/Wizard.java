public class Wizard extends Character{
    Wizard(String name){
        super(name="Blazing Phoenix");
    }
    //spell of the character
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50) (Mana Cost - 100)");
        int damagePoints = 50;
        int lessmana = 100;
       
        damageTarget(enemyCharacter, damagePoints,lessmana);
     
    }
    //2nd spell of the character
    public void fireCannon(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Cannon (Damage - 40) (Mana Cost - 50)");
        int damagePoints = 40;
        int lessmana = 50;
       
        damageTarget(enemyCharacter, damagePoints,lessmana);
     
    }
    //healing spell of the character
    public void fireheal(Character selfcharacter){
        System.out.println(super.characterName + " uses fireheal"+ " additional health = +20 additional mana = +15");
        int health = 20;
        int mana = 15;
        healing(selfcharacter, health, mana);

    }
}
    
