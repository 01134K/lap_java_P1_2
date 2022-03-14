package Lib;



public class Number {
    private double n ;

    public void setn(double n){
        this.n = n ;
    }
    public double getn(){
        return n;
    }

    public Number(double n){
        this.n = n;
    }
    public Number(){
        this.n = 1;
    }

    public boolean nISzero(){
        if(this.n == 0)
            return true ;
        else return false ;
    }
    public boolean nISpositive(){
        if(n>0) 
            return true ;
        else return false ;
    }
    public boolean nISnegative(){
        if(n<0)
            return true ;
        else return false ;
    }
    public boolean nISeven(){
        if(n%2 == 0)
            return true ;
        else return false ;
    }
    public boolean nISodd(){
        if(n%2 != 0)
            return true ;
        else return false ;
    }
    public boolean nISprime(){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0 )
                return false ;
        return true ;
    }

    public double nFactorial(){
        double ans = 1;
        for(int i = 1; i <= n; i++)
            ans = ans * i;
        return ans ;
    }
    public double nPowtwo(){
        double ans = n * n ;
        return ans ;
    }
    public double nSqrt(){
        double ans = Math.sqrt(n);
        return ans ;
    }
    public double nPlus(){
        double Plus = 0;
        String Number = Double.toString(n);
        for(int i = 0; i < Number.length(); i++) {
            if(Number.charAt(i) >= '0'&&Number.charAt(i) <= '9')
                Plus += Character.getNumericValue(Number.charAt(i));
        }
        return Plus ;
    }
    public String nReverse(){
        String text = Double.toString(n) , ans="";
            for(int i = text.length()-1; i >= 0; i--) {
                    ans += text.charAt(i); 
            }
            return ans ;
    }
    public String nCandivide(){
        int number = (int)n ;
        String ans="" ;  
       for(int i = 1 ; i <=  number ; i++){
        if(n%i == 0 ){
            ans +=  " "+String.valueOf(i);  
        }
       }
        return ans;
    }
    public String nBNumber(){
        String ans="",rans ="";
        int num = (int)n;
        while(num > 0){
          ans += String.valueOf(num%2);
          num = num/2;
        }
        for(int i = ans.length()-1; i >= 0; i--) {
            rans += ans.charAt(i); 
    }
        return rans ;
    }
    
}
