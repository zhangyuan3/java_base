public class OverrideTest
{
	public static void main(String[] args){
		Bird b = new Bird();
		b.move();
	}
}
class Animal{
	public void move(){
		S.p("�������ƶ���");
	}
}
class Bird extends Animal
{
	public void move(){
		S.p("����ڷ���!");
	}
}