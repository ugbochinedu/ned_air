package chapterSix.coin_toss_exercise;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoinTossMain {
    private static CoinTossGame game = new CoinTossGame();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CoinTossGame.getGameMenu());
        int usersInput = scanner.nextInt();
        System.out.println(usersInput);
        do {
            switch (usersInput){
                case 1->game.flip();
                case 2->goodbye();
            }
            System.out.println(CoinTossGame.getGameMenu());
            usersInput = scanner.nextInt();
        }while(usersInput>0&&usersInput<3);

    }

    private static void goodbye() throws InterruptedException {
        displayResult();
        System.out.print("Shutting Down");
        for (int counter = 0; counter < 5; counter++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
    }

    private static void displayResult(){
        game.displayGameResult();
    }
}
