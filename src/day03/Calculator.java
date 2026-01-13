package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        boolean isContinue = true;
        
        while (isContinue) {
            System.out.print("첫 번째 숫자: ");
            String s = reader.readLine();
            double num1 = Double.parseDouble(s);
    
            System.out.print("연산자 (+, -, *, /): ");
            s = reader.readLine();
            String operator = s.trim();
    
            System.out.print("두 번째 숫자: ");
            s = reader.readLine();
            double num2 = Double.parseDouble(s);
            
            double result = 0;
            
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> System.out.println("잘못된 연산자 입니다.");
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            
            while (true) {
                System.out.print("계속 하시려면 c, 그만 하시려면 x 를 입력해주세요: ");
                s = reader.readLine();
                String command = s.trim();
                if (command.equals("c")) {
                    break;
                } else if (command.equals("x")) {
                    isContinue = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("올바른 값을 입력해 주세요. (q, x)");
                    continue;
                }
            }
        }

        reader.close();
    }
}
