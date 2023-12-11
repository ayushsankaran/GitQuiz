public class Main {
    public static void main(String[] args) {
        InclusiveSum is = (int x, int y) -> {
            int sum = 0;
            for(int i = x; i <= y; i++){
                sum += i;
            }
            return sum;
        };
        System.out.println(is.sumOfNums(Integer.parseInt(args[0]),Integer.parseInt(args[1])));

        //Rino And Ayush
    }
}
