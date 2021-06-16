public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        owner = newCardHolder;
        creditLimit = new Money(limit);
        balance = new Money(0);
    }

    public Money getBalance(){

        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return  (owner.toString());
    }

    public void charge(Money amount){


        if(creditLimit.compareTo(balance.add(amount)) <= 0 ){
            System.out.println("Exceeds credit limit");
        }
        else {
            System.out.println("Charge: " + amount);

            balance = balance.add(amount);
        }
    }

    public void payment(Money amount){
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);

    }

}
