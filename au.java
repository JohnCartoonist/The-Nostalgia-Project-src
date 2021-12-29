import java.util.Random;

public class au extends ba {
  private Random a;
  
  protected au(int i) {
    super(i, p.d);
    this.a = new Random();
    this.bL = 26;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 0;
  }
  
  public void a(ry world, int i, int j, int k) {
    super.a(world, i, j, k);
    a_(world, i, j, k);
    int l = world.a(i, j, k - 1);
    int i1 = world.a(i, j, k + 1);
    int j1 = world.a(i - 1, j, k);
    int k1 = world.a(i + 1, j, k);
    if (l == this.bM)
      a_(world, i, j, k - 1); 
    if (i1 == this.bM)
      a_(world, i, j, k + 1); 
    if (j1 == this.bM)
      a_(world, i - 1, j, k); 
    if (k1 == this.bM)
      a_(world, i + 1, j, k); 
  }
  
  public void a(ry world, int i, int j, int k, nq entityliving) {
    int l = world.a(i, j, k - 1);
    int i1 = world.a(i, j, k + 1);
    int j1 = world.a(i - 1, j, k);
    int k1 = world.a(i + 1, j, k);
    byte byte0 = 0;
    int l1 = me.c((entityliving.y * 4.0F / 360.0F) + 0.5D) & 0x3;
    if (l1 == 0)
      byte0 = 2; 
    if (l1 == 1)
      byte0 = 5; 
    if (l1 == 2)
      byte0 = 3; 
    if (l1 == 3)
      byte0 = 4; 
    if (l != this.bM && i1 != this.bM && j1 != this.bM && k1 != this.bM) {
      world.f(i, j, k, byte0);
    } else {
      if ((l == this.bM || i1 == this.bM) && (byte0 == 4 || byte0 == 5)) {
        if (l == this.bM) {
          world.f(i, j, k - 1, byte0);
        } else {
          world.f(i, j, k + 1, byte0);
        } 
        world.f(i, j, k, byte0);
      } 
      if ((j1 == this.bM || k1 == this.bM) && (byte0 == 2 || byte0 == 3)) {
        if (j1 == this.bM) {
          world.f(i - 1, j, k, byte0);
        } else {
          world.f(i + 1, j, k, byte0);
        } 
        world.f(i, j, k, byte0);
      } 
    } 
  }
  
  public void a_(ry world, int i, int j, int k) {
    if (world.I)
      return; 
    int l = world.a(i, j, k - 1);
    int i1 = world.a(i, j, k + 1);
    int j1 = world.a(i - 1, j, k);
    int k1 = world.a(i + 1, j, k);
    byte byte0 = 4;
    if (l == this.bM || i1 == this.bM) {
      int l1 = world.a(i - 1, j, (l != this.bM) ? (k + 1) : (k - 1));
      int j2 = world.a(i + 1, j, (l != this.bM) ? (k + 1) : (k - 1));
      byte0 = 5;
      int l2 = -1;
      if (l == this.bM) {
        l2 = world.d(i, j, k - 1);
      } else {
        l2 = world.d(i, j, k + 1);
      } 
      if (l2 == 4)
        byte0 = 4; 
      if ((yy.m[j1] || yy.m[l1]) && !yy.m[k1] && !yy.m[j2])
        byte0 = 5; 
      if ((yy.m[k1] || yy.m[j2]) && !yy.m[j1] && !yy.m[l1])
        byte0 = 4; 
    } else if (j1 == this.bM || k1 == this.bM) {
      int i2 = world.a((j1 != this.bM) ? (i + 1) : (i - 1), j, k - 1);
      int k2 = world.a((j1 != this.bM) ? (i + 1) : (i - 1), j, k + 1);
      byte0 = 3;
      int i3 = -1;
      if (j1 == this.bM) {
        i3 = world.d(i - 1, j, k);
      } else {
        i3 = world.d(i + 1, j, k);
      } 
      if (i3 == 2)
        byte0 = 2; 
      if ((yy.m[l] || yy.m[i2]) && !yy.m[i1] && !yy.m[k2])
        byte0 = 3; 
      if ((yy.m[i1] || yy.m[k2]) && !yy.m[l] && !yy.m[i2])
        byte0 = 2; 
    } else {
      byte0 = 3;
      if (yy.m[l] && !yy.m[i1])
        byte0 = 3; 
      if (yy.m[i1] && !yy.m[l])
        byte0 = 2; 
      if (yy.m[j1] && !yy.m[k1])
        byte0 = 5; 
      if (yy.m[k1] && !yy.m[j1])
        byte0 = 4; 
    } 
    world.f(i, j, k, byte0);
  }
  
  public int a(kq iblockaccess, int i, int j, int k, int l) {
    if (l == 1)
      return this.bL - 1; 
    if (l == 0)
      return this.bL - 1; 
    int i1 = iblockaccess.a(i, j, k - 1);
    int j1 = iblockaccess.a(i, j, k + 1);
    int k1 = iblockaccess.a(i - 1, j, k);
    int l1 = iblockaccess.a(i + 1, j, k);
    if (i1 == this.bM || j1 == this.bM) {
      if (l == 2 || l == 3)
        return this.bL; 
      int i2 = 0;
      if (i1 == this.bM)
        i2 = -1; 
      int k2 = iblockaccess.a(i - 1, j, (i1 != this.bM) ? (k + 1) : (k - 1));
      int i3 = iblockaccess.a(i + 1, j, (i1 != this.bM) ? (k + 1) : (k - 1));
      if (l == 4)
        i2 = -1 - i2; 
      byte byte1 = 5;
      if ((yy.m[k1] || yy.m[k2]) && !yy.m[l1] && !yy.m[i3])
        byte1 = 5; 
      if ((yy.m[l1] || yy.m[i3]) && !yy.m[k1] && !yy.m[k2])
        byte1 = 4; 
      return ((l != byte1) ? (this.bL + 32) : (this.bL + 16)) + i2;
    } 
    if (k1 == this.bM || l1 == this.bM) {
      if (l == 4 || l == 5)
        return this.bL; 
      int j2 = 0;
      if (k1 == this.bM)
        j2 = -1; 
      int l2 = iblockaccess.a((k1 != this.bM) ? (i + 1) : (i - 1), j, k - 1);
      int j3 = iblockaccess.a((k1 != this.bM) ? (i + 1) : (i - 1), j, k + 1);
      if (l == 3)
        j2 = -1 - j2; 
      byte byte2 = 3;
      if ((yy.m[i1] || yy.m[l2]) && !yy.m[j1] && !yy.m[j3])
        byte2 = 3; 
      if ((yy.m[j1] || yy.m[j3]) && !yy.m[i1] && !yy.m[l2])
        byte2 = 2; 
      return ((l != byte2) ? (this.bL + 32) : (this.bL + 16)) + j2;
    } 
    byte byte0 = 3;
    if (yy.m[i1] && !yy.m[j1])
      byte0 = 3; 
    if (yy.m[j1] && !yy.m[i1])
      byte0 = 2; 
    if (yy.m[k1] && !yy.m[l1])
      byte0 = 5; 
    if (yy.m[l1] && !yy.m[k1])
      byte0 = 4; 
    return (l != byte0) ? this.bL : (this.bL + 1);
  }
  
  public int b(int i) {
    if (i == 1)
      return this.bL - 1; 
    if (i == 0)
      return this.bL - 1; 
    if (i == 3)
      return this.bL + 1; 
    return this.bL;
  }
  
  public boolean c(ry world, int i, int j, int k) {
    int l = 0;
    if (world.a(i - 1, j, k) == this.bM)
      l++; 
    if (world.a(i + 1, j, k) == this.bM)
      l++; 
    if (world.a(i, j, k - 1) == this.bM)
      l++; 
    if (world.a(i, j, k + 1) == this.bM)
      l++; 
    if (l > 1)
      return false; 
    if (g(world, i - 1, j, k))
      return false; 
    if (g(world, i + 1, j, k))
      return false; 
    if (g(world, i, j, k - 1))
      return false; 
    return !g(world, i, j, k + 1);
  }
  
  private boolean g(ry world, int i, int j, int k) {
    if (world.a(i, j, k) != this.bM)
      return false; 
    if (world.a(i - 1, j, k) == this.bM)
      return true; 
    if (world.a(i + 1, j, k) == this.bM)
      return true; 
    if (world.a(i, j, k - 1) == this.bM)
      return true; 
    return (world.a(i, j, k + 1) == this.bM);
  }
  
  public void a(ry world, int i, int j, int k, int l) {
    super.a(world, i, j, k, l);
    tu tileentitychest = (tu)world.b(i, j, k);
    if (tileentitychest != null)
      tileentitychest.n(); 
  }
  
  public void d(ry world, int i, int j, int k) {
    tu tileentitychest = (tu)world.b(i, j, k);
    if (tileentitychest != null)
      for (int l = 0; l < tileentitychest.c(); l++) {
        dk itemstack = tileentitychest.d(l);
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
            if (itemstack.n())
              entityitem.a.d((ik)itemstack.o().b()); 
            world.a((ia)entityitem);
          } 
        } 
      }  
    super.d(world, i, j, k);
  }
  
  public boolean a(ry world, int i, int j, int k, vi entityplayer) {
    Object obj = world.b(i, j, k);
    if (obj == null)
      return true; 
    if (world.g(i, j + 1, k))
      return true; 
    if (world.a(i - 1, j, k) == this.bM && world.g(i - 1, j + 1, k))
      return true; 
    if (world.a(i + 1, j, k) == this.bM && world.g(i + 1, j + 1, k))
      return true; 
    if (world.a(i, j, k - 1) == this.bM && world.g(i, j + 1, k - 1))
      return true; 
    if (world.a(i, j, k + 1) == this.bM && world.g(i, j + 1, k + 1))
      return true; 
    if (world.a(i - 1, j, k) == this.bM)
      obj = new adv("Large chest", (tu)world.b(i - 1, j, k), (de)obj); 
    if (world.a(i + 1, j, k) == this.bM)
      obj = new adv("Large chest", (de)obj, (tu)world.b(i + 1, j, k)); 
    if (world.a(i, j, k - 1) == this.bM)
      obj = new adv("Large chest", (tu)world.b(i, j, k - 1), (de)obj); 
    if (world.a(i, j, k + 1) == this.bM)
      obj = new adv("Large chest", (de)obj, (tu)world.b(i, j, k + 1)); 
    if (world.I)
      return true; 
    entityplayer.a((de)obj);
    return true;
  }
  
  public bq j_() {
    return new tu();
  }
}
