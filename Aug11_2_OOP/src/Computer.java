import java.util.Random;

public class Computer {
	Random r = new Random();
	int playCoin;
	// ����
	public void startGame() {
		System.out.println("���� 20���� ������ �����ϰڽ��ϴ�.");
		System.out.println("------------------------------------------");
	}
	// ��ǻ�Ͱ� �������� �����߿��� �� ���� ���� �����
	public int askCoinNum(User u) {
		System.out.print("�� ���� �������� ������ �Ͻðڽ��ϱ�? ");
		int coinNum = u.tellCoinNum();
		System.out.println("------------------------------------------");
		return coinNum;
	}
	// ��ǻ�Ͱ� ©©���ؼ�
	public int shakeCoin(User u) {
		System.out.println("©��©��");
		System.out.println("------------------------------------------");
		int c = r.nextInt(u.userCoin - 1) + 2;
		return c;
	}
	// �������� Ȧ/¦ �����
	public String askAnswer(User u) {
		System.out.print("Ȧ ? ¦ ? ");
		String a = u.answer();
		System.out.println("------------------------------------------");
		return a;
	}
	// ����
	public void judgeResult(User u) {
		if (playCoin % 2 == 0) {
			if (u.answer.equals("¦")) {
				System.out.println(playCoin + "�� �̹Ƿ�");
				System.out.println("�����Դϴ�~");
			} else {
				System.out.println(playCoin + "�� �̹Ƿ�");
				System.out.println("Ʋ�Ƚ��ϴ� �̤�");
			}
		} else {
			if (u.answer.equals("Ȧ")) {
				System.out.println(playCoin + "�� �̹Ƿ�");
				System.out.println("�����Դϴ�~");
			} else {
				System.out.println(playCoin + "�� �̹Ƿ�");
				System.out.println("Ʋ�Ƚ��ϴ� �̤�");
			}
		}
	}
	
	public void progress(User u) {
		startGame();
		u.userCoin = askCoinNum(u);
		playCoin = shakeCoin(u);
		u.answer = askAnswer(u);
		judgeResult(u);
	}
	
	
}
