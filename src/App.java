public class App {
    public static void main(String[] args) {
        ToyShop ts = new ToyShop();
        System.out.println(ts.pq);
        Toy toy1 = new Toy(1, "Car");
        Toy toy2 = new Toy(2, "Robot");
        Toy toy3 = new Toy(3, "Boll");
        ts.put(toy1);
        ts.put(toy2);
        ts.put(toy3);
        for (int i = 0; i < ts.getToysQuantity(); i++) {
            ts.getToy("prizes.txt");
        }
    }
}
