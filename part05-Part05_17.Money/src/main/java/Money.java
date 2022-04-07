
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int euros = this.euros + addition.euros;
        int cents = this.cents + addition.cents;
        
        if (cents > 99) {
            cents -= 100;
            euros++;
        }
        // Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        /*Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        return newMoney;
        int euroDiff = euros-decreaser.euros();
        int centDiff = cents-decreaser.cents();
        int totalDiffInCents = euroDiff*100 + centDiff;
        if(totalDiffInCents <= 0){
            return new Money(0,0);
        }else{
            int eurosRtn = totalDiffInCents/100;
            int centsRtn = totalDiffInCents%100;
            return new Money(eurosRtn, centsRtn);
        }*/
        
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;
        
        if (cents < 0) {
            euros -= 1;
            cents += 100;
        }
        
        if (euros < 0) {
            return new Money(0,0);
        }
        
        return new Money(euros, cents);
    }
}
