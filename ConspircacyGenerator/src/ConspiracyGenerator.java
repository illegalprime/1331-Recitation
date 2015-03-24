import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by mde on 3/23/15.
 */
public class ConspiracyGenerator {

    public static void main(String[] args) {
        String startingUrl = args[0];
        String endingUrl   = args[1];

        System.out.println("Linking " + startingUrl + " -> " + endingUrl);

        getConspiracy(startingUrl, endingUrl, "", new LinkedList<>(), 0);
    }

    public static void getConspiracy(String curr, String end, String path, List<String> visited, int depth) {

        if (depth > 7) {
            return;
        }

        List<String> links = LinkFinder.findLinksFromURL(curr);

        for (String link : links) {

            if (!visited.contains(link)) {

                visited.add(link);
                path += "\n" + link;

                if (link.contains(end)) {
                    System.out.println(path);
                    return;
                }
                getConspiracy(link, end, path, visited, ++depth);
            }
        }
    }
}
