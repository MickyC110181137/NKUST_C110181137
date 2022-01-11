import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class yahoo2 {
    public static void main(String[] args) {
        try {
            int s;//1是現正上映的電影，2是電影熱銷排名
            Scanner select = new Scanner(System.in);//建一個scanner來手動輸入
            System.out.println("輸入1的話顯示現正上映的電影，輸入2的話顯示熱銷的電影");
            s = select.nextInt();//使用整數s當選擇的代號
            if (s == 1) {//選擇現正上映的電影
                for (int k = 1; k < 6; k++) {            //用for迴圈抓yahoo的電腦名稱，假設K是資料的代號，然後K=1；K<6是只要抓到第五頁的資料就好，賴宏宇有說也可以寫K<=5，然後K++是每一頁結束就會再加一頁//黃凱祺說要的
                    int i = 0;                                                                                                                                                                //黃凱祺說要的
                    Document doc = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html?page=" + k).get();  //抓yahoo電影上映中的資料                                              //黃凱祺說要的
                    System.out.println(doc.title() + "Page" + k + "---------------------------------------------------------------------------------");  //這個是資料跑出來的時候會分割資料的   //黃凱祺說要的
                    for (int j = 1; j <= 10; j++) {   //J是For迴圈跑十次                                                                                                                     //黃凱祺說要的
                        Elements choose = doc.select("#content_l > div.release_box ul li:nth-child(" + j + ") a");//從doc選擇要抓取電影網址的位置                                             
                        Elements items = doc.getElementsByClass("release_movie_name");//這行加下面兩行用來取得綜合評分分數
                        Element item = items.get(j - 1);//因為要從0開始，所以讓j-1
                        Element num = item.getElementsByTag("span").get(1);
                        Element choose2 = choose.get(0);//從第16行select的位置選取物件
                        String name = doc.getElementsByClass("release_movie_name").get(i).text(); //這個是抓電影名稱，get(i)是抓第i個資料，然後text是抓文字                                   //黃凱祺說要的
                        i = i + 1;   //I是分別抓1到10的電影名稱                                                                                                                            //黃凱祺說要的
                        Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();//進入href裡面的網址
                        Elements items1 = doc2.getElementsByClass("movie_intro_info_r");
                        Element item2 = items1.get(0);//從movie_intro_info_r這個class選取物件
                        String name2 = item2.getElementsByClass("movie_intro_list").get(0).text();//抓導演名稱
                        String name3 = item2.getElementsByClass("movie_intro_list").get(1).text();//抓演員名稱
                        Elements introduction = doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_r > div:nth-child(10) > a");//抓取進入導演簡介位置網址
                        Elements pic = doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_l > div.movie_intro_foto > img");//抓電影封面照
                        System.out.println("宣傳海報: " + pic.attr("src"));
                        System.out.print("電影名稱: " + name);
                        System.out.println(num.attr("data-num"));
                        System.out.println("導演名稱: " + name2);
                        if (doc2.select("#content_l > div:nth-child(1) > div.l_box_inner > div > div > div.movie_intro_info_r > div:nth-child(10) > a").size() == 0) {//沒有導演簡介的話
                            System.out.println("無導演簡介");
                        } else {//有導演簡介的話
                            Element introduction2 = introduction.get(0);
                            Document doc3 = Jsoup.connect(introduction2.absUrl("href")).get();//進入導演簡介網址
                            String introduction3 = doc3.select("#content_l > div.personal_lb > div > div.lbcontennt > div.personal_lb_l._c > p").text();//抓出導演簡介
                            System.out.println("導演簡介: " + introduction3);
                        }
                        System.out.println("演員名稱: " + name3 + "\n");
                    }
                }
            }//s=1
            else if(s == 2){//選擇電影熱銷排名
                Document doc = Jsoup.connect("https://movies.yahoo.com.tw/chart.html").get();                                                                //這
                System.out.println(doc.title());                                                                                                             //是
                String way = doc.select("#content_l > div > div.rank_list.table.rankstyle1 > div:nth-child(2) > div:nth-child(4) > a > dl > dd > h2").text();//我
                System.out.println("排名: " + 1 + " " + way);                                                                                                //做
                int r = 1;                                                                                                                                   //的
                for (int a = 3; a <= 21; a++) {                                                                                                              //謝
                    r = r + 1;                                                                                                                               //謝
                    String way1 = doc.select("#content_l > div > div.rank_list.table.rankstyle1 > div:nth-child(" + a + ") > div:nth-child(4) div").text();  //老
                    System.out.println("排名: " + r + " " + way1);                                                                                            //師
                }
            }
        }catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}

