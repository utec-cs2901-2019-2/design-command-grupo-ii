package command;

public class GarageDoorUpCommand implements Command {
    Door door;

    public GarageDoorUpCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.on();
    }
}


