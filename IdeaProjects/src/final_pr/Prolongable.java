package final_pr;

import java.math.BigDecimal;

public interface Prolongable {
    BigDecimal lowerBoundAmount = BigDecimal.valueOf(1000);
    int upperBoundPeriod = 36;
    boolean canToProlong();
}
