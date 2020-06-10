package com.example.demo.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This sample references  https://refactoring.guru/design-patterns/singleton
// Since i could not think of an example for this pattern at the moment

@RestController()
@RequestMapping("rest/singleton")
public class SingletonController {
    @GetMapping("test")
    public void trySingleton() {
        System.out.println("\nIf you see the same value, then singleton was reused and that is what planned" + "\n" +
                "If you see different values, then 2 singletons were created and this means our approach didn't help" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadOne());
        Thread threadBar = new Thread(new ThreadTwo());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("ONE");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("TWO");
            System.out.println(singleton.getValue());
        }
    }
}
