package observerDesign;

public class LiveTwo implements Observer{

    @Override
    public void update(Source s) {
        System.out.println("Live result : " + ((Reporter)s).getScore());
    }
    
}
