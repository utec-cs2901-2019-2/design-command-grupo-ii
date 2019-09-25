package command;

public class CeilingFanOffCommand implements Command {

    Fan fan;

    public CeilingFanOffCommand(String name){}

    public CeilingFanOffCommand(Fan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.off();
    }

}