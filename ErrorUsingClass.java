import com.Akash.Exception.PlayRuntimeException;

public class ErrorUsingClass {

	public int minusNumbers (int number) throws PlayRuntimeException {
		if(number < 20) {
			throw new PlayRuntimeException("number is small.");
		}
		return number - 5;
	}
}
