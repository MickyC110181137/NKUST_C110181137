import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.SplittableRandom;

public class yahoo {
        public static void main (String[]args){
            try {
                for (int k = 1; k < 6; k++) {
                    int i = 0;
                    Document doc = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html?page=" + k).get();
                    System.out.println(doc.title() + "Page" + k + "---------------------------------------------------------------------------------");
                    for (int j = 1; j <= 10; j++) {
                        String name = doc.getElementsByClass("release_movie_name").get(i).text();
                        i = i + 1;
                        System.out.println("電影名稱: " + name);
                    }
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
    }

