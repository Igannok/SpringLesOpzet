package org.example.Les1;

public class BaseballCoach implements Coach { //CONSTRUCTOR INJECTION

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){

        return "Basic Baseball practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
