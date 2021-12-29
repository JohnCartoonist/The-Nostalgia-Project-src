import java.util.Random;

public class md extends yy {
  protected md(int i, int j) {
    super(i, p.j);
    this.bL = j;
    float f = 0.375F;
    a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
    b(true);
  }
  
  public void a(ry world, int i, int j, int k, Random random) {
    if (world.h(i, j + 1, k)) {
      int l;
      for (l = 1; world.a(i, j - l, k) == this.bM; l++);
      if (l < 3) {
        int i1 = world.d(i, j, k);
        if (i1 == 15) {
          world.g(i, j + 1, k, this.bM);
          world.f(i, j, k, 0);
        } else {
          world.f(i, j, k, i1 + 1);
        } 
      } 
    } 
  }
  
  public boolean c(ry world, int i, int j, int k) {
    int l = world.a(i, j - 1, k);
    boolean flag = (l == yy.u.bM || l == yy.v.bM || l == yy.E.bM);
    if (((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue())
      flag = (l == yy.u.bM || l == yy.v.bM); 
    if (l == this.bM)
      return true; 
    if (!flag)
      return false; 
    if (world.e(i - 1, j - 1, k) == p.g)
      return true; 
    if (world.e(i + 1, j - 1, k) == p.g)
      return true; 
    if (world.e(i, j - 1, k - 1) == p.g)
      return true; 
    return (world.e(i, j - 1, k + 1) == p.g);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    f(world, i, j, k);
  }
  
  protected final void f(ry world, int i, int j, int k) {
    if (!e(world, i, j, k)) {
      b(world, i, j, k, world.d(i, j, k), 0);
      world.g(i, j, k, 0);
    } 
  }
  
  public boolean e(ry world, int i, int j, int k) {
    return c(world, i, j, k);
  }
  
  public c b(ry world, int i, int j, int k) {
    return null;
  }
  
  public int a(int i, Random random, int j) {
    return acy.aI.bM;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 1;
  }
}
