import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        int i = 1;
        try {
            f = new File("Text1.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            while(true){
                System.out.print("please input name : ");
                String name = input.nextLine();
                if(name.equals("Q")) break;
                bw.write("Name["+i+"] : "+name+"\n");
                i++;
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
            bw.close();fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}