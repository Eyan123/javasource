package ch10;

public class ImplementationCEx {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
	}
}
