package command;

public class Fan {
	private boolean isHigh = false;

	public void high() {
		isHigh = true;
		System.out.println("Celling Fan is high");
	}

	public void low() {
		isHigh = false;
		System.out.println("Ceiling Fan is losw");
	}

}
