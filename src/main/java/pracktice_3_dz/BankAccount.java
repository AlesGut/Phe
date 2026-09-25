package pracktice_3_dz;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance) { // конструктор счета
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {      //Геттер для владельца
        return this.owner;
    }

    int getBalance() {      //Геттер для баланса
        return this.balance;
    }

    void setOwner(int newOwner) { //сеттер для владельца
        this.balance = newOwner;
    }

    void printBalance() {        //Вывод баланса
        System.out.println("Вдалец " + getOwner() + " Текущий балас " + getBalance());
    }

    int deposit(int sum) {
        return this.balance = this.balance + Math.abs(sum);
    }

    int withdraw(int withdrawalAmount) {
        return this.balance = this.balance - Math.abs(withdrawalAmount);
    }
}
