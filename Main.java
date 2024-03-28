import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("enter row and columns + rows  + column ");
        int row=scanner.nextInt();
        int cilumns=scanner.nextInt();

        int array[][]=new int[row][cilumns];

        System.out.println("enter the elemnts of array");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <cilumns ; j++) {
                array[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <cilumns ; j++) {
                if (array[i][j]%2==0){
                    array[i][j]=0;
                }
                else {
                    array[i][j]=1;
                }
            }
        }
        System.out.println("enter the locations");
        int is=scanner.nextInt();
        int js=scanner.nextInt();

        int ie=scanner.nextInt();
        int je=scanner.nextInt();


        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <cilumns ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        // 0 0
        // 1 1

        int a2 [][]=new int[ie-is+1][je-js+1];


        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <cilumns ; j++) {
                if (i>=is-1&j>=js-1&i<=ie-1&j<=je-1){
                    int Is=is-1;
                    int Js=js-1;
                    if(Is<0){
                        Is=0;
                    }
                    if(Js<0){
                        Js=0;
                    }
                    a2[i-Is][j-Js]=array[i][j];
                }
            }
        }

        for (int i = 0; i <ie-is+1 ; i++) {
            for (int j = 0; j <je-js+1 ; j++) {
                System.out.print(a2[i][j]+"\t");
            }
            System.out.println();
        }




    }
}