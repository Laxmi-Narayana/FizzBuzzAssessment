package Assessment1;

public class MainProgram {
    static Fizz f;
    static Buzz b;

    public static void main(String[] args) {
        f = new Fizz();
        b = new Buzz();
        for(int num = 1;num<=100;num++) {
            String temp1 = f.checkFizz(num);
            String temp2 = b.checkBuzz(num);
            String res = temp1 + temp2;
            if(res.equals("FizzBuzz") || res.equals("Fizz") || res.equals("Buzz")) {
                System.out.println(res);
            }
            else {
                System.out.println(num); //NonFizzBuzz
            }
        }
    }
}
