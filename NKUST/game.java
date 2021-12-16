/*public class game {
    public static void main(String[] args){
        person archer = new person("archer",16,15,31,30,21,20);
        archer.skill = "FUCKYOU";
        archer.Shoutskill();


        person barserkar = new person("barserkar",25,20,15,11,35,30);

        person magician = new person("magician",15,10,40,35,30,25);

    }
}
*/

import java.util.Random;

public class game {
    public static void main(String[] args) {
        person player1 = new person("弓箭手",25,5,10, 5,"箭雨");
        player1.setgame("弓箭手","狂戰士","魔法師");
        player1.showplayer();

        person player2 = new person("狂戰士",45,4,10, 2,"連續打擊");
        player2.showplayer();
        player2.setgame("弓箭手","狂戰士","魔法師");

        person player3 = new person("魔法師",20,15,15, 10,"豪火球");
        player3.showplayer();
        player3.setgame("弓箭手","狂戰士","魔法師");

        System.out.println("\n");

        Random ran = new Random();

        int[] num = new int[20];
        for(int i = 0; i < 20; i++) {
            if (player1.HP > 0 & player2.HP > 0 & player3.HP > 0) {
                num[i] = ran.nextInt(6);
                System.out.println("第" + (i + 1) + "回合");
                if (num[i] == 0) {
                    if (player1.MP >= 5) {
                        player2.HP = player2.HP - player1.Att;
                        player1.MP = player1.MP - 5;
                        player1.playerAtt1();
                        player2.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player1.recover();
                        player1.MP = player1.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 1) {
                    if (player2.MP >= 2) {
                        player3.HP = player3.HP - player2.Att;
                        player2.MP = player2.MP - 2;
                        player2.playerAtt2();
                        player3.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player2.recover();
                        player2.MP = player2.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 2) {
                    if (player3.MP >= 10) {
                        player1.HP = player1.HP - player3.Att;
                        player3.MP = player3.MP - 10;
                        player3.playerAtt3();
                        player1.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player3.recover();
                        player3.MP = player3.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 3) {
                    if (player1.MP >= 5) {
                        player3.HP = player3.HP - player1.Att;
                        player1.MP = player1.MP - 5;
                        player1.playerAtt11();
                        player3.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player1.recover();
                        player1.MP = player1.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else if (num[i] == 4) {
                    if (player2.MP >= 2) {
                        player1.HP = player1.HP - player2.Att;
                        player2.MP = player2.MP - 2;
                        player2.playerAtt12();
                        player1.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player2.recover();
                        player2.MP = player2.MP + 5;
                        System.out.println("------------------------------");
                    }
                } else {
                    if (player3.MP >= 10) {
                        player2.HP = player2.HP - player3.Att;
                        player3.MP = player3.MP - 10;
                        player3.playerAtt13();
                        player2.showplayer();
                        System.out.println("------------------------------");
                    } else {
                        player3.recover();
                        player3.MP = player3.MP + 5;
                        System.out.println("------------------------------");
                    }
                }
            }
            else{
                System.out.println("GAMEOVER\n最終戰績:");
                player1.showplayer();
                player2.showplayer();
                player3.showplayer();
                i = 19;
            }
        }
    }
}
