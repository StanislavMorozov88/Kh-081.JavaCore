package final_pr;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Deposit implements Comparable<Deposit>{
    protected final BigDecimal amount;
    protected final int period;

    protected Deposit(BigDecimal depositAmount, int depositPeriod) {
        if (depositAmount.compareTo(BigDecimal.ZERO) > 0 && depositPeriod > 0) {
            this.amount = depositAmount;
            this.period = depositPeriod;
        } else throw new IllegalArgumentException("amount or period is less than 0");
    }

    public abstract BigDecimal income();

    @Override
    public int compareTo(Deposit o) {
        return amount.add(income()).compareTo(o.amount.add(o.income()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return period == deposit.period && Objects.equals(amount, deposit.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, period);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }
}
