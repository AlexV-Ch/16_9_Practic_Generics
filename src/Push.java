public class Push {
    private String akkaunt;
    private String subject;
    private String text;

    public Push(String akkaunt, String subject, String text) {
        this.akkaunt = akkaunt;
        this.subject = subject;
        this.text = text;
    }

    public String getAkkaunt() {
        return akkaunt;
    }

    public void setAkkaunt(String akkaunt) {
        this.akkaunt = akkaunt;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Push{" +
                "akkaunt='" + akkaunt + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
