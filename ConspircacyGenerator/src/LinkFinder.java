import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mde on 3/23/15.
 */
public class LinkFinder {

    public static List<String> findLinksFromURL(String url) {
        List<String> links = new LinkedList<String>();

        try {
            ProcessBuilder pb = new ProcessBuilder("/bin/bash", "/home/mde/scraper.sh", url);
            final Process process = pb.start();

            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                links.add(line);
            }
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        return links;
    }
}
