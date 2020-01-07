package org.word.service;

import org.springframework.stereotype.Service;
import org.word.thread.MyRunabel;

@Service
public class Myservice {
    public void doGet(String url,int num){
        MyRunabel runabel = new MyRunabel(num, url);
        Thread thread = new Thread(runabel);
        thread.start();
    }
}
