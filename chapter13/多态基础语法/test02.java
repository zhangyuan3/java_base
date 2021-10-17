public class test02
{
	public static void main(String[] args){
		Animal x = new Bird();
		Animal y = new cat();
		if (x instanceof Bird)
		{
			Bird b = (Bird)x;
			b.sing();
		}else if (x instanceof cat)
		{
			cat c = (cat)x;
			c.catchMouse();
		}
		if (y instanceof Bird)
		{
			Bird b = (Bird)y;
			b.sing();
		}else if (y instanceof cat)
		{
			cat c = (cat)y;
			c.catchMouse();
		}
	}
}