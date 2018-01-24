import java.util.Scanner;

public class firstNames {
    public static void main(String[] args) {

        String [] imiona= new  String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");
        for (int i=0; i<imiona.length; i++)
            imiona[i]= input.nextLine();

        for (int i=4; i>=0; i--){
            System.out.println("Cześć "+ imiona[i]);
        }
    }
}