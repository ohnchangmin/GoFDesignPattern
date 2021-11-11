package singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 싱글톤 패턴 
		 * 1. 인스턴스를 오직 하나만 제공하는 클래스
		 * 2. 하나의 인스턴스에 글로벌하게 접근하는 방법을 제공
		 * */
		
		/*셋팅 객체를 두개를 만들면 두 객체는 다른 객체임*/
		
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
