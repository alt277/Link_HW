package Game;

import java.util.Random;

class Game {
    public static void main(String[] args) {

        Random randomStep = new Random();
        Random randomHealing = new Random();
        int round = 25;

        Team team1 =new Team(4);
        Team team2 =new Team(4);


//        Hero[] team1 = new Hero[]{
//                 new Warrior(),
//                 new Warrior(),
//                 new Assasin(),
//                 new Doctor()};
//        Hero[] team2 = new Hero[]{
//                 new Warrior(),
//                 new Assasin(),
//                 new Assasin(),
//                 new Doctor()};

        for (Hero t1: team1.team) {
            t1.info();
        }
        System.out.println("----------");
        for (Hero t2: team2.getTeam()) {
            t2.info();
        }
        System.out.println("----------");

    //    for (int j = 0; j < round; j++)
        while ( team1.counter>1 &&  team2.counter >1){

            for (int i = 0; i < team1.counter && i <team2.counter; i++) {

                Random rnd=new Random();
                int j=(int)(rnd.nextInt(team1.counter));
                if(randomStep.nextInt(2) == 0) {

                    if(team1.team[i] instanceof Doctor) {
                        team1.team[i].healing(team1.team[randomHealing.nextInt(4)]);
                        team1.team[i].hit(team2.team[i]);
//                         team1.team[i].hit(team2.team[j]);
                    } else if (team2.team[i].health>0) {
                        System.out.println("counter2= "+ team2.counter);
                        team1.team[i].hit(team2.team[i]);
//                         team1.team[i].hit(team2.team[j]);
                        if(team2.team[i].health<=0) {team2.counter--;
//                        if(team2.team[j].health<=0) {team2.counter--;
                            System.out.println("counter2= "+ team2.counter);}
                    }

                } else {

                    if(team2.team[i] instanceof Doctor) {
                        team2.team[i].healing(team2.team[randomHealing.nextInt(4)]);
 //                       team2.team[i].hit(team1.team[i]);
                    } else if(team1.team[i].health>0) {
                        System.out.println("counter1= "+team1.counter);
                        team2.team[i].hit(team1.team[i]);
                        if(team1.team[i].health<=0){ team1.counter--;
                            System.out.println("counter1= "+team1.counter);
                        }
                    }
                }
            }
        }
        System.out.println("--------");
        for (Hero t1: team1.team) {
            t1.info();
        }
        System.out.println("--------");
        for (Hero t2: team2.team) {
            t2.info();
        }
        System.out.println("----------");
        if (team1.counter> team2.counter)
            System.out.println("Победила команда 1 на счету "+team1.counter);
        else
            System.out.println("Победила команда 2 на счету "+team2.counter);
        System.out.println("счетчик команды #1  "+team1.counter);
        System.out.println("счетчик команды #2  "+team2.counter);
//        Random My=new Random();
//        int a= My.nextInt(100);
//        System.out.println("rndomMy= "+My+" a="+a);
//        int b=60+(int)(Math.random()*5);
//        System.out.println("Math.random()*100="+b);
//        String h=new String("Aa");
//
//        char ch=h.charAt(0);
//        int c=(int)ch;
//        System.out.println(c);
//        char ch1=(char)(65+Math.random()*25);
//        System.out.println("ch1= "+ch1);
//        String s=new String();
//        s=s+"";
//        StringBuffer sb = new StringBuffer();
//        String sb=new String();
//        System.out.println(sb);
//        for (int i=0;i<6;i++){
//            char ch2;
//          if(i==0) ch2=(char)(65+My.nextInt(3)*4);
//            else if(i==2||i==4) ch2=(char)(97+My.nextInt(3)*4);
//            else ch2=(char)(98+My.nextInt(10)*2);
//            sb+=ch2;
//        }
//        System.out.println(sb);
//        int q=1;
//       q+= (1+1 < 3 ? 4+4:7);
//        System.out.println(q);
//        Random Rnd=new Random();
//        String str=new String();
//        int f=(Rnd.nextInt(2)) ;
//        System.out.println(f);

    }
}