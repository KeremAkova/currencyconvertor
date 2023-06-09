package currencyconvertor;

public class Pound {

    private double amount;

    public Pound(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getDollarExchangeRate() {
        return 1.24;
    }


    public double getRubleExchangeRate() {
        return 100.47;
    }


    public double getLiraExchangeRate() {
        return 26.43;
    }


    public double getEuroExchangeRate() {
        return 1.16;
    }


    public double getRupeeExchangeRate() {
        return 102.62;
    }


    public double convertTo(String currType) {
        if (currType.equals("dollar")) {
            return this.getAmount() * this.getDollarExchangeRate();
        }

        else if (currType.equals("ruble")) {
            return this.getAmount() * this.getRubleExchangeRate();
        }

        else if (currType.equals("lira")) {
            return this.getAmount() * this.getLiraExchangeRate();
        }

        else if (currType.equals("euro")) {
            return this.getAmount() * this.getEuroExchangeRate();
        }

        else if (currType.equals("rupee")) {
            return this.getAmount() * this.getRupeeExchangeRate();
        }

        else {
            return -1.0;
        }
    }

}
