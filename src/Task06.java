import java.util.Arrays;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(array));
        int[] uniqueValues = new int[array.length];
        int[] uniqueIndexes = new int[array.length];
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }if (isUnique) {
                uniqueValues[uniqueCount] = array[i];
                uniqueIndexes[uniqueCount] = i;
                uniqueCount++;
            }
        }
        System.out.println("Уникальные значения:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("Значение: " + uniqueValues[i] + ", Индекс: " + uniqueIndexes[i]);
        }
    }
}
