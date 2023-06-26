package app;

public class Quest {
    //this class contains mission information and actions to accept, cancel and complet the mission
    private boolean accepted;
    private boolean complete;
    private CJ rewardForAcceptingMission;
    private CJ reward;
    private String mission;

    public CJ acceptMission(){
        accepted = true;
        return rewardForAcceptingMission;
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
    public Quest(CJ rewardForAcceptingMission, CJ reward, String mission) {
        this.accepted = false;
        this.complete = false;
        this.rewardForAcceptingMission = rewardForAcceptingMission;
        this.reward = reward;
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
    
}
