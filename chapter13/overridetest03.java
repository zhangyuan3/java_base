/*
���ڷ������ǣ�����get��set���
*/

public class overridetest03
{
	public static void main(String[] args){
		Chinese p1 = new Chinese();
		America p2 = new America();
		p1.setName("����");
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
		S.p(name+"��˵����");
	}
}
class Chinese extends People
{
	public void speak(){
		S.p(this.getName()+"����˵����");
	}	
}

class America extends People
{
	public void speak(){
		S.p(this.getName()+"����˵Ӣ��");
	}
}