public class PokeMe {
    private String namePokemon;
    private Pokemon statusPokemon;

    public PokeMe(String name, Pokemon status) {
        this.namePokemon = name;
        this.statusPokemon = status;

    }

    public String getNamePokemon() {
        return namePokemon;

    }

    public void setNamePokemon(String name) {

        this.namePokemon = name;
    }

    public Pokemon getStatusPokemon() {
        return statusPokemon;

    }
}