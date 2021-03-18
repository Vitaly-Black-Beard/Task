package Calculator;
import java.util.Scanner;


public class Calculator {

	    private static boolean its_an_arabic_numbers = true;

	    private static String[] pars(String input) {
	        String[] parsed_input = input.split(" ");
	        if (parsed_input.length != 3) {
	            Scanner inputValueAgain = new Scanner(System.in);
	            System.out.println("Некоректный ввод данных. Введите числа, разделяя каждую _пробелом_");
	            input = inputValueAgain.nextLine();
	            return pars(input);
	        } else {
	            return parsed_input;
	        }
	    }


	    public static void main(String[] args) {

	        Scanner inputValue = new Scanner(System.in);
	        System.out.println("Input: " + "\n");
	        String input = inputValue.nextLine();
	        while (!input.isEmpty()) {
	            String[] parsed_input = Calculator.pars(input);
	            String operation = parsed_input[1];
	            Function values;
	            int value1 = 0;
	            int value2 = 0;
	            // Переводим в int. Если введены римские, выкинет исключение
	            try {
	                value1 = Integer.parseInt(parsed_input[0]);
	                value2 = Integer.parseInt(parsed_input[2]);
	                
	            } catch (NumberFormatException e) {
	                its_an_arabic_numbers = false;
	                
	            }

	            if (its_an_arabic_numbers) {
	                values = new ArabicNumbers(value1, value2);
	            } else {
	                values = new RomanNumbers(parsed_input[0], parsed_input[2]);
	            }

	            if (operation.equals("+")) {
	                values.sum();
	            } else if (operation.equals("-")) {
	                values.sub();
	            } else if (operation.equals("/") || operation.equals(":")) {
	                values.div();
	            } else if (operation.equals("*") || operation.equals("x")) {
	                values.mul();
	            }

	            if (its_an_arabic_numbers) {
	                System.out.println("\n" + "Output: " + "\n" + "\n" + values.getResult());
	            } else {
	                System.out.println("\n" + "Output: " + "\n" + "\n "+ values.getStringResult());
	            }
	            System.out.println();
	            System.out.print("Input: " + "\n" + "\n");
	            input = inputValue.nextLine();
	        }
	        System.out.println("Вы вышли из калькулятора");

	    }
	}


