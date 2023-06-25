package app;
import java.util.Scanner;

public class TesteGraph {
    public static void main(String[] args) {
        CityGraph cidadinha = new CityGraph();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero da Cidade: ");
        int numero = scanner.nextInt();
		System.out.println("Cidade Atual");
		cidadinha.cityName(numero);
		System.out.println("Vizinhos");
		cidadinha.neighbors(numero);
		
		scanner.close();
    }
}
