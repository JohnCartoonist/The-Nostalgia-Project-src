import java.awt.image.BufferedImage;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class adt {
  public static boolean a = false;
  
  public static int b;
  
  private Minecraft r;
  
  private float s;
  
  public n c;
  
  private int t;
  
  private ia u;
  
  private ne v;
  
  private ne w;
  
  private ne x;
  
  private ne y;
  
  private ne z;
  
  private ne A;
  
  private float B;
  
  private float C;
  
  private float D;
  
  private float E;
  
  private float F;
  
  private float G;
  
  private float H;
  
  private float I;
  
  private float J;
  
  private float K;
  
  private float L;
  
  private float M;
  
  private float N;
  
  private float O;
  
  private float P;
  
  public int d;
  
  private int[] Q;
  
  private float R;
  
  private float S;
  
  private float T;
  
  private boolean U;
  
  private double V;
  
  private double W;
  
  private double X;
  
  private long Y;
  
  private long Z;
  
  private boolean aa;
  
  float e;
  
  float f;
  
  float g;
  
  float h;
  
  private Random ab;
  
  private int ac;
  
  float[] i;
  
  float[] j;
  
  volatile int k;
  
  volatile int l;
  
  FloatBuffer m;
  
  float n;
  
  float o;
  
  float p;
  
  private float ad;
  
  private float ae;
  
  public int q;
  
  public adt(Minecraft minecraft) {
    this.s = 0.0F;
    this.u = null;
    this.v = new ne();
    this.w = new ne();
    this.x = new ne();
    this.y = new ne();
    this.z = new ne();
    this.A = new ne();
    this.B = 4.0F;
    this.C = 4.0F;
    this.D = 0.0F;
    this.E = 0.0F;
    this.F = 0.0F;
    this.G = 0.0F;
    this.M = 0.0F;
    this.N = 0.0F;
    this.O = 0.0F;
    this.P = 0.0F;
    this.U = false;
    this.V = 1.0D;
    this.W = 0.0D;
    this.X = 0.0D;
    this.Y = System.currentTimeMillis();
    this.Z = 0L;
    this.aa = false;
    this.e = 0.0F;
    this.f = 0.0F;
    this.g = 0.0F;
    this.h = 0.0F;
    this.ab = new Random();
    this.ac = 0;
    this.k = 0;
    this.l = 0;
    this.m = bt.e(16);
    this.r = minecraft;
    this.c = new n(minecraft);
    this.d = minecraft.p.a(new BufferedImage(16, 16, 1));
    this.Q = new int[256];
  }
  
  public void a() {
    c();
    d();
    this.ad = this.ae;
    this.C = this.B;
    this.E = this.D;
    this.G = this.F;
    this.N = this.M;
    this.P = this.O;
    if (this.r.A.I) {
      float f = this.r.A.c * 0.6F + 0.2F;
      float f2 = f * f * f * 8.0F;
      this.J = this.v.a(this.H, 0.05F * f2);
      this.K = this.w.a(this.I, 0.05F * f2);
      this.L = 0.0F;
      this.H = 0.0F;
      this.I = 0.0F;
    } 
    if (this.r.i == null)
      this.r.i = (nq)this.r.h; 
    float f1 = this.r.f.c(me.c(this.r.i.s), me.c(this.r.i.t), me.c(this.r.i.u));
    float f3 = (3 - this.r.A.e) / 3.0F;
    float f4 = f1 * (1.0F - f3) + f3;
    this.ae += (f4 - this.ae) * 0.1F;
    this.t++;
    this.c.a();
    f();
  }
  
  public void a(float f) {
    if (this.r.i == null)
      return; 
    if (this.r.f == null)
      return; 
    double d = this.r.c.c();
    this.r.z = this.r.i.a(d, f);
    double d1 = d;
    fb vec3d = this.r.i.e(f);
    if (this.r.z != null)
      d1 = this.r.z.f.d(vec3d); 
    d1 = d = 6.0D;
    if (d1 > 3.0D)
      d1 = 3.0D; 
    d = d1;
    fb vec3d1 = this.r.i.f(f);
    fb vec3d2 = vec3d.c(vec3d1.a * d, vec3d1.b * d, vec3d1.c * d);
    this.u = null;
    float f1 = 1.0F;
    List<ia> list = this.r.f.b(this.r.i, this.r.i.C.a(vec3d1.a * d, vec3d1.b * d, vec3d1.c * d).b(f1, f1, f1));
    double d2 = 0.0D;
    for (int i = 0; i < list.size(); i++) {
      ia entity = list.get(i);
      if (entity.e_()) {
        float f2 = entity.Q();
        c axisalignedbb = entity.C.b(f2, f2, f2);
        gv movingobjectposition = axisalignedbb.a(vec3d, vec3d2);
        if (axisalignedbb.a(vec3d)) {
          if (0.0D < d2 || d2 == 0.0D) {
            this.u = entity;
            d2 = 0.0D;
          } 
        } else if (movingobjectposition != null) {
          double d3 = vec3d.d(movingobjectposition.f);
          if (d3 < d2 || d2 == 0.0D) {
            this.u = entity;
            d2 = d3;
          } 
        } 
      } 
    } 
    if (this.u != null)
      this.r.z = new gv(this.u); 
  }
  
  private void c() {
    di entityplayersp = (di)this.r.i;
    this.T = entityplayersp.o();
    this.S = this.R;
    this.R += (this.T - this.R) * 0.5F;
  }
  
  private float a(float f, boolean flag) {
    if (this.q > 0)
      return 90.0F; 
    vi entityplayer = (vi)this.r.i;
    float f1 = 70.0F;
    if (flag) {
      f1 += this.r.A.M * 40.0F;
      f1 *= this.S + (this.R - this.S) * f;
    } 
    if (entityplayer.ag() <= 0) {
      float f2 = entityplayer.aS + f;
      f1 /= (1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F;
    } 
    int i = abz.a(this.r.f, entityplayer, f);
    if (i != 0 && (yy.k[i]).bZ == p.g)
      f1 = f1 * 60.0F / 70.0F; 
    return f1 + this.N + (this.M - this.N) * f;
  }
  
  private void d(float f) {
    nq entityliving = this.r.i;
    float f1 = entityliving.aP - f;
    if (entityliving.ag() <= 0) {
      float f2 = entityliving.aS + f;
      GL11.glRotatef(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
    } 
    if (f1 < 0.0F)
      return; 
    f1 /= entityliving.aQ;
    f1 = me.a(f1 * f1 * f1 * f1 * 3.141593F);
    float f3 = entityliving.aR;
    GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(f3, 0.0F, 1.0F, 0.0F);
  }
  
  private void e(float f) {
    if (!(this.r.i instanceof vi))
      return; 
    vi entityplayer = (vi)this.r.i;
    float f1 = entityplayer.P - entityplayer.O;
    float f2 = -(entityplayer.P + f1 * f);
    float f3 = entityplayer.bF + (entityplayer.bG - entityplayer.bF) * f;
    float f4 = entityplayer.aU + (entityplayer.aV - entityplayer.aU) * f;
    GL11.glTranslatef(me.a(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(me.b(f2 * 3.141593F) * f3), 0.0F);
    GL11.glRotatef(me.a(f2 * 3.141593F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(Math.abs(me.b(f2 * 3.141593F - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
  }
  
  private void f(float f) {
    nq entityliving = this.r.i;
    float f1 = entityliving.L - 1.62F;
    double d = entityliving.p + (entityliving.s - entityliving.p) * f;
    double d1 = entityliving.q + (entityliving.t - entityliving.q) * f - f1;
    double d2 = entityliving.r + (entityliving.u - entityliving.r) * f;
    GL11.glRotatef(this.P + (this.O - this.P) * f, 0.0F, 0.0F, 1.0F);
    if (entityliving.ar()) {
      f1 = (float)(f1 + 1.0D);
      GL11.glTranslatef(0.0F, 0.3F, 0.0F);
      if (!this.r.A.J) {
        int i = this.r.f.a(me.c(entityliving.s), me.c(entityliving.t), me.c(entityliving.u));
        if (i == yy.S.bM) {
          int j = this.r.f.d(me.c(entityliving.s), me.c(entityliving.t), me.c(entityliving.u));
          int k = j & 0x3;
          GL11.glRotatef((k * 90), 0.0F, 1.0F, 0.0F);
        } 
        GL11.glRotatef(entityliving.A + (entityliving.y - entityliving.A) * f + 180.0F, 0.0F, -1.0F, 0.0F);
        GL11.glRotatef(entityliving.B + (entityliving.z - entityliving.B) * f, -1.0F, 0.0F, 0.0F);
      } 
    } else if (this.r.A.E > 0) {
      double d3 = (this.C + (this.B - this.C) * f);
      if (this.r.A.J) {
        float f2 = this.E + (this.D - this.E) * f;
        float f4 = this.G + (this.F - this.G) * f;
        GL11.glTranslatef(0.0F, 0.0F, (float)-d3);
        GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
      } else {
        float f3 = entityliving.y;
        float f5 = entityliving.z;
        if (this.r.A.E == 2)
          f5 += 180.0F; 
        double d4 = (-me.a(f3 / 180.0F * 3.141593F) * me.b(f5 / 180.0F * 3.141593F)) * d3;
        double d5 = (me.b(f3 / 180.0F * 3.141593F) * me.b(f5 / 180.0F * 3.141593F)) * d3;
        double d6 = -me.a(f5 / 180.0F * 3.141593F) * d3;
        for (int l = 0; l < 8; l++) {
          float f6 = ((l & 0x1) * 2 - 1);
          float f7 = ((l >> 1 & 0x1) * 2 - 1);
          float f8 = ((l >> 2 & 0x1) * 2 - 1);
          f6 *= 0.1F;
          f7 *= 0.1F;
          f8 *= 0.1F;
          gv movingobjectposition = this.r.f.a(fb.b(d + f6, d1 + f7, d2 + f8), fb.b(d - d4 + f6 + f8, d1 - d6 + f7, d2 - d5 + f8));
          if (movingobjectposition != null) {
            double d7 = movingobjectposition.f.d(fb.b(d, d1, d2));
            if (d7 < d3)
              d3 = d7; 
          } 
        } 
        if (this.r.A.E == 2)
          GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); 
        GL11.glRotatef(entityliving.z - f5, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(entityliving.y - f3, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, (float)-d3);
        GL11.glRotatef(f3 - entityliving.y, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f5 - entityliving.z, 1.0F, 0.0F, 0.0F);
      } 
    } else {
      GL11.glTranslatef(0.0F, 0.0F, -0.1F);
    } 
    if (!this.r.A.J) {
      GL11.glRotatef(entityliving.B + (entityliving.z - entityliving.B) * f, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(entityliving.A + (entityliving.y - entityliving.A) * f + 180.0F, 0.0F, 1.0F, 0.0F);
    } 
    GL11.glTranslatef(0.0F, f1, 0.0F);
    d = entityliving.p + (entityliving.s - entityliving.p) * f;
    d1 = entityliving.q + (entityliving.t - entityliving.q) * f - f1;
    d2 = entityliving.r + (entityliving.u - entityliving.r) * f;
    this.U = this.r.g.a(d, d1, d2, f);
  }
  
  private void a(float f, int i) {
    this.s = (256 >> this.r.A.e);
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    float f1 = 0.07F;
    if (this.r.A.g)
      GL11.glTranslatef(-(i * 2 - 1) * f1, 0.0F, 0.0F); 
    if (this.V != 1.0D) {
      GL11.glTranslatef((float)this.W, (float)-this.X, 0.0F);
      GL11.glScaled(this.V, this.V, 1.0D);
      GLU.gluPerspective(a(f, true), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
    } else {
      GLU.gluPerspective(a(f, true), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
    } 
    if (this.r.c.i()) {
      float f2 = 0.6666667F;
      GL11.glScalef(1.0F, f2, 1.0F);
    } 
    GL11.glMatrixMode(5888);
    GL11.glLoadIdentity();
    if (this.r.A.g)
      GL11.glTranslatef((i * 2 - 1) * 0.1F, 0.0F, 0.0F); 
    d(f);
    if (this.r.A.f)
      e(f); 
    float f3 = this.r.h.cb + (this.r.h.ca - this.r.h.cb) * f;
    if (f3 > 0.0F) {
      int j = 20;
      if (this.r.h.a(abg.k))
        j = 7; 
      float f4 = 5.0F / (f3 * f3 + 5.0F) - f3 * 0.04F;
      f4 *= f4;
      GL11.glRotatef((this.t + f) * j, 0.0F, 1.0F, 1.0F);
      GL11.glScalef(1.0F / f4, 1.0F, 1.0F);
      GL11.glRotatef(-(this.t + f) * j, 0.0F, 1.0F, 1.0F);
    } 
    f(f);
    if (this.q > 0) {
      int k = this.q - 1;
      if (k == 1)
        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); 
      if (k == 2)
        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); 
      if (k == 3)
        GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); 
      if (k == 4)
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F); 
      if (k == 5)
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F); 
    } 
  }
  
  private void b(float f, int i) {
    if (this.q > 0)
      return; 
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    float f1 = 0.07F;
    if (this.r.A.g)
      GL11.glTranslatef(-(i * 2 - 1) * f1, 0.0F, 0.0F); 
    if (this.V != 1.0D) {
      GL11.glTranslatef((float)this.W, (float)-this.X, 0.0F);
      GL11.glScaled(this.V, this.V, 1.0D);
      GLU.gluPerspective(a(f, false), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
    } else {
      GLU.gluPerspective(a(f, false), this.r.d / this.r.e, 0.05F, this.s * 2.0F);
    } 
    if (this.r.c.i()) {
      float f2 = 0.6666667F;
      GL11.glScalef(1.0F, f2, 1.0F);
    } 
    GL11.glMatrixMode(5888);
    GL11.glLoadIdentity();
    if (this.r.A.g)
      GL11.glTranslatef((i * 2 - 1) * 0.1F, 0.0F, 0.0F); 
    GL11.glPushMatrix();
    d(f);
    if (this.r.A.f)
      e(f); 
    if (this.r.A.E == 0 && !this.r.i.ar() && !this.r.A.D && !this.r.c.i()) {
      b(f);
      this.c.a(f);
      a(f);
    } 
    GL11.glPopMatrix();
    if (this.r.A.E == 0 && !this.r.i.ar()) {
      this.c.b(f);
      d(f);
    } 
    if (this.r.A.f)
      e(f); 
  }
  
  public void a(double d) {
    adx.a(adx.b);
    GL11.glDisable(3553);
    adx.a(adx.a);
  }
  
  public void b(double d) {
    adx.a(adx.b);
    GL11.glMatrixMode(5890);
    GL11.glLoadIdentity();
    float f = 0.00390625F;
    GL11.glScalef(f, f, f);
    GL11.glTranslatef(8.0F, 8.0F, 8.0F);
    GL11.glMatrixMode(5888);
    this.r.p.b(this.d);
    GL11.glTexParameteri(3553, 10241, 9729);
    GL11.glTexParameteri(3553, 10240, 9729);
    GL11.glTexParameteri(3553, 10241, 9729);
    GL11.glTexParameteri(3553, 10240, 9729);
    GL11.glTexParameteri(3553, 10242, 10496);
    GL11.glTexParameteri(3553, 10243, 10496);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glEnable(3553);
    adx.a(adx.a);
  }
  
  private void d() {
    this.f = (float)(this.f + (Math.random() - Math.random()) * Math.random() * Math.random());
    this.h = (float)(this.h + (Math.random() - Math.random()) * Math.random() * Math.random());
    this.f = (float)(this.f * 0.9D);
    this.h = (float)(this.h * 0.9D);
    this.e += (this.f - this.e) * 1.0F;
    this.g += (this.h - this.g) * 1.0F;
    this.aa = true;
  }
  
  private void e() {
    ry world = this.r.f;
    if (world == null)
      return; 
    if (((Boolean)mod_noBiomesX.ClassicLight.get()).booleanValue()) {
      updateLightmap_classicStyle();
      return;
    } 
    for (int i = 0; i < 256; i++) {
      float f = world.b(1.0F) * 0.95F + 0.05F;
      float f1 = world.y.f[i / 16] * f;
      float f2 = world.y.f[i % 16] * (this.e * 0.1F + 1.5F);
      if (world.s > 0)
        f1 = world.y.f[i / 16]; 
      float f3 = f1 * (world.b(1.0F) * 0.65F + 0.35F);
      float f4 = f1 * (world.b(1.0F) * 0.65F + 0.35F);
      float f5 = f1;
      float f6 = f2;
      float f7 = f2 * ((f2 * 0.6F + 0.4F) * 0.6F + 0.4F);
      float f8 = f2 * (f2 * f2 * 0.6F + 0.4F);
      float f9 = f3 + f6;
      float f10 = f4 + f7;
      float f11 = f5 + f8;
      f9 = f9 * 0.96F + 0.03F;
      f10 = f10 * 0.96F + 0.03F;
      f11 = f11 * 0.96F + 0.03F;
      if (world.y.g == 1) {
        f9 = 0.22F + f6 * 0.75F;
        f10 = 0.28F + f7 * 0.75F;
        f11 = 0.25F + f8 * 0.75F;
      } 
      float f12 = this.r.A.N;
      if (f9 > 1.0F)
        f9 = 1.0F; 
      if (f10 > 1.0F)
        f10 = 1.0F; 
      if (f11 > 1.0F)
        f11 = 1.0F; 
      float f13 = 1.0F - f9;
      float f14 = 1.0F - f10;
      float f15 = 1.0F - f11;
      f13 = 1.0F - f13 * f13 * f13 * f13;
      f14 = 1.0F - f14 * f14 * f14 * f14;
      f15 = 1.0F - f15 * f15 * f15 * f15;
      f9 = f9 * (1.0F - f12) + f13 * f12;
      f10 = f10 * (1.0F - f12) + f14 * f12;
      f11 = f11 * (1.0F - f12) + f15 * f12;
      f9 = f9 * 0.96F + 0.03F;
      f10 = f10 * 0.96F + 0.03F;
      f11 = f11 * 0.96F + 0.03F;
      if (f9 > 1.0F)
        f9 = 1.0F; 
      if (f10 > 1.0F)
        f10 = 1.0F; 
      if (f11 > 1.0F)
        f11 = 1.0F; 
      if (f9 < 0.0F)
        f9 = 0.0F; 
      if (f10 < 0.0F)
        f10 = 0.0F; 
      if (f11 < 0.0F)
        f11 = 0.0F; 
      char c = 'ÿ';
      int j = (int)(f9 * 255.0F);
      int k = (int)(f10 * 255.0F);
      int l = (int)(f11 * 255.0F);
      this.Q[i] = c << 24 | j << 16 | k << 8 | l;
    } 
    this.r.p.a(this.Q, 16, 16, this.d);
  }
  
  private void updateLightmap_classicStyle() {
    ry world = this.r.f;
    int skylight2 = world.a(1.0F);
    int index = 0;
    for (int x = 0; x < 16; x++) {
      for (int y = 0; y < 16; y++) {
        float blocklight = world.y.f[y];
        int skylightposition = x - skylight2;
        if (skylightposition < 0)
          skylightposition = 0; 
        float skylight = world.y.f[skylightposition];
        int blocklightcolor = (int)(blocklight * 255.0F);
        int skylightcolor = (int)(skylight * 255.0F);
        float tintFactorRed = 1.0F - ((Integer)mod_noBiomesX.LightTintRed.get()).intValue() / 255.0F;
        float tintFactorGreen = 1.0F - ((Integer)mod_noBiomesX.LightTintGreen.get()).intValue() / 255.0F;
        float tintFactorBlue = 1.0F - ((Integer)mod_noBiomesX.LightTintBlue.get()).intValue() / 255.0F;
        float adjustment = (15 - x) / 15.0F;
        tintFactorRed *= adjustment;
        tintFactorGreen *= adjustment;
        tintFactorBlue *= adjustment;
        tintFactorRed = 1.0F - tintFactorRed;
        tintFactorGreen = 1.0F - tintFactorGreen;
        tintFactorBlue = 1.0F - tintFactorBlue;
        blocklightcolor = (int)(blocklightcolor * (this.r.A.N + 1.0F));
        if (blocklightcolor > 255)
          blocklightcolor = 255; 
        skylightcolor = (int)(skylightcolor * (this.r.A.N + 1.0F));
        if (skylightcolor > 255)
          skylightcolor = 255; 
        int c = 255;
        if (blocklight > skylight) {
          this.Q[index] = c << 24 | (int)(blocklightcolor * tintFactorRed) << 16 | (int)(blocklightcolor * tintFactorGreen) << 8 | (int)(blocklightcolor * tintFactorBlue);
        } else {
          this.Q[index] = c << 24 | (int)(skylightcolor * tintFactorRed) << 16 | (int)(skylightcolor * tintFactorGreen) << 8 | (int)(skylightcolor * tintFactorBlue);
        } 
        index++;
      } 
    } 
    this.r.p.a(this.Q, 16, 16, this.d);
  }
  
  public void b(float f) {
    pf.a("lightTex");
    if (this.aa)
      e(); 
    pf.b();
    if (!Display.isActive()) {
      if (System.currentTimeMillis() - this.Y > 500L)
        this.r.i(); 
    } else {
      this.Y = System.currentTimeMillis();
    } 
    pf.a("mouse");
    if (this.r.R) {
      this.r.D.c();
      float f1 = this.r.A.c * 0.6F + 0.2F;
      float f2 = f1 * f1 * f1 * 8.0F;
      float f3 = this.r.D.a * f2;
      float f4 = this.r.D.b * f2;
      int l = 1;
      if (this.r.A.d)
        l = -1; 
      if (this.r.A.I) {
        this.H += f3;
        this.I += f4;
        float f5 = f - this.L;
        this.L = f;
        f3 = this.J * f5;
        f4 = this.K * f5;
        this.r.h.c(f3, f4 * l);
      } else {
        this.r.h.c(f3, f4 * l);
      } 
    } 
    pf.b();
    if (this.r.x)
      return; 
    a = this.r.A.g;
    ef scaledresolution = new ef(this.r.A, this.r.d, this.r.e);
    int i = scaledresolution.a();
    int j = scaledresolution.b();
    int k = Mouse.getX() * i / this.r.d;
    int i1 = j - Mouse.getY() * j / this.r.e - 1;
    char c = 'È';
    if (this.r.A.i == 1)
      c = 'x'; 
    if (this.r.A.i == 2)
      c = '('; 
    if (this.r.f != null) {
      pf.a("level");
      if (this.r.A.i == 0) {
        a(f, 0L);
      } else {
        a(f, this.Z + (1000000000 / c));
      } 
      pf.c("sleep");
      if (this.r.A.i == 2) {
        long l1 = (this.Z + (1000000000 / c) - System.nanoTime()) / 1000000L;
        if (l1 > 0L && l1 < 500L)
          try {
            Thread.sleep(l1);
          } catch (InterruptedException interruptedexception) {
            interruptedexception.printStackTrace();
          }  
      } 
      this.Z = System.nanoTime();
      pf.c("gui");
      if (!this.r.A.D || this.r.s != null)
        this.r.w.a(f, (this.r.s != null), k, i1); 
      pf.b();
    } else {
      GL11.glViewport(0, 0, this.r.d, this.r.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      b();
      if (this.r.A.i == 2) {
        long l2 = (this.Z + (1000000000 / c) - System.nanoTime()) / 1000000L;
        if (l2 < 0L)
          l2 += 10L; 
        if (l2 > 0L && l2 < 500L)
          try {
            Thread.sleep(l2);
          } catch (InterruptedException interruptedexception1) {
            interruptedexception1.printStackTrace();
          }  
      } 
      this.Z = System.nanoTime();
    } 
    if (this.r.s != null) {
      GL11.glClear(256);
      this.r.s.a(k, i1, f);
      if (this.r.s != null && this.r.s.r != null)
        this.r.s.r.a(f); 
    } 
  }
  
  public void a(float f, long l) {
    // Byte code:
    //   0: ldc 'lightTex'
    //   2: invokestatic a : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: getfield aa : Z
    //   9: ifeq -> 16
    //   12: aload_0
    //   13: invokespecial e : ()V
    //   16: sipush #2884
    //   19: invokestatic glEnable : (I)V
    //   22: sipush #2929
    //   25: invokestatic glEnable : (I)V
    //   28: aload_0
    //   29: getfield r : Lnet/minecraft/client/Minecraft;
    //   32: getfield i : Lnq;
    //   35: ifnonnull -> 52
    //   38: aload_0
    //   39: getfield r : Lnet/minecraft/client/Minecraft;
    //   42: aload_0
    //   43: getfield r : Lnet/minecraft/client/Minecraft;
    //   46: getfield h : Ldi;
    //   49: putfield i : Lnq;
    //   52: ldc_w 'pick'
    //   55: invokestatic c : (Ljava/lang/String;)V
    //   58: aload_0
    //   59: fload_1
    //   60: invokevirtual a : (F)V
    //   63: aload_0
    //   64: getfield r : Lnet/minecraft/client/Minecraft;
    //   67: getfield i : Lnq;
    //   70: astore #4
    //   72: aload_0
    //   73: getfield r : Lnet/minecraft/client/Minecraft;
    //   76: getfield g : Lafv;
    //   79: astore #5
    //   81: aload_0
    //   82: getfield r : Lnet/minecraft/client/Minecraft;
    //   85: getfield j : Lf;
    //   88: astore #6
    //   90: aload #4
    //   92: getfield R : D
    //   95: aload #4
    //   97: getfield s : D
    //   100: aload #4
    //   102: getfield R : D
    //   105: dsub
    //   106: fload_1
    //   107: f2d
    //   108: dmul
    //   109: dadd
    //   110: dstore #7
    //   112: aload #4
    //   114: getfield S : D
    //   117: aload #4
    //   119: getfield t : D
    //   122: aload #4
    //   124: getfield S : D
    //   127: dsub
    //   128: fload_1
    //   129: f2d
    //   130: dmul
    //   131: dadd
    //   132: dstore #9
    //   134: aload #4
    //   136: getfield T : D
    //   139: aload #4
    //   141: getfield u : D
    //   144: aload #4
    //   146: getfield T : D
    //   149: dsub
    //   150: fload_1
    //   151: f2d
    //   152: dmul
    //   153: dadd
    //   154: dstore #11
    //   156: ldc_w 'center'
    //   159: invokestatic c : (Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield r : Lnet/minecraft/client/Minecraft;
    //   166: getfield f : Lry;
    //   169: invokevirtual x : ()Lej;
    //   172: astore #13
    //   174: aload #13
    //   176: instanceof mv
    //   179: ifeq -> 220
    //   182: aload #13
    //   184: checkcast mv
    //   187: astore #14
    //   189: dload #7
    //   191: d2i
    //   192: i2f
    //   193: invokestatic d : (F)I
    //   196: iconst_4
    //   197: ishr
    //   198: istore #15
    //   200: dload #11
    //   202: d2i
    //   203: i2f
    //   204: invokestatic d : (F)I
    //   207: iconst_4
    //   208: ishr
    //   209: istore #16
    //   211: aload #14
    //   213: iload #15
    //   215: iload #16
    //   217: invokevirtual d : (II)V
    //   220: iconst_0
    //   221: istore #14
    //   223: iload #14
    //   225: iconst_2
    //   226: if_icmpge -> 1224
    //   229: aload_0
    //   230: getfield r : Lnet/minecraft/client/Minecraft;
    //   233: getfield A : Lki;
    //   236: getfield g : Z
    //   239: ifeq -> 270
    //   242: iload #14
    //   244: putstatic adt.b : I
    //   247: getstatic adt.b : I
    //   250: ifne -> 263
    //   253: iconst_0
    //   254: iconst_1
    //   255: iconst_1
    //   256: iconst_0
    //   257: invokestatic glColorMask : (ZZZZ)V
    //   260: goto -> 270
    //   263: iconst_1
    //   264: iconst_0
    //   265: iconst_0
    //   266: iconst_0
    //   267: invokestatic glColorMask : (ZZZZ)V
    //   270: ldc_w 'clear'
    //   273: invokestatic c : (Ljava/lang/String;)V
    //   276: iconst_0
    //   277: iconst_0
    //   278: aload_0
    //   279: getfield r : Lnet/minecraft/client/Minecraft;
    //   282: getfield d : I
    //   285: aload_0
    //   286: getfield r : Lnet/minecraft/client/Minecraft;
    //   289: getfield e : I
    //   292: invokestatic glViewport : (IIII)V
    //   295: aload_0
    //   296: fload_1
    //   297: invokespecial g : (F)V
    //   300: sipush #16640
    //   303: invokestatic glClear : (I)V
    //   306: sipush #2884
    //   309: invokestatic glEnable : (I)V
    //   312: ldc_w 'camera'
    //   315: invokestatic c : (Ljava/lang/String;)V
    //   318: aload_0
    //   319: fload_1
    //   320: iload #14
    //   322: invokespecial a : (FI)V
    //   325: aload_0
    //   326: getfield r : Lnet/minecraft/client/Minecraft;
    //   329: getfield h : Ldi;
    //   332: aload_0
    //   333: getfield r : Lnet/minecraft/client/Minecraft;
    //   336: getfield A : Lki;
    //   339: getfield E : I
    //   342: iconst_2
    //   343: if_icmpne -> 350
    //   346: iconst_1
    //   347: goto -> 351
    //   350: iconst_0
    //   351: invokestatic a : (Lvi;Z)V
    //   354: ldc_w 'frustrum'
    //   357: invokestatic c : (Ljava/lang/String;)V
    //   360: invokestatic a : ()Lip;
    //   363: pop
    //   364: aload_0
    //   365: getfield r : Lnet/minecraft/client/Minecraft;
    //   368: getfield A : Lki;
    //   371: getfield e : I
    //   374: iconst_2
    //   375: if_icmpge -> 396
    //   378: aload_0
    //   379: iconst_m1
    //   380: fload_1
    //   381: invokespecial a : (IF)V
    //   384: ldc_w 'sky'
    //   387: invokestatic c : (Ljava/lang/String;)V
    //   390: aload #5
    //   392: fload_1
    //   393: invokevirtual a : (F)V
    //   396: sipush #2912
    //   399: invokestatic glEnable : (I)V
    //   402: aload_0
    //   403: iconst_1
    //   404: fload_1
    //   405: invokespecial a : (IF)V
    //   408: aload_0
    //   409: getfield r : Lnet/minecraft/client/Minecraft;
    //   412: getfield A : Lki;
    //   415: getfield k : Z
    //   418: ifeq -> 427
    //   421: sipush #7425
    //   424: invokestatic glShadeModel : (I)V
    //   427: ldc_w 'culling'
    //   430: invokestatic c : (Ljava/lang/String;)V
    //   433: new ev
    //   436: dup
    //   437: invokespecial <init> : ()V
    //   440: astore #15
    //   442: aload #15
    //   444: dload #7
    //   446: dload #9
    //   448: dload #11
    //   450: invokevirtual a : (DDD)V
    //   453: aload_0
    //   454: getfield r : Lnet/minecraft/client/Minecraft;
    //   457: getfield g : Lafv;
    //   460: aload #15
    //   462: fload_1
    //   463: invokevirtual a : (Lfn;F)V
    //   466: iload #14
    //   468: ifne -> 525
    //   471: ldc_w 'updatechunks'
    //   474: invokestatic c : (Ljava/lang/String;)V
    //   477: aload_0
    //   478: getfield r : Lnet/minecraft/client/Minecraft;
    //   481: getfield g : Lafv;
    //   484: aload #4
    //   486: iconst_0
    //   487: invokevirtual a : (Lnq;Z)Z
    //   490: ifne -> 525
    //   493: lload_2
    //   494: lconst_0
    //   495: lcmp
    //   496: ifne -> 502
    //   499: goto -> 525
    //   502: lload_2
    //   503: invokestatic nanoTime : ()J
    //   506: lsub
    //   507: lstore #16
    //   509: lload #16
    //   511: lconst_0
    //   512: lcmp
    //   513: iflt -> 525
    //   516: lload #16
    //   518: ldc2_w 1000000000
    //   521: lcmp
    //   522: ifle -> 477
    //   525: aload_0
    //   526: iconst_0
    //   527: fload_1
    //   528: invokespecial a : (IF)V
    //   531: sipush #2912
    //   534: invokestatic glEnable : (I)V
    //   537: sipush #3553
    //   540: aload_0
    //   541: getfield r : Lnet/minecraft/client/Minecraft;
    //   544: getfield p : Lzh;
    //   547: ldc_w '/terrain.png'
    //   550: invokevirtual b : (Ljava/lang/String;)I
    //   553: invokestatic glBindTexture : (II)V
    //   556: invokestatic a : ()V
    //   559: ldc_w 'terrain'
    //   562: invokestatic c : (Ljava/lang/String;)V
    //   565: aload #5
    //   567: aload #4
    //   569: iconst_0
    //   570: fload_1
    //   571: f2d
    //   572: invokevirtual a : (Lnq;ID)I
    //   575: pop
    //   576: sipush #7424
    //   579: invokestatic glShadeModel : (I)V
    //   582: aload_0
    //   583: getfield q : I
    //   586: ifne -> 763
    //   589: invokestatic b : ()V
    //   592: ldc_w 'entities'
    //   595: invokestatic c : (Ljava/lang/String;)V
    //   598: aload #5
    //   600: aload #4
    //   602: fload_1
    //   603: invokevirtual e : (F)Lfb;
    //   606: aload #15
    //   608: fload_1
    //   609: invokevirtual a : (Lfb;Lfn;F)V
    //   612: aload_0
    //   613: fload_1
    //   614: f2d
    //   615: invokevirtual b : (D)V
    //   618: ldc_w 'litParticles'
    //   621: invokestatic c : (Ljava/lang/String;)V
    //   624: aload #6
    //   626: aload #4
    //   628: fload_1
    //   629: invokevirtual b : (Lia;F)V
    //   632: invokestatic a : ()V
    //   635: aload_0
    //   636: iconst_0
    //   637: fload_1
    //   638: invokespecial a : (IF)V
    //   641: ldc_w 'particles'
    //   644: invokestatic c : (Ljava/lang/String;)V
    //   647: aload #6
    //   649: aload #4
    //   651: fload_1
    //   652: invokevirtual a : (Lia;F)V
    //   655: aload_0
    //   656: fload_1
    //   657: f2d
    //   658: invokevirtual a : (D)V
    //   661: aload_0
    //   662: getfield r : Lnet/minecraft/client/Minecraft;
    //   665: getfield z : Lgv;
    //   668: ifnull -> 763
    //   671: aload #4
    //   673: getstatic p.g : Lp;
    //   676: invokevirtual a : (Lp;)Z
    //   679: ifeq -> 763
    //   682: aload #4
    //   684: instanceof vi
    //   687: ifeq -> 763
    //   690: aload #4
    //   692: checkcast vi
    //   695: astore #16
    //   697: sipush #3008
    //   700: invokestatic glDisable : (I)V
    //   703: ldc_w 'outline'
    //   706: invokestatic c : (Ljava/lang/String;)V
    //   709: aload #5
    //   711: aload #16
    //   713: aload_0
    //   714: getfield r : Lnet/minecraft/client/Minecraft;
    //   717: getfield z : Lgv;
    //   720: iconst_0
    //   721: aload #16
    //   723: getfield by : Lx;
    //   726: invokevirtual a : ()Ldk;
    //   729: fload_1
    //   730: invokevirtual a : (Lvi;Lgv;ILdk;F)V
    //   733: aload #5
    //   735: aload #16
    //   737: aload_0
    //   738: getfield r : Lnet/minecraft/client/Minecraft;
    //   741: getfield z : Lgv;
    //   744: iconst_0
    //   745: aload #16
    //   747: getfield by : Lx;
    //   750: invokevirtual a : ()Ldk;
    //   753: fload_1
    //   754: invokevirtual b : (Lvi;Lgv;ILdk;F)V
    //   757: sipush #3008
    //   760: invokestatic glEnable : (I)V
    //   763: sipush #3042
    //   766: invokestatic glDisable : (I)V
    //   769: sipush #2884
    //   772: invokestatic glEnable : (I)V
    //   775: sipush #770
    //   778: sipush #771
    //   781: invokestatic glBlendFunc : (II)V
    //   784: iconst_1
    //   785: invokestatic glDepthMask : (Z)V
    //   788: aload_0
    //   789: iconst_0
    //   790: fload_1
    //   791: invokespecial a : (IF)V
    //   794: sipush #3042
    //   797: invokestatic glEnable : (I)V
    //   800: sipush #2884
    //   803: invokestatic glDisable : (I)V
    //   806: sipush #3553
    //   809: aload_0
    //   810: getfield r : Lnet/minecraft/client/Minecraft;
    //   813: getfield p : Lzh;
    //   816: ldc_w '/terrain.png'
    //   819: invokevirtual b : (Ljava/lang/String;)I
    //   822: invokestatic glBindTexture : (II)V
    //   825: aload_0
    //   826: getfield r : Lnet/minecraft/client/Minecraft;
    //   829: getfield A : Lki;
    //   832: getfield j : Z
    //   835: ifeq -> 950
    //   838: ldc_w 'water'
    //   841: invokestatic c : (Ljava/lang/String;)V
    //   844: aload_0
    //   845: getfield r : Lnet/minecraft/client/Minecraft;
    //   848: getfield A : Lki;
    //   851: getfield k : Z
    //   854: ifeq -> 863
    //   857: sipush #7425
    //   860: invokestatic glShadeModel : (I)V
    //   863: iconst_0
    //   864: iconst_0
    //   865: iconst_0
    //   866: iconst_0
    //   867: invokestatic glColorMask : (ZZZZ)V
    //   870: aload #5
    //   872: aload #4
    //   874: iconst_1
    //   875: fload_1
    //   876: f2d
    //   877: invokevirtual a : (Lnq;ID)I
    //   880: istore #16
    //   882: aload_0
    //   883: getfield r : Lnet/minecraft/client/Minecraft;
    //   886: getfield A : Lki;
    //   889: getfield g : Z
    //   892: ifeq -> 921
    //   895: getstatic adt.b : I
    //   898: ifne -> 911
    //   901: iconst_0
    //   902: iconst_1
    //   903: iconst_1
    //   904: iconst_1
    //   905: invokestatic glColorMask : (ZZZZ)V
    //   908: goto -> 928
    //   911: iconst_1
    //   912: iconst_0
    //   913: iconst_0
    //   914: iconst_1
    //   915: invokestatic glColorMask : (ZZZZ)V
    //   918: goto -> 928
    //   921: iconst_1
    //   922: iconst_1
    //   923: iconst_1
    //   924: iconst_1
    //   925: invokestatic glColorMask : (ZZZZ)V
    //   928: iload #16
    //   930: ifle -> 941
    //   933: aload #5
    //   935: iconst_1
    //   936: fload_1
    //   937: f2d
    //   938: invokevirtual a : (ID)V
    //   941: sipush #7424
    //   944: invokestatic glShadeModel : (I)V
    //   947: goto -> 967
    //   950: ldc_w 'water'
    //   953: invokestatic c : (Ljava/lang/String;)V
    //   956: aload #5
    //   958: aload #4
    //   960: iconst_1
    //   961: fload_1
    //   962: f2d
    //   963: invokevirtual a : (Lnq;ID)I
    //   966: pop
    //   967: iconst_1
    //   968: invokestatic glDepthMask : (Z)V
    //   971: sipush #2884
    //   974: invokestatic glEnable : (I)V
    //   977: sipush #3042
    //   980: invokestatic glDisable : (I)V
    //   983: aload_0
    //   984: getfield V : D
    //   987: dconst_1
    //   988: dcmpl
    //   989: ifne -> 1094
    //   992: aload #4
    //   994: instanceof vi
    //   997: ifeq -> 1094
    //   1000: aload_0
    //   1001: getfield r : Lnet/minecraft/client/Minecraft;
    //   1004: getfield z : Lgv;
    //   1007: ifnull -> 1094
    //   1010: aload #4
    //   1012: getstatic p.g : Lp;
    //   1015: invokevirtual a : (Lp;)Z
    //   1018: ifne -> 1094
    //   1021: aload #4
    //   1023: checkcast vi
    //   1026: astore #16
    //   1028: sipush #3008
    //   1031: invokestatic glDisable : (I)V
    //   1034: ldc_w 'outline'
    //   1037: invokestatic c : (Ljava/lang/String;)V
    //   1040: aload #5
    //   1042: aload #16
    //   1044: aload_0
    //   1045: getfield r : Lnet/minecraft/client/Minecraft;
    //   1048: getfield z : Lgv;
    //   1051: iconst_0
    //   1052: aload #16
    //   1054: getfield by : Lx;
    //   1057: invokevirtual a : ()Ldk;
    //   1060: fload_1
    //   1061: invokevirtual a : (Lvi;Lgv;ILdk;F)V
    //   1064: aload #5
    //   1066: aload #16
    //   1068: aload_0
    //   1069: getfield r : Lnet/minecraft/client/Minecraft;
    //   1072: getfield z : Lgv;
    //   1075: iconst_0
    //   1076: aload #16
    //   1078: getfield by : Lx;
    //   1081: invokevirtual a : ()Ldk;
    //   1084: fload_1
    //   1085: invokevirtual b : (Lvi;Lgv;ILdk;F)V
    //   1088: sipush #3008
    //   1091: invokestatic glEnable : (I)V
    //   1094: ldc_w 'weather'
    //   1097: invokestatic c : (Ljava/lang/String;)V
    //   1100: aload_0
    //   1101: fload_1
    //   1102: invokevirtual c : (F)V
    //   1105: sipush #2912
    //   1108: invokestatic glDisable : (I)V
    //   1111: aload_0
    //   1112: getfield u : Lia;
    //   1115: ifnonnull -> 1118
    //   1118: aload_0
    //   1119: getfield r : Lnet/minecraft/client/Minecraft;
    //   1122: getfield A : Lki;
    //   1125: invokevirtual c : ()Z
    //   1128: ifeq -> 1173
    //   1131: ldc_w 'clouds'
    //   1134: invokestatic c : (Ljava/lang/String;)V
    //   1137: invokestatic glPushMatrix : ()V
    //   1140: aload_0
    //   1141: iconst_0
    //   1142: fload_1
    //   1143: invokespecial a : (IF)V
    //   1146: sipush #2912
    //   1149: invokestatic glEnable : (I)V
    //   1152: aload #5
    //   1154: fload_1
    //   1155: invokevirtual b : (F)V
    //   1158: sipush #2912
    //   1161: invokestatic glDisable : (I)V
    //   1164: aload_0
    //   1165: iconst_1
    //   1166: fload_1
    //   1167: invokespecial a : (IF)V
    //   1170: invokestatic glPopMatrix : ()V
    //   1173: ldc_w 'hand'
    //   1176: invokestatic c : (Ljava/lang/String;)V
    //   1179: aload_0
    //   1180: getfield V : D
    //   1183: dconst_1
    //   1184: dcmpl
    //   1185: ifne -> 1201
    //   1188: sipush #256
    //   1191: invokestatic glClear : (I)V
    //   1194: aload_0
    //   1195: fload_1
    //   1196: iload #14
    //   1198: invokespecial b : (FI)V
    //   1201: aload_0
    //   1202: getfield r : Lnet/minecraft/client/Minecraft;
    //   1205: getfield A : Lki;
    //   1208: getfield g : Z
    //   1211: ifne -> 1218
    //   1214: invokestatic b : ()V
    //   1217: return
    //   1218: iinc #14, 1
    //   1221: goto -> 223
    //   1224: iconst_1
    //   1225: iconst_1
    //   1226: iconst_1
    //   1227: iconst_0
    //   1228: invokestatic glColorMask : (ZZZZ)V
    //   1231: invokestatic b : ()V
    //   1234: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #880	-> 0
    //   #881	-> 5
    //   #883	-> 12
    //   #885	-> 16
    //   #886	-> 22
    //   #887	-> 28
    //   #889	-> 38
    //   #891	-> 52
    //   #892	-> 58
    //   #893	-> 63
    //   #894	-> 72
    //   #895	-> 81
    //   #896	-> 90
    //   #897	-> 112
    //   #898	-> 134
    //   #899	-> 156
    //   #900	-> 162
    //   #901	-> 174
    //   #903	-> 182
    //   #904	-> 189
    //   #905	-> 200
    //   #906	-> 211
    //   #908	-> 220
    //   #910	-> 229
    //   #912	-> 242
    //   #913	-> 247
    //   #915	-> 253
    //   #918	-> 263
    //   #921	-> 270
    //   #922	-> 276
    //   #923	-> 295
    //   #924	-> 300
    //   #925	-> 306
    //   #926	-> 312
    //   #927	-> 318
    //   #928	-> 325
    //   #929	-> 354
    //   #930	-> 360
    //   #931	-> 364
    //   #933	-> 378
    //   #934	-> 384
    //   #935	-> 390
    //   #937	-> 396
    //   #938	-> 402
    //   #939	-> 408
    //   #941	-> 421
    //   #943	-> 427
    //   #944	-> 433
    //   #945	-> 442
    //   #946	-> 453
    //   #947	-> 466
    //   #949	-> 471
    //   #953	-> 477
    //   #955	-> 499
    //   #957	-> 502
    //   #958	-> 509
    //   #960	-> 525
    //   #961	-> 531
    //   #962	-> 537
    //   #963	-> 556
    //   #964	-> 559
    //   #965	-> 565
    //   #966	-> 576
    //   #967	-> 582
    //   #969	-> 589
    //   #970	-> 592
    //   #971	-> 598
    //   #972	-> 612
    //   #973	-> 618
    //   #974	-> 624
    //   #975	-> 632
    //   #976	-> 635
    //   #977	-> 641
    //   #978	-> 647
    //   #979	-> 655
    //   #980	-> 661
    //   #982	-> 690
    //   #983	-> 697
    //   #984	-> 703
    //   #985	-> 709
    //   #986	-> 733
    //   #987	-> 757
    //   #990	-> 763
    //   #991	-> 769
    //   #992	-> 775
    //   #993	-> 784
    //   #994	-> 788
    //   #995	-> 794
    //   #996	-> 800
    //   #997	-> 806
    //   #998	-> 825
    //   #1000	-> 838
    //   #1001	-> 844
    //   #1003	-> 857
    //   #1005	-> 863
    //   #1006	-> 870
    //   #1007	-> 882
    //   #1009	-> 895
    //   #1011	-> 901
    //   #1014	-> 911
    //   #1018	-> 921
    //   #1020	-> 928
    //   #1022	-> 933
    //   #1024	-> 941
    //   #1025	-> 947
    //   #1027	-> 950
    //   #1028	-> 956
    //   #1030	-> 967
    //   #1031	-> 971
    //   #1032	-> 977
    //   #1033	-> 983
    //   #1035	-> 1021
    //   #1036	-> 1028
    //   #1037	-> 1034
    //   #1038	-> 1040
    //   #1039	-> 1064
    //   #1040	-> 1088
    //   #1042	-> 1094
    //   #1043	-> 1100
    //   #1044	-> 1105
    //   #1045	-> 1111
    //   #1046	-> 1118
    //   #1048	-> 1131
    //   #1049	-> 1137
    //   #1050	-> 1140
    //   #1051	-> 1146
    //   #1052	-> 1152
    //   #1053	-> 1158
    //   #1054	-> 1164
    //   #1055	-> 1170
    //   #1057	-> 1173
    //   #1058	-> 1179
    //   #1060	-> 1188
    //   #1061	-> 1194
    //   #1063	-> 1201
    //   #1065	-> 1214
    //   #1066	-> 1217
    //   #908	-> 1218
    //   #1070	-> 1224
    //   #1071	-> 1231
    //   #1072	-> 1234
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   189	31	14	chunkproviderloadorgenerate	Lmv;
    //   200	20	15	j	I
    //   211	9	16	k	I
    //   509	16	16	l1	J
    //   697	66	16	entityplayer	Lvi;
    //   882	65	16	i1	I
    //   1028	66	16	entityplayer1	Lvi;
    //   442	776	15	frustrum	Lev;
    //   223	1001	14	i	I
    //   0	1235	0	this	Ladt;
    //   0	1235	1	f	F
    //   0	1235	2	l	J
    //   72	1163	4	entityliving	Lnq;
    //   81	1154	5	renderglobal	Lafv;
    //   90	1145	6	effectrenderer	Lf;
    //   112	1123	7	d	D
    //   134	1101	9	d1	D
    //   156	1079	11	d2	D
    //   174	1061	13	ichunkprovider	Lej;
  }
  
  private void f() {
    float f = this.r.f.j(1.0F);
    if (!this.r.A.j)
      f /= 2.0F; 
    if (f == 0.0F)
      return; 
    this.ab.setSeed(this.t * 312987231L);
    nq entityliving = this.r.i;
    ry world = this.r.f;
    int i = me.c(entityliving.s);
    int j = me.c(entityliving.t);
    int k = me.c(entityliving.u);
    byte byte0 = 10;
    double d = 0.0D;
    double d1 = 0.0D;
    double d2 = 0.0D;
    int l = 0;
    int i1 = (int)(100.0F * f * f);
    if (this.r.A.P == 1) {
      i1 >>= 1;
    } else if (this.r.A.P == 2) {
      i1 = 0;
    } 
    for (int j1 = 0; j1 < i1; j1++) {
      int k1 = i + this.ab.nextInt(byte0) - this.ab.nextInt(byte0);
      int l1 = k + this.ab.nextInt(byte0) - this.ab.nextInt(byte0);
      int i2 = world.e(k1, l1);
      int j2 = world.a(k1, i2 - 1, l1);
      if (i2 <= j + byte0 && i2 >= j - byte0 && world.a().a(k1, l1).c() && world.a().a(k1, i2, l1) > 0.2F) {
        float f1 = this.ab.nextFloat();
        float f2 = this.ab.nextFloat();
        if (j2 > 0)
          if ((yy.k[j2]).bZ == p.h) {
            this.r.j.a((wc)new aca(world, (k1 + f1), (i2 + 0.1F) - (yy.k[j2]).bS, (l1 + f2), 0.0D, 0.0D, 0.0D));
          } else {
            if (this.ab.nextInt(++l) == 0) {
              d = (k1 + f1);
              d1 = (i2 + 0.1F) - (yy.k[j2]).bS;
              d2 = (l1 + f2);
            } 
            this.r.j.a((wc)new ub(world, (k1 + f1), (i2 + 0.1F) - (yy.k[j2]).bS, (l1 + f2)));
          }  
      } 
    } 
    if (l > 0 && this.ab.nextInt(3) < this.ac++) {
      this.ac = 0;
      if (d1 > entityliving.t + 1.0D && world.e(me.c(entityliving.s), me.c(entityliving.u)) > me.c(entityliving.t)) {
        this.r.f.a(d, d1, d2, "ambient.weather.rain", 0.1F, 0.5F);
      } else {
        this.r.f.a(d, d1, d2, "ambient.weather.rain", 0.2F, 1.0F);
      } 
    } 
  }
  
  protected void c(float f) {
    if (this.r.f.snowCovered != true)
      return; 
    b(f);
    if (this.i == null) {
      this.i = new float[1024];
      this.j = new float[1024];
      for (int i = 0; i < 32; i++) {
        for (int j = 0; j < 32; j++) {
          float f2 = (j - 16);
          float f3 = (i - 16);
          float f4 = me.c(f2 * f2 + f3 * f3);
          this.i[i << 5 | j] = -f3 / f4;
          this.j[i << 5 | j] = f2 / f4;
        } 
      } 
    } 
    nq entityliving = this.r.i;
    ry world = this.r.f;
    int k = me.c(entityliving.s);
    int l = me.c(entityliving.t);
    int i1 = me.c(entityliving.u);
    cv tessellator = cv.a;
    GL11.glDisable(2884);
    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glAlphaFunc(516, 0.01F);
    GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
    double d = entityliving.R + (entityliving.s - entityliving.R) * f;
    double d1 = entityliving.S + (entityliving.t - entityliving.S) * f;
    double d2 = entityliving.T + (entityliving.u - entityliving.T) * f;
    int j1 = me.c(d1);
    int k1 = 5;
    if (this.r.A.j)
      k1 = 10; 
    int l1 = 0;
    byte byte0 = -1;
    float f5 = this.t + f;
    if (this.r.A.j)
      k1 = 10; 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    l1 = 0;
    for (int i2 = i1 - k1; i2 <= i1 + k1; i2++) {
      for (int j2 = k - k1; j2 <= k + k1; j2++) {
        int k2 = (i2 - i1 + 16) * 32 + j2 - k + 16;
        float f6 = this.i[k2] * 0.5F;
        float f7 = this.j[k2] * 0.5F;
        int l2 = world.e(j2, i2);
        int i3 = l - k1;
        int j3 = l + k1;
        if (i3 < l2)
          i3 = l2; 
        if (j3 < l2)
          j3 = l2; 
        float f8 = 1.0F;
        int k3 = l2;
        if (k3 < j1)
          k3 = j1; 
        if (i3 != j3) {
          this.ab.setSeed((j2 * j2 * 3121 + j2 * 45238971 ^ i2 * i2 * 418711 + i2 * 13761));
          if (byte0 != 1) {
            if (byte0 >= 0)
              tessellator.a(); 
            byte0 = 1;
            GL11.glBindTexture(3553, this.r.p.b("/environment/snow.png"));
            tessellator.b();
          } 
          float f11 = ((this.t & 0x1FF) + f) / 512.0F;
          float f12 = this.ab.nextFloat() + f5 * 0.01F * (float)this.ab.nextGaussian();
          float f13 = this.ab.nextFloat() + f5 * (float)this.ab.nextGaussian() * 0.001F;
          double d5 = (j2 + 0.5F) - entityliving.s;
          double d6 = (i2 + 0.5F) - entityliving.u;
          float f16 = me.a(d5 * d5 + d6 * d6) / k1;
          float f17 = 1.0F;
          tessellator.b((world.a(j2, k3, i2, 0) * 3 + 15728880) / 4);
          tessellator.a(f17, f17, f17, ((1.0F - f16 * f16) * 0.3F + 0.5F) * 0.7F);
          tessellator.b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
          tessellator.a((j2 - f6) + 0.5D, i3, (i2 - f7) + 0.5D, (0.0F * f8 + f12), (i3 * f8 / 4.0F + f11 * f8 + f13));
          tessellator.a((j2 + f6) + 0.5D, i3, (i2 + f7) + 0.5D, (1.0F * f8 + f12), (i3 * f8 / 4.0F + f11 * f8 + f13));
          tessellator.a((j2 + f6) + 0.5D, j3, (i2 + f7) + 0.5D, (1.0F * f8 + f12), (j3 * f8 / 4.0F + f11 * f8 + f13));
          tessellator.a((j2 - f6) + 0.5D, j3, (i2 - f7) + 0.5D, (0.0F * f8 + f12), (j3 * f8 / 4.0F + f11 * f8 + f13));
          tessellator.b(0.0D, 0.0D, 0.0D);
        } 
      } 
    } 
    if (byte0 >= 0)
      tessellator.a(); 
    GL11.glEnable(2884);
    GL11.glDisable(3042);
    GL11.glAlphaFunc(516, 0.1F);
    a(f);
  }
  
  public void b() {
    ef scaledresolution = new ef(this.r.A, this.r.d, this.r.e);
    GL11.glClear(256);
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    GL11.glOrtho(0.0D, scaledresolution.a, scaledresolution.b, 0.0D, 1000.0D, 3000.0D);
    GL11.glMatrixMode(5888);
    GL11.glLoadIdentity();
    GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
  }
  
  private void g(float f) {
    ry world = this.r.f;
    nq entityliving = this.r.i;
    float f1 = 1.0F / (4 - this.r.A.e);
    f1 = 1.0F - (float)Math.pow(f1, 0.25D);
    fb vec3d = world.a(this.r.i, f);
    float f2 = (float)vec3d.a;
    float f3 = (float)vec3d.b;
    float f4 = (float)vec3d.c;
    fb vec3d1 = world.g(f);
    this.n = (float)vec3d1.a;
    this.o = (float)vec3d1.b;
    this.p = (float)vec3d1.c;
    if (this.r.A.e < 2) {
      fb vec3d2 = (me.a(world.e(f)) <= 0.0F) ? fb.b(1.0D, 0.0D, 0.0D) : fb.b(-1.0D, 0.0D, 0.0D);
      float f6 = (float)entityliving.f(f).b(vec3d2);
      if (f6 < 0.0F)
        f6 = 0.0F; 
      if (f6 > 0.0F) {
        float[] af = world.y.a(world.c(f), f);
        if (af != null) {
          f6 *= af[3];
          this.n = this.n * (1.0F - f6) + af[0] * f6;
          this.o = this.o * (1.0F - f6) + af[1] * f6;
          this.p = this.p * (1.0F - f6) + af[2] * f6;
        } 
      } 
    } 
    this.n += (f2 - this.n) * f1;
    this.o += (f3 - this.o) * f1;
    this.p += (f4 - this.p) * f1;
    float f5 = world.j(f);
    if (f5 > 0.0F) {
      float f7 = 1.0F - f5 * 0.5F;
      float f9 = 1.0F - f5 * 0.4F;
      this.n *= f7;
      this.o *= f7;
      this.p *= f9;
    } 
    float f8 = world.i(f);
    if (f8 > 0.0F) {
      float f10 = 1.0F - f8 * 0.5F;
      this.n *= f10;
      this.o *= f10;
      this.p *= f10;
    } 
    int i = abz.a(this.r.f, entityliving, f);
    if (this.U) {
      fb vec3d3 = world.f(f);
      this.n = (float)vec3d3.a;
      this.o = (float)vec3d3.b;
      this.p = (float)vec3d3.c;
    } else if (i != 0 && (yy.k[i]).bZ == p.g) {
      this.n = 0.02F;
      this.o = 0.02F;
      this.p = 0.2F;
    } else if (i != 0 && (yy.k[i]).bZ == p.h) {
      this.n = 0.6F;
      this.o = 0.1F;
      this.p = 0.0F;
    } 
    float f11 = this.ad + (this.ae - this.ad) * f;
    this.n *= f11;
    this.o *= f11;
    this.p *= f11;
    double d = (entityliving.S + (entityliving.t - entityliving.S) * f) / 32.0D;
    if (entityliving.a(abg.q)) {
      int j = entityliving.b(abg.q).b();
      if (j < 20) {
        d *= (1.0F - j / 20.0F);
      } else {
        d = 0.0D;
      } 
    } 
    if (d < 1.0D && ((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue()) {
      if (d < 0.0D)
        d = 0.0D; 
      d *= d;
      this.n = (float)(this.n * d);
      this.o = (float)(this.o * d);
      this.p = (float)(this.p * d);
    } 
    if (this.r.A.g) {
      float f12 = (this.n * 30.0F + this.o * 59.0F + this.p * 11.0F) / 100.0F;
      float f13 = (this.n * 30.0F + this.o * 70.0F) / 100.0F;
      float f14 = (this.n * 30.0F + this.p * 70.0F) / 100.0F;
      this.n = f12;
      this.o = f13;
      this.p = f14;
    } 
    GL11.glClearColor(this.n, this.o, this.p, 0.0F);
  }
  
  private void a(int i, float f) {
    nq entityliving = this.r.i;
    if (i == 999) {
      GL11.glFog(2918, a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glFogi(2917, 9729);
      GL11.glFogf(2915, 0.0F);
      GL11.glFogf(2916, 8.0F);
      if ((GLContext.getCapabilities()).GL_NV_fog_distance)
        GL11.glFogi(34138, 34139); 
      GL11.glFogf(2915, 0.0F);
      return;
    } 
    GL11.glFog(2918, a(this.n, this.o, this.p, 1.0F));
    GL11.glNormal3f(0.0F, -1.0F, 0.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    int j = abz.a(this.r.f, entityliving, f);
    if (entityliving.a(abg.q)) {
      float f1 = 5.0F;
      int k = entityliving.b(abg.q).b();
      if (k < 20)
        f1 = 5.0F + (this.s - 5.0F) * (1.0F - k / 20.0F); 
      GL11.glFogi(2917, 9729);
      if (i < 0) {
        GL11.glFogf(2915, 0.0F);
        GL11.glFogf(2916, f1 * 0.8F);
      } else {
        GL11.glFogf(2915, f1 * 0.25F);
        GL11.glFogf(2916, f1);
      } 
      if ((GLContext.getCapabilities()).GL_NV_fog_distance)
        GL11.glFogi(34138, 34139); 
    } else if (this.U) {
      GL11.glFogi(2917, 2048);
      GL11.glFogf(2914, 0.1F);
      float f2 = 1.0F;
      float f6 = 1.0F;
      float f9 = 1.0F;
      if (this.r.A.g) {
        float f12 = (f2 * 30.0F + f6 * 59.0F + f9 * 11.0F) / 100.0F;
        float f16 = (f2 * 30.0F + f6 * 70.0F) / 100.0F;
        float f19 = (f2 * 30.0F + f9 * 70.0F) / 100.0F;
        f2 = f12;
        f6 = f16;
        f9 = f19;
      } 
    } else if (j > 0 && (yy.k[j]).bZ == p.g) {
      GL11.glFogi(2917, 2048);
      if (!entityliving.a(abg.o)) {
        GL11.glFogf(2914, 0.1F);
      } else {
        GL11.glFogf(2914, 0.05F);
      } 
      float f3 = 0.4F;
      float f7 = 0.4F;
      float f10 = 0.9F;
      if (this.r.A.g) {
        float f13 = (f3 * 30.0F + f7 * 59.0F + f10 * 11.0F) / 100.0F;
        float f17 = (f3 * 30.0F + f7 * 70.0F) / 100.0F;
        float f20 = (f3 * 30.0F + f10 * 70.0F) / 100.0F;
        f3 = f13;
        f7 = f17;
        f10 = f20;
      } 
    } else if (j > 0 && (yy.k[j]).bZ == p.h) {
      GL11.glFogi(2917, 2048);
      GL11.glFogf(2914, 2.0F);
      float f4 = 0.4F;
      float f8 = 0.3F;
      float f11 = 0.3F;
      if (this.r.A.g) {
        float f14 = (f4 * 30.0F + f8 * 59.0F + f11 * 11.0F) / 100.0F;
        float f18 = (f4 * 30.0F + f8 * 70.0F) / 100.0F;
        float f21 = (f4 * 30.0F + f11 * 70.0F) / 100.0F;
        f4 = f14;
        f8 = f18;
        f11 = f21;
      } 
    } else {
      float f5 = this.s;
      if (!this.r.f.y.e) {
        double d = ((entityliving.a(f) & 0xF00000) >> 20) / 16.0D + (entityliving.S + (entityliving.t - entityliving.S) * f + 4.0D) / 32.0D;
        if (d < 1.0D && ((Boolean)mod_noBiomesX.VoidFog.get()).booleanValue()) {
          if (d < 0.0D)
            d = 0.0D; 
          d *= d;
          float f15 = 100.0F * (float)d;
          if (f15 < 5.0F)
            f15 = 5.0F; 
          if (f5 > f15)
            f5 = f15; 
        } 
      } 
      GL11.glFogi(2917, 9729);
      if (i < 0) {
        GL11.glFogf(2915, 0.0F);
        GL11.glFogf(2916, f5 * 0.8F);
      } else {
        GL11.glFogf(2915, f5 * 0.25F);
        GL11.glFogf(2916, f5);
      } 
      if ((GLContext.getCapabilities()).GL_NV_fog_distance)
        GL11.glFogi(34138, 34139); 
      if (this.r.f.y.c)
        GL11.glFogf(2915, 0.0F); 
    } 
    GL11.glEnable(2903);
    GL11.glColorMaterial(1028, 4608);
  }
  
  private FloatBuffer a(float f, float f1, float f2, float f3) {
    this.m.clear();
    this.m.put(f).put(f1).put(f2).put(f3);
    this.m.flip();
    return this.m;
  }
}
