package singleton;

public class DoubleCheckedLocking {
	
	/*double checked locking을 활용한 싱글톤 패턴*/
	private static volatile DoubleCheckedLocking instance;
	
	private DoubleCheckedLocking() {
		
	}
	
	/*
	 * if문 안에 여러 쓰레드가 동시에 들어올 때만 synchronized를 쓰기 때문에
	 * 훨씬 성능에 유리
	 * 단점: 상당히 복잡한 방법임 - volatile을 왜 써야하는지 까지 알려면... 자바 1.4버전 이상에서만 작동
	 * */
	public static DoubleCheckedLocking getInstance() {
		if(instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if(instance == null) {
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
