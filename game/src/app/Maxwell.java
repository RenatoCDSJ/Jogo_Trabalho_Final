package app;


public class Maxwell {
    public Jewel Jewel;
    public int AmountCoins = 3;
    // amount of coins =  Quantidade de moedas


    public void getAmountCoins(int AmountCoins) {
        this.AmountCoins = AmountCoins;
    }

    public int setAmountCoins(int AmountCoins) {
        return AmountCoins;
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
        // Ticket to the next city
        this.AmountCoins--;
        
    }
    public String toString(){
        return 
        
    }
}