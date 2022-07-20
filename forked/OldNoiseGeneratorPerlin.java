import java.util.Random;

public class OldNoiseGeneratorPerlin extends NoiseGenerator {
  private int[] permutations = new int[512];
  
  public double xCoord;
  
  public double yCoord;
  
  public double zCoord;
  
  public OldNoiseGeneratorPerlin() {
    this(new Random());
  }
  
  public OldNoiseGeneratorPerlin(Random random) {
    this.xCoord = random.nextDouble() * 256.0D;
    this.yCoord = random.nextDouble() * 256.0D;
    this.zCoord = random.nextDouble() * 256.0D;
    int n = 0;
    while (n < 256)
      this.permutations[n] = n++; 
    for (n = 0; n < 256; n++) {
      int n2 = random.nextInt(256 - n) + n;
      int n3 = this.permutations[n];
      this.permutations[n] = this.permutations[n2];
      this.permutations[n2] = n3;
      this.permutations[n + 256] = this.permutations[n];
    } 
  }
  
  public double generateNoise(double d, double d2, double d3) {
    double d4 = d + this.xCoord;
    double d5 = d2 + this.yCoord;
    double d6 = d3 + this.zCoord;
    int n = (int)d4;
    int n2 = (int)d5;
    int n3 = (int)d6;
    if (d4 < n)
      n--; 
    if (d5 < n2)
      n2--; 
    if (d6 < n3)
      n3--; 
    int n4 = n & 0xFF;
    int n5 = n2 & 0xFF;
    int n6 = n3 & 0xFF;
    double d7 = (d4 -= n) * d4 * d4 * (d4 * (d4 * 6.0D - 15.0D) + 10.0D);
    double d8 = (d5 -= n2) * d5 * d5 * (d5 * (d5 * 6.0D - 15.0D) + 10.0D);
    double d9 = (d6 -= n3) * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
    int n7 = this.permutations[n4] + n5;
    int n8 = this.permutations[n7] + n6;
    int n9 = this.permutations[n7 + 1] + n6;
    int n10 = this.permutations[n4 + 1] + n5;
    int n11 = this.permutations[n10] + n6;
    int n12 = this.permutations[n10 + 1] + n6;
    return lerp(d9, lerp(d8, lerp(d7, grad(this.permutations[n8], d4, d5, d6), grad(this.permutations[n11], d4 - 1.0D, d5, d6)), lerp(d7, grad(this.permutations[n9], d4, d5 - 1.0D, d6), grad(this.permutations[n12], d4 - 1.0D, d5 - 1.0D, d6))), lerp(d8, lerp(d7, grad(this.permutations[n8 + 1], d4, d5, d6 - 1.0D), grad(this.permutations[n11 + 1], d4 - 1.0D, d5, d6 - 1.0D)), lerp(d7, grad(this.permutations[n9 + 1], d4, d5 - 1.0D, d6 - 1.0D), grad(this.permutations[n12 + 1], d4 - 1.0D, d5 - 1.0D, d6 - 1.0D))));
  }
  
  public final double lerp(double d, double d2, double d3) {
    return d2 + d * (d3 - d2);
  }
  
  public final double func_4110_a(int n, double d, double d2) {
    int n2 = n & 0xF;
    double d3 = (1 - ((n2 & 0x8) >> 3)) * d;
    double d4 = (n2 < 4) ? 0.0D : ((n2 != 12 && n2 != 14) ? d2 : d);
    return (((n2 & 0x1) == 0) ? d3 : -d3) + (((n2 & 0x2) == 0) ? d4 : -d4);
  }
  
  public final double grad(int n, double d, double d2, double d3) {
    int n2 = n & 0xF;
    double d4 = (n2 < 8) ? d : d2, d5 = d4;
    double d6 = (n2 < 4) ? d2 : ((n2 != 12 && n2 != 14) ? d3 : d);
    return (((n2 & 0x1) == 0) ? d4 : -d4) + (((n2 & 0x2) == 0) ? d6 : -d6);
  }
  
  public double func_801_a(double d, double d2) {
    return generateNoise(d, d2, 0.0D);
  }
  
  public void func_805_a(double[] dArray, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
    if (n2 == 1) {
      boolean bl = false;
      boolean bl2 = false;
      boolean bl3 = false;
      boolean bl4 = false;
      double d8 = 0.0D;
      double d9 = 0.0D;
      int n4 = 0;
      double d10 = 1.0D / d7;
      for (int i = 0; i < n; i++) {
        double d11 = (d + i) * d4 + this.xCoord;
        int n5 = (int)d11;
        if (d11 < n5)
          n5--; 
        int n6 = n5 & 0xFF;
        double d12 = (d11 -= n5) * d11 * d11 * (d11 * (d11 * 6.0D - 15.0D) + 10.0D);
        for (int j = 0; j < n3; j++) {
          double d13 = (d3 + j) * d6 + this.zCoord;
          int n8 = (int)d13;
          if (d13 < n8)
            n8--; 
          int n9 = n8 & 0xFF;
          double d14 = (d13 -= n8) * d13 * d13 * (d13 * (d13 * 6.0D - 15.0D) + 10.0D);
          int n10 = this.permutations[n6] + 0;
          int n11 = this.permutations[n10] + n9;
          int n12 = this.permutations[n6 + 1] + 0;
          int n13 = this.permutations[n12] + n9;
          d8 = lerp(d12, func_4110_a(this.permutations[n11], d11, d13), grad(this.permutations[n13], d11 - 1.0D, 0.0D, d13));
          d9 = lerp(d12, grad(this.permutations[n11 + 1], d11, 0.0D, d13 - 1.0D), grad(this.permutations[n13 + 1], d11 - 1.0D, 0.0D, d13 - 1.0D));
          double d15 = lerp(d14, d8, d9);
          int n7 = n4++, n14 = n7;
          dArray[n14] = dArray[n14] + d15 * d10;
        } 
      } 
    } else {
      int n15 = 0;
      double d16 = 1.0D / d7;
      int n16 = -1;
      boolean bl = false;
      boolean bl5 = false;
      boolean bl6 = false;
      boolean bl7 = false;
      boolean bl8 = false;
      boolean bl9 = false;
      double d17 = 0.0D;
      double d18 = 0.0D;
      double d19 = 0.0D;
      double d20 = 0.0D;
      for (int i = 0; i < n; i++) {
        double d21 = (d + i) * d4 + this.xCoord;
        int n17 = (int)d21;
        if (d21 < n17)
          n17--; 
        int n18 = n17 & 0xFF;
        double d22 = (d21 -= n17) * d21 * d21 * (d21 * (d21 * 6.0D - 15.0D) + 10.0D);
        for (int j = 0; j < n3; j++) {
          double d23 = (d3 + j) * d6 + this.zCoord;
          int n19 = (int)d23;
          if (d23 < n19)
            n19--; 
          int n20 = n19 & 0xFF;
          double d24 = (d23 -= n19) * d23 * d23 * (d23 * (d23 * 6.0D - 15.0D) + 10.0D);
          for (int k = 0; k < n2; k++) {
            double d25 = (d2 + k) * d5 + this.yCoord;
            int n22 = (int)d25;
            if (d25 < n22)
              n22--; 
            int n23 = n22 & 0xFF;
            double d26 = (d25 -= n22) * d25 * d25 * (d25 * (d25 * 6.0D - 15.0D) + 10.0D);
            if (k == 0 || n23 != n16) {
              n16 = n23;
              int n24 = this.permutations[n18] + n23;
              int n25 = this.permutations[n24] + n20;
              int n26 = this.permutations[n24 + 1] + n20;
              int n27 = this.permutations[n18 + 1] + n23;
              int n28 = this.permutations[n27] + n20;
              int n29 = this.permutations[n27 + 1] + n20;
              d17 = lerp(d22, grad(this.permutations[n25], d21, d25, d23), grad(this.permutations[n28], d21 - 1.0D, d25, d23));
              d18 = lerp(d22, grad(this.permutations[n26], d21, d25 - 1.0D, d23), grad(this.permutations[n29], d21 - 1.0D, d25 - 1.0D, d23));
              d19 = lerp(d22, grad(this.permutations[n25 + 1], d21, d25, d23 - 1.0D), grad(this.permutations[n28 + 1], d21 - 1.0D, d25, d23 - 1.0D));
              d20 = lerp(d22, grad(this.permutations[n26 + 1], d21, d25 - 1.0D, d23 - 1.0D), grad(this.permutations[n29 + 1], d21 - 1.0D, d25 - 1.0D, d23 - 1.0D));
            } 
            double d27 = lerp(d26, d17, d18);
            double d28 = lerp(d26, d19, d20);
            double d29 = lerp(d24, d27, d28);
            int n21 = n15++, n30 = n21;
            dArray[n30] = dArray[n30] + d29 * d16;
          } 
        } 
      } 
    } 
  }
}
