package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보

        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        // Player 클래스 생성 (이름, 무기)

        Player player01;
        player01 = new Player();
        player01.name = "player01";
        player01.weapon = (int)(Math.random()*3)+1;

        Player player02;
        player02 = new Player();
        player02.name = "player02";
        player02.weapon = (int)(Math.random()*3)+1;

        // 무승부면 반복
        while(player01.weapon == player02.weapon) {
            System.out.println(player01.weapon);
            System.out.println(player02.weapon);
            System.out.println("무승부");
            //      player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장
            //      player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장
            //      둘 중에 이긴 사람 이름 출력
            player01.weapon = (int)(Math.random()*3)+1;
            player02.weapon = (int)(Math.random()*3)+1;

        }
        System.out.println(player01.weapon);
        System.out.println(player02.weapon);
        // 1은 가위, 2는 바위, 3은 보
        if(player01.weapon == 1 && player02.weapon ==2 || player01.weapon == 2 && player02.weapon ==3 || player01.weapon == 3 && player02.weapon ==1) {
            System.out.println("player02 승리!!");
        } else {
            System.out.println("player01 승리!!");
        }

    }
}
