import com.greeting.Bye;
import com.greeting.Hi;
import com.greeting.Person;

import javax.inject.Inject;

public class Driver {

    private Person first;
    private Person second;
    private Hi hi;
    private Bye bye;

    @Inject
    Driver(Hi hi, Person first, Person second, Bye bye) {
        this.first = first;
        this.second = second;
        this.hi = hi;
        this.bye = bye;
    }

    public void start() {
        System.out.println(hi.sayHi(first));
        System.out.println(hi.sayHi(second));
        System.out.println(bye.sayBye(first));
        System.out.println(bye.sayBye(second));
    }

}
