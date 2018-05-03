/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepractico;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ClasePractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int m,n;
        System.out.print("Ingrese cantidad de filas: ");
        n=numero.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        m=numero.nextInt();
        String mat[][];
        mat = new String[n][m];
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
            {
                System.out.println("matriz ingrese valores a agregar");
                mat[i][j] = numero.next();
                
            }
        for(i=0;i<n;i++)
        {
            System.out.println();
            for(j=0;j<m;j++)
            {
                String matriz = mat[i][j]; 
                System.out.print(matriz);
            }
        }
        int acu = 0;
        int mat2[][];
        mat2 = new int[n][m];
        
       
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
            {
                String mina = "*"; 
                if(mat[i][j] == mina && j == 0)
                {
                    mat2[i][j+1]+=acu;
                }
                else if(mat[i][j]== mina && j!=0)
                {
                    mat[i][j-1]+=acu;
                    mat[i][j+1]+=acu;
                
                }
                else if(mat[i][j] == mina && j == m-1)
                {
                    mat[i][j-1]+=acu;
                
                }
            
            }
               
        for(i=0;i<n;i++)
        {
            System.out.println();
            for(j=0;j<m;j++)
            {
                int matriz = mat2[i][j]; 
                System.out.print(matriz);
            }
        }
        
        // TODO code application logic here
    }
    
}
