class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class oopfoundationsclassesandobjects {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, 85);
        Student s2 = new Student("Bob", 2, 90);
        BankAccount acc1 = new BankAccount("Alice", "1234567890", 1000.0);
        System.out.println(s1.name + " " + s1.rollNo + " " + s1.marks);
        System.out.println(s2.name + " " + s2.rollNo + " " + s2.marks);
        System.out.println(acc1.accountHolderName + " " + acc1.accountNumber + " " + acc1.balance);
    }
}

class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}