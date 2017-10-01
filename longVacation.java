package observerPatter_Ex;

public class longVacation {
	public static void main(String[] ar){
		// 회사 설립
		YoungJin yjg = new YoungJin();
		
		// Youngjin에 입사 (Observer로 등록)
		Member Jang = new Member(yjg, "Jang");
		Member Hong = new Member(yjg, "Hong");
		Member kjg = new Member(yjg, "kjg");
		Member iseul = new Member(yjg, "iseul");
		Member Limdo = new Member(yjg, "Limdo");
		
		// Youngjin에 퇴사 (Observer 제거)
		yjg.removeObserver(Jang);
		yjg.removeObserver(Hong);
		
		// 10월 2일 임시공휴일을 쉬지 않음을 통보!
		yjg.setRestDate("10월 2일", false);
		
		// 사실은 거짓말이고 10월 2일은 쉰다!!!
		yjg.setRestDate("10월 2일", true);
	}
}
