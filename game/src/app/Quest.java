package app;

public class Quest {
    //this class contains mission information and actions to accept, cancel and complet the mission
    private boolean accepted;
    private boolean complete;
    private CJ rewardForAcceptingMission;
    private CJ reward;
    private String mission;
    private int originCity;
    private int destinationCity;

    public CJ acceptMission(){
        if(complete == false){
        accepted = true;
        return rewardForAcceptingMission;
        }
        return null;
    }
    public CJ cancelMission(){
        accepted =false;
        int x = rewardForAcceptingMission.getCoin() * -1;
        int y = rewardForAcceptingMission.getJewelThreshold() * -1;
        return new CJ(x, y);
    }
    public CJ missionComplete(){
        complete = true;
        return reward;
    }
    public void mission(){
        System.out.println(mission);
    }
    public Quest(CJ rewardForAcceptingMission, CJ reward, int originCity, int destinationCity, String mission) {
        this.accepted = false;
        this.complete = false;
        this.rewardForAcceptingMission = rewardForAcceptingMission;
        this.reward = reward;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.mission = mission;
    }
    public boolean isAccepted() {
        return accepted;
    }
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    public boolean isComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public CJ getRewardForAcceptingMission() {
        return rewardForAcceptingMission;
    }
    public void setRewardForAcceptingMission(CJ rewardForAcceptingMission) {
        this.rewardForAcceptingMission = rewardForAcceptingMission;
    }
    public CJ getReward() {
        return reward;
    }
    public void setReward(CJ reward) {
        this.reward = reward;
    }
    public String getMission() {
        return mission;
    }
    public void setMission(String mission) {
        this.mission = mission;
    }
    public int getOriginCity() {
        return originCity;
    }
    public void setOriginCity(int originCity) {
        this.originCity = originCity;
    }
    public int getDestinationCity() {
        return destinationCity;
    }
    public void setDestinationCity(int destinationCity) {
        this.destinationCity = destinationCity;
    }
    @Override
    public String toString() {
        return "Quest [accepted=" + accepted + ", complete=" + complete + ", rewardForAcceptingMission="
                + rewardForAcceptingMission + ", reward=" + reward + ", mission=" + mission + ", originCity="
                + originCity + ", destinationCity=" + destinationCity + "]";
    }
    
}
