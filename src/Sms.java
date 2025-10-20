public class Sms {
    private String telefon;
    private String text;

    public Sms(String telefon, String text) {
        this.telefon = telefon;
        this.text = text;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "telefon='" + telefon + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
