package singleton;

public class EagerSettings {
	
	/*
	 * 멀티쓰레드 환경에서 안전하게 구현하는 방법2
	 * 이른 초기화
	 * 단점: 미리 만들어 놨는데 쓰지 않으면...
	 * */
	private static final EagerSettings INSTANCE = new EagerSettings();
	
	private EagerSettings() {}
	
	public static EagerSettings getInstance() {
		return INSTANCE;
	}
}
