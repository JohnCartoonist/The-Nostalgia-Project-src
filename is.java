public class is extends wk implements aey {
  public int a;
  
  public double b;
  
  public double c;
  
  public double d;
  
  private ia g;
  
  private int h;
  
  public int e;
  
  public int f;
  
  public is(ry world) {
    super(world);
    this.a = 0;
    this.g = null;
    this.h = 0;
    this.e = 0;
    this.f = 0;
    this.aA = "/mob/ghast.png";
    a(4.0F, 4.0F);
    this.af = true;
    this.aX = 5;
  }
  
  public boolean a(pm damagesource, int i) {
    if ("fireball".equals(damagesource.l()) && damagesource.a() instanceof vi) {
      super.a(damagesource, 1000);
      ((vi)damagesource.a()).a((px)ut.y);
      return true;
    } 
    return super.a(damagesource, i);
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, Byte.valueOf((byte)0));
  }
  
  public int f_() {
    return 10;
  }
  
  public void a() {
    if (((Boolean)mod_noBiomesX.FlammableNetherMobs.get()).booleanValue()) {
      this.af = false;
    } else {
      this.af = true;
    } 
    super.a();
    byte byte0 = this.ag.a(16);
    this.aA = (byte0 != 1) ? "/mob/ghast.png" : "/mob/ghast_fire.png";
  }
  
  protected void n() {
    if (!this.o.I && this.o.v == 0)
      v(); 
    al();
    this.e = this.f;
    double d = this.b - this.s;
    double d1 = this.c - this.t;
    double d2 = this.d - this.u;
    double d3 = me.a(d * d + d1 * d1 + d2 * d2);
    if (d3 < 1.0D || d3 > 60.0D) {
      this.b = this.s + ((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.c = this.t + ((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.d = this.u + ((this.Y.nextFloat() * 2.0F - 1.0F) * 16.0F);
    } 
    if (this.a-- <= 0) {
      this.a += this.Y.nextInt(5) + 2;
      if (a(this.b, this.c, this.d, d3)) {
        this.v += d / d3 * 0.1D;
        this.w += d1 / d3 * 0.1D;
        this.x += d2 / d3 * 0.1D;
      } else {
        this.b = this.s;
        this.c = this.t;
        this.d = this.u;
      } 
    } 
    if (this.g != null && this.g.K)
      this.g = null; 
    if (this.g == null || this.h-- <= 0) {
      this.g = this.o.b((ia)this, 100.0D);
      if (this.g != null)
        this.h = 20; 
    } 
    double d4 = 64.0D;
    if (this.g != null && this.g.d((ia)this) < d4 * d4) {
      double d5 = this.g.s - this.s;
      double d6 = this.g.C.b + (this.g.N / 2.0F) - this.t + (this.N / 2.0F);
      double d7 = this.g.u - this.u;
      this.at = this.y = -((float)Math.atan2(d5, d7)) * 180.0F / 3.141593F;
      if (i(this.g)) {
        if (this.f == 10)
          this.o.a((vi)null, 1007, (int)this.s, (int)this.t, (int)this.u, 0); 
        this.f++;
        if (this.f == 20) {
          this.o.a((vi)null, 1008, (int)this.s, (int)this.t, (int)this.u, 0);
          aad entityfireball = new aad(this.o, (nq)this, d5, d6, d7);
          double d8 = 4.0D;
          fb vec3d = f(1.0F);
          entityfireball.s = this.s + vec3d.a * d8;
          entityfireball.t = this.t + (this.N / 2.0F) + 0.5D;
          entityfireball.u = this.u + vec3d.c * d8;
          this.o.a((ia)entityfireball);
          this.f = -40;
        } 
      } else if (this.f > 0) {
        this.f--;
      } 
    } else {
      this.at = this.y = -((float)Math.atan2(this.v, this.x)) * 180.0F / 3.141593F;
      if (this.f > 0)
        this.f--; 
    } 
    if (!this.o.I) {
      byte byte0 = this.ag.a(16);
      byte byte1 = (byte)((this.f <= 10) ? 0 : 1);
      if (byte0 != byte1)
        this.ag.b(16, Byte.valueOf(byte1)); 
    } 
  }
  
  private boolean a(double d, double d1, double d2, double d3) {
    double d4 = (this.b - this.s) / d3;
    double d5 = (this.c - this.t) / d3;
    double d6 = (this.d - this.u) / d3;
    c axisalignedbb = this.C.d();
    for (int i = 1; i < d3; i++) {
      axisalignedbb.d(d4, d5, d6);
      if (this.o.a((ia)this, axisalignedbb).size() > 0)
        return false; 
    } 
    return true;
  }
  
  protected String e() {
    return "mob.ghast.moan";
  }
  
  protected String f() {
    return "mob.ghast.scream";
  }
  
  protected String g() {
    return "mob.ghast.death";
  }
  
  protected int k() {
    return acy.L.bM;
  }
  
  protected void a(boolean flag, int i) {
    int j = this.Y.nextInt(2) + this.Y.nextInt(1 + i);
    for (int k = 0; k < j; k++)
      b(acy.bo.bM, 1); 
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return; 
    j = this.Y.nextInt(3) + this.Y.nextInt(1 + i);
    for (int l = 0; l < j; l++)
      b(acy.L.bM, 1); 
  }
  
  protected float w_() {
    return 10.0F;
  }
  
  public boolean i() {
    return (this.Y.nextInt(20) == 0 && super.i() && this.o.v > 0);
  }
  
  public int g_() {
    return 1;
  }
}
