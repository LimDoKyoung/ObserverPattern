package observerPatter_Ex;

public class longVacation {
	public static void main(String[] ar){
		// ȸ�� ����
		YoungJin yjg = new YoungJin();
		
		// Youngjin�� �Ի� (Observer�� ���)
		Member Jang = new Member(yjg, "Jang");
		Member Hong = new Member(yjg, "Hong");
		Member kjg = new Member(yjg, "kjg");
		Member iseul = new Member(yjg, "iseul");
		Member Limdo = new Member(yjg, "Limdo");
		
		// Youngjin�� ��� (Observer ����)
		yjg.removeObserver(Jang);
		yjg.removeObserver(Hong);
		
		// 10�� 2�� �ӽð������� ���� ������ �뺸!
		yjg.setRestDate("10�� 2��", false);
		
		// ����� �������̰� 10�� 2���� ����!!!
		yjg.setRestDate("10�� 2��", true);
	}
}
