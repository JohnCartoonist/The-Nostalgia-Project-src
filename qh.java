public class qh extends fx {
  public boolean a;
  
  public float b;
  
  public float c;
  
  public float d;
  
  public float e;
  
  public float f;
  
  public int g;
  
  public qh(ry world) {
    super(world);
    this.a = false;
    this.b = 0.0F;
    this.c = 0.0F;
    this.f = 1.0F;
    this.aA = "/mob/chicken.png";
    a(0.3F, 0.7F);
    this.g = this.Y.nextInt(6000) + 6000;
  }
  
  public int f_() {
    return 4;
  }
  
  public void c() {
    super.c();
    this.e = this.b;
    this.d = this.c;
    this.c = (float)(this.c + (this.D ? -1 : 4) * 0.3D);
    if (this.c < 0.0F)
      this.c = 0.0F; 
    if (this.c > 1.0F)
      this.c = 1.0F; 
    if (!this.D && this.f < 1.0F)
      this.f = 1.0F; 
    this.f = (float)(this.f * 0.9D);
    if (!this.D && this.w < 0.0D)
      this.w *= 0.6D; 
    this.b += this.f * 2.0F;
    if (!q_() && !this.o.I && --this.g <= 0) {
      this.o.a((ia)this, "mob.chickenplop", 1.0F, (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
      b(acy.aO.bM, 1);
      this.g = this.Y.nextInt(6000) + 6000;
    } 
  }
  
  protected void c(float f) {}
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
  }
  
  protected String e() {
    return "mob.chicken";
  }
  
  protected String f() {
    return "mob.chickenhurt";
  }
  
  protected String g() {
    return "mob.chickenhurt";
  }
  
  protected int k() {
    return acy.K.bM;
  }
  
  protected void a(boolean flag, int i) {
    int j = this.Y.nextInt(3) + this.Y.nextInt(1 + i);
    for (int k = 0; k < j; k++)
      b(acy.K.bM, 1); 
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
      return; 
    if (V()) {
      b(acy.bk.bM, 1);
    } else {
      b(acy.bj.bM, 1);
    } 
  }
  
  protected fx a(fx entityanimal) {
    return new qh(this.o);
  }
}
