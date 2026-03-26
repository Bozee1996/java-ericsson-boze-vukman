class Trokut extends GeometrijskiLik {
    private double a, b, c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double opseg() {
        return a + b + c;
    }

    @Override
    public double povrsina() {
        double s = opseg() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heronova formula
    }
}