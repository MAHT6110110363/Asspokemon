import java.util.ArrayList;

public class BagUser {

    private int fullBag;
    private ArrayList<Item> items;
    private ArrayList<PokeMe> pokedex;
    

    public BagUser() {
        pokedex = new ArrayList<PokeMe>();
        items = new ArrayList<Item>();
        this.fullBag = 50;


    }
    
    public boolean addItem(Item item) {

        if(items.size() <= fullBag) {
            items.add(item);
            return true;
        }
        else {
            return false;
        }
    }

    public int inputCountItem(String itemName){

        int count = 0;
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            if(item.getNameItem().equals(itemName)){
                count++;
            }
        }
        return count;

    }

    public int findItem(String NameItem) {

        for (int i = 0; i < this.items.size(); i++) {
            Item item = items.get(i);
            if (item.getNameItem().equals(NameItem)) {
                return i;
            }
        } 
        return -1;

    }

    public void removeItem(int index){
        if(index >= 0 && index <= items.size()){
            items.remove(index);
        }
         
    }

    public ArrayList<Item> getItems() {
        return  items;
    }


    
    public boolean addPokedex(PokeMe allRank) {

        if(pokedex.size() <= 4) {
            pokedex.add(allRank);
            return true;
        }
        else {
            return false;
        }
    }

    public int inputCountPokedex(String namePokemon){

        int count = 0;
        for(int i = 0; i < pokedex.size(); i++){
            PokeMe pokeme = pokedex.get(i);
            if(pokeme.getNamePokemon().equals(namePokemon)){
                count++;
            }
        }
        return count;

    }
    public int findPokedex(String namePokeme) {

        for (int i = 0; i < this.pokedex.size(); i++) {
            PokeMe pokeme = pokedex.get(i);
            if (pokeme.getNamePokemon().equals(namePokeme)) {
                return i;
            }
        } 
        return -1;

    }

    public void removePokedex(int index){

        if(index >= 0 && index <= pokedex.size()){
            pokedex.remove(index);
        }
         
    }

    public ArrayList<PokeMe> getPokedex() {
        return  pokedex;
    }

    public int getFullBag() {
        return fullBag;
    }

}