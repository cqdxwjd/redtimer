package com.lxyer.timer;

/**
 * @author: liangxianyou at 2018/8/5 19:32.
 */
public interface Task extends Runnable{

    long nextTime();
    long theTime();
}
