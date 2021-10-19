import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] list1 = {{2, 3, 4},{5, 6, 4}};
        int[][] list2=new int[list1[0].length][list1.length];

        System.out.println("Matris : ");
        for(int i=0;i<list1.length;i++){
            for (int j=0;j<list1[0].length;j++){
                System.out.print(list1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for(int i=0;i<list1[0].length;i++){
            for (int j=0;j<list1.length;j++){
                System.out.print(list1[j][i]+" ");
            }
            System.out.println("");
        }





    }
}
