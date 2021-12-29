import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ry implements kq {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public boolean f;
  
  public List g;
  
  private List J;
  
  private TreeSet K;
  
  private Set L;
  
  public List h;
  
  private List M;
  
  private List N;
  
  public List i;
  
  public List j;
  
  public long skyColor = 8961023L;
  
  public long fogColor = 0L;
  
  public int totalSkyLight = 15;
  
  private long O;
  
  public int k;
  
  protected int l;
  
  protected final int m = 1013904223;
  
  protected float n;
  
  protected float o;
  
  protected float p;
  
  protected float q;
  
  protected int r;
  
  public int s;
  
  public boolean t;
  
  private long P;
  
  protected int u;
  
  public int v;
  
  public Random w;
  
  public boolean x;
  
  public final k y;
  
  protected List z;
  
  protected ej A;
  
  protected final nh B;
  
  protected si C;
  
  public boolean D;
  
  private boolean Q;
  
  public ew E;
  
  private ArrayList R;
  
  private boolean S;
  
  protected boolean F;
  
  protected boolean G;
  
  private Set T;
  
  private int U;
  
  int[] H;
  
  private List V;
  
  public boolean I;
  
  public boolean snowCovered;
  
  public boolean isHotWorld = false;
  
  private OldSpawnerAnimals animalSpawner;
  
  private OldSpawnerMonsters monsterSpawner;
  
  private boolean useOldSpawners = false;
  
  private boolean useClassicRaycaster = false;
  
  public vh a() {
    return this.y.b;
  }
  
  public ry(nh isavehandler, String s, k worldprovider, yw worldsettings) {
    this.a = 7;
    this.b = this.a + 4;
    this.c = 1 << this.a;
    this.d = this.c - 1;
    this.e = this.c / 2 - 1;
    this.f = false;
    this.g = new ArrayList();
    this.J = new ArrayList();
    this.K = new TreeSet();
    this.L = new HashSet();
    this.h = new ArrayList();
    this.M = new ArrayList();
    this.N = new ArrayList();
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.O = 16777215L;
    this.k = 0;
    this.l = (new Random()).nextInt();
    this.r = 0;
    this.s = 0;
    this.t = false;
    this.P = System.currentTimeMillis();
    this.u = 40;
    this.w = new Random();
    this.x = false;
    this.z = new ArrayList();
    this.R = new ArrayList();
    this.F = true;
    this.G = true;
    this.T = new HashSet();
    this.U = this.w.nextInt(12000);
    this.H = new int[32768];
    this.V = new ArrayList();
    this.I = false;
    this.B = isavehandler;
    this.C = new si(worldsettings, s);
    this.y = worldprovider;
    this.E = new ew(isavehandler);
    worldprovider.a(this);
    this.A = d();
    p();
    H();
    this.snowCovered = this.C.getSnowCovered();
    setWorldTheme();
    if (((Boolean)mod_noBiomesX.OldSpawners.get()).booleanValue())
      turnOnOldSpawners(); 
  }
  
  public ry(ry world, k worldprovider) {
    this.a = 7;
    this.b = this.a + 4;
    this.c = 1 << this.a;
    this.d = this.c - 1;
    this.e = this.c / 2 - 1;
    this.f = false;
    this.g = new ArrayList();
    this.J = new ArrayList();
    this.K = new TreeSet();
    this.L = new HashSet();
    this.h = new ArrayList();
    this.M = new ArrayList();
    this.N = new ArrayList();
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.O = 16777215L;
    this.k = 0;
    this.l = (new Random()).nextInt();
    this.r = 0;
    this.s = 0;
    this.t = false;
    this.P = System.currentTimeMillis();
    this.u = 40;
    this.w = new Random();
    this.x = false;
    this.z = new ArrayList();
    this.R = new ArrayList();
    this.F = true;
    this.G = true;
    this.T = new HashSet();
    this.U = this.w.nextInt(12000);
    this.H = new int[32768];
    this.V = new ArrayList();
    this.I = false;
    this.P = world.P;
    this.B = world.B;
    this.C = new si(world.C);
    this.E = new ew(this.B);
    this.y = worldprovider;
    worldprovider.a(this);
    this.A = d();
    p();
    H();
    this.snowCovered = this.C.getSnowCovered();
    setWorldTheme();
    if (((Boolean)mod_noBiomesX.OldSpawners.get()).booleanValue())
      turnOnOldSpawners(); 
  }
  
  public ry(nh isavehandler, String s, yw worldsettings) {
    this(isavehandler, s, worldsettings, (k)null);
  }
  
  public ry(nh isavehandler, String s, yw worldsettings, k worldprovider) {
    this.a = 7;
    this.b = this.a + 4;
    this.c = 1 << this.a;
    this.d = this.c - 1;
    this.e = this.c / 2 - 1;
    this.f = false;
    this.g = new ArrayList();
    this.J = new ArrayList();
    this.K = new TreeSet();
    this.L = new HashSet();
    this.h = new ArrayList();
    this.M = new ArrayList();
    this.N = new ArrayList();
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.O = 16777215L;
    this.k = 0;
    this.l = (new Random()).nextInt();
    this.r = 0;
    this.s = 0;
    this.t = false;
    this.P = System.currentTimeMillis();
    this.u = 40;
    this.w = new Random();
    this.x = false;
    this.z = new ArrayList();
    this.R = new ArrayList();
    this.F = true;
    this.G = true;
    this.T = new HashSet();
    this.U = this.w.nextInt(12000);
    this.H = new int[32768];
    this.V = new ArrayList();
    this.I = false;
    this.B = isavehandler;
    this.E = new ew(isavehandler);
    this.C = isavehandler.c();
    this.x = (this.C == null);
    if (worldprovider != null) {
      this.y = worldprovider;
    } else if (this.C != null && this.C.i() != 0) {
      this.y = k.a(this.C.i());
    } else {
      this.y = k.a(0);
    } 
    boolean flag = false;
    if (this.C == null) {
      this.C = new si(worldsettings, s);
      flag = true;
    } else {
      this.C.a(s);
    } 
    this.y.a(this);
    this.A = d();
    if (flag) {
      i();
      this.C.setMapType(((Integer)mod_noBiomesX.MapType.get()).intValue());
      setWorldTheme();
      if (!((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue() && !this.isHotWorld) {
        int snowChance = 4;
        if (this.C.getMapType() == 2)
          snowChance = 2; 
        if (this.w.nextInt(snowChance) == 0) {
          this.C.setSnowCovered(true);
          this.snowCovered = true;
        } 
      } 
    } else {
      setWorldTheme();
      this.snowCovered = this.C.getSnowCovered();
    } 
    p();
    H();
    if (((Boolean)mod_noBiomesX.OldSpawners.get()).booleanValue())
      turnOnOldSpawners(); 
  }
  
  public void turnOnOldSpawners() {
    this.animalSpawner = new OldSpawnerAnimals(15, fx.class, new Class[] { hm.class, fd.class, adr.class, qh.class });
    this.monsterSpawner = new OldSpawnerMonsters(200, aey.class, new Class[] { gr.class, it.class, abh.class, vq.class, aed.class });
    this.useOldSpawners = true;
  }
  
  public void setWorldTheme() {
    this.useClassicRaycaster = ((Boolean)mod_noBiomesX.HitThroughDoor.get()).booleanValue();
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue())
      return; 
    int type = this.C.getMapType();
    if (type == 1) {
      makeHellWorld();
    } else if (type == 2) {
      makeWoodsWorld();
    } else if (type == 3) {
      makeParadiseWorld();
    } 
  }
  
  public void makeHellWorld() {
    this.skyColor = 1049600L;
    this.O = 2164736L;
    this.fogColor = 1049600L;
    this.totalSkyLight = 7;
    this.isHotWorld = true;
  }
  
  public void makeWoodsWorld() {
    this.skyColor = 7699847L;
    this.O = 5069403L;
    this.fogColor = 5069403L;
    this.totalSkyLight = 12;
  }
  
  public void makeParadiseWorld() {
    this.skyColor = 13033215L;
    this.O = 15658751L;
    this.fogColor = 13033215L;
    this.totalSkyLight = 16;
    this.isHotWorld = true;
  }
  
  protected ej d() {
    d ichunkloader = this.B.a(this.y);
    return (ej)new jz(this, ichunkloader, this.y.c());
  }
  
  protected void i() {
    this.D = true;
    int i = 0;
    byte byte0 = 64;
    int j;
    for (j = 0; !this.y.a(i, j); j += this.w.nextInt(64) - this.w.nextInt(64))
      i += this.w.nextInt(64) - this.w.nextInt(64); 
    this.C.a(i, byte0, j);
    this.D = false;
  }
  
  public dh j() {
    return this.y.g();
  }
  
  public void e() {
    if (this.C.d() <= 0)
      this.C.b(64); 
    int i = this.C.c();
    int j;
    for (j = this.C.e(); a(i, j) == 0; j += this.w.nextInt(8) - this.w.nextInt(8))
      i += this.w.nextInt(8) - this.w.nextInt(8); 
    this.C.a(i);
    this.C.c(j);
  }
  
  public int a(int i, int j) {
    int m;
    for (m = this.e; !h(i, m + 1, j); m++);
    return a(i, m, j);
  }
  
  public void k() {}
  
  public void a(vi entityplayer) {
    try {
      ik nbttagcompound = this.C.h();
      if (nbttagcompound != null) {
        entityplayer.e(nbttagcompound);
        this.C.a((ik)null);
      } 
      if (this.A instanceof mv) {
        mv chunkproviderloadorgenerate = (mv)this.A;
        int i = me.d((int)entityplayer.s) >> 4;
        int j = me.d((int)entityplayer.u) >> 4;
        chunkproviderloadorgenerate.d(i, j);
      } 
      a(entityplayer);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void a(boolean flag, rz iprogressupdate) {
    if (!this.A.b())
      return; 
    if (iprogressupdate != null)
      iprogressupdate.a("Saving level"); 
    G();
    if (iprogressupdate != null)
      iprogressupdate.b("Saving chunks"); 
    this.A.a(flag, iprogressupdate);
  }
  
  private void G() {
    s();
    this.B.a(this.C, this.i);
    this.E.a();
  }
  
  public boolean c(int i) {
    if (!this.A.b())
      return true; 
    if (i == 0)
      G(); 
    return this.A.a(false, null);
  }
  
  public int a(int i, int j, int m) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return 0; 
    if (j < 0)
      return 0; 
    if (j >= this.c)
      return 0; 
    return c(i >> 4, m >> 4).a(i & 0xF, j, m & 0xF);
  }
  
  public boolean h(int i, int j, int m) {
    return (a(i, j, m) == 0);
  }
  
  public boolean i(int i, int j, int m) {
    if (j < 0 || j >= this.c)
      return false; 
    return g(i >> 4, m >> 4);
  }
  
  public boolean e(int i, int j, int m, int l) {
    return b(i - l, j - l, m - l, i + l, j + l, m + l);
  }
  
  public boolean b(int i, int j, int m, int l, int i1, int j1) {
    if (i1 < 0 || j >= this.c)
      return false; 
    i >>= 4;
    j >>= 4;
    m >>= 4;
    l >>= 4;
    i1 >>= 4;
    j1 >>= 4;
    for (int k1 = i; k1 <= l; k1++) {
      for (int l1 = m; l1 <= j1; l1++) {
        if (!g(k1, l1))
          return false; 
      } 
    } 
    return true;
  }
  
  private boolean g(int i, int j) {
    return this.A.c(i, j);
  }
  
  public zx b(int i, int j) {
    return c(i >> 4, j >> 4);
  }
  
  public zx c(int i, int j) {
    return this.A.b(i, j);
  }
  
  public boolean b(int i, int j, int m, int l, int i1) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return false; 
    if (j < 0)
      return false; 
    if (j >= this.c)
      return false; 
    zx chunk = c(i >> 4, m >> 4);
    boolean flag = chunk.a(i & 0xF, j, m & 0xF, l, i1);
    s(i, j, m);
    return flag;
  }
  
  public boolean d(int i, int j, int m, int l) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return false; 
    if (j < 0)
      return false; 
    if (j >= this.c)
      return false; 
    zx chunk = c(i >> 4, m >> 4);
    boolean flag = chunk.a(i & 0xF, j, m & 0xF, l);
    s(i, j, m);
    return flag;
  }
  
  public p e(int i, int j, int m) {
    int l = a(i, j, m);
    if (l == 0)
      return p.a; 
    return (yy.k[l]).bZ;
  }
  
  public int d(int i, int j, int m) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return 0; 
    if (j < 0)
      return 0; 
    if (j >= this.c)
      return 0; 
    zx chunk = c(i >> 4, m >> 4);
    i &= 0xF;
    m &= 0xF;
    return chunk.b(i, j, m);
  }
  
  public void f(int i, int j, int m, int l) {
    if (c(i, j, m, l)) {
      int i1 = a(i, j, m);
      if (yy.r[i1 & 0xFF]) {
        h(i, j, m, i1);
      } else {
        j(i, j, m, i1);
      } 
    } 
  }
  
  public boolean c(int i, int j, int m, int l) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return false; 
    if (j < 0)
      return false; 
    if (j >= this.c)
      return false; 
    zx chunk = c(i >> 4, m >> 4);
    i &= 0xF;
    m &= 0xF;
    return chunk.b(i, j, m, l);
  }
  
  public boolean g(int i, int j, int m, int l) {
    if (d(i, j, m, l)) {
      h(i, j, m, l);
      return true;
    } 
    return false;
  }
  
  public boolean d(int i, int j, int m, int l, int i1) {
    if (b(i, j, m, l, i1)) {
      h(i, j, m, l);
      return true;
    } 
    return false;
  }
  
  public void j(int i, int j, int m) {
    for (int l = 0; l < this.z.size(); l++)
      ((bd)this.z.get(l)).a(i, j, m); 
  }
  
  protected void h(int i, int j, int m, int l) {
    j(i, j, m);
    j(i, j, m, l);
  }
  
  public void i(int i, int j, int m, int l) {
    if (m > l) {
      int i1 = l;
      l = m;
      m = i1;
    } 
    if (!this.y.e)
      for (int j1 = m; j1 <= l; j1++)
        c(bn.a, i, j1, j);  
    c(i, m, j, i, l, j);
  }
  
  public void k(int i, int j, int m) {
    for (int l = 0; l < this.z.size(); l++)
      ((bd)this.z.get(l)).a(i, j, m, i, j, m); 
  }
  
  public void c(int i, int j, int m, int l, int i1, int j1) {
    for (int k1 = 0; k1 < this.z.size(); k1++)
      ((bd)this.z.get(k1)).a(i, j, m, l, i1, j1); 
  }
  
  public void j(int i, int j, int m, int l) {
    m(i - 1, j, m, l);
    m(i + 1, j, m, l);
    m(i, j - 1, m, l);
    m(i, j + 1, m, l);
    m(i, j, m - 1, l);
    m(i, j, m + 1, l);
  }
  
  private void m(int i, int j, int m, int l) {
    if (this.t || this.I)
      return; 
    yy block = yy.k[a(i, j, m)];
    if (block != null)
      block.a(this, i, j, m, l); 
  }
  
  public boolean l(int i, int j, int m) {
    return c(i >> 4, m >> 4).c(i & 0xF, j, m & 0xF);
  }
  
  public int m(int i, int j, int m) {
    if (j < 0)
      return 0; 
    if (j >= this.c)
      j = this.c - 1; 
    return c(i >> 4, m >> 4).c(i & 0xF, j, m & 0xF, 0);
  }
  
  public int n(int i, int j, int m) {
    return a(i, j, m, true);
  }
  
  public int a(int i, int j, int m, boolean flag) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return 15; 
    if (flag) {
      int l = a(i, j, m);
      if (l == yy.ak.bM || l == yy.aA.bM || l == yy.aH.bM || l == yy.at.bM) {
        int i1 = a(i, j + 1, m, false);
        int j1 = a(i + 1, j, m, false);
        int k1 = a(i - 1, j, m, false);
        int l1 = a(i, j, m + 1, false);
        int i2 = a(i, j, m - 1, false);
        if (j1 > i1)
          i1 = j1; 
        if (k1 > i1)
          i1 = k1; 
        if (l1 > i1)
          i1 = l1; 
        if (i2 > i1)
          i1 = i2; 
        return i1;
      } 
    } 
    if (j < 0)
      return 0; 
    if (j >= this.c)
      j = this.c - 1; 
    zx chunk = c(i >> 4, m >> 4);
    i &= 0xF;
    m &= 0xF;
    return chunk.c(i, j, m, this.k);
  }
  
  public int d(int i, int j) {
    if (i < -30000000 || j < -30000000 || i >= 30000000 || j >= 30000000)
      return 0; 
    if (!g(i >> 4, j >> 4))
      return 0; 
    zx chunk = c(i >> 4, j >> 4);
    return chunk.b(i & 0xF, j & 0xF);
  }
  
  public int a(bn enumskyblock, int i, int j, int m) {
    if (this.y.e && enumskyblock == bn.a)
      return 0; 
    if (j < 0)
      j = 0; 
    if (j >= this.c && enumskyblock == bn.a)
      return 15; 
    if (j < 0 || j >= this.c || i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return enumskyblock.c; 
    int l = i >> 4;
    int i1 = m >> 4;
    if (!g(l, i1))
      return 0; 
    if (yy.s[a(i, j, m)]) {
      int j1 = b(enumskyblock, i, j + 1, m);
      int k1 = b(enumskyblock, i + 1, j, m);
      int l1 = b(enumskyblock, i - 1, j, m);
      int i2 = b(enumskyblock, i, j, m + 1);
      int j2 = b(enumskyblock, i, j, m - 1);
      if (k1 > j1)
        j1 = k1; 
      if (l1 > j1)
        j1 = l1; 
      if (i2 > j1)
        j1 = i2; 
      if (j2 > j1)
        j1 = j2; 
      return j1;
    } 
    zx chunk = c(l, i1);
    return chunk.a(enumskyblock, i & 0xF, j, m & 0xF);
  }
  
  public int b(bn enumskyblock, int i, int j, int m) {
    if (j < 0)
      j = 0; 
    if (j >= this.c)
      j = this.c - 1; 
    if (j < 0 || j >= this.c || i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return enumskyblock.c; 
    int l = i >> 4;
    int i1 = m >> 4;
    if (!g(l, i1))
      return 0; 
    zx chunk = c(l, i1);
    return chunk.a(enumskyblock, i & 0xF, j, m & 0xF);
  }
  
  public void a(bn enumskyblock, int i, int j, int m, int l) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return; 
    if (j < 0)
      return; 
    if (j >= this.c)
      return; 
    if (!g(i >> 4, m >> 4))
      return; 
    zx chunk = c(i >> 4, m >> 4);
    chunk.a(enumskyblock, i & 0xF, j, m & 0xF, l);
    for (int i1 = 0; i1 < this.z.size(); i1++)
      ((bd)this.z.get(i1)).a(i, j, m); 
  }
  
  public int a(int i, int j, int m, int l) {
    int i1 = a(bn.a, i, j, m);
    int j1 = a(bn.b, i, j, m);
    if (j1 < l)
      j1 = l; 
    return i1 << 20 | j1 << 4;
  }
  
  public float b(int i, int j, int m, int l) {
    int i1 = n(i, j, m);
    if (i1 < l)
      i1 = l; 
    return this.y.f[i1];
  }
  
  public float c(int i, int j, int m) {
    return this.y.f[n(i, j, m)];
  }
  
  public boolean l() {
    return (this.k < 4);
  }
  
  public gv a(fb vec3d, fb vec3d1) {
    if (this.useClassicRaycaster)
      return rayTraceBlocks_classic(vec3d, vec3d1, false); 
    return a(vec3d, vec3d1, false, false);
  }
  
  public gv a(fb vec3d, fb vec3d1, boolean flag) {
    if (this.useClassicRaycaster)
      return rayTraceBlocks_classic(vec3d, vec3d1, flag); 
    return a(vec3d, vec3d1, flag, false);
  }
  
  public gv rayTraceBlocks_classic(fb vec3d, fb vec3d1, boolean flag) {
    if (Double.isNaN(vec3d.a) || Double.isNaN(vec3d.b) || Double.isNaN(vec3d.c))
      return null; 
    if (Double.isNaN(vec3d1.a) || Double.isNaN(vec3d1.b) || Double.isNaN(vec3d1.c))
      return null; 
    int i = me.c(vec3d1.a);
    int j = me.c(vec3d1.b);
    int m = me.c(vec3d1.c);
    int l = me.c(vec3d.a);
    int i1 = me.c(vec3d.b);
    int j1 = me.c(vec3d.c);
    for (int k1 = 200; k1-- >= 0; ) {
      if (Double.isNaN(vec3d.a) || Double.isNaN(vec3d.b) || Double.isNaN(vec3d.c))
        return null; 
      if (l == i && i1 == j && j1 == m)
        return null; 
      double d = 999.0D;
      double d1 = 999.0D;
      double d2 = 999.0D;
      if (i > l)
        d = l + 1.0D; 
      if (i < l)
        d = l + 0.0D; 
      if (j > i1)
        d1 = i1 + 1.0D; 
      if (j < i1)
        d1 = i1 + 0.0D; 
      if (m > j1)
        d2 = j1 + 1.0D; 
      if (m < j1)
        d2 = j1 + 0.0D; 
      double d3 = 999.0D;
      double d4 = 999.0D;
      double d5 = 999.0D;
      double d6 = vec3d1.a - vec3d.a;
      double d7 = vec3d1.b - vec3d.b;
      double d8 = vec3d1.c - vec3d.c;
      if (d != 999.0D)
        d3 = (d - vec3d.a) / d6; 
      if (d1 != 999.0D)
        d4 = (d1 - vec3d.b) / d7; 
      if (d2 != 999.0D)
        d5 = (d2 - vec3d.c) / d8; 
      byte byte0 = 0;
      if (d3 < d4 && d3 < d5) {
        if (i > l) {
          byte0 = 4;
        } else {
          byte0 = 5;
        } 
        vec3d.a = d;
        vec3d.b += d7 * d3;
        vec3d.c += d8 * d3;
      } else if (d4 < d5) {
        if (j > i1) {
          byte0 = 0;
        } else {
          byte0 = 1;
        } 
        vec3d.a += d6 * d4;
        vec3d.b = d1;
        vec3d.c += d8 * d4;
      } else {
        if (m > j1) {
          byte0 = 2;
        } else {
          byte0 = 3;
        } 
        vec3d.a += d6 * d5;
        vec3d.b += d7 * d5;
        vec3d.c = d2;
      } 
      fb vec3d2 = fb.b(vec3d.a, vec3d.b, vec3d.c);
      l = (int)(vec3d2.a = me.c(vec3d.a));
      if (byte0 == 5) {
        l--;
        vec3d2.a++;
      } 
      i1 = (int)(vec3d2.b = me.c(vec3d.b));
      if (byte0 == 1) {
        i1--;
        vec3d2.b++;
      } 
      j1 = (int)(vec3d2.c = me.c(vec3d.c));
      if (byte0 == 3) {
        j1--;
        vec3d2.c++;
      } 
      int l1 = a(l, i1, j1);
      int i2 = d(l, i1, j1);
      yy block = yy.k[l1];
      if (l1 > 0 && block.a(i2, flag)) {
        gv movingobjectposition = block.a(this, l, i1, j1, vec3d, vec3d1);
        if (movingobjectposition != null)
          return movingobjectposition; 
      } 
    } 
    return null;
  }
  
  public gv a(fb vec3d, fb vec3d1, boolean flag, boolean flag1) {
    if (Double.isNaN(vec3d.a) || Double.isNaN(vec3d.b) || Double.isNaN(vec3d.c))
      return null; 
    if (Double.isNaN(vec3d1.a) || Double.isNaN(vec3d1.b) || Double.isNaN(vec3d1.c))
      return null; 
    int i = me.c(vec3d1.a);
    int j = me.c(vec3d1.b);
    int m = me.c(vec3d1.c);
    int l = me.c(vec3d.a);
    int i1 = me.c(vec3d.b);
    int j1 = me.c(vec3d.c);
    int k1 = a(l, i1, j1);
    int i2 = d(l, i1, j1);
    yy block = yy.k[k1];
    if ((!flag1 || block == null || block.b(this, l, i1, j1) != null) && k1 > 0 && block.a(i2, flag)) {
      gv movingobjectposition = block.a(this, l, i1, j1, vec3d, vec3d1);
      if (movingobjectposition != null)
        return movingobjectposition; 
    } 
    for (int l1 = 200; l1-- >= 0; ) {
      if (Double.isNaN(vec3d.a) || Double.isNaN(vec3d.b) || Double.isNaN(vec3d.c))
        return null; 
      if (l == i && i1 == j && j1 == m)
        return null; 
      boolean flag2 = true;
      boolean flag3 = true;
      boolean flag4 = true;
      double d = 999.0D;
      double d1 = 999.0D;
      double d2 = 999.0D;
      if (i > l) {
        d = l + 1.0D;
      } else if (i < l) {
        d = l + 0.0D;
      } else {
        flag2 = false;
      } 
      if (j > i1) {
        d1 = i1 + 1.0D;
      } else if (j < i1) {
        d1 = i1 + 0.0D;
      } else {
        flag3 = false;
      } 
      if (m > j1) {
        d2 = j1 + 1.0D;
      } else if (m < j1) {
        d2 = j1 + 0.0D;
      } else {
        flag4 = false;
      } 
      double d3 = 999.0D;
      double d4 = 999.0D;
      double d5 = 999.0D;
      double d6 = vec3d1.a - vec3d.a;
      double d7 = vec3d1.b - vec3d.b;
      double d8 = vec3d1.c - vec3d.c;
      if (flag2)
        d3 = (d - vec3d.a) / d6; 
      if (flag3)
        d4 = (d1 - vec3d.b) / d7; 
      if (flag4)
        d5 = (d2 - vec3d.c) / d8; 
      byte byte0 = 0;
      if (d3 < d4 && d3 < d5) {
        if (i > l) {
          byte0 = 4;
        } else {
          byte0 = 5;
        } 
        vec3d.a = d;
        vec3d.b += d7 * d3;
        vec3d.c += d8 * d3;
      } else if (d4 < d5) {
        if (j > i1) {
          byte0 = 0;
        } else {
          byte0 = 1;
        } 
        vec3d.a += d6 * d4;
        vec3d.b = d1;
        vec3d.c += d8 * d4;
      } else {
        if (m > j1) {
          byte0 = 2;
        } else {
          byte0 = 3;
        } 
        vec3d.a += d6 * d5;
        vec3d.b += d7 * d5;
        vec3d.c = d2;
      } 
      fb vec3d2 = fb.b(vec3d.a, vec3d.b, vec3d.c);
      l = (int)(vec3d2.a = me.c(vec3d.a));
      if (byte0 == 5) {
        l--;
        vec3d2.a++;
      } 
      i1 = (int)(vec3d2.b = me.c(vec3d.b));
      if (byte0 == 1) {
        i1--;
        vec3d2.b++;
      } 
      j1 = (int)(vec3d2.c = me.c(vec3d.c));
      if (byte0 == 3) {
        j1--;
        vec3d2.c++;
      } 
      int j2 = a(l, i1, j1);
      int k2 = d(l, i1, j1);
      yy block1 = yy.k[j2];
      if ((!flag1 || block1 == null || block1.b(this, l, i1, j1) != null) && j2 > 0 && block1.a(k2, flag)) {
        gv movingobjectposition1 = block1.a(this, l, i1, j1, vec3d, vec3d1);
        if (movingobjectposition1 != null)
          return movingobjectposition1; 
      } 
    } 
    return null;
  }
  
  public void a(ia entity, String s, float f, float f1) {
    for (int i = 0; i < this.z.size(); i++)
      ((bd)this.z.get(i)).a(s, entity.s, entity.t - entity.L, entity.u, f, f1); 
  }
  
  public void a(double d, double d1, double d2, String s, float f, float f1) {
    for (int i = 0; i < this.z.size(); i++)
      ((bd)this.z.get(i)).a(s, d, d1, d2, f, f1); 
  }
  
  public void a(String s, int i, int j, int m) {
    for (int l = 0; l < this.z.size(); l++)
      ((bd)this.z.get(l)).a(s, i, j, m); 
  }
  
  public void a(String s, double d, double d1, double d2, double d3, double d4, double d5) {
    for (int i = 0; i < this.z.size(); i++)
      ((bd)this.z.get(i)).a(s, d, d1, d2, d3, d4, d5); 
  }
  
  public boolean e(ia entity) {
    this.j.add(entity);
    return true;
  }
  
  public boolean a(ia entity) {
    int i = me.c(entity.s / 16.0D);
    int j = me.c(entity.u / 16.0D);
    boolean flag = false;
    if (entity instanceof vi)
      flag = true; 
    if (flag || g(i, j)) {
      if (entity instanceof vi) {
        vi entityplayer = (vi)entity;
        this.i.add(entityplayer);
        A();
      } 
      c(i, j).a(entity);
      this.g.add(entity);
      c(entity);
      return true;
    } 
    return false;
  }
  
  protected void c(ia entity) {
    for (int i = 0; i < this.z.size(); i++)
      ((bd)this.z.get(i)).a(entity); 
  }
  
  protected void d(ia entity) {
    for (int i = 0; i < this.z.size(); i++)
      ((bd)this.z.get(i)).b(entity); 
  }
  
  public void b(ia entity) {
    if (entity.m != null)
      entity.m.g((ia)null); 
    if (entity.n != null)
      entity.g((ia)null); 
    entity.v();
    if (entity instanceof vi) {
      this.i.remove(entity);
      A();
    } 
  }
  
  public void a(bd iworldaccess) {
    this.z.add(iworldaccess);
  }
  
  public void b(bd iworldaccess) {
    this.z.remove(iworldaccess);
  }
  
  public List a(ia entity, c axisalignedbb) {
    this.R.clear();
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    for (int k1 = i; k1 < j; k1++) {
      for (int l1 = i1; l1 < j1; l1++) {
        if (i(k1, this.c / 2, l1))
          for (int i2 = m - 1; i2 < l; i2++) {
            yy block = yy.k[a(k1, i2, l1)];
            if (block != null)
              block.a(this, k1, i2, l1, axisalignedbb, this.R); 
          }  
      } 
    } 
    double d = 0.25D;
    List<ia> list = b(entity, axisalignedbb.b(d, d, d));
    for (int j2 = 0; j2 < list.size(); j2++) {
      c axisalignedbb1 = ((ia)list.get(j2)).A();
      if (axisalignedbb1 != null && axisalignedbb1.a(axisalignedbb))
        this.R.add(axisalignedbb1); 
      axisalignedbb1 = entity.f(list.get(j2));
      if (axisalignedbb1 != null && axisalignedbb1.a(axisalignedbb))
        this.R.add(axisalignedbb1); 
    } 
    return this.R;
  }
  
  public int a(float f) {
    float maxSkylight = this.totalSkyLight;
    if (this.totalSkyLight == 16 || this.y instanceof ol)
      maxSkylight = 15.0F; 
    float f1 = c(f);
    float f2 = 1.0F - me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    f2 = 1.0F - f2;
    f2 = (float)(f2 * (1.0D - (j(f) * 5.0F) / 16.0D));
    f2 = (float)(f2 * (1.0D - (i(f) * 5.0F) / 16.0D));
    f2 = 1.0F - f2;
    return (int)(f2 * (maxSkylight - 4.0F) + 15.0F - maxSkylight);
  }
  
  public float b(float f) {
    float f1 = c(f);
    float f2 = 1.0F - me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.2F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    f2 = 1.0F - f2;
    f2 = (float)(f2 * (1.0D - (j(f) * 5.0F) / 16.0D));
    f2 = (float)(f2 * (1.0D - (i(f) * 5.0F) / 16.0D));
    return f2 * 0.8F + 0.2F;
  }
  
  public fb computeFogColor(float f) {
    float f1 = c(f);
    float f2 = me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = (float)(this.fogColor >> 16L & 0xFFL) / 255.0F;
    float f4 = (float)(this.fogColor >> 8L & 0xFFL) / 255.0F;
    float f5 = (float)(this.fogColor & 0xFFL) / 255.0F;
    f3 *= f2 * 0.94F + 0.06F;
    f4 *= f2 * 0.94F + 0.06F;
    f5 *= f2 * 0.91F + 0.09F;
    return fb.b(f3, f4, f5);
  }
  
  public fb a(ia entity, float f) {
    if (((Boolean)mod_noBiomesX.UseOldBiomes.get()).booleanValue() || (ModLoader.getMinecraftInstance()).h.bK == 1) {
      float f8 = c(f);
      float f10 = me.b(f8 * 3.141593F * 2.0F) * 2.0F + 0.5F;
      if (f10 < 0.0F)
        f10 = 0.0F; 
      if (f10 > 1.0F)
        f10 = 1.0F; 
      int i = me.c(entity.s);
      int j = me.c(entity.u);
      float f11 = a().a(i, 64, j);
      int m = a().oldGetBiomeGenAt(i, j).getSkyColorByTemp(f11);
      float f12 = (m >> 16 & 0xFF) / 255.0F;
      float f13 = (m >> 8 & 0xFF) / 255.0F;
      float f6 = (m & 0xFF) / 255.0F;
      f12 *= f10;
      f13 *= f10;
      f6 *= f10;
      float f7 = j(f);
      if (f7 > 0.0F) {
        float f14 = (f12 * 0.3F + f13 * 0.59F + f6 * 0.11F) * 0.6F;
        float f15 = 1.0F - f7 * 0.75F;
        f12 = f12 * f15 + f14 * (1.0F - f15);
        f13 = f13 * f15 + f14 * (1.0F - f15);
        f6 = f6 * f15 + f14 * (1.0F - f15);
      } 
      float f9 = i(f);
      if (f9 > 0.0F) {
        float f14 = (f12 * 0.3F + f13 * 0.59F + f6 * 0.11F) * 0.2F;
        float f15 = 1.0F - f9 * 0.75F;
        f12 = f12 * f15 + f14 * (1.0F - f15);
        f13 = f13 * f15 + f14 * (1.0F - f15);
        f6 = f6 * f15 + f14 * (1.0F - f15);
      } 
      if (this.s > 0) {
        float f14 = this.s - f;
        if (f14 > 1.0F)
          f14 = 1.0F; 
        f14 *= 0.45F;
        f12 = f12 * (1.0F - f14) + 0.8F * f14;
        f13 = f13 * (1.0F - f14) + 0.8F * f14;
        f6 = f6 * (1.0F - f14) + 1.0F * f14;
      } 
      return fb.b(f12, f13, f6);
    } 
    float f1 = c(f);
    float f2 = me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = (float)(this.skyColor >> 16L & 0xFFL) / 255.0F;
    float f4 = (float)(this.skyColor >> 8L & 0xFFL) / 255.0F;
    float f5 = (float)(this.skyColor & 0xFFL) / 255.0F;
    f3 *= f2;
    f4 *= f2;
    f5 *= f2;
    return fb.b(f3, f4, f5);
  }
  
  public float c(float f) {
    if (this.totalSkyLight == 16)
      return 1.0F; 
    return this.y.a(this.C.f(), f);
  }
  
  public int d(float f) {
    return this.y.b(this.C.f(), f);
  }
  
  public float e(float f) {
    float f1 = c(f);
    return f1 * 3.141593F * 2.0F;
  }
  
  public fb f(float f) {
    float f1 = c(f);
    float f2 = me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = (float)(this.O >> 16L & 0xFFL) / 255.0F;
    float f4 = (float)(this.O >> 8L & 0xFFL) / 255.0F;
    float f5 = (float)(this.O & 0xFFL) / 255.0F;
    float f6 = j(f);
    if (f6 > 0.0F) {
      float f7 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
      float f9 = 1.0F - f6 * 0.95F;
      f3 = f3 * f9 + f7 * (1.0F - f9);
      f4 = f4 * f9 + f7 * (1.0F - f9);
      f5 = f5 * f9 + f7 * (1.0F - f9);
    } 
    f3 *= f2 * 0.9F + 0.1F;
    f4 *= f2 * 0.9F + 0.1F;
    f5 *= f2 * 0.85F + 0.15F;
    float f8 = i(f);
    if (f8 > 0.0F) {
      float f10 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
      float f11 = 1.0F - f8 * 0.95F;
      f3 = f3 * f11 + f10 * (1.0F - f11);
      f4 = f4 * f11 + f10 * (1.0F - f11);
      f5 = f5 * f11 + f10 * (1.0F - f11);
    } 
    return fb.b(f3, f4, f5);
  }
  
  public fb g(float f) {
    if (this.fogColor != 0L && (ModLoader.getMinecraftInstance()).h.bK == 0)
      return computeFogColor(f); 
    float f1 = c(f);
    return this.y.b(f1, f);
  }
  
  public int e(int i, int j) {
    return b(i, j).c(i & 0xF, j & 0xF);
  }
  
  public int f(int i, int j) {
    zx chunk = b(i, j);
    int m = this.c - 1;
    i &= 0xF;
    j &= 0xF;
    while (m > 0) {
      int l = chunk.a(i, m, j);
      if (l == 0 || !(yy.k[l]).bZ.d() || (yy.k[l]).bZ == p.i) {
        m--;
        continue;
      } 
      return m + 1;
    } 
    return -1;
  }
  
  public float h(float f) {
    float f1 = c(f);
    float f2 = 1.0F - me.b(f1 * 3.141593F * 2.0F) * 2.0F + 0.75F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    return f2 * f2 * 0.5F;
  }
  
  public void a(int i, int j, int m, int l, int i1) {
    ahn nextticklistentry = new ahn(i, j, m, l);
    byte byte0 = 8;
    if (this.f) {
      if (b(nextticklistentry.a - byte0, nextticklistentry.b - byte0, nextticklistentry.c - byte0, nextticklistentry.a + byte0, nextticklistentry.b + byte0, nextticklistentry.c + byte0)) {
        int j1 = a(nextticklistentry.a, nextticklistentry.b, nextticklistentry.c);
        if (j1 == nextticklistentry.d && j1 > 0)
          yy.k[j1].a(this, nextticklistentry.a, nextticklistentry.b, nextticklistentry.c, this.w); 
      } 
      return;
    } 
    if (b(i - byte0, j - byte0, m - byte0, i + byte0, j + byte0, m + byte0)) {
      if (l > 0)
        nextticklistentry.a(i1 + this.C.f()); 
      if (!this.L.contains(nextticklistentry)) {
        this.L.add(nextticklistentry);
        this.K.add(nextticklistentry);
      } 
    } 
  }
  
  public void e(int i, int j, int m, int l, int i1) {
    ahn nextticklistentry = new ahn(i, j, m, l);
    if (l > 0)
      nextticklistentry.a(i1 + this.C.f()); 
    if (!this.L.contains(nextticklistentry)) {
      this.L.add(nextticklistentry);
      this.K.add(nextticklistentry);
    } 
  }
  
  public void m() {
    pf.a("entities");
    pf.a("global");
    for (int i = 0; i < this.j.size(); i++) {
      ia entity = this.j.get(i);
      entity.a();
      if (entity.K)
        this.j.remove(i--); 
    } 
    pf.c("remove");
    this.g.removeAll(this.J);
    for (int j = 0; j < this.J.size(); j++) {
      ia entity1 = this.J.get(j);
      int i1 = entity1.ai;
      int k1 = entity1.ak;
      if (entity1.ah && g(i1, k1))
        c(i1, k1).b(entity1); 
    } 
    for (int m = 0; m < this.J.size(); m++)
      d(this.J.get(m)); 
    this.J.clear();
    pf.c("regular");
    for (int l = 0; l < this.g.size(); l++) {
      ia entity2 = this.g.get(l);
      if (entity2.n != null) {
        if (!entity2.n.K && entity2.n.m == entity2)
          continue; 
        entity2.n.m = null;
        entity2.n = null;
      } 
      if (!entity2.K)
        f(entity2); 
      pf.a("remove");
      if (entity2.K) {
        int j1 = entity2.ai;
        int l1 = entity2.ak;
        if (entity2.ah && g(j1, l1))
          c(j1, l1).b(entity2); 
        this.g.remove(l--);
        d(entity2);
      } 
      pf.b();
      continue;
    } 
    pf.c("tileEntities");
    this.S = true;
    Iterator<bq> iterator = this.h.iterator();
    while (iterator.hasNext()) {
      bq tileentity = iterator.next();
      if (!tileentity.i() && tileentity.c != null && i(tileentity.d, tileentity.e, tileentity.f))
        tileentity.b(); 
      if (tileentity.i()) {
        iterator.remove();
        if (g(tileentity.d >> 4, tileentity.f >> 4)) {
          zx chunk = c(tileentity.d >> 4, tileentity.f >> 4);
          if (chunk != null)
            chunk.e(tileentity.d & 0xF, tileentity.e, tileentity.f & 0xF); 
        } 
      } 
    } 
    this.S = false;
    if (!this.N.isEmpty()) {
      this.h.removeAll(this.N);
      this.N.clear();
    } 
    pf.c("pendingTileEntities");
    if (!this.M.isEmpty()) {
      Iterator<bq> iterator1 = this.M.iterator();
      while (iterator1.hasNext()) {
        bq tileentity1 = iterator1.next();
        if (!tileentity1.i()) {
          if (!this.h.contains(tileentity1))
            this.h.add(tileentity1); 
          if (g(tileentity1.d >> 4, tileentity1.f >> 4)) {
            zx chunk1 = c(tileentity1.d >> 4, tileentity1.f >> 4);
            if (chunk1 != null)
              chunk1.a(tileentity1.d & 0xF, tileentity1.e, tileentity1.f & 0xF, tileentity1); 
          } 
          j(tileentity1.d, tileentity1.e, tileentity1.f);
        } 
      } 
      this.M.clear();
    } 
    pf.b();
    pf.b();
  }
  
  public void a(Collection collection) {
    if (this.S) {
      this.M.addAll(collection);
    } else {
      this.h.addAll(collection);
    } 
  }
  
  public void f(ia entity) {
    a(entity, true);
  }
  
  public void a(ia entity, boolean flag) {
    int i = me.c(entity.s);
    int j = me.c(entity.u);
    byte byte0 = 32;
    if (flag && !b(i - byte0, 0, j - byte0, i + byte0, this.c, j + byte0))
      return; 
    entity.R = entity.s;
    entity.S = entity.t;
    entity.T = entity.u;
    entity.A = entity.y;
    entity.B = entity.z;
    if (flag && entity.ah)
      if (entity.n != null) {
        entity.M();
      } else {
        entity.a();
      }  
    pf.a("chunkCheck");
    if (Double.isNaN(entity.s) || Double.isInfinite(entity.s))
      entity.s = entity.R; 
    if (Double.isNaN(entity.t) || Double.isInfinite(entity.t))
      entity.t = entity.S; 
    if (Double.isNaN(entity.u) || Double.isInfinite(entity.u))
      entity.u = entity.T; 
    if (Double.isNaN(entity.z) || Double.isInfinite(entity.z))
      entity.z = entity.B; 
    if (Double.isNaN(entity.y) || Double.isInfinite(entity.y))
      entity.y = entity.A; 
    int m = me.c(entity.s / 16.0D);
    int l = me.c(entity.t / 16.0D);
    int i1 = me.c(entity.u / 16.0D);
    if (!entity.ah || entity.ai != m || entity.aj != l || entity.ak != i1) {
      if (entity.ah && g(entity.ai, entity.ak))
        c(entity.ai, entity.ak).a(entity, entity.aj); 
      if (g(m, i1)) {
        entity.ah = true;
        c(m, i1).a(entity);
      } else {
        entity.ah = false;
      } 
    } 
    pf.b();
    if (flag && entity.ah && entity.m != null)
      if (entity.m.K || entity.m.n != entity) {
        entity.m.n = null;
        entity.m = null;
      } else {
        f(entity.m);
      }  
  }
  
  public boolean a(c axisalignedbb) {
    List<ia> list = b((ia)null, axisalignedbb);
    for (int i = 0; i < list.size(); i++) {
      ia entity = list.get(i);
      if (!entity.K && entity.l)
        return false; 
    } 
    return true;
  }
  
  public boolean b(c axisalignedbb) {
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    if (axisalignedbb.a < 0.0D)
      i--; 
    if (axisalignedbb.b < 0.0D)
      m--; 
    if (axisalignedbb.c < 0.0D)
      i1--; 
    for (int k1 = i; k1 < j; k1++) {
      for (int l1 = m; l1 < l; l1++) {
        for (int i2 = i1; i2 < j1; i2++) {
          yy block = yy.k[a(k1, l1, i2)];
          if (block != null && block.bZ.a())
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public boolean c(c axisalignedbb) {
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    if (b(i, m, i1, j, l, j1))
      for (int k1 = i; k1 < j; k1++) {
        for (int l1 = m; l1 < l; l1++) {
          for (int i2 = i1; i2 < j1; i2++) {
            int j2 = a(k1, l1, i2);
            if (j2 == yy.ar.bM || j2 == yy.C.bM || j2 == yy.D.bM)
              return true; 
          } 
        } 
      }  
    return false;
  }
  
  public boolean a(c axisalignedbb, p material, ia entity) {
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    if (!b(i, m, i1, j, l, j1))
      return false; 
    boolean flag = false;
    fb vec3d = fb.b(0.0D, 0.0D, 0.0D);
    for (int k1 = i; k1 < j; k1++) {
      for (int l1 = m; l1 < l; l1++) {
        for (int i2 = i1; i2 < j1; i2++) {
          yy block = yy.k[a(k1, l1, i2)];
          if (block != null && block.bZ == material) {
            double d1 = ((l1 + 1) - agw.e(d(k1, l1, i2)));
            if (l >= d1) {
              flag = true;
              block.a(this, k1, l1, i2, entity, vec3d);
            } 
          } 
        } 
      } 
    } 
    if (vec3d.d() > 0.0D) {
      vec3d = vec3d.c();
      double d = 0.014D;
      entity.v += vec3d.a * d;
      entity.w += vec3d.b * d;
      entity.x += vec3d.c * d;
    } 
    return flag;
  }
  
  public boolean a(c axisalignedbb, p material) {
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    for (int k1 = i; k1 < j; k1++) {
      for (int l1 = m; l1 < l; l1++) {
        for (int i2 = i1; i2 < j1; i2++) {
          yy block = yy.k[a(k1, l1, i2)];
          if (block != null && block.bZ == material)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public boolean b(c axisalignedbb, p material) {
    int i = me.c(axisalignedbb.a);
    int j = me.c(axisalignedbb.d + 1.0D);
    int m = me.c(axisalignedbb.b);
    int l = me.c(axisalignedbb.e + 1.0D);
    int i1 = me.c(axisalignedbb.c);
    int j1 = me.c(axisalignedbb.f + 1.0D);
    for (int k1 = i; k1 < j; k1++) {
      for (int l1 = m; l1 < l; l1++) {
        for (int i2 = i1; i2 < j1; i2++) {
          yy block = yy.k[a(k1, l1, i2)];
          if (block != null && block.bZ == material) {
            int j2 = d(k1, l1, i2);
            double d = (l1 + 1);
            if (j2 < 8)
              d = (l1 + 1) - j2 / 8.0D; 
            if (d >= axisalignedbb.b)
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public xp a(ia entity, double d, double d1, double d2, float f) {
    return a(entity, d, d1, d2, f, false);
  }
  
  public xp a(ia entity, double d, double d1, double d2, float f, boolean flag) {
    xp explosion = new xp(this, entity, d, d1, d2, f);
    explosion.a = flag;
    explosion.a();
    explosion.a(true);
    return explosion;
  }
  
  public float a(fb vec3d, c axisalignedbb) {
    double d = 1.0D / ((axisalignedbb.d - axisalignedbb.a) * 2.0D + 1.0D);
    double d1 = 1.0D / ((axisalignedbb.e - axisalignedbb.b) * 2.0D + 1.0D);
    double d2 = 1.0D / ((axisalignedbb.f - axisalignedbb.c) * 2.0D + 1.0D);
    int i = 0;
    int j = 0;
    float f;
    for (f = 0.0F; f <= 1.0F; f = (float)(f + d)) {
      float f1;
      for (f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d1)) {
        float f2;
        for (f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d2)) {
          double d3 = axisalignedbb.a + (axisalignedbb.d - axisalignedbb.a) * f;
          double d4 = axisalignedbb.b + (axisalignedbb.e - axisalignedbb.b) * f1;
          double d5 = axisalignedbb.c + (axisalignedbb.f - axisalignedbb.c) * f2;
          if (a(fb.b(d3, d4, d5), vec3d) == null)
            i++; 
          j++;
        } 
      } 
    } 
    return i / j;
  }
  
  public void a(vi entityplayer, int i, int j, int m, int l) {
    if (l == 0)
      j--; 
    if (l == 1)
      j++; 
    if (l == 2)
      m--; 
    if (l == 3)
      m++; 
    if (l == 4)
      i--; 
    if (l == 5)
      i++; 
    if (a(i, j, m) == yy.ar.bM) {
      a(entityplayer, 1004, i, j, m, 0);
      g(i, j, m, 0);
    } 
  }
  
  public ia a(Class class1) {
    return null;
  }
  
  public String n() {
    return "All: " + this.g.size();
  }
  
  public String o() {
    return this.A.c();
  }
  
  public bq b(int i, int j, int m) {
    zx chunk = c(i >> 4, m >> 4);
    if (chunk == null)
      return null; 
    bq tileentity = chunk.d(i & 0xF, j, m & 0xF);
    if (tileentity == null) {
      Iterator<bq> iterator = this.M.iterator();
      while (iterator.hasNext()) {
        bq tileentity1 = iterator.next();
        if (!tileentity1.i() && tileentity1.d == i && tileentity1.e == j && tileentity1.f == m) {
          tileentity = tileentity1;
          break;
        } 
      } 
    } 
    return tileentity;
  }
  
  public void a(int i, int j, int m, bq tileentity) {
    if (tileentity != null && !tileentity.i())
      if (this.S) {
        tileentity.d = i;
        tileentity.e = j;
        tileentity.f = m;
        this.M.add(tileentity);
      } else {
        this.h.add(tileentity);
        zx chunk = c(i >> 4, m >> 4);
        if (chunk != null)
          chunk.a(i & 0xF, j, m & 0xF, tileentity); 
      }  
  }
  
  public void o(int i, int j, int m) {
    bq tileentity = b(i, j, m);
    if (tileentity != null && this.S) {
      tileentity.l();
      this.M.remove(tileentity);
    } else {
      if (tileentity != null) {
        this.M.remove(tileentity);
        this.h.remove(tileentity);
      } 
      zx chunk = c(i >> 4, m >> 4);
      if (chunk != null)
        chunk.e(i & 0xF, j, m & 0xF); 
    } 
  }
  
  public void a(bq tileentity) {
    this.N.add(tileentity);
  }
  
  public boolean f(int i, int j, int m) {
    yy block = yy.k[a(i, j, m)];
    if (block == null)
      return false; 
    return block.a();
  }
  
  public boolean g(int i, int j, int m) {
    yy block = yy.k[a(i, j, m)];
    if (block == null)
      return false; 
    if (block == yy.bd)
      return true; 
    return (block.bZ.j() && block.b());
  }
  
  public boolean b(int i, int j, int m, boolean flag) {
    if (i < -30000000 || m < -30000000 || i >= 30000000 || m >= 30000000)
      return flag; 
    zx chunk = this.A.b(i >> 4, m >> 4);
    if (chunk == null || chunk.h())
      return flag; 
    yy block = yy.k[a(i, j, m)];
    if (block == null)
      return false; 
    return (block.bZ.j() && block.b());
  }
  
  public void a(rz iprogressupdate) {
    a(true, iprogressupdate);
    try {
      ll.a.a();
    } catch (InterruptedException interruptedexception) {
      interruptedexception.printStackTrace();
    } 
  }
  
  public void p() {
    int i = a(1.0F);
    if (i != this.k)
      this.k = i; 
  }
  
  public void a(boolean flag, boolean flag1) {
    this.F = flag;
    this.G = flag1;
  }
  
  public void c() {
    if (z().s() && this.v < 3)
      this.v = 3; 
    a().b();
    if (C()) {
      boolean flag = false;
      if (this.F)
        if (this.v < 1); 
      if (!flag) {
        long l = this.C.f() + 24000L;
        this.C.a(l - l % 24000L);
        B();
      } 
    } 
    pf.a("mobSpawner");
    int dim = (ModLoader.getMinecraftInstance()).h.bK;
    if (this.useOldSpawners && dim == 0) {
      this.animalSpawner.func_1150_a(this);
      this.monsterSpawner.func_1150_a(this);
    } else {
      we.a(this, this.F, this.G);
    } 
    pf.c("chunkSource");
    this.A.a();
    int i = a(1.0F);
    if (i != this.k)
      this.k = i; 
    long l1 = this.C.f() + 1L;
    if (l1 % this.u == 0L) {
      pf.c("save");
      a(false, (rz)null);
    } 
    this.C.a(l1);
    pf.c("tickPending");
    a(false);
    pf.c("tickTiles");
    f();
    pf.b();
  }
  
  private void H() {
    if (this.C.o()) {
      this.o = 1.0F;
      if (this.C.m())
        this.q = 1.0F; 
    } 
  }
  
  protected void h() {
    if (this.y.e)
      return; 
    if (this.r > 0)
      this.r--; 
    int i = this.C.n();
    if (i <= 0) {
      if (this.C.m()) {
        this.C.e(this.w.nextInt(12000) + 3600);
      } else {
        this.C.e(this.w.nextInt(168000) + 12000);
      } 
    } else {
      i--;
      this.C.e(i);
      if (i <= 0)
        this.C.a(!this.C.m()); 
    } 
    int j = this.C.p();
    if (j <= 0) {
      if (this.C.o()) {
        this.C.f(this.w.nextInt(12000) + 12000);
      } else {
        this.C.f(this.w.nextInt(168000) + 12000);
      } 
    } else {
      j--;
      this.C.f(j);
      if (j <= 0)
        this.C.b(!this.C.o()); 
    } 
    this.n = this.o;
    if (this.C.o()) {
      this.o = (float)(this.o + 0.01D);
    } else {
      this.o = (float)(this.o - 0.01D);
    } 
    if (this.o < 0.0F)
      this.o = 0.0F; 
    if (this.o > 1.0F)
      this.o = 1.0F; 
    this.p = this.q;
    if (this.C.m()) {
      this.q = (float)(this.q + 0.01D);
    } else {
      this.q = (float)(this.q - 0.01D);
    } 
    if (this.q < 0.0F)
      this.q = 0.0F; 
    if (this.q > 1.0F)
      this.q = 1.0F; 
  }
  
  private void I() {
    this.C.f(0);
    this.C.b(false);
    this.C.e(0);
    this.C.a(false);
  }
  
  protected void f() {
    this.T.clear();
    pf.a("buildList");
    for (int i = 0; i < this.i.size(); i++) {
      vi entityplayer = this.i.get(i);
      int l = me.c(entityplayer.s / 16.0D);
      int i1 = me.c(entityplayer.u / 16.0D);
      byte byte0 = 7;
      for (int k1 = -byte0; k1 <= byte0; k1++) {
        for (int i2 = -byte0; i2 <= byte0; i2++)
          this.T.add(new acm(k1 + l, i2 + i1)); 
      } 
    } 
    if (this.U > 0)
      this.U--; 
    int j = 0;
    int m = 0;
    pf.b();
    for (Iterator<acm> iterator = this.T.iterator(); iterator.hasNext(); pf.b()) {
      acm chunkcoordintpair = iterator.next();
      int j1 = chunkcoordintpair.a * 16;
      int l1 = chunkcoordintpair.b * 16;
      pf.a("getChunk");
      zx chunk = c(chunkcoordintpair.a, chunkcoordintpair.b);
      pf.c("tickChunk");
      chunk.j();
      pf.c("moodSound");
      if (this.U == 0) {
        this.l = this.l * 3 + 1013904223;
        int j2 = this.l >> 2;
        int j3 = j2 & 0xF;
        int j4 = j2 >> 8 & 0xF;
        int j5 = j2 >> 16 & this.d;
        int j6 = chunk.a(j3, j5, j4);
        j3 += j1;
        j4 += l1;
        if (j6 == 0 && m(j3, j5, j4) <= this.w.nextInt(8) && b(bn.a, j3, j5, j4) <= 0) {
          vi entityplayer1 = a(j3 + 0.5D, j5 + 0.5D, j4 + 0.5D, 8.0D);
          if (entityplayer1 != null && entityplayer1.f(j3 + 0.5D, j5 + 0.5D, j4 + 0.5D) > 4.0D) {
            a(j3 + 0.5D, j5 + 0.5D, j4 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.w.nextFloat() * 0.2F);
            this.U = this.w.nextInt(12000) + 6000;
          } 
        } 
      } 
      pf.c("thunder");
      if (this.w.nextInt(100000) == 0 && E() && D()) {
        this.l = this.l * 3 + 1013904223;
        int k2 = this.l >> 2;
        int k3 = j1 + (k2 & 0xF);
        int k4 = l1 + (k2 >> 8 & 0xF);
        int k5 = e(k3, k4);
        if (w(k3, k5, k4)) {
          e((ia)new su(this, k3, k5, k4));
          this.r = 2;
        } 
      } 
      pf.c("iceandsnow");
      if (this.w.nextInt(4) == 0) {
        this.l = this.l * 3 + 1013904223;
        int l2 = this.l >> 2;
        int l3 = l2 & 0xF;
        int l4 = l2 >> 8 & 0xF;
        int l5 = e(l3 + j1, l4 + l1);
        if (this.C.getSnowCovered() && l5 >= 0 && l5 < 128 && chunk.a(bn.b, l3, l5, l4) < 10) {
          int i6 = chunk.a(l3, l5 - 1, l4);
          int k6 = chunk.a(l3, l5, l4);
          if (this.C.getSnowCovered() && k6 == 0 && yy.aS.c(this, l3 + j1, l5, l4 + l1) && i6 != 0 && i6 != yy.aT.bM && (yy.k[i6]).bZ.d())
            g(l3 + j1, l5, l4 + l1, yy.aS.bM); 
          if ((i6 == yy.A.bM || i6 == yy.B.bM) && chunk.b(l3, l5 - 1, l4) == 0)
            g(l3 + j1, l5 - 1, l4 + l1, yy.aT.bM); 
        } 
      } 
      pf.c("checkLight");
      s(j1 + this.w.nextInt(16), this.w.nextInt(this.c), l1 + this.w.nextInt(16));
      pf.c("tickTiles");
      for (int i3 = 0; i3 < 20; i3++) {
        this.l = this.l * 3 + 1013904223;
        int i4 = this.l >> 2;
        int i5 = i4 & 0xF;
        int i6 = i4 >> 8 & 0xF;
        int k6 = i4 >> 16 & this.d;
        int l6 = chunk.b[i5 << this.b | i6 << this.a | k6] & 0xFF;
        m++;
        if (yy.l[l6]) {
          j++;
          yy.k[l6].a(this, i5 + j1, k6, i6 + l1, this.w);
        } 
      } 
    } 
  }
  
  public boolean p(int i, int j, int m) {
    return c(i, j, m, false);
  }
  
  public boolean q(int i, int j, int m) {
    return c(i, j, m, true);
  }
  
  public boolean c(int i, int j, int m, boolean flag) {
    float f = a().a(i, j, m);
    if (f > 0.15F)
      return false; 
    if (j >= 0 && j < this.c && b(bn.b, i, j, m) < 10) {
      int l = a(i, j, m);
      if ((l == yy.B.bM || l == yy.A.bM) && d(i, j, m) == 0) {
        if (!flag)
          return true; 
        boolean flag1 = true;
        if (flag1 && e(i - 1, j, m) != p.g)
          flag1 = false; 
        if (flag1 && e(i + 1, j, m) != p.g)
          flag1 = false; 
        if (flag1 && e(i, j, m - 1) != p.g)
          flag1 = false; 
        if (flag1 && e(i, j, m + 1) != p.g)
          flag1 = false; 
        if (!flag1)
          return true; 
      } 
    } 
    return false;
  }
  
  public boolean r(int i, int j, int m) {
    float f = a().a(i, j, m);
    if (f > 0.15F)
      return false; 
    if (j >= 0 && j < this.c && b(bn.b, i, j, m) < 10) {
      int l = a(i, j - 1, m);
      int i1 = a(i, j, m);
      if (i1 == 0 && yy.aS.c(this, i, j, m) && l != 0 && l != yy.aT.bM && (yy.k[l]).bZ.d())
        return true; 
    } 
    return false;
  }
  
  public void s(int i, int j, int m) {
    if (!this.y.e)
      c(bn.a, i, j, m); 
    c(bn.b, i, j, m);
  }
  
  private int a(int i, int j, int m, int l, int i1, int j1) {
    int k1 = 0;
    if (l(j, m, l)) {
      k1 = 15;
    } else {
      if (j1 == 0)
        j1 = 1; 
      for (int l1 = 0; l1 < 6; l1++) {
        int i2 = l1 % 2 * 2 - 1;
        int j2 = j + l1 / 2 % 3 / 2 * i2;
        int k2 = m + (l1 / 2 + 1) % 3 / 2 * i2;
        int l2 = l + (l1 / 2 + 2) % 3 / 2 * i2;
        int i3 = b(bn.a, j2, k2, l2) - j1;
        if (i3 > k1)
          k1 = i3; 
      } 
    } 
    return k1;
  }
  
  private int d(int i, int j, int m, int l, int i1, int j1) {
    int k1 = yy.q[i1];
    int l1 = b(bn.b, j - 1, m, l) - j1;
    int i2 = b(bn.b, j + 1, m, l) - j1;
    int j2 = b(bn.b, j, m - 1, l) - j1;
    int k2 = b(bn.b, j, m + 1, l) - j1;
    int l2 = b(bn.b, j, m, l - 1) - j1;
    int i3 = b(bn.b, j, m, l + 1) - j1;
    if (l1 > k1)
      k1 = l1; 
    if (i2 > k1)
      k1 = i2; 
    if (j2 > k1)
      k1 = j2; 
    if (k2 > k1)
      k1 = k2; 
    if (l2 > k1)
      k1 = l2; 
    if (i3 > k1)
      k1 = i3; 
    return k1;
  }
  
  public void c(bn enumskyblock, int i, int j, int m) {
    if (!e(i, j, m, 17))
      return; 
    int l = 0;
    int i1 = 0;
    int j1 = b(enumskyblock, i, j, m);
    int l1 = 0;
    int j2 = j1;
    int i3 = a(i, j, m);
    int l3 = yy.o[i3];
    if (l3 == 0)
      l3 = 1; 
    int k4 = 0;
    if (enumskyblock == bn.a) {
      k4 = a(j2, i, j, m, i3, l3);
    } else {
      k4 = d(j2, i, j, m, i3, l3);
    } 
    l1 = k4;
    if (l1 > j1) {
      this.H[i1++] = 133152;
    } else if (l1 < j1) {
      if (enumskyblock == bn.b);
      this.H[i1++] = 133152 + (j1 << 18);
      while (l < i1) {
        int k2 = this.H[l++];
        int j3 = (k2 & 0x3F) - 32 + i;
        int i4 = (k2 >> 6 & 0x3F) - 32 + j;
        int l4 = (k2 >> 12 & 0x3F) - 32 + m;
        int j5 = k2 >> 18 & 0xF;
        int l5 = b(enumskyblock, j3, i4, l4);
        if (l5 == j5) {
          a(enumskyblock, j3, i4, l4, 0);
          if (j5 > 0) {
            int k6 = j3 - i;
            int i7 = i4 - j;
            int k7 = l4 - m;
            if (k6 < 0)
              k6 = -k6; 
            if (i7 < 0)
              i7 = -i7; 
            if (k7 < 0)
              k7 = -k7; 
            if (k6 + i7 + k7 < 17) {
              int i8 = 0;
              while (i8 < 6) {
                int j8 = i8 % 2 * 2 - 1;
                int k8 = j3 + i8 / 2 % 3 / 2 * j8;
                int l8 = i4 + (i8 / 2 + 1) % 3 / 2 * j8;
                int i9 = l4 + (i8 / 2 + 2) % 3 / 2 * j8;
                int i6 = b(enumskyblock, k8, l8, i9);
                int j9 = yy.o[a(k8, l8, i9)];
                if (j9 == 0)
                  j9 = 1; 
                if (i6 == j5 - j9)
                  this.H[i1++] = k8 - i + 32 + (l8 - j + 32 << 6) + (i9 - m + 32 << 12) + (j5 - j9 << 18); 
                i8++;
              } 
            } 
          } 
        } 
      } 
      l = 0;
    } 
    while (l < i1) {
      int k1 = this.H[l++];
      int i2 = (k1 & 0x3F) - 32 + i;
      int l2 = (k1 >> 6 & 0x3F) - 32 + j;
      int k3 = (k1 >> 12 & 0x3F) - 32 + m;
      int j4 = b(enumskyblock, i2, l2, k3);
      int i5 = a(i2, l2, k3);
      int k5 = yy.o[i5];
      if (k5 == 0)
        k5 = 1; 
      int j6 = 0;
      if (enumskyblock == bn.a) {
        j6 = a(j4, i2, l2, k3, i5, k5);
      } else {
        j6 = d(j4, i2, l2, k3, i5, k5);
      } 
      if (j6 != j4) {
        a(enumskyblock, i2, l2, k3, j6);
        if (j6 > j4) {
          int l6 = i2 - i;
          int j7 = l2 - j;
          int l7 = k3 - m;
          if (l6 < 0)
            l6 = -l6; 
          if (j7 < 0)
            j7 = -j7; 
          if (l7 < 0)
            l7 = -l7; 
          if (l6 + j7 + l7 < 17 && i1 < this.H.length - 6) {
            if (b(enumskyblock, i2 - 1, l2, k3) < j6)
              this.H[i1++] = i2 - 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - m + 32 << 12); 
            if (b(enumskyblock, i2 + 1, l2, k3) < j6)
              this.H[i1++] = i2 + 1 - i + 32 + (l2 - j + 32 << 6) + (k3 - m + 32 << 12); 
            if (b(enumskyblock, i2, l2 - 1, k3) < j6)
              this.H[i1++] = i2 - i + 32 + (l2 - 1 - j + 32 << 6) + (k3 - m + 32 << 12); 
            if (b(enumskyblock, i2, l2 + 1, k3) < j6)
              this.H[i1++] = i2 - i + 32 + (l2 + 1 - j + 32 << 6) + (k3 - m + 32 << 12); 
            if (b(enumskyblock, i2, l2, k3 - 1) < j6)
              this.H[i1++] = i2 - i + 32 + (l2 - j + 32 << 6) + (k3 - 1 - m + 32 << 12); 
            if (b(enumskyblock, i2, l2, k3 + 1) < j6)
              this.H[i1++] = i2 - i + 32 + (l2 - j + 32 << 6) + (k3 + 1 - m + 32 << 12); 
          } 
        } 
      } 
    } 
  }
  
  public boolean a(boolean flag) {
    int i = this.K.size();
    if (i != this.L.size())
      throw new IllegalStateException("TickNextTick list out of synch"); 
    if (i > 1000)
      i = 1000; 
    for (int j = 0; j < i; j++) {
      ahn nextticklistentry = this.K.first();
      if (!flag && nextticklistentry.e > this.C.f())
        break; 
      this.K.remove(nextticklistentry);
      this.L.remove(nextticklistentry);
      byte byte0 = 8;
      if (b(nextticklistentry.a - byte0, nextticklistentry.b - byte0, nextticklistentry.c - byte0, nextticklistentry.a + byte0, nextticklistentry.b + byte0, nextticklistentry.c + byte0)) {
        int m = a(nextticklistentry.a, nextticklistentry.b, nextticklistentry.c);
        if (m == nextticklistentry.d && m > 0)
          yy.k[m].a(this, nextticklistentry.a, nextticklistentry.b, nextticklistentry.c, this.w); 
      } 
    } 
    return (this.K.size() != 0);
  }
  
  public List a(zx chunk, boolean flag) {
    ArrayList<ahn> arraylist = null;
    acm chunkcoordintpair = chunk.k();
    int i = chunkcoordintpair.a << 4;
    int j = i + 16;
    int m = chunkcoordintpair.b << 4;
    int l = m + 16;
    Iterator<ahn> iterator = this.L.iterator();
    while (iterator.hasNext()) {
      ahn nextticklistentry = iterator.next();
      if (nextticklistentry.a >= i && nextticklistentry.a < j && nextticklistentry.c >= m && nextticklistentry.c < l) {
        if (flag) {
          this.K.remove(nextticklistentry);
          iterator.remove();
        } 
        if (arraylist == null)
          arraylist = new ArrayList(); 
        arraylist.add(nextticklistentry);
      } 
    } 
    return arraylist;
  }
  
  public void t(int i, int j, int m) {
    byte byte0 = 16;
    Random random = new Random();
    for (int l = 0; l < 1000; l++) {
      int i1 = i + this.w.nextInt(byte0) - this.w.nextInt(byte0);
      int j1 = j + this.w.nextInt(byte0) - this.w.nextInt(byte0);
      int k1 = m + this.w.nextInt(byte0) - this.w.nextInt(byte0);
      int l1 = a(i1, j1, k1);
      if (this.w.nextInt(8) > j1 && l1 == 0 && ((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue())
        a("depthsuspend", (i1 + this.w.nextFloat()), (j1 + this.w.nextFloat()), (k1 + this.w.nextFloat()), 0.0D, 0.0D, 0.0D); 
      if (l1 > 0)
        yy.k[l1].b(this, i1, j1, k1, random); 
    } 
  }
  
  public List b(ia entity, c axisalignedbb) {
    this.V.clear();
    int i = me.c((axisalignedbb.a - 2.0D) / 16.0D);
    int j = me.c((axisalignedbb.d + 2.0D) / 16.0D);
    int m = me.c((axisalignedbb.c - 2.0D) / 16.0D);
    int l = me.c((axisalignedbb.f + 2.0D) / 16.0D);
    for (int i1 = i; i1 <= j; i1++) {
      for (int j1 = m; j1 <= l; j1++) {
        if (g(i1, j1))
          c(i1, j1).a(entity, axisalignedbb, this.V); 
      } 
    } 
    return this.V;
  }
  
  public List a(Class class1, c axisalignedbb) {
    int i = me.c((axisalignedbb.a - 2.0D) / 16.0D);
    int j = me.c((axisalignedbb.d + 2.0D) / 16.0D);
    int m = me.c((axisalignedbb.c - 2.0D) / 16.0D);
    int l = me.c((axisalignedbb.f + 2.0D) / 16.0D);
    ArrayList arraylist = new ArrayList();
    for (int i1 = i; i1 <= j; i1++) {
      for (int j1 = m; j1 <= l; j1++) {
        if (g(i1, j1))
          c(i1, j1).a(class1, axisalignedbb, arraylist); 
      } 
    } 
    return arraylist;
  }
  
  public List q() {
    return this.g;
  }
  
  public void b(int i, int j, int m, bq tileentity) {
    if (i(i, j, m))
      b(i, m).g(); 
    for (int l = 0; l < this.z.size(); l++)
      ((bd)this.z.get(l)).a(i, j, m, tileentity); 
  }
  
  public int b(Class class1) {
    int i = 0;
    for (int j = 0; j < this.g.size(); j++) {
      ia entity = this.g.get(j);
      if (class1.isAssignableFrom(entity.getClass()))
        i++; 
    } 
    return i;
  }
  
  public void a(List<ia> list) {
    this.g.addAll(list);
    for (int i = 0; i < list.size(); i++)
      c(list.get(i)); 
  }
  
  public void b(List list) {
    this.J.addAll(list);
  }
  
  public void r() {
    while (this.A.a());
  }
  
  public boolean a(int i, int j, int m, int l, boolean flag, int i1) {
    int j1 = a(j, m, l);
    yy block = yy.k[j1];
    yy block1 = yy.k[i];
    c axisalignedbb = block1.b(this, j, m, l);
    if (flag)
      axisalignedbb = null; 
    if (axisalignedbb != null && !a(axisalignedbb))
      return false; 
    if (block == yy.A || block == yy.B || block == yy.C || block == yy.D || block == yy.ar || block == yy.aS || block == yy.bu)
      block = null; 
    return (i > 0 && block == null && block1.d(this, j, m, l, i1));
  }
  
  public dw a(ia entity, ia entity1, float f) {
    pf.a("pathfind");
    int i = me.c(entity.s);
    int j = me.c(entity.t);
    int m = me.c(entity.u);
    int l = (int)(f + 16.0F);
    int i1 = i - l;
    int j1 = j - l;
    int k1 = m - l;
    int l1 = i + l;
    int i2 = j + l;
    int j2 = m + l;
    xk chunkcache = new xk(this, i1, j1, k1, l1, i2, j2);
    dw pathentity = (new rw((kq)chunkcache)).a(entity, entity1, f);
    pf.b();
    return pathentity;
  }
  
  public dw a(ia entity, int i, int j, int m, float f) {
    pf.a("pathfind");
    int l = me.c(entity.s);
    int i1 = me.c(entity.t);
    int j1 = me.c(entity.u);
    int k1 = (int)(f + 8.0F);
    int l1 = l - k1;
    int i2 = i1 - k1;
    int j2 = j1 - k1;
    int k2 = l + k1;
    int l2 = i1 + k1;
    int i3 = j1 + k1;
    xk chunkcache = new xk(this, l1, i2, j2, k2, l2, i3);
    dw pathentity = (new rw((kq)chunkcache)).a(entity, i, j, m, f);
    pf.b();
    return pathentity;
  }
  
  public boolean k(int i, int j, int m, int l) {
    int i1 = a(i, j, m);
    if (i1 == 0)
      return false; 
    return yy.k[i1].c(this, i, j, m, l);
  }
  
  public boolean u(int i, int j, int m) {
    if (k(i, j - 1, m, 0))
      return true; 
    if (k(i, j + 1, m, 1))
      return true; 
    if (k(i, j, m - 1, 2))
      return true; 
    if (k(i, j, m + 1, 3))
      return true; 
    if (k(i - 1, j, m, 4))
      return true; 
    return k(i + 1, j, m, 5);
  }
  
  public boolean l(int i, int j, int m, int l) {
    if (g(i, j, m))
      return u(i, j, m); 
    int i1 = a(i, j, m);
    if (i1 == 0)
      return false; 
    return yy.k[i1].b(this, i, j, m, l);
  }
  
  public boolean v(int i, int j, int m) {
    if (l(i, j - 1, m, 0))
      return true; 
    if (l(i, j + 1, m, 1))
      return true; 
    if (l(i, j, m - 1, 2))
      return true; 
    if (l(i, j, m + 1, 3))
      return true; 
    if (l(i - 1, j, m, 4))
      return true; 
    return l(i + 1, j, m, 5);
  }
  
  public vi a(ia entity, double d) {
    return a(entity.s, entity.t, entity.u, d);
  }
  
  public vi a(double d, double d1, double d2, double d3) {
    double d4 = -1.0D;
    vi entityplayer = null;
    for (int i = 0; i < this.i.size(); i++) {
      vi entityplayer1 = this.i.get(i);
      double d5 = entityplayer1.f(d, d1, d2);
      if ((d3 < 0.0D || d5 < d3 * d3) && (d4 == -1.0D || d5 < d4)) {
        d4 = d5;
        entityplayer = entityplayer1;
      } 
    } 
    return entityplayer;
  }
  
  public vi b(ia entity, double d) {
    return b(entity.s, entity.t, entity.u, d);
  }
  
  public vi b(double d, double d1, double d2, double d3) {
    double d4 = -1.0D;
    vi entityplayer = null;
    for (int i = 0; i < this.i.size(); i++) {
      vi entityplayer1 = this.i.get(i);
      if (!entityplayer1.cc.a) {
        double d5 = entityplayer1.f(d, d1, d2);
        if ((d3 < 0.0D || d5 < d3 * d3) && (d4 == -1.0D || d5 < d4)) {
          d4 = d5;
          entityplayer = entityplayer1;
        } 
      } 
    } 
    return entityplayer;
  }
  
  public vi a(String s) {
    for (int i = 0; i < this.i.size(); i++) {
      if (s.equals(((vi)this.i.get(i)).bJ))
        return this.i.get(i); 
    } 
    return null;
  }
  
  public void a(int i, int j, int m, int l, int i1, int j1, byte[] abyte0) {
    int k1 = i >> 4;
    int l1 = m >> 4;
    int i2 = i + l - 1 >> 4;
    int j2 = m + j1 - 1 >> 4;
    int k2 = 0;
    int l2 = j;
    int i3 = j + i1;
    if (l2 < 0)
      l2 = 0; 
    if (i3 > this.c)
      i3 = this.c; 
    for (int j3 = k1; j3 <= i2; j3++) {
      int k3 = i - j3 * 16;
      int l3 = i + l - j3 * 16;
      if (k3 < 0)
        k3 = 0; 
      if (l3 > 16)
        l3 = 16; 
      for (int i4 = l1; i4 <= j2; i4++) {
        int j4 = m - i4 * 16;
        int k4 = m + j1 - i4 * 16;
        if (j4 < 0)
          j4 = 0; 
        if (k4 > 16)
          k4 = 16; 
        k2 = c(j3, i4).a(abyte0, k3, l2, j4, l3, i3, k4, k2);
        c(j3 * 16 + k3, l2, i4 * 16 + j4, j3 * 16 + l3, i3, i4 * 16 + k4);
      } 
    } 
  }
  
  public void g() {}
  
  public void s() {
    this.B.b();
  }
  
  public void a(long l) {
    this.C.a(l);
  }
  
  public long t() {
    return this.C.b();
  }
  
  public long u() {
    return this.C.f();
  }
  
  public dh v() {
    return new dh(this.C.c(), this.C.d(), this.C.e());
  }
  
  public void a(dh chunkcoordinates) {
    this.C.a(chunkcoordinates.a, chunkcoordinates.b, chunkcoordinates.c);
  }
  
  public void g(ia entity) {
    int i = me.c(entity.s / 16.0D);
    int j = me.c(entity.u / 16.0D);
    byte byte0 = 2;
    for (int m = i - byte0; m <= i + byte0; m++) {
      for (int l = j - byte0; l <= j + byte0; l++)
        c(m, l); 
    } 
    if (!this.g.contains(entity))
      this.g.add(entity); 
  }
  
  public boolean a(vi entityplayer, int i, int j, int m) {
    return true;
  }
  
  public void a(ia entity, byte byte0) {}
  
  public void w() {
    this.g.removeAll(this.J);
    for (int i = 0; i < this.J.size(); i++) {
      ia entity = this.J.get(i);
      int l = entity.ai;
      int j1 = entity.ak;
      if (entity.ah && g(l, j1))
        c(l, j1).b(entity); 
    } 
    for (int j = 0; j < this.J.size(); j++)
      d(this.J.get(j)); 
    this.J.clear();
    for (int m = 0; m < this.g.size(); m++) {
      ia entity1 = this.g.get(m);
      if (entity1.n != null) {
        if (!entity1.n.K && entity1.n.m == entity1)
          continue; 
        entity1.n.m = null;
        entity1.n = null;
      } 
      if (entity1.K) {
        int i1 = entity1.ai;
        int k1 = entity1.ak;
        if (entity1.ah && g(i1, k1))
          c(i1, k1).b(entity1); 
        this.g.remove(m--);
        d(entity1);
      } 
      continue;
    } 
  }
  
  public ej x() {
    return this.A;
  }
  
  public void f(int i, int j, int m, int l, int i1) {
    int j1 = a(i, j, m);
    if (j1 > 0)
      yy.k[j1].a(this, i, j, m, l, i1); 
  }
  
  public nh y() {
    return this.B;
  }
  
  public si z() {
    return this.C;
  }
  
  public void A() {
    this.Q = !this.i.isEmpty();
    Iterator<vi> iterator = this.i.iterator();
    while (iterator.hasNext()) {
      vi entityplayer = iterator.next();
      if (entityplayer.ar())
        continue; 
      this.Q = false;
      break;
    } 
  }
  
  protected void B() {
    this.Q = false;
    Iterator<vi> iterator = this.i.iterator();
    while (iterator.hasNext()) {
      vi entityplayer = iterator.next();
      if (entityplayer.ar())
        entityplayer.a(false, false, true); 
    } 
    I();
  }
  
  public boolean C() {
    if (this.Q && !this.I) {
      for (Iterator<vi> iterator = this.i.iterator(); iterator.hasNext(); ) {
        vi entityplayer = iterator.next();
        if (!entityplayer.aK())
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  public float i(float f) {
    return (this.p + (this.q - this.p) * f) * j(f);
  }
  
  public float j(float f) {
    return this.n + (this.o - this.n) * f;
  }
  
  public void k(float f) {
    this.n = f;
    this.o = f;
  }
  
  public boolean D() {
    return (i(1.0F) > 0.9D);
  }
  
  public boolean E() {
    return (j(1.0F) > 0.2D);
  }
  
  public boolean w(int i, int j, int m) {
    if (!E())
      return false; 
    if (!l(i, j, m))
      return false; 
    if (e(i, m) > j)
      return false; 
    sr biomegenbase = a().a(i, m);
    if (biomegenbase.b())
      return false; 
    return biomegenbase.c();
  }
  
  public void a(String s, afz worldsaveddata) {
    this.E.a(s, worldsaveddata);
  }
  
  public afz a(Class class1, String s) {
    return this.E.a(class1, s);
  }
  
  public int b(String s) {
    return this.E.a(s);
  }
  
  public void g(int i, int j, int m, int l, int i1) {
    a((vi)null, i, j, m, l, i1);
  }
  
  public void a(vi entityplayer, int i, int j, int m, int l, int i1) {
    for (int j1 = 0; j1 < this.z.size(); j1++)
      ((bd)this.z.get(j1)).a(entityplayer, i, j, m, l, i1); 
  }
  
  public int b() {
    return this.c;
  }
  
  public Random x(int i, int j, int m) {
    long l = i * 341873128712L + j * 132897987541L + z().b() + m;
    this.w.setSeed(l);
    return this.w;
  }
  
  public boolean F() {
    return false;
  }
  
  public void a(bn enumskyblock, int i, int j, int m, int l, int i1, int j1) {}
  
  public yx a(jf enumcreaturetype, int i, int j, int m) {
    List list = x().a(enumcreaturetype, i, j, m);
    if (list == null || list.isEmpty())
      return null; 
    return (yx)nc.a(this.w, list);
  }
  
  public am b(String s, int i, int j, int m) {
    return x().a(this, s, i, j, m);
  }
}
