public class test01
{
	public static void main(String[] args){
		Animal a1 = new Animal();
		a1.move();
		cat c1 = new cat();
		c1.move();
		Bird b1 = new Bird();
		b1.move();

		Animal a2 = new cat();
		a2.move();
		cat c2 = new Animal();
		c2.move();
	}
}