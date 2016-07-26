package com.example.djf.observermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Watched girl;
    private Watcher watcher;
    private Watcher watcher2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        girl = new Watched();

        watcher = new Watcher() {
            @Override
            public void display(String msg) {
                System.out.println("watcher saw :"+msg);
            }
        };

        watcher2 = new Watcher() {
            @Override
            public void display(String msg) {
                System.out.println("watcher2 saw :"+msg);
            }
        };

        girl.addWatcher(watcher);
        girl.addWatcher(watcher2);
        girl.notifyWatchers("I'm a girl");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girl.removeWatcher(watcher);
        girl.removeWatcher(watcher2);
    }
}
