import java.util.Scanner;
public class TEST4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Здраствуйте это приложения являеться вашим финансовым помощником который будутет высчитывать ваши расходы за неделю в доларах и евро");
        float[] week = new float[7];
        float cymma = 0;
        for(int day=1, i=0;i<7;i++,day++) {
            System.out.println("Введите ваши расходы в " +day+ " день: ");
            float rasxod = sc.nextFloat();
            week[i] = rasxod;
            cymma = cymma + week[i];
        }
        float dolor,evro;
        dolor = (float) (cymma/98.37);
        evro = (float) (cymma/104.29);
        System.out.println("Ваш расход за неделю в долорах " +dolor+ " $");
        System.out.println("Ваш расход за неделю в евро " +evro+ " EUR");
    }
}
