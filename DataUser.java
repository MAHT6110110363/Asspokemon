public class DataUser {
    // Status
    private String namePokemonOriginal_DataUser;
 /*   private String namePokemonRankS_DataUse;
    private String namePokemonRankA_DataUse;
    private String namePokemonRankB_DataUse;
    private String namePokemonRankC_DataUse;
*/
    private int h0;
    private int h1;
    private int h2;
    private int h3;


    private int HP_DataUser;
    private int ATK_DataUser;
    private int MP_DataUser;
    private int EXP_DataUser;
    private int level_DataUser;
    private int power_DataUser;
    private int stamina_DataUser;
/*
    private int HP_S_DataUser;
    private int ATK_S_DataUser;
    private int MP_S_DataUser;
    private int EXP_S_DataUser;
    private int level_S_DataUser;
    private int power_S_DataUser;
    private int stamina_S_DataUser;
    private int HP_A_DataUser;
    private int ATK_A_DataUser;
    private int MP_A_DataUser;
    private int EXP_A_DataUser;
    private int level_A_DataUser;
    private int power_A_DataUser;
    private int stamina_A_DataUser;
    private int HP_B_DataUser;
    private int ATK_B_DataUser;
    private int MP_B_DataUser;
    private int EXP_B_DataUser;
    private int level_B_DataUser;
    private int power_B_DataUser;
    private int stamina_B_DataUser;
    private int HP_C_DataUser;
    private int ATK_C_DataUser;
    private int MP_C_DataUser;
    private int EXP_C_DataUser;
    private int level_C_DataUser;
    private int power_C_DataUser;
    private int stamina_C_DataUser;*/


    //Status max
    private int maxHP_DataUser;
    private int maxATK_DataUser;
    private int maxMP_DataUser;
    private int maxEXP_DataUser;
    private int maxLevel_DataUser;
    private int maxStamina_DataUser;
/*
    private int maxHP_S_DataUser;
    private int maxATK_S_DataUser;
    private int maxMP_S_DataUser;
    private int maxEXP_S_DataUser;
    private int maxLevel_S_DataUser;
    private int maxStamina_S_DataUser;
    private int maxHP_A_DataUser;
    private int maxATK_A_DataUser;
    private int maxMP_A_DataUser;
    private int maxEXP_A_DataUser;
    private int maxLevel_A_DataUser;
    private int maxStamina_A_DataUser;
    private int maxHP_B_DataUser;
    private int maxATK_B_DataUser;
    private int maxMP_B_DataUser;
    private int maxEXP_B_DataUser;
    private int maxLevel_B_DataUser;
    private int maxStamina_B_DataUser;
    private int maxHP_C_DataUser;
    private int maxATK_C_DataUser;
    private int maxMP_C_DataUser;
    private int maxEXP_C_DataUser;
    private int maxLevel_C_DataUser;
    private int maxStamina_C_DataUser;*/

    // Catch for GUIPlace
    public int pokeBall_DataUser;
    public int mixBerry_DataUser;
    private int berry_DataUser;
    private int potionHP_DataUser;
    private int potionMP_DataUser;
    private int card_P1_DataUser;
    private int card_P2_DataUser;
    private int card_P3_DataUser;
    private int card_P4_DataUser;

    /*
    private int pokeBall_DataUser ;
    private Item mixBerry_DataUser;
    private Item berry_DataUser;
    private Item potionHP_DataUser;
    private Item potionMP_DataUser;
    private Item card_P1_DataUser;
    private Item card_P2_DataUser;
    private Item card_P3_DataUser;
    private Item card_P4_DataUser;
    */
    //SystemAnalysis

    public DataUser() { 

        this.level_DataUser = 1;
        this.power_DataUser = (int)(((double)Math.random())*50+100)*level_DataUser;
        this.stamina_DataUser = 100;
        this.HP_DataUser = (int)(this.power_DataUser*0.5+500*level_DataUser*1.5);
        this.MP_DataUser = (int)(this.power_DataUser*0.2+200*level_DataUser*1.5);
        this.ATK_DataUser = (int)(this.power_DataUser*0.3+100*level_DataUser*1.5);
        this.EXP_DataUser = 0;

        this.maxHP_DataUser = HP_DataUser;
        this.maxATK_DataUser = ATK_DataUser;
        this.maxMP_DataUser = MP_DataUser;
        this.maxEXP_DataUser = level_DataUser*500;
        this.maxLevel_DataUser = 25;
        this.maxStamina_DataUser = level_DataUser*100;


        //GUIPlace
        this.pokeBall_DataUser = 10;
        this.mixBerry_DataUser = 1;
        this.berry_DataUser = 1;
        this.potionHP_DataUser = 1;
        this.potionMP_DataUser = 1;
        this.card_P1_DataUser = 0;
        this.card_P2_DataUser = 0;
        this.card_P3_DataUser = 0;
        this.card_P4_DataUser = 0;

        this.h0 = 0;
        this.h1 = 0;
        this.h2 = 0;
        this.h3 = 0;


    }
/*
    public void statusStart() {
        this.level_DataUser = 1;
        this.power_DataUser = (int)(((double)Math.random())*50+100)*level_DataUser;
        this.stamina_DataUser = 5;
        this.HP_DataUser = (int)(this.power_DataUser*0.5+500*level_DataUser*1.5);
        this.MP_DataUser = (int)(this.power_DataUser*0.2+200*level_DataUser*1.5);
        this.ATK_DataUser = (int)(this.power_DataUser*0.3+100*level_DataUser*1.5);
        this.EXP_DataUser = 0;
        this.maxHP_DataUser = HP_DataUser;
        this.maxATK_DataUser = ATK_DataUser;
        this.maxMP_DataUser = MP_DataUser;
        this.maxEXP_DataUser = level_DataUser*500;
        this.maxLevel_DataUser = 25;
        this.maxStamina_DataUser = level_DataUser*100;
        this.pokeBall_DataUser = 10;
        this.mixBerry_DataUser = 1;
        this.berry_DataUser = 1;
        this.potionHP_DataUser = 1;
        this.potionMP_DataUser = 1;
        this.card_P1_DataUser = 0;
        this.card_P2_DataUser = 0;
        this.card_P3_DataUser = 0;
        this.card_P4_DataUser = 0;
        /*
        pokeBall_DataUser = 10;
        mixBerry_DataUser = new Item("MixBerry", 1);
        berry_DataUser = new Item("Berry", 1);
        potionHP_DataUser = new Item("PotionHP", 1);
        potionMP_DataUser = new Item("PotionMP", 1);
        card_P1_DataUser = new Item("PokemonRankS_Card", 0);
        card_P2_DataUser = new Item("PokemonRankA_Card", 0);
        card_P3_DataUser = new Item("PokemonRankB_Card", 0);
        card_P4_DataUser = new Item("PokemonRankC_Card", 0);
   } */

    public void maxStatus(int power, int level) {

        this.maxHP_DataUser =(int)((power*0.5+500)*level*1.5);
        this.maxATK_DataUser = (int)((power*0.3+100)*level*1.5);
        this.maxMP_DataUser = (int)((power*0.2+200)*level*1.5);
        this.maxEXP_DataUser = level*500;
        this.maxStamina_DataUser = level*100;

        this.HP_DataUser = maxHP_DataUser;
        this.ATK_DataUser = maxATK_DataUser;
        this.MP_DataUser = maxMP_DataUser;
        this.stamina_DataUser = maxStamina_DataUser;
    }

    public boolean levelUp() {

        if(EXP_DataUser >= maxEXP_DataUser && level_DataUser <= maxLevel_DataUser) {
            this.level_DataUser += 1;
            this.power_DataUser += level_DataUser*50+100; 
            return true;
        }
        return false;
    }



    //Set etc.
        //Name
    
    public void setNamePokemon01(String namePokemon) {
        this.namePokemonOriginal_DataUser = namePokemon;

    }

        //masStatus
    public void setMaxHP(int maxHP) {
        this.maxHP_DataUser = maxHP;
    }

    public void setMaxATK(int maxATK) {
        this.maxATK_DataUser = maxATK;
    }

    public void setMaxEXP(int maxEXP) {
        this.maxEXP_DataUser = maxEXP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP_DataUser = maxMP;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel_DataUser = maxLevel;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina_DataUser = maxStamina;

    }

        //Status
    public void setHP(int HP) {
        this.HP_DataUser = HP;
    }

    public void setATK(int ATK) {
        this.ATK_DataUser = ATK;
    }

    public void setEXP(int EXP) {
        this.EXP_DataUser = EXP;
    }
    public void upEXP(int EXP) {
        this.EXP_DataUser += EXP;
    }

    public void setPower(int power) {
        this.power_DataUser = power;
    }

    public void setMP(int MP) {
        this.MP_DataUser = MP;
    }

    public void setLevel(int level) {
        this.level_DataUser = level;
    }

    public void setStamina(int stamina) {
        this.stamina_DataUser = stamina;

    }

        //Item
/*
    public void setPokeBall(int pokeBall) {
        this.pokeBall_DataUser = pokeBall;
    }
    
    public void setMixBerry(int mixBerry) {
        mixBerry_DataUser = new Item("MixBerry", mixBerry);
    }
    public void setBerry(int berry) {
        berry_DataUser = new Item("Berry", berry);
    }
    public void setPotionHP(int potionHP) {
        potionHP_DataUser = new Item("PotionHP", potionHP);
    }    
    public void setPotionMP(int potionMP) {
        potionMP_DataUser = new Item("PotionMP", potionMP);
    }
    public void setCard_P1(int card_P1) {
        card_P1_DataUser = new Item("PokemonRankS_Card", card_P1);
    }
    public void setCard_P2(int card_P2) {
        card_P2_DataUser = new Item("PokemonRankA_Card", card_P2);
    }
    public void setCard_P3(int card_P3) {
        card_P3_DataUser = new Item("PokemonRankB_Card", card_P3);
    }
    public void setCard_P4(int card_P4) {
        card_P4_DataUser = new Item("PokemonRankC_Card", card_P4);
    }
    */
    public void setPokeBall(int pokeBall) {
        this.pokeBall_DataUser = pokeBall;

    }
    

    public void setMixBerry(int mixBerry) {
        this.mixBerry_DataUser = mixBerry;
        if(this.mixBerry_DataUser <= 0) {
            this.mixBerry_DataUser = 0;
        }

    }

    public void setBerry(int berry) {
        this.berry_DataUser = berry;
        if(berry_DataUser <= 0) {
            this.berry_DataUser = 0;
        }

    }

    public void setPotionHP(int potionHP) {
        this.potionHP_DataUser = potionHP;
        if(potionHP_DataUser <= 0){
            potionHP_DataUser = 0;
        }

    }    

    public void setPotionMP(int potionMP) {
        this.potionMP_DataUser = potionMP;
        if(potionMP_DataUser <= 0) {
            potionMP_DataUser = 0;
        }

    }

    public void setCard_P1(int card_P1) {
        this.card_P1_DataUser = card_P1;
        if(card_P1_DataUser <= 0) {
            card_P1_DataUser = 0;
        }

    }

    public void setCard_P2(int card_P2) {
        this.card_P2_DataUser = card_P2;
        if(card_P2_DataUser <= 0) {
            card_P2_DataUser = 0;
        }

    }

    public void setCard_P3(int card_P3) {
        this.card_P3_DataUser = card_P3;
        if(card_P3_DataUser <= 0) {
            card_P3_DataUser = 0;
        }

    }

    public void setCard_P4(int card_P4) {
        this.card_P4_DataUser = card_P4;
        if(card_P4_DataUser <= 0) {
            card_P4_DataUser = 0;
        }

    }

    //Get etc.
        //Name
    
    public String getNamePokemon01() {
        return namePokemonOriginal_DataUser;

    }

        //maxStatus
    public int getMaxHP() {
        return maxHP_DataUser;
    }

    public int getMaxATK() {
        return maxATK_DataUser;
    }

    public int getMaxEXP() {
        return maxEXP_DataUser;
    }

    public int getMaxMP() {
        return maxMP_DataUser;
    }

    public int getMaxLevel() {
        return maxLevel_DataUser;
    }

    public int getMaxStamina() {
        return maxStamina_DataUser;

    }
    public int getHP() {
        return HP_DataUser ;

    }

    public int getATK() {
        return ATK_DataUser ;

    }

    public int getEXP() {
        return EXP_DataUser;

    }

    public int getPower() {
        return power_DataUser;

    }

    public int getMP() {
        return MP_DataUser;
    }

    public int getLevel() {
        return level_DataUser;
    }

    public int getStamina() {
        return stamina_DataUser;
    }
        //Item

    public int getPokeBall() {
        return pokeBall_DataUser;
    }

    public int getMixBerry() {
        return mixBerry_DataUser;
    }

    public int getBerry() {
        return berry_DataUser;
    }

    public int getPotionHP() {
        return potionHP_DataUser;
    }

    public int getPotionMP() {
        return potionMP_DataUser;
    }

    public int getCard_P1() {
        return card_P1_DataUser;
    }

    public int getCard_P2() {
        return card_P2_DataUser;
    }

    public int getCard_P3() {
        return card_P3_DataUser;
    }

    public int getCard_P4() {
        return card_P4_DataUser;
    }

    public int geth0() {
        return h0;
    }
    public int geth1() {
        return h1;
    }
    public int geth2() {
        return h2;
    }
    public int geth3() {
        return h3;
    }

    public void seth0() {
        this.h0 = 1;
    }
    public void seth1() {
        this.h1 = 1;
    }
    public void seth2() {
        this.h2 = 1;
    }
    public void seth3() {
        this.h3 = 1;
    }



}