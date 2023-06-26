package app;

public class Maxwell {
    private int AmountCoins; // amount of coins = Quantidade de moedas
    private int PowerJewel;
    private int Powerthreshold;
    private int CurrentCity;
    private boolean Alive = true;

    // this is playerMaxwell
    public Maxwell(int AmountCoins, int PowerJewel, int Powerthreshold, int CurrentCity, boolean Alive) {
        this.AmountCoins = 3;
        this.PowerJewel = PowerJewel;
        this.Powerthreshold = Powerthreshold;
        this.CurrentCity = 0;
        this.Alive = true;
    }

    // AmountCoins
    public void getAmountCoins(int AmountCoins) {
        this.AmountCoins = AmountCoins;
    }
    public int setAmountCoins(int AmountCoins) {
        return AmountCoins;
    }

    // Powerjewel [joia]
    public void getPower(int PowerJewel) {
        this.PowerJewel = PowerJewel;
    }
    public int setPowerJewl(int PowerJewel) {
        return PowerJewel;
    }

    // CurrentCity 
    public void getCurrentCity(int CurrentCity){
        this.CurrentCity = CurrentCity;
    }
    public int setCurrentCity(int CurrentCity){
        return CurrentCity;
    }

    // powerthreshold [Limite de energia]
    public void getPowerthreshold(int Powerthreshold) {
        this.Powerthreshold = Powerthreshold;
    }
    public int setPowerthreshold(int Powerthreshold) {
        return Powerthreshold;
    }

    // Alive
    public void getAlive(boolean Alive){
        this.Alive = Alive;
    }
    public boolean setAlive(boolean Alive){
        return Alive;
    }
   
   
    public void PowerlessthanPowerLimit(int PowerJewel, int Powerthreshold, boolean Alive) {
        if (PowerJewel < 0) {
            PowerJewel = 0;
        } else if (PowerJewel > Powerthreshold) {
          Alive = false;
        }
    }
    // this method means that, if the power of the jewel exceeds the limit, the game ends
    public void CurrencyFlow() {
        // CurrencyFlow
        if (AmountCoins > 0) {
            System.out.println("Quantidade atual de moedas: " + AmountCoins);
        } else {
            Alive = false;
            //If there are no coins left
        }
    }
}
