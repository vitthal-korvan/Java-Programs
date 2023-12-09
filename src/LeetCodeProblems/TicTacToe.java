package LeetCodeProblems;


import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] games = new String[5][5];
        tic_Tac_Toe(games);
    }
    static void tic_Tac_Toe(String[][] game ){
        Scanner sc = new Scanner(System.in);
        String[][] arr=new String[5][5];
        int i,j;
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(i%2==0 && j%2!=0){
                    game[i][j]= "|";
                } else if (i%2!=0 && j%2!=0) {
                    game[i][j]= "+";
                }
                else if (i%2!=0 && j%2==0){
                    game[i][j]="_";
                }
                else {
                    game[i][j]=sc.next();
                }

            }
        }
        for ( i=0;i<5;i+=2){
            for (j=0;j<5;j+=2){
                arr[i][j]=game[i][j];
            }
        }

        for (i=0;i<5;i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Program completed!");
    }
}



// 3*3 matrix -> 5*5 matrix

/*

   x| 0| x
  __+__+__
   0| 0 | x
  __+__+__
   0| x | 0

   1,2 -> x
   1,3 -> 0
   input(): -> takes input from user
   switchPlayer(): -> x 1,2 switch 0
   isWin(): -> checks if win -> or draw

 */