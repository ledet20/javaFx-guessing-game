

public class RemainingAttempts implements decrement{
	private int numOfAttempts;

	public RemainingAttempts(int numOfAttempts) {
		this.numOfAttempts = numOfAttempts;
	}
	
	public void resetAttempts(int num) {
		num = numOfAttempts;
	}

	public int decrementAmountAvailable() {
		numOfAttempts--;
		return numOfAttempts;
	}

	
}
