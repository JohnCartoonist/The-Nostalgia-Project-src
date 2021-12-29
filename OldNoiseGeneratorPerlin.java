import java.util.Random;

public class OldNoiseGeneratorPerlin extends cs {
  private int[] permutations;
  
  public double xCoord;
  
  public double yCoord;
  
  public double zCoord;
  
  public OldNoiseGeneratorPerlin() {
    this(new Random());
  }
  
  public OldNoiseGeneratorPerlin(Random random) {
    this.permutations = new int[512];
    this.xCoord = random.nextDouble() * 256.0D;
    this.yCoord = random.nextDouble() * 256.0D;
    this.zCoord = random.nextDouble() * 256.0D;
    for (int i = 0; i < 256; i++)
      this.permutations[i] = i; 
    for (int j = 0; j < 256; j++) {
      int k = random.nextInt(256 - j) + j;
      int l = this.permutations[j];
      this.permutations[j] = this.permutations[k];
      this.permutations[k] = l;
      this.permutations[j + 256] = this.permutations[j];
    } 
  }
  
  public double generateNoise(double d, double d1, double d2) {
    double d3 = d + this.xCoord;
    double d4 = d1 + this.yCoord;
    double d5 = d2 + this.zCoord;
    int i = (int)d3;
    int j = (int)d4;
    int k = (int)d5;
    if (d3 < i)
      i--; 
    if (d4 < j)
      j--; 
    if (d5 < k)
      k--; 
    int l = i & 0xFF;
    int i1 = j & 0xFF;
    int j1 = k & 0xFF;
    d3 -= i;
    d4 -= j;
    d5 -= k;
    double d6 = d3 * d3 * d3 * (d3 * (d3 * 6.0D - 15.0D) + 10.0D);
    double d7 = d4 * d4 * d4 * (d4 * (d4 * 6.0D - 15.0D) + 10.0D);
    double d8 = d5 * d5 * d5 * (d5 * (d5 * 6.0D - 15.0D) + 10.0D);
    int k1 = this.permutations[l] + i1;
    int l1 = this.permutations[k1] + j1;
    int i2 = this.permutations[k1 + 1] + j1;
    int j2 = this.permutations[l + 1] + i1;
    int k2 = this.permutations[j2] + j1;
    int l2 = this.permutations[j2 + 1] + j1;
    return lerp(d8, lerp(d7, lerp(d6, grad(this.permutations[l1], d3, d4, d5), grad(this.permutations[k2], d3 - 1.0D, d4, d5)), lerp(d6, grad(this.permutations[i2], d3, d4 - 1.0D, d5), grad(this.permutations[l2], d3 - 1.0D, d4 - 1.0D, d5))), lerp(d7, lerp(d6, grad(this.permutations[l1 + 1], d3, d4, d5 - 1.0D), grad(this.permutations[k2 + 1], d3 - 1.0D, d4, d5 - 1.0D)), lerp(d6, grad(this.permutations[i2 + 1], d3, d4 - 1.0D, d5 - 1.0D), grad(this.permutations[l2 + 1], d3 - 1.0D, d4 - 1.0D, d5 - 1.0D))));
  }
  
  public double lerp(double d, double d1, double d2) {
    return d1 + d * (d2 - d1);
  }
  
  public double grad(int i, double d, double d1, double d2) {
    int j = i & 0xF;
    double d3 = (j >= 8) ? d1 : d;
    double d4 = (j >= 4) ? ((j != 12 && j != 14) ? d2 : d) : d1;
    return (((j & 0x1) != 0) ? -d3 : d3) + (((j & 0x2) != 0) ? -d4 : d4);
  }
  
  public double func_801_a(double d, double d1) {
    return generateNoise(d, d1, 0.0D);
  }
  
  public void func_805_a(double[] ad, double d, double d1, double d2, int i, int j, int k, double d3, double d4, double d5, double d6) {
    int l = 0;
    double d7 = 1.0D / d6;
    int i1 = -1;
    boolean flag = false;
    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    boolean flag4 = false;
    boolean flag5 = false;
    double d8 = 0.0D;
    double d9 = 0.0D;
    double d10 = 0.0D;
    double d11 = 0.0D;
    for (int l2 = 0; l2 < i; l2++) {
      double d12 = (d + l2) * d3 + this.xCoord;
      int i3 = (int)d12;
      if (d12 < i3)
        i3--; 
      int j3 = i3 & 0xFF;
      d12 -= i3;
      double d13 = d12 * d12 * d12 * (d12 * (d12 * 6.0D - 15.0D) + 10.0D);
      for (int k3 = 0; k3 < k; k3++) {
        double d14 = (d2 + k3) * d5 + this.zCoord;
        int l3 = (int)d14;
        if (d14 < l3)
          l3--; 
        int i4 = l3 & 0xFF;
        d14 -= l3;
        double d15 = d14 * d14 * d14 * (d14 * (d14 * 6.0D - 15.0D) + 10.0D);
        for (int j4 = 0; j4 < j; j4++) {
          double d16 = (d1 + j4) * d4 + this.yCoord;
          int k4 = (int)d16;
          if (d16 < k4)
            k4--; 
          int l4 = k4 & 0xFF;
          d16 -= k4;
          double d17 = d16 * d16 * d16 * (d16 * (d16 * 6.0D - 15.0D) + 10.0D);
          if (j4 == 0 || l4 != i1) {
            i1 = l4;
            int j1 = this.permutations[j3] + l4;
            int k1 = this.permutations[j1] + i4;
            int l1 = this.permutations[j1 + 1] + i4;
            int i2 = this.permutations[j3 + 1] + l4;
            int j2 = this.permutations[i2] + i4;
            int k2 = this.permutations[i2 + 1] + i4;
            d8 = lerp(d13, grad(this.permutations[k1], d12, d16, d14), grad(this.permutations[j2], d12 - 1.0D, d16, d14));
            d9 = lerp(d13, grad(this.permutations[l1], d12, d16 - 1.0D, d14), grad(this.permutations[k2], d12 - 1.0D, d16 - 1.0D, d14));
            d10 = lerp(d13, grad(this.permutations[k1 + 1], d12, d16, d14 - 1.0D), grad(this.permutations[j2 + 1], d12 - 1.0D, d16, d14 - 1.0D));
            d11 = lerp(d13, grad(this.permutations[l1 + 1], d12, d16 - 1.0D, d14 - 1.0D), grad(this.permutations[k2 + 1], d12 - 1.0D, d16 - 1.0D, d14 - 1.0D));
          } 
          double d18 = lerp(d17, d8, d9);
          double d19 = lerp(d17, d10, d11);
          double d20 = lerp(d15, d18, d19);
          ad[l++] = ad[l++] + d20 * d7;
        } 
      } 
    } 
  }
}
