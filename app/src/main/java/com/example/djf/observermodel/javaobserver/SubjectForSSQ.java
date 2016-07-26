package com.example.djf.observermodel.javaobserver;

import java.util.Observable;

/**
 * Created by djf on 2016/6/16 13:13.
 * 工程名称： ObserverModel
 * 包名称：   com.example.djf.observermodel.javaobserver
 * 文件名称： SubjectForSSQ
 */
public class SubjectForSSQ extends Observable {
    private String msg;

    public String getMsg(){
        return  msg;
    }
    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg  ;
        setChanged();
        notifyObservers();
    }
}
