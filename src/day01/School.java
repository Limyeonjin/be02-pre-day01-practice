package day01;

class School {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        // 객체를 저장할 수 있는 변수 생성
        Student lyj;

        // 앞에서 만든 변수에 new로 객체를 생성해서 =으로 저장
        lyj = new Student();
        lyj.age = 26;
        lyj.name = "임연진";
        lyj.major = true;


        Student hkd;
        hkd = new Student();

        // 객체 안에 있는 변수, 메소드를 사용할 때는 변수이름 다음 . 사용
        hkd.age = 31;
        hkd.name = "홍길동";



        Student kkm;
        kkm = new Student();
        kkm.age = 27;
        kkm.name = "김경미";
        kkm.major = false;


        Integer totalAge;
        totalAge = lyj.age + hkd.age * kkm.age; // * 먼저하고 + 하고 마지막으로 = 으로 저장됨


        // 산술 연산자
        Integer result;
        result = lyj.age + hkd.age; // 57
        System.out.println(result);
        result = lyj.age - hkd.age; // -5
        System.out.println(result);
        result = lyj.age * hkd.age;
        System.out.println(result);// 806
        result = lyj.age / hkd.age;
        System.out.println(result);// 0, 몫만 나옴
        result = lyj.age % hkd.age;
        System.out.println(result); // 26

        // 괄호 -> 산술 -> 비교 -> 논리 -> 대입 의 순서대로 연산해야함

        // 비교 연산자
        Boolean result2;
        result2 = lyj.age > hkd.age; // false
        System.out.println(result2);


        // 논리 연산자 - &&(곱셈 같은애) ||(덧셈 같은애}
        //  연산        결과
        //  f && f      f
        //  f && f      f
        //  t && t      t



        Lecture linux;
        linux = new Lecture();
        linux.name = "리눅스 기초";
        linux.time = 2;


        Lecture db;
        db = new Lecture();
        db.name = "데이터 베이스";
        db.time = 8;

        Lecture softwareEngineering;
        softwareEngineering = new Lecture();
        softwareEngineering.name = "소프트웨어 공학";
        softwareEngineering.time = 3;




    }
}