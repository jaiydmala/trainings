public class FizzBuzz {

    public Boolean checkDivisibilityBy3(int number){
        if(number % 3 == 0){
            return true;
        }
        return false;
    }

    public Boolean checkDivisibilityBy5(int number){
        if(number % 5 == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        
        FizzBuzz fz = new FizzBuzz();
        
        for(int i = 0; i <= 100; i++){
            
            if(fz.checkDivisibilityBy3(i) && fz.checkDivisibilityBy5(i)){
                System.out.println("FizzBuzz");
            }
            if(fz.checkDivisibilityBy3(i)){
                System.out.println("Fizz");
            }
            else if(fz.checkDivisibilityBy5(i)){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }
    }
    
}