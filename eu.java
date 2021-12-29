import java.util.Random;

public class eu extends ba {
  private Random a;
  
  private final boolean cb;
  
  private static boolean cc = false;
  
  protected eu(int i, boolean flag) {
    super(i, p.e);
    this.a = new Random();
    this.cb = flag;
    this.bL = 45;
  }
  
  public int a(int i, Random random, int j) {
    return yy.aB.bM;
  }
  
  public void a(ry world, int i, int j, int k) {
    super.a(world, i, j, k);
    g(world, i, j, k);
  }
  
  private void g(ry world, int i, int j, int k) {
    if (world.I)
      return; 
    int l = world.a(i, j, k - 1);
    int i1 = world.a(i, j, k + 1);
    int j1 = world.a(i - 1, j, k);
    int k1 = world.a(i + 1, j, k);
    byte byte0 = 3;
    if (yy.m[l] && !yy.m[i1])
      byte0 = 3; 
    if (yy.m[i1] && !yy.m[l])
      byte0 = 2; 
    if (yy.m[j1] && !yy.m[k1])
      byte0 = 5; 
    if (yy.m[k1] && !yy.m[j1])
      byte0 = 4; 
    world.f(i, j, k, byte0);
  }
  
  public int a(kq iblockaccess, int i, int j, int k, int l) {
    int top = this.bL + 17;
    if (((Boolean)mod_noBiomesX.OldTexturing.get()).booleanValue())
      top = 1; 
    if (l == 1)
      return top; 
    if (l == 0)
      return top; 
    int i1 = iblockaccess.d(i, j, k);
    if (l != i1)
      return this.bL; 
    if (this.cb)
      return this.bL + 16; 
    return this.bL - 1;
  }
  
  public void b(ry world, int i, int j, int k, Random random) {
    if (!this.cb)
      return; 
    int l = world.d(i, j, k);
    float f = i + 0.5F;
    float f1 = j + 0.0F + random.nextFloat() * 6.0F / 16.0F;
    float f2 = k + 0.5F;
    float f3 = 0.52F;
    float f4 = random.nextFloat() * 0.6F - 0.3F;
    if (l == 4) {
      world.a("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
      world.a("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
    } else if (l == 5) {
      world.a("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
      world.a("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
    } else if (l == 2) {
      world.a("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
      world.a("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
    } else if (l == 3) {
      world.a("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
      world.a("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
    } 
  }
  
  public int b(int i) {
    int top = this.bL + 17;
    if (mod_noBiomesX.OldTexturing != null && ((Boolean)mod_noBiomesX.OldTexturing.get()).booleanValue())
      top = 1; 
    if (i == 1)
      return top; 
    if (i == 0)
      return top; 
    if (i == 3)
      return this.bL - 1; 
    return this.bL;
  }
  
  public boolean a(ry world, int i, int j, int k, vi entityplayer) {
    if (world.I)
      return true; 
    oe tileentityfurnace = (oe)world.b(i, j, k);
    if (tileentityfurnace != null)
      entityplayer.a(tileentityfurnace); 
    return true;
  }
  
  public static void a(boolean flag, ry world, int i, int j, int k) {
    int l = world.d(i, j, k);
    bq tileentity = world.b(i, j, k);
    cc = true;
    if (flag) {
      world.g(i, j, k, yy.aC.bM);
    } else {
      world.g(i, j, k, yy.aB.bM);
    } 
    cc = false;
    world.f(i, j, k, l);
    if (tileentity != null) {
      tileentity.m();
      world.a(i, j, k, tileentity);
    } 
  }
  
  public bq j_() {
    return (bq)new oe();
  }
  
  public void a(ry world, int i, int j, int k, nq entityliving) {
    int l = me.c((entityliving.y * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (l == 0)
      world.f(i, j, k, 2); 
    if (l == 1)
      world.f(i, j, k, 5); 
    if (l == 2)
      world.f(i, j, k, 3); 
    if (l == 3)
      world.f(i, j, k, 4); 
  }
  
  public void d(ry world, int i, int j, int k) {
    if (!cc) {
      oe tileentityfurnace = (oe)world.b(i, j, k);
      if (tileentityfurnace != null)
        for (int l = 0; l < tileentityfurnace.c(); l++) {
          dk itemstack = tileentityfurnace.d(l);
          if (itemstack != null) {
            float f = this.a.nextFloat() * 0.8F + 0.1F;
            float f1 = this.a.nextFloat() * 0.8F + 0.1F;
            float f2 = this.a.nextFloat() * 0.8F + 0.1F;
            while (itemstack.a > 0) {
              int i1 = this.a.nextInt(21) + 10;
              if (i1 > itemstack.a)
                i1 = itemstack.a; 
              itemstack.a -= i1;
              ih entityitem = new ih(world, (i + f), (j + f1), (k + f2), new dk(itemstack.c, i1, itemstack.i()));
              float f3 = 0.05F;
              entityitem.v = ((float)this.a.nextGaussian() * f3);
              entityitem.w = ((float)this.a.nextGaussian() * f3 + 0.2F);
              entityitem.x = ((float)this.a.nextGaussian() * f3);
              world.a((ia)entityitem);
            } 
          } 
        }  
    } 
    super.d(world, i, j, k);
  }
}
