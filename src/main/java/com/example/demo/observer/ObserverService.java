package com.example.demo.observer;

import org.springframework.stereotype.Service;

@Service
public class ObserverService {
    public void demonstrateObserverPattern() {
        MarketPublisher marketPublisher = new MarketPublisher();
        MassSubscriber massSubscriberOne = new MassSubscriber("M1");
        MassSubscriber massSubscriberTwo = new MassSubscriber("M2");
        MassSubscriber massSubscriberThree = new MassSubscriber("M3");
        MassSubscriber massSubscriberFour = new MassSubscriber("M4");

        RetailSubscriber retailSubscriberOne = new RetailSubscriber("R1");
        RetailSubscriber retailSubscriberTwo = new RetailSubscriber("R2");
        RetailSubscriber retailSubscriberThree = new RetailSubscriber("R3");
        RetailSubscriber retailSubscriberFour = new RetailSubscriber("R4");
        RetailSubscriber retailSubscriberFive = new RetailSubscriber("R5");

        System.out.println("2 Mass and 3 retail subsriber subscribes first.");
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, massSubscriberOne);
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, massSubscriberTwo);
        marketPublisher.subscribe(SubscriptionType.NEW_PRODUCTS, retailSubscriberOne);
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, retailSubscriberTwo);
        marketPublisher.subscribe(SubscriptionType.NEW_PRODUCTS, retailSubscriberThree);
        marketPublisher.notify(SubscriptionType.DISCOUNTS, "Product X now on sale!!!");
        marketPublisher.notify(SubscriptionType.NEW_PRODUCTS, "Product Y now on stock!!!");

        this.simulateTimeDiff();
        System.out.println("2 Mass and 2 retail subsriber subscribes now on...");
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, massSubscriberThree);
        marketPublisher.subscribe(SubscriptionType.NEW_PRODUCTS, massSubscriberFour);
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, retailSubscriberFour);
        marketPublisher.subscribe(SubscriptionType.NEW_PRODUCTS, retailSubscriberFive);

        marketPublisher.notify(SubscriptionType.DISCOUNTS, "Product Titan X now on sale!!!");
        marketPublisher.notify(SubscriptionType.NEW_PRODUCTS, "Product Titan Y now on stock!!!");

        this.simulateTimeDiff();
        System.out.println("1 mass subscriber tries to subscribe again to test if it gets update twice...");
        marketPublisher.subscribe(SubscriptionType.DISCOUNTS, massSubscriberThree);
        marketPublisher.notify(SubscriptionType.DISCOUNTS, "Product Titan X now on sale!!!");

    }

    private void simulateTimeDiff() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
