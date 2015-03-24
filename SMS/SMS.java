public class SMS {

    public static final int LIMIT = 160;

    public String to;
    public String from;
    public String message;

    public SMS(String to, String from, String message) {
        this.to = to;
        this.from = from;
        this.message = message;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof SMS)) {
            return false;
        }
        SMS otherSMS = (SMS) other;
        return to.equals(otherSMS.to)
        && from.equals(otherSMS.from)
        && message.equals(otherSMS.message);
    }
}
