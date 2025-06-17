public class Notebook {
    int weight; // class attribute
    int price;
    int year;

    public Notebook(int weight, int price, int year) { // constructor with argument passed in brackets
        this.weight = weight; // passing argument value from constructor to attribute
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) { // inside a class we use this
            System.out.println("This notebook is very cheap");
        } else if (this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) { // inside a class we use this
            System.out.println("This notebook is light");
        } else if (this.weight <= 1200) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkProduct() {
        if (this.price > 1500 && this.year > 2022) {
            System.out.println("Price is high but notebook is not that old");
        } else if (this.price < 1000 && this.year < 2000) {
            System.out.println("Cheaper but old, don't buy it!");
        } else {
            System.out.println("Product doesn't match any rule");
        }
    }
}