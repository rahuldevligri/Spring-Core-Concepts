package Setter_Injection;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void play() {
        System.out.println("Cat is playing...in Setter injection");
    }
}
