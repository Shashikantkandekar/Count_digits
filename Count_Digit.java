public class Count_Digit {
    public static void main(String[] args) {
        int sum=0;
        int number=12345;
        while (number>0)
        {
            sum= sum+number%10;
            number=number/10;
        }
        System.out.println(sum);
    }
}