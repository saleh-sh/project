import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private final String name;
    private int soldiers;

    private ArrayList<Integer> conqueredLands;
   // private HashMap<String, Continent> conqueredCont;

    public Player(String name, int soldiers) {
        this.name = name;
        this.soldiers = soldiers;
        conqueredLands = new ArrayList<>();
       // conqueredCont = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void increaseSoldiers(int soldiers) {
        this.soldiers += soldiers;
    }

    public void decreaseSoldiers(int soldiers) {
        this.soldiers -= soldiers;
    }

    public void addLand(int id) {
        this.conqueredLands.add(id);
    }

    /*public void addLand(ArrayList<Land> lands) {

        for (Land land : lands) {
            this.conqueredLands.put(land.getName(), land);
        }
    }*/

    public void removeLand(String landName) {
        this.conqueredLands.remove(landName);
    }

  /*  public void addContinent(Continent continent) {

        this.conqueredCont.put(continent.getName(), continent);
    }*/

   /* public void removeContinent(String continentName) {
        this.conqueredCont.remove(continentName);
    }*/

   /* public ArrayList<Land> getOwnedLand() {
        return new ArrayList<Land>(conqueredLands.values());
    }*/

    public ArrayList<Integer> getConqueredLands() {
        return conqueredLands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

