/**
* @author Mustafa Melih TÜFEKCİOĞLU b191210004 mustafa.tufekcioglu@ogr.sakarya.edu.tr
* 		  Enes KAYRİ b191210386 enes.kayri@ogr.sakarya.edu.tr	
* 		  Yağız UÇAR g191210382 yagiz.ucar1@ogr.sakarya.edu.tr
* 
* @since 19.08.2022
*/
class MatrixProduct extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrixResult;
    private int rig, col;
    private int dim;

    public MatrixProduct(int[][] A, int[][] B, int[][] C, int rig, int col, int dim_com) {
        this.matrix1 = A;
        this.matrix2 = B;
        this.matrixResult= C;
        this.rig = rig;
        this.col = col;
        this.dim = dim_com;
    }

    public void run() {
        for (int i = 0; i < dim; i++) {
        	matrixResult[rig][col] += matrix1[rig][i] * matrix2[i][col];
        }
        System.out.println("Thread " + rig + "," + col + " complete.");
    }
}