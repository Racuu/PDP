/**
* @author Mustafa Melih TÜFEKCİOĞLU b191210004 mustafa.tufekcioglu@ogr.sakarya.edu.tr
* 		  Enes KAYRİ b191210386 enes.kayri@ogr.sakarya.edu.tr	
* 		  Yağız UÇAR g191210382 yagiz.ucar1@ogr.sakarya.edu.tr
* 
* @since 19.08.2022
*/

import java.util.Random;

public class CreateMatrix {
	int size=0;
	int[][] matrix1;
    int[][] matrix2;
    int[][] matrixResult;
    Random rnd=new Random();
    
	public CreateMatrix(int _size) {
		this.size=_size;
		matrix1 = new int[size][size];
		matrix2 = new int[size][1];
		matrixResult =  new int[size][1];
		
		MatrixProduct[][] thrd = new MatrixProduct[size][1];

		
		for (int i = 0; i < size; i++) { 
            for (int j = 0; j < size; j++) {
              if(i==0&&j==0)
            	  matrix1[i][j]=0;
              
              else if(i==size-1&&j==size-1)
            	  matrix1[i][j]= (size*size)-1;
              
              else
            	  matrix1[i][j] = rnd.nextInt(10);
              
               System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println();
		for (int i = 0; i < size; i++) { 
            for (int j = 0; j < 1; j++) {
                
            	if(i==0&&j==0)
            		matrix2[i][j]=0;
            	else if(i==size-1&&j==0)
            		matrix2[i][j]= size-1;
                else
                	matrix2[i][j] = rnd.nextInt(10);
              System.out.print(matrix2[i][j]);
            }
           System.out.println();
        }
		
		 for (int i = 0; i < size; i++) {
	            for (int j = 0; j < 1; j++) {
	                thrd[i][j] = new MatrixProduct(matrix1, matrix2, matrixResult, i, j, size);
	                thrd[i][j].start();
	            }
	        }

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < 1; j++) {
	                try {
	                    thrd[i][j].join();
	                } catch (InterruptedException e) {
	                }
	            }
	        }
	}
}
