import java.util.Scanner;

class main {
    public static void main(String[] args) {
        double arr1[] = new double[4];
        float arr[] = {1.1f, 2.3f, 4.7f, 7.5f};

        System.out.printf("배열 크기: %d\n", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.printf("arr[0] = %f ", arr1[0]);
        System.out.printf("arr[1] = %f ", arr1[1]);
        System.out.println("arr[3] = " + arr1[3]);
        System.out.printf("arr[2] = %f ", arr1[2]);
        System.out.printf("arr[3] = %f ", arr1[3]);


    }
}
