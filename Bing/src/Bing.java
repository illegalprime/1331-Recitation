import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by mde on 3/23/15.
 */
public class Bing {

    public static void main(String[] args) {

        System.out.println(
         "██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗     ██████╗ ██╗███╗   ██╗ ██████╗ ██╗\n" +
        "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗    ██╔══██╗██║████╗  ██║██╔════╝ ██║\n" +
         "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║    ██████╔╝██║██╔██╗ ██║██║  ███╗██║\n" +
        "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║    ██╔══██╗██║██║╚██╗██║██║   ██║╚═╝\n" +
         "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝    ██████╔╝██║██║ ╚████║╚██████╔╝██╗\n" +
        " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝     ╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝\n");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a search query: ");
        String query = keyboard.nextLine();

        System.out.println("Searching for " + query + "...\n");

        List<Link> searchResults = Scraper.getGoogleLinks(query);

        /*************************************************************
         * This has been the old way of doing things before lambdas! *
         *************************************************************/

        // Filtering
        List<Link> filtered = new LinkedList<>();

        for (Link link : searchResults) {
            if (!link.getTitle().contains("Google")) {
                filtered.add(link);
            }
        }

        // Ordering
        filtered.sort(new Comparator<Link>() {
            @Override
            public int compare(Link o1, Link o2) {
                boolean o1HasBing = o1.getTitle().contains("Bing");
                boolean o2HasBing = o2.getTitle().contains("Bing");

                if (o1 == o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
                else if (o1HasBing) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });

        // Printing
        for (Link link : filtered) {
            System.out.println(link.getTitle());
        }

        /*************************************************************
         * Now labmdas!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! *
         *************************************************************/

//        List<Link> functionalResults = Scraper.getGoogleLinks(query);
//
//        // Filtering
//        functionalResults = functionalResults.stream()
//                .filter(s -> !s.getTitle().toLowerCase().contains("google"))
//                .sorted((l1, l2) -> {
//                    boolean o1HasBing = l1.getTitle().contains("Bing");
//                    boolean o2HasBing = l2.getTitle().contains("Bing");
//
//                    if (l1 == l2) {
//                        return l1.getTitle().compareTo(l2.getTitle());
//                    }
//                    else if (o1HasBing) {
//                        return -1;
//                    }
//                    else {
//                        return 1;
//                    }
//                })
//                .collect(Collectors.toList());
//
//        if (functionalResults.isEmpty()) {
//            System.out.println("Could not find anything matching '" + query + "'");
//        }
//        else {
//            functionalResults.stream().forEach(System.out::println);
//        }
    }
}
