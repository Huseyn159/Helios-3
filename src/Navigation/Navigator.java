package Navigation;

public class Navigator {

    public void calculateRoute(int m,String a,String b){
        RouteStrategy strategy;
        switch (m) {
            case 1 -> strategy = new CarStrategy();
            case 2 -> strategy = new PublicTransportStrategy();
            case 3 -> strategy = new WalkingStrategy();
            default -> throw new IllegalArgumentException();
        }
        strategy.buildRoute(a, b);


    }
    }

