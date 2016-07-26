package com.example.djf.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by djf on 2016/6/15 22:29.
 * 工程名称： ObserverModel
 * 包名称：   com.example.djf.observermodel
 * 文件名称： Watched
 */
public class Watched {
    // 存放观察者
    private List<Watcher> list = new ArrayList<Watcher>();


    public void addWatcher(Watcher watcher)
    {
        list.add(watcher);
    }


    public void removeWatcher(Watcher watcher)
    {
        list.remove(watcher);
    }


    public void notifyWatchers(String str)
    {
        // 自动调用实际上是主题进行调用的
        for (Watcher watcher : list)
        {
            watcher.display(str);
        }
    }
}
