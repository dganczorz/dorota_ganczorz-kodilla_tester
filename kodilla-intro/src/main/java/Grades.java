public class Grades {
    private int[] grades;
    private int size;

    public Grades() { // konstruktor klasy
        this.grades = new int[10]; // nowa tablica o długości 10
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10 || value < 1 || value > 6) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastAdded() {
        return this.grades[this.size-1];
    }

    public int getGradeAtPosition(int index) {
        return this.grades[index];
    }

    public int getAverage() {
        if (this.size == 0) {
            System.out.println("Do not divide by 0");
        }
        int sum = 0;
        for (int i=0; i < this.size; i++) {
            sum+= this.grades[i];
        }
        return sum / this.size;
    }

    public static void main(String[] args) {
        Grades myGrades = new Grades();
        myGrades.add(0);
        myGrades.add(7);
        myGrades.add(5);
        myGrades.add(1);
        myGrades.add(4);
        myGrades.add(5);
        myGrades.add(4);
        myGrades.add(2);
        myGrades.add(6);
        myGrades.add(3);
        myGrades.add(5);
        myGrades.add(4);
        myGrades.add(3);
        myGrades.add(1);

        System.out.println(myGrades.getGradeAtPosition(0));
        System.out.println(myGrades.getGradeAtPosition(1));
        System.out.println("Last added grade is: " + myGrades.getLastAdded());
        System.out.println("Average grade: " + myGrades.getAverage());
    }
}

