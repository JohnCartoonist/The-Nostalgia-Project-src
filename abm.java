import java.util.Random;

public class abm extends yy {
  public abm(int i, int j) {
    super(i, j, p.r);
  }
  
  public int b(int i) {
    if (i == 0)
      return this.bL + 2; 
    if (i == 1)
      return this.bL + 1; 
    return this.bL;
  }
  
  public void a(ry world, int i, int j, int k) {
    super.a(world, i, j, k);
    if (world.v(i, j, k)) {
      e(world, i, j, k, 1);
      world.g(i, j, k, 0);
    } 
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    if (l > 0 && yy.k[l].g() && world.v(i, j, k)) {
      e(world, i, j, k, 1);
      world.g(i, j, k, 0);
    } 
  }
  
  public int a(Random random) {
    return 0;
  }
  
  public void i(ry world, int i, int j, int k) {
    dd entitytntprimed = new dd(world, (i + 0.5F), (j + 0.5F), (k + 0.5F));
    entitytntprimed.a = world.w.nextInt(entitytntprimed.a / 4) + entitytntprimed.a / 8;
    world.a((ia)entitytntprimed);
  }
  
  public void e(ry world, int i, int j, int k, int l) {
    if (world.I)
      return; 
    if ((l & 0x1) == 0 && !((Boolean)mod_noBiomesX.NoBetaBlockActions.get()).booleanValue()) {
      a(world, i, j, k, new dk(yy.am.bM, 1, 0));
    } else {
      dd entitytntprimed = new dd(world, (i + 0.5F), (j + 0.5F), (k + 0.5F));
      world.a((ia)entitytntprimed);
      world.a((ia)entitytntprimed, "random.fuse", 1.0F, 1.0F);
    } 
  }
  
  public void b(ry world, int i, int j, int k, vi entityplayer) {
    if (entityplayer.aH() != null && (entityplayer.aH()).c == acy.h.bM)
      world.c(i, j, k, 1); 
    super.b(world, i, j, k, entityplayer);
  }
  
  public boolean a(ry world, int i, int j, int k, vi entityplayer) {
    return super.a(world, i, j, k, entityplayer);
  }
  
  protected dk c_(int i) {
    return null;
  }
}
