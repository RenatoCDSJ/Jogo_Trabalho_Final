package app;

public class Jewel {
    public int power;
    public int powerthreshold;



    public Jewel(int powerthreshold, int power){
        this.powerthreshold = powerthreshold;
        this.power = power;

    }
    
    public void getpower(int power) {
        this.power = power;
    }

    public int setpower(int power) {
        return power;
    }

    // powerthreshold = Limite de energia
    public void getpowerthreshold(int powerthreshold) {
        this.powerthreshold = powerthreshold;
    }

    public int setpowerthreshold(int powerthreshold) {
        return powerthreshold;
    }


    public void poderMenorQueLimiteDePoder(int power) {
        if (power < 0) {
            power = 0;
        } 
        else if (power > 7) {
            System.out.println("Fim de jogo");

        }
    }

    public void aumentoDeEnergia(){
        // cotrolador do limiar da joia
        
        this.powerthreshold += 1;
    }

}
