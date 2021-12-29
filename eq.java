public class eq {
  private int d = 0;
  
  private int a = 20;
  
  private int e = 20;
  
  private float b = 5.0F;
  
  private float c;
  
  public void a(int i, float f) {
    this.a = Math.min(i + this.a, 20);
    this.b = Math.min(this.b + i * f * 2.0F, this.a);
  }
  
  public void a(agu itemfood) {
    a(itemfood.o(), itemfood.p());
  }
  
  public void a(vi entityplayer) {
    if (!((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
      this.a = 3;
      this.e = 3;
      return;
    } 
    int i = entityplayer.o.v;
    this.e = this.a;
    if (this.c > 4.0F) {
      this.c -= 4.0F;
      if (this.b > 0.0F) {
        this.b = Math.max(this.b - 1.0F, 0.0F);
      } else if (i > 0) {
        this.a = Math.max(this.a - 1, 0);
      } 
    } 
    if (this.a >= 18 && entityplayer.aP()) {
      this.d++;
      if (this.d >= 80) {
        entityplayer.a_(1);
        this.d = 0;
      } 
    } else if (this.a <= 0) {
      this.d++;
      if (this.d >= 80) {
        if (entityplayer.ag() > 10 || i >= 3 || (entityplayer.ag() > 1 && i >= 2))
          entityplayer.a(pm.f, 1); 
        this.d = 0;
      } 
    } else {
      this.d = 0;
    } 
  }
  
  public void a(ik nbttagcompound) {
    if (nbttagcompound.b("foodLevel")) {
      this.a = nbttagcompound.e("foodLevel");
      this.d = nbttagcompound.e("foodTickTimer");
      this.b = nbttagcompound.g("foodSaturationLevel");
      this.c = nbttagcompound.g("foodExhaustionLevel");
    } 
  }
  
  public void b(ik nbttagcompound) {
    nbttagcompound.a("foodLevel", this.a);
    nbttagcompound.a("foodTickTimer", this.d);
    nbttagcompound.a("foodSaturationLevel", this.b);
    nbttagcompound.a("foodExhaustionLevel", this.c);
  }
  
  public int a() {
    return this.a;
  }
  
  public int b() {
    return this.e;
  }
  
  public boolean c() {
    return (this.a < 20);
  }
  
  public void a(float f) {
    this.c = Math.min(this.c + f, 40.0F);
  }
  
  public float d() {
    return this.b;
  }
  
  public void a(int i) {
    this.a = i;
  }
  
  public void b(float f) {
    this.b = f;
  }
}
