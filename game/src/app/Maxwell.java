package app;

import java.util.Stack;

public class Maxwell {
    private Jewel Jewel;
    public int AmountCoins = 3;
    // amount of coins =  Quantidade de moedas

    public void getAmountCoins(int AmountCoins) {
        this.AmountCoins = AmountCoins;
    }

    public int setAmountCoins(int AmountCoins) {
        return AmountCoins;
    }

    public Stack<String> LastCity;

    public void City() {
        LastCity = new Stack<>();
    }

    public void WhereDidItComeFrom() {
        // metodo de onde vem: que retorna a ultima cidade de onde Max veio
        if (LastCity.isEmpty()) {
            System.out.println("Nenhuma cidade foi visitada ainda.");

        } else {
           System.out.println("Ultima cidade:" + LastCity.peek());

        }
    }

    public void CurrencyFlow() {
        // Fluxo de moedas
        if (AmountCoins > 0) {

            System.out.println("Quantidade atual de moedas: " + AmountCoins);
        } else {
            System.out.println("Fim de jogo");
            // Caso não haja moedas restantes
        }
    }

    public void ticket() {
        // passagem para a proxima cidade
        this.AmountCoins--;
    }
}