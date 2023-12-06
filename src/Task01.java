public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] array = new int[15];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 15; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int arr : array) {
            if (arr % 2 == 0) {
                System.out.print(arr + "\t");
            }
        }
    }
}
