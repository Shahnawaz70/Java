

public class InvalidException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid Roll Number and Password please provide correct credential";
	}
}
