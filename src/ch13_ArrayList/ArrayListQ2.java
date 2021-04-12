package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQ2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Double> num = new ArrayList<Double>();

		double max = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("값을 입력해주세요 : ");
			num.add(Double.parseDouble(sc.nextLine()));
		}

		for (int i = 0; i < num.size(); i++) {
			if (max < num.get(i)) {
				max = num.get(i);
			}
			System.out.print(num.get(i)+"\t");
		}
		System.out.println();
		System.out.println("가장 큰 수는 : " + max);

	}
}
