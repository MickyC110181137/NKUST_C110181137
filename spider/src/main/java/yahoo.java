import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.SplittableRandom;

public class yahoo {
        public static void main (String[]args){
            try {
                for (int k = 1; k < 6; k++) {            //用for迴圈抓yahoo的電腦名稱，假設K是資料的代號，然後K=1；K<6是只要抓到第五頁的資料就好，賴宏宇有說也可以寫K<=5，然後K++是每一頁結束就會再加一頁
                    int i = 0;
                    Document doc = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html?page=" + k).get();  //抓yahoo電影上映中的資料
                    System.out.println(doc.title() + "Page" + k + "---------------------------------------------------------------------------------");  //這個是資料跑出來的時候會分割資料的
                    for (int j = 1; j <= 10; j++) {   //J是For迴圈跑十次
                        String name = doc.getElementsByClass("release_movie_name").get(i).text(); //這個是抓電影名稱，get(i)是抓第i個資料，然後text是抓文字
                        i = i + 1;   //I是分別抓1到10的電影名稱
                        System.out.println("電影名稱: " + name);  //叫出"電影名稱:" + 抓到的電影名稱的資料
                    }
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
    }

