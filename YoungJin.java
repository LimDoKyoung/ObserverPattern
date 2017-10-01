package observerPatter_Ex;

import java.util.ArrayList;
import java.util.HashMap;

public class YoungJin implements Subject{

	private HashMap<Observer, String> yjgMembers;
	private String Name;
	// 날짜
	private String Date;
	// 쉬는 여부
	private Boolean RestYN;
	
	public YoungJin() {
		// TODO Auto-generated constructor stub

		yjgMembers = new HashMap<>();
	}

	@Override
	public void registerObserver(Observer o, String Name) {
		// TODO Auto-generated method stub
		this.Name = Name;
		yjgMembers.put(o, Name);
		System.out.println("Welcome! "+yjgMembers.get(o));
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(yjgMembers.containsKey(o)){
			System.out.println("ByeBye~ "+yjgMembers.get(o));
			yjgMembers.remove(o);
		}
	}

	//  옵저버들에게 알림
	@Override
	public void notifyChanged() {
		// TODO Auto-generated method stub
		for (Observer Key : yjgMembers.keySet()) {
			Observer member = Key;
			member.update(Date, RestYN);
		}
	}
	
	public void checkRestChanged(){
		notifyChanged();
	}
	
	public void setRestDate(String Date, boolean RestYN){
		this.Date = Date;
		this.RestYN = RestYN;
		checkRestChanged();
	}

}
