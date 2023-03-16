package org.example.Les1;

public class BasketballCoach implements Coach{ //SETTER INJECTION
    private FortuneService fortuneService;
    public BasketballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Basic Hoop practice";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }

    public void setFortuneService(HappyFortuneService fortuneService) {

        this.fortuneService = fortuneService;

    }
}
