public class x implements de {
  public dk[] a;
  
  public dk[] b;
  
  public int c;
  
  public vi d;
  
  private dk f;
  
  public boolean e;
  
  public x(vi entityplayer) {
    this.a = new dk[36];
    this.b = new dk[4];
    this.c = 0;
    this.e = false;
    this.d = entityplayer;
  }
  
  public dk a() {
    if (this.c < 9 && this.c >= 0)
      return this.a[this.c]; 
    return null;
  }
  
  private int g(int i) {
    for (int j = 0; j < this.a.length; j++) {
      if (this.a[j] != null && (this.a[j]).c == i)
        return j; 
    } 
    return -1;
  }
  
  private int b(int i, int j) {
    for (int k = 0; k < this.a.length; k++) {
      if (this.a[k] != null && (this.a[k]).c == i && this.a[k].i() == j)
        return k; 
    } 
    return -1;
  }
  
  private int d(dk itemstack) {
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null && (this.a[i]).c == itemstack.c && this.a[i].d() && (this.a[i]).a < this.a[i].c() && (this.a[i]).a < e() && (!this.a[i].f() || this.a[i].i() == itemstack.i()))
        return i; 
    } 
    return -1;
  }
  
  private int l() {
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] == null)
        return i; 
    } 
    return -1;
  }
  
  public void a(int i, int j, boolean flag, boolean flag1) {
    int k = -1;
    if (flag) {
      k = b(i, j);
    } else {
      k = g(i);
    } 
    if (k >= 0 && k < 9) {
      this.c = k;
      return;
    } 
  }
  
  public void a(int i) {
    if (i > 0)
      i = 1; 
    if (i < 0)
      i = -1; 
    for (this.c -= i; this.c < 0; this.c += 9);
    for (; this.c >= 9; this.c -= 9);
  }
  
  private int e(dk itemstack) {
    int i = itemstack.c;
    int j = itemstack.a;
    if (itemstack.c() == 1) {
      int k = l();
      if (k < 0)
        return j; 
      if (this.a[k] == null)
        this.a[k] = dk.b(itemstack); 
      return 0;
    } 
    int l = d(itemstack);
    if (l < 0)
      l = l(); 
    if (l < 0)
      return j; 
    if (this.a[l] == null)
      this.a[l] = new dk(i, 0, itemstack.i()); 
    int i1 = j;
    if (i1 > this.a[l].c() - (this.a[l]).a)
      i1 = this.a[l].c() - (this.a[l]).a; 
    if (i1 > e() - (this.a[l]).a)
      i1 = e() - (this.a[l]).a; 
    if (i1 == 0)
      return j; 
    j -= i1;
    (this.a[l]).a += i1;
    (this.a[l]).b = 5;
    return j;
  }
  
  public void b() {
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null)
        this.a[i].a(this.d.o, this.d, i, (this.c == i)); 
    } 
  }
  
  public boolean b(int i) {
    int j = g(i);
    if (j < 0)
      return false; 
    if (--(this.a[j]).a <= 0)
      this.a[j] = null; 
    return true;
  }
  
  public boolean c(int i) {
    int j = g(i);
    return (j >= 0);
  }
  
  public boolean a(dk itemstack) {
    if (!itemstack.g()) {
      int i;
      do {
        i = itemstack.a;
        itemstack.a = e(itemstack);
      } while (itemstack.a > 0 && itemstack.a < i);
      if (itemstack.a == i && this.d.cc.d) {
        itemstack.a = 0;
        return true;
      } 
      return (itemstack.a < i);
    } 
    int j = l();
    if (j >= 0) {
      this.a[j] = dk.b(itemstack);
      (this.a[j]).b = 5;
      itemstack.a = 0;
      return true;
    } 
    if (this.d.cc.d) {
      itemstack.a = 0;
      return true;
    } 
    return false;
  }
  
  public dk a(int i, int j) {
    dk[] aitemstack = this.a;
    if (i >= this.a.length) {
      aitemstack = this.b;
      i -= this.a.length;
    } 
    if (aitemstack[i] != null) {
      if ((aitemstack[i]).a <= j) {
        dk itemstack = aitemstack[i];
        aitemstack[i] = null;
        return itemstack;
      } 
      dk itemstack1 = aitemstack[i].a(j);
      if ((aitemstack[i]).a == 0)
        aitemstack[i] = null; 
      return itemstack1;
    } 
    return null;
  }
  
  public void a(int i, dk itemstack) {
    dk[] aitemstack = this.a;
    if (i >= aitemstack.length) {
      i -= aitemstack.length;
      aitemstack = this.b;
    } 
    aitemstack[i] = itemstack;
  }
  
  public float a(yy block) {
    float f = 1.0F;
    if (this.a[this.c] != null)
      f *= this.a[this.c].a(block); 
    return f;
  }
  
  public yi a(yi nbttaglist) {
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null) {
        ik nbttagcompound = new ik();
        nbttagcompound.a("Slot", (byte)i);
        this.a[i].b(nbttagcompound);
        nbttaglist.a((um)nbttagcompound);
      } 
    } 
    for (int j = 0; j < this.b.length; j++) {
      if (this.b[j] != null) {
        ik nbttagcompound1 = new ik();
        nbttagcompound1.a("Slot", (byte)(j + 100));
        this.b[j].b(nbttagcompound1);
        nbttaglist.a((um)nbttagcompound1);
      } 
    } 
    return nbttaglist;
  }
  
  public void b(yi nbttaglist) {
    this.a = new dk[36];
    this.b = new dk[4];
    for (int i = 0; i < nbttaglist.c(); i++) {
      ik nbttagcompound = (ik)nbttaglist.a(i);
      int j = nbttagcompound.c("Slot") & 0xFF;
      dk itemstack = dk.a(nbttagcompound);
      if (itemstack != null) {
        if (j >= 0 && j < this.a.length)
          this.a[j] = itemstack; 
        if (j >= 100 && j < this.b.length + 100)
          this.b[j - 100] = itemstack; 
      } 
    } 
  }
  
  public int c() {
    return this.a.length + 4;
  }
  
  public dk d(int i) {
    dk[] aitemstack = this.a;
    if (i >= aitemstack.length) {
      i -= aitemstack.length;
      aitemstack = this.b;
    } 
    return aitemstack[i];
  }
  
  public String d() {
    return "Inventory";
  }
  
  public int e() {
    return 64;
  }
  
  public int a(ia entity) {
    dk itemstack = d(this.c);
    if (itemstack != null)
      return itemstack.a(entity); 
    return 1;
  }
  
  public boolean b(yy block) {
    if (block.bZ.k())
      return true; 
    dk itemstack = d(this.c);
    if (itemstack != null)
      return itemstack.b(block); 
    return false;
  }
  
  public dk e(int i) {
    return this.b[i];
  }
  
  public int f() {
    int i = 0;
    int j = 0;
    int k = 0;
    for (int l = 0; l < this.b.length; l++) {
      if (this.b[l] != null && this.b[l].a() instanceof ItemCustomArmor && ((Boolean)mod_noBiomesX.ArmorDurabilities.get()).booleanValue()) {
        int i1 = ((ItemCustomArmor)this.b[l].a()).customMaxDamage;
        int j1 = this.b[l].h();
        int k1 = i1 - j1;
        j += k1;
        k += i1;
        int l1 = ((ItemCustomArmor)this.b[l].a()).customDamageReduceAmount;
        i += l1;
      } else if (this.b[l] != null && this.b[l].a() instanceof agi) {
        int m = ((agi)this.b[l].a()).b;
        i += m;
      } 
    } 
    if (((Boolean)mod_noBiomesX.ArmorDurabilities.get()).booleanValue()) {
      if (k == 0)
        return 0; 
      return (i - 1) * j / k + 1;
    } 
    return i;
  }
  
  public void f(int i) {
    i /= 4;
    if (i < 1)
      i = 1; 
    for (int j = 0; j < this.b.length; j++) {
      if (this.b[j] != null && this.b[j].a() instanceof agi) {
        this.b[j].a(i, this.d);
        if ((this.b[j]).a == 0) {
          this.b[j].a(this.d);
          this.b[j] = null;
        } 
      } 
    } 
  }
  
  public void g() {
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null) {
        this.d.a(this.a[i], true);
        this.a[i] = null;
      } 
    } 
    for (int j = 0; j < this.b.length; j++) {
      if (this.b[j] != null) {
        this.d.a(this.b[j], true);
        this.b[j] = null;
      } 
    } 
  }
  
  public void h() {
    this.e = true;
  }
  
  public void b(dk itemstack) {
    this.f = itemstack;
    this.d.c(itemstack);
  }
  
  public dk i() {
    return this.f;
  }
  
  public boolean b_(vi entityplayer) {
    if (this.d.K)
      return false; 
    return (entityplayer.d(this.d) <= 64.0D);
  }
  
  public boolean c(dk itemstack) {
    for (int i = 0; i < this.b.length; i++) {
      if (this.b[i] != null && this.b[i].c(itemstack))
        return true; 
    } 
    for (int j = 0; j < this.a.length; j++) {
      if (this.a[j] != null && this.a[j].c(itemstack))
        return true; 
    } 
    return false;
  }
  
  public void j() {}
  
  public void k() {}
  
  public void a(x inventoryplayer) {
    for (int i = 0; i < this.a.length; i++)
      this.a[i] = dk.b(inventoryplayer.a[i]); 
    for (int j = 0; j < this.b.length; j++)
      this.b[j] = dk.b(inventoryplayer.b[j]); 
  }
}
