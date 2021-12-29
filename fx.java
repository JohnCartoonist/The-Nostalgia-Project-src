import java.util.List;

public abstract class fx extends ww {
  private int a;
  
  private int b;
  
  public fx(ry world) {
    super(world);
    this.b = 0;
  }
  
  protected void b() {
    super.b();
    this.ag.a(12, new Integer(0));
  }
  
  public int m() {
    return this.ag.c(12);
  }
  
  public void b(int i) {
    this.ag.b(12, Integer.valueOf(i));
  }
  
  public void c() {
    super.c();
    int i = m();
    if (i < 0) {
      i++;
      b(i);
    } else if (i > 0) {
      i--;
      b(i);
    } 
    if (this.a > 0) {
      this.a--;
      String s = "heart";
      if (this.a % 10 == 0) {
        double d = this.Y.nextGaussian() * 0.02D;
        double d1 = this.Y.nextGaussian() * 0.02D;
        double d2 = this.Y.nextGaussian() * 0.02D;
        this.o.a(s, this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M, this.t + 0.5D + (this.Y.nextFloat() * this.N), this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M, d, d1, d2);
      } 
    } else {
      this.b = 0;
    } 
  }
  
  protected void a(ia entity, float f) {
    if (entity instanceof vi) {
      if (f < 3.0F) {
        double d = entity.s - this.s;
        double d1 = entity.u - this.u;
        this.y = (float)(Math.atan2(d1, d) * 180.0D / 3.1415927410125732D) - 90.0F;
        this.i = true;
      } 
      vi entityplayer = (vi)entity;
      if (entityplayer.aH() == null || !a(entityplayer.aH()))
        this.h = null; 
    } else if (entity instanceof fx) {
      fx entityanimal = (fx)entity;
      if (m() > 0 && entityanimal.m() < 0) {
        if (f < 2.5D)
          this.i = true; 
      } else if (this.a > 0 && entityanimal.a > 0) {
        if (entityanimal.h == null)
          entityanimal.h = (ia)this; 
        if (entityanimal.h == this && f < 3.5D) {
          entityanimal.a++;
          this.a++;
          this.b++;
          if (this.b % 4 == 0)
            this.o.a("heart", this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M, this.t + 0.5D + (this.Y.nextFloat() * this.N), this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M, 0.0D, 0.0D, 0.0D); 
          if (this.b == 60)
            b((fx)entity); 
        } else {
          this.b = 0;
        } 
      } else {
        this.b = 0;
      } 
    } 
  }
  
  private void b(fx entityanimal) {
    fx entityanimal1 = a(entityanimal);
    if (entityanimal1 != null) {
      b(6000);
      entityanimal.b(6000);
      this.a = 0;
      this.b = 0;
      this.h = null;
      entityanimal.h = null;
      entityanimal.b = 0;
      entityanimal.a = 0;
      entityanimal1.b(-24000);
      entityanimal1.c(this.s, this.t, this.u, this.y, this.z);
      for (int i = 0; i < 7; i++) {
        double d = this.Y.nextGaussian() * 0.02D;
        double d1 = this.Y.nextGaussian() * 0.02D;
        double d2 = this.Y.nextGaussian() * 0.02D;
        this.o.a("heart", this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M, this.t + 0.5D + (this.Y.nextFloat() * this.N), this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M, d, d1, d2);
      } 
      this.o.a((ia)entityanimal1);
    } 
  }
  
  protected abstract fx a(fx paramfx);
  
  protected void b(ia entity, float f) {}
  
  public boolean a(pm damagesource, int i) {
    if (!((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      this.by = 60; 
    this.h = null;
    this.a = 0;
    return super.a(damagesource, i);
  }
  
  protected float a(int i, int j, int k) {
    if (this.o.a(i, j - 1, k) == yy.u.bM)
      return 10.0F; 
    return this.o.c(i, j, k) - 0.5F;
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Age", m());
    nbttagcompound.a("InLove", this.a);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    b(nbttagcompound.e("Age"));
    this.a = nbttagcompound.e("InLove");
  }
  
  protected ia o() {
    if (this.by > 0)
      return null; 
    float f = 8.0F;
    if (this.a > 0) {
      List<fx> list = this.o.a(getClass(), this.C.a(f, f, f));
      for (int i = 0; i < list.size(); i++) {
        fx entityanimal = list.get(i);
        if (entityanimal != this && entityanimal.a > 0)
          return (ia)entityanimal; 
      } 
    } else if (m() > 0) {
      List<fx> list2 = this.o.a(getClass(), this.C.a(f, f, f));
      for (int k = 0; k < list2.size(); k++) {
        fx entityanimal1 = list2.get(k);
        if (entityanimal1 != this && entityanimal1.m() < 0)
          return (ia)entityanimal1; 
      } 
    } 
    return null;
  }
  
  public boolean i() {
    int i = me.c(this.s);
    int j = me.c(this.C.b);
    int k = me.c(this.u);
    boolean lightCheck = false;
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue()) {
      lightCheck = (this.o.n(i, j, k) > 8);
    } else {
      lightCheck = (this.o.m(i, j, k) > 8);
    } 
    return (this.o.a(i, j - 1, k) == yy.u.bM && lightCheck && super.i());
  }
  
  public int p_() {
    return 120;
  }
  
  protected boolean d() {
    return true;
  }
  
  protected int b(vi entityplayer) {
    return 1 + this.o.w.nextInt(3);
  }
  
  protected boolean a(dk itemstack) {
    return (itemstack.c == acy.S.bM);
  }
  
  public boolean c(vi entityplayer) {
    return super.c(entityplayer);
  }
  
  public boolean q_() {
    return (m() < 0);
  }
}
