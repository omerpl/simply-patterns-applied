package com.example.demo.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketPublisher {
    private Map<SubscriptionType, List<MarketSubscriber>> subscriberMap = new HashMap<>();

    void subscribe(SubscriptionType type,MarketSubscriber marketSubscriber){
        List<MarketSubscriber> subscribers =this.subscriberMap.get(type) == null ? new ArrayList<>() : this.subscriberMap.get(type);
        boolean isAlreadySubscribed = subscribers.stream().anyMatch(subscriber-> subscriber.getId() == marketSubscriber.getId());
        if(!isAlreadySubscribed){
            subscribers.add(marketSubscriber);
            this.subscriberMap.put(type,subscribers);
        }
    }
    void unSubscribe(SubscriptionType type, MarketSubscriber marketSubscriber){
        List<MarketSubscriber> subscribers =this.subscriberMap.get(type) == null ? new ArrayList<>() : this.subscriberMap.get(type);;
        boolean isSubscribed = subscribers.stream().anyMatch(subscriber-> subscriber.getId() == marketSubscriber.getId());
        if(isSubscribed){
            subscribers.remove(marketSubscriber);
            this.subscriberMap.put(type,subscribers);
        }
    }

    void  notify(SubscriptionType type, String event){
        List<MarketSubscriber> subscribers =this.subscriberMap.get(type);
        subscribers.forEach(marketSubscriber -> marketSubscriber.update(event));

    }
}
