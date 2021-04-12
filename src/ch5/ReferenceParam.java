package ch5;

public class ReferenceParam {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 5, 4 };

		printArr(arr);
//		int sum = sumArr(arr);
//		System.out.println();
//		System.out.println(sum);
		
		sortArr(arr);
		
		printArr(arr);
		
	}

	static void printArr(int[] arr) { // 모든 배열의 요소를 출력
		for (int i : arr) {
			System.out.printf(i + "\t");
		}
		System.out.println();
	}

	static int sumArr(int[] arr) { // 배열의 모든 요소의 합 리턴
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static void sortArr(int[] arr) { // 배열을 오름차순으로 정렬
		for (int i = 0; i < arr.length - 1; i++) { //i<5
			for (int j = 0; j < arr.length - 1 - i; j++) { // i==0 j<5, i==1 j<4
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
