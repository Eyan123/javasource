package ch8;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
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
			System.out.println("*** "+location+"한국 Tire 펑크 ***");
			return false;
		}
	}
	
	
}
