
public class NestedIf {

	public static void main(String[] args) {
		int x = 50;
		int y = 95;

		//compound conditional: 2 boolean st joined &&
		if (x > 40 && x < 100) {
			//to prevent the compound getting too long
			//nesting an if inside an if
			if (y > 80 && y < 120) {
				System.out.println("GOOOOOOOOOAL!!!");
			} else {//else only applies to if immed.
				//before it
				System.out.println("Too far up or down");
			}
		} else { //missed x
			System.out.println("Too far left or right");
		}
	}

}
