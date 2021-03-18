package Calculator;
public class ArabicNumbers extends Function {

    private int value1;
    private int value2;
    private int result;

    ArabicNumbers(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() {
    	if(value1 <= 10 & value2 <= 10) {
        this.result = value1 + value2;
        }
        else {
        	System.out.println("Не коректный ввод данных. Введите новые значения");
        }
    }

    public void sub() {
    	if(value1 <= 10 & value2 <= 10) {
        this.result = value1 - value2;
        }
    	else {
    		
    		System.out.println("Не коректный ввод данных. Введите новые значения");
    	}
    }

    public void div() {
        try{
        	if(value1 <= 10 & value2 <= 10) {
            this.result = value1 / value2;
            }
        	else {
        		System.out.println("Не коректный ввод данных. Введите новые значения");
        	}
        } catch (ArithmeticException e) {
            System.out.print("Деление на 0! ");
            return;
        }
        
    }

    public void mul() {
    	if (value1 <= 10 & value2 <= 10) {
        this.result = value1 * value2;
        }
        else {
    	System.out.println("Не коректный ввод данных. Введите новые значения");
        }
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public String getStringResult() {
        return "" + result;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}