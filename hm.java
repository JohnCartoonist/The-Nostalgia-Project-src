import java.util.Random;

public class hm extends fx {
  public static final float[][] a = new float[][] { 
      { 1.0F, 1.0F, 1.0F }, { 0.95F, 0.7F, 0.2F }, { 0.9F, 0.5F, 0.85F }, { 0.6F, 0.7F, 0.95F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.7F, 0.8F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.6F, 0.7F }, 
      { 0.7F, 0.4F, 0.9F }, { 0.2F, 0.4F, 0.8F }, { 0.5F, 0.4F, 0.3F }, { 0.4F, 0.5F, 0.2F }, { 0.8F, 0.3F, 0.3F }, { 0.1F, 0.1F, 0.1F } };
  
  public hm(ry world) {
    super(world);
    this.aA = "/mob/sheep.png";
    a(0.9F, 1.3F);
  }
  
  public int f_() {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return 10; 
    return 8;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, new Byte((byte)0));
  }
  
  protected void a(boolean flag, int i) {
    if (!v_() && !((Boolean)mod_noBiomesX.SheepShearing.get()).booleanValue())
      a(new dk(yy.ab.bM, 1, l()), 0.0F); 
  }
  
  protected int k() {
    return yy.ab.bM;
  }
  
  public boolean c(vi entityplayer) {
    dk itemstack = entityplayer.by.a();
    if (itemstack != null && itemstack.c == acy.bd.bM && !v_()) {
      if (!this.o.I) {
        b(true);
        int i = 2 + this.Y.nextInt(3);
        for (int j = 0; j < i; j++) {
          ih entityitem = a(new dk(yy.ab.bM, 1, l()), 1.0F);
          entityitem.w += (this.Y.nextFloat() * 0.05F);
          entityitem.v += ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
          entityitem.x += ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
        } 
      } 
      itemstack.a(1, entityplayer);
    } 
    return super.c(entityplayer);
  }
  
  public boolean a(pm damagesource, int i) {
    if (damagesource.a() instanceof vi && ((Boolean)mod_noBiomesX.SheepShearing.get()).booleanValue() && !v_())
      if (!this.o.I) {
        b(true);
        int amount = 1 + this.Y.nextInt(3);
        for (int j = 0; j < amount; j++) {
          ih entityitem = a(new dk(yy.ab.bM, 1, l()), 1.0F);
          entityitem.w += (this.Y.nextFloat() * 0.05F);
          entityitem.v += ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
          entityitem.x += ((this.Y.nextFloat() - this.Y.nextFloat()) * 0.1F);
        } 
      }  
    return super.a(damagesource, i);
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    nbttagcompound.a("Sheared", v_());
    nbttagcompound.a("Color", (byte)l());
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    b(nbttagcompound.m("Sheared"));
    c(nbttagcompound.c("Color"));
  }
  
  protected String e() {
    return "mob.sheep";
  }
  
  protected String f() {
    return "mob.sheep";
  }
  
  protected String g() {
    return "mob.sheep";
  }
  
  public int l() {
    return this.ag.a(16) & 0xF;
  }
  
  public void c(int i) {
    byte byte0 = this.ag.a(16);
    this.ag.b(16, Byte.valueOf((byte)(byte0 & 0xF0 | i & 0xF)));
  }
  
  public boolean v_() {
    return ((this.ag.a(16) & 0x10) != 0);
  }
  
  public void b(boolean flag) {
    byte byte0 = this.ag.a(16);
    if (flag) {
      this.ag.b(16, Byte.valueOf((byte)(byte0 | 0x10)));
    } else {
      this.ag.b(16, Byte.valueOf((byte)(byte0 & 0xFFFFFFEF)));
    } 
  }
  
  public static int a(Random random) {
    if (((Boolean)mod_noBiomesX.NoBetaMobActions.get()).booleanValue())
      return 0; 
    int i = random.nextInt(100);
    if (i < 5)
      return 15; 
    if (i < 10)
      return 7; 
    if (i < 15)
      return 8; 
    if (i < 18)
      return 12; 
    return (random.nextInt(500) != 0) ? 0 : 6;
  }
  
  protected fx a(fx entityanimal) {
    hm entitysheep = (hm)entityanimal;
    hm entitysheep1 = new hm(this.o);
    if (this.Y.nextBoolean()) {
      entitysheep1.c(l());
    } else {
      entitysheep1.c(entitysheep.l());
    } 
    return entitysheep1;
  }
}
