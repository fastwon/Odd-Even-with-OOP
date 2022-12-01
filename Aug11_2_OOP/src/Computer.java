import java.util.Random;

public class Computer {
	Random r = new Random();
	int playCoin;
	// 시작
	public void startGame() {
		System.out.println("동전 20개로 게임을 시작하겠습니다.");
		System.out.println("------------------------------------------");
	}
	// 컴퓨터가 유저한테 동전중에서 몇 개로 할지 물어보고
	public int askCoinNum(User u) {
		System.out.print("몇 개의 코인으로 게임을 하시겠습니까? ");
		int coinNum = u.tellCoinNum();
		System.out.println("------------------------------------------");
		return coinNum;
	}
	// 컴퓨터가 짤짤이해서
	public int shakeCoin(User u) {
		System.out.println("짤랑짤랑");
		System.out.println("------------------------------------------");
		int c = r.nextInt(u.userCoin - 1) + 2;
		return c;
	}
	// 유저한테 홀/짝 물어보고
	public String askAnswer(User u) {
		System.out.print("홀 ? 짝 ? ");
		String a = u.answer();
		System.out.println("------------------------------------------");
		return a;
	}
	// 판정
	public void judgeResult(User u) {
		if (playCoin % 2 == 0) {
			if (u.answer.equals("짝")) {
				System.out.println(playCoin + "개 이므로");
				System.out.println("정답입니다~");
			} else {
				System.out.println(playCoin + "개 이므로");
				System.out.println("틀렸습니다 ㅜㅜ");
			}
		} else {
			if (u.answer.equals("홀")) {
				System.out.println(playCoin + "개 이므로");
				System.out.println("정답입니다~");
			} else {
				System.out.println(playCoin + "개 이므로");
				System.out.println("틀렸습니다 ㅜㅜ");
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
