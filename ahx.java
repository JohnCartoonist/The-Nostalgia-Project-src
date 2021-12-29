import java.util.Random;

public class ahx extends agw {
  int a;
  
  boolean[] cb;
  
  int[] cc;
  
  protected ahx(int i, p material) {
    super(i, material);
    this.a = 0;
    this.cb = new boolean[4];
    this.cc = new int[4];
  }
  
  private void j(ry world, int i, int j, int k) {
    int l = world.d(i, j, k);
    world.b(i, j, k, this.bM + 1, l);
    world.c(i, j, k, i, j, k);
    world.j(i, j, k);
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    int l = g(world, i, j, k);
    byte byte0 = 1;
    if (this.bZ == p.h && !world.y.d)
      byte0 = 2; 
    if (this.bZ == p.h && ((Boolean)mod_noBiomesX.ShorterRangeLava.get()).booleanValue())
      byte0 = 2; 
    boolean flag = true;
    if (l > 0) {
      int i1 = -100;
      this.a = 0;
      i1 = f(world, i - 1, j, k, i1);
      i1 = f(world, i + 1, j, k, i1);
      i1 = f(world, i, j, k - 1, i1);
      i1 = f(world, i, j, k + 1, i1);
      int j1 = i1 + byte0;
      if (j1 >= 8 || i1 < 0)
        j1 = -1; 
      if (g(world, i, j + 1, k) >= 0) {
        int l1 = g(world, i, j + 1, k);
        if (l1 >= 8) {
          j1 = l1;
        } else {
          j1 = l1 + 8;
        } 
      } 
      if (this.a >= 2 && this.bZ == p.g)
        if (world.e(i, j - 1, k).b()) {
          j1 = 0;
        } else if (world.e(i, j - 1, k) == this.bZ && world.d(i, j, k) == 0) {
          j1 = 0;
        }  
      if (this.bZ == p.h && l < 8 && j1 < 8 && j1 > l && random.nextInt(4) != 0) {
        j1 = l;
        flag = false;
      } 
      if (j1 != l) {
        l = j1;
        if (l < 0) {
          world.g(i, j, k, 0);
        } else {
          world.f(i, j, k, l);
          world.a(i, j, k, this.bM, d());
          world.j(i, j, k, this.bM);
        } 
      } else if (flag) {
        j(world, i, j, k);
      } 
    } else {
      j(world, i, j, k);
    } 
    if (m(world, i, j - 1, k)) {
      if (this.bZ == p.h && world.e(i, j - 1, k) == p.g) {
        world.g(i, j - 1, k, yy.t.bM);
        h(world, i, j - 1, k);
        return;
      } 
      if (l >= 8) {
        world.d(i, j - 1, k, this.bM, l);
      } else {
        world.d(i, j - 1, k, this.bM, l + 8);
      } 
    } else if (l >= 0 && (l == 0 || l(world, i, j - 1, k))) {
      boolean[] aflag = k(world, i, j, k);
      int k1 = l + byte0;
      if (l >= 8)
        k1 = 1; 
      if (k1 >= 8)
        return; 
      if (aflag[0])
        g(world, i - 1, j, k, k1); 
      if (aflag[1])
        g(world, i + 1, j, k, k1); 
      if (aflag[2])
        g(world, i, j, k - 1, k1); 
      if (aflag[3])
        g(world, i, j, k + 1, k1); 
    } 
  }
  
  private void g(ry world, int i, int j, int k, int l) {
    if (m(world, i, j, k)) {
      int i1 = world.a(i, j, k);
      if (i1 > 0)
        if (this.bZ == p.h) {
          h(world, i, j, k);
        } else {
          yy.k[i1].b(world, i, j, k, world.d(i, j, k), 0);
        }  
      world.d(i, j, k, this.bM, l);
    } 
  }
  
  private int c(ry world, int i, int j, int k, int l, int i1) {
    int j1 = 1000;
    for (int k1 = 0; k1 < 4; k1++) {
      if ((k1 != 0 || i1 != 1) && (k1 != 1 || i1 != 0) && (k1 != 2 || i1 != 3) && (k1 != 3 || i1 != 2)) {
        int l1 = i;
        int i2 = j;
        int j2 = k;
        if (k1 == 0)
          l1--; 
        if (k1 == 1)
          l1++; 
        if (k1 == 2)
          j2--; 
        if (k1 == 3)
          j2++; 
        if (!l(world, l1, i2, j2) && (world.e(l1, i2, j2) != this.bZ || world.d(l1, i2, j2) != 0)) {
          if (!l(world, l1, i2 - 1, j2))
            return l; 
          if (l < 4) {
            int k2 = c(world, l1, i2, j2, l + 1, k1);
            if (k2 < j1)
              j1 = k2; 
          } 
        } 
      } 
    } 
    return j1;
  }
  
  private boolean[] k(ry world, int i, int j, int k) {
    for (int l = 0; l < 4; l++) {
      this.cc[l] = 1000;
      int j1 = i;
      int i2 = j;
      int j2 = k;
      if (l == 0)
        j1--; 
      if (l == 1)
        j1++; 
      if (l == 2)
        j2--; 
      if (l == 3)
        j2++; 
      if (!l(world, j1, i2, j2) && (world.e(j1, i2, j2) != this.bZ || world.d(j1, i2, j2) != 0))
        if (!l(world, j1, i2 - 1, j2)) {
          this.cc[l] = 0;
        } else {
          this.cc[l] = c(world, j1, i2, j2, 1, l);
        }  
    } 
    int i1 = this.cc[0];
    for (int k1 = 1; k1 < 4; k1++) {
      if (this.cc[k1] < i1)
        i1 = this.cc[k1]; 
    } 
    for (int l1 = 0; l1 < 4; l1++)
      this.cb[l1] = (this.cc[l1] == i1); 
    return this.cb;
  }
  
  private boolean l(ry world, int i, int j, int k) {
    int l = world.a(i, j, k);
    if (l == yy.aE.bM || l == yy.aL.bM || l == yy.aD.bM || l == yy.aF.bM || l == yy.aX.bM)
      return true; 
    if (l == 0)
      return false; 
    p material = (yy.k[l]).bZ;
    if (material == p.A)
      return true; 
    return material.d();
  }
  
  protected int f(ry world, int i, int j, int k, int l) {
    int i1 = g(world, i, j, k);
    if (i1 < 0)
      return l; 
    if (i1 == 0)
      this.a++; 
    if (i1 >= 8)
      i1 = 0; 
    return (l >= 0 && i1 >= l) ? l : i1;
  }
  
  private boolean m(ry world, int i, int j, int k) {
    p material = world.e(i, j, k);
    if (material == this.bZ)
      return false; 
    if (material == p.h)
      return false; 
    return !l(world, i, j, k);
  }
  
  public void a(ry world, int i, int j, int k) {
    super.a(world, i, j, k);
    if (world.a(i, j, k) == this.bM)
      world.a(i, j, k, this.bM, d()); 
  }
}
