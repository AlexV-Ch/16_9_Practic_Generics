//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    public static void main(String[] args) {

        Notification<String> email = new EmailNotification();
        Notification<String> sms = new SmsNotification();
        Notification<String> push = new PushNotification();

        Email email1 = new Email("adres@server.ru", "Тема сообщения", "Текст сообщения !");
        String result1 = send(email1.getText(), email);
        System.out.println("EMAIL");
        System.out.println("subject: " + email1.getSubject());
        System.out.println("receivers: " + email1.getAdres());
        System.out.println("message: " + result1);

        Sms sms1 = new Sms("+7 903 852-56-89", "Текст сообщения СМС !");
        System.out.println("SMS");
        System.out.println("receivers: " + sms1.getTelefon());
        System.out.println("message: " + send(sms1.getText(), sms));

        Push push1 = new Push("Alex", "Тема сообщения", "Текст сообщения Push !");
        System.out.println("PUSH");
        System.out.println("receiver: " + push1.getAkkaunt());
        System.out.println("title: " + push1.getSubject());
        System.out.println("message: " + send(push1.getText(), push));



    }

    private static String send(String text, Notification<String> notification) {
        return notification.send(text);
    }
}