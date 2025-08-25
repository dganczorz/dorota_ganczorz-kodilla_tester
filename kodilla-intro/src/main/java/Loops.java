import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
        }

        int[] numbers = new int[] {2,3,4,5,1,25,4};
//        sum(numbers);
        System.out.println(getCountOfRandomNumber(25));

    }
    public static int sum(int[] numbers){
        int current = 0;
        for (int i = 0; i < numbers.length; i++) {
            current = current + numbers[i];
        }
        System.out.println("Sum equals: " + current);
        return current;
    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
