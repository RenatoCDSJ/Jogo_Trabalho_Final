package app;
//CJ(CoinJewel)
//this class contains data of coin and jewel
public class CJ {
    private int jewelThreshold;
    private int coin;

    public CJ(int coin, int jewelThreshold){
        this.coin = coin;
        this.jewelThreshold = jewelThreshold;
    }
    public int getJewelThreshold() {
        return jewelThreshold;
    }
    public void setJewelThreshold(int jewelThreshold) {
        this.jewelThreshold = jewelThreshold;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    @Override
    public String toString() {
        return "CJ [ coin=" + coin + ", jewelThreshold=" + jewelThreshold + "]";
    }
    
}
