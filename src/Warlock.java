public class Warlock extends Character{
    Warlock(String name){
        super(name="Aurora");
    }

    //spell or power of the character
    public void Icetornado(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Ice Tornado(Damage - 50) (Mana Cost - 100)");
        int damagePoints = 50;
        int lessmana = 100;
       
        damageTarget(enemyCharacter, damagePoints,lessmana);
     
    }
    //2nd spell or power for the character
    public void Icemeteor(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Ice Meteor (Damage - 45) (Mana Cost - 60)");
        int damagePoints = 45;
        int lessmana = 60;
       
        damageTarget(enemyCharacter, damagePoints,lessmana);
     
    }
    
    //healing spell of the character
    public void iceheal(Character selfcharacter){
        System.out.println(super.characterName + " uses Iceheal"+ " additional health = +20 additional mana = +15");
        int health = 20;
        int mana = 15;
        healing(selfcharacter, health, mana);

    }
}