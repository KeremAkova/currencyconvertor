package currencyconvertor;

public class Lira {

    private double amount;

    public Lira(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getGBPExchangeRate() {
        return 0.038;
    }


    public double getRubleExchangeRate() {
        return 3.83;
    }


    public double getEuroExchangeRate() {
        return 0.044;
    }


    public double getDollarExchangeRate() {
        return 0.047;
    }


    public double getRupeeExchangeRate() {
        return 3.88;
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

        else if (currType.equals("rupee")) {
            return this.getAmount() * this.getRupeeExchangeRate();
        }

        else {
            return -1.0;
        }
    }

}
