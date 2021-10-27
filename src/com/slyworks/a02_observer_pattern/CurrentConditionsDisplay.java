package com.slyworks.a02_observer_pattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    //region Vars
    private float temperature;
    private float humidity;
    private Subject weatherData;
    //endregion

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }
    @Override
    public void display() {
       System.out.println("Current conditions: "+ temperature +
               "F degrees and "+ humidity+ "% humidity");
    }


}
