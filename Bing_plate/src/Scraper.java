import org.jsoup.Jsoup;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mde on 3/23/15.
 */
public class Scraper {

    private static final String prefix = "https://www.google.com/search?q=";

    public static List<Link> getGoogleLinks(String query) {
        List<Link> links;

        try {
            links = Jsoup
                .connect(prefix + URLEncoder.encode(query, "UTF-8"))
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) "
                         + "Gecko/20070725 Firefox/2.0.0.6")
                .get()
                .select("h3.r")
                .select("a")
                .stream()
                .map(link ->
                    new Link(
                        decodeURL(link.attr("href").substring(7, link.attr("href").indexOf('&'))),
                        link.text())
                )
                .collect(Collectors.toList());
        }
        catch (IOException err) {
            err.printStackTrace();
            links = new LinkedList<>();
        }

        return links;
    }

    private static String decodeURL(String url) {
        try {
            return URLDecoder.decode(url, "UTF-8");
        }
        catch (UnsupportedEncodingException err) {
            return url;
        }
    }
}
