import static commons.Commons.*;

void main() {
    printSubject(this::calculator);
    printSubject(this::conditionCheck);
    printSubject(this::compoundAssignment);
    printSubject(this::shoppingCalculator);
}

void calculator() {
    printTitle("실습 1: 계산기");
    int num1 = 20;
    int num2 = 7;
    
    printSubtitle("기본 계산기");
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    
    printSubtitle("실수 나눗셈");
    System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
    
    printSubtitle("증감 연산자");
    int x = 10;
    System.out.println("초기값: " + x);
    System.out.println("x++: " + x++);
    System.out.println("현재x: " + x);
    System.out.println("++x: " + ++x);
}

void conditionCheck() {
    printTitle("실습 2: 조건 판단");
    int age = 25;
    int score = 85;
    
    printSubtitle("비교 연산");
    System.out.println("성인 여부 (age >= 18): " + (age >= 18));
    System.out.println("합격 여부 (score >= 60: " + (score >= 60));
    
    printSubtitle("논리 연산");
    boolean canApply = (age >= 20) && (score >= 70);
    System.out.println("지원 가능 (20세 이상 AND 70점 이상: " + canApply);
    
    boolean getDiscount = (age < 20) || (age >= 65);
    System.out.println("할인 대상 (20세 미만 OR 65세 이상: " + getDiscount);
    
    printSubtitle("삼항 연산자");
    String result = (score >= 60) ? "합격" : "불합격";
    System.out.println("결과: " + result);
    
    char grade = (score >= 90) ? 'A':
                 (score >= 80) ? 'B':
                 (score >= 70) ? 'C':
                 (score >= 60) ? 'D': 'F';
    System.out.println("학점: " + grade);
}

void compoundAssignment() {
    printTitle("실습 3: 복합 대입 연산자");
    int x = 10;
    printSubtitle("복합 대입 연산자");
    System.out.println("초기값: " + x);
    
    x += 5;
    System.out.println("x += 5: " + x);
    
    x -= 3;
    System.out.println("x -= 3: " + x);
    
    x *= 2;
    System.out.println("x *= 2: " + x);
    
    x /= 4;
    System.out.println("x /= 4: " + x);
    
    x %= 4;
    System.out.println("x %= 4: " + x);
    
    printSubtitle("문자열 연결");
    String message = "Hello";
    message += " ";
    message += "World";
    message += "!";
    System.out.println(message);
}

void shoppingCalculator() {
    printTitle("과제: 쇼핑 계산기");
    
    int price = 15_000;
    int quantity = 3;
    double discountRate = 0.1;
    
    int totalPrice = price * quantity;
    double discount = price * discountRate;
    double finalPrice = totalPrice - discount;
    
    System.out.println("╔════════════════════════════════╗");
    System.out.println("║         쇼핑 계산서               ║");
    System.out.println("╠════════════════════════════════╣");
    System.out.println("║ 단가:     " + price + "원                ║");
    System.out.println("║ 수량:     " + quantity + "개                    ║");
    System.out.println("║ 합계:     " + totalPrice + "원                ║");
    System.out.println("║ 할인:     -" + (int) discount + "원                ║");
    System.out.println("╠════════════════════════════════╣");
    System.out.println("║ 최종금액: " + (int) finalPrice + "원                 ║");
    System.out.println("╚════════════════════════════════╝");

    String shipping = (finalPrice >= 30_000) ? "무료 배송" : "배송비 3,000 원";
    System.out.println("배송비: " + shipping);
    
    boolean canExtraDiscount = (quantity >= 5) || (totalPrice >= 50_000);
    System.out.println("추가 할인 가능: " + canExtraDiscount);
}