package com.example.djf.observermodel.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by djf on 2016/6/16 13:16.
 * 工程名称： ObserverModel
 * 包名称：   com.example.djf.observermodel.javaobserver
 * 文件名称： Observer1
 */
public class Observer1 implements Observer {

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object data) {
        if (o instanceof SubjectFor3d)
        {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ)
        {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
