package final_pr;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit implements Prolongable {
    private static final int INTEREST = 15;
    private static final int lowerBoundPeriodForInterest = 7;

    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal deposit = amount;
        for (int i = lowerBoundPeriodForInterest; i <= period; i++) {
            deposit = deposit.add(deposit.multiply(BigDecimal.valueOf(INTEREST).divide(BigDecimal.valueOf(100))));
        }
        return (deposit.subtract(amount)).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public boolean canToProlong() {
        return period < upperBoundPeriod;
    }
}
