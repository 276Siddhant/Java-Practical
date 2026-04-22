import java.util.Scanner;
interface BudgetManager{
    void addIncome(double amount);
    void addExpense(double amount);
    double getBalance();
    void displaySummary();
}
class Budget implements BudgetManager{
    private double income;
    private double expenses;

    public Budget(){
        income = 0;
        expenses = 0;
    }

    @Override
    public void addIncome(double amount){
        income += amount;
    }
    @Override
    public void addExpense(double amount){
        expenses += amount;
    }
    @Override
    public double getBalance(){
        return income - expenses;
    }
    @Override
    public void displaySummary(){
        System.out.println("Total Income: "+income);
        System.out.println("Total Expenses: "+expenses);
        System.out.println("Balance: "+getBalance());
    }
}
class MainApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BudgetManager budget=new Budget();
        int choice;
        do{
            System.out.println("\n1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter income amount: ");
                    double inc=sc.nextDouble();
                    budget.addIncome(inc);
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    double exp = sc.nextDouble();
                    budget.addExpense(exp);
                    break;
                case 3:
                    budget.displaySummary();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice!=4);
        sc.close();
    }
}