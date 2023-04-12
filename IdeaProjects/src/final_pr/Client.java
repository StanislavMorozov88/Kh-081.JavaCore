package final_pr;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;


public class Client implements Iterable<Deposit> {
    class MyIterator<Deposit> implements Iterator {
        private Deposit[] depositsArr;
        private int i;

        public MyIterator(Deposit[] depositsArr) {
            this.depositsArr = depositsArr;
            i = -1;
        }

        @Override
        public boolean hasNext() {
            if (depositsArr == null) throw new IllegalArgumentException();
            return i + 1 < depositsArr.length && depositsArr[i + 1] != null;
        }

        @Override
        public Deposit next() {
            return depositsArr[++i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Deposit[] deposits;
    private int index;

    public Client() {
        deposits = new Deposit[10];
        index = -1;
    }

    public Client(Deposit[] deposits) {
        if (deposits != null && deposits.length != 0 && deposits.length <= 10) {
            this.deposits = deposits;
            index = deposits.length - 1;
        } else throw new IllegalArgumentException();
    }

    public boolean addDeposit(Deposit deposit) {
        if (deposit != null && index < deposits.length - 1) {
            deposits[++index] = deposit;
            return true;
        }
        return false;
    }

    public BigDecimal totalIncome() {
        return Arrays.stream(deposits)
                .filter(Objects::nonNull)
                .reduce(BigDecimal.valueOf(0), (subtotal, d) -> subtotal.add(d.income()), (subtotal1, subtotal2) -> subtotal1.add(subtotal2));
    }

    public BigDecimal maxIncome() {
        return Arrays.stream(deposits)
                .filter(Objects::nonNull)
                .map(deposit -> deposit.income())
                .max(Comparator.naturalOrder())
                .orElse(BigDecimal.valueOf(0));
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (number >= 0 && number <= index) {
            return deposits[number].income();
        } else return BigDecimal.valueOf(0, 2);
    }

    public void sortDeposits() {
        Arrays.sort(deposits, Comparator.nullsLast(Comparator.reverseOrder()));
    }

    public int countPossibleToProlongDeposit() {
        return (int) Arrays.stream(deposits)
                .filter(Objects::nonNull)
                .filter(deposit -> ((Prolongable) deposit).canToProlong())
                .count();
    }

    @Override
    public MyIterator<Deposit> iterator() {
        return new MyIterator<>(deposits);
    }
}
