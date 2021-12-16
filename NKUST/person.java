import java.util.Random;
public class person {
    int minhp;
    int maxhp;
    int minatt;
    int maxatt;
    int minmp;
    int maxmp;
    String name;
    String skill;

    person(String personname ,int hpmax,int hpmin,int attmax,int attmin,int mpmax,int mpmin){
        name = personname;
        minhp = hpmin;
        maxhp = hpmax ;
        minatt = attmin;
        maxatt = attmax ;
        minmp = mpmin;
        maxmp = mpmax ;
        System.out.println("NAME: "+name);

        Random ran1 = new Random();
        int hp= minhp + ran1.nextInt((maxhp- minhp) + 1);
        System.out.println("HP: "+hp);

        Random ran2 = new Random();
        int att = minatt + ran2.nextInt((maxatt- minatt) + 1);
        System.out.println("ATT: "+att);

        Random ran3 = new Random();
        int mp = minmp + ran3.nextInt((maxmp- minmp) + 1);
        System.out.println("MP: "+mp);
    }

    String getskill() {
        return this.skill; //this 指向此類別本身
    }

    void Shoutskill() {
        //method member
        System.out.println("EAT MY SKILL  " + getskill().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }
}
