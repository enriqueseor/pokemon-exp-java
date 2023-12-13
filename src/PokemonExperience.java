import java.lang.Math;
import java.util.Scanner;

public class PokemonExperience {

    public static int pokemonLevel() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Pokemon level");
        return SC.nextInt();
    }

    public static void erratic(int n, int x){
        if (n > 0 && n <= 50) { x = (int) (Math.pow (n,3))*(100-n)/50; }
        if (n >= 51 && n <= 68) { x = (int) (Math.pow (n,3))*(150-n)/100; }
        if (n >= 69 && n <= 98) { x = (int) (Math.pow (n,3))*(155-n)/100; }
        if (n >= 99 && n <= 100) { x = (int) (Math.pow (n,3))*(160-n)/100; }
        System.out.println("Erratic      " +x);
    }

    public static void fast(int n) {
        int x = (int) (Math.pow (n , 3) * 0.8);
        System.out.println("Fast         " +x);
    }

    public static void slow(int n) {
        int x = (int) (Math.pow (n,3)*1.25);
        System.out.println("Slow         " + x);
    }

    public static void mediumFast(int n) {
        int x = (int) Math.pow (n , 3);
        System.out.println("Medium fast  " + x);
    }

    public static void mediumSlow(int n) {
        int x = (int) (Math.pow (n,3)*1.2) - (int) (Math.pow(n , 2 )* 15) + (n * 100) - 140;
        System.out.println("Medium slow  " + x);
    }

    public static void fluctuating(int n, int x){
        if (n > 0 && n <= 15) { x = (int) (Math.pow (n,3))*(24+(n+1)/3)/50; }
        if (n >= 16 && n <= 35) { x = (int) (Math.pow (n,3))*(14+n)/50; }
        if (n >= 36 && n <= 100) { x = (int) (Math.pow (n,3))*(32+(n/2))/50; }
        System.out.println("Fluctuating  " +x);
    }

    public static void main(String[] args) {
        int x = 0;
        int n = pokemonLevel();
        while(n != 111) {
            erratic(n, x);
            fast(n);
            slow(n);
            mediumFast(n);
            mediumSlow(n);
            fluctuating(n, x);
            n = pokemonLevel();
        }
    }
}