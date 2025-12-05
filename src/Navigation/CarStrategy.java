package Navigation;

public class CarStrategy implements RouteStrategy {


    @Override
    public void buildRoute(String a, String b) {
        System.out.println("🚗 Driving from " + a + " to " + b);

    }
}
