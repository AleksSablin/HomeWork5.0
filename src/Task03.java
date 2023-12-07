public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] array ={ 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        int arr = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == arr) {
                count++;
            }
        }
        if (count == array.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
