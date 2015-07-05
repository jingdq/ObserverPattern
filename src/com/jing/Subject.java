package com.jing;


import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * 目标对象
 * Created by jingdongqi on 7/5/15.
 */
public class Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected  void notifyObservers(){

        for (Observer observer:observers){
            observer.update(this);
        }
    }
}


