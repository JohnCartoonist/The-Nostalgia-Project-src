public class vq extends zo {
  public vq(ry world) {
    super(world);
    this.aA = "/mob/spider.png";
    a(1.4F, 0.9F);
    this.bw = 0.8F;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, new Byte((byte)0));
  }
  
  public void c() {
    super.c();
  }
  
  public void a() {
    super.a();
    if (!this.o.I)
      b(this.E); 
  }
  
  public int f_() {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return 20; 
    return 16;
  }
  
  public double P() {
    return this.N * 0.75D - 0.5D;
  }
  
  protected boolean d_() {
    return false;
  }
  
  protected ia o() {
    float f = b(1.0F);
    if (f < 0.5F) {
      double d = 16.0D;
      return this.o.b((ia)this, d);
    } 
    return null;
  }
  
  protected String e() {
    return "mob.spider";
  }
  
  protected String f() {
    return "mob.spider";
  }
  
  protected String g() {
    return "mob.spiderdeath";
  }
  
  protected void a(ia entity, float f) {
    float f1 = b(1.0F);
    if (f1 > 0.5F && this.Y.nextInt(100) == 0) {
      this.h = null;
      return;
    } 
    if (f > 2.0F && f < 6.0F && this.Y.nextInt(10) == 0) {
      if (this.D) {
        double d = entity.s - this.s;
        double d1 = entity.u - this.u;
        float f2 = me.a(d * d + d1 * d1);
        this.v = d / f2 * 0.5D * 0.800000011920929D + this.v * 0.20000000298023224D;
        this.x = d1 / f2 * 0.5D * 0.800000011920929D + this.x * 0.20000000298023224D;
        this.w = 0.4000000059604645D;
      } 
    } else {
      super.a(entity, f);
    } 
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
  }
  
  protected int k() {
    return acy.J.bM;
  }
  
  protected void a(boolean flag, int i) {
    super.a(flag, i);
    if (flag && (this.Y.nextInt(3) == 0 || this.Y.nextInt(1 + i) > 0) && ((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      b(acy.bt.bM, 1); 
  }
  
  public boolean ah() {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return super.ah(); 
    return ay();
  }
  
  public void aa() {}
  
  public float ax() {
    return 1.0F;
  }
  
  public el r_() {
    return el.c;
  }
  
  public boolean b(s potioneffect) {
    if (potioneffect.a() == abg.u.H)
      return false; 
    return super.b(potioneffect);
  }
  
  public boolean ay() {
    return ((this.ag.a(16) & 0x1) != 0);
  }
  
  public void b(boolean flag) {
    byte byte0 = this.ag.a(16);
    if (flag) {
      byte0 = (byte)(byte0 | 0x1);
    } else {
      byte0 = (byte)(byte0 & 0xFE);
    } 
    this.ag.b(16, Byte.valueOf(byte0));
  }
}
