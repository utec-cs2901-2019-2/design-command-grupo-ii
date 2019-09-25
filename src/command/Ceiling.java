package command;

public class Ceiling {
    private boolean isHigh = false;
    public  void high(){
        isHigh=true;
        System.out.println("Ceiling Fan is "+isHigh);
    }

    public void low(){
        isHigh = false;
        System.out.println("Ceiling Fan is "+isHigh);
    }
}
