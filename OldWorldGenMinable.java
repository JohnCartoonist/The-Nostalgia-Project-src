import java.util.Random;

public class OldWorldGenMinable extends ig {
  private int minableBlockId;
  
  private int numberOfBlocks;
  
  public OldWorldGenMinable(int i, int j) {
    this.minableBlockId = i;
    this.numberOfBlocks = j;
  }
  
  public boolean a(ry world, Random random, int i, int j, int k) {
    float f = random.nextFloat() * 3.141593F;
    double d = ((i + 8) + me.a(f) * this.numberOfBlocks / 8.0F);
    double d1 = ((i + 8) - me.a(f) * this.numberOfBlocks / 8.0F);
    double d2 = ((k + 8) + me.b(f) * this.numberOfBlocks / 8.0F);
    double d3 = ((k + 8) - me.b(f) * this.numberOfBlocks / 8.0F);
    double d4 = (j + random.nextInt(3) + 2);
    double d5 = (j + random.nextInt(3) + 2);
    for (int l = 0; l <= this.numberOfBlocks; l++) {
      double d6 = d + (d1 - d) * l / this.numberOfBlocks;
      double d7 = d4 + (d5 - d4) * l / this.numberOfBlocks;
      double d8 = d2 + (d3 - d2) * l / this.numberOfBlocks;
      double d9 = random.nextDouble() * this.numberOfBlocks / 16.0D;
      double d10 = (me.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
      double d11 = (me.a(l * 3.141593F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
      int i1 = me.c(d6 - d10 / 2.0D);
      int j1 = me.c(d7 - d11 / 2.0D);
      int k1 = me.c(d8 - d10 / 2.0D);
      int l1 = me.c(d6 + d10 / 2.0D);
      int i2 = me.c(d7 + d11 / 2.0D);
      int j2 = me.c(d8 + d10 / 2.0D);
      for (int k2 = i1; k2 <= l1; k2++) {
        double d12 = (k2 + 0.5D - d6) / d10 / 2.0D;
        if (d12 * d12 < 1.0D)
          for (int l2 = j1; l2 <= i2; l2++) {
            double d13 = (l2 + 0.5D - d7) / d11 / 2.0D;
            if (d12 * d12 + d13 * d13 < 1.0D)
              for (int i3 = k1; i3 <= j2; i3++) {
                double d14 = (i3 + 0.5D - d8) / d10 / 2.0D;
                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.a(k2, l2, i3) == yy.t.bM)
                  world.d(k2, l2, i3, this.minableBlockId); 
              }  
          }  
      } 
    } 
    return true;
  }
}
