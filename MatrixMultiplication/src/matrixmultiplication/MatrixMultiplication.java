/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author nasrlk
 */
public class MatrixMultiplication {

   public static void main(String[] args) {
      int a[][] = new int[3][2];
      int b[][] = new int[2][3];
      int c[][] = new int[3][3];
      
      a[0][0] = 0;
      a[0][1] = 2;
      a[1][0] = 1;
      a[1][1] = 3;
      a[2][0] = 0;
      a[2][1] = 2;
      
      b[0][0] = 1;
      b[0][1] = 2;
      b[0][2] = 1;
      b[1][0] = 1;
      b[1][1] = 2;
      b[1][2] = 1;
      
      int sum;
      
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int k = 0; k < 2; k++) {
               sum = sum + a[i][k]*b[k][j];
               c[i][j] = sum;
            }
         }
      }
      System.out.println(" ");
      for (int i = 0; i < 3; i++) {
         System.out.println(c[i][0] + " " + c[i][1] + " " + c[i][2] + " ");
      }
      System.out.println(" ");
   }
}
