public class aau extends k {
  public void b() {
    this.b = new bx(sr.j, 1.0F, 0.0F);
    this.c = true;
    this.d = true;
    this.e = true;
    this.g = -1;
  }
  
  public fb b(float f, float f1) {
    return fb.b(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
  }
  
  protected void a() {
    float f = 0.1F;
    for (int i = 0; i <= 15; i++) {
      float f1 = 1.0F - i / 15.0F;
      this.f[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
    } 
  }
  
  public ej c() {
    return new jv(this.a, this.a.t(), this.a.z().r());
  }
  
  public boolean a(int i, int j) {
    int m = this.a.a(i, j);
    if (m == yy.z.bM)
      return false; 
    if (m == 0)
      return false; 
    return yy.m[m];
  }
  
  public float a(long l, float f) {
    return 0.5F;
  }
  
  public boolean d() {
    return false;
  }
}
