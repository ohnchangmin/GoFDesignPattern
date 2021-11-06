package singleton;

public class Settings {
	
	private static Settings instance;
	
	/*new를 사용하지 못하도록 private한 생성자를 만들기*/
	private Settings() {}
	
	public static Settings getInstance() {
		
		if(instance == null) {
			instance = new Settings();
		}
		
		return instance;
	}
}
