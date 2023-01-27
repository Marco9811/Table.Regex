public class SmarphonePrice implements Cloneable{
    public String producerPrice;
    public int retailPrice;
    public String priceType;
    public double priceInEuros;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public SmarphonePrice clone() throws CloneNotSupportedException {
        return (SmarphonePrice) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
