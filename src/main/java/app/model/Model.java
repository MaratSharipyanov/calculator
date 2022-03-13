package app.model;

import app.entities.Primer;

public class Model {

    private static String result;
    private static double num;
    private static boolean divideByZero = false;

    public static String calcAction(Primer primer) {
        String firstNumber = primer.getFirstNumber();
        String functionType = primer.getFunctionType();
        String secondNumber = primer.getSecondNumber();

        double aNumb = 0;
        String answer1 = null;
        if (isNumeric(firstNumber)) {
            aNumb = num;
        } else answer1 = "1st number is " + result;

        double bNumb = 0;
        String answer3 = null;
        if (isNumeric(secondNumber)) {
            bNumb = num;
            divideByZero = true;
        } else answer3 = " 2nd number is " + result;

        String func = null;
        String answer2 = null;
        if (functionSearch(functionType, bNumb)) {
            func = result;
        } else answer2 = " Function is " + result;

        divideByZero = false;

        String finalResult;
        if (answer1 != null || answer2 != null || answer3 != null) {
            if (answer1 == null) answer1 = " ";
            if (answer2 == null) answer2 = " ";
            if (answer3 == null) answer3 = " ";
            finalResult = answer1 + answer2 + answer3;
        } else {
            double result = calcAnswer(aNumb, func, bNumb);
            finalResult = primer.toString() + result;
        }
        return finalResult;
    }

    private static boolean isNumeric(String c) {
        if (c == null || c.trim().equals("")) {
            result = "empty.";
            return false;
        } else {
            try {
                num = Double.parseDouble(c.trim());
                return true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                result = "not a number.";
                return false;
            }
        }
    }

    private static boolean functionSearch (String s, double n) {
        if (s == null || s.trim().equals("")) {
            result = "empty.";
            return false;
        } else if (s.trim().equals("/") && n == 0.0 && divideByZero){
            result = "wrong, because you can't divide by 0.";
            return false;
        } else if (s.trim().equals("+") || s.trim().equals("-") || s.trim().equals("*") || s.trim().equals("/")){
            result = s.trim();
            return true;
        }
        else {
            result = "not a value.";
            return false;
        }
    }

    private static double calcAnswer (double a, String function, double b) {
        double calculationAnswer;
        return switch (function) {
            case "+" -> calculationAnswer = a + b;
            case "-" -> calculationAnswer = a - b;
            case "*" -> calculationAnswer = a * b;
            default -> calculationAnswer = a / b;
        };
    }

}
