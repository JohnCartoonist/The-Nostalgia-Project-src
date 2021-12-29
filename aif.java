import java.util.Random;

public class aif extends yy {
  protected aif(int i, int j) {
    super(i, j, p.u);
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    b(true);
  }
  
  public c b(ry world, int i, int j, int k) {
    int l = world.d(i, j, k) & 0x7;
    if (l >= 3)
      return c.b(i + this.bR, j + this.bS, k + this.bT, i + this.bU, (j + 0.5F), k + this.bW); 
    return null;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public void b(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.d(i, j, k) & 0x7;
    float f = (2 * (1 + l)) / 16.0F;
    a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
  }
  
  public boolean c(ry world, int i, int j, int k) {
    int l = world.a(i, j - 1, k);
    boolean flag = false;
    if (((Boolean)mod_noBiomesX.SnowFallOnGlass.get()).booleanValue())
      flag = (l == yy.M.bM || l == yy.K.bM); 
    if (flag)
      return true; 
    if (l == 0 || !yy.k[l].a())
      return false; 
    return world.e(i, j - 1, k).d();
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    g(world, i, j, k);
  }
  
  private boolean g(ry world, int i, int j, int k) {
    if (!c(world, i, j, k)) {
      b(world, i, j, k, world.d(i, j, k), 0);
      world.g(i, j, k, 0);
      return false;
    } 
    return true;
  }
  
  public void a(ry world, vi entityplayer, int i, int j, int k, int l) {
    int i1 = acy.aC.bM;
    float f = 0.7F;
    double d = (world.w.nextFloat() * f) + (1.0F - f) * 0.5D;
    double d1 = (world.w.nextFloat() * f) + (1.0F - f) * 0.5D;
    double d2 = (world.w.nextFloat() * f) + (1.0F - f) * 0.5D;
    ih entityitem = new ih(world, i + d, j + d1, k + d2, new dk(i1, 1, 0));
    entityitem.c = 10;
    world.a((ia)entityitem);
    world.g(i, j, k, 0);
    entityplayer.a(ny.C[this.bM], 1);
  }
  
  public int a(int i, Random random, int j) {
    return acy.aC.bM;
  }
  
  public int a(Random random) {
    return 0;
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (world.b(bn.b, i, j, k) > 11) {
      b(world, i, j, k, world.d(i, j, k), 0);
      world.g(i, j, k, 0);
    } 
  }
  
  public boolean a_(kq iblockaccess, int i, int j, int k, int l) {
    if (l == 1)
      return true; 
    return super.a_(iblockaccess, i, j, k, l);
  }
}
