public class TreasuryPokeMe {
    private PokeMe rankS;
    private PokeMe rankA;
    private PokeMe rankB;
    private PokeMe rankC;
    private DataUser data_TreasuryPokeMe;

    private int rateEffectItemPotionHP_TreasuryPokeMe;
    private int rateEffectItemPotionMP_TreasuryPokeMe;
    private int rateEffectItemMixBerry_TreasuryPokeMe;
    private int rateEffectItemBerry_TreasuryPokeMe;
    private int rateEffectItemPokemonRankS_Card_TreasuryPokeMe;
    private int rateEffectItemPokemonRankA_Card_TreasuryPokeMe;
    private int rateEffectItemPokemonRankB_Card_TreasuryPokeMe;
    private int rateEffectItemPokemonRankC_Card_TreasuryPokeMe;

    public TreasuryPokeMe(PokemonS s, PokemonA a, PokemonB b, PokemonC c, DataUser data) {

/*
        private int rateEffectItemPotionHP_TreasuryPokeMe = 20;
        private int rateEffectItemPotionMP_TreasuryPokeMe = 25;
        private int rateEffectItemMixBerry_TreasuryPokeMe = data.getPower()*2;
        private int rateEffectItemBerry_TreasuryPokeMe = data.getPower()*3;
        private int rateEffectItemPokemonRankS_Card_TreasuryPokeMe = 500*4;
        private int rateEffectItemPokemonRankA_Card_TreasuryPokeMe = 500*3;
        private int rateEffectItemPokemonRankB_Card_TreasuryPokeMe = 500*2;
        private int rateEffectItemPokemonRankC_Card_TreasuryPokeMe = 500*1;
*/
        data_TreasuryPokeMe = data;
        s = new PokemonS();
        a = new PokemonA();
        b = new PokemonB();
        c = new PokemonC();

        s.upStatus(2500, 1500, 400);
        a.upStatus(2000, 1000, 300);
        b.upStatus(1500, 700, 250);
        c.upStatus(1000, 500, 200);

        rankS = new PokeMe("Smon", s);
        rankA = new PokeMe("Amon", a);
        rankB = new PokeMe("Bmon", b);
        rankC = new PokeMe("Cmon", c);
    

    }

    public PokeMe getRankS() {
        return rankS;
    }
    public PokeMe getRankA() {
        return rankA;
    }
    public PokeMe getRankB() {
        return rankB;
    }
    public PokeMe getRankC() {
        return rankC;
    }

    public void setRankS(PokeMe s) {
        this.rankS = s;
    }
    public void setRankA(PokeMe a) {
        this.rankA = a;
    }
    public void setRankB(PokeMe b) {
        this.rankB = b;
    }
    public void setRankC(PokeMe c) {
        this.rankC = c;
    }
        /*
    public void effectPotionHP(int i) {
        data_TreasuryPokeMe.setPotionHP(data_TreasuryPokeMe.getPotionHP()-1);
        int maxHP = data_TreasuryPokeMe;
        int HP = data_TreasuryPokeMe.getHP() + rateEffectItemPotionHP_TreasuryPokeMe;
        if(HP >= maxHP) {
            data_TreasuryPokeMe.setHP(maxHP);
        }
        else {
            data_TreasuryPokeMe.setHP(HP);
        }
        
    }
    public void effectPotionMP(int i) {
        data_TreasuryPokeMe.setPotionMP(data_TreasuryPokeMe.getPotionMP() - 1);
        int maxMP = data_TreasuryPokeMe();
        int MP = data_TreasuryPokeMe.getMP() + rateEffectItemPotionMP_TreasuryPokeMe;;
        if(MP >= maxMP) {
            data_TreasuryPokeMe.setMP(maxMP);
        }
        else {
            data_TreasuryPokeMe.setMP(MP);
        }
    }
    public void effectBerry() {
        // UpgratePower
        data_TreasuryPokeMe.setBerry(data_TreasuryPokeMe.getBerry() - 1);
        int power = (int)(data_TreasuryPokeMe.getPower()) + (rateEffectItemBerry_TreasuryPokeMe);
        data_TreasuryPokeMe.setPower(power);
        data_TreasuryPokeMe.upEXP(50);
    }
    
    public void effectMixBerry() {
        //UpgratePower
        data_TreasuryPokeMe.setMixBerry(data_TreasuryPokeMe.getMixBerry() - 1);
        int power = (int)(data_TreasuryPokeMe.getPower()) + (rateEffectItemMixBerry_TreasuryPokeMe);
        data_TreasuryPokeMe.setPower(power);
        
        data_TreasuryPokeMe.upEXP(100);
    }*/

}