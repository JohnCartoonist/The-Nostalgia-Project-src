public abstract class k {
  public ry a;
  
  public vh b;
  
  public boolean c = false;
  
  public boolean d = false;
  
  public boolean e = false;
  
  public float[] f = new float[16];
  
  public int g = 0;
  
  private float[] h = new float[4];
  
  public final void a(ry world) {
    this.a = world;
    b();
    a();
  }
  
  protected void a() {
    float f = 0.0F;
    if (((Boolean)mod_noBiomesX.ClassicLight.get()).booleanValue())
      f = 0.05F; 
    for (int i = 0; i <= 15; i++) {
      float f1 = 1.0F - i / 15.0F;
      this.f[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
    } 
  }
  
  protected void b() {
    this.b = new vh(this.a);
  }
  
  public ej c() {
    return new xj(this.a, this.a.t(), this.a.z().r());
  }
  
  public boolean a(int i, int j) {
    int m = this.a.a(i, j);
    return (m == yy.E.bM);
  }
  
  public float a(long l, float f) {
    int i = (int)(l % 24000L);
    float f1 = (i + f) / 24000.0F - 0.25F;
    if (f1 < 0.0F)
      f1++; 
    if (f1 > 1.0F)
      f1--; 
    float f2 = f1;
    f1 = 1.0F - (float)((Math.cos(f1 * Math.PI) + 1.0D) / 2.0D);
    f1 = f2 + (f1 - f2) / 3.0F;
    return f1;
  }
  
  public int b(long l, float f) {
    return (int)(l / 24000L) % 8;
  }
  
  public float[] a(float f, float f1) {
    if (!((Boolean)mod_noBiomesX.SunriseEffect.get()).booleanValue())
      return null; 
    float f2 = 0.4F;
    float f3 = me.b(f * 3.141593F * 2.0F) - 0.0F;
    float f4 = -0.0F;
    if (f3 >= f4 - f2 && f3 <= f4 + f2) {
      float f5 = (f3 - f4) / f2 * 0.5F + 0.5F;
      float f6 = 1.0F - (1.0F - me.a(f5 * 3.141593F)) * 0.99F;
      f6 *= f6;
      this.h[0] = f5 * 0.3F + 0.7F;
      this.h[1] = f5 * f5 * 0.7F + 0.2F;
      this.h[2] = f5 * f5 * 0.0F + 0.2F;
      this.h[3] = f6;
      return this.h;
    } 
    return null;
  }
  
  public fb b(float f, float f1) {
    float f2 = me.b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = 0.7529412F;
    float f4 = 0.8470588F;
    float f5 = 1.0F;
    f3 *= f2 * 0.94F + 0.06F;
    f4 *= f2 * 0.94F + 0.06F;
    f5 *= f2 * 0.91F + 0.09F;
    return fb.b(f3, f4, f5);
  }
  
  public boolean d() {
    return true;
  }
  
  public static k a(int i) {
    if (i == -1)
      return new aau(); 
    if (i == 0)
      return (k)new ix(); 
    if (i == 1)
      return new ol(); 
    return null;
  }
  
  public float e() {
    if (this.a.totalSkyLight == 16)
      return 160.0F; 
    if (((Boolean)mod_noBiomesX.LowHangingClouds.get()).booleanValue())
      return 108.0F; 
    return this.a.c;
  }
  
  public boolean f() {
    return true;
  }
  
  public dh g() {
    return null;
  }
}
