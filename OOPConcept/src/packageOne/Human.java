package packageOne;

public class Human extends Animal{
	
	
	int a = 10;
	
	public void eat() {
		System.out.println("eat breafast");
	}
	
	public void eat(String lunch) {
		System.out.println("eat lunch");
	}
	
	public void eat(int lunchItem) {
		System.out.println("eat lunch"+lunchItem);
	}
	
	public void eat(double lunchItem) {
		System.out.println("eat lunch"+lunchItem);
	}
	
	public void eat(String dinner, String salad) {
		System.out.println("eat dinner"+dinner +""+salad);
	}
	
	public void eat(String snack, String salad, String tea) {
		System.out.println("eat dinner"+snack+salad+tea);
	}
	
	public void sleep() {
		System.out.println("sleep on bed");
	}
	
	public void walk() {
		System.out.println("walking");
	}
	
	public void breath() {
		System.out.println("human breath oxygen");
	}
	
}
