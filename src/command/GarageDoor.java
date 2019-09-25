package command;

<<<<<<< HEAD
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
=======
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
>>>>>>> 2cb91900c03633838c34c9b9a96ef1316dbabf3b
