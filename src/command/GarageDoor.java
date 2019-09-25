package command;

public class GarageDoor {
    private boolean isOpen = false;
    public void open(){
        isOpen =true;
        System.out.println("Door is Open");
    }
    public void close(){
        isOpen =false;
        System.out.println("Door is Close");
    }

}
