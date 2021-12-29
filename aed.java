public class aed extends nq implements aey {
  public float a;
  
  public float b;
  
  public float c;
  
  private int d;
  
  public aed(ry world) {
    super(world);
    this.d = 0;
    this.aA = "/mob/slime.png";
    int i = 1 << this.Y.nextInt(3);
    this.L = 0.0F;
    this.d = this.Y.nextInt(20) + 10;
    b(i);
    this.aX = i;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, new Byte((byte)1));
  }
  
  public void b(int i) {
    this.ag.b(16, new Byte((byte)i));
    a(0.6F * i, 0.6F * i);
    d(this.s, this.t, this.u);
    h(f_());
  }
  
  public int f_() {
    int i = aF();
    return i * i;
  }
  
  public int aF() {
    return this.ag.a(16);
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Size", aF() - 1);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    b(nbttagcompound.e("Size") + 1);
  }
  
  protected String ax() {
    return "slime";
  }
  
  protected String aD() {
    return "mob.slime";
  }
  
  public void a() {
    if (!this.o.I && this.o.v == 0 && aF() > 0)
      this.K = true; 
    this.b += (this.a - this.b) * 0.5F;
    this.c = this.b;
    boolean flag = this.D;
    super.a();
    if (this.D && !flag) {
      int i = aF();
      for (int j = 0; j < i * 8; j++) {
        float f = this.Y.nextFloat() * 3.141593F * 2.0F;
        float f1 = this.Y.nextFloat() * 0.5F + 0.5F;
        float f2 = me.a(f) * i * 0.5F * f1;
        float f3 = me.b(f) * i * 0.5F * f1;
        this.o.a(ax(), this.s + f2, this.C.b, this.u + f3, 0.0D, 0.0D, 0.0D);
      } 
      if (aE())
        this.o.a(this, aD(), w_(), ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) / 0.8F); 
      this.a = -0.5F;
    } 
    aA();
  }
  
  protected void n() {
    al();
    vi entityplayer = this.o.b(this, 16.0D);
    if (entityplayer != null)
      a(entityplayer, 10.0F, 20.0F); 
    if (this.D && this.d-- <= 0) {
      this.d = az();
      if (entityplayer != null)
        this.d /= 3; 
      this.bu = true;
      if (aG())
        this.o.a(this, aD(), w_(), ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) * 0.8F); 
      this.a = 1.0F;
      this.br = 1.0F - this.Y.nextFloat() * 2.0F;
      this.bs = (1 * aF());
    } else {
      this.bu = false;
      if (this.D)
        this.br = this.bs = 0.0F; 
    } 
  }
  
  protected void aA() {
    this.a *= 0.6F;
  }
  
  protected int az() {
    return this.Y.nextInt(20) + 10;
  }
  
  protected aed ay() {
    return new aed(this.o);
  }
  
  public void v() {
    int i = aF();
    boolean healthCheck = (ag() <= 0);
    if (((Boolean)mod_noBiomesX.SlimeConstrictions.get()).booleanValue())
      healthCheck = (ag() == 0); 
    if (!this.o.I && i > 1 && healthCheck) {
      int j = 2 + this.Y.nextInt(3);
      for (int k = 0; k < j; k++) {
        float f = ((k % 2) - 0.5F) * i / 4.0F;
        float f1 = ((k / 2) - 0.5F) * i / 4.0F;
        aed entityslime = ay();
        entityslime.b(i / 2);
        entityslime.c(this.s + f, this.t + 0.5D, this.u + f1, this.Y.nextFloat() * 360.0F, 0.0F);
        this.o.a(entityslime);
      } 
    } 
    super.v();
  }
  
  public void a(vi entityplayer) {
    if (aB()) {
      int i = aF();
      if (i(entityplayer) && c(entityplayer) < 0.6D * i && entityplayer.a(pm.a(this), aC()))
        this.o.a(this, "mob.slimeattack", 1.0F, (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F); 
    } 
  }
  
  protected boolean aB() {
    return (aF() > 1);
  }
  
  protected int aC() {
    return aF();
  }
  
  protected String f() {
    return "mob.slime";
  }
  
  protected String g() {
    return "mob.slime";
  }
  
  protected int k() {
    if (aF() == 1)
      return acy.aL.bM; 
    return 0;
  }
  
  public boolean i() {
    zx chunk = this.o.b(me.c(this.s), me.c(this.u));
    double d = 40.0D;
    if (((Boolean)mod_noBiomesX.SlimeConstrictions.get()).booleanValue())
      d = 16.0D; 
    if ((aF() == 1 || this.o.v > 0) && this.Y.nextInt(10) == 0 && chunk.a(987234911L).nextInt(10) == 0 && this.t < d)
      return super.i(); 
    return false;
  }
  
  protected float w_() {
    return 0.4F * aF();
  }
  
  protected int am() {
    return 0;
  }
  
  protected boolean aG() {
    return (aF() > 1);
  }
  
  protected boolean aE() {
    return (aF() > 2);
  }
}
