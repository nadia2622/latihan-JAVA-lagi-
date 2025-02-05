import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        
        int arrAngka[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arrAngka));

        // pake looping standar
        for(int i = 0; i < arrAngka.length; i++) {
            System.out.println("index ke- " + i + " adalah = " + arrAngka[i]);
        }

        // looping khususon untuk collection arr
        System.out.println("looping for each");
        for(int angka : arrAngka) {
            System.out.println("angka pada looping ini = " + angka);
        }

        

    }
    
}
