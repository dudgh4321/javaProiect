package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SMTP {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.host", "smtp.naver.com");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.port", "587");
		Authenticator auth = new MyAuthentication();
		Session session = Session.getDefaultInstance(p, auth);
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setSentDate(new Date());
			InternetAddress from = new InternetAddress();
			from = new InternetAddress("sender<dudgh4321@naver.com>");
			msg.setFrom(from);
			InternetAddress to = new InternetAddress("dudgh4321@daum.net");
			msg.setRecipient(Message.RecipientType.TO, to);
			msg.setSubject("메일테스트", "UTF-8");
			msg.setText("content", "UTF-8");
			msg.setHeader("content-Type", "text/html");
			javax.mail.Transport.send(msg);
			System.out.println("send ok");
		} catch (AddressException addr_e) {
			addr_e.printStackTrace();
		} catch (MessagingException msg_e) {
			msg_e.printStackTrace();
		}
	}
}

class MyAuthentication extends Authenticator {
	PasswordAuthentication account;

	public MyAuthentication() {
		String id = "dudgh4321";
		String pw = "d102030159!";
		account = new PasswordAuthentication(id, pw);
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return account;
	}
}
