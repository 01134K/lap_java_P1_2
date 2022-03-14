
import java.util.Scanner; 
public class java_lap3_2 {
    //6421600042
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your E-mail : ");
        String mail = input.nextLine();

        int Charisadd = 0;

        for(int i = mail.length()-1; i >= 0; i--)
        {
            if(mail.charAt(i) == '@')
            {
                Charisadd = i;
                break;
            }
        }

        System.out.println("Your Domain name is \"" + mail.substring(Charisadd) + "\"");
    }
}
