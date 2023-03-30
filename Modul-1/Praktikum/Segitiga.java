public class Segitiga<T> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        int a = (int) this.alas;
        int t = (int) this.tinggi;
        return a / 2 * t;
    }

    public double getResultAsDouble() {
        double a = (double) this.alas;
        double t = (double) this.tinggi;
        return 0.5 * a * t;
    }
}
