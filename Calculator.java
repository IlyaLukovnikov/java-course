/**
*Реализует калькулятор
*/
public class Calculator {
	/**
	* Результат вычислений 
	*/
	private double result;
	
	/**
	*	Суммируем аргуметы
	*	@param params Аргументы суммитрования
	*/
	public void add(double... params) {
		for (double param: params) {
			this.result += param;
		}
	}
	
	/**
	*	Вычитание
	*	@param params Аргументы вычитаются
	*/
	public void sub(double...params) {
		for(double param: params) {
			this.result -= param;
		}
	}
	
	/**
	*	Перемножаем аргуметы
	*	@param params Аргументы перемножаются
	*/
	
	public void mul(double... params) {
		for (double param: params) {
			this.result *= param;
		}
	}
	
	/**
	*	Деление
	*	@param params деление аргументов
	*/
	
	public void div(double... params) {
		try {
			for(double param: params) {
				this.result /= param;
			}
		}
		catch(ArithmeticException e){
			System.out.println("Деление на ноль. Введите другие аргуметы");
		}
	}
	
	/**
	*	Возведение в степень
	*	@param base Основание степени
	*	@param exponent Показатель степени
	*/
	public void pow(double base, double exponent) {
		result = Math.pow(base, exponent);
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