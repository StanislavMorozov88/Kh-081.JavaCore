package final_pr;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit implements Prolongable {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal deposit = amount;
        for (int i = 0; i <= period; i++) {
            deposit = deposit.add(deposit.multiply(BigDecimal.valueOf(i).divide(BigDecimal.valueOf(100))));
        }
        return (deposit.subtract(amount)).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public boolean canToProlong() {
        return amount.compareTo(lowerBoundAmount) > 0;
    }
}
