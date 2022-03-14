import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Java File : ");
        String IFname = input.nextLine(); 
        File fI = new File(IFname+".java"); 
        FileReader fr = null;
        BufferedReader br = null;

        System.out.print("Output Text File : ");
        String OFname = input.nextLine();
        File fO = new File(OFname+".txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            
            fr = new FileReader(fI);
            br = new BufferedReader(fr);

            fw = new FileWriter(fO);
            bw = new BufferedWriter(fw); 

            String s = " ";
            while((s = br.readLine()) != null){
                
                String arr[] = s.split(" ");
                int i ;
                for (String c : arr ) {
                    if(c.equals("public") || c.equals("private") 
                    || c.equals("protected")){
                        for(i = 0 ; i < s.length(); i++){
                            if(s.charAt(i)=='{'){
                                break;
                            }
                        }
                        bw.write(s.substring(0,i)+"\n");
                    }                    
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            try {
                System.out.println("Comlete.");
                br.close();fr.close();bw.close();fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}