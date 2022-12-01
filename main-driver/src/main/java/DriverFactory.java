import com.greeting.german.ArabicGreetingsProvider;
import com.greeting.german.GermanGreetingsProvider;
import com.greeting.people.impl.HumanProvider;
import com.greeting.people.mock.MockHumanProvider;
import dagger.Component;

@Component(modules = {
        HumanProvider.class,
        ArabicGreetingsProvider.class
})
public interface DriverFactory {
    Driver createDriver();
}
