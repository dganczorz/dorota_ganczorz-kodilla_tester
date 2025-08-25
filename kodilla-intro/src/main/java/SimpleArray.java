public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = {"skoda", "audi", "bmw", "fiat", "deawoo"};

        String car = cars[3];
        System.out.println(car);
        int numberOfElements = cars.length;
        System.out.println("Tablica zawiera "+ numberOfElements + " elementów");
    }
}
