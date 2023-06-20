package app;


public class Maxwell {

    public Jewel Jewel;
    public int Coins;
    public int AmountCoins ; // amount of coins =  Quantidade de moedas
    public String currentCity;

// this is Maxwell

    public Maxwell(int AmountCoins){
        this.AmountCoins = 3;
    }


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
        }
         else {
            System.out.println("Game over");
            // Caso não haja moedas restantes
        } 
    }
    public void ticket() {
        // passagem para a proxima cidade
        // Ticket to the next city
        this.AmountCoins--;
        
    }
    public void addCity(String city) {
        currentCity = city;
    }

    public String toString() {
        return "Cidade atual: " + currentCity;
    }
}


