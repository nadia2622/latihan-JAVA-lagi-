import java.util.Arrays;
public class Latihan {
    public static void main(String[] args) {
        System.out.println("\nKunci jawaban dari bang faqihza\n \n");
        
        int[] arrA = {7,1,8,4,5,9};
        int[] arrB = {1,3,5,7,9,0};
        
        // penjumlahan antara 2 array
        System.out.println("\n===== Penjumlahan array =====");
        int[] arrayHasil = tambahArr(arrA, arrB);
        printArray(arrA, "array 1");
        printArray(arrB, "array 2");
        printArray(arrayHasil, "hasil jumlah adalah");
        
        // menggabungkan 2 data array
        System.out.println("\n===== Penggabungan array =====");
        int[] arrayHasil2 = new int[arrA.length + arrB.length];
        for(int i = 0; i < arrA.length; i++){
            arrayHasil2[i] = arrA[i];
        }
        
        for(int i = 0; i < arrA.length; i++){
            arrayHasil2[i + arrA.length] = arrB[i];
        }
        printArray(arrA, "array 1");
        printArray(arrB, "array 2");
        printArray(arrayHasil2, "hasil gabungan adalah");
        
        // Reverse Sorting
        System.out.println("\n===== Reverse Sorting =====");
        printArray(arrA, "array 1");
        Arrays.sort(arrA);
        printArray(arrA, "sorted");
        
        int[] arrayBuffer = Arrays.copyOf(arrA, arrA.length);
        
        for (int i=0; i<arrA.length; i++){
            arrA[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
        printArray(arrA, "Reverse sorted");

        // versi ke 2 dari reverse 
        printArray(arrB, "versi 2");
        reverse2(arrB);
        printArray(arrB, "hasil versi 2");
    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for(int i=0; i < dataArray.length/2;i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] dataArr){
        Arrays.sort(dataArr);
        int[] arrayBuffer = Arrays.copyOf(dataArr, dataArr.length);
        
        for (int i=0; i<dataArr.length; i++){
            dataArr[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    
    private static int[] tambahArr(int[] arrInt1, int[] arrInt2){
        int[] arrayHasil = new int[arrInt1.length];
        for(int i = 0; i< arrInt1.length; i++){
            arrayHasil[i] = arrInt1[i] + arrInt2[i];
        }
        return arrayHasil;

    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message +" = " + Arrays.toString(dataArray));
    }
    
}
