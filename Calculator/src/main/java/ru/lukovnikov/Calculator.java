package ru.lukovnikov;

import java.util.ArrayList;

/**
 *Реализует калькулятор
 */
public class Calculator {
    /**
     * Результат вычислений
     */
    private double result = 0;

    /**
     *	Суммируем аргуметы
     * @param params Аргументы суммитрования
     */
    public void add(ArrayList<Double> params) {
        for (double param: params) {
            this.result += param;
        }
    }

    /**
     *	Вычитание
     * @param params Аргументы вычитаются
     */
    public void sub(ArrayList<Double> params) {
        try {
            double sub = params.get(0);
            for (int i = 1; i < params.size(); i++) {
                sub -= params.get(i);
            }
            if (this.result == 0) {
                this.result = sub;
            }
            else {
                this.result -= sub;
            }
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Arguments not entered");
        }
    }

    /**
     *	Перемножаем аргуметы
     * @param params Аргументы перемножаются
     */
    public void mul(ArrayList<Double> params) {
        try {
            double mul = params.get(0);
            for (int i = 1; i < params.size(); i++) {
                mul *= params.get(i);
            }
            if (this.result == 0) {
                this.result = mul;
            }
            else {
                this.result *= mul;
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Arguments not entered");
        }
    }

    /**
     *	Деление
     * @param params деление аргументов
     */
    public void div(ArrayList<Double> params) {
        try {
            double div = params.get(0);
            for (int i = 1; i < params.size(); i++) {
                if (params.get(i) == 0) {
                    System.out.println("Error: division by zero");
                    return;
                }
                div /= params.get(i);
            }
            if (this.result == 0) {
                this.result = div;
            }
            else {
                this.result /= div;
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Arguments not entered");
        }
    }

    /**
     *	Возведение в степень
     */
    public void pow(ArrayList<Double> params) {
        try {
            result = Math.pow(params.get(0), params.get(1));
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Arguments not entered");
        }
    }

    /**
     *	Получить результат
     *	@return результат вычисления
     */
    public double getResult() {
        return this.result;
    }

    /**
     *	Очистить результат вычисления
     */
    public void clearResult() {
        this.result = 0.0;
    }
}