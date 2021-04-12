package shop;

public class MyShopEx {
	public static void main(String[] args) {
		
		MyShop shop = new MyShop();
		//상점 이름 지정
		shop.setTitle("내 상점");
		
		//User 생성
		shop.genUser();
		
		//제품 생성
		shop.genProduct();
		
		//상점 시작
		shop.start();
		
		//제품 목록
		shop.productList();
		
	}
}
