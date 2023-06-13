package app;
//CDT(CoinDistanceTrade)
public class CDT {
    private int coin;
    private int distance;
    private boolean trade;

    public CDT(int coin, int distance, boolean trade){
        this.coin = coin;
        this.distance = distance;
        this.trade = trade;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isTrade() {
        return trade;
    }

    public void setTrade(boolean trade) {
        this.trade = trade;
    }
    
}
