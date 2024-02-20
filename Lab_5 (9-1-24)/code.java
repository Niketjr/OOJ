import java.util.*;

class Account {
    String name;
    int acc_no;
    double balance;
    char c;

    Account(String name, int acc_no, char c) {
        this.name = name;
        this.acc_no = acc_no;
        this.c = c;
        balance = 0.0;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdrawal(double amt) {
        if (balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("You don't have sufficient balance!");
        }
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class Cur_acc extends Account {
    double min_bal = 5000.0;
    double penalty = 500.0;

    Cur_acc(String name, int acc_no) {
        super(name, acc_no, 'c');
    }

    void withdrawal(double amt) {
        if (super.balance < min_bal) {
            System.out.println("You have been penalized");
            balance -= penalty;
        }
        if (super.balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Sav_acc extends Account {
    double interest = 0.04;

    Sav_acc(String name, int acc_no) {
        super(name, acc_no, 's');
    }

    double computeInterest() {
        int time = 3;
        double amt = balance * Math.pow((1 + interest), time);
        System.out.println("Total balance after interest: " + amt);
        return amt - balance; 
    }
}

class Bank{
    public static void main(String[] args) {
        String name;
        char c;
        int acc_no, choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter 's' for saving account and 'c' for current account:");
        c = sc.next().charAt(0);

        Account o;
        if (c == 'c') {
            o = new Cur_acc(name, acc_no);
        } else if (c == 's') {
            o = new Sav_acc(name, acc_no);
        } else {
            System.out.println("Invalid account type");
            return;
        }

        while (choice != 5) {
            System.out.println("1. Deposit \n2. Withdrawal \n3. Compute interest \n4. Display \n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double deposit;
                    System.out.println("Enter the amount you want to deposit:");
                    deposit = sc.nextDouble();
                    o.deposit(deposit);
                    break;
                case 2:
                    double withdrawal;
                    System.out.println("Enter the amount you want to withdraw: ");
                    withdrawal = sc.nextDouble();
                    o.withdrawal(withdrawal);
                    break;
                case 3:
                    if (o instanceof Sav_acc) {
                        double interest = ((Sav_acc) o).computeInterest();
                        o.deposit(interest);
                    } else {
                        System.out.println("Compute interest is applicable only for Saving Account");
                    }
                    break;
                case 4:
                    o.display();
                    break;
            }
        }
    }
}
