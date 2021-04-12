package ch8;

public class KumhoookTire extends Tire {

	public KumhoookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+ "Tire 수명 : " + 
					(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+"금호 Tire 펑크 ***");
			return false;
		}
	}
	
	
}
