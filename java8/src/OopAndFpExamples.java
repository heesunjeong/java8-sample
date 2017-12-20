/**
 * Created by heesun on 2017. 12. 15..
 */
public class OopAndFpExamples {

    public static void main(final String[] args) {
        final OopCalculatorService oopCalculatorService = new OopCalculatorService(new Addition(), new Subtraction(), new Multiplication(), new Division());

        int result1 = oopCalculatorService.add(12, 4);
        System.out.println("oop add: " + result1);

        int result2 = oopCalculatorService.subtraction(12, 4);
        System.out.println("oop subtraction: " + result2);

        int result3 = oopCalculatorService.multiplication(12, 4);
        System.out.println("oop multiplication: " + result3);

        int result4 = oopCalculatorService.division(12, 4);
        System.out.println("oop division: " + result4);

        final FpCalculatorService fpCalculatorService = new FpCalculatorService();
        System.out.println("fp add: " + fpCalculatorService.calculate((num1, num2) -> num1 + num2, 12, 4));
        System.out.println("fp subtraction: " + fpCalculatorService.calculate((num1, num2) -> num1 - num2, 12, 4));
        System.out.println("fp multiplication: " + fpCalculatorService.calculate((num1, num2) -> num1 * num2, 12, 4));
        System.out.println("fp division: " + fpCalculatorService.calculate((num1, num2) -> num1 / num2, 12, 4));

    }
}

class OopCalculatorService {
    private final Calculation addition;
    private final Calculation subtraction;
    private final Calculation multiplication;
    private final Calculation division;

    OopCalculatorService(Calculation addition, Calculation subtraction, Calculation multiplication, Calculation division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public int add(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return addition.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int subtraction(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return subtraction.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int multiplication(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return multiplication.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

    public int division(final int num1, final int num2) {
        if (num1 > 10 && num2 < num1) {
            return division.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }
}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}

class FpCalculatorService {
    public int calculate(Calculation calculation, int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1: " + num1 + ", num2: " + num2);
        }
    }

}