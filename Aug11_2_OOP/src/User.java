import java.util.Scanner;

public class User {
	Scanner k = new Scanner(System.in);
	int userCoin;
	String answer;
	
	// ���� ���� ��
	public int tellCoinNum() {
		int tell = k.nextInt();
		if (tell < 2 || tell > 20) {
			System.out.println("------------------------------------------");
			System.out.print("������ ������� �ٽ� �Է����ּ���");
		}
		return tell >= 2 && tell <= 20 ? tell : tellCoinNum();
	}
	// Ȧ¦ ��
	public String answer() {
		String a = k.next();
		return a.equals("Ȧ") || a.equals("¦") ? a : answer();
	}
}
