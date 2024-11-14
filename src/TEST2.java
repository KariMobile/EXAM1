import java.util.Scanner;
public class TEST2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Оцените работу приложения: ");
        int i;
        i=0;
        while(i==0){
            int ocenka = sc.nextInt();
        if (ocenka<=0){
            System.out.println("Некорректное число попробуйте снова");
        } else if (ocenka>5) {
            System.out.println("Некорректное число попробуйте снова");
        } else if (ocenka==1) {
            System.out.println("Извините за доставленые не удобства надеюсь в следующий раз мы вас не разочаруем");
            break;
        } else if (ocenka==2) {
            System.out.println("Нам жаль что приложение не удолетворила все ваши потребности");
            break;
        } else if (ocenka==3) {
            System.out.println("Спасибо за оценку и нам жаль что приложение не удолетворила все ваши потребности");
            break;
        } else if (ocenka==4) {
            System.out.println("Спасибо за оценку, мы рады что наше приложение помогло вам");
            break;
        } else if (ocenka==5) {
            System.out.println("Спасибо за высшую оценку нашего приложения");
            break;
        }
        }
    }
}
