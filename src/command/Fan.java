package command;

public class Fan {
    private boolean isOn = false;
    Fan(String place){}


    public void  on(){
        isOn = true;
        System.out.println("Fan is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Fan is "+isOn);
    }

}
