// Tạo interface Signal
interface Signal {
    double getAmplitude();
    double getFrequency();
}

// Tạo lớp DiscreteSignal kế thừa Signal
class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;

    public DiscreteSignal(double amplitude, double frequency) {
        this.amplitude = amplitude;
        this.frequency = frequency;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    // Định nghĩa tín hiệu rời rạc theo công thức [1]
    public double calculateSignal(int n, int k) {
        if (n == k) {
            return 1; // dãy xung đơn vị
        }
        return 0;
    }

    // Hàm tính toán tín hiệu với x(n) = Σx(k) * δ(n-k)
    public double calculateDiscreteSignal(int[] x, int n) {
        double result = 0;
        for (int k = 0; k < x.length; k++) {
            result += x[k] * calculateSignal(n, k);
        }
        return result;
    }
}

// Tạo lớp ContinuousSignal kế thừa Signal
class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;

    public ContinuousSignal(double amplitude, double frequency) {
        this.amplitude = amplitude;
        this.frequency = frequency;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    // Các phương thức khác cho tín hiệu liên tục
}
