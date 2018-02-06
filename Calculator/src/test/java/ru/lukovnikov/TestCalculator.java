package test.java.ru.lukovnikov;

import main.java.ru.lukovnikov.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * Тестирование калькулятора
 */
public class TestCalculator {
    private Calculator calculator;
    private ArrayList arguments;

    /**
     * Создаем экхемпляр калькулятора и список аргументов
     */
    @Before
    public void init () {
        calculator = new Calculator();
        arguments = new ArrayList<>();
    }

    /**
     * Сложение двух чисел
     */
    @Test
    public void additionTwoNumbersTest() {
        arguments.add(1.0);
        arguments.add(2.0);
        calculator.add(arguments);
        assertEquals(3, calculator.getResult(), 1);
    }

    /**
     * Сложение трех чисел
     */
    @Test
    public void additionThreeNumbersTest() {
        arguments.add(1.5);
        arguments.add(2.0);
        arguments.add(7.3);
        calculator.add(arguments);
        assertEquals(10.8, calculator.getResult(), 1);
    }

    /**
     * Сложение без параметров
     */
    @Test
    public void additionWhithoutArgumentsTest() {
        calculator.add(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Вычитание  двух чисел
     */
    @Test
    public void subtractionTwoNumbersTest() {
        arguments.add(1.0);
        arguments.add(2.0);
        calculator.sub(arguments);
        assertEquals(-1, calculator.getResult(), 1);
    }

    /**
     * Вычитание трех чисел
     */
    @Test
    public void subtractionThreeNumbersTest() {
        arguments.add(1.5);
        arguments.add(2.0);
        arguments.add(7.3);
        calculator.sub(arguments);
        assertEquals(-7.8, calculator.getResult(), 1);
    }

    /**
     * Вычитание без параметров
     */
    @Test
    public void subtractionWhithoutArgumentsTest() {
        calculator.sub(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Умножение  двух чисел
     */
    @Test
    public void multiplicationTwoNumbersTest() {
        arguments.add(3.0);
        arguments.add(2.0);
        calculator.mul(arguments);
        assertEquals(6, calculator.getResult(), 1);
    }

    /**
     * Умножение  трех чисел
     */
    @Test
    public void multiplicationThreeNumbersTest() {
        arguments.add(1.5);
        arguments.add(2.0);
        arguments.add(-7.3);
        calculator.mul(arguments);
        assertEquals(-21.9, calculator.getResult(), 1);
    }

    /**
     * Умножение  на ноль
     */
    @Test
    public void multiplicationByZeroTest() {
        arguments.add(1.5);
        arguments.add(2.0);
        arguments.add(0.0);
        calculator.mul(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Умножение без параметров
     */
    @Test
    public void multiplicationWhithoutArgumentsTest() {
        calculator.mul(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Деление  двух чисел
     */
    @Test
    public void divisionTwoNumbersTest() {
        arguments.add(3.0);
        arguments.add(2.0);
        calculator.div(arguments);
        assertEquals(1.5, calculator.getResult(), 1);
    }

    /**
     * Деление трех чисел
     */
    @Test
    public void divisionThreeNumbersTest() {
        arguments.add(9.0);
        arguments.add(3.0);
        arguments.add(-3.0);
        calculator.div(arguments);
        assertEquals(-1, calculator.getResult(), 1);
    }

    /**
     * Деление на ноль
     */
    @Test
    public void divisionByZeroTest() {
        arguments.add(2.0);
        arguments.add(0.0);
        calculator.div(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Деление без параметров
     */
    @Test
    public void divisionWhithoutArgumentsTest() {
        calculator.div(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }

    /**
     * Возведение в степень
     */
    @Test
    public void exponentiationTest() {
        arguments.add(5.0);
        arguments.add(2.0);
        calculator.pow(arguments);
        assertEquals(25, calculator.getResult(), 1);
    }

    /**
     * Возведение в нулевую степень
     */
    @Test
    public void exponentiationToNullDegreeTest() {
        arguments.add(5.0);
        arguments.add(0.0);
        calculator.pow(arguments);
        assertEquals(1, calculator.getResult(), 1);
    }

    @Test
    public void exponentiationWhithoutArgumentsTest() {
        calculator.pow(arguments);
        assertEquals(0, calculator.getResult(), 1);
    }
}
