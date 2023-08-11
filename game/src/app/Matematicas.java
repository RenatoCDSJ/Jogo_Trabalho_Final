package app;

public class Matematicas {
    
    public static void main(String[] args) {
        int numero_a_fatorar = 10;
        System.out.println(fatorial(numero_a_fatorar));
    }

    public static int fatorial(int num){
		int total = 0;
		if(num > 0){
			total = num * fatorial(num - 1);
		}else if(num < 0){
            total = 0;
            System.out.println("Não existe fatorial de número negativo");
        }
        else{
			total = 1;
		}
		return total;
	}
	
}
