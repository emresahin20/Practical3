package udemuProtatip.core;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String data) {
		System.out.println("Veritabanına Loglandı :" + data);
		
	}

}
