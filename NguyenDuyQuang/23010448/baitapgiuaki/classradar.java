class Radar {
    // Phân tích tín hiệu dựa trên công thức [2]
    public double analyzeDiscreteSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Radar radar = new Radar();
        int n = 4;
        double result = radar.analyzeDiscreteSignal(n);
        System.out.println("Kết quả tín hiệu tại n = " + n + ": " + result);
        // Tính toán tín hiệu rời rạc cho các giá trị khác
        DiscreteSignal discreteSignal = new DiscreteSignal(5.0, 1000.0,result,result);
        int[] x = {1, 2, 3, 4};  // Ví dụ dãy tín hiệu
        double discreteResult = discreteSignal.calculateDiscreteSignal(x, n);
        System.out.println("Kết quả tín hiệu rời rạc với n = " + n + ": " + discreteResult);
    }

	public void outputSignal(int i) {
		throw new UnsupportedOperationException("Unimplemented method 'outputSignal'");
	}
}
