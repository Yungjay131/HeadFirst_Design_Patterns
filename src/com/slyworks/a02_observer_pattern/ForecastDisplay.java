package com.slyworks.a02_observer_pattern;

public class ForecastDisplay implements Observer,DisplayElement {
    //region Vars
    private float temperature;
    private Subject weatherData;
    //endregion
    public ForecastDisplay(Subject wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;

       display();
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature + "F degrees");
    }

    //trying out new things
    public void changeSubject(Subject wd){ this.weatherData = wd; }

}
