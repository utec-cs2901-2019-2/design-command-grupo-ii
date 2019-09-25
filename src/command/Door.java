package command;

public class Door {
    private boolean isOn = false;
    Door(String place){}


    public void  on(){
        isOn = true;
        System.out.println("Door is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Door is "+isOn);
    }

}
