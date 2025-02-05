import java.util.Arrays;

public class passByReference {
    public static void main(String[] args) {
        
        int[] arrAngka = {1,2,3,4,5};
        int[] arrAngka2 = new int[5];
        
        arrAngka2 = arrAngka;
        System.out.println("arr 1 = " + Arrays.toString(arrAngka));
        System.out.println("arr 2 = " + Arrays.toString(arrAngka2));
    
        arrAngka[0] = 100;
        System.out.println("arr 1 = " + Arrays.toString(arrAngka));
        System.out.println("arr 2 = " + Arrays.toString(arrAngka2));
    }
    // method yang argumennya adalah reference, pass by reference
    // bukan pass by value

    private static void ubahArr(int [] dataArr) {
        dataArr[0] = 125;
        for(int data : dataArr) {
            System.out.println(data);
        }
    }
}