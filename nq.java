import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class nq extends ia {
  public int aq;
  
  public float ar;
  
  public float as;
  
  public float at;
  
  public float au;
  
  protected float av;
  
  protected float aw;
  
  protected float ax;
  
  protected float ay;
  
  protected boolean az;
  
  protected String aA;
  
  protected boolean aB;
  
  protected float aC;
  
  protected String aD;
  
  protected float aE;
  
  protected int aF;
  
  protected float aG;
  
  public boolean aH;
  
  public float aI;
  
  public float aJ;
  
  public float aK;
  
  public float aL;
  
  protected int aM;
  
  public int aN;
  
  protected int aO;
  
  private int a;
  
  public int aP;
  
  public int aQ;
  
  public float aR;
  
  public int aS;
  
  public int aT;
  
  public float aU;
  
  public float aV;
  
  protected boolean aW;
  
  protected int aX;
  
  public int aY;
  
  public float aZ;
  
  public float ba;
  
  public float bb;
  
  public float bc;
  
  protected vi bd;
  
  protected int be;
  
  public int bf;
  
  public int bg;
  
  protected HashMap bh;
  
  private boolean b;
  
  private int c;
  
  protected int bi;
  
  protected double bj;
  
  protected double bk;
  
  protected double bl;
  
  protected double bm;
  
  protected double bn;
  
  float bo;
  
  protected int bp;
  
  protected int bq;
  
  protected float br;
  
  protected float bs;
  
  protected float bt;
  
  protected boolean bu;
  
  protected float bv;
  
  protected float bw;
  
  private int d;
  
  private ia e;
  
  protected int bx;
  
  public nq(ry world) {
    super(world);
    this.aq = 20;
    this.at = 0.0F;
    this.au = 0.0F;
    this.az = true;
    this.aA = "/mob/char.png";
    this.aB = true;
    this.aC = 0.0F;
    this.aD = null;
    this.aE = 1.0F;
    this.aF = 0;
    this.aG = 0.0F;
    this.aH = false;
    this.aI = 0.1F;
    this.aJ = 0.02F;
    this.aR = 0.0F;
    this.aS = 0;
    this.aT = 0;
    this.aW = false;
    this.aY = -1;
    this.aZ = (float)(Math.random() * 0.8999999761581421D + 0.10000000149011612D);
    this.bd = null;
    this.be = 0;
    this.bf = 0;
    this.bg = 0;
    this.bh = new HashMap<Object, Object>();
    this.b = true;
    this.bo = 0.0F;
    this.bp = 0;
    this.bq = 0;
    this.bu = false;
    this.bv = 0.0F;
    this.bw = 0.7F;
    this.d = 0;
    this.bx = 0;
    this.aM = f_();
    this.l = true;
    this.as = (float)(Math.random() + 1.0D) * 0.01F;
    d(this.s, this.t, this.u);
    this.ar = (float)Math.random() * 12398.0F;
    this.y = (float)(Math.random() * 3.1415927410125732D * 2.0D);
    this.V = 0.5F;
  }
  
  protected void b() {
    this.ag.a(8, Integer.valueOf(this.c));
  }
  
  public boolean i(ia entity) {
    return (this.o.a(fb.b(this.s, this.t + E(), this.u), fb.b(entity.s, entity.t + entity.E(), entity.u)) == null);
  }
  
  public String I() {
    return this.aA;
  }
  
  public boolean e_() {
    return !this.K;
  }
  
  public boolean H() {
    return !this.K;
  }
  
  public float E() {
    return this.N * 0.85F;
  }
  
  public int p_() {
    return 80;
  }
  
  public void ac() {
    String s = e();
    if (s != null)
      this.o.a(this, s, w_(), ax()); 
  }
  
  public void w() {
    this.aK = this.aL;
    super.w();
    pf.a("mobBaseTick");
    if (this.Y.nextInt(1000) < this.a++) {
      this.a = -p_();
      ac();
    } 
    if (K() && L())
      if (!a(pm.d, 1)); 
    if (B() || this.o.I)
      y(); 
    if (K() && a(p.g) && !h() && !this.bh.containsKey(Integer.valueOf(abg.o.H))) {
      g(d(Z()));
      if (Z() == -20) {
        g(0);
        for (int i = 0; i < 8; i++) {
          float f = this.Y.nextFloat() - this.Y.nextFloat();
          float f1 = this.Y.nextFloat() - this.Y.nextFloat();
          float f2 = this.Y.nextFloat() - this.Y.nextFloat();
          this.o.a("bubble", this.s + f, this.t + f1, this.u + f2, this.v, this.w, this.x);
        } 
        a(pm.e, 2);
      } 
      y();
    } else {
      g(300);
    } 
    this.aU = this.aV;
    if (this.aT > 0)
      this.aT--; 
    if (this.aP > 0)
      this.aP--; 
    if (this.ac > 0)
      this.ac--; 
    if (this.aM <= 0)
      ad(); 
    if (this.be > 0) {
      this.be--;
    } else {
      this.bd = null;
    } 
    as();
    this.ay = this.ax;
    this.au = this.at;
    this.A = this.y;
    this.B = this.z;
    pf.b();
  }
  
  protected void ad() {
    this.aS++;
    if (this.aS == 20) {
      if (!this.o.I && (this.be > 0 || ae()) && !q_())
        for (int i = b(this.bd); i > 0; ) {
          int k = fk.b(i);
          i -= k;
          this.o.a(new fk(this.o, this.s, this.t, this.u, k));
        }  
      ap();
      v();
      for (int j = 0; j < 20; j++) {
        double d = this.Y.nextGaussian() * 0.02D;
        double d1 = this.Y.nextGaussian() * 0.02D;
        double d2 = this.Y.nextGaussian() * 0.02D;
        this.o.a("explode", this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M, this.t + (this.Y.nextFloat() * this.N), this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M, d, d1, d2);
      } 
    } 
  }
  
  protected int d(int i) {
    return i - 1;
  }
  
  protected int b(vi entityplayer) {
    return this.aX;
  }
  
  protected boolean ae() {
    return false;
  }
  
  public void af() {
    for (int i = 0; i < 20; i++) {
      double d = this.Y.nextGaussian() * 0.02D;
      double d1 = this.Y.nextGaussian() * 0.02D;
      double d2 = this.Y.nextGaussian() * 0.02D;
      double d3 = 10.0D;
      this.o.a("explode", this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M - d * d3, this.t + (this.Y.nextFloat() * this.N) - d1 * d3, this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M - d2 * d3, d, d1, d2);
    } 
  }
  
  public void M() {
    super.M();
    this.av = this.aw;
    this.aw = 0.0F;
    this.Q = 0.0F;
  }
  
  public void a(double d, double d1, double d2, float f, float f1, int i) {
    this.L = 0.0F;
    this.bj = d;
    this.bk = d1;
    this.bl = d2;
    this.bm = f;
    this.bn = f1;
    this.bi = i;
  }
  
  public void a() {
    super.a();
    if (this.bf > 0) {
      if (this.bg <= 0)
        this.bg = 60; 
      this.bg--;
      if (this.bg <= 0)
        this.bf--; 
    } 
    c();
    double d = this.s - this.p;
    double d1 = this.u - this.r;
    float f = me.a(d * d + d1 * d1);
    float f1 = this.at;
    float f2 = 0.0F;
    this.av = this.aw;
    float f3 = 0.0F;
    if (f > 0.05F) {
      f3 = 1.0F;
      f2 = f * 3.0F;
      f1 = (float)Math.atan2(d1, d) * 180.0F / 3.141593F - 90.0F;
    } 
    if (this.aL > 0.0F)
      f1 = this.y; 
    if (!this.D)
      f3 = 0.0F; 
    this.aw += (f3 - this.aw) * 0.3F;
    float f4;
    for (f4 = f1 - this.at; f4 < -180.0F; f4 += 360.0F);
    for (; f4 >= 180.0F; f4 -= 360.0F);
    this.at += f4 * 0.3F;
    float f5;
    for (f5 = this.y - this.at; f5 < -180.0F; f5 += 360.0F);
    for (; f5 >= 180.0F; f5 -= 360.0F);
    boolean flag = (f5 < -90.0F || f5 >= 90.0F);
    if (f5 < -75.0F)
      f5 = -75.0F; 
    if (f5 >= 75.0F)
      f5 = 75.0F; 
    this.at = this.y - f5;
    if (f5 * f5 > 2500.0F)
      this.at += f5 * 0.2F; 
    if (flag)
      f2 *= -1.0F; 
    for (; this.y - this.A < -180.0F; this.A -= 360.0F);
    for (; this.y - this.A >= 180.0F; this.A += 360.0F);
    for (; this.at - this.au < -180.0F; this.au -= 360.0F);
    for (; this.at - this.au >= 180.0F; this.au += 360.0F);
    for (; this.z - this.B < -180.0F; this.B -= 360.0F);
    for (; this.z - this.B >= 180.0F; this.B += 360.0F);
    this.ax += f2;
  }
  
  protected void a(float f, float f1) {
    super.a(f, f1);
  }
  
  public void a_(int i) {
    if (this.aM <= 0)
      return; 
    this.aM += i;
    if (this.aM > f_())
      this.aM = f_(); 
    this.ac = this.aq / 2;
  }
  
  public abstract int f_();
  
  public int ag() {
    return this.aM;
  }
  
  public void h(int i) {
    this.aM = i;
    if (i > f_())
      i = f_(); 
  }
  
  public boolean a(pm damagesource, int i) {
    if (this.o.I)
      return false; 
    this.bq = 0;
    if (this.aM <= 0)
      return false; 
    if (damagesource.k() && a(abg.n))
      return false; 
    this.bb = 1.5F;
    boolean flag = true;
    if (this.ac > this.aq / 2.0F) {
      if (i <= this.bp)
        return false; 
      b(damagesource, i - this.bp);
      this.bp = i;
      flag = false;
    } else {
      this.bp = i;
      this.aN = this.aM;
      this.ac = this.aq;
      b(damagesource, i);
      this.aP = this.aQ = 10;
    } 
    this.aR = 0.0F;
    ia entity = damagesource.a();
    if (entity != null)
      if (entity instanceof vi) {
        this.be = 60;
        this.bd = (vi)entity;
      } else if (entity instanceof aik) {
        aik entitywolf = (aik)entity;
        if (entitywolf.aG()) {
          this.be = 60;
          this.bd = null;
        } 
      }  
    if (flag) {
      this.o.a(this, (byte)2);
      G();
      if (entity != null) {
        double d = entity.s - this.s;
        double d1;
        for (d1 = entity.u - this.u; d * d + d1 * d1 < 1.0E-4D; d1 = (Math.random() - Math.random()) * 0.01D)
          d = (Math.random() - Math.random()) * 0.01D; 
        this.aR = (float)(Math.atan2(d1, d) * 180.0D / 3.1415927410125732D) - this.y;
        a(entity, i, d, d1);
      } else {
        this.aR = ((int)(Math.random() * 2.0D) * 180);
      } 
    } 
    if (this.aM <= 0) {
      if (flag)
        this.o.a(this, g(), w_(), ax()); 
      a(damagesource);
    } else if (flag) {
      this.o.a(this, f(), w_(), ax());
    } 
    return true;
  }
  
  private float ax() {
    if (q_())
      return (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.5F; 
    return (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F;
  }
  
  public void T() {
    this.aP = this.aQ = 10;
    this.aR = 0.0F;
  }
  
  protected int o_() {
    return 0;
  }
  
  protected void i(int i) {}
  
  protected int c(pm damagesource, int i) {
    if (!damagesource.d() || ((Boolean)mod_noBiomesX.ArmorBlocksAll.get()).booleanValue()) {
      int j = 25 - o_();
      int k = i * j + this.aO;
      i(i);
      i = k / 25;
      this.aO = k % 25;
    } 
    return i;
  }
  
  protected int d(pm damagesource, int i) {
    if (a(abg.m)) {
      int j = (b(abg.m).c() + 1) * 5;
      int k = 25 - j;
      int l = i * k + this.aO;
      i = l / 25;
      this.aO = l % 25;
    } 
    return i;
  }
  
  protected void b(pm damagesource, int i) {
    i = c(damagesource, i);
    i = d(damagesource, i);
    this.aM -= i;
  }
  
  protected float w_() {
    return 1.0F;
  }
  
  protected String e() {
    return null;
  }
  
  protected String f() {
    if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue())
      return "random.hurt"; 
    return "damage.hurtflesh";
  }
  
  protected String g() {
    if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue())
      return "random.hurt"; 
    return "damage.hurtflesh";
  }
  
  public void a(ia entity, int i, double d, double d1) {
    this.ap = true;
    float f = me.a(d * d + d1 * d1);
    float f1 = 0.4F;
    this.v /= 2.0D;
    this.w /= 2.0D;
    this.x /= 2.0D;
    this.v -= d / f * f1;
    this.w += 0.4000000059604645D;
    this.x -= d1 / f * f1;
    if (this.w > 0.4000000059604645D)
      this.w = 0.4000000059604645D; 
  }
  
  public void a(pm damagesource) {
    ia entity = damagesource.a();
    if (this.aF >= 0 && entity != null)
      entity.b(this, this.aF); 
    if (entity != null)
      entity.a(this); 
    this.aW = true;
    if (!this.o.I) {
      int i = 0;
      if (entity instanceof vi)
        i = ml.f(((vi)entity).by); 
      if (!q_())
        a((this.be > 0), i); 
    } 
    this.o.a(this, (byte)3);
  }
  
  protected void a(boolean flag, int i) {
    int j = k();
    if (j > 0) {
      int k = this.Y.nextInt(3);
      if (i > 0)
        k += this.Y.nextInt(i + 1); 
      for (int l = 0; l < k; l++)
        b(j, 1); 
    } 
  }
  
  protected int k() {
    return 0;
  }
  
  protected void c(float f) {
    super.c(f);
    int i = (int)Math.ceil((f - 3.0F));
    if (i > 0) {
      if (i > 4 && !((Boolean)mod_noBiomesX.NoFleshyLandSound.get()).booleanValue()) {
        this.o.a(this, "damage.fallbig", 1.0F, 1.0F);
      } else if (!((Boolean)mod_noBiomesX.NoFleshyLandSound.get()).booleanValue()) {
        this.o.a(this, "damage.fallsmall", 1.0F, 1.0F);
      } 
      a(pm.h, i);
      int j = this.o.a(me.c(this.s), me.c(this.t - 0.20000000298023224D - this.L), me.c(this.u));
      if (j > 0) {
        wu stepsound = (yy.k[j]).bX;
        this.o.a(this, stepsound.d(), stepsound.b() * 0.5F, stepsound.c() * 0.75F);
      } 
    } 
  }
  
  public void d(float f, float f1) {
    if (D()) {
      double d = this.t;
      a(f, f1, 0.02F);
      b(this.v, this.w, this.x);
      this.v *= 0.800000011920929D;
      this.w *= 0.800000011920929D;
      this.x *= 0.800000011920929D;
      this.w -= 0.02D;
      if (this.E && e(this.v, this.w + 0.6000000238418579D - this.t + d, this.x))
        this.w = 0.30000001192092896D; 
    } else if (F()) {
      double d1 = this.t;
      a(f, f1, 0.02F);
      b(this.v, this.w, this.x);
      this.v *= 0.5D;
      this.w *= 0.5D;
      this.x *= 0.5D;
      this.w -= 0.02D;
      if (this.E && e(this.v, this.w + 0.6000000238418579D - this.t + d1, this.x))
        this.w = 0.30000001192092896D; 
    } else {
      float f2 = 0.91F;
      if (this.D) {
        f2 = 0.5460001F;
        int i = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
        if (i > 0)
          f2 = (yy.k[i]).ca * 0.91F; 
      } 
      float f3 = 0.1627714F / f2 * f2 * f2;
      float f4 = this.D ? (this.aI * f3) : this.aJ;
      a(f, f1, f4);
      f2 = 0.91F;
      if (this.D) {
        f2 = 0.5460001F;
        int j = this.o.a(me.c(this.s), me.c(this.C.b) - 1, me.c(this.u));
        if (j > 0)
          f2 = (yy.k[j]).ca * 0.91F; 
      } 
      if (ah()) {
        float f5 = 0.15F;
        if (this.v < -f5)
          this.v = -f5; 
        if (this.v > f5)
          this.v = f5; 
        if (this.x < -f5)
          this.x = -f5; 
        if (this.x > f5)
          this.x = f5; 
        this.Q = 0.0F;
        if (this.w < -0.15D)
          this.w = -0.15D; 
        if (q() && this.w < 0.0D)
          this.w = 0.0D; 
      } 
      b(this.v, this.w, this.x);
      if (this.E && ah())
        this.w = 0.2D; 
      this.w -= 0.08D;
      this.w *= 0.9800000190734863D;
      this.v *= f2;
      this.x *= f2;
    } 
    this.ba = this.bb;
    double d2 = this.s - this.p;
    double d3 = this.u - this.r;
    float f6 = me.a(d2 * d2 + d3 * d3) * 4.0F;
    if (f6 > 1.0F)
      f6 = 1.0F; 
    this.bb += (f6 - this.bb) * 0.4F;
    this.bc += this.bb;
  }
  
  public boolean ah() {
    int i = me.c(this.s);
    int j = me.c(this.C.b);
    int k = me.c(this.u);
    return (this.o.a(i, j, k) == yy.aF.bM);
  }
  
  public void a(ik nbttagcompound) {
    nbttagcompound.a("Health", (short)this.aM);
    nbttagcompound.a("HurtTime", (short)this.aP);
    nbttagcompound.a("DeathTime", (short)this.aS);
    nbttagcompound.a("AttackTime", (short)this.aT);
    if (!this.bh.isEmpty()) {
      yi nbttaglist = new yi();
      for (Iterator<s> iterator = this.bh.values().iterator(); iterator.hasNext(); nbttaglist.a((um)nbttagcompound1)) {
        s potioneffect = iterator.next();
        ik nbttagcompound1 = new ik();
        nbttagcompound1.a("Id", (byte)potioneffect.a());
        nbttagcompound1.a("Amplifier", (byte)potioneffect.c());
        nbttagcompound1.a("Duration", potioneffect.b());
      } 
      nbttagcompound.a("ActiveEffects", (um)nbttaglist);
    } 
  }
  
  public void b(ik nbttagcompound) {
    this.aM = nbttagcompound.d("Health");
    if (!nbttagcompound.b("Health"))
      this.aM = f_(); 
    this.aP = nbttagcompound.d("HurtTime");
    this.aS = nbttagcompound.d("DeathTime");
    this.aT = nbttagcompound.d("AttackTime");
    if (nbttagcompound.b("ActiveEffects")) {
      yi nbttaglist = nbttagcompound.l("ActiveEffects");
      for (int i = 0; i < nbttaglist.c(); i++) {
        ik nbttagcompound1 = (ik)nbttaglist.a(i);
        byte byte0 = nbttagcompound1.c("Id");
        byte byte1 = nbttagcompound1.c("Amplifier");
        int j = nbttagcompound1.e("Duration");
        this.bh.put(Integer.valueOf(byte0), new s(byte0, j, byte1));
      } 
    } 
  }
  
  public boolean K() {
    return (!this.K && this.aM > 0);
  }
  
  public boolean h() {
    return false;
  }
  
  public void c() {
    if (this.d > 0)
      this.d--; 
    if (this.bi > 0) {
      double d = this.s + (this.bj - this.s) / this.bi;
      double d1 = this.t + (this.bk - this.t) / this.bi;
      double d2 = this.u + (this.bl - this.u) / this.bi;
      double d3;
      for (d3 = this.bm - this.y; d3 < -180.0D; d3 += 360.0D);
      for (; d3 >= 180.0D; d3 -= 360.0D);
      this.y = (float)(this.y + d3 / this.bi);
      this.z = (float)(this.z + (this.bn - this.z) / this.bi);
      this.bi--;
      d(d, d1, d2);
      b(this.y, this.z);
      List<c> list1 = this.o.a(this, this.C.e(0.03125D, 0.0D, 0.03125D));
      if (list1.size() > 0) {
        double d4 = 0.0D;
        for (int j = 0; j < list1.size(); j++) {
          c axisalignedbb = list1.get(j);
          if (axisalignedbb.e > d4)
            d4 = axisalignedbb.e; 
        } 
        d1 += d4 - this.C.b;
        d(d, d1, d2);
      } 
    } 
    pf.a("ai");
    if (ai()) {
      this.bu = false;
      this.br = 0.0F;
      this.bs = 0.0F;
      this.bt = 0.0F;
    } else if (!this.aH) {
      n();
    } 
    pf.b();
    boolean flag = D();
    boolean flag1 = F();
    if (this.bu) {
      if (flag) {
        this.w += 0.03999999910593033D;
      } else if (flag1) {
        this.w += 0.03999999910593033D;
      } else if (this.D && this.d == 0) {
        ak();
        this.d = 10;
      } 
    } else {
      this.d = 0;
    } 
    this.br *= 0.98F;
    this.bs *= 0.98F;
    this.bt *= 0.9F;
    float f = this.aI;
    this.aI *= aw();
    d(this.br, this.bs);
    this.aI = f;
    pf.a("push");
    List<ia> list = this.o.b(this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
    if (list != null && list.size() > 0)
      for (int i = 0; i < list.size(); i++) {
        ia entity = list.get(i);
        if (entity.H())
          entity.e(this); 
      }  
    pf.b();
  }
  
  protected boolean ai() {
    return (this.aM <= 0);
  }
  
  public boolean aj() {
    return false;
  }
  
  protected void ak() {
    this.w = 0.41999998688697815D;
    if (a(abg.j))
      this.w += ((b(abg.j).c() + 1) * 0.1F); 
    if (X()) {
      float f = this.y * 0.01745329F;
      this.v -= (me.a(f) * 0.2F);
      this.x += (me.b(f) * 0.2F);
    } 
    this.ap = true;
  }
  
  protected boolean d() {
    return true;
  }
  
  protected void al() {
    vi entityplayer = this.o.a(this, -1.0D);
    if (entityplayer != null) {
      double d = entityplayer.s - this.s;
      double d1 = entityplayer.t - this.t;
      double d2 = entityplayer.u - this.u;
      double d3 = d * d + d1 * d1 + d2 * d2;
      if (d() && d3 > 16384.0D)
        v(); 
      if (this.bq > 600 && this.Y.nextInt(800) == 0 && d3 > 1024.0D && d()) {
        v();
      } else if (d3 < 1024.0D) {
        this.bq = 0;
      } 
    } 
  }
  
  protected void n() {
    this.bq++;
    vi entityplayer = this.o.a(this, -1.0D);
    al();
    this.br = 0.0F;
    this.bs = 0.0F;
    float f = 8.0F;
    if (this.Y.nextFloat() < 0.02F) {
      vi entityplayer1 = this.o.a(this, f);
      if (entityplayer1 != null) {
        this.e = entityplayer1;
        this.bx = 10 + this.Y.nextInt(20);
      } else {
        this.bt = (this.Y.nextFloat() - 0.5F) * 20.0F;
      } 
    } 
    if (this.e != null) {
      a(this.e, 10.0F, am());
      if (this.bx-- <= 0 || this.e.K || this.e.d(this) > (f * f))
        this.e = null; 
    } else {
      if (this.Y.nextFloat() < 0.05F)
        this.bt = (this.Y.nextFloat() - 0.5F) * 20.0F; 
      this.y += this.bt;
      this.z = this.bv;
    } 
    boolean flag = D();
    boolean flag1 = F();
    if (flag || flag1)
      this.bu = (this.Y.nextFloat() < 0.8F); 
  }
  
  protected int am() {
    return 40;
  }
  
  public void a(ia entity, float f, float f1) {
    double d1, d = entity.s - this.s;
    double d2 = entity.u - this.u;
    if (entity instanceof nq) {
      nq entityliving = (nq)entity;
      d1 = this.t + E() - entityliving.t + entityliving.E();
    } else {
      d1 = (entity.C.b + entity.C.e) / 2.0D - this.t + E();
    } 
    double d3 = me.a(d * d + d2 * d2);
    float f2 = (float)(Math.atan2(d2, d) * 180.0D / 3.1415927410125732D) - 90.0F;
    float f3 = (float)-(Math.atan2(d1, d3) * 180.0D / 3.1415927410125732D);
    this.z = -b(this.z, f3, f1);
    this.y = b(this.y, f2, f);
  }
  
  public boolean an() {
    return (this.e != null);
  }
  
  public ia ao() {
    return this.e;
  }
  
  private float b(float f, float f1, float f2) {
    float f3;
    for (f3 = f1 - f; f3 < -180.0F; f3 += 360.0F);
    for (; f3 >= 180.0F; f3 -= 360.0F);
    if (f3 > f2)
      f3 = f2; 
    if (f3 < -f2)
      f3 = -f2; 
    return f + f3;
  }
  
  public void ap() {}
  
  public boolean i() {
    return (this.o.a(this.C) && this.o.a(this, this.C).size() == 0 && !this.o.b(this.C));
  }
  
  protected void z() {
    a(pm.i, 4);
  }
  
  public float d(float f) {
    float f1 = this.aL - this.aK;
    if (f1 < 0.0F)
      f1++; 
    return this.aK + f1 * f;
  }
  
  public fb e(float f) {
    if (f == 1.0F)
      return fb.b(this.s, this.t, this.u); 
    double d = this.p + (this.s - this.p) * f;
    double d1 = this.q + (this.t - this.q) * f;
    double d2 = this.r + (this.u - this.r) * f;
    return fb.b(d, d1, d2);
  }
  
  public fb R() {
    return f(1.0F);
  }
  
  public fb f(float f) {
    if (f == 1.0F) {
      float f1 = me.b(-this.y * 0.01745329F - 3.141593F);
      float f3 = me.a(-this.y * 0.01745329F - 3.141593F);
      float f5 = -me.b(-this.z * 0.01745329F);
      float f7 = me.a(-this.z * 0.01745329F);
      return fb.b((f3 * f5), f7, (f1 * f5));
    } 
    float f2 = this.B + (this.z - this.B) * f;
    float f4 = this.A + (this.y - this.A) * f;
    float f6 = me.b(-f4 * 0.01745329F - 3.141593F);
    float f8 = me.a(-f4 * 0.01745329F - 3.141593F);
    float f9 = -me.b(-f2 * 0.01745329F);
    float f10 = me.a(-f2 * 0.01745329F);
    return fb.b((f8 * f9), f10, (f6 * f9));
  }
  
  public float aq() {
    return 1.0F;
  }
  
  public gv a(double d, float f) {
    fb vec3d = e(f);
    fb vec3d1 = f(f);
    fb vec3d2 = vec3d.c(vec3d1.a * d, vec3d1.b * d, vec3d1.c * d);
    return this.o.a(vec3d, vec3d2);
  }
  
  public int g_() {
    return 4;
  }
  
  public dk s() {
    return null;
  }
  
  public void a(byte byte0) {
    if (byte0 == 2) {
      this.bb = 1.5F;
      this.ac = this.aq;
      this.aP = this.aQ = 10;
      this.aR = 0.0F;
      this.o.a(this, f(), w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
      a(pm.j, 0);
    } else if (byte0 == 3) {
      this.o.a(this, g(), w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
      this.aM = 0;
      a(pm.j);
    } else {
      super.a(byte0);
    } 
  }
  
  public boolean ar() {
    return false;
  }
  
  public int a(dk itemstack, int i) {
    return itemstack.b();
  }
  
  protected void as() {
    Iterator<Integer> iterator = this.bh.keySet().iterator();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      s potioneffect = (s)this.bh.get(integer);
      if (!potioneffect.a(this) && !this.o.I) {
        iterator.remove();
        e(potioneffect);
      } 
    } 
    if (this.b) {
      if (!this.o.I)
        if (!this.bh.isEmpty()) {
          int i = pk.a(this.bh.values());
          this.ag.b(8, Integer.valueOf(i));
        } else {
          this.ag.b(8, Integer.valueOf(0));
        }  
      this.b = false;
    } 
    if (this.Y.nextBoolean()) {
      int j = this.ag.c(8);
      if (j > 0) {
        double d = (j >> 16 & 0xFF) / 255.0D;
        double d1 = (j >> 8 & 0xFF) / 255.0D;
        double d2 = (j >> 0 & 0xFF) / 255.0D;
        this.o.a("mobSpell", this.s + (this.Y.nextDouble() - 0.5D) * this.M, this.t + this.Y.nextDouble() * this.N - this.L, this.u + (this.Y.nextDouble() - 0.5D) * this.M, d, d1, d2);
      } 
    } 
  }
  
  public void at() {
    Iterator<Integer> iterator = this.bh.keySet().iterator();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      s potioneffect = (s)this.bh.get(integer);
      if (!this.o.I) {
        iterator.remove();
        e(potioneffect);
      } 
    } 
  }
  
  public Collection au() {
    return this.bh.values();
  }
  
  public boolean a(abg potion) {
    return this.bh.containsKey(Integer.valueOf(potion.H));
  }
  
  public s b(abg potion) {
    return (s)this.bh.get(Integer.valueOf(potion.H));
  }
  
  public void a(s potioneffect) {
    if (!b(potioneffect))
      return; 
    if (this.bh.containsKey(Integer.valueOf(potioneffect.a()))) {
      ((s)this.bh.get(Integer.valueOf(potioneffect.a()))).a(potioneffect);
      d((s)this.bh.get(Integer.valueOf(potioneffect.a())));
    } else {
      this.bh.put(Integer.valueOf(potioneffect.a()), potioneffect);
      c(potioneffect);
    } 
  }
  
  public boolean b(s potioneffect) {
    if (r_() == el.b) {
      int i = potioneffect.a();
      if (i == abg.l.H || i == abg.u.H)
        return false; 
    } 
    return true;
  }
  
  public boolean av() {
    return (r_() == el.b);
  }
  
  public void j(int i) {
    this.bh.remove(Integer.valueOf(i));
  }
  
  protected void c(s potioneffect) {
    this.b = true;
  }
  
  protected void d(s potioneffect) {
    this.b = true;
  }
  
  protected void e(s potioneffect) {
    this.b = true;
  }
  
  protected float aw() {
    float f = 1.0F;
    if (a(abg.c))
      f *= 1.0F + 0.2F * (b(abg.c).c() + 1); 
    if (a(abg.d))
      f *= 1.0F - 0.15F * (b(abg.d).c() + 1); 
    return f;
  }
  
  public void i(double d, double d1, double d2) {
    c(d, d1, d2, this.y, this.z);
  }
  
  public boolean q_() {
    return false;
  }
  
  public el r_() {
    return el.a;
  }
  
  public void b(dk itemstack) {
    if (!((Boolean)mod_noBiomesX.ToolBreakAnim.get()).booleanValue())
      return; 
    this.o.a(this, "random.break", 0.8F, 0.8F + this.o.w.nextFloat() * 0.4F);
    for (int i = 0; i < 5; i++) {
      fb vec3d = fb.b((this.Y.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
      vec3d.a(-this.z * 3.141593F / 180.0F);
      vec3d.b(-this.y * 3.141593F / 180.0F);
      fb vec3d1 = fb.b((this.Y.nextFloat() - 0.5D) * 0.3D, -this.Y.nextFloat() * 0.6D - 0.3D, 0.6D);
      vec3d1.a(-this.z * 3.141593F / 180.0F);
      vec3d1.b(-this.y * 3.141593F / 180.0F);
      vec3d1 = vec3d1.c(this.s, this.t + E(), this.u);
      this.o.a("iconcrack_" + (itemstack.a()).bM, vec3d1.a, vec3d1.b, vec3d1.c, vec3d.a, vec3d.b + 0.05D, vec3d.c);
    } 
  }
}
