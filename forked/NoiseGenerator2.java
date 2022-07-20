import java.util.Random;

public class NoiseGenerator2 {
  private static int[][] field_4296_d = new int[][] { 
      { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, 
      { 0, 1, -1 }, { 0, -1, -1 } };
  
  private int[] field_4295_e = new int[512];
  
  public double field_4292_a;
  
  public double field_4291_b;
  
  public double field_4297_c;
  
  private static final double field_4294_f = 0.5D * (Math.sqrt(3.0D) - 1.0D);
  
  private static final double field_4293_g = (3.0D - Math.sqrt(3.0D)) / 6.0D;
  
  public NoiseGenerator2() {
    this(new Random());
  }
  
  public NoiseGenerator2(Random random) {
    this.field_4292_a = random.nextDouble() * 256.0D;
    this.field_4291_b = random.nextDouble() * 256.0D;
    this.field_4297_c = random.nextDouble() * 256.0D;
    int n = 0;
    while (n < 256)
      this.field_4295_e[n] = n++; 
    for (n = 0; n < 256; n++) {
      int n2 = random.nextInt(256 - n) + n;
      int n3 = this.field_4295_e[n];
      this.field_4295_e[n] = this.field_4295_e[n2];
      this.field_4295_e[n2] = n3;
      this.field_4295_e[n + 256] = this.field_4295_e[n];
    } 
  }
  
  private static int wrap(double d) {
    return (d > 0.0D) ? (int)d : ((int)d - 1);
  }
  
  private static double func_4156_a(int[] nArray, double d, double d2) {
    return nArray[0] * d + nArray[1] * d2;
  }
  
  public void func_4157_a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
    int n3 = 0;
    for (int i = 0; i < n; i++) {
      double d6 = (d + i) * d3 + this.field_4292_a;
      for (int j = 0; j < n2; j++) {
        double d7, d8, d9;
        int n5, n6;
        double d13 = (d2 + j) * d4 + this.field_4291_b;
        double d14 = (d6 + d13) * field_4294_f;
        int n8 = wrap(d6 + d14);
        int n7;
        double d12, d15 = n8 - (d12 = (n8 + (n7 = wrap(d13 + d14))) * field_4293_g);
        double d16 = d6 - d15;
        double d10, d11;
        if (d16 > (d11 = d13 - (d10 = n7 - d12))) {
          n6 = 1;
          n5 = 0;
        } else {
          n6 = 0;
          n5 = 1;
        } 
        double d17 = d16 - n6 + field_4293_g;
        double d18 = d11 - n5 + field_4293_g;
        double d19 = d16 - 1.0D + 2.0D * field_4293_g;
        double d20 = d11 - 1.0D + 2.0D * field_4293_g;
        int n9 = n8 & 0xFF;
        int n10 = n7 & 0xFF;
        int n11 = this.field_4295_e[n9 + this.field_4295_e[n10]] % 12;
        int n12 = this.field_4295_e[n9 + n6 + this.field_4295_e[n10 + n5]] % 12;
        int n13 = this.field_4295_e[n9 + 1 + this.field_4295_e[n10 + 1]] % 12;
        double d21 = 0.5D - d16 * d16 - d11 * d11;
        if (d21 < 0.0D) {
          d9 = 0.0D;
        } else {
          d21 *= d21;
          d9 = d21 * d21 * func_4156_a(field_4296_d[n11], d16, d11);
        } 
        double d22 = 0.5D - d17 * d17 - d18 * d18;
        if (d22 < 0.0D) {
          d8 = 0.0D;
        } else {
          d22 *= d22;
          d8 = d22 * d22 * func_4156_a(field_4296_d[n12], d17, d18);
        } 
        double d23 = 0.5D - d19 * d19 - d20 * d20;
        if (d23 < 0.0D) {
          d7 = 0.0D;
        } else {
          d23 *= d23;
          d7 = d23 * d23 * func_4156_a(field_4296_d[n13], d19, d20);
        } 
        int n4 = n3++, n14 = n4;
        dArray[n14] = dArray[n14] + 70.0D * (d9 + d8 + d7) * d5;
      } 
    } 
  }
}
