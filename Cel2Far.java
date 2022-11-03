import java.util.Scanner; //Lembra do #include ? Faça esta associação por enquanto para conseguir ler.

public class Cel2Far{

    public static void main (String args[]){

    //inicio
    double cel;
    System.out.print("Informe uma temperatura em Celsius: ");
    cel = new Scanner(System.in).nextDouble( );// Comando grande, né? É só isso para ler um double
    double far = (9 * cel + 160) / 5;
    System.out.printf("\nA temperatura em Fahrenheit é: %.2f", far);
    //fim
    }
}