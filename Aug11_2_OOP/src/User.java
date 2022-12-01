import java.util.Scanner;

public class User {
	Scanner k = new Scanner(System.in);
	int userCoin;
	String answer;
	
	// µ¿Àü °³¼ö ´ä
	public int tellCoinNum() {
		int tell = k.nextInt();
		if (tell < 2 || tell > 20) {
			System.out.println("------------------------------------------");
			System.out.print("¹üÀ§¸¦ ¹þ¾î³µÀ¸´Ï ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä");
		}
		return tell >= 2 && tell <= 20 ? tell : tellCoinNum();
	}
	// È¦Â¦ ´ä
	public String answer() {
		String a = k.next();
		return a.equals("È¦") || a.equals("Â¦") ? a : answer();
	}
}
