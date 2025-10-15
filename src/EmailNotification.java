public class EmailNotification implements Notification<String>{

    @Override
    public String send(String t1) {
        return "<p>" + t1 +"</p>";
    }
}
