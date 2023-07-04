package udemuProtatip.core;

public class MailLogger implements BaseLogger{

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi :" + data);
		
	}

}
