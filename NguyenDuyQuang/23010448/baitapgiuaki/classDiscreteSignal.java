// Tạo interface Signal
interface Signal {
    double getAmplitude();
    double getFrequency();
}

// Lớp tín hiệu rời rạc kế thừa từ Signal
class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private int[] xValues; // Dãy tín hiệu x(k)

    // Constructor
    public DiscreteSignal(double amplitude, double frequency, int[] xValues) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.xValues = xValues;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    // Hàm tính giá trị của δ(n - k)
    public int delta(int n, int k) {
        return (n == k) ? 1 : 0;
    }

    // Tính tín hiệu rời rạc x(n) = Σ x(k) * δ(n - k)
    public double calculateDiscreteSignal(int n) {
        double result = 0;
        for (int k = 0; k < xValues.length; k++) {
            result += xValues[k] * delta(n, k); // x(k) * δ(n - k)
        }
        return result;
    }

    // In ra tín hiệu rời rạc tại n
    public void printSignal(int n) {
        System.out.println("Tín hiệu rời rạc tại n = " + n + ": " + calculateDiscreteSignal(n));
    }
}
