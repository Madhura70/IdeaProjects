package accenture;

public interface Bank {
    final int id = 123;
    final String pswd = "Ram@123";

    public void Deposit(double bal);
    public void withdraw(double bal);
    public void display();

}
