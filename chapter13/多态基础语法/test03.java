public class test03
{
	public static void main(String[] args){
		AnimalTest at = new AnimalTest();
		at.test(new cat());
		at.test(new Bird());
	}
}
class AnimalTest
{
	public void test(Animal a){
		if (a instanceof Bird)
		{
			Bird b = (Bird)a;
			b.sing();
		}else if (a instanceof cat)
		{
			cat c = (cat)a;
			c.catchMouse();
		}
	}
}