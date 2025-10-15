//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    public static void main(String[] args) {
        String text = "Текст сообщения!";
        Notification<String> email = new EmailNotification();
        String result = send(text, email);
        System.out.println(result);
    }

    private static String send(String text, Notification<String> notification) {
        return notification.send(text);
    }
}