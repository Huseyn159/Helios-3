package MentorLessons_3_4.Calculator;

public class Main {
    public static void main(String[] args) {
        MathOperation add = Integer::sum;
        MathOperation sub = (x,y)-> x - y;
        MathOperation mul = (x,y) -> x*y;
        MathOperation div = (x,y) -> x/y;

        System.out.println("Toplama "+add.operate(5, 9));
        System.out.println("Chixma " + sub.operate(10, 6));
        System.out.println("Vurma "+mul.operate(4, 5));
        System.out.println("Bolme " + div.operate(10, 2));


    }
}
