/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos_3;

/**
 *
 * @author juanj
 */
import java.util.Scanner;
public class multiplicacion_matrices {
    ///////////////////////////////
        public static void desplegarc(int c[][]){

            for (int i = 0; i < 2; i++) {
                System.out.println("");
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j]+" ");
                }
            }

}
    //////////////////////////////
       public static void desplegarb(int b[][]){

            for (int i = 0; i < 3; i++) {
                System.out.println("");
                for (int j = 0; j < 2; j++) {
                    System.out.print(b[i][j]+" ");
                }
            }

}
    ///////////////////////////////
      public static void desplegara(int a[][]){

            for (int i = 0; i < 2; i++) {
                System.out.println("");
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j]+" ");
                }
            }

}
    ///////////////////////////////
         public static void llenarmatrizb(int b[][]){
        
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("numero en la posicion " +i+" "+j);
                b[i][j]= sc.nextInt();
            }
        }
    }
      ////////////////////////////
    public static void llenarmatriza(int a[][]){
        
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("numero en la posicion " +i+" "+j);
                a[i][j]= sc.nextInt();
            }
        }
    }
    //////////////////////////
     public static void multiplicar(int a[][], int b[][]){
         int mult =0;
         int sum =0,d=0;
         
         int c[][] = new int [2][2];
         
             
       
          int x =0;
         for (int i = 0; i < 2; i++) {
//            
//             
//             if(x<2 ){
//                 x++;
//          c[i][x]=sum;
//          
//        
//                 System.out.println( "i "+i+ "x " + x );
//          
//             
//             
//             }
             sum=0;
             for (int j = 0; j < 3; j++) {
             mult = a[i][j]*b[j][i];    
             sum = sum + mult ;
                c[i][x]=sum;  
           
             }x++;
           
          
         }
         c[0][1]=(a[0][0]*b[0][1])+(a[0][1]*b[1][1]+(a[0][2])*b[2][1]);
         c[1][0]=(a[1][0]*b[0][0])+(a[1][1]*b[1][0])+(a[1][2]*b[2][0]);
         for (int i = 0; i < 2; i++) {
                System.out.println("");
                for (int j = 0; j < 2; j++) {
                    System.out.print(c[i][j]+" ");
                }
            }
         
          
}
    ///////////////////////////
    public static void main(String[] args) {
         int a[][] = new int [2][3];
          int b[][] = new int [3][2];
          llenarmatriza(a);
          llenarmatrizb(b);
          desplegara(a);
          System.out.println("");
             desplegarb(b);
             System.out.println("");
              multiplicar(a,b);
    }
}
