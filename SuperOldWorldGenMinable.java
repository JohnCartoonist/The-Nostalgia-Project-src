import java.util.Random;

public class SuperOldWorldGenMinable extends ig {
  private int field_884_a;
  
  private int field_883_b;
  
  public SuperOldWorldGenMinable(int i, int j) {
    this.field_884_a = i;
    this.field_883_b = j;
  }
  
  public boolean a(ry world, Random random, int i, int j, int k) {
    float f = random.nextFloat() * 3.141593F;
    double d = ((i + 8) + me.a(f) * this.field_883_b / 8.0F);
    double d1 = ((i + 8) - me.a(f) * this.field_883_b / 8.0F);
    double d2 = ((k + 8) + me.b(f) * this.field_883_b / 8.0F);
    double d3 = ((k + 8) - me.b(f) * this.field_883_b / 8.0F);
    double d4 = (j + random.nextInt(3) + 2);
    double d5 = (j + random.nextInt(3) + 2);
    for (int l = 0; l <= this.field_883_b; l++) {
      double d6 = d + (d1 - d) * l / this.field_883_b;
      double d7 = d4 + (d5 - d4) * l / this.field_883_b;
      double d8 = d2 + (d3 - d2) * l / this.field_883_b;
      double d9 = random.nextDouble() * this.field_883_b / 16.0D;
      double d10 = (me.a(l * 3.141593F / this.field_883_b) + 1.0F) * d9 + 1.0D;
      double d11 = (me.a(l * 3.141593F / this.field_883_b) + 1.0F) * d9 + 1.0D;
      for (int i1 = (int)(d6 - d10 / 2.0D); i1 <= (int)(d6 + d10 / 2.0D); i1++) {
        for (int j1 = (int)(d7 - d11 / 2.0D); j1 <= (int)(d7 + d11 / 2.0D); j1++) {
          for (int k1 = (int)(d8 - d10 / 2.0D); k1 <= (int)(d8 + d10 / 2.0D); k1++) {
            double d12 = (i1 + 0.5D - d6) / d10 / 2.0D;
            double d13 = (j1 + 0.5D - d7) / d11 / 2.0D;
            double d14 = (k1 + 0.5D - d8) / d10 / 2.0D;
            if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.a(i1, j1, k1) == yy.t.bM)
              world.d(i1, j1, k1, this.field_884_a); 
          } 
        } 
      } 
    } 
    return true;
  }
}
