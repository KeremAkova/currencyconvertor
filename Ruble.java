package currencyconvertor;

public class Ruble {

    private double amount;

    public Ruble(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getGBPExchangeRate() {
        return 0.0099;
    }


    public double getEuroExchangeRate() {
        return 0.012;
    }


    public double getLiraExchangeRate() {
        return 0.26;
    }


    public double getDollarExchangeRate() {
        return 0.012;
    }


    public double getRupeeExchangeRate() {
        return 1.02;
    }


    public double convertTo(String currType) {
        if (currType.equals("pound")) {
            return this.getAmount() * this.getGBPExchangeRate();
        }

        else if (currType.equals("rupee")) {
            return this.getAmount() * this.getRupeeExchangeRate();
        }

        else if (currType.equals("lira")) {
            return this.getAmount() * this.getLiraExchangeRate();
        }

        else if (currType.equals("dollar")) {
            return this.getAmount() * this.getDollarExchangeRate();
        }

        else if (currType.equals("rupee")) {
            return this.getAmount() * this.getRupeeExchangeRate();
        }

        else {
            return -1.0;
        }
    }

}
