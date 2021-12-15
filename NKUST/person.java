public class person {
    int hp;
    int att;
    int mp;
    String name;
    String skill;

    person(String personname ,int personhp,int personatt,int personmp){
        name = personname
        hp = personhp
        att = personatt
        mp = personmp
    }

    String getskill() {
        return this.skill; //this 指向此類別本身
    }

    void Shoutskill() {
        //method member
        System.out.println("EAT MY SKILL  " + getskill().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }
}
