package com.slyworks.a02_observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    //region Vars
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    //endregion

    public WeatherData(){ observers = new ArrayList<Observer>(); }
    @Override
    public void registerObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) {
       int i = observers.indexOf(o);
       if( i >= 0 ){ observers.remove(i); }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers ) {
            observer.update(temperature, humidity, pressure);
        }
    }

    //called whenever there is an update to the weather station
    public void measurementsChanged(){ notifyObservers(); }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        //to notify that data has changed
        measurementsChanged();
    }
}
