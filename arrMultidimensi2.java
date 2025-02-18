import java.util.Arrays;

public class arrMultidimensi2 {
    public static void main(String[] args) {
        int[][] arr_2d = {
            {1,2,3},
            {4,5,6},
        };

        System.out.println(arr_2d);
        System.out.println(Arrays.toString(arr_2d));
        System.out.println(arr_2d[0]);
        System.out.println(arr_2d[1]);
        System.out.println("\n");
        char[] arr_char1 = {'a', 'b', 'c'};
        char[] arr_char2 = {'d', 'e'};
        
        char[][] arr_char2d = {
            arr_char1,
            arr_char2
        };
        System.out.println(arr_char2d);
        System.out.println(Arrays.toString(arr_char2d));

        // array 2 dimensi bisa memiliki komponen yang berbeda
        // karena array adalah objek yang dapat memiliki referensi terpisah,
        // maka tiap baris bisa memiliki panjang yang berbeda.
    }
}
