package singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �̱��� ���� 
		 * 1. �ν��Ͻ��� ���� �ϳ��� �����ϴ� Ŭ����
		 * 2. �ϳ��� �ν��Ͻ��� �۷ι��ϰ� �����ϴ� ����� ����
		 * */
		
		/*���� ��ü�� �ΰ��� ����� �� ��ü�� �ٸ� ��ü��*/
		
		/*
		Settings set1 = new Settings();
		Settings set2 = new Settings();
		
		System.out.println(set1 != set2);
		*/
		
		Settings set1 = Settings.getInstance();
		Settings set2 = Settings.getInstance();
		
		System.out.println(set1 != set2);
	}

}
