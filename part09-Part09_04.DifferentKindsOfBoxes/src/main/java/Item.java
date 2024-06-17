import java.util.Objects;

public class Item{

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return  Objects.equals(name, item.name);
    }

    @Override
    public int hashCode(){
        int result = 17;
        if (name != null){
            result = 31 * result + name.hashCode();
        }
        return result;

    }



    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
