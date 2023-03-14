package methodOverloading;

public class IsPrime {

    public boolean isPrime( int n){
       for(int i = 2; i < n; i++){
           if(n % i == 0){
               return false;
           }
       }return  true;

    }

    public boolean isPrime( short n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }return  true;

    }

    public boolean isPrime( long n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }return  true;

    }

}
