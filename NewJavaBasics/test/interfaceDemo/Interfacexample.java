package interfaceDemo;

public class Interfacexample implements centralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		centralTraffic a = new Interfacexample();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		Interfacexample at = new Interfacexample();
		ContinentalTraffic ct = new Interfacexample();
		at.walkonsymbol();
		ct.Trainsymbol();

	}

	@Override
	public void redStop() {
// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
//code
	}

	@Override
	public void greenGo() {
// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}

	@Override
	public void Trainsymbol() {
// TODO Auto-generated method stub
System.out.println("Train");
	}

}


