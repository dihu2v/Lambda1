public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        int c = calc.devide.apply(a, b);
        // Тут происходит деление на ноль и по-хорошему вычисления
        // проводить с плавающей точкой, но раз у нас Integer,
        // пусть выдаст максимально возможное значение
        calc.println.accept(c);

    }
}