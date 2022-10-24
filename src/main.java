/**
* @author Mustafa Melih TÜFEKCİOĞLU b191210004 mustafa.tufekcioglu@ogr.sakarya.edu.tr
* 		  Enes KAYRİ b191210386 enes.kayri@ogr.sakarya.edu.tr	
* 		  Yağız UÇAR g191210382 yagiz.ucar1@ogr.sakarya.edu.tr
* 
* @since 19.08.2022
*/

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        
        System.out.print("Boyut giriniz: ");
        int size=In.nextInt();
       
        CreateMatrix matrix=new CreateMatrix(size);
        
        System.out.println("Result:");
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(matrix.matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}