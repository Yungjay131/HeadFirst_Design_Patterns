package com.slyworks.a02_observer_pattern;

public class StatisticsDisplay implements Observer,DisplayElement{
    //region Vars
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    //endregion

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature +
                "F degrees and "+ humidity+
                "% humidity, while the current atmospheric pressure is " + pressure);
    }
}
