package com.kristalai.kristalai.model;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public  class RandomNumberManipulator{

    BlockingQueue<RandomNumberNode> randomNumberQueue ;
    //data will be automatically delateed afer this given time from memory
     Integer removalTime;

     public  RandomNumberManipulator(Integer removalTime){
         this.removalTime = removalTime;
         randomNumberQueue = new LinkedBlockingQueue<>();
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

    // delete
   public  void removeOldRecordsFromMemory()
   {
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