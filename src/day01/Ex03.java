package day01;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.printf("*");
        System.out.println(); // 다음줄로 넘어가는 코드

        // 1. 다음과 같이 정사각형을 출력하는 코드 작성

        //  다음 코드를 5번 반복
        //      *을 printf로 5번 반복해서 출력
        //      다음줄로 넘어가는 코드

        for(Integer i = 0; i<5; i = i + 1) {
            for(Integer j = 0; j<5; j = j + 1) {
                System.out.printf("*");
            }
            System.out.println();
        }

        Integer num1 = 0;
        while(num1 < 5) {
            Integer num2 = 0;
            while(num2<5) {
                System.out.printf("*");
                num2 = num2 + 1;
            }
            System.out.println();
            num1 = num1 + 1;
        }




        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        //  다음 코드를 5번 반복
        //      *을 printf로 반복 횟수만큼 반복해서 출력
        //      다음줄로 넘어가는 코드
        for(Integer i = 0; i<5; i = i + 1) {
            for(Integer j = 0; j < i + 1; j = j + 1) {
                System.out.printf("*");
            }
            System.out.println();
        }

        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        //  다음 코드를 5번 반복
        //      공백을 printf로  점점 줄어들게(4,3,2,1,0) 출력
        //      *을 printf로 2씩 커지면서 반복 횟수만큼 반복해서 출력
        //      다음줄로 넘어가는 코드

        for(Integer i = 0; i<5; i = i + 1) {
            for(Integer j = 4 - i ; j > 0; j = j - 1) {
                System.out.printf(" ");
            }
            for(Integer k = 0 ; k < 2*i+1; k = k + 1) {
                System.out.printf("*");
            }

            System.out.println();
        }

        /*
        ----------
             *
            ***
           *****
          *******
         *********
         ----------
         */

    }
}
