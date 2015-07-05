package com.jing;


/**
 * Created by jingdongqi on 7/5/15.
 */
public class ConcretObserver  implements Observer{


    private String observerName;

    private String observerState;
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }




    @Override
    public void update(Subject subject) {

        observerState = ((ConcreteSubject)subject).getWeatherContent();
        System.out.println(observerName + " 收到 "+observerState);




    }
}
