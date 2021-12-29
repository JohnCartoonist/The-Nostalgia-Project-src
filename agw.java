import java.util.Random;

public abstract class agw extends yy {
  protected agw(int i, p material) {
    super(i, ((material != p.h) ? 12 : 14) * 16 + 13, material);
    float f = 0.0F;
    float f1 = 0.0F;
    a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
    b(true);
  }
  
  public int f() {
    return 16777215;
  }
  
  public int a(kq iblockaccess, int i, int j, int k) {
    return 16777215;
  }
  
  public static float e(int i) {
    if (i >= 8)
      i = 0; 
    float f = (i + 1) / 9.0F;
    return f;
  }
  
  public int b(int i) {
    if (i == 0 || i == 1)
      return this.bL; 
    return this.bL + 1;
  }
  
  protected int g(ry world, int i, int j, int k) {
    if (world.e(i, j, k) != this.bZ)
      return -1; 
    return world.d(i, j, k);
  }
  
  protected int c(kq iblockaccess, int i, int j, int k) {
    if (iblockaccess.e(i, j, k) != this.bZ)
      return -1; 
    int l = iblockaccess.d(i, j, k);
    if (l >= 8)
      l = 0; 
    return l;
  }
  
  public boolean b() {
    return false;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean a(int i, boolean flag) {
    return (flag && i == 0);
  }
  
  public boolean e(kq iblockaccess, int i, int j, int k, int l) {
    p material = iblockaccess.e(i, j, k);
    if (material == this.bZ)
      return false; 
    if (l == 1)
      return true; 
    if (material == p.t)
      return false; 
    return super.e(iblockaccess, i, j, k, l);
  }
  
  public boolean a_(kq iblockaccess, int i, int j, int k, int l) {
    p material = iblockaccess.e(i, j, k);
    if (material == this.bZ)
      return false; 
    if (l == 1)
      return true; 
    if (material == p.t)
      return false; 
    return super.a_(iblockaccess, i, j, k, l);
  }
  
  public c b(ry world, int i, int j, int k) {
    return null;
  }
  
  public int c() {
    return 4;
  }
  
  public int a(int i, Random random, int j) {
    return 0;
  }
  
  public int a(Random random) {
    return 0;
  }
  
  private fb g(kq iblockaccess, int i, int j, int k) {
    fb vec3d = fb.b(0.0D, 0.0D, 0.0D);
    int l = c(iblockaccess, i, j, k);
    for (int i1 = 0; i1 < 4; i1++) {
      int j1 = i;
      int k1 = j;
      int l1 = k;
      if (i1 == 0)
        j1--; 
      if (i1 == 1)
        l1--; 
      if (i1 == 2)
        j1++; 
      if (i1 == 3)
        l1++; 
      int i2 = c(iblockaccess, j1, k1, l1);
      if (i2 < 0) {
        if (!iblockaccess.e(j1, k1, l1).d()) {
          i2 = c(iblockaccess, j1, k1 - 1, l1);
          if (i2 >= 0) {
            int j2 = i2 - l - 8;
            vec3d = vec3d.c(((j1 - i) * j2), ((k1 - j) * j2), ((l1 - k) * j2));
          } 
        } 
      } else if (i2 >= 0) {
        int k2 = i2 - l;
        vec3d = vec3d.c(((j1 - i) * k2), ((k1 - j) * k2), ((l1 - k) * k2));
      } 
    } 
    if (iblockaccess.d(i, j, k) >= 8) {
      boolean flag = false;
      if (flag || e(iblockaccess, i, j, k - 1, 2))
        flag = true; 
      if (flag || e(iblockaccess, i, j, k + 1, 3))
        flag = true; 
      if (flag || e(iblockaccess, i - 1, j, k, 4))
        flag = true; 
      if (flag || e(iblockaccess, i + 1, j, k, 5))
        flag = true; 
      if (flag || e(iblockaccess, i, j + 1, k - 1, 2))
        flag = true; 
      if (flag || e(iblockaccess, i, j + 1, k + 1, 3))
        flag = true; 
      if (flag || e(iblockaccess, i - 1, j + 1, k, 4))
        flag = true; 
      if (flag || e(iblockaccess, i + 1, j + 1, k, 5))
        flag = true; 
      if (flag)
        vec3d = vec3d.c().c(0.0D, -6.0D, 0.0D); 
    } 
    vec3d = vec3d.c();
    return vec3d;
  }
  
  public void a(ry world, int i, int j, int k, ia entity, fb vec3d) {
    fb vec3d1 = g(world, i, j, k);
    vec3d.a += vec3d1.a;
    vec3d.b += vec3d1.b;
    vec3d.c += vec3d1.c;
  }
  
  public int d() {
    if (this.bZ == p.g)
      return 5; 
    return (this.bZ != p.h) ? 0 : 30;
  }
  
  public int e(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.a(i, j, k, 0);
    int i1 = iblockaccess.a(i, j + 1, k, 0);
    int j1 = l & 0xFF;
    int k1 = i1 & 0xFF;
    int l1 = l >> 16 & 0xFF;
    int i2 = i1 >> 16 & 0xFF;
    return ((j1 <= k1) ? k1 : j1) | ((l1 <= i2) ? i2 : l1) << 16;
  }
  
  public float d(kq iblockaccess, int i, int j, int k) {
    float f = iblockaccess.c(i, j, k);
    float f1 = iblockaccess.c(i, j + 1, k);
    return (f <= f1) ? f1 : f;
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    super.a(world, i, j, k, random);
  }
  
  public int h() {
    return (this.bZ != p.g) ? 0 : 1;
  }
  
  public void b(ry world, int i, int j, int k, Random random) {
    if (this.bZ == p.g) {
      if (random.nextInt(10) == 0) {
        int l = world.d(i, j, k);
        if (l <= 0 || l >= 8)
          world.a("suspended", (i + random.nextFloat()), (j + random.nextFloat()), (k + random.nextFloat()), 0.0D, 0.0D, 0.0D); 
      } 
      for (int i1 = 0; i1 < 0; i1++) {
        int k1 = random.nextInt(4);
        int l1 = i;
        int i2 = k;
        if (k1 == 0)
          l1--; 
        if (k1 == 1)
          l1++; 
        if (k1 == 2)
          i2--; 
        if (k1 == 3)
          i2++; 
        if (world.e(l1, j, i2) == p.a && (world.e(l1, j - 1, i2).d() || world.e(l1, j - 1, i2).a())) {
          float f = 0.0625F;
          double d6 = (i + random.nextFloat());
          double d7 = (j + random.nextFloat());
          double d8 = (k + random.nextFloat());
          if (k1 == 0)
            d6 = (i - f); 
          if (k1 == 1)
            d6 = ((i + 1) + f); 
          if (k1 == 2)
            d8 = (k - f); 
          if (k1 == 3)
            d8 = ((k + 1) + f); 
          double d9 = 0.0D;
          double d10 = 0.0D;
          if (k1 == 0)
            d9 = -f; 
          if (k1 == 1)
            d9 = f; 
          if (k1 == 2)
            d10 = -f; 
          if (k1 == 3)
            d10 = f; 
          world.a("splash", d6, d7, d8, d9, 0.0D, d10);
        } 
      } 
    } 
    if (this.bZ == p.g && random.nextInt(64) == 0) {
      int j1 = world.d(i, j, k);
      if (j1 > 0 && j1 < 8)
        world.a((i + 0.5F), (j + 0.5F), (k + 0.5F), "liquid.water", random.nextFloat() * 0.25F + 0.75F, random.nextFloat() * 1.0F + 0.5F); 
    } 
    if (this.bZ == p.h && world.e(i, j + 1, k) == p.a && !world.f(i, j + 1, k) && random.nextInt(100) == 0) {
      double d = (i + random.nextFloat());
      double d2 = j + this.bV;
      double d4 = (k + random.nextFloat());
      world.a("lava", d, d2, d4, 0.0D, 0.0D, 0.0D);
    } 
    if (random.nextInt(10) == 0 && world.g(i, j - 1, k) && !world.e(i, j - 2, k).d() && !((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue()) {
      double d1 = (i + random.nextFloat());
      double d3 = j - 1.05D;
      double d5 = (k + random.nextFloat());
      if (this.bZ == p.g) {
        world.a("dripWater", d1, d3, d5, 0.0D, 0.0D, 0.0D);
      } else {
        world.a("dripLava", d1, d3, d5, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public static double a(kq iblockaccess, int i, int j, int k, p material) {
    fb vec3d = null;
    if (material == p.g)
      vec3d = ((agw)yy.A).g(iblockaccess, i, j, k); 
    if (material == p.h)
      vec3d = ((agw)yy.C).g(iblockaccess, i, j, k); 
    if (vec3d.a == 0.0D && vec3d.c == 0.0D)
      return -1000.0D; 
    return Math.atan2(vec3d.c, vec3d.a) - 1.5707963267948966D;
  }
  
  public void a(ry world, int i, int j, int k) {
    j(world, i, j, k);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    j(world, i, j, k);
  }
  
  private void j(ry world, int i, int j, int k) {
    if (world.a(i, j, k) != this.bM)
      return; 
    if (this.bZ == p.h) {
      boolean flag = false;
      if (flag || world.e(i, j, k - 1) == p.g)
        flag = true; 
      if (flag || world.e(i, j, k + 1) == p.g)
        flag = true; 
      if (flag || world.e(i - 1, j, k) == p.g)
        flag = true; 
      if (flag || world.e(i + 1, j, k) == p.g)
        flag = true; 
      if (flag || world.e(i, j + 1, k) == p.g)
        flag = true; 
      if (flag) {
        int l = world.d(i, j, k);
        if (l == 0) {
          world.g(i, j, k, yy.ap.bM);
        } else if (l <= 4) {
          world.g(i, j, k, yy.w.bM);
        } 
        h(world, i, j, k);
      } 
    } 
  }
  
  protected void h(ry world, int i, int j, int k) {
    world.a((i + 0.5F), (j + 0.5F), (k + 0.5F), "random.fizz", 0.5F, 2.6F + (world.w.nextFloat() - world.w.nextFloat()) * 0.8F);
    for (int l = 0; l < 8; l++)
      world.a("largesmoke", i + Math.random(), j + 1.2D, k + Math.random(), 0.0D, 0.0D, 0.0D); 
  }
}
