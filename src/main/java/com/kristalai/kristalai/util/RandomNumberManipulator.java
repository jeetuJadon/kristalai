package com.kristalai.kristalai.util;


import com.kristalai.kristalai.model.RandomNumberNode;
import com.kristalai.kristalai.task.RandomNumberCleaner;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;


public  class RandomNumberManipulator{


    BlockingQueue<RandomNumberNode> randomNumberQueue ;
    //data will be automatically delateed afer this given time from memory
    Integer removalTime;

    public  RandomNumberManipulator(Integer removalTime){
        this.removalTime = removalTime;
        randomNumberQueue = new LinkedBlockingQueue<>();
        this.startMemoryCleaner();
    }

    public  void startMemoryCleaner()
    {

        TimerTask timerTask = new RandomNumberCleaner(this.randomNumberQueue,this.removalTime);
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask,0,10000);
    }

    public  void  insertRandomNumbers(List<Double> list){
        list.stream().forEach( d-> randomNumberQueue.add(new RandomNumberNode(d)));
    }


    public  Double  cumilationOfNumbers(Long units){
        final Long miliSeconds = units*1000;
        Double totaCumilation =   randomNumberQueue.stream().filter( e -> e.getElementDateMiliSeconds() >( System.currentTimeMillis()-miliSeconds ) )
                .mapToDouble(e -> e.getNumber() ).sum();
        System.out.println(totaCumilation);
        return  totaCumilation;
    }




}