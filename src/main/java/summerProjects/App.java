package summerProjects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for(int i=0;i<101;i++){
            if(i==0){
                System.out.println(i);
                continue;
            }
            if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i%5==0){
                if(i%3==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Buzz");
                }            }
            else{
                System.out.println(i);
            }

        }
    }
}
