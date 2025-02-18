import java.util.Arrays;
public class latihanOperasiMatrix {
    public static void main(String[] args) {
        int[][] matrix_1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printArray2D(matrix_1);
        
        int[][] matrix_2 = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };
        printArray2D(matrix_2);
        
        System.out.println("penjumlahan");
        int[][] hasilTambah = penjumlahan(matrix_1, matrix_2);
        printArray2D(hasilTambah);
        
        
        
        System.out.println("perkalian");
        int[][] matrix_a = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] matrix_b = {
            {11,12},
            {13,14},
        };
        //Perkanlian Matrix
        int[][] hasilKali = perkalian(matrix_a, matrix_b);
        printArray2D(hasilKali);
    }
    
    private static int[][] perkalian(int[][] matrix_a, int[][] matrix_b){
        int baris_a = matrix_a.length;            // menjumlahkan 2 data aray
        int kolom_a = matrix_a[0].length;
    
        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
    
        // jika matrix a . b, maka jumlah baris akan ngikut matrix a, dan kolom ngikut matrix b
    
        int[][] hasil = new int[baris_a][kolom_b];
    
        int buffer;
        for(int i = 0; i < baris_a; i++){
            for(int j = 0; j < kolom_b; j++){
                buffer = 0;
                for(int k = 0; k < kolom_a; k++){
                    buffer += matrix_a[i][k] * matrix_b[k][j];
    
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;

    }
    private static int[][] penjumlahan(int[][] matrix_1, int[][] matrix_2){
        int baris_1 = matrix_1.length;            // menjumlahkan 2 data aray
        int kolom_1 = matrix_1[0].length;

        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;

        int[][] hasil = new int[baris_1][kolom_1];
        if (baris_1 == baris_2 && kolom_1 == kolom_2){
            for(int i = 0; i < baris_1; i++){
                for(int j = 0; j < kolom_1; j++){
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
            
        }
        else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }
    
        return hasil;

    }

    private static void printArray2D(int[][] dataArray){
        for(int i=0; i<dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
        System.out.println("\n");
    }
}
