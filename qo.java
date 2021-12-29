import java.util.Random;

public class qo extends zt {
  private int cc;
  
  int[] a;
  
  protected qo(int i, int j) {
    super(i, j, p.i, false);
    this.cc = j;
    b(true);
  }
  
  public int f() {
    double d = 0.5D;
    double d1 = 1.0D;
    return db.a(d, d1);
  }
  
  public int c(int i) {
    if ((i & 0x1) == 1)
      return db.a(); 
    if ((i & 0x2) == 2)
      return db.b(); 
    return db.c();
  }
  
  public int a(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.d(i, j, k);
    if ((l & 0x1) == 1 && ((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue())
      return db.a(); 
    if ((l & 0x2) == 2 && ((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue())
      return db.b(); 
    iblockaccess.a().oldFunc_4069_a(i, k, 1, 1);
    double d = (iblockaccess.a()).temperature[0];
    double d1 = (iblockaccess.a()).humidity[0];
    return db.a(d, d1);
  }
  
  public void d(ry world, int i, int j, int k) {
    int l = 1;
    int i1 = l + 1;
    if (world.b(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1))
      for (int j1 = -l; j1 <= l; j1++) {
        for (int k1 = -l; k1 <= l; k1++) {
          for (int l1 = -l; l1 <= l; l1++) {
            int i2 = world.a(i + j1, j + k1, k + l1);
            if (i2 == yy.K.bM) {
              int j2 = world.d(i + j1, j + k1, k + l1);
              world.c(i + j1, j + k1, k + l1, j2 | 0x8);
            } 
          } 
        } 
      }  
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (world.I)
      return; 
    int l = world.d(i, j, k);
    if ((l & 0x8) != 0 && (l & 0x4) == 0) {
      byte byte0 = 4;
      int i1 = byte0 + 1;
      byte byte1 = 32;
      int j1 = byte1 * byte1;
      int k1 = byte1 / 2;
      if (this.a == null)
        this.a = new int[byte1 * byte1 * byte1]; 
      if (world.b(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1)) {
        for (int l1 = -byte0; l1 <= byte0; l1++) {
          for (int k2 = -byte0; k2 <= byte0; k2++) {
            for (int i3 = -byte0; i3 <= byte0; i3++) {
              int k3 = world.a(i + l1, j + k2, k + i3);
              if (k3 == yy.J.bM) {
                this.a[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = 0;
              } else if (k3 == yy.K.bM) {
                this.a[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = -2;
              } else {
                this.a[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = -1;
              } 
            } 
          } 
        } 
        for (int i2 = 1; i2 <= 4; i2++) {
          for (int l2 = -byte0; l2 <= byte0; l2++) {
            for (int j3 = -byte0; j3 <= byte0; j3++) {
              for (int l3 = -byte0; l3 <= byte0; l3++) {
                if (this.a[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1] == i2 - 1) {
                  if (this.a[(l2 + k1 - 1) * j1 + (j3 + k1) * byte1 + l3 + k1] == -2)
                    this.a[(l2 + k1 - 1) * j1 + (j3 + k1) * byte1 + l3 + k1] = i2; 
                  if (this.a[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + l3 + k1] == -2)
                    this.a[(l2 + k1 + 1) * j1 + (j3 + k1) * byte1 + l3 + k1] = i2; 
                  if (this.a[(l2 + k1) * j1 + (j3 + k1 - 1) * byte1 + l3 + k1] == -2)
                    this.a[(l2 + k1) * j1 + (j3 + k1 - 1) * byte1 + l3 + k1] = i2; 
                  if (this.a[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + l3 + k1] == -2)
                    this.a[(l2 + k1) * j1 + (j3 + k1 + 1) * byte1 + l3 + k1] = i2; 
                  if (this.a[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 - 1] == -2)
                    this.a[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 - 1] = i2; 
                  if (this.a[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 + 1] == -2)
                    this.a[(l2 + k1) * j1 + (j3 + k1) * byte1 + l3 + k1 + 1] = i2; 
                } 
              } 
            } 
          } 
        } 
      } 
      int j2 = this.a[k1 * j1 + k1 * byte1 + k1];
      if (j2 >= 0) {
        world.c(i, j, k, l & 0xFFFFFFF7);
      } else {
        g(world, i, j, k);
      } 
    } 
  }
  
  private void g(ry world, int i, int j, int k) {
    b(world, i, j, k, world.d(i, j, k), 0);
    world.g(i, j, k, 0);
  }
  
  public int a(Random random) {
    return (random.nextInt(20) != 0) ? 0 : 1;
  }
  
  public int a(int i, Random random, int j) {
    return yy.y.bM;
  }
  
  public void a(ry world, vi entityplayer, int i, int j, int k, int l) {
    if (!world.I && entityplayer.aH() != null && (entityplayer.aH()).c == acy.bd.bM) {
      entityplayer.a(ny.C[this.bM], 1);
      a(world, i, j, k, new dk(yy.K.bM, 1, l & 0x3));
    } else {
      super.a(world, entityplayer, i, j, k, l);
    } 
  }
  
  protected int a(int i) {
    return i & 0x3;
  }
  
  public boolean a() {
    return !this.cb;
  }
  
  public int a(int i, int j) {
    if ((j & 0x3) == 1)
      return this.bL + 80; 
    return this.bL;
  }
  
  public void a(boolean flag) {
    this.cb = flag;
    this.bL = this.cc + (flag ? 0 : 1);
  }
  
  public void b(ry world, int i, int j, int k, ia entity) {
    super.b(world, i, j, k, entity);
  }
}
