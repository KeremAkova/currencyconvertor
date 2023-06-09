
package currencyconvertor;

public class Euro {

    private double amount;

    public Euro(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getGBPExchangeRate() {
        return 0.86;
    }


    public double getRubleExchangeRate() {
        return 86.55;
    }


    public double getLiraExchangeRate() {
        return 22.77;
    }


    public double getDollarExchangeRate() {
        return 1.07;
    }


    public double getRupeeExchangeRate() {
        return 88.38;
    }


    public double convertTo(String currType) {
        if (currType.equals("pound")) {
            return this.getAmount() * this.getGBPExchangeRate();
        }

        else if (currType.equals("ruble")) {
            return this.getAmount() * this.getRubleExchangeRate();
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
