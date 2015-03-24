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
    }
}
