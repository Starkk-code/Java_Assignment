public class CountDigits {
    
    public static void main(String[] args) {
        int number = 123450;
        // int count = 0;
        
        // while (number != 0) {
        //     number /= 10; 
        //     count++;     
        // }
         if (number < 0) {
            number = number * -1;
        }
        
        System.out.println((int)(Math.log10(number)) + 1);
    }
}
