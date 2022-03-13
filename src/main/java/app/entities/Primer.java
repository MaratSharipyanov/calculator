package app.entities;

import java.util.Objects;

public class Primer {
    private final String firstNumber;
    private final String functionType;
    private final String secondNumber;

    public Primer(String firstNumber, String functionType, String secondNumber) {
        this.firstNumber = firstNumber;
        this.functionType = functionType;
        this.secondNumber = secondNumber;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getFunctionType() {
        return functionType;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Primer primer = (Primer) o;
        return firstNumber.equals(primer.firstNumber) && functionType.equals(primer.functionType) && secondNumber.equals(primer.secondNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, functionType, secondNumber);
    }

    @Override
    public String toString() {
        return firstNumber + " " + functionType + " " + secondNumber + " = ";
    }
}
