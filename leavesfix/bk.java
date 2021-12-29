import java.util.Random;

public class bk extends nr {
  private int c;
  
  int[] a;
  
  protected bk(int i, int j) {
    super(i, j, ln.i, false);
    this.c = j;
    b(true);
  }
  
  public int b(int i) {
    return jh.c();
  }
  
  public int b(xp iblockaccess, int i, int j, int k) {
    iblockaccess.a().a(i, k, 1, 1);
    double d = (iblockaccess.a()).a[0];
    double d1 = (iblockaccess.a()).b[0];
    return jh.a(d, d1);
  }
  
  public void b(fd world, int i, int j, int k) {
    int l = 1;
    int i1 = l + 1;
    if (world.a(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1))
      for (int j1 = -l; j1 <= l; j1++) {
        for (int k1 = -l; k1 <= l; k1++) {
          for (int l1 = -l; l1 <= l; l1++) {
            int i2 = world.a(i + j1, j + k1, k + l1);
            if (i2 == uu.L.bn) {
              int j2 = world.e(i + j1, j + k1, k + l1);
              world.e(i + j1, j + k1, k + l1, j2 | 0x8);
            } 
          } 
        } 
      }  
  }
  
  public void a(fd world, int i, int j, int k, Random random) {
    if (world.B)
      return; 
    int l = world.e(i, j, k);
    if ((l & 0x8) != 0) {
      byte byte0 = 4;
      int i1 = byte0 + 1;
      byte byte1 = 32;
      int j1 = byte1 * byte1;
      int k1 = byte1 / 2;
      if (this.a == null)
        this.a = new int[byte1 * byte1 * byte1]; 
      if (world.a(i - i1, j - i1, k - i1, i + i1, j + i1, k + i1)) {
        for (int l1 = -byte0; l1 <= byte0; l1++) {
          for (int k2 = -byte0; k2 <= byte0; k2++) {
            for (int i3 = -byte0; i3 <= byte0; i3++) {
              int k3 = world.a(i + l1, j + k2, k + i3);
              if (k3 == uu.K.bn) {
                this.a[(l1 + k1) * j1 + (k2 + k1) * byte1 + i3 + k1] = 0;
              } else if (k3 == uu.L.bn) {
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
        world.e(i, j, k, l & 0xFFFFFFF7);
      } else {
        h(world, i, j, k);
      } 
    } 
  }
  
  private void h(fd world, int i, int j, int k) {
    g(world, i, j, k, world.e(i, j, k));
    world.f(i, j, k, 0);
  }
  
  public int a(Random random) {
    return (random.nextInt(20) != 0) ? 0 : 1;
  }
  
  public int a(int i, Random random) {
    return uu.z.bn;
  }
  
  public void a(fd world, gs entityplayer, int i, int j, int k, int l) {
    if (!world.B && entityplayer.G() != null && (entityplayer.G()).c == gm.bc.bf) {
      entityplayer.a(jl.C[this.bn], 1);
      a(world, i, j, k, new iz(uu.L.bn, 1, l & 0x3));
    } else {
      super.a(world, entityplayer, i, j, k, l);
    } 
  }
  
  protected int b_(int i) {
    return i & 0x3;
  }
  
  public boolean c() {
    return !this.b;
  }
  
  public int a(int i, int j) {
    return this.bm;
  }
  
  public void a(boolean flag) {
    this.b = flag;
    this.bm = this.c + (flag ? 0 : 1);
  }
  
  public void b(fd world, int i, int j, int k, sn entity) {
    super.b(world, i, j, k, entity);
  }
}
