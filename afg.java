public class afg extends le {
  public afg() {
    float f = 0.0F;
    this.j = new acf((al)this, 40, 16);
    this.j.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, f);
    this.j.a(-5.0F, 2.0F, 0.0F);
    this.k = new acf((al)this, 40, 16);
    this.k.i = true;
    this.k.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, f);
    this.k.a(5.0F, 2.0F, 0.0F);
    this.l = new acf((al)this, 0, 16);
    this.l.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);
    this.l.a(-2.0F, 12.0F, 0.0F);
    this.m = new acf((al)this, 0, 16);
    this.m.i = true;
    this.m.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, f);
    this.m.a(2.0F, 12.0F, 0.0F);
  }
  
  public void a(float f, float f1, float f2, float f3, float f4, float f5) {
    if (!((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      this.s = true; 
    super.a(f, f1, f2, f3, f4, f5);
  }
}
