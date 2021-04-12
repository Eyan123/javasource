package ch10;

public class ColorTV extends TV{

	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
		
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}


	ColorTV printProperty() {
		System.out.println(this.getSize() + "인치 " + color +"컬러");
		return this;
	}
	
}
