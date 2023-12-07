import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(array[i] + " - " + (count + 1) + " раза");
            }
        }
    }
}


