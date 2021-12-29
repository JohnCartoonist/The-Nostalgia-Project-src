import java.util.Random;

public class aem extends yy {
  protected aem(int i, int j) {
    super(i, j, p.B);
    b(true);
  }
  
  public void b(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.d(i, j, k);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    a(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
  }
  
  public void e() {
    float f = 0.0625F;
    float f1 = 0.5F;
    a(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
  }
  
  public c b(ry world, int i, int j, int k) {
    int l = world.d(i, j, k);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    return c.b((i + f1), j, (k + f), ((i + 1) - f), (j + f2 - f), ((k + 1) - f));
  }
  
  public c c_(ry world, int i, int j, int k) {
    int l = world.d(i, j, k);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    return c.b((i + f1), j, (k + f), ((i + 1) - f), (j + f2), ((k + 1) - f));
  }
  
  public int a(int i, int j) {
    if (i == 1)
      return this.bL; 
    if (i == 0)
      return this.bL + 3; 
    if (j > 0 && i == 4)
      return this.bL + 2; 
    return this.bL + 1;
  }
  
  public int b(int i) {
    if (i == 1)
      return this.bL; 
    if (i == 0)
      return this.bL + 3; 
    return this.bL + 1;
  }
  
  public boolean b() {
    return false;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean a(ry world, int i, int j, int k, vi entityplayer) {
    c(world, i, j, k, entityplayer);
    return true;
  }
  
  public void b(ry world, int i, int j, int k, vi entityplayer) {
    c(world, i, j, k, entityplayer);
  }
  
  private void c(ry world, int i, int j, int k, vi entityplayer) {
    if (entityplayer.b(false)) {
      if (((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
        entityplayer.aO().a(2, 0.1F);
      } else {
        entityplayer.a_(3);
      } 
      int l = world.d(i, j, k) + 1;
      if (l >= 6) {
        world.g(i, j, k, 0);
      } else {
        world.f(i, j, k, l);
        world.k(i, j, k);
      } 
    } 
  }
  
  public boolean c(ry world, int i, int j, int k) {
    if (!super.c(world, i, j, k))
      return false; 
    return e(world, i, j, k);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    if (!e(world, i, j, k)) {
      b(world, i, j, k, world.d(i, j, k), 0);
      world.g(i, j, k, 0);
    } 
  }
  
  public boolean e(ry world, int i, int j, int k) {
    return world.e(i, j - 1, k).b();
  }
  
  public int a(Random random) {
    return 0;
  }
  
  public int a(int i, Random random, int j) {
    return 0;
  }
}
