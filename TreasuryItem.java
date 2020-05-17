import java.util.ArrayList;

public class TreasuryItem {
    
    private int rateEffectItemPotionHP__TreasuryItem;
    private int rateEffectItemPotionMP_TreasuryItem;
    private int rateEffectItemMixBerry_TreasuryItem;
    private int rateEffectItemBerry_TreasuryItem;
    private int rateEffectItemPokemonRankS_Card_TreasuryItem;
    private int rateEffectItemPokemonRankA_Card_TreasuryItem;
    private int rateEffectItemPokemonRankB_Card_TreasuryItem;
    private int rateEffectItemPokemonRankC_Card_TreasuryItem;
    private DataUser data_TreasuryItem;

    private Item itemMixBerry_TreasuryItem;
    private Item itemBerry_TreasuryItem;
    private Item itemPotionHP_TreasuryItem;
    private Item itemPotionMP_TreasuryItem;

    private Item itemPokemonRankS_Card_TreasuryItem;
    private Item itemPokemonRankA_Card_TreasuryItem;
    private Item itemPokemonRankB_Card_TreasuryItem;
    private Item itemPokemonRankC_Card_TreasuryItem;


    private String nameItemMixBerry_TreasuryItem;
    private String nameItemBerry_TreasuryItem;
    private String nameItemPotionHP_TreasuryItem;
    private String nameItemPotionMP_TreasuryItem;
    private int pokeBall;

    private String nameItemPokemonRankS_Card_TreasuryItem;
    private String nameItemPokemonRankA_Card_TreasuryItem;
    private String nameItemPokemonRankB_Card_TreasuryItem;
    private String nameItemPokemonRankC_Card_TreasuryItem;

    public TreasuryItem(DataUser data) {
        this.rateEffectItemBerry_TreasuryItem = 20;
        this.rateEffectItemMixBerry_TreasuryItem = 25;
        this.rateEffectItemPotionHP__TreasuryItem = data.getPower()*2;
        this.rateEffectItemPotionMP_TreasuryItem = data.getPower()*3;
        this.rateEffectItemPokemonRankS_Card_TreasuryItem = 500*4;
        this.rateEffectItemPokemonRankA_Card_TreasuryItem = 500*3;
        this.rateEffectItemPokemonRankB_Card_TreasuryItem = 500*2;
        this.rateEffectItemPokemonRankC_Card_TreasuryItem = 500*1;

        this.nameItemMixBerry_TreasuryItem = "MixBerry";
        this.nameItemBerry_TreasuryItem = "Berry";
        this.nameItemPotionHP_TreasuryItem = "PotionHP";
        this.nameItemPotionMP_TreasuryItem = "PotionMP";
        this.pokeBall = data.getPokeBall();
        this.nameItemPokemonRankS_Card_TreasuryItem = "PokemonRankS_Card";
        this.nameItemPokemonRankA_Card_TreasuryItem = "PokemonRankA_Card";
        this.nameItemPokemonRankB_Card_TreasuryItem = "PokemonRankB_Card";
        this.nameItemPokemonRankC_Card_TreasuryItem = "PokemonRankC_Card";

        itemMixBerry_TreasuryItem = new Item(nameItemMixBerry_TreasuryItem, rateEffectItemMixBerry_TreasuryItem);
        itemBerry_TreasuryItem = new Item(nameItemBerry_TreasuryItem, rateEffectItemBerry_TreasuryItem);
        itemPotionHP_TreasuryItem = new Item(nameItemPotionHP_TreasuryItem, rateEffectItemPotionHP__TreasuryItem);
        itemPotionMP_TreasuryItem = new Item(nameItemPotionMP_TreasuryItem, rateEffectItemPotionMP_TreasuryItem);

        itemPokemonRankS_Card_TreasuryItem = new Item(nameItemPokemonRankS_Card_TreasuryItem, rateEffectItemPokemonRankS_Card_TreasuryItem);
        itemPokemonRankA_Card_TreasuryItem = new Item(nameItemPokemonRankA_Card_TreasuryItem, rateEffectItemPokemonRankA_Card_TreasuryItem);
        itemPokemonRankB_Card_TreasuryItem= new Item(nameItemPokemonRankB_Card_TreasuryItem, rateEffectItemPokemonRankB_Card_TreasuryItem);
        itemPokemonRankC_Card_TreasuryItem= new Item(nameItemPokemonRankC_Card_TreasuryItem, rateEffectItemPokemonRankC_Card_TreasuryItem);

        data_TreasuryItem = data;

    }

    public void effectPotionHP() {

        data_TreasuryItem.setPotionHP(data_TreasuryItem.getPotionHP()-1);
        int maxHP = data_TreasuryItem.getMaxHP();
        int HP = data_TreasuryItem.getHP() + rateEffectItemPotionHP__TreasuryItem;;

        if(HP >= maxHP) {
            data_TreasuryItem.setHP(maxHP);
        }
            data_TreasuryItem.setHP(HP);
        

    }

    public void effectPotionMP() {

        data_TreasuryItem.setPotionMP(data_TreasuryItem.getPotionMP() - 1);

        int maxMP = data_TreasuryItem.getMaxMP();
        int MP = data_TreasuryItem.getMP() + rateEffectItemPotionMP_TreasuryItem;;

        if(MP >= maxMP) {
            data_TreasuryItem.setMP(maxMP);
        }
            data_TreasuryItem.setMP(MP);


    }

    public void effectBerry() {
        // UpgratePower
        data_TreasuryItem.setBerry(data_TreasuryItem.getBerry() - 1);

        int power = (int)(data_TreasuryItem.getPower()) + (rateEffectItemBerry_TreasuryItem);
        data_TreasuryItem.setPower(power);
        data_TreasuryItem.upEXP(250);
        if(data_TreasuryItem.levelUp() == true) {
            data_TreasuryItem.maxStatus(data_TreasuryItem.getPower(), data_TreasuryItem.getLevel());
        }


    }
    
    public void effectMixBerry() {
        //UpgratePower
        data_TreasuryItem.setMixBerry(data_TreasuryItem.getMixBerry() - 1);

        int power = (int)(data_TreasuryItem.getPower()) + (rateEffectItemMixBerry_TreasuryItem);
        data_TreasuryItem.setPower(power);
        
        data_TreasuryItem.upEXP(500);
        if (data_TreasuryItem.levelUp() == true) {
            data_TreasuryItem.maxStatus(data_TreasuryItem.getPower(), data_TreasuryItem.getLevel());
        }
    }

    public void effectCardS() {

        data_TreasuryItem.upEXP(rateEffectItemPokemonRankS_Card_TreasuryItem);

    }

    public void effectCardA() {

        data_TreasuryItem.upEXP(rateEffectItemPokemonRankA_Card_TreasuryItem);

    }
    public void effectCardB() {

        data_TreasuryItem.upEXP(rateEffectItemPokemonRankB_Card_TreasuryItem);

    }
    public void effectCardC() {

        data_TreasuryItem.upEXP(rateEffectItemPokemonRankC_Card_TreasuryItem);

    }

    public Item getItemBerry() {
        return itemBerry_TreasuryItem;

    }

    public Item getItemMixBerry() {
        return itemMixBerry_TreasuryItem;

    }

    public Item getItemPotionHP() {
        return itemPotionHP_TreasuryItem;

    }

    public Item getItemPotionMP() {
        return itemPotionMP_TreasuryItem;

    }

    public Item getItemPokemonRankS_Card() {
        return itemPokemonRankS_Card_TreasuryItem;

    }

    public Item getItemPokemonRankA_Card() {
        return itemPokemonRankA_Card_TreasuryItem;

    }

    public Item getItemPokemonRankB_Card() {
        return itemPokemonRankB_Card_TreasuryItem;

    }

    public Item getItemPokemonRankC_Card() {
        return itemPokemonRankC_Card_TreasuryItem;

    }

    public int getPokeBall() {
        return pokeBall;
    }

    public int getRateMixBerry() {
        return this.rateEffectItemMixBerry_TreasuryItem;

    }

    public int getRateBerry() {
        return this.rateEffectItemBerry_TreasuryItem;

    }

    public int getRatePotionHP() {
        return this.rateEffectItemPotionHP__TreasuryItem;

    }

    public int getRatePotionMP() {
        return this.rateEffectItemPotionMP_TreasuryItem;

    }


}