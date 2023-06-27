package app;

public class Maxwell {
    private int AmountCoins; // amount of coins = Quantidade de moedas
    private int PowerJewel;
    private int Powerthreshold;
    private int CurrentCity;
    private boolean Alive = true;

    // this is playerMaxwell
    public Maxwell() {
        this.AmountCoins = 3;
        this.PowerJewel = 0;
        this.Powerthreshold = 7;
        this.CurrentCity = 0;
        this.Alive = true;
    }

    // AmountCoins
    public void setAmountCoins(int AmountCoins) {
        this.AmountCoins = AmountCoins;
    }
    public int getAmountCoins() {
        return AmountCoins;
    }

    // Powerjewel [joia]
    public void setPower(int PowerJewel) {
        this.PowerJewel = PowerJewel;
    }
    public int getPowerJewl() {
        return this.PowerJewel;
    }

    // CurrentCity 
    public void setCurrentCity(int CurrentCity){
        this.CurrentCity = CurrentCity;
    }
    public int getCurrentCity(){
        return this.CurrentCity;
    }

    // powerthreshold [Limite de energia]
    public void setPowerthreshold(int Powerthreshold) {
        this.Powerthreshold = Powerthreshold;
    }
    public int getPowerthreshold() {
        return this.Powerthreshold;
    }

    // Alive
    public void setAlive(boolean Alive){
        this.Alive = Alive;
    }
    public boolean getAlive(){
        return this.Alive;
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

    public void getAll(){
        CityGraph cg = new CityGraph();
        System.out.println("======================");
        System.out.println("Inventário do Mawell ");
        System.out.println("======================");
        System.out.println("Cidade Atual: ");
        cg.cityName(this.CurrentCity);
        System.out.println("Poder da Jóia: "+ this.PowerJewel);
        System.out.println("Limiar da Jóia: "+ this.Powerthreshold);
        System.out.println("Moedas: "+ this.AmountCoins);
        System.out.println("======================");
    }
}
