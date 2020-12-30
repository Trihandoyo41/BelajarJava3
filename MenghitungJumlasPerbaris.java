import java.util.Scanner;
class MenghitungJumlasPerbaris {
  public static void main(String[] args) {
    int i, j, m, n;
    int matriksx[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    m = 5;
    n = 5;
    for (i = 0; i < m; i++){
      for (j = 0; j < n; j++){
        matriksx[i][j] = scan.nextInt();
      }
    }
    
        System.out.println(matriksx[0][0] + matriksx[0][1] + matriksx[0][2] + matriksx[0][3] + matriksx[0][4]);
        System.out.println(matriksx[1][0] + matriksx[1][1] + matriksx[1][2] + matriksx[1][3] + matriksx[1][4]);
        System.out.println(matriksx[2][0] + matriksx[2][1] + matriksx[2][2] + matriksx[2][3] + matriksx[2][4]);
        System.out.println(matriksx[3][0] + matriksx[3][1] + matriksx[3][2] + matriksx[3][3] + matriksx[3][4]);
        System.out.println(matriksx[4][0] + matriksx[4][1] + matriksx[4][2] + matriksx[4][3] + matriksx[4][4]);
        
        
        
      }
    }
