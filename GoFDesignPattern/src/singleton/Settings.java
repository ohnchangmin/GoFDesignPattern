package singleton;

public class Settings {
	
	private static Settings instance;
	
	/*new�� ������� ���ϵ��� private�� �����ڸ� �����*/
	private Settings() {}
	
	public static Settings getInstance() {
		
		if(instance == null) {
			instance = new Settings();
		}
		
		return instance;
	}
}
