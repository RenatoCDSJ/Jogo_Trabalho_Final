package app;

public class Maxwell {
    public int AmountCoins; // amount of coins = Quantidade de moedas
    public int powerJewel;
    public int powerthreshold;

    // this is playerMaxwell
    public Maxwell(int AmountCoins, int powerJewel, int powerthreshold) {
        this.AmountCoins = 3;
        this.powerJewel = powerJewel;
        this.powerthreshold = powerthreshold;
    }

    // Coins
    public void getAmountCoins(int AmountCoins) {
        this.AmountCoins = AmountCoins;
    }

    public int setAmountCoins(int AmountCoins) {
        return AmountCoins;
    }

    // jewel [joia]
    public void getpower(int powerJewel) {
        this.powerJewel = powerJewel;
    }

    public int setpowerJewl(int powerJewel) {
        return powerJewel;
    }

    // powerthreshold [Limite de energia]
    public void getpowerthreshold(int powerthreshold) {
        this.powerthreshold = powerthreshold;
    }

    public int setpowerthreshold(int powerthreshold) {
        return powerthreshold;
    }
    // Jewel
    // Metodos
    // esse metodo faz com que, se o poder da joia passar do limite o game acaba
    public void powerlessthanPowerLimit(int powerJewel, int powerthreshold) {
        if (powerJewel < 0) {
            powerJewel = 0;
        } else if (powerJewel > powerthreshold) {
            System.out.println("O poder da joia do poder foi de mais para o pobre Maxwell 'Game over'");
        }
    }
    public void CurrencyFlow() {
        // Fluxo de moedas
        if (AmountCoins > 0) {
            System.out.println("Quantidade atual de moedas: " + AmountCoins);
        } else {
            System.out.println("Maxwell nao possui moedas Game over");
            // Caso não haja moedas restantes
        }
    }

    public void nextCity() {
        // Ticket to the next city
        this.AmountCoins--;
    }
}
