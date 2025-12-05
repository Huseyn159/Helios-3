package Navigation;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("🚶 Walking from " + a + " to " + b);
    }
}
