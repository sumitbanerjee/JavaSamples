package test2016;
class FreshJuice{
	enum FreshJuiceSize{small,Medium,Large}
	FreshJuiceSize order;
}
public class FreshJuiceTest {

	public static void main(String[] args) {
		
		FreshJuice  juice = new FreshJuice();
		juice.order = FreshJuice.FreshJuiceSize.Large;
		System.out.println("Order:"+juice.order);
		
	}

}
