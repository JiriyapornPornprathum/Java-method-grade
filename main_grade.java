import java.util.Scanner;
class main_grade{
    public static void main(String[] args) {       
        double Score ;
        int choice ;
        Scanner scan = new Scanner(System.in);
        grade process = new grade();

        System.out.print("Enter choice (1-3) : ");
        choice = scan.nextInt();
        System.out.print("Enter Score : ");
        Score = scan.nextDouble();

        process.setChoice(choice, Score);
        System.out.println(process.display());
        scan.close();
    }
}