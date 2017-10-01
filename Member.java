package observerPatter_Ex;

public class Member implements Observer{
	
	private String Name;
	private String Date;
	private Boolean RestYN;
	private Subject youngjin;
	
	
	public Member(Subject youngjin, String Name) {
		// TODO Auto-generated constructor stub
		this.youngjin = youngjin;
		this.Name = Name;
		youngjin.registerObserver(this, Name);
	}

	@Override
	public void update(String Date, boolean RestYN) {
		// TODO Auto-generated method stub
		this.Date = Date;
		this.RestYN = RestYN;
		say();		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		if(RestYN == true)
			System.out.println(Name+ " : Yeah~! "+Date+" ½®´Ù!");
		else
			System.out.println(Name+ " : Ahhhh~~~ Á¦¹ß...");
	}

}
