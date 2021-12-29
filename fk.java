public class fk extends ia {
  public int a;
  
  public int b;
  
  public int c;
  
  private int d;
  
  private int e;
  
  public fk(ry world, double d, double d1, double d2, int i) {
    super(world);
    this.b = 0;
    this.d = 5;
    a(0.5F, 0.5F);
    this.L = this.N / 2.0F;
    d(d, d1, d2);
    this.y = (float)(Math.random() * 360.0D);
    this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    this.w = ((float)(Math.random() * 0.2D) * 2.0F);
    this.x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    this.e = i;
  }
  
  protected boolean d_() {
    return false;
  }
  
  public fk(ry world) {
    super(world);
    this.b = 0;
    this.d = 5;
    a(0.25F, 0.25F);
    this.L = this.N / 2.0F;
  }
  
  protected void b() {}
  
  public int a(float f) {
    float f1 = 0.5F;
    if (f1 < 0.0F)
      f1 = 0.0F; 
    if (f1 > 1.0F)
      f1 = 1.0F; 
    int i = super.a(f);
    int j = i & 0xFF;
    int k = i >> 16 & 0xFF;
    j += (int)(f1 * 15.0F * 16.0F);
    if (j > 240)
      j = 240; 
    return j | k << 16;
  }
  
  public void a() {
    super.a();
    if (!((Boolean)mod_noBiomesX.XPSystem.get()).booleanValue()) {
      v();
      return;
    } 
    if (this.c > 0)
      this.c--; 
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    this.w -= 0.029999999329447746D;
    if (this.o.e(me.c(this.s), me.c(this.t), me.c(this.u)) == p.h) {
      this.w = 0.20000000298023224D;
      this.v = ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
      this.x = ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F);
      this.o.a(this, "random.fizz", 0.4F, 2.0F + this.Y.nextFloat() * 0.4F);
    } 
    c(this.s, (this.C.b + this.C.e) / 2.0D, this.u);
    double d = 8.0D;
    vi entityplayer = this.o.a(this, d);
    if (entityplayer != null) {
      double d1 = (entityplayer.s - this.s) / d;
      double d2 = (entityplayer.t + entityplayer.E() - this.t) / d;
      double d3 = (entityplayer.u - this.u) / d;
      double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
      double d5 = 1.0D - d4;
      if (d5 > 0.0D) {
        d5 *= d5;
        this.v += d1 / d4 * d5 * 0.1D;
        this.w += d2 / d4 * d5 * 0.1D;
        this.x += d3 / d4 * d5 * 0.1D;
      } 
    } 
    b(this.v, this.w, this.x);
    float f = 0.98F;
    if (this.D) {
      f = 0.5880001F;
      int i = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
      if (i > 0)
        f = (yy.k[i]).ca * 0.98F; 
    } 
    this.v *= f;
    this.w *= 0.9800000190734863D;
    this.x *= f;
    if (this.D)
      this.w *= -0.8999999761581421D; 
    this.a++;
    this.b++;
    if (this.b >= 6000)
      v(); 
  }
  
  public boolean h_() {
    return this.o.a(this.C, p.g, this);
  }
  
  protected void a(int i) {
    a(pm.a, i);
  }
  
  public boolean a(pm damagesource, int i) {
    G();
    this.d -= i;
    if (this.d <= 0)
      v(); 
    return false;
  }
  
  public void a(ik nbttagcompound) {
    nbttagcompound.a("Health", (short)(byte)this.d);
    nbttagcompound.a("Age", (short)this.b);
    nbttagcompound.a("Value", (short)this.e);
  }
  
  public void b(ik nbttagcompound) {
    this.d = nbttagcompound.d("Health") & 0xFF;
    this.b = nbttagcompound.d("Age");
    this.e = nbttagcompound.d("Value");
  }
  
  public void a(vi entityplayer) {
    if (this.o.I)
      return; 
    if (this.c == 0 && entityplayer.bM == 0) {
      entityplayer.bM = 2;
      this.o.a(this, "random.orb", 0.1F, 0.5F * ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.7F + 1.8F));
      entityplayer.a(this, 1);
      entityplayer.k(this.e);
      v();
    } 
  }
  
  public int g() {
    return this.e;
  }
  
  public int h() {
    if (this.e >= 2477)
      return 10; 
    if (this.e >= 1237)
      return 9; 
    if (this.e >= 617)
      return 8; 
    if (this.e >= 307)
      return 7; 
    if (this.e >= 149)
      return 6; 
    if (this.e >= 73)
      return 5; 
    if (this.e >= 37)
      return 4; 
    if (this.e >= 17)
      return 3; 
    if (this.e >= 7)
      return 2; 
    return (this.e < 3) ? 0 : 1;
  }
  
  public static int b(int i) {
    if (i >= 2477)
      return 2477; 
    if (i >= 1237)
      return 1237; 
    if (i >= 617)
      return 617; 
    if (i >= 307)
      return 307; 
    if (i >= 149)
      return 149; 
    if (i >= 73)
      return 73; 
    if (i >= 37)
      return 37; 
    if (i >= 17)
      return 17; 
    if (i >= 7)
      return 7; 
    return (i < 3) ? 1 : 3;
  }
}
