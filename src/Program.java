import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        /*
        1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        */
//        System.out.println(divide_1(10, 0));
//
//        System.out.println(divide_2(10, 0));
//
//        System.out.println(divide_3(10, 0));

        /*
        2) Реализуйте метод, принимающий в качестве аргументов два целочисленных
        массива, и возвращающий новый массив, каждый элемент которого равен разности
        элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
        необходимо как-то оповестить пользователя.
         */

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 1, 0, 1};
        System.out.println(Arrays.toString(method(array1, array2)));

    }
    public static int divide_1(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    public static int divide_2(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя");
        }
        return a / b;
    }

    public static int divide_3(int a, int b) {
        return a / b;
    }

    public static int[] method(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Разная длинна массивов!");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}
