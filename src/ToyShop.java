import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;


public class ToyShop {
    private int toysQuantity;
    Comparator<Toy> comparator = new Comparator<Toy>() {
        @Override
        public int compare(Toy o1, Toy o2) {
            return Integer.compare(o1.getFrequency(), o2.getFrequency());
        }
    };
    PriorityQueue<Toy> pq = new PriorityQueue<Toy>(comparator);

    /**
     * Java class Toy Shop constructor
     */
    public ToyShop() {
        toysQuantity = 0;
    }

    /**
     * Java class Toy Shop method
     * @param toy A toy you want to put in the shop prize pool
     */
    public void put(Toy toy){
            pq.add(toy);
            toysQuantity += 1;

    }

    /**
     * Java class Toy Shop method
     * @param filePath Path to the file where prizes will be printed
     */
    public void getToy(String filePath){
        String prize = pq.poll().toString();

        try (FileWriter fw = new FileWriter(filePath, true)){
            fw.append(prize);
            fw.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    /**
     * Java class Toy Shop method
     * @return Quantity of toys in the shop's prize pool
     */
    public int getToysQuantity() {
        return toysQuantity;
    }
}
