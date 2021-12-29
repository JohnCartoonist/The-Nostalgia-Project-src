import java.util.List;

public class si {
  private long a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private ik h;
  
  private int i;
  
  private String j;
  
  private int k;
  
  private boolean l;
  
  private int m;
  
  private boolean n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean snowCovered;
  
  private int mapType;
  
  public si(ik nbttagcompound) {
    this.r = false;
    this.a = nbttagcompound.f("RandomSeed");
    this.p = nbttagcompound.e("GameType");
    if (nbttagcompound.b("MapFeatures")) {
      this.q = nbttagcompound.m("MapFeatures");
    } else {
      this.q = true;
    } 
    this.b = nbttagcompound.e("SpawnX");
    this.c = nbttagcompound.e("SpawnY");
    this.d = nbttagcompound.e("SpawnZ");
    this.e = nbttagcompound.f("Time");
    this.f = nbttagcompound.f("LastPlayed");
    this.g = nbttagcompound.f("SizeOnDisk");
    this.j = nbttagcompound.i("LevelName");
    this.k = nbttagcompound.e("version");
    this.m = nbttagcompound.e("rainTime");
    this.l = nbttagcompound.m("raining");
    this.o = nbttagcompound.e("thunderTime");
    this.n = nbttagcompound.m("thundering");
    this.r = nbttagcompound.m("hardcore");
    this.snowCovered = nbttagcompound.m("snowCovered");
    this.mapType = nbttagcompound.e("mapType");
    if (nbttagcompound.b("Player")) {
      this.h = nbttagcompound.k("Player");
      this.i = this.h.e("Dimension");
    } 
  }
  
  public si(yw worldsettings, String s) {
    this.r = false;
    this.a = worldsettings.a();
    this.p = worldsettings.b();
    this.q = worldsettings.d();
    this.j = s;
    this.r = worldsettings.c();
  }
  
  public si(si worldinfo) {
    this.r = false;
    this.a = worldinfo.a;
    this.p = worldinfo.p;
    this.q = worldinfo.q;
    this.b = worldinfo.b;
    this.c = worldinfo.c;
    this.d = worldinfo.d;
    this.e = worldinfo.e;
    this.f = worldinfo.f;
    this.g = worldinfo.g;
    this.h = worldinfo.h;
    this.i = worldinfo.i;
    this.j = worldinfo.j;
    this.k = worldinfo.k;
    this.m = worldinfo.m;
    this.l = worldinfo.l;
    this.o = worldinfo.o;
    this.n = worldinfo.n;
    this.r = worldinfo.r;
    this.snowCovered = worldinfo.snowCovered;
    this.mapType = worldinfo.mapType;
  }
  
  public ik a() {
    ik nbttagcompound = new ik();
    a(nbttagcompound, this.h);
    return nbttagcompound;
  }
  
  public ik a(List<vi> list) {
    ik nbttagcompound = new ik();
    vi entityplayer = null;
    ik nbttagcompound1 = null;
    if (list.size() > 0)
      entityplayer = list.get(0); 
    if (entityplayer != null) {
      nbttagcompound1 = new ik();
      entityplayer.d(nbttagcompound1);
    } 
    a(nbttagcompound, nbttagcompound1);
    return nbttagcompound;
  }
  
  private void a(ik nbttagcompound, ik nbttagcompound1) {
    nbttagcompound.a("RandomSeed", this.a);
    nbttagcompound.a("GameType", this.p);
    nbttagcompound.a("MapFeatures", this.q);
    nbttagcompound.a("SpawnX", this.b);
    nbttagcompound.a("SpawnY", this.c);
    nbttagcompound.a("SpawnZ", this.d);
    nbttagcompound.a("Time", this.e);
    nbttagcompound.a("SizeOnDisk", this.g);
    nbttagcompound.a("LastPlayed", System.currentTimeMillis());
    nbttagcompound.a("LevelName", this.j);
    nbttagcompound.a("version", this.k);
    nbttagcompound.a("rainTime", this.m);
    nbttagcompound.a("raining", this.l);
    nbttagcompound.a("thunderTime", this.o);
    nbttagcompound.a("thundering", this.n);
    nbttagcompound.a("hardcore", this.r);
    nbttagcompound.a("snowCovered", this.snowCovered);
    nbttagcompound.a("mapType", this.mapType);
    if (nbttagcompound1 != null)
      nbttagcompound.a("Player", nbttagcompound1); 
  }
  
  public long b() {
    return this.a;
  }
  
  public int c() {
    return this.b;
  }
  
  public int d() {
    return this.c;
  }
  
  public int e() {
    return this.d;
  }
  
  public long f() {
    return this.e;
  }
  
  public long g() {
    return this.g;
  }
  
  public ik h() {
    return this.h;
  }
  
  public int i() {
    return this.i;
  }
  
  public void a(int i) {
    this.b = i;
  }
  
  public void b(int i) {
    this.c = i;
  }
  
  public void c(int i) {
    this.d = i;
  }
  
  public void a(long l) {
    this.e = l;
  }
  
  public void b(long l) {
    this.g = l;
  }
  
  public void a(ik nbttagcompound) {
    this.h = nbttagcompound;
  }
  
  public void a(int i, int j, int k) {
    this.b = i;
    this.c = j;
    this.d = k;
  }
  
  public String j() {
    return this.j;
  }
  
  public void a(String s) {
    this.j = s;
  }
  
  public int k() {
    return this.k;
  }
  
  public void d(int i) {
    this.k = i;
  }
  
  public long l() {
    return this.f;
  }
  
  public boolean m() {
    return this.n;
  }
  
  public void a(boolean flag) {
    this.n = flag;
  }
  
  public int n() {
    return this.o;
  }
  
  public void e(int i) {
    this.o = i;
  }
  
  public boolean o() {
    return this.l;
  }
  
  public void b(boolean flag) {
    this.l = flag;
  }
  
  public int p() {
    return this.m;
  }
  
  public void f(int i) {
    this.m = i;
  }
  
  public int q() {
    return this.p;
  }
  
  public boolean r() {
    return this.q;
  }
  
  public boolean s() {
    return this.r;
  }
  
  public boolean getSnowCovered() {
    return this.snowCovered;
  }
  
  public void setSnowCovered(boolean flag) {
    this.snowCovered = flag;
  }
  
  public void setMapType(int val) {
    this.mapType = val;
  }
  
  public int getMapType() {
    return this.mapType;
  }
}
