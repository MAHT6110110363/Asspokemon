import java.util.Scanner;

import javax.swing.*;



public abstract class Pokemon {

    //Scanner sc = new Scanner(System.in);
      // Status
    private String name;

    private int HP;
    private int ATK;
    private int MP;
    private int EXP;
    private int level;
    private int power;
    private int stamina;

   //Status max
    private int maxHP;
    private int maxATK;
    private int maxMP;
    private int maxEXP;
    private int maxLevel;
    private int maxStamina;
/*
    //Attribuite
    private String name;
        //w = Ways
    //private String w1;
        // hp = Health Point, mp = Mana Point
*/
    //DefaultConstructure
    public Pokemon(){
        // RankC
/*
        HP = 1000;
        ATK = 200;
        MP = 500;*/
        EXP = 0;
        level = 1;
        power = 150;
        stamina = 100;
        maxLevel = 25;
    
       //Status max
        maxHP = HP;
        maxATK = ATK;
        maxMP = MP;
        maxEXP = 500;
        maxStamina = 100;
    }

    public void upStatus(int HP, int MP, int ATK) {

        this.HP = HP;
        this.MP = MP;
        this.ATK = ATK;


    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }
    public void setMP(int MP) {
        this.MP = MP;
    }
    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

   //Status max
    public void setMaxHP(int maxHP) {
        this.maxHP = HP;
    }
    public void setMaxATK(int maxATK) {
        this.maxATK = maxATK;
    }
    public void setMaxMP(int maxHP) {
        this.maxMP = maxHP;
    }
    public void setMaxEXP(int maxEXP) {
        this.maxEXP = maxEXP;
    }
    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }
    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }


    
    public String getName() {
        return name;
    }
    
    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }
    public int getMP() {
        return MP;
    }
    public int getEXP() {
        return EXP;
    }

    public int getLevel() {
        return level;
    }
    public int getPower() {
        return power;
    }
    public int getStamina() {
        return stamina;
    }

   //Status max
    public int getMaxHP() {
        return maxHP;
    }
    public int getMaxATK() {
        return maxATK;
    }
    public int getMaxMP() {
        return maxMP;
    }
    public int getMaxEXP() {
        return maxEXP;
    }
    public int getMaxLevel() {
        return maxLevel;
    }
    public int getMaxStamina() {
        return maxStamina;
    }
    public void effectMixBerry() {
        //UpgratePower
        power += 20*3;
        
        EXP = EXP + 500;
        if(levelUp() == true) {
            maxStatus(power, level);
        }
    }

    public void effectBerry() {
        // UpgratePower
        this.power += 20*2 ;
        EXP = EXP+250;

        if(levelUp() == true) {
            maxStatus(power, level);
        }


    }

    public void effectPotionMP() {

        this.MP += power*2;
        if(MP >= maxMP) {
            MP = maxMP;
        }

    }

    public void effectPotionHP() {

        HP += power*2;

        if(HP >= maxHP) {
            HP = maxHP;
        }

    }

    public void maxStatus(int power, int level) {

        this.maxHP =(int)((power*0.5+500)*level*1.5);
        this.maxATK = (int)((power*0.3+100)*level*1.5);
        this.maxMP = (int)((power*0.2+200)*level*1.5);
        this.maxEXP = level*500;
        this.maxStamina = level*100;

        this.HP = maxHP;
        this.ATK = maxATK;
        this.MP = maxMP;
        this.stamina = maxStamina;
    }

    public boolean levelUp() {

        if(EXP >= maxEXP && level <= maxLevel) {
            this.level += 1;
            this.power += level*50+100; 
            return true;
        }
        return false;
    }

    // Method

        //----Behevier----
            //Set
/*
    public void setName() {
        //System.out.print("\n\n\t\t Enter Your name Pokemon Signature : ");
        this.name = sc.nextLine();
        //System.out.print("\n\n\n\n\n");
    }
    */
/*
    public void setStatus(int power) {
        this.HP = (int)(this.power*0.5+500);
        this.MP = (int)(this.power*0.2+200);
        this.ATK = (int)(this.power*0.3+100);
    }
*/
/*
            //Get
    public String getNamePokemon(){
        return name;
    }
*/

        
/*
    public int levelUp(int level){
    }
    public int pSleep(){
        return this.stamina = maxStamina;
    }
*/

        //All Display
/*
    public void displayStatus(){
         System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                            +"\n\t\t  Your Pokemon Name is "+this.name
                            +"\n\t\t    Level : "+this.level
                            +"\n\t\t    HP : "+this.hp
                            +"\n\t\t    MP : "+this.mp
                            +"\n\t\t    Power : "+this.power
                            +"\n\t\t    Stamina : "+this.stamina
                            +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
    public void displayFaceGame(){
        System.out.print("\n\t ************************************************************"
                            +"\n\t\t ===== WELLCOM TO POKEMONNI GAME =====");
    }
    public String displayWayToFunction(){
        System.out.print("\n\n\t ############################################################"
                        +"\n\t\t PokeHouse:(1)"
                        +"\n\t\t Go to Forest [CoE Garden]:(2)"
                        +"\n\t\t Show Your Pokemon Status:(3)"
                        +"\n\t\t Quit Game:(E)"
                        +"\n\n\t\t your ans : ");
        this.w1 = sc.nextLine();
        System.out.print("\n\n ############################################################\n\n\n\n\n");
        return this.w1;
    }
    // SystemAnalysis
    public void quitGame(){
        System.out.print("\n\t\t------------------------------------End Game------------------------------------"
                            +"\n\n\t\t\t\t To Player : Get to Read a Book Pai!!! ");
    }
*/
    

}