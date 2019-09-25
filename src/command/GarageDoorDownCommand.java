package command;

public class GarageDoorDownCommand implements Command {
    Door door;

    public GarageDoorDownCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.on();
    }
}


