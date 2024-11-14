import java.util.Scanner;
public class TEST1 {
    public static void main(String[] args) {
        float i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите массу тела(кг):");
        float m = sc.nextFloat();
        System.out.println("");
        System.out.println("Введите рост тела(м):");
        float h = sc.nextFloat();
        i=m/(h*h);
        if (i<=16){
            System.out.println("");
            System.out.println(i+ " Выраженый дефицит массы тела");
        }else if (i<=18.5 & i>16){
            System.out.println("");
            System.out.println(i+ " Дефицит массы тела");
        } else if (i<=25 & i>18.5) {
            System.out.println("");
            System.out.println(i+ " Норма");
        } else if (i<=30 & i>25) {
            System.out.println("");
            System.out.println(i+ " Избыточная масса тела");
        } else if (i<=35 & i>30) {
            System.out.println("");
            System.out.println(i+ " Ожирение 1-й степени");
        } else if (i<=40 & i>35) {
            System.out.println("");
            System.out.println(i+ " Ожирение 2-й степени");
        } else if (i>40) {
            System.out.println("");
            System.out.println(i+ " Ожирение 3-й степени");
        }
    }
}
