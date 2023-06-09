package currencyconvertor;

public class Dollar {

    private double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public double getGBPExchangeRate() {
        return 0.81;
    }


    public double getRubleExchangeRate() {
        return 81.26;
    }


    public double getLiraExchangeRate() {
        return 21.24;
    }


    public double getEuroExchangeRate() {
        return 0.94;
    }


    public double getRupeeExchangeRate() {
        return 82.63;
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
