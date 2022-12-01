

public class Runner {

    public static void main(String[] args) {
        DriverFactory driverFactory = DaggerDriverFactory.create();
        Driver driver = driverFactory.createDriver();
        driver.start();
    }
}
