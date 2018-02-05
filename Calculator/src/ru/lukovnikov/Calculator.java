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
        double sub = params.get(0);
        for(int i = 1; i < params.size(); i++) {
            sub -= params.get(i);
        }
        this.result += sub;
    }

    /**
     *	Перемножаем аргуметы
     * @param params Аргументы перемножаются
     */
    public void mul(ArrayList<Double> params) {
        double mul = params.get(0);
        for(int i = 1; i < params.size(); i++) {
            mul *= params.get(i);
        }
        this.result += mul;
    }

    /**
     *	Деление
     * @param params деление аргументов
     */

    public void div(ArrayList<Double> params) {
        try {
            double div = params.get(0);
            for(int i = 1; i < params.size(); i++) {
                div /= params.get(i);
            }
            this.result += div;
        }
        catch(ArithmeticException e){
            System.out.println("Деление на ноль. Введите другие аргуметы");
        }
    }

    /**
     *	Возведение в степень
     */
    public void pow(ArrayList<Double> params) {
        result = Math.pow(params.get(0), params.get(1));
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