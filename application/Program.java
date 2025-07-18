package Matriz.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0; i< mat.length;i++){ // esse for "mat.length" percorrer as linhas  |
            for (int j=0; j< mat.length; j++){ //  esse for "mat.length" percorrer as colunas  ->
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for (int i=0; i< mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cout = 0;
        for (int i=0; i< mat.length;i++){
            for (int j=0; j< mat.length;j++){
                if (mat[i][j] < 0){
                    cout++;
                }
            }
        }

        System.out.println("Negative numbers = " + cout);
    }
}
