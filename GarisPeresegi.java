import java.util.Scanner;
class GarisPeresegi {
  
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
 int oxoxoxo= input.nextInt();
    for (int i=1;i<=oxoxoxo;i++){
    for (int j=1;j<=oxoxoxo;j++) 
    {
    if((j==1||j==oxoxoxo)||(i==1||i==oxoxoxo)) 
    System.out.print("#");
    else 
    System.out.print(" ");
    }
    System.out.println();
    }
      } 
    }
