package ch12;

public class Value {
	
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value v = (Value) obj;
		if(this.value == v.value) {
			return true;
		}
		return false;
		
	}
	
}
