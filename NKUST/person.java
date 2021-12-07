public class person {
    int hp;
    int att;
    int mp;
    String name;
    String skill;

    int gethp(){
        return this.hp;
    }
    int getatt(){
        return this.hp;
    }
    int getmp(){
        return this.hp;
    }
    String getname() {
        return this.name; //this 指向此類別本身
    }
    String getskill() {
        return this.skill; //this 指向此類別本身
    }

    void Shoutskill() {
        //method member
        System.out.println("EAT MY SKILL  " + getskill().toUpperCase() + "!!!!!!!!!!!"); //於類別內呼叫getMyName函數
    }
}
