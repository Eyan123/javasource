package ch4;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[] {1,2,3,4,5};
		int iArr3[] = {1,2,3,4,5};
		char chArr[] = {'a','b','c','d','e'}; 
		double dArr[] = {35.5,36,5,37.5};
		boolean bArr[] = {true, false, false, true};
		
		
		for(int arr:iArr3) {
			System.out.println(arr);
		}
		
	}
}
