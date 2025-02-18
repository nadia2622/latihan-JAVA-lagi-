import java.util.Arrays;
public class arrMultiDimensi {
    public static void main(String[] args) {
        System.out.println("\n======= Belajar Array Multidimensi =======\n");
        
        // Cara membuat Array 2 dimensi dengan assignment
        System.out.println("\n======= Dengan Assignment =======\n");
        int [][] array_2d = {{1,2} , {3,4}};
        printArray2D(array_2d);
        
        
        // Cara membuat Array 2 dimensi dengan deklarasi
        // System.out.println("\n\n======= Dengan Deklarasi =======\n");
        // // kayak ordo matrix. int[baris][kolom]
        // int [][] arrA = new int[5][4];
        // printArray2D(arrA);

        // // looping lengkap secara manual
        // System.out.println("pake looping manual");
        // for(int i=0; i< arrA.length; i++) { //loop baris
        //     System.out.print("[");        //loop kolom
        //     for(int j=0; j < arrA[i].length; j++){
        //         System.out.print(arrA[i][j] + ",");
        //     }
        //     System.out.print("]\n");
        // }
        
        // // looping pake for each
        // System.out.println("pake for each");
        // for(int[] baris : arrA){
        //     System.out.print("[");
        //     for(int angka : baris){
        //         System.out.print(angka + ",");
        //     }
        //     System.out.print("]\n");
        // }

        int[][] array_2d_2 = {
            {1,2,3,4,5,},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        printArray2D(array_2d_2);   

        int[][] ragged ={
            {1,2,3,4},
            {5,7},
            {9,8,7,6,5,4,3}
        };
        printArray2D(ragged);
    }
    
    private static void printArray2D(int[][] dataArray){
        for(int i=0; i< dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
        

    }
}
