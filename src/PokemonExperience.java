import java.lang.Math;
import java.util.Scanner;

public class PokemonExperience {

    public static int NivelPokemon() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nivel del Pokemon");
        return SC.nextInt();
    }

    public static void Normal(int n) {
        int x = (int) Math.pow (n , 3);
        System.out.println("Normal     " + x);
    }

    public static void Rapido(int n) {
        int x = (int) (Math.pow (n , 3) * 0.8);
        System.out.println("Rapido     " +x);
    }

    public static void Lento(int n) {
        int x = (int) (Math.pow (n,3)*1.25);
        System.out.println("Lento      " + x);
    }

    public static void Parabolico(int n) {
        int x = (int) (Math.pow (n,3)*1.2) - (int) (Math.pow(n , 2 )* 15) + (n * 100) - 140;
        System.out.println("Parabolico " + x);
    }

    public static void Erratico(int n, int x){
        if (n > 0 && n <= 50) { x = (int) (Math.pow (n,3))*(100-n)/50; }
        if (n >= 51 && n <= 68) { x = (int) (Math.pow (n,3))*(150-n)/100; }
        if (n >= 69 && n <= 98) { x = (int) (Math.pow (n,3))*(155-n)/100; }
        if (n >= 99 && n <= 100) { x = (int) (Math.pow (n,3))*(160-n)/100; }
        System.out.println("Erratico   " +x);
    }

    public static void Fluctuante(int n, int x){
        if (n > 0 && n <= 15) { x = (int) (Math.pow (n,3))*(24+(n+1)/3)/50; }
        if (n >= 16 && n <= 35) { x = (int) (Math.pow (n,3))*(14+n)/50; }
        if (n >= 36 && n <= 100) { x = (int) (Math.pow (n,3))*(32+(n/2))/50; }
        System.out.println("Fluctuante " +x);
    }

    public static void main(String[] args) {
        int x = 0;
        int n = NivelPokemon();
        while(n != 111) {
            Normal(n);
            Rapido(n);
            Lento(n);
            Parabolico(n);
            Erratico(n, x);
            Fluctuante(n, x);
            n = NivelPokemon();
        }
    }
}
