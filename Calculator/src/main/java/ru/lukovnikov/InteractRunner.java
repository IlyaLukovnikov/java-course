package main.java.ru.lukovnikov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *  Запуск калькулятора с пользовательским вводом
 */
public class InteractRunner {

    public static void main(String[] args) throws IOException{
        InteractRunner ranner = new InteractRunner();
        ranner.go();
    }

    private String exit = "no"; // Выход
    private  ArrayList<Double> arguments; // аргументы
    private String operation; // выполняемая операция
    private Calculator calculator = new Calculator();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     *  Запуск
     */
    private void go() throws IOException {
        while (!exit.equals("yes")) {
            chooseOperation();
            enterParams();
            switch (operation) {
                case "add": {
                    calculator.add(arguments);
                    printResult();
                    cleanResult();
                    setExit();
                    break;
                }
                case "sub": {
                    calculator.sub(arguments);
                    printResult();
                    cleanResult();
                    setExit();
                    break;
                }
                case "mul": {
                    calculator.mul(arguments);
                    printResult();
                    cleanResult();
                    setExit();
                    break;
                }
                case "div": {
                    calculator.div(arguments);
                    printResult();
                    cleanResult();
                    setExit();
                    break;
                }
                case "pow": {
                    calculator.pow(arguments);
                    printResult();
                    cleanResult();
                    setExit();
                    break;
                }
            }
        }
    }

    /**
     * Выбор операции
      */
    private void chooseOperation() throws IOException {
        System.out.println("Choose your operation: add/ sub/ mul/ div/ pow");
        operation = reader.readLine();
        while (!operation.equals("add")&& !operation.equals("sub") && !operation.equals("mul") &&
                !operation.equals("div") && !operation.equals("pow")) {
            System.out.println("You should write: add/ sub/ mul/ div/ pow");
            operation = reader.readLine();
        }
    }

    /**
     * Ввод параметров
     */
    private void enterParams() throws IOException {
        arguments = new ArrayList<>();
        int i = 1;
        System.out.println("Write \"stop\" to stop input");
        while (true) {
            System.out.println("Enter " + i + " argument");
            String strArg = reader.readLine();
            if (strArg.equals("stop") ) {
                break;
            }
            try {
                double argument = Double.parseDouble(strArg);
                arguments.add(argument);
                i++;
            }
            catch (NumberFormatException e) {
                System.out.println("You should input number!");
            }
        }
    }

    /**
     * Очистка результата
     * @throws IOException
     */
    private void cleanResult() throws IOException {
        System.out.println("Clear result? y/n");
        String  cleanResult = reader.readLine();
        if (!cleanResult.equals("y") && !cleanResult.equals("n")) {
            while (!cleanResult.equals("y") && !cleanResult.equals("n")) {
                System.out.println("Input y / n");
                cleanResult = reader.readLine();
            }
        }
        if (cleanResult.equals("y")) {
            calculator.clearResult();
        }
    }

    /**
     *  Вывод результата
     */
    private void printResult() {
        System.out.println("Result: " + calculator.getResult());
    }

    private void setExit() throws IOException {
        System.out.println("Exit? : y / n");
        String setExit = reader.readLine();
        if (!setExit.equals("y") && !setExit.equals("n")) {
            while (!setExit.equals("y") && !setExit.equals("n")) {
                System.out.println("Exit? : y / n");
                setExit = reader.readLine();
            }
        }
        if (setExit.equals("y")) {
            exit = "yes";
        }
    }
}
