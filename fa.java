public class fa extends al {
  public acf g;
  
  public acf h;
  
  public acf i;
  
  public acf j;
  
  public acf k;
  
  public acf l;
  
  public acf m;
  
  public acf n;
  
  public acf o;
  
  public int p;
  
  public int q;
  
  public boolean r;
  
  public boolean s;
  
  public fa() {
    this(0.0F);
  }
  
  public fa(float f) {
    this(f, 0.0F);
  }
  
  public fa(float f, float f1) {
    this.p = 0;
    this.q = 0;
    this.r = false;
    this.s = false;
    this.o = new acf(this, 0, 0);
    this.o.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, f);
    this.n = new acf(this, 24, 0);
    this.n.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, f);
    this.g = new acf(this, 0, 0);
    this.g.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f);
    this.g.a(0.0F, 0.0F + f1, 0.0F);
    this.h = new acf(this, 32, 0);
    this.h.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f + 0.5F);
    this.h.a(0.0F, 0.0F + f1, 0.0F);
    this.i = new acf(this, 16, 16);
    this.i.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, f);
    this.i.a(0.0F, 0.0F + f1, 0.0F);
    this.j = new acf(this, 40, 16);
    this.j.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, f);
    this.j.a(-5.0F, 2.0F + f1, 0.0F);
    this.k = new acf(this, 40, 16);
    this.k.i = true;
    this.k.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, f);
    this.k.a(5.0F, 2.0F + f1, 0.0F);
    this.l = new acf(this, 0, 16);
    this.l.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, f);
    this.l.a(-2.0F, 12.0F + f1, 0.0F);
    this.m = new acf(this, 0, 16);
    this.m.i = true;
    this.m.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, f);
    this.m.a(2.0F, 12.0F + f1, 0.0F);
  }
  
  public void a(ia entity, float f, float f1, float f2, float f3, float f4, float f5) {
    a(f, f1, f2, f3, f4, f5);
    this.g.a(f5);
    this.i.a(f5);
    this.j.a(f5);
    this.k.a(f5);
    this.l.a(f5);
    this.m.a(f5);
    this.h.a(f5);
  }
  
  public void a(float f, float f1, float f2, float f3, float f4, float f5) {
    if (((Boolean)mod_noBiomesX.ClassicWalkAnim.get()).booleanValue()) {
      setRotationAngles_Classic(f, f1, f2, f3, f4, f5);
      return;
    } 
    this.g.g = f3 / 57.29578F;
    this.g.f = f4 / 57.29578F;
    this.h.g = this.g.g;
    this.h.f = this.g.f;
    this.j.f = me.b(f * 0.6662F + 3.141593F) * 2.0F * f1 * 0.5F;
    this.k.f = me.b(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.j.h = 0.0F;
    this.k.h = 0.0F;
    this.l.f = me.b(f * 0.6662F) * 1.4F * f1;
    this.m.f = me.b(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.l.g = 0.0F;
    this.m.g = 0.0F;
    if (this.b) {
      this.j.f += -0.6283185F;
      this.k.f += -0.6283185F;
      this.l.f = -1.256637F;
      this.m.f = -1.256637F;
      this.l.g = 0.3141593F;
      this.m.g = -0.3141593F;
    } 
    if (this.p != 0)
      this.k.f = this.k.f * 0.5F - 0.3141593F * this.p; 
    if (this.q != 0)
      this.j.f = this.j.f * 0.5F - 0.3141593F * this.q; 
    this.j.g = 0.0F;
    this.k.g = 0.0F;
    if (this.a > -9990.0F) {
      float f6 = this.a;
      this.i.g = me.a(me.c(f6) * 3.141593F * 2.0F) * 0.2F;
      this.j.e = me.a(this.i.g) * 5.0F;
      this.j.c = -me.b(this.i.g) * 5.0F;
      this.k.e = -me.a(this.i.g) * 5.0F;
      this.k.c = me.b(this.i.g) * 5.0F;
      this.j.g += this.i.g;
      this.k.g += this.i.g;
      this.k.f += this.i.g;
      f6 = 1.0F - this.a;
      f6 *= f6;
      f6 *= f6;
      f6 = 1.0F - f6;
      float f8 = me.a(f6 * 3.141593F);
      float f10 = me.a(this.a * 3.141593F) * -(this.g.f - 0.7F) * 0.75F;
      this.j.f = (float)(this.j.f - f8 * 1.2D + f10);
      this.j.g += this.i.g * 2.0F;
      this.j.h = me.a(this.a * 3.141593F) * -0.4F;
    } 
    if (this.r) {
      this.i.f = 0.5F;
      this.l.f -= 0.0F;
      this.m.f -= 0.0F;
      this.j.f += 0.4F;
      this.k.f += 0.4F;
      this.l.e = 4.0F;
      this.m.e = 4.0F;
      this.l.d = 9.0F;
      this.m.d = 9.0F;
      this.g.d = 1.0F;
    } else {
      this.i.f = 0.0F;
      this.l.e = 0.0F;
      this.m.e = 0.0F;
      this.l.d = 12.0F;
      this.m.d = 12.0F;
      this.g.d = 0.0F;
    } 
    this.j.h += me.b(f2 * 0.09F) * 0.05F + 0.05F;
    this.k.h -= me.b(f2 * 0.09F) * 0.05F + 0.05F;
    this.j.f += me.a(f2 * 0.067F) * 0.05F;
    this.k.f -= me.a(f2 * 0.067F) * 0.05F;
    if (this.s) {
      float f7 = 0.0F;
      float f9 = 0.0F;
      this.j.h = 0.0F;
      this.k.h = 0.0F;
      this.j.g = -(0.1F - f7 * 0.6F) + this.g.g;
      this.k.g = 0.1F - f7 * 0.6F + this.g.g + 0.4F;
      this.j.f = -1.570796F + this.g.f;
      this.k.f = -1.570796F + this.g.f;
      this.j.f -= f7 * 1.2F - f9 * 0.4F;
      this.k.f -= f7 * 1.2F - f9 * 0.4F;
      this.j.h += me.b(f2 * 0.09F) * 0.05F + 0.05F;
      this.k.h -= me.b(f2 * 0.09F) * 0.05F + 0.05F;
      this.j.f += me.a(f2 * 0.067F) * 0.05F;
      this.k.f -= me.a(f2 * 0.067F) * 0.05F;
    } 
  }
  
  public void setRotationAngles_Classic(float f, float f1, float f2, float f3, float f4, float f5) {
    this.g.g = f3 / 57.29578F;
    this.g.f = f4 / 57.29578F;
    this.h.g = this.g.g;
    this.h.f = this.g.f;
    this.j.f = me.b(f * 0.6662F + 3.141593F) * 2.0F * f1;
    this.j.h = (me.b(f * 0.2312F) + 1.0F) * f1;
    this.k.f = me.b(f * 0.6662F) * 2.0F * f1;
    this.k.h = (me.b(f * 0.2812F) - 1.0F) * f1;
    this.l.f = me.b(f * 0.6662F) * 1.4F * f1;
    this.m.f = me.b(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.l.g = 0.0F;
    this.m.g = 0.0F;
    if (this.b) {
      this.j.f += -0.6283185F;
      this.k.f += -0.6283185F;
      this.l.f = -1.256637F;
      this.m.f = -1.256637F;
      this.l.g = 0.3141593F;
      this.m.g = -0.3141593F;
    } 
    this.j.g = 0.0F;
    this.k.g = 0.0F;
    if (this.r) {
      this.i.f = 0.5F;
      this.l.f -= 0.0F;
      this.m.f -= 0.0F;
      this.j.f += 0.4F;
      this.k.f += 0.4F;
      this.l.e = 4.0F;
      this.m.e = 4.0F;
      this.l.d = 9.0F;
      this.m.d = 9.0F;
      this.g.d = 1.0F;
    } else {
      this.i.f = 0.0F;
      this.l.e = 0.0F;
      this.m.e = 0.0F;
      this.l.d = 12.0F;
      this.m.d = 12.0F;
      this.g.d = 0.0F;
    } 
    this.j.h += me.b(f2 * 0.09F) * 0.05F + 0.05F;
    this.k.h -= me.b(f2 * 0.09F) * 0.05F + 0.05F;
    this.j.f += me.a(f2 * 0.067F) * 0.05F;
    this.k.f -= me.a(f2 * 0.067F) * 0.05F;
  }
  
  public void a(float f) {
    this.n.g = this.g.g;
    this.n.f = this.g.f;
    this.n.c = 0.0F;
    this.n.d = 0.0F;
    this.n.a(f);
  }
  
  public void b(float f) {
    this.o.a(f);
  }
}
