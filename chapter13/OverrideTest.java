public class OverrideTest
{
	public static void main(String[] args){
		Bird b = new Bird();
		b.move();
	}
}
class Animal{
	public void move(){
		S.p("动物在移动！");
	}
}
class Bird extends Animal
{
	public void move(){
		S.p("鸟儿在飞翔!");
	}
}