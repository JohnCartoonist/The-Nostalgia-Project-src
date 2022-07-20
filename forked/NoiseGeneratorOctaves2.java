import java.util.Random;

public class NoiseGeneratorOctaves2 extends NoiseGenerator {
  private NoiseGenerator2[] field_4234_a;
  
  private int field_4233_b;
  
  public NoiseGeneratorOctaves2(Random random, int n) {
    this.field_4233_b = n;
    this.field_4234_a = new NoiseGenerator2[n];
    for (int i = 0; i < n; i++)
      this.field_4234_a[i] = new NoiseGenerator2(random); 
  }
  
  public double[] func_4112_a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
    return func_4111_a(dArray, d, d2, n, n2, d3, d4, d5, 0.5D);
  }
  
  public double[] func_4111_a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5, double d6) {
    d3 /= 1.5D;
    d4 /= 1.5D;
    if (dArray != null && dArray.length >= n * n2) {
      for (int j = 0; j < dArray.length; j++)
        dArray[j] = 0.0D; 
    } else {
      dArray = new double[n * n2];
    } 
    double d7 = 1.0D;
    double d8 = 1.0D;
    for (int i = 0; i < this.field_4233_b; i++) {
      this.field_4234_a[i].func_4157_a(dArray, d, d2, n, n2, d3 * d8, d4 * d8, 0.55D / d7);
      d8 *= d5;
      d7 *= d6;
    } 
    return dArray;
  }
}
