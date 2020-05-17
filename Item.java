import java.util.ArrayList;

public class Item {

    private String nameItem_Item;
    private int rateEffect_Item;

    public Item(String nameItem, int rateEffect) {
        this.nameItem_Item = nameItem;
        this.rateEffect_Item = rateEffect; 
    }

 /*
    public void setName(String nameItem) {
        this.nameItem_Item = nameItem; 
    }
*/

    public String getNameItem() {
        return nameItem_Item;
    }

    public int getRateEffectItem() {
        return rateEffect_Item;
    }


}