public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int[] array = {1,2,3,4,5,6,7,8,9};
        boolean valuesRepeated = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    valuesRepeated = true;
                    break;
                }
            }
            if (valuesRepeated)
            {
                break;
            }
        }
        if (valuesRepeated) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
