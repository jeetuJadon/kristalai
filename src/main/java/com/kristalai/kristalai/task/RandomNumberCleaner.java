package com.kristalai.kristalai.task;

import com.kristalai.kristalai.model.RandomNumberNode;

import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;

public class RandomNumberCleaner extends TimerTask {

    BlockingQueue<RandomNumberNode> randomNumberQueue ;
    Integer removalTime;

   public RandomNumberCleaner(BlockingQueue<RandomNumberNode> randomNumberQueue,Integer removalTime) {
        this.randomNumberQueue = randomNumberQueue;
        this.removalTime = removalTime;
    }


    @Override
    public void run() {

       final Long miliSeconds = Long.valueOf(this.removalTime*1000);
        final Long compareTimeInMiliSeconds = System.currentTimeMillis() - miliSeconds;
        Iterator itr = this.randomNumberQueue.iterator();

        while (itr.hasNext()) {
            RandomNumberNode randomNumberNode = (RandomNumberNode) itr.next();
            if (randomNumberNode.getElementDateMiliSeconds() < compareTimeInMiliSeconds)
            {   System.out.println("Item Removed"+randomNumberNode.toString());
                itr.remove();
            }
        }
    }
}