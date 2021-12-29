import java.util.List;
import java.util.Random;

public abstract class ia {
  private static int a = 0;
  
  public int j;
  
  public double k;
  
  public boolean l;
  
  public ia m;
  
  public ia n;
  
  public ry o;
  
  public double p;
  
  public double q;
  
  public double r;
  
  public double s;
  
  public double t;
  
  public double u;
  
  public double v;
  
  public double w;
  
  public double x;
  
  public float y;
  
  public float z;
  
  public float A;
  
  public float B;
  
  public final c C = c.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
  
  public boolean D;
  
  public boolean E;
  
  public boolean F;
  
  public boolean G;
  
  public boolean H;
  
  protected boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public float L;
  
  public float M;
  
  public float N;
  
  public float O;
  
  public float P;
  
  public float Q;
  
  private int b;
  
  public double R;
  
  public double S;
  
  public double T;
  
  public float U;
  
  public float V;
  
  public boolean W;
  
  public float X;
  
  protected Random Y;
  
  public int Z;
  
  public int aa;
  
  private int c;
  
  protected boolean ab;
  
  public int ac;
  
  private boolean d;
  
  public String ad;
  
  public String ae;
  
  protected boolean af;
  
  protected cr ag;
  
  private double e;
  
  private double f;
  
  public boolean ah;
  
  public int ai;
  
  public int aj;
  
  public int ak;
  
  public int al;
  
  public int am;
  
  public int an;
  
  public boolean ao;
  
  public boolean ap;
  
  public ia(ry world) {
    this.j = a++;
    this.k = 1.0D;
    this.l = false;
    this.D = false;
    this.G = false;
    this.H = false;
    this.J = true;
    this.K = false;
    this.L = 0.0F;
    this.M = 0.6F;
    this.N = 1.8F;
    this.O = 0.0F;
    this.P = 0.0F;
    this.Q = 0.0F;
    this.b = 1;
    this.U = 0.0F;
    this.V = 0.0F;
    this.W = false;
    this.X = 0.0F;
    this.Y = new Random();
    this.Z = 0;
    this.aa = 1;
    this.c = 0;
    this.ab = false;
    this.ac = 0;
    this.d = true;
    this.af = false;
    this.ag = new cr();
    this.ah = false;
    this.o = world;
    d(0.0D, 0.0D, 0.0D);
    this.ag.a(0, Byte.valueOf((byte)0));
    this.ag.a(1, Short.valueOf((short)300));
    b();
  }
  
  protected abstract void b();
  
  public cr t() {
    return this.ag;
  }
  
  public boolean equals(Object obj) {
    if (obj instanceof ia)
      return (((ia)obj).j == this.j); 
    return false;
  }
  
  public int hashCode() {
    return this.j;
  }
  
  protected void u() {
    if (this.o == null)
      return; 
    while (this.t > 0.0D) {
      d(this.s, this.t, this.u);
      if (this.o.a(this, this.C).size() == 0)
        break; 
      this.t++;
    } 
    this.v = this.w = this.x = 0.0D;
    this.z = 0.0F;
  }
  
  public void v() {
    this.K = true;
  }
  
  protected void a(float f, float f1) {
    this.M = f;
    this.N = f1;
  }
  
  protected void b(float f, float f1) {
    this.y = f % 360.0F;
    this.z = f1 % 360.0F;
  }
  
  public void d(double d, double d1, double d2) {
    this.s = d;
    this.t = d1;
    this.u = d2;
    float f = this.M / 2.0F;
    float f1 = this.N;
    this.C.c(d - f, d1 - this.L + this.U, d2 - f, d + f, d1 - this.L + this.U + f1, d2 + f);
  }
  
  public void c(float f, float f1) {
    float f2 = this.z;
    float f3 = this.y;
    this.y = (float)(this.y + f * 0.15D);
    this.z = (float)(this.z - f1 * 0.15D);
    if (this.z < -90.0F)
      this.z = -90.0F; 
    if (this.z > 90.0F)
      this.z = 90.0F; 
    this.B += this.z - f2;
    this.A += this.y - f3;
  }
  
  public void a() {
    w();
  }
  
  public void w() {
    pf.a("entityBaseTick");
    if (this.n != null && this.n.K)
      this.n = null; 
    this.Z++;
    this.O = this.P;
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    this.B = this.z;
    this.A = this.y;
    if (X()) {
      int i = me.c(this.s);
      int j = me.c(this.t - 0.20000000298023224D - this.L);
      int k = me.c(this.u);
      int j1 = this.o.a(i, j, k);
      if (j1 > 0)
        this.o.a("tilecrack_" + j1, this.s + (this.Y.nextFloat() - 0.5D) * this.M, this.C.b + 0.1D, this.u + (this.Y.nextFloat() - 0.5D) * this.M, -this.v * 4.0D, 1.5D, -this.x * 4.0D); 
    } 
    if (h_()) {
      if (!this.ab && !this.d) {
        float f = me.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.2F;
        if (f > 1.0F)
          f = 1.0F; 
        this.o.a(this, "random.splash", f, 1.0F + (this.Y.nextFloat() - this.Y.nextFloat()) * 0.4F);
        float f1 = me.c(this.C.b);
        for (int l = 0; l < 1.0F + this.M * 20.0F; l++) {
          float f2 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
          float f4 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
          this.o.a("bubble", this.s + f2, (f1 + 1.0F), this.u + f4, this.v, this.w - (this.Y.nextFloat() * 0.2F), this.x);
        } 
        for (int i1 = 0; i1 < 1.0F + this.M * 20.0F; i1++) {
          float f3 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
          float f5 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M;
          this.o.a("splash", this.s + f3, (f1 + 1.0F), this.u + f5, this.v, this.w, this.x);
        } 
      } 
      this.Q = 0.0F;
      this.ab = true;
      this.c = 0;
    } else {
      this.ab = false;
    } 
    if (this.o.I) {
      this.c = 0;
    } else if (this.c > 0) {
      if (this.af) {
        this.c -= 4;
        if (this.c < 0)
          this.c = 0; 
      } else {
        if (this.c % 20 == 0)
          a(pm.b, 1); 
        this.c--;
      } 
    } 
    if (F()) {
      x();
      this.Q *= 0.5F;
    } 
    if (this.t < -64.0D)
      z(); 
    if (!this.o.I) {
      a(0, (this.c > 0));
      a(2, (this.n != null));
    } 
    this.d = false;
    pf.b();
  }
  
  protected void x() {
    if (!this.af) {
      a(pm.c, 4);
      e(15);
    } 
  }
  
  public void e(int i) {
    int j = i * 20;
    if (this.c < j)
      this.c = j; 
  }
  
  public void y() {
    this.c = 0;
  }
  
  protected void z() {
    v();
  }
  
  public boolean e(double d, double d1, double d2) {
    c axisalignedbb = this.C.c(d, d1, d2);
    List list = this.o.a(this, axisalignedbb);
    if (list.size() > 0)
      return false; 
    return !this.o.b(axisalignedbb);
  }
  
  public void b(double d, double d1, double d2) {
    if (this.W) {
      this.C.d(d, d1, d2);
      this.s = (this.C.a + this.C.d) / 2.0D;
      this.t = this.C.b + this.L - this.U;
      this.u = (this.C.c + this.C.f) / 2.0D;
      return;
    } 
    pf.a("move");
    this.U *= 0.4F;
    double d3 = this.s;
    double d4 = this.u;
    if (this.I) {
      this.I = false;
      d *= 0.25D;
      d1 *= 0.05000000074505806D;
      d2 *= 0.25D;
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
    } 
    double d5 = d;
    double d6 = d1;
    double d7 = d2;
    c axisalignedbb = this.C.d();
    boolean flag = (this.D && q());
    if (flag) {
      double d8 = 0.05D;
      for (; d != 0.0D && this.o.a(this, this.C.c(d, -1.0D, 0.0D)).size() == 0; d5 = d) {
        if (d < d8 && d >= -d8) {
          d = 0.0D;
        } else if (d > 0.0D) {
          d -= d8;
        } else {
          d += d8;
        } 
      } 
      for (; d2 != 0.0D && this.o.a(this, this.C.c(0.0D, -1.0D, d2)).size() == 0; d7 = d2) {
        if (d2 < d8 && d2 >= -d8) {
          d2 = 0.0D;
        } else if (d2 > 0.0D) {
          d2 -= d8;
        } else {
          d2 += d8;
        } 
      } 
    } 
    List<c> list = this.o.a(this, this.C.a(d, d1, d2));
    for (int i = 0; i < list.size(); i++)
      d1 = ((c)list.get(i)).b(this.C, d1); 
    this.C.d(0.0D, d1, 0.0D);
    if (!this.J && d6 != d1)
      d = d1 = d2 = 0.0D; 
    boolean flag1 = (this.D || (d6 != d1 && d6 < 0.0D));
    for (int j = 0; j < list.size(); j++)
      d = ((c)list.get(j)).a(this.C, d); 
    this.C.d(d, 0.0D, 0.0D);
    if (!this.J && d5 != d)
      d = d1 = d2 = 0.0D; 
    for (int k = 0; k < list.size(); k++)
      d2 = ((c)list.get(k)).c(this.C, d2); 
    this.C.d(0.0D, 0.0D, d2);
    if (!this.J && d7 != d2)
      d = d1 = d2 = 0.0D; 
    if (this.V > 0.0F && flag1 && (flag || this.U < 0.05F) && (d5 != d || d7 != d2)) {
      double d9 = d;
      double d11 = d1;
      double d13 = d2;
      d = d5;
      d1 = this.V;
      d2 = d7;
      c axisalignedbb1 = this.C.d();
      this.C.b(axisalignedbb);
      List<c> list1 = this.o.a(this, this.C.a(d, d1, d2));
      for (int j2 = 0; j2 < list1.size(); j2++)
        d1 = ((c)list1.get(j2)).b(this.C, d1); 
      this.C.d(0.0D, d1, 0.0D);
      if (!this.J && d6 != d1)
        d = d1 = d2 = 0.0D; 
      for (int k2 = 0; k2 < list1.size(); k2++)
        d = ((c)list1.get(k2)).a(this.C, d); 
      this.C.d(d, 0.0D, 0.0D);
      if (!this.J && d5 != d)
        d = d1 = d2 = 0.0D; 
      for (int l2 = 0; l2 < list1.size(); l2++)
        d2 = ((c)list1.get(l2)).c(this.C, d2); 
      this.C.d(0.0D, 0.0D, d2);
      if (!this.J && d7 != d2)
        d = d1 = d2 = 0.0D; 
      d = d1 = d2 = 0.0D;
      d1 = -this.V;
      for (int i3 = 0; i3 < list1.size(); i3++)
        d1 = ((c)list1.get(i3)).b(this.C, d1); 
      this.C.d(0.0D, d1, 0.0D);
      if (d9 * d9 + d13 * d13 >= d * d + d2 * d2) {
        d = d9;
        d1 = d11;
        d2 = d13;
        this.C.b(axisalignedbb1);
      } else {
        double d14 = this.C.b - (int)this.C.b;
        if (d14 > 0.0D)
          this.U = (float)(this.U + d14 + 0.01D); 
      } 
    } 
    pf.b();
    pf.a("rest");
    this.s = (this.C.a + this.C.d) / 2.0D;
    this.t = this.C.b + this.L - this.U;
    this.u = (this.C.c + this.C.f) / 2.0D;
    this.E = (d5 != d || d7 != d2);
    this.F = (d6 != d1);
    this.D = (d6 != d1 && d6 < 0.0D);
    this.G = (this.E || this.F);
    a(d1, this.D);
    if (d5 != d)
      this.v = 0.0D; 
    if (d6 != d1)
      this.w = 0.0D; 
    if (d7 != d2)
      this.x = 0.0D; 
    double d10 = this.s - d3;
    double d12 = this.u - d4;
    if (d_() && !flag && this.n == null) {
      this.P = (float)(this.P + me.a(d10 * d10 + d12 * d12) * 0.6D);
      int l = me.c(this.s);
      int j1 = me.c(this.t - 0.20000000298023224D - this.L);
      int l1 = me.c(this.u);
      int j3 = this.o.a(l, j1, l1);
      if (j3 == 0 && this.o.a(l, j1 - 1, l1) == yy.aZ.bM)
        j3 = this.o.a(l, j1 - 1, l1); 
      if (this.P > this.b && j3 > 0) {
        this.b = (int)this.P + 1;
        a(l, j1, l1, j3);
        yy.k[j3].b(this.o, l, j1, l1, this);
      } 
    } 
    int i1 = me.c(this.C.a + 0.001D);
    int k1 = me.c(this.C.b + 0.001D);
    int i2 = me.c(this.C.c + 0.001D);
    int k3 = me.c(this.C.d - 0.001D);
    int l3 = me.c(this.C.e - 0.001D);
    int i4 = me.c(this.C.f - 0.001D);
    if (this.o.b(i1, k1, i2, k3, l3, i4))
      for (int j4 = i1; j4 <= k3; j4++) {
        for (int k4 = k1; k4 <= l3; k4++) {
          for (int l4 = i2; l4 <= i4; l4++) {
            int i5 = this.o.a(j4, k4, l4);
            if (i5 > 0)
              yy.k[i5].a(this.o, j4, k4, l4, this); 
          } 
        } 
      }  
    boolean flag2 = C();
    if (this.o.c(this.C.e(0.001D, 0.001D, 0.001D))) {
      a(1);
      if (!flag2) {
        this.c++;
        if (this.c == 0) {
          int fireTime = 8;
          if (((Boolean)mod_noBiomesX.UnNerfFire.get()).booleanValue())
            fireTime = 15; 
          e(fireTime);
        } 
      } 
    } else if (this.c <= 0) {
      this.c = -this.aa;
    } 
    if (flag2 && this.c > 0) {
      this.o.a(this, "random.fizz", 0.7F, 1.6F + (this.Y.nextFloat() - this.Y.nextFloat()) * 0.4F);
      this.c = -this.aa;
    } 
    pf.b();
  }
  
  protected void a(int i, int j, int k, int l) {
    wu stepsound = (yy.k[l]).bX;
    if (this.o.a(i, j + 1, k) == yy.aS.bM) {
      stepsound = yy.aS.bX;
      this.o.a(this, stepsound.d(), stepsound.b() * 0.15F, stepsound.c());
    } else if (!(yy.k[l]).bZ.a()) {
      this.o.a(this, stepsound.d(), stepsound.b() * 0.15F, stepsound.c());
    } 
  }
  
  protected boolean d_() {
    return true;
  }
  
  protected void a(double d, boolean flag) {
    if (flag) {
      if (this.Q > 0.0F) {
        c(this.Q);
        this.Q = 0.0F;
      } 
    } else if (d < 0.0D) {
      this.Q = (float)(this.Q - d);
    } 
  }
  
  public c A() {
    return null;
  }
  
  protected void a(int i) {
    if (!this.af)
      a(pm.a, i); 
  }
  
  public final boolean B() {
    return this.af;
  }
  
  protected void c(float f) {
    if (this.m != null)
      this.m.c(f); 
  }
  
  public boolean C() {
    return (this.ab || this.o.w(me.c(this.s), me.c(this.t), me.c(this.u)));
  }
  
  public boolean D() {
    return this.ab;
  }
  
  public boolean h_() {
    return this.o.a(this.C.b(0.0D, -0.4000000059604645D, 0.0D).e(0.001D, 0.001D, 0.001D), p.g, this);
  }
  
  public boolean a(p material) {
    double d = this.t + E();
    int i = me.c(this.s);
    int j = me.d(me.c(d));
    int k = me.c(this.u);
    int l = this.o.a(i, j, k);
    if (l != 0 && (yy.k[l]).bZ == material) {
      float f = agw.e(this.o.d(i, j, k)) - 0.1111111F;
      float f1 = (j + 1) - f;
      return (d < f1);
    } 
    return false;
  }
  
  public float E() {
    return 0.0F;
  }
  
  public boolean F() {
    return this.o.a(this.C.b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), p.h);
  }
  
  public void a(float f, float f1, float f2) {
    float f3 = me.c(f * f + f1 * f1);
    if (f3 < 0.01F)
      return; 
    if (f3 < 1.0F)
      f3 = 1.0F; 
    f3 = f2 / f3;
    f *= f3;
    f1 *= f3;
    float f4 = me.a(this.y * 3.141593F / 180.0F);
    float f5 = me.b(this.y * 3.141593F / 180.0F);
    this.v += (f * f5 - f1 * f4);
    this.x += (f1 * f5 + f * f4);
  }
  
  public int a(float f) {
    int i = me.c(this.s);
    int j = me.c(this.u);
    if (this.o.i(i, this.o.c / 2, j)) {
      double d = (this.C.e - this.C.b) * 0.66D;
      int k = me.c(this.t - this.L + d);
      return this.o.a(i, k, j, 0);
    } 
    return 0;
  }
  
  public float b(float f) {
    int i = me.c(this.s);
    int j = me.c(this.u);
    if (this.o.i(i, this.o.c / 2, j)) {
      double d = (this.C.e - this.C.b) * 0.66D;
      int k = me.c(this.t - this.L + d);
      return this.o.c(i, k, j);
    } 
    return 0.0F;
  }
  
  public void a(ry world) {
    this.o = world;
  }
  
  public void b(double d, double d1, double d2, float f, float f1) {
    this.p = this.s = d;
    this.q = this.t = d1;
    this.r = this.u = d2;
    this.A = this.y = f;
    this.B = this.z = f1;
    this.U = 0.0F;
    double d3 = (this.A - f);
    if (d3 < -180.0D)
      this.A += 360.0F; 
    if (d3 >= 180.0D)
      this.A -= 360.0F; 
    d(this.s, this.t, this.u);
    b(f, f1);
  }
  
  public void c(double d, double d1, double d2, float f, float f1) {
    this.R = this.p = this.s = d;
    this.S = this.q = this.t = d1 + this.L;
    this.T = this.r = this.u = d2;
    this.y = f;
    this.z = f1;
    d(this.s, this.t, this.u);
  }
  
  public float c(ia entity) {
    float f = (float)(this.s - entity.s);
    float f1 = (float)(this.t - entity.t);
    float f2 = (float)(this.u - entity.u);
    return me.c(f * f + f1 * f1 + f2 * f2);
  }
  
  public double f(double d, double d1, double d2) {
    double d3 = this.s - d;
    double d4 = this.t - d1;
    double d5 = this.u - d2;
    return d3 * d3 + d4 * d4 + d5 * d5;
  }
  
  public double g(double d, double d1, double d2) {
    double d3 = this.s - d;
    double d4 = this.t - d1;
    double d5 = this.u - d2;
    return me.a(d3 * d3 + d4 * d4 + d5 * d5);
  }
  
  public double d(ia entity) {
    double d = this.s - entity.s;
    double d1 = this.t - entity.t;
    double d2 = this.u - entity.u;
    return d * d + d1 * d1 + d2 * d2;
  }
  
  public void a(vi entityplayer) {}
  
  public void e(ia entity) {
    if (entity.m == this || entity.n == this)
      return; 
    double d = entity.s - this.s;
    double d1 = entity.u - this.u;
    double d2 = me.a(d, d1);
    if (d2 >= 0.009999999776482582D) {
      d2 = me.a(d2);
      d /= d2;
      d1 /= d2;
      double d3 = 1.0D / d2;
      if (d3 > 1.0D)
        d3 = 1.0D; 
      d *= d3;
      d1 *= d3;
      d *= 0.05000000074505806D;
      d1 *= 0.05000000074505806D;
      d *= (1.0F - this.X);
      d1 *= (1.0F - this.X);
      h(-d, 0.0D, -d1);
      entity.h(d, 0.0D, d1);
    } 
  }
  
  public void h(double d, double d1, double d2) {
    this.v += d;
    this.w += d1;
    this.x += d2;
    this.ap = true;
  }
  
  protected void G() {
    this.H = true;
  }
  
  public boolean a(pm damagesource, int i) {
    G();
    return false;
  }
  
  public boolean e_() {
    return false;
  }
  
  public boolean H() {
    return false;
  }
  
  public void b(ia entity, int i) {}
  
  public boolean a(fb vec3d) {
    double d = this.s - vec3d.a;
    double d1 = this.t - vec3d.b;
    double d2 = this.u - vec3d.c;
    double d3 = d * d + d1 * d1 + d2 * d2;
    return a(d3);
  }
  
  public boolean a(double d) {
    double d1 = this.C.c();
    d1 *= 64.0D * this.k;
    return (d < d1 * d1);
  }
  
  public String I() {
    return null;
  }
  
  public boolean c(ik nbttagcompound) {
    String s = J();
    if (this.K || s == null)
      return false; 
    nbttagcompound.a("id", s);
    d(nbttagcompound);
    return true;
  }
  
  public void d(ik nbttagcompound) {
    nbttagcompound.a("Pos", (um)a(new double[] { this.s, this.t + this.U, this.u }));
    nbttagcompound.a("Motion", (um)a(new double[] { this.v, this.w, this.x }));
    nbttagcompound.a("Rotation", (um)a(new float[] { this.y, this.z }));
    nbttagcompound.a("FallDistance", this.Q);
    nbttagcompound.a("Fire", (short)this.c);
    nbttagcompound.a("Air", (short)Z());
    nbttagcompound.a("OnGround", this.D);
    a(nbttagcompound);
  }
  
  public void e(ik nbttagcompound) {
    yi nbttaglist = nbttagcompound.l("Pos");
    yi nbttaglist1 = nbttagcompound.l("Motion");
    yi nbttaglist2 = nbttagcompound.l("Rotation");
    this.v = ((fg)nbttaglist1.a(0)).a;
    this.w = ((fg)nbttaglist1.a(1)).a;
    this.x = ((fg)nbttaglist1.a(2)).a;
    if (Math.abs(this.v) > 10.0D)
      this.v = 0.0D; 
    if (Math.abs(this.w) > 10.0D)
      this.w = 0.0D; 
    if (Math.abs(this.x) > 10.0D)
      this.x = 0.0D; 
    this.p = this.R = this.s = ((fg)nbttaglist.a(0)).a;
    this.q = this.S = this.t = ((fg)nbttaglist.a(1)).a;
    this.r = this.T = this.u = ((fg)nbttaglist.a(2)).a;
    this.A = this.y = ((vd)nbttaglist2.a(0)).a;
    this.B = this.z = ((vd)nbttaglist2.a(1)).a;
    this.Q = nbttagcompound.g("FallDistance");
    this.c = nbttagcompound.d("Fire");
    g(nbttagcompound.d("Air"));
    this.D = nbttagcompound.m("OnGround");
    d(this.s, this.t, this.u);
    b(this.y, this.z);
    b(nbttagcompound);
  }
  
  protected final String J() {
    return afw.b(this);
  }
  
  protected abstract void b(ik paramik);
  
  protected abstract void a(ik paramik);
  
  protected yi a(double[] ad) {
    yi nbttaglist = new yi();
    double[] ad1 = ad;
    int i = ad1.length;
    for (int j = 0; j < i; j++) {
      double d = ad1[j];
      nbttaglist.a((um)new fg(null, d));
    } 
    return nbttaglist;
  }
  
  protected yi a(float[] af) {
    yi nbttaglist = new yi();
    float[] af1 = af;
    int i = af1.length;
    for (int j = 0; j < i; j++) {
      float f = af1[j];
      nbttaglist.a((um)new vd(null, f));
    } 
    return nbttaglist;
  }
  
  public float i_() {
    return this.N / 2.0F;
  }
  
  public ih b(int i, int j) {
    return a(i, j, 0.0F);
  }
  
  public ih a(int i, int j, float f) {
    return a(new dk(i, j, 0), f);
  }
  
  public ih a(dk itemstack, float f) {
    ih entityitem = new ih(this.o, this.s, this.t + f, this.u, itemstack);
    entityitem.c = 10;
    this.o.a((ia)entityitem);
    return entityitem;
  }
  
  public boolean K() {
    return !this.K;
  }
  
  public boolean L() {
    for (int i = 0; i < 8; i++) {
      float f = (((i >> 0) % 2) - 0.5F) * this.M * 0.8F;
      float f1 = (((i >> 1) % 2) - 0.5F) * 0.1F;
      float f2 = (((i >> 2) % 2) - 0.5F) * this.M * 0.8F;
      int j = me.c(this.s + f);
      int k = me.c(this.t + E() + f1);
      int l = me.c(this.u + f2);
      if (this.o.g(j, k, l))
        return true; 
    } 
    return false;
  }
  
  public boolean c(vi entityplayer) {
    return false;
  }
  
  public c f(ia entity) {
    return null;
  }
  
  public void M() {
    if (this.n.K) {
      this.n = null;
      return;
    } 
    this.v = 0.0D;
    this.w = 0.0D;
    this.x = 0.0D;
    a();
    if (this.n == null)
      return; 
    this.n.N();
    this.f += (this.n.y - this.n.A);
    this.e += (this.n.z - this.n.B);
    for (; this.f >= 180.0D; this.f -= 360.0D);
    for (; this.f < -180.0D; this.f += 360.0D);
    for (; this.e >= 180.0D; this.e -= 360.0D);
    for (; this.e < -180.0D; this.e += 360.0D);
    double d = this.f * 0.5D;
    double d1 = this.e * 0.5D;
    float f = 10.0F;
    if (d > f)
      d = f; 
    if (d < -f)
      d = -f; 
    if (d1 > f)
      d1 = f; 
    if (d1 < -f)
      d1 = -f; 
    this.f -= d;
    this.e -= d1;
    this.y = (float)(this.y + d);
    this.z = (float)(this.z + d1);
  }
  
  public void N() {
    this.m.d(this.s, this.t + P() + this.m.O(), this.u);
  }
  
  public double O() {
    return this.L;
  }
  
  public double P() {
    return this.N * 0.75D;
  }
  
  public void g(ia entity) {
    this.e = 0.0D;
    this.f = 0.0D;
    if (entity == null) {
      if (this.n != null) {
        c(this.n.s, this.n.C.b + this.n.N, this.n.u, this.y, this.z);
        this.n.m = null;
      } 
      this.n = null;
      return;
    } 
    if (this.n == entity) {
      this.n.m = null;
      this.n = null;
      c(entity.s, entity.C.b + entity.N, entity.u, this.y, this.z);
      return;
    } 
    if (this.n != null)
      this.n.m = null; 
    if (entity.m != null)
      entity.m.n = null; 
    this.n = entity;
    entity.m = this;
  }
  
  public void a(double d, double d1, double d2, float f, float f1, int i) {
    d(d, d1, d2);
    b(f, f1);
    List<c> list = this.o.a(this, this.C.e(0.03125D, 0.0D, 0.03125D));
    if (list.size() > 0) {
      double d3 = 0.0D;
      for (int j = 0; j < list.size(); j++) {
        c axisalignedbb = list.get(j);
        if (axisalignedbb.e > d3)
          d3 = axisalignedbb.e; 
      } 
      d1 += d3 - this.C.b;
      d(d, d1, d2);
    } 
  }
  
  public float Q() {
    return 0.1F;
  }
  
  public fb R() {
    return null;
  }
  
  public void S() {}
  
  public void a(double d, double d1, double d2) {
    this.v = d;
    this.w = d1;
    this.x = d2;
  }
  
  public void a(byte byte0) {}
  
  public void T() {}
  
  public void U() {}
  
  public void c(int i, int j, int k) {}
  
  public boolean V() {
    return (this.c > 0 || f(0));
  }
  
  public boolean W() {
    return (this.n != null || f(2));
  }
  
  public boolean q() {
    return f(1);
  }
  
  public boolean X() {
    return f(3);
  }
  
  public void a(boolean flag) {
    a(3, flag);
  }
  
  public boolean Y() {
    return f(4);
  }
  
  public void c(boolean flag) {
    a(4, flag);
  }
  
  protected boolean f(int i) {
    return ((this.ag.a(0) & 1 << i) != 0);
  }
  
  protected void a(int i, boolean flag) {
    byte byte0 = this.ag.a(0);
    if (flag) {
      this.ag.b(0, Byte.valueOf((byte)(byte0 | 1 << i)));
    } else {
      this.ag.b(0, Byte.valueOf((byte)(byte0 & (1 << i ^ 0xFFFFFFFF))));
    } 
  }
  
  public int Z() {
    return this.ag.b(1);
  }
  
  public void g(int i) {
    this.ag.b(1, Short.valueOf((short)i));
  }
  
  public void a(su entitylightningbolt) {
    a(5);
    this.c++;
    if (this.c == 0)
      e(8); 
  }
  
  public void a(nq entityliving) {}
  
  protected boolean c(double d, double d1, double d2) {
    int i = me.c(d);
    int j = me.c(d1);
    int k = me.c(d2);
    double d3 = d - i;
    double d4 = d1 - j;
    double d5 = d2 - k;
    if (this.o.g(i, j, k)) {
      boolean flag = !this.o.g(i - 1, j, k);
      boolean flag1 = !this.o.g(i + 1, j, k);
      boolean flag2 = !this.o.g(i, j - 1, k);
      boolean flag3 = !this.o.g(i, j + 1, k);
      boolean flag4 = !this.o.g(i, j, k - 1);
      boolean flag5 = !this.o.g(i, j, k + 1);
      byte byte0 = -1;
      double d6 = 9999.0D;
      if (flag && d3 < d6) {
        d6 = d3;
        byte0 = 0;
      } 
      if (flag1 && 1.0D - d3 < d6) {
        d6 = 1.0D - d3;
        byte0 = 1;
      } 
      if (flag2 && d4 < d6) {
        d6 = d4;
        byte0 = 2;
      } 
      if (flag3 && 1.0D - d4 < d6) {
        d6 = 1.0D - d4;
        byte0 = 3;
      } 
      if (flag4 && d5 < d6) {
        d6 = d5;
        byte0 = 4;
      } 
      if (flag5 && 1.0D - d5 < d6) {
        double d7 = 1.0D - d5;
        byte0 = 5;
      } 
      float f = this.Y.nextFloat() * 0.2F + 0.1F;
      if (byte0 == 0)
        this.v = -f; 
      if (byte0 == 1)
        this.v = f; 
      if (byte0 == 2)
        this.w = -f; 
      if (byte0 == 3)
        this.w = f; 
      if (byte0 == 4)
        this.x = -f; 
      if (byte0 == 5)
        this.x = f; 
      return true;
    } 
    return false;
  }
  
  public void aa() {
    this.I = true;
  }
  
  public ia[] ab() {
    return null;
  }
  
  public boolean h(ia entity) {
    return (this == entity);
  }
}
