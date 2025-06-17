public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(800, 1000, 2024);
        System.out.println("notebook.weight: " + notebook.weight + " " + "notebook.price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProduct();

        Notebook someNotebook = new Notebook(600, 900, 2024);
        System.out.println("notebook.weight: " + someNotebook.weight + " " + "notebook.price: " + someNotebook.price);
        someNotebook.checkPrice();
        someNotebook.checkWeight();
        someNotebook.checkProduct();

        Notebook greenNotebook = new Notebook(600, 1600, 2000);
        System.out.println("notebook.weight: " + greenNotebook.weight + " " + "notebook.price: " + greenNotebook.price);
        greenNotebook.checkPrice();
        greenNotebook.checkWeight();
        greenNotebook.checkProduct();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2005);
        System.out.println("notebook.weight: " + heavyNotebook.weight + " " + "notebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkProduct();

        Notebook oldNotebook = new Notebook(1600, 500, 1993);
        System.out.println("notebook.weight: " + oldNotebook.weight + " " + "notebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkProduct();

        Notebook blackNotebook = new Notebook(1200, 600, 1993);
        System.out.println("notebook.weight: " + blackNotebook.weight + " " + "notebook.price: " + blackNotebook.price);
        blackNotebook.checkPrice();
        blackNotebook.checkWeight();
        blackNotebook.checkProduct();

        Notebook expensiveOldNotebook = new Notebook(1200, 2000, 2023);
        System.out.println("notebook.weight: " + expensiveOldNotebook.weight + " " + "notebook.price: " + expensiveOldNotebook.price);
        expensiveOldNotebook.checkPrice();
        expensiveOldNotebook.checkWeight();
        expensiveOldNotebook.checkProduct();
    }
}