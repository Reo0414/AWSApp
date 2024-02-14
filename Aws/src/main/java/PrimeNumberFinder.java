import java.util.ArrayList;
import java.util.List;

//ServletSampleから受け取った変数の値の間で素数を判定する計算
//計算終了後、ServletSampleクラスに計算結果を渡す。
public class PrimeNumberFinder{
	public List<Integer> getPrimeNumbers(int from, int to){
		List<Integer> primeNumbers = new ArrayList<>();
		
		for(int i = from; i <= to; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	private boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
