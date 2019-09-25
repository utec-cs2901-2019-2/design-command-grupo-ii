package command;

public class CeilingFanOnCommand implements Command {

    Fan fan;

    public CeilingFanOnCommand(Fan fan){
        this.fan = fan;
    }

    public void execute(){
        fan.on();
    }

}