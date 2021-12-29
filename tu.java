public class tu extends bq implements de {
  private dk[] p = new dk[36];
  
  public boolean a = false;
  
  public tu b;
  
  public tu j;
  
  public tu k;
  
  public tu l;
  
  public float m;
  
  public float n;
  
  public int o;
  
  private int q;
  
  public int c() {
    return 27;
  }
  
  public dk d(int i) {
    return this.p[i];
  }
  
  public dk a(int i, int j) {
    if (this.p[i] != null) {
      if ((this.p[i]).a <= j) {
        dk itemstack = this.p[i];
        this.p[i] = null;
        h();
        return itemstack;
      } 
      dk itemstack1 = this.p[i].a(j);
      if ((this.p[i]).a == 0)
        this.p[i] = null; 
      h();
      return itemstack1;
    } 
    return null;
  }
  
  public void a(int i, dk itemstack) {
    this.p[i] = itemstack;
    if (itemstack != null && itemstack.a > e())
      itemstack.a = e(); 
    h();
  }
  
  public String d() {
    return "Chest";
  }
  
  public void b(ik nbttagcompound) {
    super.b(nbttagcompound);
    yi nbttaglist = nbttagcompound.l("Items");
    this.p = new dk[c()];
    for (int i = 0; i < nbttaglist.c(); i++) {
      ik nbttagcompound1 = (ik)nbttaglist.a(i);
      int j = nbttagcompound1.c("Slot") & 0xFF;
      if (j >= 0 && j < this.p.length)
        this.p[j] = dk.a(nbttagcompound1); 
    } 
  }
  
  public void a(ik nbttagcompound) {
    super.a(nbttagcompound);
    yi nbttaglist = new yi();
    for (int i = 0; i < this.p.length; i++) {
      if (this.p[i] != null) {
        ik nbttagcompound1 = new ik();
        nbttagcompound1.a("Slot", (byte)i);
        this.p[i].b(nbttagcompound1);
        nbttaglist.a((um)nbttagcompound1);
      } 
    } 
    nbttagcompound.a("Items", (um)nbttaglist);
  }
  
  public int e() {
    return 64;
  }
  
  public boolean b_(vi entityplayer) {
    if (this.c.b(this.d, this.e, this.f) != this)
      return false; 
    return (entityplayer.f(this.d + 0.5D, this.e + 0.5D, this.f + 0.5D) <= 64.0D);
  }
  
  public void n() {
    super.n();
    this.a = false;
  }
  
  public void a() {
    if (this.a)
      return; 
    this.a = true;
    this.b = null;
    this.j = null;
    this.k = null;
    this.l = null;
    if (this.c.a(this.d - 1, this.e, this.f) == yy.au.bM)
      this.k = (tu)this.c.b(this.d - 1, this.e, this.f); 
    if (this.c.a(this.d + 1, this.e, this.f) == yy.au.bM)
      this.j = (tu)this.c.b(this.d + 1, this.e, this.f); 
    if (this.c.a(this.d, this.e, this.f - 1) == yy.au.bM)
      this.b = (tu)this.c.b(this.d, this.e, this.f - 1); 
    if (this.c.a(this.d, this.e, this.f + 1) == yy.au.bM)
      this.l = (tu)this.c.b(this.d, this.e, this.f + 1); 
    if (this.b != null)
      this.b.n(); 
    if (this.l != null)
      this.l.n(); 
    if (this.j != null)
      this.j.n(); 
    if (this.k != null)
      this.k.n(); 
  }
  
  public void b() {
    super.b();
  }
  
  public void b(int i, int j) {
    if (i == 1)
      this.o = j; 
  }
  
  public void j() {
    this.o++;
    this.c.f(this.d, this.e, this.f, 1, this.o);
  }
  
  public void k() {
    this.o--;
    this.c.f(this.d, this.e, this.f, 1, this.o);
  }
  
  public void l() {
    n();
    a();
    super.l();
  }
}
