package LeetCodeProblems;


import java.util.Scanner;

public class XandO {
    public static void main(String[] args) {

        String[][] games = new String[5][5];
        x_and_o(games);
    }
    static void x_and_o(String[][] game ){
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
