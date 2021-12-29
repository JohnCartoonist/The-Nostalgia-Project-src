public class ol extends k {
  public void b() {
    this.b = new bx(sr.k, 0.5F, 0.0F, OldBiomeGenBase.sky);
    this.g = 1;
  }
  
  public ej c() {
    return new ChunkProviderSky(this.a, this.a.t());
  }
  
  public float a(long l, float f) {
    return 0.0F;
  }
  
  public float[] a(float f, float f1) {
    return null;
  }
  
  public fb b(float f, float f1) {
    int i = 8421536;
    float f2 = me.b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = (i >> 16 & 0xFF) / 255.0F;
    float f4 = (i >> 8 & 0xFF) / 255.0F;
    float f5 = (i & 0xFF) / 255.0F;
    f3 *= f2 * 0.94F + 0.06F;
    f4 *= f2 * 0.94F + 0.06F;
    f5 *= f2 * 0.91F + 0.09F;
    return fb.b(f3, f4, f5);
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean d() {
    return false;
  }
  
  public float e() {
    return 8.0F;
  }
  
  public boolean a(int i, int j) {
    int m = this.a.a(i, j);
    if (m == 0)
      return false; 
    return (yy.k[m]).bZ.d();
  }
  
  public dh g() {
    return new dh(100, 50, 0);
  }
}
