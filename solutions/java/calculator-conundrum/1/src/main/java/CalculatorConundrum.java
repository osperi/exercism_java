
class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        String result = "";
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        try {
            switch (operation) {
                case "+":
                    result = String.valueOf(operand1 + operand2);
                    break;
                /*case "-":
                    result = String.valueOf(operand1 - operand2);
                    break;*/
                case "*":
                    result = String.valueOf(operand1 * operand2);
                    break;
                case "/":
                    result = String.valueOf(operand1 / operand2);
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        if (result.equals("")) {
            throw new UnsupportedOperationException("Invalid operation");
        } else {
            result = operand1 + " " + operation + " " + operand2 + " = " + result;
        }
        return result;
        //throw new UnsupportedOperationException("Please implement the CalculatorConundrum.calculate() method");
    }
}
