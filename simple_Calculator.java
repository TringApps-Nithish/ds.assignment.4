import java.util.Scanner;

interface Operation {
    int calculate(int x, int y);
}

class Addition implements Operation {

    public int calculate(int x, int y) {
        return x + y;
    }

}

class Subtraction implements Operation {

    public int calculate(int x, int y) {
        return x - y;
    }

}

class Multiplication implements Operation {

    public int calculate(int x, int y) {
        return x * y;
    }

}

class Division implements Operation {

    public int calculate(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException(" Cannot divide by zero ");
        } else
            return x / y;
    }

}

class simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\t\t----- Simple_Calculator -----\n");
        System.out.printf("Enter first number: ");
        int x = input.nextInt();
        System.out.printf("Enter second number: ");
        int y = input.nextInt();

        Operation[] operations = new Operation[] { new Addition(), new Subtraction(), new Multiplication(),
                new Division() };

        System.out.println("\n\tAvailable operations :\n");
        System.out.println(" 1. + (Addition) \n 2. - (Subraction) \n 3. * (Product) \n 4. / (Division) ");

        System.out.print("\n Enter operation number: ");
        int operationNumber = input.nextInt();
        Operation operation = operations[operationNumber - 1];

        int result = operation.calculate(x, y);
        System.out.println(" Result: " + result);
    }
}