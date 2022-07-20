import java.util.Random;

public class OldNoiseGeneratorOctaves extends NoiseGenerator {
  private OldNoiseGeneratorPerlin[] generatorCollection;
  
  private int octaves;
  
  public OldNoiseGeneratorOctaves(Random random, int n) {
    this.octaves = n;
    this.generatorCollection = new OldNoiseGeneratorPerlin[n];
    for (int i = 0; i < n; i++)
      this.generatorCollection[i] = new OldNoiseGeneratorPerlin(random); 
  }
  
  public double func_806_a(double d, double d2) {
    double d3 = 0.0D;
    double d4 = 1.0D;
    for (int i = 0; i < this.octaves; i++) {
      d3 += this.generatorCollection[i].func_801_a(d * d4, d2 * d4) / d4;
      d4 /= 2.0D;
    } 
    return d3;
  }
  
  public double[] generateNoiseOctaves(double[] dArray, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6) {
    if (dArray == null) {
      dArray = new double[n * n2 * n3];
    } else {
      for (int j = 0; j < dArray.length; j++)
        dArray[j] = 0.0D; 
    } 
    double d7 = 1.0D;
    for (int i = 0; i < this.octaves; i++) {
      this.generatorCollection[i].func_805_a(dArray, d, d2, d3, n, n2, n3, d4 * d7, d5 * d7, d6 * d7, d7);
      d7 /= 2.0D;
    } 
    return dArray;
  }
  
  public double[] func_4109_a(double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
    return generateNoiseOctaves(dArray, n, 10.0D, n2, n3, 1, n4, d, 1.0D, d2);
  }
}
