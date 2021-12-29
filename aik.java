import java.util.Iterator;
import java.util.List;

public class aik extends fx {
  private boolean a;
  
  private float b;
  
  private float c;
  
  private boolean d;
  
  private boolean e;
  
  private float f;
  
  private float g;
  
  public aik(ry world) {
    super(world);
    this.a = false;
    this.aA = "/mob/wolf.png";
    a(0.8F, 0.8F);
    this.bw = 1.1F;
  }
  
  public int f_() {
    return !aG() ? 8 : 20;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, Byte.valueOf((byte)0));
    this.ag.a(17, "");
    this.ag.a(18, new Integer(ag()));
  }
  
  protected boolean d_() {
    return false;
  }
  
  public String I() {
    if (aG())
      return "/mob/wolf_tame.png"; 
    if (aF())
      return "/mob/wolf_angry.png"; 
    return super.I();
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Angry", aF());
    nbttagcompound.a("Sitting", aE());
    if (aD() == null) {
      nbttagcompound.a("Owner", "");
    } else {
      nbttagcompound.a("Owner", aD());
    } 
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    e(nbttagcompound.m("Angry"));
    d(nbttagcompound.m("Sitting"));
    String s = nbttagcompound.i("Owner");
    if (s.length() > 0) {
      a(s);
      f(true);
    } 
  }
  
  protected boolean d() {
    return !aG();
  }
  
  protected String e() {
    if (aF())
      return "mob.wolf.growl"; 
    if (this.Y.nextInt(3) == 0) {
      if (aG() && this.ag.c(18) < 10)
        return "mob.wolf.whine"; 
      return "mob.wolf.panting";
    } 
    return "mob.wolf.bark";
  }
  
  protected String f() {
    return "mob.wolf.hurt";
  }
  
  protected String g() {
    return "mob.wolf.death";
  }
  
  protected float w_() {
    return 0.4F;
  }
  
  protected int k() {
    return -1;
  }
  
  protected void n() {
    super.n();
    if (!this.i && !aB() && aG() && this.n == null) {
      vi entityplayer = this.o.a(aD());
      if (entityplayer != null) {
        float f = entityplayer.c((ia)this);
        if (f > 5.0F)
          c(entityplayer, f); 
      } else if (!D()) {
        d(true);
      } 
    } else if (this.h == null && !aB() && !aG() && this.o.w.nextInt(100) == 0) {
      List<ia> list = this.o.a(hm.class, c.b(this.s, this.t, this.u, this.s + 1.0D, this.t + 1.0D, this.u + 1.0D).b(16.0D, 4.0D, 16.0D));
      if (!list.isEmpty())
        a(list.get(this.o.w.nextInt(list.size()))); 
    } 
    if (D())
      d(false); 
    if (!this.o.I)
      this.ag.b(18, Integer.valueOf(ag())); 
  }
  
  public void c() {
    super.c();
    this.a = false;
    if (an() && !aB() && !aF()) {
      ia entity = ao();
      if (entity instanceof vi) {
        vi entityplayer = (vi)entity;
        dk itemstack = entityplayer.by.a();
        if (itemstack != null)
          if (!aG() && itemstack.c == acy.aW.bM) {
            this.a = true;
          } else if (aG() && acy.d[itemstack.c] instanceof agu) {
            this.a = ((agu)acy.d[itemstack.c]).q();
          }  
      } 
    } 
    if (!this.aH && this.d && !this.e && !aB() && this.D) {
      this.e = true;
      this.f = 0.0F;
      this.g = 0.0F;
      this.o.a((ia)this, (byte)8);
    } 
  }
  
  public void a() {
    super.a();
    this.c = this.b;
    if (this.a) {
      this.b += (1.0F - this.b) * 0.4F;
    } else {
      this.b += (0.0F - this.b) * 0.4F;
    } 
    if (this.a)
      this.bx = 10; 
    if (C()) {
      this.d = true;
      this.e = false;
      this.f = 0.0F;
      this.g = 0.0F;
    } else if ((this.d || this.e) && this.e) {
      if (this.f == 0.0F)
        this.o.a((ia)this, "mob.wolf.shake", w_(), (this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F); 
      this.g = this.f;
      this.f += 0.05F;
      if (this.g >= 2.0F) {
        this.d = false;
        this.e = false;
        this.g = 0.0F;
        this.f = 0.0F;
      } 
      if (this.f > 0.4F) {
        float f = (float)this.C.b;
        int i = (int)(me.a((this.f - 0.4F) * 3.141593F) * 7.0F);
        for (int j = 0; j < i; j++) {
          float f1 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
          float f2 = (this.Y.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
          this.o.a("splash", this.s + f1, (f + 0.8F), this.u + f2, this.v, this.w, this.x);
        } 
      } 
    } 
  }
  
  public boolean ax() {
    return this.d;
  }
  
  public float g(float f) {
    return 0.75F + (this.g + (this.f - this.g) * f) / 2.0F * 0.25F;
  }
  
  public float e(float f, float f1) {
    float f2 = (this.g + (this.f - this.g) * f + f1) / 1.8F;
    if (f2 < 0.0F) {
      f2 = 0.0F;
    } else if (f2 > 1.0F) {
      f2 = 1.0F;
    } 
    return me.a(f2 * 3.141593F) * me.a(f2 * 3.141593F * 11.0F) * 0.15F * 3.141593F;
  }
  
  public float h(float f) {
    return (this.c + (this.b - this.c) * f) * 0.15F * 3.141593F;
  }
  
  public float E() {
    return this.N * 0.8F;
  }
  
  protected int am() {
    if (aE())
      return 20; 
    return super.am();
  }
  
  private void c(ia entity, float f) {
    dw pathentity = this.o.a((ia)this, entity, 16.0F);
    if (pathentity == null && f > 12.0F) {
      int i = me.c(entity.s) - 2;
      int j = me.c(entity.u) - 2;
      int k = me.c(entity.C.b);
      for (int l = 0; l <= 4; l++) {
        for (int i1 = 0; i1 <= 4; i1++) {
          if ((l < 1 || i1 < 1 || l > 3 || i1 > 3) && this.o.g(i + l, k - 1, j + i1) && !this.o.g(i + l, k, j + i1) && !this.o.g(i + l, k + 1, j + i1)) {
            c(((i + l) + 0.5F), k, ((j + i1) + 0.5F), this.y, this.z);
            return;
          } 
        } 
      } 
    } else {
      a(pathentity);
    } 
  }
  
  protected boolean az() {
    return (aE() || this.e);
  }
  
  public boolean a(pm damagesource, int i) {
    ia entity = damagesource.a();
    d(false);
    if (entity != null && !(entity instanceof vi) && !(entity instanceof ro))
      i = (i + 1) / 2; 
    if (super.a(damagesource, i)) {
      if (!aG() && !aF()) {
        if (entity instanceof vi) {
          e(true);
          this.h = entity;
        } 
        if (entity instanceof ro && ((ro)entity).c != null)
          entity = ((ro)entity).c; 
        if (entity instanceof nq) {
          List list = this.o.a(aik.class, c.b(this.s, this.t, this.u, this.s + 1.0D, this.t + 1.0D, this.u + 1.0D).b(16.0D, 4.0D, 16.0D));
          Iterator<ia> iterator = list.iterator();
          while (iterator.hasNext()) {
            ia entity1 = iterator.next();
            aik entitywolf = (aik)entity1;
            if (!entitywolf.aG() && entitywolf.h == null) {
              entitywolf.h = entity;
              if (entity instanceof vi)
                entitywolf.e(true); 
            } 
          } 
        } 
      } else if (entity != this && entity != null) {
        if (aG() && entity instanceof vi && ((vi)entity).bJ.equalsIgnoreCase(aD()))
          return true; 
        this.h = entity;
      } 
      return true;
    } 
    return false;
  }
  
  protected ia o() {
    if (aF())
      return this.o.a((ia)this, 16.0D); 
    return null;
  }
  
  protected void a(ia entity, float f) {
    if (f > 2.0F && f < 6.0F && this.Y.nextInt(10) == 0) {
      if (this.D) {
        double d = entity.s - this.s;
        double d1 = entity.u - this.u;
        float f1 = me.a(d * d + d1 * d1);
        this.v = d / f1 * 0.5D * 0.800000011920929D + this.v * 0.20000000298023224D;
        this.x = d1 / f1 * 0.5D * 0.800000011920929D + this.x * 0.20000000298023224D;
        this.w = 0.4000000059604645D;
      } 
    } else if (f < 1.5D && entity.C.e > this.C.b && entity.C.b < this.C.e) {
      this.aT = 20;
      byte byte0 = 2;
      if (aG())
        byte0 = 4; 
      entity.a(pm.a((nq)this), byte0);
    } 
  }
  
  public boolean c(vi entityplayer) {
    dk itemstack = entityplayer.by.a();
    if (!aG()) {
      if (itemstack != null && itemstack.c == acy.aW.bM && !aF()) {
        itemstack.a--;
        if (itemstack.a <= 0)
          entityplayer.by.a(entityplayer.by.c, (dk)null); 
        if (!this.o.I)
          if (this.Y.nextInt(3) == 0) {
            f(true);
            a((dw)null);
            d(true);
            h(20);
            a(entityplayer.bJ);
            b(true);
            this.o.a((ia)this, (byte)7);
          } else {
            b(false);
            this.o.a((ia)this, (byte)6);
          }  
        return true;
      } 
    } else {
      if (itemstack != null && acy.d[itemstack.c] instanceof agu) {
        agu itemfood = (agu)acy.d[itemstack.c];
        if (itemfood.q() && this.ag.c(18) < 20) {
          itemstack.a--;
          a_(itemfood.o());
          if (itemstack.a <= 0)
            entityplayer.by.a(entityplayer.by.c, (dk)null); 
          return true;
        } 
      } 
      if (entityplayer.bJ.equalsIgnoreCase(aD())) {
        if (!this.o.I) {
          d(!aE());
          this.bu = false;
          a((dw)null);
        } 
        return true;
      } 
    } 
    return super.c(entityplayer);
  }
  
  void b(boolean flag) {
    String s = "heart";
    if (!flag)
      s = "smoke"; 
    for (int i = 0; i < 7; i++) {
      double d = this.Y.nextGaussian() * 0.02D;
      double d1 = this.Y.nextGaussian() * 0.02D;
      double d2 = this.Y.nextGaussian() * 0.02D;
      this.o.a(s, this.s + (this.Y.nextFloat() * this.M * 2.0F) - this.M, this.t + 0.5D + (this.Y.nextFloat() * this.N), this.u + (this.Y.nextFloat() * this.M * 2.0F) - this.M, d, d1, d2);
    } 
  }
  
  public void a(byte byte0) {
    if (byte0 == 7) {
      b(true);
    } else if (byte0 == 6) {
      b(false);
    } else if (byte0 == 8) {
      this.e = true;
      this.f = 0.0F;
      this.g = 0.0F;
    } else {
      super.a(byte0);
    } 
  }
  
  public float ay() {
    if (aF())
      return 1.53938F; 
    if (aG())
      return (0.55F - (20 - this.ag.c(18)) * 0.02F) * 3.141593F; 
    return 0.6283185F;
  }
  
  public int g_() {
    return 8;
  }
  
  public String aD() {
    return this.ag.d(17);
  }
  
  public void a(String s) {
    this.ag.b(17, s);
  }
  
  public boolean aE() {
    return ((this.ag.a(16) & 0x1) != 0);
  }
  
  public void d(boolean flag) {
    byte byte0 = this.ag.a(16);
    if (flag) {
      this.ag.b(16, Byte.valueOf((byte)(byte0 | 0x1)));
    } else {
      this.ag.b(16, Byte.valueOf((byte)(byte0 & 0xFFFFFFFE)));
    } 
  }
  
  public boolean aF() {
    return ((this.ag.a(16) & 0x2) != 0);
  }
  
  public void e(boolean flag) {
    byte byte0 = this.ag.a(16);
    if (flag) {
      this.ag.b(16, Byte.valueOf((byte)(byte0 | 0x2)));
    } else {
      this.ag.b(16, Byte.valueOf((byte)(byte0 & 0xFFFFFFFD)));
    } 
  }
  
  public boolean aG() {
    return ((this.ag.a(16) & 0x4) != 0);
  }
  
  public void f(boolean flag) {
    byte byte0 = this.ag.a(16);
    if (flag) {
      this.ag.b(16, Byte.valueOf((byte)(byte0 | 0x4)));
    } else {
      this.ag.b(16, Byte.valueOf((byte)(byte0 & 0xFFFFFFFB)));
    } 
  }
  
  protected fx a(fx entityanimal) {
    return new aik(this.o);
  }
  
  public boolean i() {
    if (((Boolean)mod_noBiomesX.NoBetaMobs.get()).booleanValue())
      return false; 
    return super.i();
  }
}
