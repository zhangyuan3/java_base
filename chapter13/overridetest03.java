/*
关于方法覆盖，还有get，set语句
*/

public class overridetest03
{
	public static void main(String[] args){
		Chinese p1 = new Chinese();
		America p2 = new America();
		p1.setName("张三");
		p2.setName("jack");
		p1.speak();
		p2.speak();
	}
}
class People
{
	private String name;
	public People(){}
	public People(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void speak(){
		S.p(name+"会说话。");
	}
}
class Chinese extends People
{
	public void speak(){
		S.p(this.getName()+"正在说汉语");
	}	
}

class America extends People
{
	public void speak(){
		S.p(this.getName()+"正在说英语");
	}
}