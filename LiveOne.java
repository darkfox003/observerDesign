package observerDesign;

public class LiveOne implements Observer{

    @Override
    public void update(Source s) {
        System.out.println("Live result : " + ((Reporter)s).getScore());
    }
    
}
