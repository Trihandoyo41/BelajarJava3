import java.util.Scanner;
class LuasDanKeliling {
  public static void LuasDanKeliling(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double panjang = input.nextDouble();
    double lebar = input.nextDouble();
    
    double mLuas = LuasDanKeliling.luas(panjang,lebar);
    System.out.println(mLuas);
    
    double mKeliling = LuasDanKeliling.keliling(panjang,lebar);
    System.out.println(mKeliling);
    
  }
  
  public static double keliling(double panjang, double lebar) {
    double keliling = 2 * (panjang+lebar);
    return keliling;
  }
  
  public static double luas(double panjang, double lebar) {
    double luas = panjang * lebar;
    return luas;
  }
}
