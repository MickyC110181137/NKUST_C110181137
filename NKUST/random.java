import java.util.Random;
public class random {
    int min;
    int max;
    String name;

    random (String mathrandomname,int maxval,int minval){
            min = minval;
            max = maxval;
            name = mathrandomname;
        Random rand = new Random();
        int randomNum = minval + rand.nextInt((maxval- minval) + 1);
        System.out.println(randomNum);
    }
}
