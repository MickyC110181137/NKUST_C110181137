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
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        person player1 = new person("弓箭手",25,7,10,10, 5,"箭雨");
        player1.setgame("弓箭手","狂戰士","魔法師");
        player1.showplayer();

        person player2 = new person("狂戰士",40,4,6,10, 2,"連續打擊");
        player2.showplayer();
        player2.setgame("弓箭手","狂戰士","魔法師");

        person player3 = new person("魔法師",20,13,15,15, 10,"豪火球");
        player3.showplayer();
        player3.setgame("弓箭手","狂戰士","魔法師");

        System.out.println("\n");

        Random ran = new Random();
        int[] weapon = new int[3];
        for(int j = 0; j < 3 ; j++){
            weapon[j] = ran.nextInt(2);
        }
        if(weapon[0] == 1){
            player1.Att = player1.Att + 10;
            System.out.println(player1.name + "幸運獲得神器[大大弓]，攻擊力提升10點");
        }else{
            System.out.println(player1.name + "很非洲沒有得到神器加持");
        }
        if(weapon[1] == 1){
            player2.Att = player2.Att + 10;
            System.out.println(player2.name + "幸運獲得神器[咖哩棒]，攻擊力提升10點");
        }else{
            System.out.println(player2.name + "很非洲沒有得到神器加持");
        }
        if(weapon[2] == 1){
            player3.Att = player3.Att + 10;
            System.out.println(player3.name + "幸運獲得神器[大棒棒]，攻擊力提升10點");
        }else{
            System.out.println(player3.name + "很非洲沒有得到神器加持");
        }
        System.out.println("\n");
        System.out.println("加持後的屬性面板");
        player1.showplayer();
        player2.showplayer();
        player3.showplayer();
        System.out.println("\n");

        int[] num = new int[40];
        for(int i = 0; i < 40; i++) {
            if (player1.HP > 0 & player2.HP > 0 & player3.HP > 0){
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
                while (player1.HP <= 0 & player2.HP > 0 & player3.HP > 0){
                    i++;
                    num[i] = ran.nextInt(2);
                    System.out.println("第" + (i+1) + "回合");
                    if (num[i] == 0) {
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
                    }else if (num[i] == 1) {
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
                    try {
                        for (int k = 0; k < 1; k++) {
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    catch (Exception e) {System.out.println(e);}
                }
                while (player1.HP > 0 & player2.HP > 0 & player3.HP <= 0) {
                    i++;
                    num[i] = ran.nextInt(2);
                    System.out.println("第" + (i+1) + "回合");
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
                    }else if (num[i] == 1) {
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
                    }
                    try {
                        for (int k = 0; k < 1; k++) {
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    catch (Exception e) {System.out.println(e);}
                }
                while (player1.HP > 0 & player2.HP <= 0 & player3.HP > 0) {
                    i++;
                    num[i] = ran.nextInt(2);
                    System.out.println("第" + (i+1) + "回合");
                    if (num[i] == 0) {
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
                    }else if (num[i] == 1){
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
                    }
                    try {
                        for (int k = 0; k < 1; k++) {
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }
                    catch (Exception e) {System.out.println(e);}
                }
            try {
                for (int k = 0; k < 1; k++) {
                    TimeUnit.SECONDS.sleep(1);
                }
            }
              catch (Exception e) {System.out.println(e);}
            }
            else {System.out.println("GAMEOVER\n最終戰績:");
                player1.showplayer();
                player2.showplayer();
                player3.showplayer();
                i = 39;
            }
        }
    }
}
//123123

