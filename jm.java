import java.util.List;

public class jm extends gr {
  private int b;
  
  private int c;
  
  public jm(ry world) {
    super(world);
    this.b = 0;
    this.c = 0;
    this.aA = "/mob/pigzombie.png";
    this.bw = 0.5F;
    this.a = 5;
    this.af = true;
  }
  
  public void a() {
    if (((Boolean)mod_noBiomesX.FlammableNetherMobs.get()).booleanValue()) {
      this.af = false;
    } else {
      this.af = true;
    } 
    this.bw = (this.h == null) ? 0.5F : 0.95F;
    if (this.c > 0 && --this.c == 0)
      this.o.a((ia)this, "mob.zombiepig.zpigangry", w_() * 2.0F, ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.2F + 1.0F) * 1.8F); 
    super.a();
  }
  
  public boolean i() {
    return (this.o.v > 0 && this.o.a(this.C) && this.o.a((ia)this, this.C).size() == 0 && !this.o.b(this.C));
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Anger", (short)this.b);
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    this.b = nbttagcompound.d("Anger");
  }
  
  protected ia o() {
    if (this.b == 0)
      return null; 
    return super.o();
  }
  
  public void c() {
    super.c();
  }
  
  public boolean a(pm damagesource, int i) {
    ia entity = damagesource.a();
    if (entity instanceof vi) {
      List<ia> list = this.o.b((ia)this, this.C.b(32.0D, 32.0D, 32.0D));
      for (int j = 0; j < list.size(); j++) {
        ia entity1 = list.get(j);
        if (entity1 instanceof jm) {
          jm entitypigzombie = (jm)entity1;
          entitypigzombie.j(entity);
        } 
      } 
      j(entity);
    } 
    return super.a(damagesource, i);
  }
  
  private void j(ia entity) {
    this.h = entity;
    this.b = 400 + this.Y.nextInt(400);
    this.c = this.Y.nextInt(40);
  }
  
  protected String e() {
    return "mob.zombiepig.zpig";
  }
  
  protected String f() {
    return "mob.zombiepig.zpighurt";
  }
  
  protected String g() {
    return "mob.zombiepig.zpigdeath";
  }
  
  protected void a(boolean flag, int i) {
    int j = this.Y.nextInt(2 + i);
    for (int k = 0; k < j; k++)
      b(acy.bl.bM, 1); 
    j = this.Y.nextInt(2 + i);
    for (int l = 0; l < j; l++)
      b(acy.bp.bM, 1); 
  }
  
  protected int k() {
    return acy.bl.bM;
  }
  
  public dk s() {
    return d;
  }
  
  private static final dk d = new dk(acy.F, 1);
}
