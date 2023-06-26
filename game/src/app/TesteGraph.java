package app;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteGraph {
    public static void main(String[] args) {
        CityGraph cidadinha = new CityGraph();
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;

		System.out.print("Digite o numero da Cidade: ");
        int numero = scanner.nextInt();

		while(!sair){
			System.out.println("======================");
			System.out.println("Cidade Atual\n");
			cidadinha.cityName(numero);
			System.out.println("======================");
			System.out.println("Vizinhos\n");
			cidadinha.neighbors(numero);
			try {
                int escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= cidadinha.qtdneighbors(numero)) {
                    //"numero" is the current city 
                    //maxwell.setcityatual()
                    //maxwell.cidadeatual()
					numero = cidadinha.specifcNeighb(numero,escolha-1);
                    sair = true;
                } else {
                    System.out.println("Escolha inválida. Tente novamente.\n\n\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); 
            }
		}
		
		
		scanner.close();
    }
}
