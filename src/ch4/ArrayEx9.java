package ch4;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 1~45를 가지고 있는 카드배열 생성

		int card[] = new int[45];

		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}

		for (int no : card) {
			System.out.print(no + " ");
		}

		// 카드 섞기

		for (int i = 0; i < card.length; i++) {
			int pos = (int) (Math.random() * 45);
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = temp;
		}
		// 섞은후 출력
		for (int no : card) {
			System.out.print(no + " ");
		}
	}
}
