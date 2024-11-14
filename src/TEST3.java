import java.util.Arrays;
import java.util.Scanner;
public class TEST3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Добро пожаловать в приложения для состовления списка фильмов которые вы будете просматривать");
        System.out.println("В списке приложения вы можете хранить 30 фильмов если вы хотите выйти из програмы введите 'exit' или 'выход'");
        String[] films = new String[30];
        for (int i=0;i<30;i++){
            String film = sc.nextLine();
            if ((film.equalsIgnoreCase("exit")) | (film.equalsIgnoreCase("exit"))){
                break;
            }
            films[i]=film;
        }
        System.out.println("Ваш список фильмов: " + Arrays.toString(films));
    }
}
