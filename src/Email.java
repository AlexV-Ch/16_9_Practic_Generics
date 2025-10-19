public class Email {
    private String adres;
    private String subject;
    private String text;

    public Email(String adres, String subject, String text) {
        this.adres = adres;
        this.subject = subject;
        this.text = text;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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
}
