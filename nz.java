public class nz extends yy {
  public nz(int i, int j) {
    super(i, j, p.d);
  }
  
  public nz(int i, int j, p material) {
    super(i, j, material);
  }
  
  public boolean c(ry world, int i, int j, int k) {
    return super.c(world, i, j, k);
  }
  
  public c b(ry world, int i, int j, int k) {
    boolean flag = c(world, i, j, k - 1);
    boolean flag1 = c(world, i, j, k + 1);
    boolean flag2 = c(world, i - 1, j, k);
    boolean flag3 = c(world, i + 1, j, k);
    float f = 0.375F;
    float f1 = 0.625F;
    float f2 = 0.375F;
    float f3 = 0.625F;
    if (flag)
      f2 = 0.0F; 
    if (flag1)
      f3 = 1.0F; 
    if (flag2)
      f = 0.0F; 
    if (flag3)
      f1 = 1.0F; 
    if (((Boolean)mod_noBiomesX.BigFences.get()).booleanValue()) {
      f2 = 0.0F;
      f = 0.0F;
      f1 = 1.0F;
      f3 = 1.0F;
    } 
    return c.b((i + f), j, (k + f2), (i + f1), (j + 1.5F), (k + f3));
  }
  
  public void b(kq iblockaccess, int i, int j, int k) {
    boolean flag = c(iblockaccess, i, j, k - 1);
    boolean flag1 = c(iblockaccess, i, j, k + 1);
    boolean flag2 = c(iblockaccess, i - 1, j, k);
    boolean flag3 = c(iblockaccess, i + 1, j, k);
    float f = 0.375F;
    float f1 = 0.625F;
    float f2 = 0.375F;
    float f3 = 0.625F;
    if (flag)
      f2 = 0.0F; 
    if (flag1)
      f3 = 1.0F; 
    if (flag2)
      f = 0.0F; 
    if (flag3)
      f1 = 1.0F; 
    if (((Boolean)mod_noBiomesX.BigFences.get()).booleanValue()) {
      f2 = 0.0F;
      f = 0.0F;
      f1 = 1.0F;
      f3 = 1.0F;
    } 
    a(f, 0.0F, f2, f1, 1.0F, f3);
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 11;
  }
  
  public boolean c(kq iblockaccess, int i, int j, int k) {
    int l = iblockaccess.a(i, j, k);
    boolean flag = ((Boolean)mod_noBiomesX.BigFences.get()).booleanValue();
    if (l == this.bM || l == yy.bv.bM)
      return true; 
    yy block = yy.k[l];
    if (flag && block == yy.aZ)
      return true; 
    if (block != null && block.bZ.j() && block.b() && !flag)
      return (block.bZ != p.y); 
    return false;
  }
}
