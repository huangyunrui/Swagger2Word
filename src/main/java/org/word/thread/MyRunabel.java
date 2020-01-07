package org.word.thread;

import org.word.util.HttpUtls;

public class MyRunabel implements Runnable {

    private int num;
    private String url;

    public MyRunabel(int num, String url) {
        this.num = num;
        this.url = url;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            HttpUtls.browse(url,num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
