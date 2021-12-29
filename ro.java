import java.util.List;

public class ro extends ia {
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private boolean aq;
  
  public boolean a;
  
  public int b;
  
  public ia c;
  
  private int ar;
  
  private int as;
  
  public boolean d;
  
  public ro(ry world) {
    super(world);
    this.e = -1;
    this.f = -1;
    this.g = -1;
    this.h = 0;
    this.i = 0;
    this.aq = false;
    this.a = false;
    this.b = 0;
    this.as = 0;
    this.d = false;
    a(0.5F, 0.5F);
  }
  
  public ro(ry world, double d, double d1, double d2) {
    super(world);
    this.e = -1;
    this.f = -1;
    this.g = -1;
    this.h = 0;
    this.i = 0;
    this.aq = false;
    this.a = false;
    this.b = 0;
    this.as = 0;
    this.d = false;
    a(0.5F, 0.5F);
    d(d, d1, d2);
    this.L = 0.0F;
  }
  
  public ro(ry world, nq entityliving, float f) {
    super(world);
    this.e = -1;
    this.f = -1;
    this.g = -1;
    this.h = 0;
    this.i = 0;
    this.aq = false;
    this.a = false;
    this.b = 0;
    this.as = 0;
    this.d = false;
    this.c = entityliving;
    this.a = entityliving instanceof vi;
    a(0.5F, 0.5F);
    c(entityliving.s, entityliving.t + entityliving.E(), entityliving.u, entityliving.y, entityliving.z);
    this.s -= (me.b(this.y / 180.0F * 3.141593F) * 0.16F);
    this.t -= 0.10000000149011612D;
    this.u -= (me.a(this.y / 180.0F * 3.141593F) * 0.16F);
    d(this.s, this.t, this.u);
    this.L = 0.0F;
    this.v = (-me.a(this.y / 180.0F * 3.141593F) * me.b(this.z / 180.0F * 3.141593F));
    this.x = (me.b(this.y / 180.0F * 3.141593F) * me.b(this.z / 180.0F * 3.141593F));
    this.w = -me.a(this.z / 180.0F * 3.141593F);
    a(this.v, this.w, this.x, f * 1.5F, 1.0F);
  }
  
  protected void b() {}
  
  public void a(double d, double d1, double d2, float f, float f1) {
    float f2 = me.a(d * d + d1 * d1 + d2 * d2);
    d /= f2;
    d1 /= f2;
    d2 /= f2;
    d += this.Y.nextGaussian() * 0.007499999832361937D * f1;
    d1 += this.Y.nextGaussian() * 0.007499999832361937D * f1;
    d2 += this.Y.nextGaussian() * 0.007499999832361937D * f1;
    d *= f;
    d1 *= f;
    d2 *= f;
    this.v = d;
    this.w = d1;
    this.x = d2;
    float f3 = me.a(d * d + d2 * d2);
    this.A = this.y = (float)(Math.atan2(d, d2) * 180.0D / 3.1415927410125732D);
    this.B = this.z = (float)(Math.atan2(d1, f3) * 180.0D / 3.1415927410125732D);
    this.ar = 0;
  }
  
  public void a(double d, double d1, double d2) {
    this.v = d;
    this.w = d1;
    this.x = d2;
    if (this.B == 0.0F && this.A == 0.0F) {
      float f = me.a(d * d + d2 * d2);
      this.A = this.y = (float)(Math.atan2(d, d2) * 180.0D / 3.1415927410125732D);
      this.B = this.z = (float)(Math.atan2(d1, f) * 180.0D / 3.1415927410125732D);
      this.B = this.z;
      this.A = this.y;
      c(this.s, this.t, this.u, this.y, this.z);
      this.ar = 0;
    } 
  }
  
  public void a() {
    super.a();
    if (this.B == 0.0F && this.A == 0.0F) {
      float f = me.a(this.v * this.v + this.x * this.x);
      this.A = this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);
      this.B = this.z = (float)(Math.atan2(this.w, f) * 180.0D / 3.1415927410125732D);
    } 
    int i = this.o.a(this.e, this.f, this.g);
    if (i > 0) {
      yy.k[i].b(this.o, this.e, this.f, this.g);
      c axisalignedbb = yy.k[i].b(this.o, this.e, this.f, this.g);
      if (axisalignedbb != null && axisalignedbb.a(fb.b(this.s, this.t, this.u)))
        this.aq = true; 
    } 
    if (this.b > 0)
      this.b--; 
    if (this.aq) {
      int j = this.o.a(this.e, this.f, this.g);
      int k = this.o.d(this.e, this.f, this.g);
      if (j != this.h || k != this.i) {
        this.aq = false;
        this.v *= (this.Y.nextFloat() * 0.2F);
        this.w *= (this.Y.nextFloat() * 0.2F);
        this.x *= (this.Y.nextFloat() * 0.2F);
        this.ar = 0;
        this.as = 0;
        return;
      } 
      this.ar++;
      if (this.ar == 1200)
        v(); 
      return;
    } 
    this.as++;
    fb vec3d = fb.b(this.s, this.t, this.u);
    fb vec3d1 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
    gv movingobjectposition = this.o.a(vec3d, vec3d1, false, true);
    vec3d = fb.b(this.s, this.t, this.u);
    vec3d1 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
    if (movingobjectposition != null)
      vec3d1 = fb.b(movingobjectposition.f.a, movingobjectposition.f.b, movingobjectposition.f.c); 
    ia entity = null;
    List<ia> list = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
    double d = 0.0D;
    for (int l = 0; l < list.size(); l++) {
      ia entity1 = list.get(l);
      if (entity1.e_() && (entity1 != this.c || this.as >= 5)) {
        float f5 = 0.3F;
        c axisalignedbb1 = entity1.C.b(f5, f5, f5);
        gv movingobjectposition1 = axisalignedbb1.a(vec3d, vec3d1);
        if (movingobjectposition1 != null) {
          double d1 = vec3d.d(movingobjectposition1.f);
          if (d1 < d || d == 0.0D) {
            entity = entity1;
            d = d1;
          } 
        } 
      } 
    } 
    if (entity != null)
      movingobjectposition = new gv(entity); 
    if (movingobjectposition != null)
      if (movingobjectposition.g != null) {
        float f1 = me.a(this.v * this.v + this.w * this.w + this.x * this.x);
        int j1 = (int)Math.ceil(f1 * 2.0D);
        if (this.d)
          j1 += this.Y.nextInt(j1 / 2 + 2); 
        if (((Boolean)mod_noBiomesX.OldBows.get()).booleanValue())
          j1 = 4; 
        pm damagesource = null;
        if (this.c == null) {
          damagesource = pm.a(this, this);
        } else {
          damagesource = pm.a(this, this.c);
        } 
        if (movingobjectposition.g.a(damagesource, j1)) {
          if (movingobjectposition.g instanceof nq)
            ((nq)movingobjectposition.g).bf++; 
          if (!((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue())
            this.o.a(this, "random.bowhit", 1.0F, 1.2F / (this.Y.nextFloat() * 0.2F + 0.9F)); 
          v();
        } else {
          this.v *= -0.10000000149011612D;
          this.w *= -0.10000000149011612D;
          this.x *= -0.10000000149011612D;
          this.y += 180.0F;
          this.A += 180.0F;
          this.as = 0;
        } 
      } else {
        this.e = movingobjectposition.b;
        this.f = movingobjectposition.c;
        this.g = movingobjectposition.d;
        this.h = this.o.a(this.e, this.f, this.g);
        this.i = this.o.d(this.e, this.f, this.g);
        this.v = (float)(movingobjectposition.f.a - this.s);
        this.w = (float)(movingobjectposition.f.b - this.t);
        this.x = (float)(movingobjectposition.f.c - this.u);
        float f2 = me.a(this.v * this.v + this.w * this.w + this.x * this.x);
        this.s -= this.v / f2 * 0.05000000074505806D;
        this.t -= this.w / f2 * 0.05000000074505806D;
        this.u -= this.x / f2 * 0.05000000074505806D;
        if (!((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
          this.o.a(this, "random.bowhit", 1.0F, 1.2F / (this.Y.nextFloat() * 0.2F + 0.9F));
        } else {
          this.o.a(this, "random.drr", 1.0F, 1.2F / (this.Y.nextFloat() * 0.2F + 0.9F));
        } 
        this.aq = true;
        this.b = 7;
        this.d = false;
      }  
    if (this.d)
      for (int i1 = 0; i1 < 4; i1++)
        this.o.a("crit", this.s + this.v * i1 / 4.0D, this.t + this.w * i1 / 4.0D, this.u + this.x * i1 / 4.0D, -this.v, -this.w + 0.2D, -this.x);  
    this.s += this.v;
    this.t += this.w;
    this.u += this.x;
    float f3 = me.a(this.v * this.v + this.x * this.x);
    this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);
    for (this.z = (float)(Math.atan2(this.w, f3) * 180.0D / 3.1415927410125732D); this.z - this.B < -180.0F; this.B -= 360.0F);
    for (; this.z - this.B >= 180.0F; this.B += 360.0F);
    for (; this.y - this.A < -180.0F; this.A -= 360.0F);
    for (; this.y - this.A >= 180.0F; this.A += 360.0F);
    this.z = this.B + (this.z - this.B) * 0.2F;
    this.y = this.A + (this.y - this.A) * 0.2F;
    float f4 = 0.99F;
    float f6 = 0.05F;
    if (D()) {
      for (int k1 = 0; k1 < 4; k1++) {
        float f7 = 0.25F;
        this.o.a("bubble", this.s - this.v * f7, this.t - this.w * f7, this.u - this.x * f7, this.v, this.w, this.x);
      } 
      f4 = 0.8F;
    } 
    this.v *= f4;
    this.w *= f4;
    this.x *= f4;
    this.w -= f6;
    d(this.s, this.t, this.u);
  }
  
  public void a(ik nbttagcompound) {
    nbttagcompound.a("xTile", (short)this.e);
    nbttagcompound.a("yTile", (short)this.f);
    nbttagcompound.a("zTile", (short)this.g);
    nbttagcompound.a("inTile", (byte)this.h);
    nbttagcompound.a("inData", (byte)this.i);
    nbttagcompound.a("shake", (byte)this.b);
    nbttagcompound.a("inGround", (byte)(this.aq ? 1 : 0));
    nbttagcompound.a("player", this.a);
  }
  
  public void b(ik nbttagcompound) {
    this.e = nbttagcompound.d("xTile");
    this.f = nbttagcompound.d("yTile");
    this.g = nbttagcompound.d("zTile");
    this.h = nbttagcompound.c("inTile") & 0xFF;
    this.i = nbttagcompound.c("inData") & 0xFF;
    this.b = nbttagcompound.c("shake") & 0xFF;
    this.aq = (nbttagcompound.c("inGround") == 1);
    this.a = nbttagcompound.m("player");
  }
  
  public void a(vi entityplayer) {
    if (this.o.I)
      return; 
    if (this.aq && this.a && this.b <= 0 && entityplayer.by.a(new dk(acy.k, 1))) {
      this.o.a(this, "random.pop", 0.2F, ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      entityplayer.a(this, 1);
      v();
    } 
  }
  
  public float i_() {
    return 0.0F;
  }
}
