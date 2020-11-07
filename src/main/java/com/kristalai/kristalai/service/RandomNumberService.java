package com.kristalai.kristalai.service;

import com.kristalai.kristalai.model.CumulativeData;
import com.kristalai.kristalai.model.RandomNumberManipulator;
import com.kristalai.kristalai.model.RandomNumberResponse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RandomNumberService {

 private static Integer MAX_GENERATED_RANDOM_NUMBER = 5;


 RandomNumberManipulator randomNumberManipulator = new RandomNumberManipulator(400);

 public List<Double> giveGeneratedFileNumbers() {
  List<Double> listToReturn = new ArrayList<>();
  for (int i = 0; i < MAX_GENERATED_RANDOM_NUMBER; i++) {
   listToReturn.add(Math.random());
  }
 return  listToReturn;
 }

public RandomNumberResponse generateRandomNumberResponse(){
 RandomNumberResponse randomNumberResponse = new RandomNumberResponse();
 List<CumulativeData> lstCumulation = new ArrayList<>();
 List<Double> listDouble = giveGeneratedFileNumbers();
 randomNumberManipulator.insertRandomNumbers(listDouble);
 randomNumberResponse.setGeneratedNumbers(listDouble);

   CumulativeData cumulativeData5Sec = new CumulativeData("5sec");
   Double fiveSecAmount = randomNumberManipulator.cumilationOfNumbers(5l);
 cumulativeData5Sec.setCumulationValue(fiveSecAmount);
 lstCumulation.add(cumulativeData5Sec);

 CumulativeData cumulativeData10Sec = new CumulativeData("10sec");
 Double tenSecAmount = randomNumberManipulator.cumilationOfNumbers(10l);
 cumulativeData10Sec.setCumulationValue(tenSecAmount);
  lstCumulation.add(cumulativeData10Sec);

 CumulativeData cumulativeData30Sec = new CumulativeData("30sec");
 Double thirtySecAmount = randomNumberManipulator.cumilationOfNumbers(30l);
 cumulativeData30Sec.setCumulationValue(thirtySecAmount);
lstCumulation.add(cumulativeData30Sec);

 randomNumberResponse.setCumulativeData(lstCumulation);
 return  randomNumberResponse;
 }




}
