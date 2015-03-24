/**
 * Created by mde on 3/23/15.
 */
public class Link {
    private String href;
    private String name;

    public Link(String url, String title) {
        href = url;
        name = title;
    }

    public String getUrl() {
        return href;
    }

    public String getTitle() {
        return name;
    }

    @Override
    public String toString() {
        return '"' + name + "\" -> " + href;
    }
}
