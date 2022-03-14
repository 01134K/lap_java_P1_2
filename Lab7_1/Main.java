import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input CSV file name : ");
        String Fname = input.nextLine();

        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            
            f = new File(Fname+".csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            System.out.print("Please input string : ");
            String search = input.nextLine();
            
            String s = "";
            while( (s = br.readLine()) != null ){ 
                if(s.contains(search))
                    System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
                br.close();fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }    
}
