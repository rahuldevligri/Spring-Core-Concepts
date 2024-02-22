package Field_Injection;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void play()
    {
        System.out.println("Cat is playing...in field injection");
    }
}
