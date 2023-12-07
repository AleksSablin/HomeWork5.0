import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(120)-70;
        }
        System.out.println(Arrays.toString(array));
        int max = -70;
        int min = 50;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число: " + min );
        System.out.println("Максимальное число: " + max);
    }
}
