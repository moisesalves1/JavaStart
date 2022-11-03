import java.util.Scanner; //Lembra do #include ? Faça esta associação por enquanto para conseguir ler.

public class ExercicioTres{

    public static void main (String args[]){

    //inicio
    double nota1, nota2;
    System.out.print("Informe a primeira nota: ");
    nota1 = new Scanner(System.in).nextDouble( );// Comando grande, né? É só isso para ler um double
    System.out.print("Informe a segunda nota: ");
    nota2 = new Scanner(System.in).nextDouble( );// Comando grande, né? É só isso para ler um double
    double media = (nota1 + nota2) / 2;

    if (media > 7){
        System.out.printf("\nVocê foi aprovado com nota: %.2f", media);
    } else {
        System.out.print("\nVocê não foi aprovado. Tente novamente!");
    }
    //fim
    }
}