import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
import java.util.SplittableRandom;

public class yahoo {
     public static void main(String[] args) {
            try {

                    Document doc = Jsoup.connect("https://movies.yahoo.com.tw/chart.html").get();
                    System.out.println(doc.title());
                    String way = doc.select("#content_l > div > div.rank_list.table.rankstyle1 > div:nth-child(2) > div:nth-child(4) > a > dl > dd > h2").text();
                    System.out.println("排名: " + 1 + " " + way);
                    int r = 1;
                    for (int a = 3; a <= 21; a++ ){
                        r = r + 1;
                        String way1 = doc.select("#content_l > div > div.rank_list.table.rankstyle1 > div:nth-child(" + a + ") > div:nth-child(4) div").text();
                        System.out.println("排名: " + r + " " + way1);
                    }
                }
            catch (Exception e) {
                System.out.println("error: " + e);
            }
    }
}
