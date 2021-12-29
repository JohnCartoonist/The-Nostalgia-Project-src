import java.util.Iterator;
import java.util.List;

public abstract class vi extends nq {
  public x by;
  
  public pj bz;
  
  public pj bA;
  
  protected eq bB;
  
  protected int bC;
  
  public byte bD;
  
  public int bE;
  
  public float bF;
  
  public float bG;
  
  public boolean bH;
  
  public int bI;
  
  public String bJ;
  
  public int bK;
  
  public String bL;
  
  public int bM;
  
  public double bN;
  
  public double bO;
  
  public double bP;
  
  public double bQ;
  
  public double bR;
  
  public double bS;
  
  protected boolean bT;
  
  public dh bU;
  
  private int a;
  
  public float bV;
  
  public float bW;
  
  public float bX;
  
  private dh b;
  
  private dh c;
  
  public int bY;
  
  protected boolean bZ;
  
  public float ca;
  
  public float cb;
  
  public wq cc;
  
  public int cd;
  
  public int ce;
  
  public float cf;
  
  private dk d;
  
  private int e;
  
  protected float cg;
  
  protected float ch;
  
  public ael ci;
  
  public int damageRemainder = 0;
  
  public vi(ry world) {
    super(world);
    this.by = new x(this);
    this.bB = new eq();
    this.bC = 0;
    this.bD = 0;
    this.bE = 0;
    this.bH = false;
    this.bI = 0;
    this.bM = 0;
    this.bY = 20;
    this.bZ = false;
    this.cc = new wq();
    this.cg = 0.1F;
    this.ch = 0.02F;
    this.ci = null;
    this.bz = (pj)new gd(this.by, !world.I);
    this.bA = this.bz;
    this.L = 1.62F;
    dh chunkcoordinates = world.v();
    c(chunkcoordinates.a + 0.5D, (chunkcoordinates.b + 1), chunkcoordinates.c + 0.5D, 0.0F, 0.0F);
    this.aD = "humanoid";
    this.aC = 180.0F;
    this.aa = 20;
    this.aA = "/mob/char.png";
  }
  
  public int f_() {
    return 20;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, Byte.valueOf((byte)0));
    this.ag.a(17, Byte.valueOf((byte)0));
  }
  
  public dk ax() {
    return this.d;
  }
  
  public int ay() {
    return this.e;
  }
  
  public boolean az() {
    return (this.d != null);
  }
  
  public int aA() {
    if (az())
      return this.d.l() - this.e; 
    return 0;
  }
  
  public void aB() {
    if (this.d != null)
      this.d.a(this.o, this, this.e); 
    aC();
  }
  
  public void aC() {
    this.d = null;
    this.e = 0;
    if (!this.o.I)
      c(false); 
  }
  
  public boolean aj() {
    return (az() && acy.d[this.d.c].c(this.d) == ps.d);
  }
  
  public void a() {
    if (this.d != null) {
      dk itemstack = this.by.a();
      if (itemstack != this.d) {
        aC();
      } else {
        if (this.e <= 25 && this.e % 4 == 0)
          b(itemstack, 5); 
        if (--this.e == 0 && !this.o.I)
          aD(); 
      } 
    } 
    if (this.bM > 0)
      this.bM--; 
    if (ar()) {
      this.a++;
      if (this.a > 100)
        this.a = 100; 
      if (!this.o.I)
        if (!aR()) {
          a(true, true, false);
        } else if (this.o.l()) {
          a(false, true, true);
        }  
    } else if (this.a > 0) {
      this.a++;
      if (this.a >= 110)
        this.a = 0; 
    } 
    super.a();
    if (!this.o.I && this.bA != null && !this.bA.a(this)) {
      m();
      this.bA = this.bz;
    } 
    if (this.cc.b)
      for (int i = 0; i < 8; i++); 
    if (V() && this.cc.a)
      y(); 
    this.bN = this.bQ;
    this.bO = this.bR;
    this.bP = this.bS;
    double d = this.s - this.bQ;
    double d1 = this.t - this.bR;
    double d2 = this.u - this.bS;
    double d3 = 10.0D;
    if (d > d3)
      this.bN = this.bQ = this.s; 
    if (d2 > d3)
      this.bP = this.bS = this.u; 
    if (d1 > d3)
      this.bO = this.bR = this.t; 
    if (d < -d3)
      this.bN = this.bQ = this.s; 
    if (d2 < -d3)
      this.bP = this.bS = this.u; 
    if (d1 < -d3)
      this.bO = this.bR = this.t; 
    this.bQ += d * 0.25D;
    this.bS += d2 * 0.25D;
    this.bR += d1 * 0.25D;
    a(ny.k, 1);
    if (this.n == null)
      this.c = null; 
    if (!this.o.I)
      this.bB.a(this); 
  }
  
  protected void b(dk itemstack, int i) {
    if (itemstack.m() == ps.c)
      this.o.a(this, "random.drink", 0.5F, this.o.w.nextFloat() * 0.1F + 0.9F); 
    if (itemstack.m() == ps.b) {
      for (int j = 0; j < i; j++) {
        fb vec3d = fb.b((this.Y.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
        vec3d.a(-this.z * 3.141593F / 180.0F);
        vec3d.b(-this.y * 3.141593F / 180.0F);
        fb vec3d1 = fb.b((this.Y.nextFloat() - 0.5D) * 0.3D, -this.Y.nextFloat() * 0.6D - 0.3D, 0.6D);
        vec3d1.a(-this.z * 3.141593F / 180.0F);
        vec3d1.b(-this.y * 3.141593F / 180.0F);
        vec3d1 = vec3d1.c(this.s, this.t + E(), this.u);
        this.o.a("iconcrack_" + (itemstack.a()).bM, vec3d1.a, vec3d1.b, vec3d1.c, vec3d.a, vec3d.b + 0.05D, vec3d.c);
      } 
      this.o.a(this, "random.eat", 0.5F + 0.5F * this.Y.nextInt(2), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F);
    } 
  }
  
  protected void aD() {
    if (this.d != null) {
      b(this.d, 16);
      int i = this.d.a;
      dk itemstack = this.d.b(this.o, this);
      if (itemstack != this.d || (itemstack != null && itemstack.a != i)) {
        this.by.a[this.by.c] = itemstack;
        if (itemstack.a == 0)
          this.by.a[this.by.c] = null; 
      } 
      aC();
    } 
  }
  
  public void a(byte byte0) {
    if (byte0 == 9) {
      aD();
    } else {
      super.a(byte0);
    } 
  }
  
  protected boolean ai() {
    return (ag() <= 0 || ar());
  }
  
  protected void m() {
    this.bA = this.bz;
  }
  
  public void U() {
    this.bL = "http://s3.amazonaws.com/MinecraftCloaks/" + this.bJ + ".png";
    this.ae = this.bL;
  }
  
  public void M() {
    double d = this.s;
    double d1 = this.t;
    double d2 = this.u;
    super.M();
    this.bF = this.bG;
    this.bG = 0.0F;
    k(this.s - d, this.t - d1, this.u - d2);
  }
  
  public void u() {
    this.L = 1.62F;
    a(0.6F, 1.8F);
    super.u();
    h(f_());
    this.aS = 0;
  }
  
  private int aQ() {
    if (a(abg.e))
      return 6 - (1 + b(abg.e).c()) * 1; 
    if (a(abg.f))
      return 6 + (1 + b(abg.f).c()) * 2; 
    return 6;
  }
  
  protected void n() {
    int i = aQ();
    if (this.bH) {
      this.bI++;
      if (this.bI >= i) {
        this.bI = 0;
        this.bH = false;
      } 
    } else {
      this.bI = 0;
    } 
    this.aL = this.bI / i;
  }
  
  public void c() {
    if (this.bC > 0)
      this.bC--; 
    if (this.o.v == 0 && ag() < f_() && this.Z % 20 * 12 == 0)
      a_(1); 
    this.by.b();
    this.bF = this.bG;
    super.c();
    this.aI = this.cg;
    this.aJ = this.ch;
    if (X()) {
      this.aI = (float)(this.aI + this.cg * 0.3D);
      this.aJ = (float)(this.aJ + this.ch * 0.3D);
    } 
    float f = me.a(this.v * this.v + this.x * this.x);
    float f1 = (float)Math.atan(-this.w * 0.20000000298023224D) * 15.0F;
    if (f > 0.1F)
      f = 0.1F; 
    if (!this.D || ag() <= 0)
      f = 0.0F; 
    if (this.D || ag() <= 0)
      f1 = 0.0F; 
    this.bG += (f - this.bG) * 0.4F;
    this.aV += (f1 - this.aV) * 0.8F;
    if (ag() > 0) {
      List<ia> list = this.o.b(this, this.C.b(1.0D, 0.0D, 1.0D));
      if (list != null)
        for (int i = 0; i < list.size(); i++) {
          ia entity = list.get(i);
          if (!entity.K)
            l(entity); 
        }  
    } 
  }
  
  private void l(ia entity) {
    entity.a(this);
  }
  
  public int aE() {
    return this.bE;
  }
  
  public void a(pm damagesource) {
    super.a(damagesource);
    a(0.2F, 0.2F);
    d(this.s, this.t, this.u);
    this.w = 0.10000000149011612D;
    if (this.bJ.equals("Notch"))
      a(new dk(acy.i, 1), true); 
    this.by.g();
    if (damagesource != null) {
      this.v = (-me.b((this.aR + this.y) * 3.141593F / 180.0F) * 0.1F);
      this.x = (-me.a((this.aR + this.y) * 3.141593F / 180.0F) * 0.1F);
    } else {
      this.v = this.x = 0.0D;
    } 
    this.L = 0.1F;
    a(ny.y, 1);
  }
  
  public void b(ia entity, int i) {
    this.bE += i;
    if (entity instanceof vi) {
      a(ny.A, 1);
    } else {
      a(ny.z, 1);
    } 
  }
  
  protected int d(int i) {
    int j = ml.a(this.by);
    if (j > 0 && this.Y.nextInt(j + 1) > 0)
      return i; 
    return super.d(i);
  }
  
  public void l_() {
    a(this.by.a(this.by.c, 1), false);
  }
  
  public void a(dk itemstack) {
    a(itemstack, false);
  }
  
  public void a(dk itemstack, boolean flag) {
    if (itemstack == null)
      return; 
    ih entityitem = new ih(this.o, this.s, this.t - 0.30000001192092896D + E(), this.u, itemstack);
    entityitem.c = 40;
    float f = 0.1F;
    if (flag) {
      float f2 = this.Y.nextFloat() * 0.5F;
      float f4 = this.Y.nextFloat() * 3.141593F * 2.0F;
      entityitem.v = (-me.a(f4) * f2);
      entityitem.x = (me.b(f4) * f2);
      entityitem.w = 0.20000000298023224D;
    } else {
      float f1 = 0.3F;
      entityitem.v = (-me.a(this.y / 180.0F * 3.141593F) * me.b(this.z / 180.0F * 3.141593F) * f1);
      entityitem.x = (me.b(this.y / 180.0F * 3.141593F) * me.b(this.z / 180.0F * 3.141593F) * f1);
      entityitem.w = (-me.a(this.z / 180.0F * 3.141593F) * f1 + 0.1F);
      f1 = 0.02F;
      float f3 = this.Y.nextFloat() * 3.141593F * 2.0F;
      f1 *= this.Y.nextFloat();
      entityitem.v += Math.cos(f3) * f1;
      entityitem.w += ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
      entityitem.x += Math.sin(f3) * f1;
    } 
    a(entityitem);
    a(ny.v, 1);
  }
  
  protected void a(ih entityitem) {
    this.o.a((ia)entityitem);
  }
  
  public float a(yy block) {
    float f = this.by.a(block);
    float f1 = f;
    int i = ml.b(this.by);
    if (i > 0 && this.by.b(block))
      f1 += (i * i + 1); 
    if (a(abg.e))
      f1 *= 1.0F + (b(abg.e).c() + 1) * 0.2F; 
    if (a(abg.f))
      f1 *= 1.0F - (b(abg.f).c() + 1) * 0.2F; 
    if (a(p.g) && !ml.g(this.by))
      f1 /= 5.0F; 
    if (!this.D)
      f1 /= 5.0F; 
    return f1;
  }
  
  public boolean b(yy block) {
    return this.by.b(block);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    yi nbttaglist = nbttagcompound.l("Inventory");
    this.by.b(nbttaglist);
    this.bK = nbttagcompound.e("Dimension");
    this.bT = nbttagcompound.m("Sleeping");
    this.a = nbttagcompound.d("SleepTimer");
    this.cf = nbttagcompound.g("XpP");
    this.cd = nbttagcompound.e("XpLevel");
    this.ce = nbttagcompound.e("XpTotal");
    if (this.bT) {
      this.bU = new dh(me.c(this.s), me.c(this.t), me.c(this.u));
      a(true, true, false);
    } 
    if (nbttagcompound.b("SpawnX") && nbttagcompound.b("SpawnY") && nbttagcompound.b("SpawnZ"))
      this.b = new dh(nbttagcompound.e("SpawnX"), nbttagcompound.e("SpawnY"), nbttagcompound.e("SpawnZ")); 
    this.bB.a(nbttagcompound);
    this.cc.b(nbttagcompound);
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Inventory", (um)this.by.a(new yi()));
    nbttagcompound.a("Dimension", this.bK);
    nbttagcompound.a("Sleeping", this.bT);
    nbttagcompound.a("SleepTimer", (short)this.a);
    nbttagcompound.a("XpP", this.cf);
    nbttagcompound.a("XpLevel", this.cd);
    nbttagcompound.a("XpTotal", this.ce);
    if (this.b != null) {
      nbttagcompound.a("SpawnX", this.b.a);
      nbttagcompound.a("SpawnY", this.b.b);
      nbttagcompound.a("SpawnZ", this.b.c);
    } 
    this.bB.b(nbttagcompound);
    this.cc.a(nbttagcompound);
  }
  
  public void a(de iinventory) {}
  
  public void b(int i, int j, int k) {}
  
  public void a(int i, int j, int k) {}
  
  public void a(ia entity, int i) {}
  
  public float E() {
    return 0.12F;
  }
  
  protected void aF() {
    this.L = 1.62F;
  }
  
  public boolean a(pm damagesource, int i) {
    if (this.cc.a && !damagesource.f())
      return false; 
    this.bq = 0;
    if (ag() <= 0)
      return false; 
    if (ar() && !this.o.I)
      a(true, true, false); 
    ia entity = damagesource.a();
    if (entity instanceof zo || entity instanceof ro) {
      if (this.o.v == 0)
        i = 0; 
      if (this.o.v == 1)
        i = i / 2 + 1; 
      if (this.o.v == 3)
        i = i * 3 / 2; 
    } 
    if (i == 0)
      return false; 
    ia entity1 = entity;
    if (entity1 instanceof ro && ((ro)entity1).c != null)
      entity1 = ((ro)entity1).c; 
    if (entity1 instanceof nq)
      a((nq)entity1, false); 
    a(ny.x, i);
    return super.a(damagesource, i);
  }
  
  protected int d(pm damagesource, int i) {
    int j = super.d(damagesource, i);
    if (j <= 0)
      return 0; 
    int k = ml.a(this.by, damagesource);
    if (k > 20)
      k = 20; 
    if (k > 0 && k <= 20) {
      int l = 25 - k;
      int i1 = j * l + this.aO;
      j = i1 / 25;
      this.aO = i1 % 25;
    } 
    return j;
  }
  
  protected boolean aG() {
    return false;
  }
  
  protected void a(nq entityliving, boolean flag) {
    if (entityliving instanceof abh || entityliving instanceof is)
      return; 
    if (entityliving instanceof aik) {
      aik entitywolf = (aik)entityliving;
      if (entitywolf.aG() && this.bJ.equals(entitywolf.aD()))
        return; 
    } 
    if (entityliving instanceof vi && !aG())
      return; 
    List list = this.o.a(aik.class, c.b(this.s, this.t, this.u, this.s + 1.0D, this.t + 1.0D, this.u + 1.0D).b(16.0D, 4.0D, 16.0D));
    Iterator<ia> iterator = list.iterator();
    while (iterator.hasNext()) {
      ia entity = iterator.next();
      aik entitywolf1 = (aik)entity;
      if (entitywolf1.aG() && entitywolf1.aC() == null && this.bJ.equals(entitywolf1.aD()) && (!flag || !entitywolf1.aE())) {
        entitywolf1.d(false);
        entitywolf1.a(entityliving);
      } 
    } 
  }
  
  protected void i(int i) {
    this.by.f(i);
  }
  
  protected int o_() {
    return this.by.f();
  }
  
  protected void b(pm damagesource, int i) {
    if (!damagesource.d() && aj())
      i = 1 + i >> 1; 
    if (!((Boolean)mod_noBiomesX.ArmorDurabilities.get()).booleanValue()) {
      i = c(damagesource, i);
      i = d(damagesource, i);
    } else if (!damagesource.d() || ((Boolean)mod_noBiomesX.ArmorBlocksAll.get()).booleanValue()) {
      int j = 25 - this.by.f();
      int k = i * j + this.damageRemainder;
      this.by.f(i);
      i = k / 25;
      this.damageRemainder = k % 25;
    } 
    g(damagesource.e());
    super.b(damagesource, i);
  }
  
  public void a(oe tileentityfurnace) {}
  
  public void a(bp tileentitydispenser) {}
  
  public void a(u tileentitysign) {}
  
  public void a(tt tileentitybrewingstand) {}
  
  public void j(ia entity) {
    if (entity.c(this))
      return; 
    dk itemstack = aH();
    if (itemstack != null && entity instanceof nq) {
      itemstack.a((nq)entity);
      if (itemstack.a <= 0) {
        itemstack.a(this);
        aI();
      } 
    } 
  }
  
  public dk aH() {
    return this.by.a();
  }
  
  public void aI() {
    this.by.a(this.by.c, (dk)null);
  }
  
  public double O() {
    return (this.L - 0.5F);
  }
  
  public void m_() {
    if (!this.bH || this.bI >= aQ() / 2 || this.bI < 0) {
      this.bI = -1;
      this.bH = true;
    } 
  }
  
  public void k(ia entity) {
    int i = this.by.a(entity);
    if (a(abg.g))
      i += 3 << b(abg.g).c(); 
    if (a(abg.t))
      i -= 2 << b(abg.t).c(); 
    int j = 0;
    int k = 0;
    if (entity instanceof nq) {
      k = ml.a(this.by, (nq)entity);
      j += ml.b(this.by, (nq)entity);
    } 
    if (X())
      j++; 
    if (i > 0 || k > 0) {
      boolean flag = false;
      boolean showCritEffect = false;
      if (((Integer)mod_noBiomesX.CriticalStyle.get()).intValue() >= 2) {
        flag = (this.Q > 0.0F && !this.D && !ah() && !D() && !a(abg.q) && this.n == null && entity instanceof nq);
      } else if (((Integer)mod_noBiomesX.CriticalStyle.get()).intValue() == 1) {
        flag = (this.w < 0.0D);
      } 
      if (flag)
        switch (((Integer)mod_noBiomesX.CriticalStyle.get()).intValue()) {
          case 1:
          case 2:
            i++;
            break;
          case 3:
            i = i * 3 / 2 + 1;
            showCritEffect = true;
            break;
          default:
            i += this.Y.nextInt(i / 2 + 2);
            showCritEffect = true;
            break;
        }  
      i += k;
      boolean flag1 = entity.a(pm.a(this), i);
      if (flag1) {
        if (j > 0) {
          entity.h((-me.a(this.y * 3.141593F / 180.0F) * j * 0.5F), 0.1D, (me.b(this.y * 3.141593F / 180.0F) * j * 0.5F));
          this.v *= 0.6D;
          this.x *= 0.6D;
          a(false);
        } 
        if (showCritEffect)
          a(entity); 
        if (k > 0)
          b(entity); 
        if (i >= 18)
          a((px)ut.E); 
      } 
      dk itemstack = aH();
      if (itemstack != null && entity instanceof nq) {
        itemstack.a((nq)entity, this);
        if (itemstack.a <= 0) {
          itemstack.a(this);
          aI();
        } 
      } 
      if (entity instanceof nq) {
        if (entity.K())
          a((nq)entity, true); 
        a(ny.w, i);
        int l = ml.c(this.by, (nq)entity);
        if (l > 0)
          entity.e(l * 4); 
      } 
      g(0.3F);
    } 
  }
  
  public void a(ia entity) {}
  
  public void b(ia entity) {}
  
  public void n_() {}
  
  public abstract void r();
  
  public void c(dk itemstack) {}
  
  public void v() {
    super.v();
    this.bz.b(this);
    if (this.bA != null)
      this.bA.b(this); 
  }
  
  public boolean L() {
    return (!this.bT && super.L());
  }
  
  public qy d(int i, int j, int k) {
    if (!this.o.I) {
      if (ar() || !K())
        return qy.e; 
      if (this.o.y.c)
        return qy.b; 
      if (this.o.l())
        return qy.c; 
      if (Math.abs(this.s - i) > 3.0D || Math.abs(this.t - j) > 2.0D || Math.abs(this.u - k) > 3.0D)
        return qy.d; 
      double d = 8.0D;
      double d1 = 5.0D;
      List list = this.o.a(zo.class, c.b(i - d, j - d1, k - d, i + d, j + d1, k + d));
      if (!list.isEmpty())
        return qy.f; 
    } 
    a(0.2F, 0.2F);
    this.L = 0.2F;
    if (this.o.i(i, j, k)) {
      int l = this.o.d(i, j, k);
      int i1 = aab.e(l);
      float f = 0.5F;
      float f1 = 0.5F;
      switch (i1) {
        case 0:
          f1 = 0.9F;
          break;
        case 2:
          f1 = 0.1F;
          break;
        case 1:
          f = 0.1F;
          break;
        case 3:
          f = 0.9F;
          break;
      } 
      b(i1);
      d((i + f), (j + 0.9375F), (k + f1));
    } else {
      d((i + 0.5F), (j + 0.9375F), (k + 0.5F));
    } 
    this.bT = true;
    this.a = 0;
    this.bU = new dh(i, j, k);
    this.v = this.x = this.w = 0.0D;
    if (!this.o.I)
      this.o.A(); 
    return qy.a;
  }
  
  private void b(int i) {
    this.bV = 0.0F;
    this.bX = 0.0F;
    switch (i) {
      case 0:
        this.bX = -1.8F;
        break;
      case 2:
        this.bX = 1.8F;
        break;
      case 1:
        this.bV = 1.8F;
        break;
      case 3:
        this.bV = -1.8F;
        break;
    } 
  }
  
  public void a(boolean flag, boolean flag1, boolean flag2) {
    a(0.6F, 1.8F);
    aF();
    dh chunkcoordinates = this.bU;
    dh chunkcoordinates1 = this.bU;
    if (chunkcoordinates != null && this.o.a(chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c) == yy.S.bM) {
      aab.a(this.o, chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c, false);
      dh chunkcoordinates2 = aab.f(this.o, chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c, 0);
      if (chunkcoordinates2 == null)
        chunkcoordinates2 = new dh(chunkcoordinates.a, chunkcoordinates.b + 1, chunkcoordinates.c); 
      d((chunkcoordinates2.a + 0.5F), (chunkcoordinates2.b + this.L + 0.1F), (chunkcoordinates2.c + 0.5F));
    } 
    this.bT = false;
    if (!this.o.I && flag1)
      this.o.A(); 
    if (flag) {
      this.a = 0;
    } else {
      this.a = 100;
    } 
    if (flag2)
      a(this.bU); 
  }
  
  private boolean aR() {
    return (this.o.a(this.bU.a, this.bU.b, this.bU.c) == yy.S.bM);
  }
  
  public static dh a(ry world, dh chunkcoordinates) {
    ej ichunkprovider = world.x();
    ichunkprovider.a(chunkcoordinates.a - 3 >> 4, chunkcoordinates.c - 3 >> 4);
    ichunkprovider.a(chunkcoordinates.a + 3 >> 4, chunkcoordinates.c - 3 >> 4);
    ichunkprovider.a(chunkcoordinates.a - 3 >> 4, chunkcoordinates.c + 3 >> 4);
    ichunkprovider.a(chunkcoordinates.a + 3 >> 4, chunkcoordinates.c + 3 >> 4);
    if (world.a(chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c) != yy.S.bM)
      return null; 
    dh chunkcoordinates1 = aab.f(world, chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c, 0);
    return chunkcoordinates1;
  }
  
  public float aJ() {
    if (this.bU != null) {
      int i = this.o.d(this.bU.a, this.bU.b, this.bU.c);
      int j = aab.e(i);
      switch (j) {
        case 0:
          return 90.0F;
        case 1:
          return 0.0F;
        case 2:
          return 270.0F;
        case 3:
          return 180.0F;
      } 
    } 
    return 0.0F;
  }
  
  public boolean ar() {
    return this.bT;
  }
  
  public boolean aK() {
    return (this.bT && this.a >= 100);
  }
  
  public int aL() {
    return this.a;
  }
  
  public void b(String s) {}
  
  public dh aM() {
    return this.b;
  }
  
  public void a(dh chunkcoordinates) {
    if (chunkcoordinates != null) {
      this.b = new dh(chunkcoordinates);
    } else {
      this.b = null;
    } 
  }
  
  public void a(px statbase) {
    a(statbase, 1);
  }
  
  public void a(px statbase, int i) {}
  
  protected void ak() {
    super.ak();
    a(ny.u, 1);
    if (X()) {
      g(0.8F);
    } else {
      g(0.2F);
    } 
  }
  
  public void d(float f, float f1) {
    double d = this.s;
    double d1 = this.t;
    double d2 = this.u;
    if (this.cc.b) {
      double d3 = this.w;
      float f2 = this.aJ;
      this.aJ = 0.05F;
      super.d(f, f1);
      this.w = d3 * 0.6D;
      this.aJ = f2;
    } else {
      super.d(f, f1);
    } 
    j(this.s - d, this.t - d1, this.u - d2);
  }
  
  public void j(double d, double d1, double d2) {
    if (this.n != null)
      return; 
    if (a(p.g)) {
      int i = Math.round(me.a(d * d + d1 * d1 + d2 * d2) * 100.0F);
      if (i > 0) {
        a(ny.q, i);
        g(0.015F * i * 0.01F);
      } 
    } else if (D()) {
      int j = Math.round(me.a(d * d + d2 * d2) * 100.0F);
      if (j > 0) {
        a(ny.m, j);
        g(0.015F * j * 0.01F);
      } 
    } else if (ah()) {
      if (d1 > 0.0D)
        a(ny.o, (int)Math.round(d1 * 100.0D)); 
    } else if (this.D) {
      int k = Math.round(me.a(d * d + d2 * d2) * 100.0F);
      if (k > 0) {
        a(ny.l, k);
        if (X()) {
          g(0.09999999F * k * 0.01F);
        } else {
          g(0.01F * k * 0.01F);
        } 
      } 
    } else {
      int l = Math.round(me.a(d * d + d2 * d2) * 100.0F);
      if (l > 25)
        a(ny.p, l); 
    } 
  }
  
  private void k(double d, double d1, double d2) {
    if (this.n != null) {
      int i = Math.round(me.a(d * d + d1 * d1 + d2 * d2) * 100.0F);
      if (i > 0)
        if (this.n instanceof vm) {
          a(ny.r, i);
          if (this.c == null) {
            this.c = new dh(me.c(this.s), me.c(this.t), me.c(this.u));
          } else if (this.c.a(me.c(this.s), me.c(this.t), me.c(this.u)) >= 1000.0D) {
            a((px)ut.q, 1);
          } 
        } else if (this.n instanceof no) {
          a(ny.s, i);
        } else if (this.n instanceof fd) {
          a(ny.t, i);
        }  
    } 
  }
  
  protected void c(float f) {
    if (this.cc.c)
      return; 
    if (f >= 2.0F)
      a(ny.n, (int)Math.round(f * 100.0D)); 
    super.c(f);
  }
  
  public void a(nq entityliving) {
    if (entityliving instanceof zo)
      a((px)ut.s); 
  }
  
  public int a(dk itemstack, int i) {
    int j = super.a(itemstack, i);
    if (itemstack.c == acy.aQ.bM && this.ci != null) {
      j = itemstack.b() + 16;
    } else {
      if (itemstack.c == acy.br.bM) {
        if (i == 1)
          return itemstack.b(); 
        return 141;
      } 
      if (this.d != null && itemstack.c == acy.j.bM) {
        int k = itemstack.l() - this.e;
        if (k >= 18)
          return 133; 
        if (k > 13)
          return 117; 
        if (k > 0)
          return 101; 
      } 
    } 
    return j;
  }
  
  public void S() {
    if (this.bY > 0) {
      this.bY = 10;
      return;
    } 
    this.bZ = true;
  }
  
  public void k(int i) {
    this.bE += i;
    this.cf += i / aN();
    this.ce += i;
    while (this.cf >= 1.0F) {
      this.cf--;
      aS();
    } 
  }
  
  public void l(int i) {
    this.cd -= i;
    if (this.cd < 0)
      this.cd = 0; 
  }
  
  public int aN() {
    return 7 + (this.cd * 7 >> 1);
  }
  
  private void aS() {
    this.cd++;
  }
  
  public void g(float f) {
    if (this.cc.a)
      return; 
    if (!this.o.I)
      this.bB.a(f); 
  }
  
  public eq aO() {
    return this.bB;
  }
  
  public boolean b(boolean flag) {
    return ((flag || this.bB.c()) && !this.cc.a);
  }
  
  public boolean aP() {
    return (ag() > 0 && ag() < f_());
  }
  
  public void c(dk itemstack, int i) {
    if (itemstack == this.d)
      return; 
    this.d = itemstack;
    this.e = i;
    if (!this.o.I)
      c(true); 
  }
  
  public boolean e(int i, int j, int k) {
    return true;
  }
  
  protected int b(vi entityplayer) {
    int i = this.cd * 7;
    if (i > 100)
      return 100; 
    return i;
  }
  
  protected boolean ae() {
    return true;
  }
  
  public void c(int i) {}
  
  public void d(vi entityplayer) {
    this.by.a(entityplayer.by);
    this.aM = entityplayer.aM;
    this.bB = entityplayer.bB;
    this.cd = entityplayer.cd;
    this.ce = entityplayer.ce;
    this.cf = entityplayer.cf;
    this.bE = entityplayer.bE;
  }
}
