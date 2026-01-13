import static commons.Commons.*;

void main() {
    printSubject(this::printDataType);
    printSubject(this::printTypeCasting);
    printSubject(this::printVariablePractice);
    printSubject(this::printConstants);
    printSubject(this::printAssignment);
}

void printDataType() {
    printTitle("실습 1: 기본 타입 사용");
    byte byteVar = 127;
    short shortVar = 32767;
    int intVar = 2147483647;
    long longVar = 9223372036854775807L;
    printSubtitle("정수형");
    System.out.println("byteVar: " + byteVar);
    System.out.println("shortVar: " + shortVar);
    System.out.println("intVar: " + intVar);
    System.out.println("longVar: " + longVar);
}

void printTypeCasting() {
    printTitle("실습 2: 형변환");
    printSubtitle("자동 형변환");
    int intNum = 100;
    long longNum = intNum;
    float floatNum = longNum;
    double doubleNum = floatNum;
    System.out.println("intNum: " + intNum);
    System.out.println("longNum: " + longNum);
    System.out.println("floatNum: " + floatNum);
    System.out.println("doubleNum: " + doubleNum);
    
    printSubtitle("강제 형변환");
    double pi = 3.14159;
    int intPi = (int) pi;
    System.out.println("pi: " + pi);
    System.out.println("intPi: " + intPi);
    
    int bigNumber = 1000;
    byte smallNumber = (byte) bigNumber;
    System.out.println("bigNumber: " + bigNumber);
    System.out.println("smallNumber: " + smallNumber + " -- overflow");
    
    printSubtitle("char 와 int의 형변환");
    char ch = 'A';
    int ascii = ch;
    System.out.println("'A'의 ASCII: " + ascii);
    
    int code = 66;
    char letter = (char) code;
    System.out.println("66의 문자: " + letter);
}

void printVariablePractice() {
    printTitle("실습 3: 변수 활용");
    String name = "장길웅";
    int age = 32;
    double height = 171;
    boolean isStudent = true;
    char grade = 'B';
    
    printSubtitle("학생 정보");
    System.out.println("이름: " + name);
    System.out.println("나이: " + age);
    System.out.println("키: " + height);
    System.out.println("학생 여부: " + isStudent);
    System.out.println("학점: " + grade);
    
    age = 33;
    grade = 'A';
    
    printSubtitle("1년 후");
    System.out.println("나이: " + age);
    System.out.println("학점: " + grade);
}

void printConstants() {
    printTitle("실습 4: 상수 사용");
    final double PI = 3.141592;
    final int MAX_STUDENTS = 30;
    final String SCHOOL_NAME = "코딩 부트캠프";
    System.out.println("학교: " + SCHOOL_NAME);
    System.out.println("최대 학생 수: " + MAX_STUDENTS);
    
    double radius = 5.0;
    double area = PI * radius * radius;
    System.out.printf("반지름 %f인 원의 넓이: %f", radius, area);
}

void printAssignment() {
    printTitle("실습 과제: 쇼몰 상품 정보");
    final double TAX_RATE = 0.1;
    
    String productName = "노트북";
    int price = 150_000;
    int quantity = 2;
    boolean isAvailable = true;
    char category = 'E';
    
    int totalPrice = price * quantity;
    double tax = totalPrice * TAX_RATE;
    double finalPrice = totalPrice + tax;

    printSubtitle("상품 정보");
    System.out.println("상품명: " + productName);
    System.out.println("단가: " + price);
    System.out.println("수량: " + quantity);
    System.out.println("카테고리: " + category);
    System.out.println("재고 여부: " + isAvailable);

    printSubtitle("결제 정보");
    System.out.println("상품 금액: " + totalPrice + "원");
    System.out.println("세금 (10%): " + tax + "원");
    System.out.println("최종 금액: " + finalPrice + "원");
}