/*import java.util.Random;
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
*/

public class person {
    int HP, Att, MP , mplost;
    String name, player1, player2, player3;

    String skillName;

    person(String playername ,int playerHP, int playerAtt, int playerMP, int playermplost, String playerskill){
        name = playername;
        HP = playerHP;
        Att = playerAtt;
        MP = playerMP;
        mplost = playermplost;
        skillName = playerskill;
    }

//    game(String med){
//
//    }

    void showplayer(){
        System.out.print(name);
        System.out.print("[");
        System.out.print("HP:" + HP);
        System.out.print("/Att:" + Att);
        System.out.print("/MP:" + MP);
        System.out.print("]" + "\n");
    }

    void setgame(String player1, String player2, String player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

//    int getHP() {
//        return this.HP;
//    }
//
//    int getAtt() {
//        return this.Att;
//    }
//
//    int getMP() {
//        return this.MP;
//    }

//    String getSkillName() {
//        return this.skillName;
//    }

    String playername(){
        return this.name;
    }

//    void showplayer1() {
//        System.out.println(this.player1 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
//    }
//    void showplayer2() {
//        System.out.println(this.player2 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
//    }
//    void showplayer3() {
//        System.out.println(this.player3 + "[" + "HP:" + getHP() + "/" + "Att:" + getAtt() + "/" + "MP:" + getMP() + "]");
//    }

    void player1shout() {
        System.out.println(this.name + "使出技能: " + skillName);
    }
    void player2shout() {
        System.out.println(this.name + "使出技能: " + skillName);
    }
    void player3shout() {
        System.out.println(this.name + "使出技能: " + skillName);
    }

    void attack(){
        System.out.print("消耗" + mplost + "MP攻擊");
    }
    void attacked(){
        System.out.print(name);
    }

    void attack1() {
        System.out.println("消耗5MP攻擊" + this.player2);
    }
    void attack2() {
        System.out.println("消耗2MP攻擊" + this.player3);
    }
    void attack3() {
        System.out.println("消耗10MP攻擊" + this.player1);
    }
    void attack11() {
        System.out.println("消耗5MP攻擊" + this.player3);
    }
    void attack12() {
        System.out.println("消耗2MP攻擊" + this.player1);
    }
    void attack13() {
        System.out.println("消耗10MP攻擊" + this.player2);
    }

    void recover() {
        System.out.println(this.name + "攻擊，能量不足，回復5點能量");
    }
//    void recover2() {
//        System.out.println(this.name + "攻擊，能量不足，回復5點能量");
//    }
//    void recover3() {
//        System.out.println(this.name + "攻擊，能量不足，回復5點能量");
//    }

    void playerAtt1(){
        player1shout();
        attack2();
        //showplayer1();
    }
    void playerAtt2(){
        player2shout();
        attack2();
        //showplayer2();
    }
    void playerAtt3(){
        player3shout();
        attack3();
        //showplayer3();
    }
    void playerAtt11(){
        player1shout();
        attack11();
        //showplayer1();
    }
    void playerAtt12(){
        player2shout();
        attack12();
        // showplayer2();
    }
    void playerAtt13(){
        player3shout();
        attack13();
        //showplayer3();
    }





}