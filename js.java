import java.util.Random;

public class js extends wg {
  protected js(int i, int j) {
    super(i, j);
    float f = 0.2F;
    a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    b(true);
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue()) {
      super.a(world, i, j, k, random);
      return;
    } 
    if (random.nextInt(25) == 0) {
      byte byte0 = 4;
      int l = 5;
      for (int i1 = i - byte0; i1 <= i + byte0; i1++) {
        for (int k1 = k - byte0; k1 <= k + byte0; k1++) {
          for (int i2 = j - 1; i2 <= j + 1; i2++) {
            if (world.a(i1, i2, k1) == this.bM && --l <= 0)
              return; 
          } 
        } 
      } 
      int j1 = i + random.nextInt(3) - 1;
      int l1 = j + random.nextInt(2) - random.nextInt(2);
      int j2 = k + random.nextInt(3) - 1;
      for (int k2 = 0; k2 < 4; k2++) {
        if (world.h(j1, l1, j2) && e(world, j1, l1, j2)) {
          i = j1;
          j = l1;
          k = j2;
        } 
        j1 = i + random.nextInt(3) - 1;
        l1 = j + random.nextInt(2) - random.nextInt(2);
        j2 = k + random.nextInt(3) - 1;
      } 
      if (world.h(j1, l1, j2) && e(world, j1, l1, j2))
        world.g(j1, l1, j2, this.bM); 
    } 
  }
  
  protected boolean d(int i) {
    return yy.m[i];
  }
  
  public boolean e(ry world, int i, int j, int k) {
    boolean lightCheck = (world.m(i, j, k) < 13);
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue())
      lightCheck = (world.n(i, j, k) < 13); 
    if (j < 0 || j >= world.c)
      return false; 
    int l = world.a(i, j - 1, k);
    return (l == yy.by.bM || (lightCheck && d(l)));
  }
  
  public boolean c(ry world, int i, int j, int k, Random random) {
    int l = world.d(i, j, k);
    world.d(i, j, k, 0);
    acp worldgenbigmushroom = null;
    if (this.bM == yy.af.bM) {
      worldgenbigmushroom = new acp(0);
    } else if (this.bM == yy.ag.bM) {
      worldgenbigmushroom = new acp(1);
    } 
    if (worldgenbigmushroom == null || !worldgenbigmushroom.a(world, random, i, j, k)) {
      world.b(i, j, k, this.bM, l);
      return false;
    } 
    return true;
  }
}
