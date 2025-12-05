package Navigation;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("🚌 Taking public transport from " + a + " to " + b);    }
}
