import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(copy));
    }
}
