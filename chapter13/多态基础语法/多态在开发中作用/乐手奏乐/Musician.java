public class Musician
{
	private String name;
	public void Musician(){}
	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return name;
	}
	public void play(Instrument i){
		System.out.print(name);
		i.makeSound();
	}

}