//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    public static void main(String[] args) {
        String text = "Текст сообщения !";
        Notification<String> email = new EmailNotification();
        String result = send(text, email);
        System.out.println(result);
        Notification<String> sms = new SmsNotification();
        String result1 = send(text, sms);
        System.out.println(result1);

        Email email1 = new Email("adres@123", "tema", "text 123");
        Notification<String> email2 = new EmailNotification();
        String result2 = send(email1.getText(), email2);
        System.out.println(result2);


    }

    private static String send(String text, Notification<String> notification) {
        return notification.send(text);
    }
}