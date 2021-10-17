public class test
{
	public static void main(String[] args){
		Master zhangsan = new Master();
		Pet caiQuan = new Dog();
		zhangsan.feed(caiQuan);
		Cat lanMao = new Cat();
		zhangsan.feed(lanMao);
	}
}