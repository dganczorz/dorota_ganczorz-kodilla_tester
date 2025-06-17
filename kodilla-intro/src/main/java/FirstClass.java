public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(800, 1000, 2024);
        Notebook someNotebook = new Notebook(600, 900, 2024);
        Notebook greenNotebook = new Notebook(600, 1600, 2000);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2005);
        Notebook oldNotebook = new Notebook(1600, 500, 1993);
        Notebook blackNotebook = new Notebook(1200, 600, 1993);
        Notebook expensiveOldNotebook = new Notebook(1200, 2000, 2023);

        notebookParameters(notebook);
        notebookParameters(someNotebook);
        notebookParameters(greenNotebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
        notebookParameters(blackNotebook);
        notebookParameters(expensiveOldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println("notebook.weight: " + notebook.weight + " " + "notebook.price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProduct();
    }
}