package app;
//CDT(CoinDistanceTrade)
//this class contains data of coin, distance and trade
public class CDT {
    private Integer coin;
    private Integer distance;
    private Integer trade;

    public CDT(Integer coin, Integer distance, Integer trade){
        this.coin = coin;
        this.distance = distance;
        this.trade = trade;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    
    public Integer getTrade() {
        return trade;
    }

    public void setTrade(Integer trade) {
        this.trade = trade;
    }

    @Override
    public String toString() {
        return "CDT [coin=" + coin + ", distance=" + distance + ", trade=" + trade + "]";
    }

}
