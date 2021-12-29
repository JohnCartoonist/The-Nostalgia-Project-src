import java.util.Random;

public class jb extends yy {
  protected jb(int i) {
    super(i, p.b);
    this.bL = 3;
    b(true);
  }
  
  public int a(int i, int j) {
    if (i == 1)
      return 0; 
    return (i != 0) ? 3 : 2;
  }
  
  public int a(kq iblockaccess, int i, int j, int k, int l) {
    if (l == 1)
      return 0; 
    if (l == 0)
      return 2; 
    p material = iblockaccess.e(i, j + 1, k);
    return (material != p.u && material != p.v) ? 3 : 68;
  }
  
  public int f() {
    double d = 0.5D;
    double d1 = 1.0D;
    return ha.a(d, d1);
  }
  
  public int c(int i) {
    return f();
  }
  
  public int a(kq iblockaccess, int i, int j, int k) {
    iblockaccess.a().oldFunc_4069_a(i, k, 1, 1);
    double d = (iblockaccess.a()).temperature[0];
    double d1 = (iblockaccess.a()).humidity[0];
    return ha.a(d, d1);
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (world.I)
      return; 
    if (world.n(i, j + 1, k) < 4 && yy.o[world.a(i, j + 1, k)] > 2) {
      world.g(i, j, k, yy.v.bM);
    } else if (world.n(i, j + 1, k) >= 9) {
      for (int l = 0; l < 4; l++) {
        int i1 = i + random.nextInt(3) - 1;
        int j1 = j + random.nextInt(5) - 3;
        int k1 = k + random.nextInt(3) - 1;
        int l1 = world.a(i1, j1 + 1, k1);
        if (world.a(i1, j1, k1) == yy.v.bM && world.n(i1, j1 + 1, k1) >= 4 && yy.o[l1] <= 2)
          world.g(i1, j1, k1, yy.u.bM); 
      } 
    } 
  }
  
  public int a(int i, Random random, int j) {
    return yy.v.a(0, random, j);
  }
}
