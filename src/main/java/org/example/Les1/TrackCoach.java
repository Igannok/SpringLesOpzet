package org.example.Les1;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Basic Track practice";
    }

    @Override
    public String getFortune() {
        return "Gold medal";
    }


}
