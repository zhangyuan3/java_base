public class overridetest04
{
	public static void main(String[] args){
		MyDate d1 = new MyDate();
		S.p(d1.toString());
	}
}
class MyDate
{
	private int year;
	private int month;
	private int day;
	public MyDate(){
		this(1970,1,1);
	}
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month =month;
		this.day=day;
	}
	public void setYear(int year){
		this.year =year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		this.month =month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		this.day =day;
	}
	public int getDay(){
		return day;
	}
	//方法覆盖 toString
	public String toString(){
		return year+"年"+month+"月"+day+"日";
	}
}