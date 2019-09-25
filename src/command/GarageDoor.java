package command;

public class GarageDoor{
    private boolean isOn = false;
    GarageDoor(String place){}


    public void  on(){
        isOn = true;
        System.out.println("Door is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Door is "+isOn);
    }

}