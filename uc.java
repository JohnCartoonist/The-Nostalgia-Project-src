import java.util.Random;

public class uc extends yy {
  protected uc(int i, p material) {
    super(i, material);
    this.bL = 97;
    if (material == p.f)
      this.bL++; 
    float f = 0.5F;
    float f1 = 1.0F;
    a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
  }
  
  public int a(int i, int j) {
    if (i == 0 || i == 1)
      return this.bL; 
    int k = f(j);
    if ((((k == 0 || k == 2) ? 1 : 0) ^ ((i <= 3) ? 1 : 0)) != 0)
      return this.bL; 
    int l = k / 2 + (i & 0x1 ^ k);
    l += (j & 0x4) / 4;
    int i1 = this.bL - (j & 0x8) * 2;
    if ((l & 0x1) != 0)
      i1 = -i1; 
    return i1;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 7;
  }
  
  public c c_(ry world, int i, int j, int k) {
    b(world, i, j, k);
    return super.c_(world, i, j, k);
  }
  
  public c b(ry world, int i, int j, int k) {
    b(world, i, j, k);
    return super.b(world, i, j, k);
  }
  
  public void b(kq iblockaccess, int i, int j, int k) {
    e(f(iblockaccess.d(i, j, k)));
  }
  
  public void e(int i) {
    float f = 0.1875F;
    a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    if (i == 0)
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); 
    if (i == 1)
      a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); 
    if (i == 2)
      a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); 
    if (i == 3)
      a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); 
  }
  
  public void b(ry world, int i, int j, int k, vi entityplayer) {
    a(world, i, j, k, entityplayer);
  }
  
  public boolean a(ry world, int i, int j, int k, vi entityplayer) {
    if (this.bZ == p.f)
      return true; 
    int l = world.d(i, j, k);
    if ((l & 0x8) != 0) {
      if (world.a(i, j - 1, k) == this.bM)
        a(world, i, j - 1, k, entityplayer); 
      return true;
    } 
    if (world.a(i, j + 1, k) == this.bM)
      world.f(i, j + 1, k, (l ^ 0x4) + 8); 
    world.f(i, j, k, l ^ 0x4);
    world.c(i, j - 1, k, i, j, k);
    world.a(entityplayer, 1003, i, j, k, 0);
    return true;
  }
  
  public void a(ry world, int i, int j, int k, boolean flag) {
    int l = world.d(i, j, k);
    if ((l & 0x8) != 0) {
      if (world.a(i, j - 1, k) == this.bM)
        a(world, i, j - 1, k, flag); 
      return;
    } 
    boolean flag1 = ((world.d(i, j, k) & 0x4) > 0);
    if (flag1 == flag)
      return; 
    if (world.a(i, j + 1, k) == this.bM)
      world.f(i, j + 1, k, (l ^ 0x4) + 8); 
    world.f(i, j, k, l ^ 0x4);
    world.c(i, j - 1, k, i, j, k);
    world.a((vi)null, 1003, i, j, k, 0);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    int i1 = world.d(i, j, k);
    if ((i1 & 0x8) != 0) {
      if (world.a(i, j - 1, k) != this.bM)
        world.g(i, j, k, 0); 
      if (l > 0 && yy.k[l].g())
        a(world, i, j - 1, k, l); 
    } else {
      boolean flag = false;
      if (world.a(i, j + 1, k) != this.bM) {
        world.g(i, j, k, 0);
        flag = true;
      } 
      if (!world.g(i, j - 1, k)) {
        world.g(i, j, k, 0);
        flag = true;
        if (world.a(i, j + 1, k) == this.bM)
          world.g(i, j + 1, k, 0); 
      } 
      if (flag) {
        if (!world.I)
          b(world, i, j, k, i1, 0); 
      } else if (l > 0 && yy.k[l].g()) {
        boolean flag1 = (world.v(i, j, k) || world.v(i, j + 1, k));
        a(world, i, j, k, flag1);
      } 
    } 
  }
  
  public int a(int i, Random random, int j) {
    if ((i & 0x8) != 0)
      return 0; 
    if (this.bZ == p.f)
      return acy.aA.bM; 
    return acy.au.bM;
  }
  
  public gv a(ry world, int i, int j, int k, fb vec3d, fb vec3d1) {
    b(world, i, j, k);
    return super.a(world, i, j, k, vec3d, vec3d1);
  }
  
  public int f(int i) {
    if ((i & 0x4) == 0)
      return i - 1 & 0x3; 
    return i & 0x3;
  }
  
  public boolean c(ry world, int i, int j, int k) {
    if (j >= world.c - 1)
      return false; 
    return (world.g(i, j - 1, k) && super.c(world, i, j, k) && super.c(world, i, j + 1, k));
  }
  
  public static boolean g(int i) {
    return ((i & 0x4) != 0);
  }
  
  public int i() {
    return 1;
  }
}
