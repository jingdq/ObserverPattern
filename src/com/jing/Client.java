package com.jing;

/**
 * Created by jingdongqi on 7/5/15.
 */
public class Client {

    public static void main(String[] args){

        ConcreteSubject subject = new ConcreteSubject();

        ConcretObserver o1 = new ConcretObserver();
        o1.setObserverName("vivi ");

        subject.attach(o1);


        ConcretObserver o2 = new ConcretObserver();
        o2.setObserverName("jimi ");

        subject.attach(o2);

        subject.setWeatherContent("晴天 ，温度28 微风 ");

    }

}
