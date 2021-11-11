package singleton;

public class SynchronizedSettings {
	
	private static SynchronizedSettings instance;
	
	private SynchronizedSettings() {}
	
	/*
	 * 멀티쓰레드 환경에서 안전하게 구현하는 방법1
	 * 단점: 성능저하의 이슈가 있음
	 * */
	public static synchronized SynchronizedSettings getInstance() {
		
		if(instance == null) {
			instance = new SynchronizedSettings();
		}
		
		return instance;
	}
}
