package Game;

public class Cards{
String name;
int val;

	public Cards(int v){
		this.val=v;
		this.name=findName(v);
	}
	
	public String findName(int n) {
		if(n<11) {
			return ""+n;
		}
		else if(n==14) {
			return "Ace";
		}
		else if(n==11) {
			return "Jack";
		}
		else if(n==12) {
			return "Queen";
		}
		else if(n==13) {
			return "King";
		}
		else {
			return "invalid";
		}
	}
	
	public int value() {
		return this.val;
	}
}