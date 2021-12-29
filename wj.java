import java.util.Random;

public class wj extends yy {
  private int[] a;
  
  private int[] cb;
  
  private int[] chanceToEncourageFire_old;
  
  private int[] abilityToCatchFire_old;
  
  protected wj(int i, int j) {
    super(i, j, p.n);
    this.a = new int[256];
    this.cb = new int[256];
    this.chanceToEncourageFire_old = new int[256];
    this.abilityToCatchFire_old = new int[256];
    b(true);
  }
  
  public void x_() {
    setBurnRate_old(yy.x.bM, 5, 20);
    a(yy.aZ.bM, 5, 20);
    a(yy.at.bM, 5, 20);
    setBurnRate_old(yy.J.bM, 5, 5);
    setBurnRate_old(yy.K.bM, 30, 60);
    setBurnRate_old(yy.an.bM, 30, 20);
    setBurnRate_old(yy.am.bM, 15, 100);
    a(yy.X.bM, 60, 100);
    setBurnRate_old(yy.ab.bM, 30, 60);
    a(yy.bu.bM, 15, 100);
  }
  
  private void setBurnRate_old(int i, int j, int k) {
    this.a[i] = j;
    this.cb[i] = k;
    this.chanceToEncourageFire_old[i] = j;
    this.abilityToCatchFire_old[i] = k;
  }
  
  private void a(int i, int j, int k) {
    this.a[i] = j;
    this.cb[i] = k;
  }
  
  public c b(ry world, int i, int j, int k) {
    return null;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 3;
  }
  
  public int a(Random random) {
    return 0;
  }
  
  public int d() {
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue())
      return 10; 
    return 40;
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue()) {
      updateTick_oldLogic(world, i, j, k, random);
      return;
    } 
    boolean flag = (world.a(i, j - 1, k) == yy.bb.bM);
    if (world.y instanceof ol && world.a(i, j - 1, k) == yy.z.bM)
      flag = true; 
    if (!c(world, i, j, k))
      world.g(i, j, k, 0); 
    if (!flag && world.E() && (world.w(i, j, k) || world.w(i - 1, j, k) || world.w(i + 1, j, k) || world.w(i, j, k - 1) || world.w(i, j, k + 1))) {
      world.g(i, j, k, 0);
      return;
    } 
    int l = world.d(i, j, k);
    if (l < 15)
      world.c(i, j, k, l + random.nextInt(3) / 2); 
    world.a(i, j, k, this.bM, d());
    if (!flag && !g(world, i, j, k)) {
      if (!world.g(i, j - 1, k) || l > 3)
        world.g(i, j, k, 0); 
      return;
    } 
    if (!flag && !c(world, i, j - 1, k) && l == 15 && random.nextInt(4) == 0) {
      world.g(i, j, k, 0);
      return;
    } 
    a(world, i + 1, j, k, 300, random, l);
    a(world, i - 1, j, k, 300, random, l);
    a(world, i, j - 1, k, 250, random, l);
    a(world, i, j + 1, k, 250, random, l);
    a(world, i, j, k - 1, 300, random, l);
    a(world, i, j, k + 1, 300, random, l);
    for (int i1 = i - 1; i1 <= i + 1; i1++) {
      for (int j1 = k - 1; j1 <= k + 1; j1++) {
        for (int k1 = j - 1; k1 <= j + 4; k1++) {
          if (i1 != i || k1 != j || j1 != k) {
            int l1 = 100;
            if (k1 > j + 1)
              l1 += (k1 - j + 1) * 100; 
            int i2 = h(world, i1, k1, j1);
            if (i2 > 0) {
              int j2 = (i2 + 40) / (l + 30);
              if (j2 > 0 && random.nextInt(l1) <= j2 && (!world.E() || !world.w(i1, k1, j1)) && !world.w(i1 - 1, k1, k) && !world.w(i1 + 1, k1, j1) && !world.w(i1, k1, j1 - 1) && !world.w(i1, k1, j1 + 1)) {
                int k2 = l + random.nextInt(5) / 4;
                if (k2 > 15)
                  k2 = 15; 
                world.d(i1, k1, j1, this.bM, k2);
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public void updateTick_oldLogic(ry world, int i, int j, int k, Random random) {
    boolean flag = (world.a(i, j - 1, k) == yy.bb.bM);
    if (!flag && world.E() && (world.w(i, j, k) || world.w(i - 1, j, k) || world.w(i + 1, j, k) || world.w(i, j, k - 1) || world.w(i, j, k + 1))) {
      world.g(i, j, k, 0);
      return;
    } 
    int l = world.d(i, j, k);
    if (l < 15) {
      world.f(i, j, k, l + 1);
      world.a(i, j, k, this.bM, d());
    } 
    if (!flag && !g(world, i, j, k)) {
      if (!world.f(i, j - 1, k) || l > 3)
        world.g(i, j, k, 0); 
      return;
    } 
    if (!flag && !c(world, i, j - 1, k) && l == 15 && random.nextInt(4) == 0) {
      world.g(i, j, k, 0);
      return;
    } 
    if (l % 2 == 0 && l > 2) {
      tryToCatchBlockOnFire_oldLogic(world, i + 1, j, k, 300, random);
      tryToCatchBlockOnFire_oldLogic(world, i - 1, j, k, 300, random);
      tryToCatchBlockOnFire_oldLogic(world, i, j - 1, k, 250, random);
      tryToCatchBlockOnFire_oldLogic(world, i, j + 1, k, 250, random);
      tryToCatchBlockOnFire_oldLogic(world, i, j, k - 1, 300, random);
      tryToCatchBlockOnFire_oldLogic(world, i, j, k + 1, 300, random);
      for (int i1 = i - 1; i1 <= i + 1; i1++) {
        for (int j1 = k - 1; j1 <= k + 1; j1++) {
          for (int k1 = j - 1; k1 <= j + 4; k1++) {
            if (i1 != i || k1 != j || j1 != k) {
              int l1 = 100;
              if (k1 > j + 1)
                l1 += (k1 - j + 1) * 100; 
              int i2 = h(world, i1, k1, j1);
              if (i2 > 0 && random.nextInt(l1) <= i2 && (!world.E() || !world.w(i1, k1, j1)) && !world.w(i1 - 1, k1, k) && !world.w(i1 + 1, k1, j1) && !world.w(i1, k1, j1 - 1) && !world.w(i1, k1, j1 + 1))
                world.g(i1, k1, j1, this.bM); 
            } 
          } 
        } 
      } 
    } 
  }
  
  private void tryToCatchBlockOnFire_oldLogic(ry world, int i, int j, int k, int l, Random random) {
    int i1 = this.cb[world.a(i, j, k)];
    if (random.nextInt(l) < i1) {
      boolean flag = (world.a(i, j, k) == yy.am.bM);
      if (random.nextInt(2) == 0 && !world.w(i, j, k)) {
        world.g(i, j, k, this.bM);
      } else {
        world.g(i, j, k, 0);
      } 
      if (flag)
        yy.am.e(world, i, j, k, 0); 
    } 
  }
  
  private void a(ry world, int i, int j, int k, int l, Random random, int i1) {
    int j1 = this.cb[world.a(i, j, k)];
    if (random.nextInt(l) < j1) {
      boolean flag = (world.a(i, j, k) == yy.am.bM);
      if (random.nextInt(i1 + 10) < 5 && !world.w(i, j, k)) {
        int k1 = i1 + random.nextInt(5) / 4;
        if (k1 > 15)
          k1 = 15; 
        world.d(i, j, k, this.bM, k1);
      } else {
        world.g(i, j, k, 0);
      } 
      if (flag)
        yy.am.e(world, i, j, k, 1); 
    } 
  }
  
  private boolean g(ry world, int i, int j, int k) {
    if (c(world, i + 1, j, k))
      return true; 
    if (c(world, i - 1, j, k))
      return true; 
    if (c(world, i, j - 1, k))
      return true; 
    if (c(world, i, j + 1, k))
      return true; 
    if (c(world, i, j, k - 1))
      return true; 
    return c(world, i, j, k + 1);
  }
  
  private int h(ry world, int i, int j, int k) {
    int l = 0;
    if (!world.h(i, j, k))
      return 0; 
    l = f(world, i + 1, j, k, l);
    l = f(world, i - 1, j, k, l);
    l = f(world, i, j - 1, k, l);
    l = f(world, i, j + 1, k, l);
    l = f(world, i, j, k - 1, l);
    l = f(world, i, j, k + 1, l);
    return l;
  }
  
  public boolean k() {
    return false;
  }
  
  public boolean c(kq iblockaccess, int i, int j, int k) {
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue())
      return (this.chanceToEncourageFire_old[iblockaccess.a(i, j, k)] > 0); 
    return (this.a[iblockaccess.a(i, j, k)] > 0);
  }
  
  public int f(ry world, int i, int j, int k, int l) {
    int i1 = this.a[world.a(i, j, k)];
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue())
      i1 = this.chanceToEncourageFire_old[world.a(i, j, k)]; 
    if (i1 > l)
      return i1; 
    return l;
  }
  
  public boolean c(ry world, int i, int j, int k) {
    return (world.g(i, j - 1, k) || g(world, i, j, k));
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    if (!world.g(i, j - 1, k) && !g(world, i, j, k)) {
      world.g(i, j, k, 0);
      return;
    } 
  }
  
  public void a(ry world, int i, int j, int k) {
    if (world.a(i, j - 1, k) == yy.ap.bM && yy.be.g(world, i, j, k))
      return; 
    if (!world.g(i, j - 1, k) && !g(world, i, j, k)) {
      world.g(i, j, k, 0);
      return;
    } 
    world.a(i, j, k, this.bM, d());
  }
  
  public void b(ry world, int i, int j, int k, Random random) {
    if (random.nextInt(24) == 0)
      world.a((i + 0.5F), (j + 0.5F), (k + 0.5F), "fire.fire", 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F); 
    if (world.g(i, j - 1, k) || yy.ar.c(world, i, j - 1, k)) {
      for (int l = 0; l < 3; l++) {
        float f = i + random.nextFloat();
        float f6 = j + random.nextFloat() * 0.5F + 0.5F;
        float f12 = k + random.nextFloat();
        world.a("largesmoke", f, f6, f12, 0.0D, 0.0D, 0.0D);
      } 
    } else {
      if (yy.ar.c(world, i - 1, j, k))
        for (int i1 = 0; i1 < 2; i1++) {
          float f1 = i + random.nextFloat() * 0.1F;
          float f7 = j + random.nextFloat();
          float f13 = k + random.nextFloat();
          world.a("largesmoke", f1, f7, f13, 0.0D, 0.0D, 0.0D);
        }  
      if (yy.ar.c(world, i + 1, j, k))
        for (int j1 = 0; j1 < 2; j1++) {
          float f2 = (i + 1) - random.nextFloat() * 0.1F;
          float f8 = j + random.nextFloat();
          float f14 = k + random.nextFloat();
          world.a("largesmoke", f2, f8, f14, 0.0D, 0.0D, 0.0D);
        }  
      if (yy.ar.c(world, i, j, k - 1))
        for (int k1 = 0; k1 < 2; k1++) {
          float f3 = i + random.nextFloat();
          float f9 = j + random.nextFloat();
          float f15 = k + random.nextFloat() * 0.1F;
          world.a("largesmoke", f3, f9, f15, 0.0D, 0.0D, 0.0D);
        }  
      if (yy.ar.c(world, i, j, k + 1))
        for (int l1 = 0; l1 < 2; l1++) {
          float f4 = i + random.nextFloat();
          float f10 = j + random.nextFloat();
          float f16 = (k + 1) - random.nextFloat() * 0.1F;
          world.a("largesmoke", f4, f10, f16, 0.0D, 0.0D, 0.0D);
        }  
      if (yy.ar.c(world, i, j + 1, k))
        for (int i2 = 0; i2 < 2; i2++) {
          float f5 = i + random.nextFloat();
          float f11 = (j + 1) - random.nextFloat() * 0.1F;
          float f17 = k + random.nextFloat();
          world.a("largesmoke", f5, f11, f17, 0.0D, 0.0D, 0.0D);
        }  
    } 
  }
}
