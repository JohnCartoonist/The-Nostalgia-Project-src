import java.util.List;
import java.util.Random;

public class jv implements ej {
  private Random i;
  
  private eb j;
  
  private eb k;
  
  private eb l;
  
  private eb m;
  
  private eb n;
  
  public eb a;
  
  public eb b;
  
  private ry o;
  
  private double[] p;
  
  public ed c;
  
  private double[] q;
  
  private double[] r;
  
  private double[] s;
  
  private bz t;
  
  double[] d;
  
  double[] e;
  
  double[] f;
  
  double[] g;
  
  double[] h;
  
  private boolean generateStructures = true;
  
  public jv(ry world, long l, boolean flag) {
    this.c = new ed();
    this.q = new double[256];
    this.r = new double[256];
    this.s = new double[256];
    this.t = (bz)new cz();
    this.o = world;
    this.i = new Random(l);
    this.j = new eb(this.i, 16);
    this.k = new eb(this.i, 16);
    this.l = new eb(this.i, 8);
    this.m = new eb(this.i, 4);
    this.n = new eb(this.i, 4);
    this.a = new eb(this.i, 10);
    this.b = new eb(this.i, 16);
    this.generateStructures = (flag && !((Boolean)mod_noBiomesX.OverrideGenerateStructures.get()).booleanValue());
  }
  
  public void a(int i, int j, byte[] abyte0) {
    byte byte0 = 4;
    byte byte1 = 32;
    int k = byte0 + 1;
    int l = this.o.c / 8 + 1;
    int i1 = byte0 + 1;
    this.p = a(this.p, i * byte0, 0, j * byte0, k, l, i1);
    for (int j1 = 0; j1 < byte0; j1++) {
      for (int k1 = 0; k1 < byte0; k1++) {
        for (int l1 = 0; l1 < this.o.c / 8; l1++) {
          double d = 0.125D;
          double d1 = this.p[((j1 + 0) * i1 + k1 + 0) * l + l1 + 0];
          double d2 = this.p[((j1 + 0) * i1 + k1 + 1) * l + l1 + 0];
          double d3 = this.p[((j1 + 1) * i1 + k1 + 0) * l + l1 + 0];
          double d4 = this.p[((j1 + 1) * i1 + k1 + 1) * l + l1 + 0];
          double d5 = (this.p[((j1 + 0) * i1 + k1 + 0) * l + l1 + 1] - d1) * d;
          double d6 = (this.p[((j1 + 0) * i1 + k1 + 1) * l + l1 + 1] - d2) * d;
          double d7 = (this.p[((j1 + 1) * i1 + k1 + 0) * l + l1 + 1] - d3) * d;
          double d8 = (this.p[((j1 + 1) * i1 + k1 + 1) * l + l1 + 1] - d4) * d;
          for (int i2 = 0; i2 < 8; i2++) {
            double d9 = 0.25D;
            double d10 = d1;
            double d11 = d2;
            double d12 = (d3 - d1) * d9;
            double d13 = (d4 - d2) * d9;
            for (int j2 = 0; j2 < 4; j2++) {
              int k2 = j2 + j1 * 4 << this.o.b | 0 + k1 * 4 << this.o.a | l1 * 8 + i2;
              int l2 = 1 << this.o.a;
              double d14 = 0.25D;
              double d15 = d10;
              double d16 = (d11 - d10) * d14;
              for (int i3 = 0; i3 < 4; i3++) {
                int j3 = 0;
                if (l1 * 8 + i2 < byte1)
                  j3 = yy.D.bM; 
                if (d15 > 0.0D)
                  j3 = yy.bb.bM; 
                abyte0[k2] = (byte)j3;
                k2 += l2;
                d15 += d16;
              } 
              d10 += d12;
              d11 += d13;
            } 
            d1 += d5;
            d2 += d6;
            d3 += d7;
            d4 += d8;
          } 
        } 
      } 
    } 
  }
  
  public void b(int i, int j, byte[] abyte0) {
    int k = this.o.c - 64;
    double d = 0.03125D;
    this.q = this.m.a(this.q, i * 16, j * 16, 0, 16, 16, 1, d, d, 1.0D);
    this.r = this.m.a(this.r, i * 16, 109, j * 16, 16, 1, 16, d, 1.0D, d);
    this.s = this.n.a(this.s, i * 16, j * 16, 0, 16, 16, 1, d * 2.0D, d * 2.0D, d * 2.0D);
    for (int l = 0; l < 16; l++) {
      for (int i1 = 0; i1 < 16; i1++) {
        boolean flag = (this.q[l + i1 * 16] + this.i.nextDouble() * 0.2D > 0.0D);
        boolean flag1 = (this.r[l + i1 * 16] + this.i.nextDouble() * 0.2D > 0.0D);
        int j1 = (int)(this.s[l + i1 * 16] / 3.0D + 3.0D + this.i.nextDouble() * 0.25D);
        int k1 = -1;
        byte byte0 = (byte)yy.bb.bM;
        byte byte1 = (byte)yy.bb.bM;
        for (int l1 = this.o.d; l1 >= 0; l1--) {
          int i2 = (i1 * 16 + l) * this.o.c + l1;
          if (l1 >= this.o.d - this.i.nextInt(5)) {
            abyte0[i2] = (byte)yy.z.bM;
          } else if (l1 <= 0 + this.i.nextInt(5)) {
            abyte0[i2] = (byte)yy.z.bM;
          } else {
            byte byte2 = abyte0[i2];
            if (byte2 == 0) {
              k1 = -1;
            } else if (byte2 == yy.bb.bM) {
              if (k1 == -1) {
                if (j1 <= 0) {
                  byte0 = 0;
                  byte1 = (byte)yy.bb.bM;
                } else if (l1 >= k - 4 && l1 <= k + 1) {
                  byte0 = (byte)yy.bb.bM;
                  byte1 = (byte)yy.bb.bM;
                  if (flag1)
                    byte0 = (byte)yy.F.bM; 
                  if (flag1)
                    byte1 = (byte)yy.bb.bM; 
                  if (flag)
                    byte0 = (byte)yy.bc.bM; 
                  if (flag)
                    byte1 = (byte)yy.bc.bM; 
                } 
                if (l1 < k && byte0 == 0)
                  byte0 = (byte)yy.D.bM; 
                k1 = j1;
                if (l1 >= k - 1) {
                  abyte0[i2] = byte0;
                } else {
                  abyte0[i2] = byte1;
                } 
              } else if (k1 > 0) {
                k1--;
                abyte0[i2] = byte1;
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public zx a(int i, int j) {
    return b(i, j);
  }
  
  public zx b(int i, int j) {
    this.i.setSeed(i * 341873128712L + j * 132897987541L);
    byte[] abyte0 = new byte[16 * this.o.c * 16];
    a(i, j, abyte0);
    b(i, j, abyte0);
    this.t.a(this, this.o, i, j, abyte0);
    if (this.generateStructures)
      this.c.a(this, this.o, i, j, abyte0); 
    zx chunk = new zx(this.o, abyte0, i, j);
    return chunk;
  }
  
  private double[] a(double[] ad, int i, int j, int k, int l, int i1, int j1) {
    if (ad == null)
      ad = new double[l * i1 * j1]; 
    double d = 684.412D;
    double d1 = 2053.236D;
    this.g = this.a.a(this.g, i, j, k, l, 1, j1, 1.0D, 0.0D, 1.0D);
    this.h = this.b.a(this.h, i, j, k, l, 1, j1, 100.0D, 0.0D, 100.0D);
    this.d = this.l.a(this.d, i, j, k, l, i1, j1, d / 80.0D, d1 / 60.0D, d / 80.0D);
    this.e = this.j.a(this.e, i, j, k, l, i1, j1, d, d1, d);
    this.f = this.k.a(this.f, i, j, k, l, i1, j1, d, d1, d);
    int k1 = 0;
    int l1 = 0;
    double[] ad1 = new double[i1];
    for (int i2 = 0; i2 < i1; i2++) {
      ad1[i2] = Math.cos(i2 * Math.PI * 6.0D / i1) * 2.0D;
      double d2 = i2;
      if (i2 > i1 / 2)
        d2 = (i1 - 1 - i2); 
      if (d2 < 4.0D) {
        d2 = 4.0D - d2;
        ad1[i2] = ad1[i2] - d2 * d2 * d2 * 10.0D;
      } 
    } 
    for (int j2 = 0; j2 < l; j2++) {
      for (int k2 = 0; k2 < j1; k2++) {
        double d3 = (this.g[l1] + 256.0D) / 512.0D;
        if (d3 > 1.0D)
          d3 = 1.0D; 
        double d4 = 0.0D;
        double d5 = this.h[l1] / 8000.0D;
        if (d5 < 0.0D)
          d5 = -d5; 
        d5 = d5 * 3.0D - 3.0D;
        if (d5 < 0.0D) {
          d5 /= 2.0D;
          if (d5 < -1.0D)
            d5 = -1.0D; 
          d5 /= 1.4D;
          d5 /= 2.0D;
          d3 = 0.0D;
        } else {
          if (d5 > 1.0D)
            d5 = 1.0D; 
          d5 /= 6.0D;
        } 
        d3 += 0.5D;
        d5 = d5 * i1 / 16.0D;
        l1++;
        for (int l2 = 0; l2 < i1; l2++) {
          double d6 = 0.0D;
          double d7 = ad1[l2];
          double d8 = this.e[k1] / 512.0D;
          double d9 = this.f[k1] / 512.0D;
          double d10 = (this.d[k1] / 10.0D + 1.0D) / 2.0D;
          if (d10 < 0.0D) {
            d6 = d8;
          } else if (d10 > 1.0D) {
            d6 = d9;
          } else {
            d6 = d8 + (d9 - d8) * d10;
          } 
          d6 -= d7;
          if (l2 > i1 - 4) {
            double d11 = ((l2 - i1 - 4) / 3.0F);
            d6 = d6 * (1.0D - d11) + -10.0D * d11;
          } 
          if (l2 < d4) {
            double d12 = (d4 - l2) / 4.0D;
            if (d12 < 0.0D)
              d12 = 0.0D; 
            if (d12 > 1.0D)
              d12 = 1.0D; 
            d6 = d6 * (1.0D - d12) + -10.0D * d12;
          } 
          ad[k1] = d6;
          k1++;
        } 
      } 
    } 
    return ad;
  }
  
  public boolean c(int i, int j) {
    return true;
  }
  
  public void a(ej ichunkprovider, int i, int j) {
    cj.a = true;
    int k = i * 16;
    int l = j * 16;
    this.c.a(this.o, this.i, i, j);
    for (int i1 = 0; i1 < 8; i1++) {
      int k1 = k + this.i.nextInt(16) + 8;
      int i3 = this.i.nextInt(this.o.c - 8) + 4;
      int k4 = l + this.i.nextInt(16) + 8;
      (new ey(yy.C.bM)).a(this.o, this.i, k1, i3, k4);
    } 
    int j1 = this.i.nextInt(this.i.nextInt(10) + 1) + 1;
    for (int l1 = 0; l1 < j1; l1++) {
      int j3 = k + this.i.nextInt(16) + 8;
      int l4 = this.i.nextInt(this.o.c - 8) + 4;
      int i6 = l + this.i.nextInt(16) + 8;
      (new pl()).a(this.o, this.i, j3, l4, i6);
    } 
    j1 = this.i.nextInt(this.i.nextInt(10) + 1);
    for (int i2 = 0; i2 < j1; i2++) {
      int k3 = k + this.i.nextInt(16) + 8;
      int i5 = this.i.nextInt(this.o.c - 8) + 4;
      int j6 = l + this.i.nextInt(16) + 8;
      (new pt()).a(this.o, this.i, k3, i5, j6);
    } 
    for (int j2 = 0; j2 < 10; j2++) {
      int l3 = k + this.i.nextInt(16) + 8;
      int j5 = this.i.nextInt(this.o.c);
      int k6 = l + this.i.nextInt(16) + 8;
      (new aew()).a(this.o, this.i, l3, j5, k6);
    } 
    if (this.i.nextInt(1) == 0) {
      int k2 = k + this.i.nextInt(16) + 8;
      int i4 = this.i.nextInt(this.o.c);
      int k5 = l + this.i.nextInt(16) + 8;
      (new bu(yy.af.bM)).a(this.o, this.i, k2, i4, k5);
    } 
    if (this.i.nextInt(1) == 0) {
      int l2 = k + this.i.nextInt(16) + 8;
      int j4 = this.i.nextInt(this.o.c);
      int l5 = l + this.i.nextInt(16) + 8;
      (new bu(yy.ag.bM)).a(this.o, this.i, l2, j4, l5);
    } 
    cj.a = false;
  }
  
  public boolean a(boolean flag, rz iprogressupdate) {
    return true;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return true;
  }
  
  public String c() {
    return "HellRandomLevelSource";
  }
  
  public List a(jf enumcreaturetype, int i, int j, int k) {
    if (enumcreaturetype == jf.a && this.c.a(i, j, k))
      return this.c.b(); 
    vh worldchunkmanager = this.o.a();
    if (worldchunkmanager == null)
      return null; 
    sr biomegenbase = worldchunkmanager.a(new acm(i >> 4, k >> 4));
    if (biomegenbase == null)
      return null; 
    return biomegenbase.a(enumcreaturetype);
  }
  
  public am a(ry world, String s, int i, int j, int k) {
    return null;
  }
}
