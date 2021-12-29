import java.util.Random;

public class ahl extends yy {
  public ahl(int i) {
    super(i, 143, p.k);
    b(true);
  }
  
  public void e() {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public int c() {
    return 20;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public void b(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.d(i, j, k);
    float f = 1.0F;
    float f1 = 1.0F;
    float f2 = 1.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    boolean flag = (l > 0);
    if ((l & 0x2) != 0) {
      f3 = Math.max(f3, 0.0625F);
      f = 0.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      flag = true;
    } 
    if ((l & 0x8) != 0) {
      f = Math.min(f, 0.9375F);
      f3 = 1.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
      flag = true;
    } 
    if ((l & 0x4) != 0) {
      f5 = Math.max(f5, 0.0625F);
      f2 = 0.0F;
      f = 0.0F;
      f3 = 1.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      flag = true;
    } 
    if ((l & 0x1) != 0) {
      f2 = Math.min(f2, 0.9375F);
      f5 = 1.0F;
      f = 0.0F;
      f3 = 1.0F;
      f1 = 0.0F;
      f4 = 1.0F;
      flag = true;
    } 
    if (!flag && e(iblockaccess.a(i, j + 1, k))) {
      f1 = Math.min(f1, 0.9375F);
      f4 = 1.0F;
      f = 0.0F;
      f3 = 1.0F;
      f2 = 0.0F;
      f5 = 1.0F;
    } 
    a(f, f1, f2, f3, f4, f5);
  }
  
  public c b(ry world, int i, int j, int k) {
    return null;
  }
  
  public boolean d(ry world, int i, int j, int k, int l) {
    switch (l) {
      default:
        return false;
      case 1:
        return e(world.a(i, j + 1, k));
      case 2:
        return e(world.a(i, j, k + 1));
      case 3:
        return e(world.a(i, j, k - 1));
      case 5:
        return e(world.a(i - 1, j, k));
      case 4:
        break;
    } 
    return e(world.a(i + 1, j, k));
  }
  
  private boolean e(int i) {
    if (i == 0)
      return false; 
    yy block = yy.k[i];
    return (block.b() && block.bZ.d());
  }
  
  private boolean g(ry world, int i, int j, int k) {
    int l = world.d(i, j, k);
    int i1 = l;
    if (i1 > 0)
      for (int j1 = 0; j1 <= 3; j1++) {
        int k1 = 1 << j1;
        if ((l & k1) != 0 && !e(world.a(i + lz.a[j1], j, k + lz.b[j1])) && (world.a(i, j + 1, k) != this.bM || (world.d(i, j + 1, k) & k1) == 0))
          i1 &= k1 ^ 0xFFFFFFFF; 
      }  
    if (i1 == 0 && !e(world.a(i, j + 1, k)))
      return false; 
    if (i1 != l)
      world.f(i, j, k, i1); 
    return true;
  }
  
  public int f() {
    return db.c();
  }
  
  public int c(int i) {
    return db.c();
  }
  
  public int a(kq iblockaccess, int i, int j, int k) {
    iblockaccess.a().oldFunc_4069_a(i, k, 1, 1);
    double d = (iblockaccess.a()).temperature[0];
    double d1 = (iblockaccess.a()).humidity[0];
    return db.a(d, d1);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    if (!world.I && !g(world, i, j, k)) {
      b(world, i, j, k, world.d(i, j, k), 0);
      world.g(i, j, k, 0);
    } 
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (!world.I && world.w.nextInt(4) == 0) {
      byte byte0 = 4;
      int l = 5;
      boolean flag = false;
      int i1 = i - byte0;
      label88: while (i1 <= i + byte0) {
        for (int j1 = k - byte0; j1 <= k + byte0; j1++) {
          int l1 = j - 1;
          while (l1 <= j + 1) {
            if (world.a(i1, l1, j1) == this.bM && --l <= 0) {
              flag = true;
              break label88;
            } 
            l1++;
          } 
        } 
        i1++;
      } 
      i1 = world.d(i, j, k);
      int k1 = world.w.nextInt(6);
      int i2 = lz.d[k1];
      if (k1 == 1 && j < world.c - 1 && world.h(i, j + 1, k)) {
        if (flag)
          return; 
        int j2 = world.w.nextInt(16) & i1;
        if (j2 > 0) {
          for (int i3 = 0; i3 <= 3; i3++) {
            if (!e(world.a(i + lz.a[i3], j + 1, k + lz.b[i3])))
              j2 &= 1 << i3 ^ 0xFFFFFFFF; 
          } 
          if (j2 > 0)
            world.d(i, j + 1, k, this.bM, j2); 
        } 
      } else if (k1 >= 2 && k1 <= 5 && (i1 & 1 << i2) == 0) {
        if (flag)
          return; 
        int k2 = world.a(i + lz.a[i2], j, k + lz.b[i2]);
        if (k2 == 0 || yy.k[k2] == null) {
          int j3 = i2 + 1 & 0x3;
          int i4 = i2 + 3 & 0x3;
          if ((i1 & 1 << j3) != 0 && e(world.a(i + lz.a[i2] + lz.a[j3], j, k + lz.b[i2] + lz.b[j3]))) {
            world.d(i + lz.a[i2], j, k + lz.b[i2], this.bM, 1 << j3);
          } else if ((i1 & 1 << i4) != 0 && e(world.a(i + lz.a[i2] + lz.a[i4], j, k + lz.b[i2] + lz.b[i4]))) {
            world.d(i + lz.a[i2], j, k + lz.b[i2], this.bM, 1 << i4);
          } else if ((i1 & 1 << j3) != 0 && world.h(i + lz.a[i2] + lz.a[j3], j, k + lz.b[i2] + lz.b[j3]) && e(world.a(i + lz.a[j3], j, k + lz.b[j3]))) {
            world.d(i + lz.a[i2] + lz.a[j3], j, k + lz.b[i2] + lz.b[j3], this.bM, 1 << (i2 + 2 & 0x3));
          } else if ((i1 & 1 << i4) != 0 && world.h(i + lz.a[i2] + lz.a[i4], j, k + lz.b[i2] + lz.b[i4]) && e(world.a(i + lz.a[i4], j, k + lz.b[i4]))) {
            world.d(i + lz.a[i2] + lz.a[i4], j, k + lz.b[i2] + lz.b[i4], this.bM, 1 << (i2 + 2 & 0x3));
          } else if (e(world.a(i + lz.a[i2], j + 1, k + lz.b[i2]))) {
            world.d(i + lz.a[i2], j, k + lz.b[i2], this.bM, 0);
          } 
        } else if ((yy.k[k2]).bZ.j() && yy.k[k2].b()) {
          world.f(i, j, k, i1 | 1 << i2);
        } 
      } else if (j > 1) {
        int l2 = world.a(i, j - 1, k);
        if (l2 == 0) {
          int k3 = world.w.nextInt(16) & i1;
          if (k3 > 0)
            world.d(i, j - 1, k, this.bM, k3); 
        } else if (l2 == this.bM) {
          int l3 = world.w.nextInt(16) & i1;
          int j4 = world.d(i, j - 1, k);
          if (j4 != (j4 | l3))
            world.f(i, j - 1, k, j4 | l3); 
        } 
      } 
    } 
  }
  
  public void b(ry world, int i, int j, int k, int l) {
    byte byte0 = 0;
    switch (l) {
      case 2:
        byte0 = 1;
        break;
      case 3:
        byte0 = 4;
        break;
      case 4:
        byte0 = 8;
        break;
      case 5:
        byte0 = 2;
        break;
    } 
    if (byte0 != 0)
      world.f(i, j, k, byte0); 
  }
  
  public int a(int i, Random random, int j) {
    return 0;
  }
  
  public int a(Random random) {
    return 0;
  }
  
  public void a(ry world, vi entityplayer, int i, int j, int k, int l) {
    if (!world.I && entityplayer.aH() != null && (entityplayer.aH()).c == acy.bd.bM) {
      entityplayer.a(ny.C[this.bM], 1);
      a(world, i, j, k, new dk(yy.bu, 1, 0));
    } else {
      super.a(world, entityplayer, i, j, k, l);
    } 
  }
}
