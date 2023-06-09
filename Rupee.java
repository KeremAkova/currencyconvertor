package currencyconvertor;

public class Rupee {

    private double amount;

    public Rupee(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getGBPExchangeRate() {
        return 0.0097;
    }


    public double getRubleExchangeRate() {
        return 0.98;
    }


    public double getLiraExchangeRate() {
        return 0.26;
    }


    public double getEuroExchangeRate() {
        return 0.011;
    }


    public double getDollarExchangeRate() {
        return 0.012;
    }


    public double convertTo(String currType) {
        if (currType.equals("pound")) {
            return this.getAmount() * this.getGBPExchangeRate();
        }

        else if (currType.equals("ruble")) {
            return this.getAmount() * this.getRubleExchangeRate();
        }

        else if (currType.equals("euro")) {
            return this.getAmount() * this.getEuroExchangeRate();
        }

        else if (currType.equals("dollar")) {
            return this.getAmount() * this.getDollarExchangeRate();
        }

        else if (currType.equals("lira")) {
            return this.getAmount() * this.getLiraExchangeRate();
        }

        else {
            return -1.0;
        }
    }

}
