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

    // Các phương thức khác cho tín hiệu rời rạc
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
