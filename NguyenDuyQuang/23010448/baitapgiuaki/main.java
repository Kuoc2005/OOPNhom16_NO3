public class Main {
public static void main(String[] args) {
// Tạo đối tượng DiscreteSignal
DiscreteSignal discreteSignal = new DiscreteSignal(5.0, 10.0, 0.02, 150.0);

// In ra thông tin về tín hiệu rời rạc
System.out.println("Biên độ: " + discreteSignal.getAmplitude());
System.out.println("Tần số: " + discreteSignal.getFrequency());

// Tạo đối tượng Radar để phân tích tín hiệu
Radar radar = new Radar();
radar.outputSignal(4); // In ra kết quả cho n = 4
}
}
