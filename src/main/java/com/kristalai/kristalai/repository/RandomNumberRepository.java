package com.kristalai.kristalai.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;



@Repository
public class RandomNumberRepository {

    private static Map<Integer, Integer> customerTypeDiscoutMappings = new ConcurrentHashMap<>();




}