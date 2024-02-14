
//Serverからfrom変数とto変数を受け取る。
//受け取った2つの変数をPrimeNumberFinderクラスに渡して、素数判定計算を行ってもらう。
//PrimeNumberFinderクラスから返ってきた計算結果を元のサーバーに渡す。
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSample
 */

public class ServletSample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//from変数とto変数を取得
		String fromStr = request.getParameter("from");
		String toStr = request.getParameter("to");
		
		int from = Integer.parseInt(fromStr);
		int to = Integer.parseInt(toStr);
		
		//別のクラスのインスタンスを作成
		PrimeNumberFinder otherClass = new PrimeNumberFinder();
		
		//from変数とto変数を別のクラスに渡す
		List<Integer> primeNumbers = otherClass.getPrimeNumbers(from,to);
		
		//結果をサーバーに返す
		response.getWriter().print(primeNumbers);
	}
}
