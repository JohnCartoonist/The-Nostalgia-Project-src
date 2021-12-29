import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class afv implements bd {
  public List a;
  
  private ry i;
  
  private zh j;
  
  private List k;
  
  private ge[] l;
  
  private ge[] m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private Minecraft r;
  
  private acr s;
  
  private IntBuffer t;
  
  private boolean u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  private int A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  int[] b;
  
  IntBuffer c;
  
  private int K;
  
  private int L;
  
  private int M;
  
  private int N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private List R;
  
  private aak[] S = new aak[] { new aak(), new aak(), new aak(), new aak() };
  
  double d;
  
  double e;
  
  double f;
  
  public float g;
  
  int h;
  
  private FloatBuffer cloudFloatBuffer = BufferUtils.createFloatBuffer(16);
  
  public afv(Minecraft minecraft, zh renderengine) {
    this.a = new ArrayList();
    this.k = new ArrayList();
    this.u = false;
    this.v = 0;
    this.F = -1;
    this.G = 2;
    this.b = new int[50000];
    this.c = bt.d(64);
    this.R = new ArrayList();
    this.d = -9999.0D;
    this.e = -9999.0D;
    this.f = -9999.0D;
    this.h = 0;
    this.r = minecraft;
    this.j = renderengine;
    byte byte0 = 34;
    byte byte1 = 8;
    this.q = bt.a(byte0 * byte0 * byte1 * 3);
    this.u = mm.a();
    if (this.u) {
      this.c.clear();
      this.t = bt.d(byte0 * byte0 * byte1);
      this.t.clear();
      this.t.position(0);
      this.t.limit(byte0 * byte0 * byte1);
      ARBOcclusionQuery.glGenQueriesARB(this.t);
    } 
    this.w = bt.a(3);
    GL11.glPushMatrix();
    GL11.glNewList(this.w, 4864);
    f();
    GL11.glEndList();
    GL11.glPopMatrix();
    cv tessellator = cv.a;
    this.x = this.w + 1;
    GL11.glNewList(this.x, 4864);
    byte byte2 = 64;
    int i = 256 / byte2 + 2;
    float f = 16.0F;
    int j;
    for (j = -byte2 * i; j <= byte2 * i; j += byte2) {
      int l;
      for (l = -byte2 * i; l <= byte2 * i; l += byte2) {
        tessellator.b();
        tessellator.a((j + 0), f, (l + 0));
        tessellator.a((j + byte2), f, (l + 0));
        tessellator.a((j + byte2), f, (l + byte2));
        tessellator.a((j + 0), f, (l + byte2));
        tessellator.a();
      } 
    } 
    GL11.glEndList();
    this.y = this.w + 2;
    GL11.glNewList(this.y, 4864);
    f = -16.0F;
    tessellator.b();
    int k;
    for (k = -byte2 * i; k <= byte2 * i; k += byte2) {
      int i1;
      for (i1 = -byte2 * i; i1 <= byte2 * i; i1 += byte2) {
        tessellator.a((k + byte2), f, (i1 + 0));
        tessellator.a((k + 0), f, (i1 + 0));
        tessellator.a((k + 0), f, (i1 + byte2));
        tessellator.a((k + byte2), f, (i1 + byte2));
      } 
    } 
    tessellator.a();
    GL11.glEndList();
  }
  
  private void f() {
    Random random = new Random(10842L);
    cv tessellator = cv.a;
    tessellator.b();
    for (int i = 0; i < 1500; i++) {
      double d = (random.nextFloat() * 2.0F - 1.0F);
      double d1 = (random.nextFloat() * 2.0F - 1.0F);
      double d2 = (random.nextFloat() * 2.0F - 1.0F);
      double d3 = (0.25F + random.nextFloat() * 0.25F);
      double d4 = d * d + d1 * d1 + d2 * d2;
      if (d4 < 1.0D && d4 > 0.01D) {
        d4 = 1.0D / Math.sqrt(d4);
        d *= d4;
        d1 *= d4;
        d2 *= d4;
        double d5 = d * 100.0D;
        double d6 = d1 * 100.0D;
        double d7 = d2 * 100.0D;
        double d8 = Math.atan2(d, d2);
        double d9 = Math.sin(d8);
        double d10 = Math.cos(d8);
        double d11 = Math.atan2(Math.sqrt(d * d + d2 * d2), d1);
        double d12 = Math.sin(d11);
        double d13 = Math.cos(d11);
        double d14 = random.nextDouble() * Math.PI * 2.0D;
        double d15 = Math.sin(d14);
        double d16 = Math.cos(d14);
        for (int j = 0; j < 4; j++) {
          double d17 = 0.0D;
          double d18 = ((j & 0x2) - 1) * d3;
          double d19 = ((j + 1 & 0x2) - 1) * d3;
          double d20 = d17;
          double d21 = d18 * d16 - d19 * d15;
          double d22 = d19 * d16 + d18 * d15;
          double d23 = d22;
          double d24 = d21 * d12 + d20 * d13;
          double d25 = d20 * d12 - d21 * d13;
          double d26 = d25 * d9 - d23 * d10;
          double d27 = d24;
          double d28 = d23 * d9 + d25 * d10;
          tessellator.a(d5 + d26, d6 + d27, d7 + d28);
        } 
      } 
    } 
    tessellator.a();
  }
  
  public void a(ry world) {
    if (this.i != null)
      this.i.b(this); 
    this.d = -9999.0D;
    this.e = -9999.0D;
    this.f = -9999.0D;
    wb.a.a(world);
    this.i = world;
    this.s = new acr(world);
    if (world != null) {
      world.a(this);
      a();
    } 
  }
  
  public void a() {
    if (this.i == null)
      return; 
    yy.K.a(this.r.A.j);
    this.F = this.r.A.e;
    if (this.m != null)
      for (int i = 0; i < this.m.length; i++)
        this.m[i].c();  
    int j = 64 << 3 - this.F;
    if (j > 400)
      j = 400; 
    this.n = j / 16 + 1;
    this.o = this.i.c / 16;
    this.p = j / 16 + 1;
    this.m = new ge[this.n * this.o * this.p];
    this.l = new ge[this.n * this.o * this.p];
    int k = 0;
    int l = 0;
    this.z = 0;
    this.A = 0;
    this.B = 0;
    this.C = this.n;
    this.D = this.o;
    this.E = this.p;
    for (int i1 = 0; i1 < this.k.size(); i1++)
      ((ge)this.k.get(i1)).u = false; 
    this.k.clear();
    this.a.clear();
    for (int j1 = 0; j1 < this.n; j1++) {
      for (int k1 = 0; k1 < this.o; k1++) {
        for (int l1 = 0; l1 < this.p; l1++) {
          this.m[(l1 * this.o + k1) * this.n + j1] = new ge(this.i, this.a, j1 * 16, k1 * 16, l1 * 16, 16, this.q + k);
          if (this.u)
            (this.m[(l1 * this.o + k1) * this.n + j1]).z = this.t.get(l); 
          (this.m[(l1 * this.o + k1) * this.n + j1]).y = false;
          (this.m[(l1 * this.o + k1) * this.n + j1]).x = true;
          (this.m[(l1 * this.o + k1) * this.n + j1]).o = true;
          (this.m[(l1 * this.o + k1) * this.n + j1]).w = l++;
          this.m[(l1 * this.o + k1) * this.n + j1].f();
          this.l[(l1 * this.o + k1) * this.n + j1] = this.m[(l1 * this.o + k1) * this.n + j1];
          this.k.add(this.m[(l1 * this.o + k1) * this.n + j1]);
          k += 3;
        } 
      } 
    } 
    if (this.i != null) {
      nq entityliving = this.r.i;
      if (entityliving != null) {
        b(me.c(entityliving.s), me.c(entityliving.t), me.c(entityliving.u));
        Arrays.sort(this.l, (Comparator<? super ge>)new oy(entityliving));
      } 
    } 
    this.G = 2;
  }
  
  public void a(fb vec3d, fn icamera, float f) {
    if (this.G > 0) {
      this.G--;
      return;
    } 
    pf.a("prepare");
    ah.a.a(this.i, this.j, this.r.q, this.r.i, f);
    wb.a.a(this.i, this.j, this.r.q, this.r.i, this.r.A, f);
    ah.a.a();
    this.H = 0;
    this.I = 0;
    this.J = 0;
    nq entityliving = this.r.i;
    wb.b = entityliving.R + (entityliving.s - entityliving.R) * f;
    wb.c = entityliving.S + (entityliving.t - entityliving.S) * f;
    wb.d = entityliving.T + (entityliving.u - entityliving.T) * f;
    ah.b = entityliving.R + (entityliving.s - entityliving.R) * f;
    ah.c = entityliving.S + (entityliving.t - entityliving.S) * f;
    ah.d = entityliving.T + (entityliving.u - entityliving.T) * f;
    this.r.u.b(f);
    pf.c("global");
    List<ia> list = this.i.q();
    this.H = list.size();
    for (int i = 0; i < this.i.j.size(); i++) {
      ia entity = this.i.j.get(i);
      this.I++;
      if (entity.a(vec3d))
        wb.a.a(entity, f); 
    } 
    pf.c("entities");
    for (int j = 0; j < list.size(); j++) {
      ia entity1 = list.get(j);
      if (entity1.a(vec3d) && (entity1.ao || icamera.a(entity1.C)) && (entity1 != this.r.i || this.r.A.E != 0 || this.r.i.ar())) {
        int l = me.c(entity1.t);
        if (l < 0)
          l = 0; 
        if (l >= this.i.c)
          l = this.i.c - 1; 
        if (this.i.i(me.c(entity1.s), l, me.c(entity1.u))) {
          this.I++;
          wb.a.a(entity1, f);
        } 
      } 
    } 
    pf.c("tileentities");
    rt.b();
    for (int k = 0; k < this.a.size(); k++)
      ah.a.a(this.a.get(k), f); 
    this.r.u.a(f);
    pf.b();
  }
  
  public String b() {
    return "C: " + this.N + "/" + this.K + ". F: " + this.L + ", O: " + this.M + ", E: " + this.O;
  }
  
  public String c() {
    return "E: " + this.I + "/" + this.H + ". B: " + this.J + ", I: " + (this.H - this.J - this.I);
  }
  
  private void b(int i, int j, int k) {
    i -= 8;
    j -= 8;
    k -= 8;
    this.z = Integer.MAX_VALUE;
    this.A = Integer.MAX_VALUE;
    this.B = Integer.MAX_VALUE;
    this.C = Integer.MIN_VALUE;
    this.D = Integer.MIN_VALUE;
    this.E = Integer.MIN_VALUE;
    int l = this.n * 16;
    int i1 = l / 2;
    for (int j1 = 0; j1 < this.n; j1++) {
      int k1 = j1 * 16;
      int l1 = k1 + i1 - i;
      if (l1 < 0)
        l1 -= l - 1; 
      l1 /= l;
      k1 -= l1 * l;
      if (k1 < this.z)
        this.z = k1; 
      if (k1 > this.C)
        this.C = k1; 
      for (int i2 = 0; i2 < this.p; i2++) {
        int j2 = i2 * 16;
        int k2 = j2 + i1 - k;
        if (k2 < 0)
          k2 -= l - 1; 
        k2 /= l;
        j2 -= k2 * l;
        if (j2 < this.B)
          this.B = j2; 
        if (j2 > this.E)
          this.E = j2; 
        for (int l2 = 0; l2 < this.o; l2++) {
          int i3 = l2 * 16;
          if (i3 < this.A)
            this.A = i3; 
          if (i3 > this.D)
            this.D = i3; 
          ge worldrenderer = this.m[(i2 * this.o + l2) * this.n + j1];
          boolean flag = worldrenderer.u;
          worldrenderer.a(k1, i3, j2);
          if (!flag && worldrenderer.u)
            this.k.add(worldrenderer); 
        } 
      } 
    } 
  }
  
  public int a(nq entityliving, int i, double d) {
    pf.a("sortchunks");
    for (int j = 0; j < 10; j++) {
      this.Q = (this.Q + 1) % this.m.length;
      ge worldrenderer = this.m[this.Q];
      if (worldrenderer.u && !this.k.contains(worldrenderer))
        this.k.add(worldrenderer); 
    } 
    if (this.r.A.e != this.F)
      a(); 
    if (i == 0) {
      this.K = 0;
      this.P = 0;
      this.L = 0;
      this.M = 0;
      this.N = 0;
      this.O = 0;
    } 
    double d1 = entityliving.R + (entityliving.s - entityliving.R) * d;
    double d2 = entityliving.S + (entityliving.t - entityliving.S) * d;
    double d3 = entityliving.T + (entityliving.u - entityliving.T) * d;
    double d4 = entityliving.s - this.d;
    double d5 = entityliving.t - this.e;
    double d6 = entityliving.u - this.f;
    if (d4 * d4 + d5 * d5 + d6 * d6 > 16.0D) {
      this.d = entityliving.s;
      this.e = entityliving.t;
      this.f = entityliving.u;
      b(me.c(entityliving.s), me.c(entityliving.t), me.c(entityliving.u));
      Arrays.sort(this.l, (Comparator<? super ge>)new oy(entityliving));
    } 
    rt.a();
    int k = 0;
    if (this.u && this.r.A.h && !this.r.A.g && i == 0) {
      int l = 0;
      int i1 = 16;
      a(l, i1);
      for (int j1 = l; j1 < i1; j1++)
        (this.l[j1]).x = true; 
      pf.c("render");
      k += a(l, i1, i, d);
      do {
        pf.c("occ");
        int byte0 = i1;
        i1 *= 2;
        if (i1 > this.l.length)
          i1 = this.l.length; 
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glDisable(3008);
        GL11.glDisable(2912);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthMask(false);
        pf.a("check");
        a(byte0, i1);
        pf.b();
        GL11.glPushMatrix();
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        for (int k1 = byte0; k1 < i1; k1++) {
          if (this.l[k1].e()) {
            (this.l[k1]).o = false;
          } else {
            if (!(this.l[k1]).o)
              (this.l[k1]).x = true; 
            if ((this.l[k1]).o && !(this.l[k1]).y) {
              float f3 = me.c(this.l[k1].a(entityliving));
              int l1 = (int)(1.0F + f3 / 128.0F);
              if (this.v % l1 == k1 % l1) {
                ge worldrenderer1 = this.l[k1];
                float f4 = (float)(worldrenderer1.i - d1);
                float f5 = (float)(worldrenderer1.j - d2);
                float f6 = (float)(worldrenderer1.k - d3);
                float f7 = f4 - f;
                float f8 = f5 - f1;
                float f9 = f6 - f2;
                if (f7 != 0.0F || f8 != 0.0F || f9 != 0.0F) {
                  GL11.glTranslatef(f7, f8, f9);
                  f += f7;
                  f1 += f8;
                  f2 += f9;
                } 
                pf.a("bb");
                ARBOcclusionQuery.glBeginQueryARB(35092, (this.l[k1]).z);
                this.l[k1].d();
                ARBOcclusionQuery.glEndQueryARB(35092);
                pf.b();
                (this.l[k1]).y = true;
              } 
            } 
          } 
        } 
        GL11.glPopMatrix();
        if (this.r.A.g) {
          if (adt.b == 0) {
            GL11.glColorMask(false, true, true, true);
          } else {
            GL11.glColorMask(true, false, false, true);
          } 
        } else {
          GL11.glColorMask(true, true, true, true);
        } 
        GL11.glDepthMask(true);
        GL11.glEnable(3553);
        GL11.glEnable(3008);
        GL11.glEnable(2912);
        pf.c("render");
        k += a(byte0, i1, i, d);
      } while (i1 < this.l.length);
    } else {
      pf.c("render");
      k += a(0, this.l.length, i, d);
    } 
    pf.b();
    return k;
  }
  
  private void a(int i, int j) {
    for (int k = i; k < j; k++) {
      if ((this.l[k]).y) {
        this.c.clear();
        ARBOcclusionQuery.glGetQueryObjectuARB((this.l[k]).z, 34919, this.c);
        if (this.c.get(0) != 0) {
          (this.l[k]).y = false;
          this.c.clear();
          ARBOcclusionQuery.glGetQueryObjectuARB((this.l[k]).z, 34918, this.c);
          (this.l[k]).x = (this.c.get(0) != 0);
        } 
      } 
    } 
  }
  
  private int a(int i, int j, int k, double d) {
    this.R.clear();
    int l = 0;
    for (int i1 = i; i1 < j; i1++) {
      if (k == 0) {
        this.K++;
        if ((this.l[i1]).p[k]) {
          this.O++;
        } else if (!(this.l[i1]).o) {
          this.L++;
        } else if (this.u && !(this.l[i1]).x) {
          this.M++;
        } else {
          this.N++;
        } 
      } 
      if (!(this.l[i1]).p[k] && (this.l[i1]).o && (!this.u || (this.l[i1]).x)) {
        int j1 = this.l[i1].a(k);
        if (j1 >= 0) {
          this.R.add(this.l[i1]);
          l++;
        } 
      } 
    } 
    nq entityliving = this.r.i;
    double d1 = entityliving.R + (entityliving.s - entityliving.R) * d;
    double d2 = entityliving.S + (entityliving.t - entityliving.S) * d;
    double d3 = entityliving.T + (entityliving.u - entityliving.T) * d;
    int k1 = 0;
    for (int l1 = 0; l1 < this.S.length; l1++)
      this.S[l1].b(); 
    for (int i2 = 0; i2 < this.R.size(); i2++) {
      ge worldrenderer = this.R.get(i2);
      int j2 = -1;
      for (int k2 = 0; k2 < k1; k2++) {
        if (this.S[k2].a(worldrenderer.i, worldrenderer.j, worldrenderer.k))
          j2 = k2; 
      } 
      if (j2 < 0) {
        j2 = k1++;
        this.S[j2].a(worldrenderer.i, worldrenderer.j, worldrenderer.k, d1, d2, d3);
      } 
      this.S[j2].a(worldrenderer.a(k));
    } 
    a(k, d);
    return l;
  }
  
  public void a(int i, double d) {
    this.r.u.b(d);
    for (int j = 0; j < this.S.length; j++)
      this.S[j].a(); 
    this.r.u.a(d);
  }
  
  public void d() {
    this.v++;
  }
  
  public void a(float f) {
    if (this.r.f.y.g == 1);
    if (this.r.f.y.c)
      return; 
    GL11.glDisable(3553);
    fb vec3d = this.i.a(this.r.i, f);
    float f1 = (float)vec3d.a;
    float f2 = (float)vec3d.b;
    float f3 = (float)vec3d.c;
    if (this.r.A.g) {
      float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    } 
    GL11.glColor3f(f1, f2, f3);
    cv tessellator1 = cv.a;
    GL11.glDepthMask(false);
    GL11.glEnable(2912);
    GL11.glColor3f(f1, f2, f3);
    GL11.glCallList(this.x);
    GL11.glDisable(2912);
    GL11.glDisable(3008);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    rt.a();
    float[] af = this.i.y.a(this.i.c(f), f);
    if (af != null) {
      GL11.glDisable(3553);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef((me.a(this.i.e(f)) >= 0.0F) ? 0.0F : 180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      float f7 = af[0];
      float f9 = af[1];
      float f12 = af[2];
      if (this.r.A.g) {
        float f15 = (f7 * 30.0F + f9 * 59.0F + f12 * 11.0F) / 100.0F;
        float f18 = (f7 * 30.0F + f9 * 70.0F) / 100.0F;
        float f21 = (f7 * 30.0F + f12 * 70.0F) / 100.0F;
        f7 = f15;
        f9 = f18;
        f12 = f21;
      } 
      tessellator1.a(6);
      tessellator1.a(f7, f9, f12, af[3]);
      tessellator1.a(0.0D, 100.0D, 0.0D);
      int j = 16;
      tessellator1.a(af[0], af[1], af[2], 0.0F);
      for (int k = 0; k <= j; k++) {
        float f22 = k * 3.141593F * 2.0F / j;
        float f23 = me.a(f22);
        float f24 = me.b(f22);
        tessellator1.a((f23 * 120.0F), (f24 * 120.0F), (-f24 * 40.0F * af[3]));
      } 
      tessellator1.a();
      GL11.glPopMatrix();
      GL11.glShadeModel(7424);
    } 
    GL11.glEnable(3553);
    GL11.glBlendFunc(770, 1);
    GL11.glPushMatrix();
    float da = 1.0F - this.i.j(f);
    float f8 = 0.0F;
    float f10 = 0.0F;
    float f13 = 0.0F;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, da);
    GL11.glTranslatef(f8, f10, f13);
    if (((Boolean)mod_noBiomesX.SunriseInNorth.get()).booleanValue()) {
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
    } else {
      GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
    } 
    GL11.glRotatef(this.i.c(f) * 360.0F, 1.0F, 0.0F, 0.0F);
    float f16 = 30.0F;
    GL11.glBindTexture(3553, this.j.b("/terrain/sun.png"));
    tessellator1.b();
    tessellator1.a(-f16, 100.0D, -f16, 0.0D, 0.0D);
    tessellator1.a(f16, 100.0D, -f16, 1.0D, 0.0D);
    tessellator1.a(f16, 100.0D, f16, 1.0D, 1.0D);
    tessellator1.a(-f16, 100.0D, f16, 0.0D, 1.0D);
    tessellator1.a();
    f16 = 20.0F;
    if (!((Boolean)mod_noBiomesX.MoonPhaseless.get()).booleanValue()) {
      GL11.glBindTexture(3553, this.j.b("/terrain/moon_phases.png"));
      int f19a = this.i.d(f);
      int l = f19a % 4;
      int i1 = f19a / 4 % 2;
      float f25 = (l + 0) / 4.0F;
      float f26 = (i1 + 0) / 2.0F;
      float f27 = (l + 1) / 4.0F;
      float f28 = (i1 + 1) / 2.0F;
      tessellator1.b();
      tessellator1.a(-f16, -100.0D, f16, f27, f28);
      tessellator1.a(f16, -100.0D, f16, f25, f28);
      tessellator1.a(f16, -100.0D, -f16, f25, f26);
      tessellator1.a(-f16, -100.0D, -f16, f27, f26);
      tessellator1.a();
    } else {
      GL11.glBindTexture(3553, this.j.b("/terrain/moon.png"));
      tessellator1.b();
      tessellator1.a(-f16, -100.0D, f16, 1.0D, 1.0D);
      tessellator1.a(f16, -100.0D, f16, 0.0D, 1.0D);
      tessellator1.a(f16, -100.0D, -f16, 0.0D, 0.0D);
      tessellator1.a(-f16, -100.0D, -f16, 1.0D, 0.0D);
      tessellator1.a();
    } 
    GL11.glDisable(3553);
    float f19 = this.i.h(f) * da;
    if (f19 > 0.0F) {
      GL11.glColor4f(f19, f19, f19, f19);
      GL11.glCallList(this.w);
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
    GL11.glEnable(3008);
    GL11.glEnable(2912);
    GL11.glPopMatrix();
    GL11.glDisable(3553);
    GL11.glColor3f(0.0F, 0.0F, 0.0F);
    float d = 1.0F - this.i.j(f);
    if (((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue())
      d = (float)((this.r.h.e(f)).b - 64.0D); 
    if (d < 0.0D && ((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue()) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 12.0F, 0.0F);
      GL11.glCallList(this.y);
      GL11.glPopMatrix();
      float f11 = 1.0F;
      float f14 = -((float)(d + 65.0D));
      float f17 = -f11;
      float f20 = f14;
      tessellator1.b();
      tessellator1.a(0, 255);
      tessellator1.a(-f11, f20, f11);
      tessellator1.a(f11, f20, f11);
      tessellator1.a(f11, f17, f11);
      tessellator1.a(-f11, f17, f11);
      tessellator1.a(-f11, f17, -f11);
      tessellator1.a(f11, f17, -f11);
      tessellator1.a(f11, f20, -f11);
      tessellator1.a(-f11, f20, -f11);
      tessellator1.a(f11, f17, -f11);
      tessellator1.a(f11, f17, f11);
      tessellator1.a(f11, f20, f11);
      tessellator1.a(f11, f20, -f11);
      tessellator1.a(-f11, f20, -f11);
      tessellator1.a(-f11, f20, f11);
      tessellator1.a(-f11, f17, f11);
      tessellator1.a(-f11, f17, -f11);
      tessellator1.a(-f11, f17, -f11);
      tessellator1.a(-f11, f17, f11);
      tessellator1.a(f11, f17, f11);
      tessellator1.a(f11, f17, -f11);
      tessellator1.a();
    } 
    if (this.i.y.f()) {
      GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
    } else {
      GL11.glColor3f(f1, f2, f3);
    } 
    if (((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue()) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, -((float)(d - 16.0D)), 0.0F);
      GL11.glCallList(this.y);
      GL11.glPopMatrix();
    } else {
      GL11.glCallList(this.y);
    } 
    GL11.glEnable(3553);
    GL11.glDepthMask(true);
  }
  
  public void b(float f) {
    if (this.r.f.y.c)
      return; 
    if (this.r.A.j && !((Boolean)mod_noBiomesX.OpaqueFlatClouds.get()).booleanValue()) {
      c(f);
      return;
    } 
    GL11.glDisable(2884);
    float f1 = (float)(this.r.i.S + (this.r.i.t - this.r.i.S) * f);
    byte byte0 = 32;
    int i = 256 / byte0;
    cv tessellator = cv.a;
    GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
    if (!((Boolean)mod_noBiomesX.OpaqueFlatClouds.get()).booleanValue())
      GL11.glEnable(3042); 
    GL11.glBlendFunc(770, 771);
    fb vec3d = this.i.f(f);
    float f2 = (float)vec3d.a;
    float f3 = (float)vec3d.b;
    float f4 = (float)vec3d.c;
    if (this.r.A.g) {
      float f5 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F;
      float f7 = (f2 * 30.0F + f3 * 70.0F) / 100.0F;
      float f8 = (f2 * 30.0F + f4 * 70.0F) / 100.0F;
      f2 = f5;
      f3 = f7;
      f4 = f8;
    } 
    float f6 = 4.882813E-4F;
    double d = (this.v + f);
    double d1 = this.r.i.p + (this.r.i.s - this.r.i.p) * f + d * 0.029999999329447746D;
    double d2 = this.r.i.r + (this.r.i.u - this.r.i.r) * f;
    int j = me.c(d1 / 2048.0D);
    int k = me.c(d2 / 2048.0D);
    d1 -= (j * 2048);
    d2 -= (k * 2048);
    float f9 = this.i.y.e() - f1 + 0.33F;
    float f10 = (float)(d1 * f6);
    float f11 = (float)(d2 * f6);
    tessellator.b();
    tessellator.a(f2, f3, f4, 0.8F);
    int l;
    for (l = -byte0 * i; l < byte0 * i; l += byte0) {
      int i1;
      for (i1 = -byte0 * i; i1 < byte0 * i; i1 += byte0) {
        tessellator.a((l + 0), f9, (i1 + byte0), ((l + 0) * f6 + f10), ((i1 + byte0) * f6 + f11));
        tessellator.a((l + byte0), f9, (i1 + byte0), ((l + byte0) * f6 + f10), ((i1 + byte0) * f6 + f11));
        tessellator.a((l + byte0), f9, (i1 + 0), ((l + byte0) * f6 + f10), ((i1 + 0) * f6 + f11));
        tessellator.a((l + 0), f9, (i1 + 0), ((l + 0) * f6 + f10), ((i1 + 0) * f6 + f11));
      } 
    } 
    tessellator.a();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    if (!((Boolean)mod_noBiomesX.OpaqueFlatClouds.get()).booleanValue())
      GL11.glDisable(3042); 
    GL11.glEnable(2884);
  }
  
  public boolean a(double d, double d1, double d2, float f) {
    return false;
  }
  
  private FloatBuffer createCloudFloatBuffer(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.cloudFloatBuffer.clear();
    this.cloudFloatBuffer.put(paramFloat1).put(0.0F).put(paramFloat3).put(0.0F);
    this.cloudFloatBuffer.flip();
    return this.cloudFloatBuffer;
  }
  
  public void c(float f) {
    GL11.glDisable(2884);
    float f1 = (float)(this.r.i.S + (this.r.i.t - this.r.i.S) * f);
    cv tessellator = cv.a;
    float f2 = 12.0F;
    float f3 = 4.0F;
    double d = (this.v + f);
    double d1 = (this.r.i.p + (this.r.i.s - this.r.i.p) * f + d * 0.029999999329447746D) / f2;
    double d2 = (this.r.i.r + (this.r.i.u - this.r.i.r) * f) / f2 + 0.33000001311302185D;
    float f4 = this.i.y.e() - f1 + 0.33F;
    int i = me.c(d1 / 2048.0D);
    int j = me.c(d2 / 2048.0D);
    d1 -= (i * 2048);
    d2 -= (j * 2048);
    double oldd3 = d1 - (i << 11);
    double oldd4 = d2 - (j << 11);
    if (((Boolean)mod_noBiomesX.TextureMappedClouds.get()).booleanValue()) {
      adx.a(33986);
      GL11.glBindTexture(3553, this.j.b("/nbx/fluff.png"));
      GL11.glTexGeni(8192, 9472, 9217);
      GL11.glTexGen(8192, 9473, createCloudFloatBuffer(1.0F, 0.0F, 0.0F, 0.0F));
      GL11.glTexGeni(8193, 9472, 9217);
      GL11.glTexGen(8193, 9473, createCloudFloatBuffer(0.0F, 0.0F, 1.0F, 0.0F));
      GL11.glEnable(3168);
      GL11.glEnable(3169);
      GL11.glEnable(3553);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      GL11.glScalef(0.25F, 0.25F, 0.25F);
      GL11.glTranslatef((float)oldd3, (float)oldd4, 0.0F);
      GL11.glMatrixMode(5888);
      adx.a(33984);
      GL11.glEnable(3553);
    } 
    GL11.glBindTexture(3553, this.j.b("/environment/clouds.png"));
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    fb vec3d = this.i.f(f);
    float f5 = (float)vec3d.a;
    float f6 = (float)vec3d.b;
    float f7 = (float)vec3d.c;
    if (this.r.A.g) {
      float f8 = (f5 * 30.0F + f6 * 59.0F + f7 * 11.0F) / 100.0F;
      float f10 = (f5 * 30.0F + f6 * 70.0F) / 100.0F;
      float f12 = (f5 * 30.0F + f7 * 70.0F) / 100.0F;
      f5 = f8;
      f6 = f10;
      f7 = f12;
    } 
    float f9 = (float)(d1 * 0.0D);
    float f11 = (float)(d2 * 0.0D);
    float f13 = 0.00390625F;
    f9 = me.c(d1) * f13;
    f11 = me.c(d2) * f13;
    float f14 = (float)(d1 - me.c(d1));
    float f15 = (float)(d2 - me.c(d2));
    int k = 8;
    byte byte0 = 4;
    float f16 = 9.765625E-4F;
    GL11.glScalef(f2, 1.0F, f2);
    for (int l = 0; l < 2; l++) {
      if (l == 0) {
        GL11.glColorMask(false, false, false, false);
      } else if (this.r.A.g) {
        if (adt.b == 0) {
          GL11.glColorMask(false, true, true, true);
        } else {
          GL11.glColorMask(true, false, false, true);
        } 
      } else {
        GL11.glColorMask(true, true, true, true);
      } 
      for (int i1 = -byte0 + 1; i1 <= byte0; i1++) {
        for (int j1 = -byte0 + 1; j1 <= byte0; j1++) {
          tessellator.b();
          float f17 = (i1 * k);
          float f18 = (j1 * k);
          float f19 = f17 - f14;
          float f20 = f18 - f15;
          if (f4 > -f3 - 1.0F) {
            tessellator.a(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F);
            tessellator.b(0.0F, -1.0F, 0.0F);
            tessellator.a((f19 + 0.0F), (f4 + 0.0F), (f20 + k), ((f17 + 0.0F) * f13 + f9), ((f18 + k) * f13 + f11));
            tessellator.a((f19 + k), (f4 + 0.0F), (f20 + k), ((f17 + k) * f13 + f9), ((f18 + k) * f13 + f11));
            tessellator.a((f19 + k), (f4 + 0.0F), (f20 + 0.0F), ((f17 + k) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
            tessellator.a((f19 + 0.0F), (f4 + 0.0F), (f20 + 0.0F), ((f17 + 0.0F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
          } 
          if (f4 <= f3 + 1.0F) {
            tessellator.a(f5, f6, f7, 0.8F);
            tessellator.b(0.0F, 1.0F, 0.0F);
            tessellator.a((f19 + 0.0F), (f4 + f3 - f16), (f20 + k), ((f17 + 0.0F) * f13 + f9), ((f18 + k) * f13 + f11));
            tessellator.a((f19 + k), (f4 + f3 - f16), (f20 + k), ((f17 + k) * f13 + f9), ((f18 + k) * f13 + f11));
            tessellator.a((f19 + k), (f4 + f3 - f16), (f20 + 0.0F), ((f17 + k) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
            tessellator.a((f19 + 0.0F), (f4 + f3 - f16), (f20 + 0.0F), ((f17 + 0.0F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
          } 
          tessellator.a(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F);
          if (i1 > -1) {
            tessellator.b(-1.0F, 0.0F, 0.0F);
            for (int k1 = 0; k1 < k; k1++) {
              tessellator.a((f19 + k1 + 0.0F), (f4 + 0.0F), (f20 + k), ((f17 + k1 + 0.5F) * f13 + f9), ((f18 + k) * f13 + f11));
              tessellator.a((f19 + k1 + 0.0F), (f4 + f3), (f20 + k), ((f17 + k1 + 0.5F) * f13 + f9), ((f18 + k) * f13 + f11));
              tessellator.a((f19 + k1 + 0.0F), (f4 + f3), (f20 + 0.0F), ((f17 + k1 + 0.5F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
              tessellator.a((f19 + k1 + 0.0F), (f4 + 0.0F), (f20 + 0.0F), ((f17 + k1 + 0.5F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
            } 
          } 
          if (i1 <= 1) {
            tessellator.b(1.0F, 0.0F, 0.0F);
            for (int l1 = 0; l1 < k; l1++) {
              tessellator.a((f19 + l1 + 1.0F - f16), (f4 + 0.0F), (f20 + k), ((f17 + l1 + 0.5F) * f13 + f9), ((f18 + k) * f13 + f11));
              tessellator.a((f19 + l1 + 1.0F - f16), (f4 + f3), (f20 + k), ((f17 + l1 + 0.5F) * f13 + f9), ((f18 + k) * f13 + f11));
              tessellator.a((f19 + l1 + 1.0F - f16), (f4 + f3), (f20 + 0.0F), ((f17 + l1 + 0.5F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
              tessellator.a((f19 + l1 + 1.0F - f16), (f4 + 0.0F), (f20 + 0.0F), ((f17 + l1 + 0.5F) * f13 + f9), ((f18 + 0.0F) * f13 + f11));
            } 
          } 
          tessellator.a(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F);
          if (j1 > -1) {
            tessellator.b(0.0F, 0.0F, -1.0F);
            for (int i2 = 0; i2 < k; i2++) {
              tessellator.a((f19 + 0.0F), (f4 + f3), (f20 + i2 + 0.0F), ((f17 + 0.0F) * f13 + f9), ((f18 + i2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + k), (f4 + f3), (f20 + i2 + 0.0F), ((f17 + k) * f13 + f9), ((f18 + i2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + k), (f4 + 0.0F), (f20 + i2 + 0.0F), ((f17 + k) * f13 + f9), ((f18 + i2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + 0.0F), (f4 + 0.0F), (f20 + i2 + 0.0F), ((f17 + 0.0F) * f13 + f9), ((f18 + i2 + 0.5F) * f13 + f11));
            } 
          } 
          if (j1 <= 1) {
            tessellator.b(0.0F, 0.0F, 1.0F);
            for (int j2 = 0; j2 < k; j2++) {
              tessellator.a((f19 + 0.0F), (f4 + f3), (f20 + j2 + 1.0F - f16), ((f17 + 0.0F) * f13 + f9), ((f18 + j2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + k), (f4 + f3), (f20 + j2 + 1.0F - f16), ((f17 + k) * f13 + f9), ((f18 + j2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + k), (f4 + 0.0F), (f20 + j2 + 1.0F - f16), ((f17 + k) * f13 + f9), ((f18 + j2 + 0.5F) * f13 + f11));
              tessellator.a((f19 + 0.0F), (f4 + 0.0F), (f20 + j2 + 1.0F - f16), ((f17 + 0.0F) * f13 + f9), ((f18 + j2 + 0.5F) * f13 + f11));
            } 
          } 
          tessellator.a();
        } 
      } 
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
    GL11.glEnable(2884);
    if (((Boolean)mod_noBiomesX.TextureMappedClouds.get()).booleanValue()) {
      adx.a(33986);
      GL11.glDisable(3553);
      adx.a(33984);
    } 
  }
  
  public boolean a(nq entityliving, boolean flag) {
    boolean flag1 = false;
    if (flag1) {
      Collections.sort(this.k, (Comparator<?>)new jy(entityliving));
      int i = this.k.size() - 1;
      int j = this.k.size();
      for (int k = 0; k < j; k++) {
        ge worldrenderer = this.k.get(i - k);
        if (!flag) {
          if (worldrenderer.a(entityliving) > 256.0F)
            if (worldrenderer.o) {
              if (k >= 30)
                return false; 
            } else if (k >= 1) {
              return false;
            }  
        } else if (!worldrenderer.o) {
          continue;
        } 
        worldrenderer.a();
        this.k.remove(worldrenderer);
        worldrenderer.u = false;
        continue;
      } 
      return (this.k.size() == 0);
    } 
    byte byte0 = 2;
    jy rendersorter = new jy(entityliving);
    ge[] aworldrenderer = new ge[byte0];
    ArrayList<ge> arraylist = null;
    int l = this.k.size();
    int i1 = 0;
    for (int j1 = 0; j1 < l; j1++) {
      ge worldrenderer1 = this.k.get(j1);
      if (!flag) {
        if (worldrenderer1.a(entityliving) > 256.0F) {
          int k2;
          for (k2 = 0; k2 < byte0 && (aworldrenderer[k2] == null || rendersorter.a(aworldrenderer[k2], worldrenderer1) <= 0); k2++);
          if (--k2 > 0) {
            for (int i3 = k2; --i3 != 0;)
              aworldrenderer[i3 - 1] = aworldrenderer[i3]; 
            aworldrenderer[k2] = worldrenderer1;
          } 
          continue;
        } 
      } else if (!worldrenderer1.o) {
        continue;
      } 
      if (arraylist == null)
        arraylist = new ArrayList(); 
      i1++;
      arraylist.add(worldrenderer1);
      this.k.set(j1, null);
      continue;
    } 
    if (arraylist != null) {
      if (arraylist.size() > 1)
        Collections.sort(arraylist, (Comparator<? super ge>)rendersorter); 
      for (int k1 = arraylist.size() - 1; k1 >= 0; k1--) {
        ge worldrenderer2 = arraylist.get(k1);
        worldrenderer2.a();
        worldrenderer2.u = false;
      } 
    } 
    int l1 = 0;
    for (int i2 = byte0 - 1; i2 >= 0; i2--) {
      ge worldrenderer3 = aworldrenderer[i2];
      if (worldrenderer3 != null) {
        if (!worldrenderer3.o && i2 != byte0 - 1) {
          aworldrenderer[i2] = null;
          aworldrenderer[0] = null;
          break;
        } 
        aworldrenderer[i2].a();
        (aworldrenderer[i2]).u = false;
        l1++;
      } 
    } 
    int j2 = 0;
    int l2 = 0;
    for (int j3 = this.k.size(); j2 != j3; j2++) {
      ge worldrenderer4 = this.k.get(j2);
      if (worldrenderer4 != null) {
        boolean flag2 = false;
        for (int k3 = 0; k3 < byte0 && !flag2; k3++) {
          if (worldrenderer4 == aworldrenderer[k3])
            flag2 = true; 
        } 
        if (!flag2) {
          if (l2 != j2)
            this.k.set(l2, worldrenderer4); 
          l2++;
        } 
      } 
    } 
    while (--j2 >= l2)
      this.k.remove(j2); 
    return (l == i1 + l1);
  }
  
  public void a(vi entityplayer, gv movingobjectposition, int i, dk itemstack, float f) {
    cv tessellator = cv.a;
    GL11.glEnable(3042);
    GL11.glEnable(3008);
    GL11.glBlendFunc(770, 1);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, (me.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.4F) * 0.5F);
    if (i == 0) {
      if (this.g > 0.0F) {
        GL11.glBlendFunc(774, 768);
        int j = this.j.b("/terrain.png");
        GL11.glBindTexture(3553, j);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        GL11.glPushMatrix();
        int k = this.i.a(movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
        yy block = (k <= 0) ? null : yy.k[k];
        GL11.glDisable(3008);
        GL11.glPolygonOffset(-3.0F, -3.0F);
        GL11.glEnable(32823);
        double d = entityplayer.R + (entityplayer.s - entityplayer.R) * f;
        double d1 = entityplayer.S + (entityplayer.t - entityplayer.S) * f;
        double d2 = entityplayer.T + (entityplayer.u - entityplayer.T) * f;
        if (block == null)
          block = yy.t; 
        GL11.glEnable(3008);
        tessellator.b();
        tessellator.b(-d, -d1, -d2);
        tessellator.c();
        this.s.a(block, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d, 240 + (int)(this.g * 10.0F));
        tessellator.a();
        tessellator.b(0.0D, 0.0D, 0.0D);
        GL11.glDisable(3008);
        GL11.glPolygonOffset(0.0F, 0.0F);
        GL11.glDisable(32823);
        GL11.glEnable(3008);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
      } 
    } else if (itemstack != null) {
      GL11.glBlendFunc(770, 771);
      float f1 = me.a((float)System.currentTimeMillis() / 100.0F) * 0.2F + 0.8F;
      GL11.glColor4f(f1, f1, f1, me.a((float)System.currentTimeMillis() / 200.0F) * 0.2F + 0.5F);
      int l = this.j.b("/terrain.png");
      GL11.glBindTexture(3553, l);
      int i1 = movingobjectposition.b;
      int j1 = movingobjectposition.c;
      int k1 = movingobjectposition.d;
      if (movingobjectposition.e == 0)
        j1--; 
      if (movingobjectposition.e == 1)
        j1++; 
      if (movingobjectposition.e == 2)
        k1--; 
      if (movingobjectposition.e == 3)
        k1++; 
      if (movingobjectposition.e == 4)
        i1--; 
      if (movingobjectposition.e == 5)
        i1++; 
    } 
    GL11.glDisable(3042);
    GL11.glDisable(3008);
  }
  
  public void b(vi entityplayer, gv movingobjectposition, int i, dk itemstack, float f) {
    if (i == 0 && movingobjectposition.a == bo.a) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDepthMask(false);
      float f1 = 0.002F;
      int j = this.i.a(movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
      if (j > 0) {
        yy.k[j].b(this.i, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d);
        double d = entityplayer.R + (entityplayer.s - entityplayer.R) * f;
        double d1 = entityplayer.S + (entityplayer.t - entityplayer.S) * f;
        double d2 = entityplayer.T + (entityplayer.u - entityplayer.T) * f;
        a(yy.k[j].c_(this.i, movingobjectposition.b, movingobjectposition.c, movingobjectposition.d).b(f1, f1, f1).c(-d, -d1, -d2));
      } 
      GL11.glDepthMask(true);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
    } 
  }
  
  private void a(c axisalignedbb) {
    cv tessellator = cv.a;
    tessellator.a(3);
    tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
    tessellator.a();
    tessellator.a(3);
    tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
    tessellator.a();
    tessellator.a(1);
    tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.c);
    tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.c);
    tessellator.a(axisalignedbb.d, axisalignedbb.b, axisalignedbb.f);
    tessellator.a(axisalignedbb.d, axisalignedbb.e, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.b, axisalignedbb.f);
    tessellator.a(axisalignedbb.a, axisalignedbb.e, axisalignedbb.f);
    tessellator.a();
  }
  
  public void b(int i, int j, int k, int l, int i1, int j1) {
    int k1 = me.a(i, 16);
    int l1 = me.a(j, 16);
    int i2 = me.a(k, 16);
    int j2 = me.a(l, 16);
    int k2 = me.a(i1, 16);
    int l2 = me.a(j1, 16);
    for (int i3 = k1; i3 <= j2; i3++) {
      int j3 = i3 % this.n;
      if (j3 < 0)
        j3 += this.n; 
      for (int k3 = l1; k3 <= k2; k3++) {
        int l3 = k3 % this.o;
        if (l3 < 0)
          l3 += this.o; 
        for (int i4 = i2; i4 <= l2; i4++) {
          int j4 = i4 % this.p;
          if (j4 < 0)
            j4 += this.p; 
          int k4 = (j4 * this.o + l3) * this.n + j3;
          ge worldrenderer = this.m[k4];
          if (!worldrenderer.u) {
            this.k.add(worldrenderer);
            worldrenderer.f();
          } 
        } 
      } 
    } 
  }
  
  public void a(int i, int j, int k) {
    b(i - 1, j - 1, k - 1, i + 1, j + 1, k + 1);
  }
  
  public void a(int i, int j, int k, int l, int i1, int j1) {
    b(i - 1, j - 1, k - 1, l + 1, i1 + 1, j1 + 1);
  }
  
  public void a(fn icamera, float f) {
    for (int i = 0; i < this.m.length; i++) {
      if (!this.m[i].e() && (!(this.m[i]).o || (i + this.h & 0xF) == 0))
        this.m[i].a(icamera); 
    } 
    this.h++;
  }
  
  public void a(String s, int i, int j, int k) {
    if (s != null)
      this.r.w.b("C418 - " + s); 
    this.r.C.a(s, i, j, k, 1.0F, 1.0F);
  }
  
  public void a(String s, double d, double d1, double d2, float f, float f1) {
    float f2 = 16.0F;
    if (f > 1.0F)
      f2 *= f; 
    if (this.r.i.f(d, d1, d2) < (f2 * f2))
      this.r.C.b(s, (float)d, (float)d1, (float)d2, f, f1); 
  }
  
  public void a(String s, double d, double d1, double d2, double d3, double d4, double d5) {
    b(s, d, d1, d2, d3, d4, d5);
  }
  
  public wc b(String s, double d, double d1, double d2, double d3, double d4, double d5) {
    if (this.r == null || this.r.i == null || this.r.j == null)
      return null; 
    int i = this.r.A.P;
    if (i == 1 && this.i.w.nextInt(3) == 0)
      i = 2; 
    double d6 = this.r.i.s - d;
    double d7 = this.r.i.t - d1;
    double d8 = this.r.i.u - d2;
    Object obj = null;
    if (s.equals("hugeexplosion")) {
      this.r.j.a((wc)(obj = new adc(this.i, d, d1, d2, d3, d4, d5)));
    } else if (s.equals("largeexplode")) {
      this.r.j.a((wc)(obj = new ail(this.j, this.i, d, d1, d2, d3, d4, d5)));
    } 
    if (obj != null)
      return (wc)obj; 
    double d9 = 16.0D;
    if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9)
      return null; 
    if (i > 1)
      return null; 
    if (s.equals("bubble")) {
      obj = new pq(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("suspended")) {
      obj = new jd(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("depthsuspend")) {
      obj = new cn(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("townaura")) {
      obj = new cn(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("crit")) {
      obj = new afj(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("magicCrit")) {
      obj = new afj(this.i, d, d1, d2, d3, d4, d5);
      ((wc)obj).b(((wc)obj).h() * 0.3F, ((wc)obj).i() * 0.8F, ((wc)obj).j());
      ((wc)obj).c(((wc)obj).k() + 1);
    } else if (s.equals("smoke")) {
      obj = new aca(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("mobSpell")) {
      obj = new sq(this.i, d, d1, d2, 0.0D, 0.0D, 0.0D);
      ((wc)obj).b((float)d3, (float)d4, (float)d5);
    } else if (s.equals("spell")) {
      obj = new sq(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("instantSpell")) {
      obj = new sq(this.i, d, d1, d2, d3, d4, d5);
      ((sq)obj).b(144);
    } else if (s.equals("note")) {
      obj = new ae(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("portal")) {
      obj = new afy(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("enchantmenttable")) {
      obj = new afn(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("explode")) {
      obj = new nr(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("flame")) {
      obj = new o(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("lava")) {
      obj = new aw(this.i, d, d1, d2);
    } else if (s.equals("footstep")) {
      obj = new nb(this.j, this.i, d, d1, d2);
    } else if (s.equals("splash")) {
      obj = new adi(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("largesmoke")) {
      obj = new aca(this.i, d, d1, d2, d3, d4, d5, 2.5F);
    } else if (s.equals("cloud")) {
      obj = new kz(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("reddust")) {
      obj = new aao(this.i, d, d1, d2, (float)d3, (float)d4, (float)d5);
    } else if (s.equals("snowballpoof")) {
      obj = new ug(this.i, d, d1, d2, acy.aC);
    } else if (s.equals("dripWater")) {
      obj = new st(this.i, d, d1, d2, p.g);
    } else if (s.equals("dripLava")) {
      obj = new st(this.i, d, d1, d2, p.h);
    } else if (s.equals("snowshovel")) {
      obj = new zj(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.equals("slime")) {
      obj = new ug(this.i, d, d1, d2, acy.aL);
    } else if (s.equals("heart")) {
      obj = new ff(this.i, d, d1, d2, d3, d4, d5);
    } else if (s.startsWith("iconcrack_")) {
      int j = Integer.parseInt(s.substring(s.indexOf("_") + 1));
      obj = new ug(this.i, d, d1, d2, d3, d4, d5, acy.d[j]);
    } else if (s.startsWith("tilecrack_")) {
      int k = Integer.parseInt(s.substring(s.indexOf("_") + 1));
      obj = new mp(this.i, d, d1, d2, d3, d4, d5, yy.k[k], 0, 0);
    } 
    if (obj != null)
      this.r.j.a((wc)obj); 
    return (wc)obj;
  }
  
  public void a(ia entity) {
    entity.U();
    if (entity.ad != null)
      this.j.a(entity.ad, (aaj)new vt()); 
    if (entity.ae != null)
      this.j.a(entity.ae, (aaj)new vt()); 
  }
  
  public void b(ia entity) {
    if (entity.ad != null)
      this.j.c(entity.ad); 
    if (entity.ae != null)
      this.j.c(entity.ae); 
  }
  
  public void a(int i, int j, int k, bq tileentity) {}
  
  public void e() {
    bt.b(this.q);
  }
  
  public void a(vi entityplayer, int i, int j, int k, int l, int i1) {
    int j1, i2;
    double d3, d7, d11;
    int i3;
    double d, d4, d8;
    String s;
    int j2;
    double d12, d1, d5, d9;
    String s1;
    int k2, l2;
    float f, f1, f2;
    String s2;
    int j3, k1, l1;
    Random random = this.i.w;
    switch (i) {
      default:
        return;
      case 1001:
        this.i.a(j, k, l, "random.click", 1.0F, 1.2F);
      case 1000:
        this.i.a(j, k, l, "random.click", 1.0F, 1.0F);
      case 1002:
        this.i.a(j, k, l, "random.bow", 1.0F, 1.2F);
      case 2000:
        j1 = i1 % 3 - 1;
        i2 = i1 / 3 % 3 - 1;
        d3 = j + j1 * 0.6D + 0.5D;
        d7 = k + 0.5D;
        d11 = l + i2 * 0.6D + 0.5D;
        for (i3 = 0; i3 < 10; i3++) {
          double d13 = random.nextDouble() * 0.2D + 0.01D;
          double d14 = d3 + j1 * 0.01D + (random.nextDouble() - 0.5D) * i2 * 0.5D;
          double d15 = d7 + (random.nextDouble() - 0.5D) * 0.5D;
          double d17 = d11 + i2 * 0.01D + (random.nextDouble() - 0.5D) * j1 * 0.5D;
          double d19 = j1 * d13 + random.nextGaussian() * 0.01D;
          double d21 = -0.03D + random.nextGaussian() * 0.01D;
          double d23 = i2 * d13 + random.nextGaussian() * 0.01D;
          a("smoke", d14, d15, d17, d19, d21, d23);
        } 
      case 2003:
        d = j + 0.5D;
        d4 = k;
        d8 = l + 0.5D;
        s = "iconcrack_" + acy.bz.bM;
        for (j2 = 0; j2 < 8; j2++)
          a(s, d, d4, d8, random.nextGaussian() * 0.15D, random.nextDouble() * 0.2D, random.nextGaussian() * 0.15D); 
        for (d12 = 0.0D; d12 < 6.283185307179586D; d12 += 0.15707963267948966D) {
          a("portal", d + Math.cos(d12) * 5.0D, d4 - 0.4D, d8 + Math.sin(d12) * 5.0D, Math.cos(d12) * -5.0D, 0.0D, Math.sin(d12) * -5.0D);
          a("portal", d + Math.cos(d12) * 5.0D, d4 - 0.4D, d8 + Math.sin(d12) * 5.0D, Math.cos(d12) * -7.0D, 0.0D, Math.sin(d12) * -7.0D);
        } 
      case 2002:
        d1 = j;
        d5 = k;
        d9 = l;
        s1 = "iconcrack_" + acy.br.bM;
        for (k2 = 0; k2 < 8; k2++)
          a(s1, d1, d5, d9, random.nextGaussian() * 0.15D, random.nextDouble() * 0.2D, random.nextGaussian() * 0.15D); 
        l2 = acy.br.c(i1);
        f = (l2 >> 16 & 0xFF) / 255.0F;
        f1 = (l2 >> 8 & 0xFF) / 255.0F;
        f2 = (l2 >> 0 & 0xFF) / 255.0F;
        s2 = "spell";
        if (acy.br.f(i1))
          s2 = "instantSpell"; 
        for (j3 = 0; j3 < 100; j3++) {
          double d16 = random.nextDouble() * 4.0D;
          double d18 = random.nextDouble() * Math.PI * 2.0D;
          double d20 = Math.cos(d18) * d16;
          double d22 = 0.01D + random.nextDouble() * 0.5D;
          double d24 = Math.sin(d18) * d16;
          wc entityfx = b(s2, d1 + d20 * 0.1D, d5 + 0.3D, d9 + d24 * 0.1D, d20, d22, d24);
          if (entityfx != null) {
            float f3 = 0.75F + random.nextFloat() * 0.25F;
            entityfx.b(f * f3, f1 * f3, f2 * f3);
            entityfx.d((float)d16);
          } 
        } 
        this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.glass", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
      case 2001:
        k1 = i1 & 0xFF;
        if (k1 > 0) {
          yy block = yy.k[k1];
          this.r.C.b(block.bX.a(), j + 0.5F, k + 0.5F, l + 0.5F, (block.bX.b() + 1.0F) / 2.0F, block.bX.c() * 0.8F);
        } 
        this.r.j.a(j, k, l, i1 & 0xFF, i1 >> 8 & 0xFF);
      case 2004:
        for (l1 = 0; l1 < 20; l1++) {
          double d2 = j + 0.5D + (this.i.w.nextFloat() - 0.5D) * 2.0D;
          double d6 = k + 0.5D + (this.i.w.nextFloat() - 0.5D) * 2.0D;
          double d10 = l + 0.5D + (this.i.w.nextFloat() - 0.5D) * 2.0D;
          this.i.a("smoke", d2, d6, d10, 0.0D, 0.0D, 0.0D);
          this.i.a("flame", d2, d6, d10, 0.0D, 0.0D, 0.0D);
        } 
      case 1003:
        if (Math.random() < 0.5D) {
          if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
            this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.old_door_open", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
          } else {
            this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.door_open", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
          } 
        } else if (((Boolean)mod_noBiomesX.OldSounds.get()).booleanValue()) {
          this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.old_door_close", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
        } else {
          this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "random.door_close", 1.0F, this.i.w.nextFloat() * 0.1F + 0.9F);
        } 
      case 1004:
        this.i.a((j + 0.5F), (k + 0.5F), (l + 0.5F), "random.fizz", 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F);
      case 1005:
        if (acy.d[i1] instanceof pe) {
          this.i.a(((pe)acy.d[i1]).a, j, k, l);
        } else {
          this.i.a((String)null, j, k, l);
        } 
      case 1007:
        this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "mob.ghast.charge", 10.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
      case 1008:
        this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "mob.ghast.fireball", 10.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
      case 1009:
        break;
    } 
    this.i.a(j + 0.5D, k + 0.5D, l + 0.5D, "mob.ghast.fireball", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
  }
}
