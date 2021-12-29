import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class acr {
  public kq a;
  
  public int e;
  
  public boolean f;
  
  public boolean g;
  
  public static boolean b = true;
  
  public static boolean cfgGrassFix = true;
  
  public boolean c;
  
  public boolean[] d;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public boolean n;
  
  public float o;
  
  public float p;
  
  public float q;
  
  public float r;
  
  public float s;
  
  public float t;
  
  public float u;
  
  public float v;
  
  public float w;
  
  public float x;
  
  public float y;
  
  public float z;
  
  public float A;
  
  public float B;
  
  public float C;
  
  public float D;
  
  public float E;
  
  public float F;
  
  public float G;
  
  public float H;
  
  public float I;
  
  public float J;
  
  public float K;
  
  public float L;
  
  public float M;
  
  public float N;
  
  public float O;
  
  public int P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public int T;
  
  public int U;
  
  public int V;
  
  public int W;
  
  public int X;
  
  public int Y;
  
  public int Z;
  
  public int aa;
  
  public int ab;
  
  public int ac;
  
  public int ad;
  
  public int ae;
  
  public int af;
  
  public int ag;
  
  public int ah;
  
  public int ai;
  
  public int aj;
  
  public int ak;
  
  public int al;
  
  public int am;
  
  public int an;
  
  public float ao;
  
  public float ap;
  
  public float aq;
  
  public float ar;
  
  public float as;
  
  public float at;
  
  public float au;
  
  public float av;
  
  public float aw;
  
  public float ax;
  
  public float ay;
  
  public float az;
  
  public boolean aA;
  
  public boolean aB;
  
  public boolean aC;
  
  public boolean aD;
  
  public boolean aE;
  
  public boolean aF;
  
  public boolean aG;
  
  public boolean aH;
  
  public boolean aI;
  
  public boolean aJ;
  
  public boolean aK;
  
  public boolean aL;
  
  public acr(kq iblockaccess) {
    this.e = -1;
    this.f = false;
    this.g = false;
    this.c = true;
    this.d = new boolean[256];
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.aj = 1;
    this.a = iblockaccess;
    for (int i = 0; i < 256; i++) {
      yy block = yy.k[i];
      if (block != null) {
        if (block == yy.aT)
          this.d[i] = true; 
        if (block.b() && block.a())
          this.d[i] = true; 
      } 
    } 
  }
  
  public acr() {
    this.e = -1;
    this.f = false;
    this.g = false;
    this.c = true;
    this.d = new boolean[256];
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.aj = 1;
  }
  
  public void a() {
    this.e = -1;
  }
  
  public void a(yy block, int i, int j, int k, int l) {
    this.e = l;
    b(block, i, j, k);
    this.e = -1;
  }
  
  public void a(yy block, int i, int j, int k) {
    this.g = true;
    b(block, i, j, k);
    this.g = false;
  }
  
  public boolean a(int i, int j, int k, int l) {
    if (this != null)
      return false; 
    byte byte0 = 13;
    byte byte1 = 52;
    byte byte2 = 32;
    int i1 = me.a(i - byte0);
    int j1 = me.a(k - byte1);
    if (j1 <= byte2 && i1 <= byte2 && (i1 == byte2 || j1 == byte2) && this.d[this.a.a(i, j, k)]) {
      int k1 = 5;
      if (i == byte0 - byte2)
        k1--; 
      if (i == byte0 + byte2)
        k1++; 
      if (k == byte1 - byte2)
        k1 -= 3; 
      if (k == byte1 + byte2)
        k1 += 3; 
      b(k1, i, j, k);
      return true;
    } 
    return false;
  }
  
  public boolean b(yy block, int i, int j, int k) {
    int l = block.c();
    block.b(this.a, i, j, k);
    return (l != 0) ? ((l != 4) ? ((l != 13) ? ((l != 1) ? ((l != 19) ? ((l != 23) ? ((l != 6) ? ((l != 2) ? ((l != 3) ? ((l != 5) ? ((l != 8) ? ((l != 7) ? ((l != 9) ? ((l != 10) ? ((l != 27) ? ((l != 11) ? ((l != 12) ? ((l != 14) ? ((l != 15) ? ((l != 16) ? ((l != 17) ? ((l != 18) ? ((l != 20) ? ((l != 21) ? ((l != 24) ? ((l != 25) ? ((l != 26) ? ModLoader.RenderWorldBlock(this, this.a, i, j, k, block, l) : s(block, i, j, k)) : a((ahp)block, i, j, k)) : a((ic)block, i, j, k)) : a((fp)block, i, j, k)) : i(block, i, j, k)) : a((uh)block, i, j, k)) : c(block, i, j, k, true)) : b(block, i, j, k, false)) : u(block, i, j, k)) : t(block, i, j, k)) : e(block, i, j, k)) : a((nz)block, i, j, k)) : a((aci)block, i, j, k)) : q(block, i, j, k)) : a((afr)block, i, j, k)) : r(block, i, j, k)) : h(block, i, j, k)) : g(block, i, j, k)) : f(block, i, j, k)) : c(block, i, j, k)) : l(block, i, j, k)) : m(block, i, j, k)) : k(block, i, j, k)) : j(block, i, j, k)) : p(block, i, j, k)) : n(block, i, j, k)) : o(block, i, j, k);
  }
  
  public boolean s(yy block, int i, int j, int k) {
    int l = this.a.d(i, j, k);
    int i1 = l & 0x3;
    if (i1 == 0) {
      this.l = 3;
    } else if (i1 == 3) {
      this.l = 1;
    } else if (i1 == 1) {
      this.l = 2;
    } 
    if (!rl.e(l)) {
      block.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      o(block, i, j, k);
      block.e();
      this.l = 0;
      return true;
    } 
    block.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    o(block, i, j, k);
    this.e = 174;
    block.a(0.25F, 0.8125F, 0.25F, 0.75F, 1.0F, 0.75F);
    o(block, i, j, k);
    a();
    block.e();
    this.l = 0;
    return true;
  }
  
  public boolean t(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = this.a.d(i, j, k);
    int i1 = aab.e(l);
    boolean flag = aab.f(l);
    float f = 0.5F;
    float f1 = 1.0F;
    float f2 = 0.8F;
    float f3 = 0.6F;
    int j1 = block.e(this.a, i, j, k);
    tessellator.b(j1);
    tessellator.a(f, f, f);
    int k1 = block.a(this.a, i, j, k, 0);
    int l1 = (k1 & 0xF) << 4;
    int i2 = k1 & 0xF0;
    double d = (l1 / 256.0F);
    double d1 = ((l1 + 16) - 0.01D) / 256.0D;
    double d2 = (i2 / 256.0F);
    double d3 = ((i2 + 16) - 0.01D) / 256.0D;
    double d4 = i + block.bR;
    double d5 = i + block.bU;
    double d6 = j + block.bS + 0.1875D;
    double d7 = k + block.bT;
    double d8 = k + block.bW;
    tessellator.a(d4, d6, d8, d, d3);
    tessellator.a(d4, d6, d7, d, d2);
    tessellator.a(d5, d6, d7, d1, d2);
    tessellator.a(d5, d6, d8, d1, d3);
    tessellator.b(block.e(this.a, i, j + 1, k));
    tessellator.a(f1, f1, f1);
    k1 = block.a(this.a, i, j, k, 1);
    l1 = (k1 & 0xF) << 4;
    i2 = k1 & 0xF0;
    d = (l1 / 256.0F);
    d1 = ((l1 + 16) - 0.01D) / 256.0D;
    d2 = (i2 / 256.0F);
    d3 = ((i2 + 16) - 0.01D) / 256.0D;
    d4 = d;
    d5 = d1;
    d6 = d2;
    d7 = d2;
    d8 = d;
    double d9 = d1;
    double d10 = d3;
    double d11 = d3;
    if (i1 == 0) {
      d5 = d;
      d6 = d3;
      d8 = d1;
      d11 = d2;
    } else if (i1 == 2) {
      d4 = d1;
      d7 = d3;
      d9 = d;
      d10 = d2;
    } else if (i1 == 3) {
      d4 = d1;
      d7 = d3;
      d9 = d;
      d10 = d2;
      d5 = d;
      d6 = d3;
      d8 = d1;
      d11 = d2;
    } 
    double d12 = i + block.bR;
    double d13 = i + block.bU;
    double d14 = j + block.bV;
    double d15 = k + block.bT;
    double d16 = k + block.bW;
    tessellator.a(d13, d14, d16, d8, d10);
    tessellator.a(d13, d14, d15, d4, d6);
    tessellator.a(d12, d14, d15, d5, d7);
    tessellator.a(d12, d14, d16, d9, d11);
    k1 = lz.c[i1];
    if (flag)
      k1 = lz.c[lz.e[i1]]; 
    byte byte0 = 4;
    switch (i1) {
      case 0:
        byte0 = 5;
        break;
      case 1:
        byte0 = 3;
        break;
      case 3:
        byte0 = 2;
        break;
    } 
    if (k1 != 2 && (this.g || block.a_(this.a, i, j, k - 1, 2))) {
      tessellator.b((block.bT <= 0.0D) ? block.e(this.a, i, j, k - 1) : j1);
      tessellator.a(f2, f2, f2);
      this.f = (byte0 == 2);
      c(block, i, j, k, block.a(this.a, i, j, k, 2));
    } 
    if (k1 != 3 && (this.g || block.a_(this.a, i, j, k + 1, 3))) {
      tessellator.b((block.bW >= 1.0D) ? block.e(this.a, i, j, k + 1) : j1);
      tessellator.a(f2, f2, f2);
      this.f = (byte0 == 3);
      d(block, i, j, k, block.a(this.a, i, j, k, 3));
    } 
    if (k1 != 4 && (this.g || block.a_(this.a, i - 1, j, k, 4))) {
      tessellator.b((block.bT <= 0.0D) ? block.e(this.a, i - 1, j, k) : j1);
      tessellator.a(f3, f3, f3);
      this.f = (byte0 == 4);
      e(block, i, j, k, block.a(this.a, i, j, k, 4));
    } 
    if (k1 != 5 && (this.g || block.a_(this.a, i + 1, j, k, 5))) {
      tessellator.b((block.bW >= 1.0D) ? block.e(this.a, i + 1, j, k) : j1);
      tessellator.a(f3, f3, f3);
      this.f = (byte0 == 5);
      f(block, i, j, k, block.a(this.a, i, j, k, 5));
    } 
    this.f = false;
    return true;
  }
  
  public boolean a(ahp blockbrewingstand, int i, int j, int k) {
    blockbrewingstand.a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
    o((yy)blockbrewingstand, i, j, k);
    this.e = 156;
    blockbrewingstand.a(0.5625F, 0.0F, 0.3125F, 0.9375F, 0.125F, 0.6875F);
    o((yy)blockbrewingstand, i, j, k);
    blockbrewingstand.a(0.125F, 0.0F, 0.0625F, 0.5F, 0.125F, 0.4375F);
    o((yy)blockbrewingstand, i, j, k);
    blockbrewingstand.a(0.125F, 0.0F, 0.5625F, 0.5F, 0.125F, 0.9375F);
    o((yy)blockbrewingstand, i, j, k);
    a();
    cv tessellator = cv.a;
    tessellator.b(blockbrewingstand.e(this.a, i, j, k));
    float f = 1.0F;
    int l = blockbrewingstand.a(this.a, i, j, k);
    float f1 = (l >> 16 & 0xFF) / 255.0F;
    float f2 = (l >> 8 & 0xFF) / 255.0F;
    float f3 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    } 
    tessellator.a(f * f1, f * f2, f * f3);
    int i1 = blockbrewingstand.a(0, 0);
    if (this.e >= 0)
      i1 = this.e; 
    int j1 = (i1 & 0xF) << 4;
    int k1 = i1 & 0xF0;
    double d = (k1 / 256.0F);
    double d1 = ((k1 + 15.99F) / 256.0F);
    int l1 = this.a.d(i, j, k);
    for (int i2 = 0; i2 < 3; i2++) {
      double d2 = i2 * Math.PI * 2.0D / 3.0D + 1.5707963267948966D;
      double d3 = ((j1 + 8.0F) / 256.0F);
      double d4 = ((j1 + 15.99F) / 256.0F);
      if ((l1 & 1 << i2) != 0) {
        d3 = ((j1 + 7.99F) / 256.0F);
        d4 = ((j1 + 0.0F) / 256.0F);
      } 
      double d5 = i + 0.5D;
      double d6 = i + 0.5D + Math.sin(d2) * 8.0D / 16.0D;
      double d7 = k + 0.5D;
      double d8 = k + 0.5D + Math.cos(d2) * 8.0D / 16.0D;
      tessellator.a(d5, (j + 1), d7, d3, d);
      tessellator.a(d5, (j + 0), d7, d3, d1);
      tessellator.a(d6, (j + 0), d8, d4, d1);
      tessellator.a(d6, (j + 1), d8, d4, d);
      tessellator.a(d6, (j + 1), d8, d4, d);
      tessellator.a(d6, (j + 0), d8, d4, d1);
      tessellator.a(d5, (j + 0), d7, d3, d1);
      tessellator.a(d5, (j + 1), d7, d3, d);
    } 
    blockbrewingstand.e();
    return true;
  }
  
  public boolean a(ic blockcauldron, int i, int j, int k) {
    o((yy)blockcauldron, i, j, k);
    cv tessellator = cv.a;
    tessellator.b(blockcauldron.e(this.a, i, j, k));
    float f = 1.0F;
    int l = blockcauldron.a(this.a, i, j, k);
    float f1 = (l >> 16 & 0xFF) / 255.0F;
    float f2 = (l >> 8 & 0xFF) / 255.0F;
    float f3 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f6 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f4 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f7 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f6;
      f2 = f4;
      f3 = f7;
    } 
    tessellator.a(f * f1, f * f2, f * f3);
    char c = '';
    float f5 = 0.125F;
    f((yy)blockcauldron, (i - 1.0F + f5), j, k, c);
    e((yy)blockcauldron, (i + 1.0F - f5), j, k, c);
    d((yy)blockcauldron, i, j, (k - 1.0F + f5), c);
    c((yy)blockcauldron, i, j, (k + 1.0F - f5), c);
    char c1 = '';
    b((yy)blockcauldron, i, (j - 1.0F + 0.25F), k, c1);
    a((yy)blockcauldron, i, (j + 1.0F - 0.75F), k, c1);
    int i1 = this.a.d(i, j, k);
    if (i1 > 0) {
      char c2 = 'Í';
      if (i1 > 3)
        i1 = 3; 
      b((yy)blockcauldron, i, (j - 1.0F + (6.0F + i1 * 3.0F) / 16.0F), k, c2);
    } 
    return true;
  }
  
  public boolean c(yy block, int i, int j, int k) {
    int l = this.a.d(i, j, k);
    cv tessellator = cv.a;
    tessellator.b(block.e(this.a, i, j, k));
    tessellator.a(1.0F, 1.0F, 1.0F);
    double d = 0.4000000059604645D;
    double d1 = 0.5D - d;
    double d2 = 0.20000000298023224D;
    if (l == 1) {
      a(block, i - d1, j + d2, k, -d, 0.0D);
    } else if (l == 2) {
      a(block, i + d1, j + d2, k, d, 0.0D);
    } else if (l == 3) {
      a(block, i, j + d2, k - d1, 0.0D, -d);
    } else if (l == 4) {
      a(block, i, j + d2, k + d1, 0.0D, d);
    } else {
      a(block, i, j, k, 0.0D, 0.0D);
    } 
    return true;
  }
  
  public boolean u(yy block, int i, int j, int k) {
    int l = this.a.d(i, j, k);
    int i1 = l & 0x3;
    int j1 = (l & 0xC) >> 2;
    o(block, i, j, k);
    cv tessellator = cv.a;
    tessellator.b(block.e(this.a, i, j, k));
    tessellator.a(1.0F, 1.0F, 1.0F);
    double d = -0.1875D;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    switch (i1) {
      case 0:
        d4 = -0.3125D;
        d2 = mz.a[j1];
        break;
      case 1:
        d3 = 0.3125D;
        d1 = -mz.a[j1];
        break;
      case 2:
        d4 = 0.3125D;
        d2 = -mz.a[j1];
        break;
      case 3:
        d3 = -0.3125D;
        d1 = mz.a[j1];
        break;
    } 
    a(block, i + d1, j + d, k + d2, 0.0D, 0.0D);
    a(block, i + d3, j + d, k + d4, 0.0D, 0.0D);
    int k1 = block.b(1);
    int l1 = (k1 & 0xF) << 4;
    int i2 = k1 & 0xF0;
    double d5 = (l1 / 256.0F);
    double d6 = ((l1 + 15.99F) / 256.0F);
    double d7 = (i2 / 256.0F);
    double d8 = ((i2 + 15.99F) / 256.0F);
    double d9 = 0.125D;
    double d10 = (i + 1);
    double d11 = (i + 1);
    double d12 = (i + 0);
    double d13 = (i + 0);
    double d14 = (k + 0);
    double d15 = (k + 1);
    double d16 = (k + 1);
    double d17 = (k + 0);
    double d18 = j + d9;
    d10 = d11 = (i + 0);
    d12 = d13 = (i + 1);
    d14 = d17 = (k + 1);
    d15 = d16 = (k + 0);
    d10 = d13 = (i + 0);
    d11 = d12 = (i + 1);
    d14 = d15 = (k + 0);
    d16 = d17 = (k + 1);
    if (i1 == 1) {
      d10 = d13 = (i + 1);
      d11 = d12 = (i + 0);
      d14 = d15 = (k + 1);
      d16 = d17 = (k + 0);
    } 
    tessellator.a(d13, d18, d17, d5, d7);
    tessellator.a(d12, d18, d16, d5, d8);
    tessellator.a(d11, d18, d15, d6, d8);
    tessellator.a(d10, d18, d14, d6, d7);
    return true;
  }
  
  public void d(yy block, int i, int j, int k) {
    this.g = true;
    b(block, i, j, k, true);
    this.g = false;
  }
  
  public boolean b(yy block, int i, int j, int k, boolean flag) {
    int l = this.a.d(i, j, k);
    boolean flag1 = (flag || (l & 0x8) != 0);
    int i1 = abr.e(l);
    if (flag1) {
      switch (i1) {
        case 0:
          this.h = 3;
          this.i = 3;
          this.j = 3;
          this.k = 3;
          block.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 1:
          block.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
          break;
        case 2:
          this.j = 1;
          this.k = 2;
          block.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
          break;
        case 3:
          this.j = 2;
          this.k = 1;
          this.l = 3;
          this.m = 3;
          block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
          break;
        case 4:
          this.h = 1;
          this.i = 2;
          this.l = 2;
          this.m = 1;
          block.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 5:
          this.h = 2;
          this.i = 1;
          this.l = 1;
          this.m = 2;
          block.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
          break;
      } 
      o(block, i, j, k);
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      this.m = 0;
      block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      switch (i1) {
        case 0:
          this.h = 3;
          this.i = 3;
          this.j = 3;
          this.k = 3;
          break;
        case 2:
          this.j = 1;
          this.k = 2;
          break;
        case 3:
          this.j = 2;
          this.k = 1;
          this.l = 3;
          this.m = 3;
          break;
        case 4:
          this.h = 1;
          this.i = 2;
          this.l = 2;
          this.m = 1;
          break;
        case 5:
          this.h = 2;
          this.i = 1;
          this.l = 1;
          this.m = 2;
          break;
      } 
      o(block, i, j, k);
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      this.m = 0;
    } 
    return true;
  }
  
  public void a(double d, double d1, double d2, double d3, double d4, double d5, float f, double d6) {
    int i = 108;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    cv tessellator = cv.a;
    double d7 = ((j + 0) / 256.0F);
    double d8 = ((k + 0) / 256.0F);
    double d9 = (j + d6 - 0.01D) / 256.0D;
    double d10 = ((k + 4.0F) - 0.01D) / 256.0D;
    tessellator.a(f, f, f);
    tessellator.a(d, d3, d4, d9, d8);
    tessellator.a(d, d2, d4, d7, d8);
    tessellator.a(d1, d2, d5, d7, d10);
    tessellator.a(d1, d3, d5, d9, d10);
  }
  
  public void b(double d, double d1, double d2, double d3, double d4, double d5, float f, double d6) {
    int i = 108;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    cv tessellator = cv.a;
    double d7 = ((j + 0) / 256.0F);
    double d8 = ((k + 0) / 256.0F);
    double d9 = (j + d6 - 0.01D) / 256.0D;
    double d10 = ((k + 4.0F) - 0.01D) / 256.0D;
    tessellator.a(f, f, f);
    tessellator.a(d, d2, d5, d9, d8);
    tessellator.a(d, d2, d4, d7, d8);
    tessellator.a(d1, d3, d4, d7, d10);
    tessellator.a(d1, d3, d5, d9, d10);
  }
  
  public void c(double d, double d1, double d2, double d3, double d4, double d5, float f, double d6) {
    int i = 108;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    cv tessellator = cv.a;
    double d7 = ((j + 0) / 256.0F);
    double d8 = ((k + 0) / 256.0F);
    double d9 = (j + d6 - 0.01D) / 256.0D;
    double d10 = ((k + 4.0F) - 0.01D) / 256.0D;
    tessellator.a(f, f, f);
    tessellator.a(d1, d2, d4, d9, d8);
    tessellator.a(d, d2, d4, d7, d8);
    tessellator.a(d, d3, d5, d7, d10);
    tessellator.a(d1, d3, d5, d9, d10);
  }
  
  public void a(yy block, int i, int j, int k, boolean flag) {
    this.g = true;
    c(block, i, j, k, flag);
    this.g = false;
  }
  
  public boolean c(yy block, int i, int j, int k, boolean flag) {
    int l = this.a.d(i, j, k);
    int i1 = acu.f(l);
    float f = block.d(this.a, i, j, k);
    float f1 = flag ? 1.0F : 0.5F;
    double d = flag ? 16.0D : 8.0D;
    switch (i1) {
      case 0:
        this.h = 3;
        this.i = 3;
        this.j = 3;
        this.k = 3;
        block.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
        o(block, i, j, k);
        a((i + 0.375F), (i + 0.625F), (j + 0.25F), (j + 0.25F + f1), (k + 0.625F), (k + 0.625F), f * 0.8F, d);
        a((i + 0.625F), (i + 0.375F), (j + 0.25F), (j + 0.25F + f1), (k + 0.375F), (k + 0.375F), f * 0.8F, d);
        a((i + 0.375F), (i + 0.375F), (j + 0.25F), (j + 0.25F + f1), (k + 0.375F), (k + 0.625F), f * 0.6F, d);
        a((i + 0.625F), (i + 0.625F), (j + 0.25F), (j + 0.25F + f1), (k + 0.625F), (k + 0.375F), f * 0.6F, d);
        break;
      case 1:
        block.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
        o(block, i, j, k);
        a((i + 0.375F), (i + 0.625F), (j - 0.25F + 1.0F - f1), (j - 0.25F + 1.0F), (k + 0.625F), (k + 0.625F), f * 0.8F, d);
        a((i + 0.625F), (i + 0.375F), (j - 0.25F + 1.0F - f1), (j - 0.25F + 1.0F), (k + 0.375F), (k + 0.375F), f * 0.8F, d);
        a((i + 0.375F), (i + 0.375F), (j - 0.25F + 1.0F - f1), (j - 0.25F + 1.0F), (k + 0.375F), (k + 0.625F), f * 0.6F, d);
        a((i + 0.625F), (i + 0.625F), (j - 0.25F + 1.0F - f1), (j - 0.25F + 1.0F), (k + 0.625F), (k + 0.375F), f * 0.6F, d);
        break;
      case 2:
        this.j = 1;
        this.k = 2;
        block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
        o(block, i, j, k);
        b((i + 0.375F), (i + 0.375F), (j + 0.625F), (j + 0.375F), (k + 0.25F), (k + 0.25F + f1), f * 0.6F, d);
        b((i + 0.625F), (i + 0.625F), (j + 0.375F), (j + 0.625F), (k + 0.25F), (k + 0.25F + f1), f * 0.6F, d);
        b((i + 0.375F), (i + 0.625F), (j + 0.375F), (j + 0.375F), (k + 0.25F), (k + 0.25F + f1), f * 0.5F, d);
        b((i + 0.625F), (i + 0.375F), (j + 0.625F), (j + 0.625F), (k + 0.25F), (k + 0.25F + f1), f, d);
        break;
      case 3:
        this.j = 2;
        this.k = 1;
        this.l = 3;
        this.m = 3;
        block.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
        o(block, i, j, k);
        b((i + 0.375F), (i + 0.375F), (j + 0.625F), (j + 0.375F), (k - 0.25F + 1.0F - f1), (k - 0.25F + 1.0F), f * 0.6F, d);
        b((i + 0.625F), (i + 0.625F), (j + 0.375F), (j + 0.625F), (k - 0.25F + 1.0F - f1), (k - 0.25F + 1.0F), f * 0.6F, d);
        b((i + 0.375F), (i + 0.625F), (j + 0.375F), (j + 0.375F), (k - 0.25F + 1.0F - f1), (k - 0.25F + 1.0F), f * 0.5F, d);
        b((i + 0.625F), (i + 0.375F), (j + 0.625F), (j + 0.625F), (k - 0.25F + 1.0F - f1), (k - 0.25F + 1.0F), f, d);
        break;
      case 4:
        this.h = 1;
        this.i = 2;
        this.l = 2;
        this.m = 1;
        block.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
        o(block, i, j, k);
        c((i + 0.25F), (i + 0.25F + f1), (j + 0.375F), (j + 0.375F), (k + 0.625F), (k + 0.375F), f * 0.5F, d);
        c((i + 0.25F), (i + 0.25F + f1), (j + 0.625F), (j + 0.625F), (k + 0.375F), (k + 0.625F), f, d);
        c((i + 0.25F), (i + 0.25F + f1), (j + 0.375F), (j + 0.625F), (k + 0.375F), (k + 0.375F), f * 0.6F, d);
        c((i + 0.25F), (i + 0.25F + f1), (j + 0.625F), (j + 0.375F), (k + 0.625F), (k + 0.625F), f * 0.6F, d);
        break;
      case 5:
        this.h = 2;
        this.i = 1;
        this.l = 1;
        this.m = 2;
        block.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        o(block, i, j, k);
        c((i - 0.25F + 1.0F - f1), (i - 0.25F + 1.0F), (j + 0.375F), (j + 0.375F), (k + 0.625F), (k + 0.375F), f * 0.5F, d);
        c((i - 0.25F + 1.0F - f1), (i - 0.25F + 1.0F), (j + 0.625F), (j + 0.625F), (k + 0.375F), (k + 0.625F), f, d);
        c((i - 0.25F + 1.0F - f1), (i - 0.25F + 1.0F), (j + 0.375F), (j + 0.625F), (k + 0.375F), (k + 0.375F), f * 0.6F, d);
        c((i - 0.25F + 1.0F - f1), (i - 0.25F + 1.0F), (j + 0.625F), (j + 0.375F), (k + 0.625F), (k + 0.625F), f * 0.6F, d);
        break;
    } 
    this.h = 0;
    this.i = 0;
    this.j = 0;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    return true;
  }
  
  public boolean e(yy block, int i, int j, int k) {
    int l = this.a.d(i, j, k);
    int i1 = l & 0x7;
    boolean flag = ((l & 0x8) > 0);
    cv tessellator = cv.a;
    boolean flag1 = (this.e >= 0);
    if (!flag1)
      this.e = yy.w.bL; 
    float f = 0.25F;
    float f1 = 0.1875F;
    float f2 = 0.1875F;
    if (i1 == 5) {
      block.a(0.5F - f1, 0.0F, 0.5F - f, 0.5F + f1, f2, 0.5F + f);
    } else if (i1 == 6) {
      block.a(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, f2, 0.5F + f1);
    } else if (i1 == 4) {
      block.a(0.5F - f1, 0.5F - f, 1.0F - f2, 0.5F + f1, 0.5F + f, 1.0F);
    } else if (i1 == 3) {
      block.a(0.5F - f1, 0.5F - f, 0.0F, 0.5F + f1, 0.5F + f, f2);
    } else if (i1 == 2) {
      block.a(1.0F - f2, 0.5F - f, 0.5F - f1, 1.0F, 0.5F + f, 0.5F + f1);
    } else if (i1 == 1) {
      block.a(0.0F, 0.5F - f, 0.5F - f1, f2, 0.5F + f, 0.5F + f1);
    } 
    o(block, i, j, k);
    if (!flag1)
      this.e = -1; 
    tessellator.b(block.e(this.a, i, j, k));
    float f3 = 1.0F;
    if (yy.q[block.bM] > 0)
      f3 = 1.0F; 
    tessellator.a(f3, f3, f3);
    int j1 = block.b(0);
    if (this.e >= 0)
      j1 = this.e; 
    int k1 = (j1 & 0xF) << 4;
    int l1 = j1 & 0xF0;
    float f4 = k1 / 256.0F;
    float f5 = (k1 + 15.99F) / 256.0F;
    float f6 = l1 / 256.0F;
    float f7 = (l1 + 15.99F) / 256.0F;
    fb[] avec3d = new fb[8];
    float f8 = 0.0625F;
    float f9 = 0.0625F;
    float f10 = 0.625F;
    avec3d[0] = fb.b(-f8, 0.0D, -f9);
    avec3d[1] = fb.b(f8, 0.0D, -f9);
    avec3d[2] = fb.b(f8, 0.0D, f9);
    avec3d[3] = fb.b(-f8, 0.0D, f9);
    avec3d[4] = fb.b(-f8, f10, -f9);
    avec3d[5] = fb.b(f8, f10, -f9);
    avec3d[6] = fb.b(f8, f10, f9);
    avec3d[7] = fb.b(-f8, f10, f9);
    for (int i2 = 0; i2 < 8; i2++) {
      if (flag) {
        (avec3d[i2]).c -= 0.0625D;
        avec3d[i2].a(0.6981317F);
      } else {
        (avec3d[i2]).c += 0.0625D;
        avec3d[i2].a(-0.6981317F);
      } 
      if (i1 == 6)
        avec3d[i2].b(1.570796F); 
      if (i1 < 5) {
        (avec3d[i2]).b -= 0.375D;
        avec3d[i2].a(1.570796F);
        if (i1 == 4)
          avec3d[i2].b(0.0F); 
        if (i1 == 3)
          avec3d[i2].b(3.141593F); 
        if (i1 == 2)
          avec3d[i2].b(1.570796F); 
        if (i1 == 1)
          avec3d[i2].b(-1.570796F); 
        (avec3d[i2]).a += i + 0.5D;
        (avec3d[i2]).b += (j + 0.5F);
        (avec3d[i2]).c += k + 0.5D;
      } else {
        (avec3d[i2]).a += i + 0.5D;
        (avec3d[i2]).b += (j + 0.125F);
        (avec3d[i2]).c += k + 0.5D;
      } 
    } 
    fb vec3d = null;
    fb vec3d1 = null;
    fb vec3d2 = null;
    fb vec3d3 = null;
    for (int j2 = 0; j2 < 6; j2++) {
      if (j2 == 0) {
        f4 = (k1 + 7) / 256.0F;
        f5 = ((k1 + 9) - 0.01F) / 256.0F;
        f6 = (l1 + 6) / 256.0F;
        f7 = ((l1 + 8) - 0.01F) / 256.0F;
      } else if (j2 == 2) {
        f4 = (k1 + 7) / 256.0F;
        f5 = ((k1 + 9) - 0.01F) / 256.0F;
        f6 = (l1 + 6) / 256.0F;
        f7 = ((l1 + 16) - 0.01F) / 256.0F;
      } 
      if (j2 == 0) {
        vec3d = avec3d[0];
        vec3d1 = avec3d[1];
        vec3d2 = avec3d[2];
        vec3d3 = avec3d[3];
      } else if (j2 == 1) {
        vec3d = avec3d[7];
        vec3d1 = avec3d[6];
        vec3d2 = avec3d[5];
        vec3d3 = avec3d[4];
      } else if (j2 == 2) {
        vec3d = avec3d[1];
        vec3d1 = avec3d[0];
        vec3d2 = avec3d[4];
        vec3d3 = avec3d[5];
      } else if (j2 == 3) {
        vec3d = avec3d[2];
        vec3d1 = avec3d[1];
        vec3d2 = avec3d[5];
        vec3d3 = avec3d[6];
      } else if (j2 == 4) {
        vec3d = avec3d[3];
        vec3d1 = avec3d[2];
        vec3d2 = avec3d[6];
        vec3d3 = avec3d[7];
      } else if (j2 == 5) {
        vec3d = avec3d[0];
        vec3d1 = avec3d[3];
        vec3d2 = avec3d[7];
        vec3d3 = avec3d[4];
      } 
      tessellator.a(vec3d.a, vec3d.b, vec3d.c, f4, f7);
      tessellator.a(vec3d1.a, vec3d1.b, vec3d1.c, f5, f7);
      tessellator.a(vec3d2.a, vec3d2.b, vec3d2.c, f5, f6);
      tessellator.a(vec3d3.a, vec3d3.b, vec3d3.c, f4, f6);
    } 
    return true;
  }
  
  public boolean b(int i, int j, int k, int l) {
    cv tessellator = cv.a;
    for (int i1 = 0; i1 < 6; i1++) {
      int j1 = j;
      int k1 = k;
      int l1 = l;
      if (((i1 == 2 || i1 == 3) && (i - 1) / 3 == 1) || ((i1 == 4 || i1 == 5) && (i - 1) % 3 == 1))
        continue; 
      int i2 = 252;
      int j2 = 0;
      if (i == 2)
        j2 = 0; 
      if (i == 4)
        j2 = 1; 
      if (i == 8)
        j2 = 2; 
      if (i == 6)
        j2 = 3; 
      if (i == 1)
        j2 = 0; 
      if (i == 3)
        j2 = 3; 
      if (i == 7)
        j2 = 1; 
      if (i == 9)
        j2 = 2; 
      if (i != 2 && i != 4 && i != 6 && i != 8) {
        if (i1 >= 2)
          if (i == 1) {
            i2--;
            if (i1 == 5 || i1 == 3)
              continue; 
            if (i1 == 4)
              j2++; 
          } else if (i == 3) {
            i2--;
            if (i1 == 5 || i1 == 2)
              continue; 
            if (i1 == 3)
              j2++; 
          } else if (i == 7) {
            i2--;
            if (i1 == 4 || i1 == 3)
              continue; 
            if (i1 == 2)
              j2++; 
          } else if (i == 9) {
            i2--;
            if (i1 == 4 || i1 == 2)
              continue; 
            if (i1 == 5)
              j2++; 
          }  
      } else {
        i2--;
      } 
      if (i1 == 0)
        k1 = k + 1; 
      if (i1 == 1)
        k1--; 
      if (i1 == 2)
        j1 = j + 1; 
      if (i1 == 3)
        j1--; 
      if (i1 == 4)
        l1 = l + 1; 
      if (i1 == 5)
        l1--; 
      if (!this.d[this.a.a(j1, k1, l1)]) {
        char c = '䀀';
        tessellator.c(c);
        tessellator.b(this.a.a(j1, k1, l1, 2));
        int k2 = (i2 & 0xF) << 4;
        int l2 = i2 & 0xF0;
        double d = (k2 + 0.0D) / 256.0D;
        double d1 = (k2 + 15.99D) / 256.0D;
        double d2 = (l2 / 256.0F);
        double d3 = ((l2 + 15.99F) / 256.0F);
        double d4 = d;
        double d5 = d1;
        double d6 = d1;
        double d7 = d;
        double d8 = d3;
        double d9 = d3;
        double d10 = d2;
        double d11 = d2;
        if (j2 != 0)
          if (j2 == 1) {
            d4 = d;
            d5 = d;
            d6 = d1;
            d7 = d1;
            d8 = d2;
            d9 = d3;
            d10 = d3;
            d11 = d2;
          } else if (j2 == 2) {
            d4 = d1;
            d5 = d;
            d6 = d;
            d7 = d1;
            d8 = d2;
            d9 = d2;
            d10 = d3;
            d11 = d3;
          } else if (j2 == 3) {
            d4 = d1;
            d5 = d1;
            d6 = d;
            d7 = d;
            d8 = d3;
            d9 = d2;
            d10 = d2;
            d11 = d3;
          }  
        double d12 = 0.0031250000465661287D;
        double d13 = 0.0D - d12;
        double d14 = 1.0D + d12;
        if (i1 == 0) {
          tessellator.a(j + d13, (k + 1) + d12, l + d13, d5, d9);
          tessellator.a(j + d13, (k + 1) + d12, l + d14, d6, d10);
          tessellator.a(j + d14, (k + 1) + d12, l + d14, d7, d11);
          tessellator.a(j + d14, (k + 1) + d12, l + d13, d4, d8);
        } else if (i1 == 1) {
          tessellator.a(j + d13, (k + 0) - d12, l + d14, d6, d10);
          tessellator.a(j + d13, (k + 0) - d12, l + d13, d5, d9);
          tessellator.a(j + d14, (k + 0) - d12, l + d13, d4, d8);
          tessellator.a(j + d14, (k + 0) - d12, l + d14, d7, d11);
        } else if (i1 == 2) {
          tessellator.a((j + 1) + d12, k + d13, l + d14, d6, d10);
          tessellator.a((j + 1) + d12, k + d13, l + d13, d5, d9);
          tessellator.a((j + 1) + d12, k + d14, l + d13, d4, d8);
          tessellator.a((j + 1) + d12, k + d14, l + d14, d7, d11);
        } else if (i1 == 3) {
          tessellator.a((j + 0) - d12, k + d13, l + d13, d5, d9);
          tessellator.a((j + 0) - d12, k + d13, l + d14, d6, d10);
          tessellator.a((j + 0) - d12, k + d14, l + d14, d7, d11);
          tessellator.a((j + 0) - d12, k + d14, l + d13, d4, d8);
        } else if (i1 == 4) {
          tessellator.a(j + d13, k + d14, (l + 1) + d12, d6, d10);
          tessellator.a(j + d13, k + d13, (l + 1) + d12, d5, d9);
          tessellator.a(j + d14, k + d13, (l + 1) + d12, d4, d8);
          tessellator.a(j + d14, k + d14, (l + 1) + d12, d7, d11);
        } else if (i1 == 5) {
          tessellator.a(j + d14, k + d13, (l + 0) - d12, d4, d8);
          tessellator.a(j + d13, k + d13, (l + 0) - d12, d5, d9);
          tessellator.a(j + d13, k + d14, (l + 0) - d12, d6, d10);
          tessellator.a(j + d14, k + d14, (l + 0) - d12, d7, d11);
        } 
      } 
      continue;
    } 
    return true;
  }
  
  public boolean f(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = block.b(0);
    if (this.e >= 0)
      l = this.e; 
    tessellator.a(1.0F, 1.0F, 1.0F);
    tessellator.b(block.e(this.a, i, j, k));
    int i1 = (l & 0xF) << 4;
    int j1 = l & 0xF0;
    double d = (i1 / 256.0F);
    double d1 = ((i1 + 15.99F) / 256.0F);
    double d2 = (j1 / 256.0F);
    double d3 = ((j1 + 15.99F) / 256.0F);
    float f = 1.4F;
    if (!this.a.g(i, j - 1, k) && !yy.ar.c(this.a, i, j - 1, k)) {
      float f1 = 0.2F;
      float f2 = 0.0625F;
      if ((i + j + k & 0x1) == 1) {
        d = (i1 / 256.0F);
        d1 = ((i1 + 15.99F) / 256.0F);
        d2 = ((j1 + 16) / 256.0F);
        d3 = ((j1 + 15.99F + 16.0F) / 256.0F);
      } 
      if ((i / 2 + j / 2 + k / 2 & 0x1) == 1) {
        double d4 = d1;
        d1 = d;
        d = d4;
      } 
      if (yy.ar.c(this.a, i - 1, j, k)) {
        tessellator.a((i + f1), (j + f + f2), (k + 1), d1, d2);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 1), d1, d3);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a((i + f1), (j + f + f2), (k + 0), d, d2);
        tessellator.a((i + f1), (j + f + f2), (k + 0), d, d2);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 1), d1, d3);
        tessellator.a((i + f1), (j + f + f2), (k + 1), d1, d2);
      } 
      if (yy.ar.c(this.a, i + 1, j, k)) {
        tessellator.a(((i + 1) - f1), (j + f + f2), (k + 0), d, d2);
        tessellator.a((i + 1 - 0), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a((i + 1 - 0), ((j + 0) + f2), (k + 1), d1, d3);
        tessellator.a(((i + 1) - f1), (j + f + f2), (k + 1), d1, d2);
        tessellator.a(((i + 1) - f1), (j + f + f2), (k + 1), d1, d2);
        tessellator.a((i + 1 - 0), ((j + 0) + f2), (k + 1), d1, d3);
        tessellator.a((i + 1 - 0), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a(((i + 1) - f1), (j + f + f2), (k + 0), d, d2);
      } 
      if (yy.ar.c(this.a, i, j, k - 1)) {
        tessellator.a((i + 0), (j + f + f2), (k + f1), d1, d2);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 0), d1, d3);
        tessellator.a((i + 1), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a((i + 1), (j + f + f2), (k + f1), d, d2);
        tessellator.a((i + 1), (j + f + f2), (k + f1), d, d2);
        tessellator.a((i + 1), ((j + 0) + f2), (k + 0), d, d3);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 0), d1, d3);
        tessellator.a((i + 0), (j + f + f2), (k + f1), d1, d2);
      } 
      if (yy.ar.c(this.a, i, j, k + 1)) {
        tessellator.a((i + 1), (j + f + f2), ((k + 1) - f1), d, d2);
        tessellator.a((i + 1), ((j + 0) + f2), (k + 1 - 0), d, d3);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 1 - 0), d1, d3);
        tessellator.a((i + 0), (j + f + f2), ((k + 1) - f1), d1, d2);
        tessellator.a((i + 0), (j + f + f2), ((k + 1) - f1), d1, d2);
        tessellator.a((i + 0), ((j + 0) + f2), (k + 1 - 0), d1, d3);
        tessellator.a((i + 1), ((j + 0) + f2), (k + 1 - 0), d, d3);
        tessellator.a((i + 1), (j + f + f2), ((k + 1) - f1), d, d2);
      } 
      if (yy.ar.c(this.a, i, j + 1, k)) {
        double d5 = i + 0.5D + 0.5D;
        double d7 = i + 0.5D - 0.5D;
        double d9 = k + 0.5D + 0.5D;
        double d11 = k + 0.5D - 0.5D;
        double d13 = i + 0.5D - 0.5D;
        double d15 = i + 0.5D + 0.5D;
        double d17 = k + 0.5D - 0.5D;
        double d20 = k + 0.5D + 0.5D;
        d = (i1 / 256.0F);
        d1 = ((i1 + 15.99F) / 256.0F);
        d2 = (j1 / 256.0F);
        d3 = ((j1 + 15.99F) / 256.0F);
        j++;
        f = -0.2F;
        if ((i + j + k & 0x1) == 0) {
          tessellator.a(d13, (j + f), (k + 0), d1, d2);
          tessellator.a(d5, (j + 0), (k + 0), d1, d3);
          tessellator.a(d5, (j + 0), (k + 1), d, d3);
          tessellator.a(d13, (j + f), (k + 1), d, d2);
          d = (i1 / 256.0F);
          d1 = ((i1 + 15.99F) / 256.0F);
          d2 = ((j1 + 16) / 256.0F);
          d3 = ((j1 + 15.99F + 16.0F) / 256.0F);
          tessellator.a(d15, (j + f), (k + 1), d1, d2);
          tessellator.a(d7, (j + 0), (k + 1), d1, d3);
          tessellator.a(d7, (j + 0), (k + 0), d, d3);
          tessellator.a(d15, (j + f), (k + 0), d, d2);
        } else {
          tessellator.a((i + 0), (j + f), d20, d1, d2);
          tessellator.a((i + 0), (j + 0), d11, d1, d3);
          tessellator.a((i + 1), (j + 0), d11, d, d3);
          tessellator.a((i + 1), (j + f), d20, d, d2);
          d = (i1 / 256.0F);
          d1 = ((i1 + 15.99F) / 256.0F);
          d2 = ((j1 + 16) / 256.0F);
          d3 = ((j1 + 15.99F + 16.0F) / 256.0F);
          tessellator.a((i + 1), (j + f), d17, d1, d2);
          tessellator.a((i + 1), (j + 0), d9, d1, d3);
          tessellator.a((i + 0), (j + 0), d9, d, d3);
          tessellator.a((i + 0), (j + f), d17, d, d2);
        } 
      } 
    } else {
      double d19 = i + 0.5D + 0.2D;
      double d6 = i + 0.5D - 0.2D;
      double d8 = k + 0.5D + 0.2D;
      double d10 = k + 0.5D - 0.2D;
      double d12 = i + 0.5D - 0.3D;
      double d14 = i + 0.5D + 0.3D;
      double d16 = k + 0.5D - 0.3D;
      double d18 = k + 0.5D + 0.3D;
      tessellator.a(d12, (j + f), (k + 1), d1, d2);
      tessellator.a(d19, (j + 0), (k + 1), d1, d3);
      tessellator.a(d19, (j + 0), (k + 0), d, d3);
      tessellator.a(d12, (j + f), (k + 0), d, d2);
      tessellator.a(d14, (j + f), (k + 0), d1, d2);
      tessellator.a(d6, (j + 0), (k + 0), d1, d3);
      tessellator.a(d6, (j + 0), (k + 1), d, d3);
      tessellator.a(d14, (j + f), (k + 1), d, d2);
      d = (i1 / 256.0F);
      d1 = ((i1 + 15.99F) / 256.0F);
      d2 = ((j1 + 16) / 256.0F);
      d3 = ((j1 + 15.99F + 16.0F) / 256.0F);
      tessellator.a((i + 1), (j + f), d18, d1, d2);
      tessellator.a((i + 1), (j + 0), d10, d1, d3);
      tessellator.a((i + 0), (j + 0), d10, d, d3);
      tessellator.a((i + 0), (j + f), d18, d, d2);
      tessellator.a((i + 0), (j + f), d16, d1, d2);
      tessellator.a((i + 0), (j + 0), d8, d1, d3);
      tessellator.a((i + 1), (j + 0), d8, d, d3);
      tessellator.a((i + 1), (j + f), d16, d, d2);
      d19 = i + 0.5D - 0.5D;
      d6 = i + 0.5D + 0.5D;
      d8 = k + 0.5D - 0.5D;
      d10 = k + 0.5D + 0.5D;
      d12 = i + 0.5D - 0.4D;
      d14 = i + 0.5D + 0.4D;
      d16 = k + 0.5D - 0.4D;
      d18 = k + 0.5D + 0.4D;
      tessellator.a(d12, (j + f), (k + 0), d, d2);
      tessellator.a(d19, (j + 0), (k + 0), d, d3);
      tessellator.a(d19, (j + 0), (k + 1), d1, d3);
      tessellator.a(d12, (j + f), (k + 1), d1, d2);
      tessellator.a(d14, (j + f), (k + 1), d, d2);
      tessellator.a(d6, (j + 0), (k + 1), d, d3);
      tessellator.a(d6, (j + 0), (k + 0), d1, d3);
      tessellator.a(d14, (j + f), (k + 0), d1, d2);
      d = (i1 / 256.0F);
      d1 = ((i1 + 15.99F) / 256.0F);
      d2 = (j1 / 256.0F);
      d3 = ((j1 + 15.99F) / 256.0F);
      tessellator.a((i + 0), (j + f), d18, d, d2);
      tessellator.a((i + 0), (j + 0), d10, d, d3);
      tessellator.a((i + 1), (j + 0), d10, d1, d3);
      tessellator.a((i + 1), (j + f), d18, d1, d2);
      tessellator.a((i + 1), (j + f), d16, d, d2);
      tessellator.a((i + 1), (j + 0), d8, d, d3);
      tessellator.a((i + 0), (j + 0), d8, d1, d3);
      tessellator.a((i + 0), (j + f), d16, d1, d2);
    } 
    return true;
  }
  
  public boolean g(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = this.a.d(i, j, k);
    int i1 = block.a(1, l);
    if (this.e >= 0)
      i1 = this.e; 
    tessellator.b(block.e(this.a, i, j, k));
    float f = 1.0F;
    float f1 = l / 15.0F;
    float f2 = f1 * 0.6F + 0.4F;
    if (l == 0)
      f2 = 0.3F; 
    float f3 = f1 * f1 * 0.7F - 0.5F;
    float f4 = f1 * f1 * 0.6F - 0.7F;
    if (f3 < 0.0F)
      f3 = 0.0F; 
    if (f4 < 0.0F)
      f4 = 0.0F; 
    tessellator.a(f2, f3, f4);
    int j1 = (i1 & 0xF) << 4;
    int k1 = i1 & 0xF0;
    double d = (j1 / 256.0F);
    double d2 = ((j1 + 15.99F) / 256.0F);
    double d4 = (k1 / 256.0F);
    double d6 = ((k1 + 15.99F) / 256.0F);
    boolean flag = (kw.c(this.a, i - 1, j, k, 1) || (!this.a.g(i - 1, j, k) && kw.c(this.a, i - 1, j - 1, k, -1)));
    boolean flag1 = (kw.c(this.a, i + 1, j, k, 3) || (!this.a.g(i + 1, j, k) && kw.c(this.a, i + 1, j - 1, k, -1)));
    boolean flag2 = (kw.c(this.a, i, j, k - 1, 2) || (!this.a.g(i, j, k - 1) && kw.c(this.a, i, j - 1, k - 1, -1)));
    boolean flag3 = (kw.c(this.a, i, j, k + 1, 0) || (!this.a.g(i, j, k + 1) && kw.c(this.a, i, j - 1, k + 1, -1)));
    if (!this.a.g(i, j + 1, k)) {
      if (this.a.g(i - 1, j, k) && kw.c(this.a, i - 1, j + 1, k, -1))
        flag = true; 
      if (this.a.g(i + 1, j, k) && kw.c(this.a, i + 1, j + 1, k, -1))
        flag1 = true; 
      if (this.a.g(i, j, k - 1) && kw.c(this.a, i, j + 1, k - 1, -1))
        flag2 = true; 
      if (this.a.g(i, j, k + 1) && kw.c(this.a, i, j + 1, k + 1, -1))
        flag3 = true; 
    } 
    float f5 = (i + 0);
    float f6 = (i + 1);
    float f7 = (k + 0);
    float f8 = (k + 1);
    byte byte0 = 0;
    if ((flag || flag1) && !flag2 && !flag3)
      byte0 = 1; 
    if ((flag2 || flag3) && !flag1 && !flag)
      byte0 = 2; 
    if (byte0 != 0) {
      d = ((j1 + 16) / 256.0F);
      d2 = (((j1 + 16) + 15.99F) / 256.0F);
      d4 = (k1 / 256.0F);
      d6 = ((k1 + 15.99F) / 256.0F);
    } 
    if (byte0 == 0) {
      if (flag1 || flag2 || flag3 || flag) {
        if (!flag)
          f5 += 0.3125F; 
        if (!flag)
          d += 0.01953125D; 
        if (!flag1)
          f6 -= 0.3125F; 
        if (!flag1)
          d2 -= 0.01953125D; 
        if (!flag2)
          f7 += 0.3125F; 
        if (!flag2)
          d4 += 0.01953125D; 
        if (!flag3)
          f8 -= 0.3125F; 
        if (!flag3)
          d6 -= 0.01953125D; 
      } 
      tessellator.a(f6, j + 0.015625D, f8, d2, d6);
      tessellator.a(f6, j + 0.015625D, f7, d2, d4);
      tessellator.a(f5, j + 0.015625D, f7, d, d4);
      tessellator.a(f5, j + 0.015625D, f8, d, d6);
      tessellator.a(f, f, f);
      tessellator.a(f6, j + 0.015625D, f8, d2, d6 + 0.0625D);
      tessellator.a(f6, j + 0.015625D, f7, d2, d4 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f7, d, d4 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f8, d, d6 + 0.0625D);
    } else if (byte0 == 1) {
      tessellator.a(f6, j + 0.015625D, f8, d2, d6);
      tessellator.a(f6, j + 0.015625D, f7, d2, d4);
      tessellator.a(f5, j + 0.015625D, f7, d, d4);
      tessellator.a(f5, j + 0.015625D, f8, d, d6);
      tessellator.a(f, f, f);
      tessellator.a(f6, j + 0.015625D, f8, d2, d6 + 0.0625D);
      tessellator.a(f6, j + 0.015625D, f7, d2, d4 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f7, d, d4 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f8, d, d6 + 0.0625D);
    } else if (byte0 == 2) {
      tessellator.a(f6, j + 0.015625D, f8, d2, d6);
      tessellator.a(f6, j + 0.015625D, f7, d, d6);
      tessellator.a(f5, j + 0.015625D, f7, d, d4);
      tessellator.a(f5, j + 0.015625D, f8, d2, d4);
      tessellator.a(f, f, f);
      tessellator.a(f6, j + 0.015625D, f8, d2, d6 + 0.0625D);
      tessellator.a(f6, j + 0.015625D, f7, d, d6 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f7, d, d4 + 0.0625D);
      tessellator.a(f5, j + 0.015625D, f8, d2, d4 + 0.0625D);
    } 
    if (!this.a.g(i, j + 1, k)) {
      double d1 = ((j1 + 16) / 256.0F);
      double d3 = (((j1 + 16) + 15.99F) / 256.0F);
      double d5 = (k1 / 256.0F);
      double d7 = ((k1 + 15.99F) / 256.0F);
      if (this.a.g(i - 1, j, k) && this.a.a(i - 1, j + 1, k) == yy.av.bM) {
        tessellator.a(f * f2, f * f3, f * f4);
        tessellator.a(i + 0.015625D, ((j + 1) + 0.021875F), (k + 1), d3, d5);
        tessellator.a(i + 0.015625D, (j + 0), (k + 1), d1, d5);
        tessellator.a(i + 0.015625D, (j + 0), (k + 0), d1, d7);
        tessellator.a(i + 0.015625D, ((j + 1) + 0.021875F), (k + 0), d3, d7);
        tessellator.a(f, f, f);
        tessellator.a(i + 0.015625D, ((j + 1) + 0.021875F), (k + 1), d3, d5 + 0.0625D);
        tessellator.a(i + 0.015625D, (j + 0), (k + 1), d1, d5 + 0.0625D);
        tessellator.a(i + 0.015625D, (j + 0), (k + 0), d1, d7 + 0.0625D);
        tessellator.a(i + 0.015625D, ((j + 1) + 0.021875F), (k + 0), d3, d7 + 0.0625D);
      } 
      if (this.a.g(i + 1, j, k) && this.a.a(i + 1, j + 1, k) == yy.av.bM) {
        tessellator.a(f * f2, f * f3, f * f4);
        tessellator.a((i + 1) - 0.015625D, (j + 0), (k + 1), d1, d7);
        tessellator.a((i + 1) - 0.015625D, ((j + 1) + 0.021875F), (k + 1), d3, d7);
        tessellator.a((i + 1) - 0.015625D, ((j + 1) + 0.021875F), (k + 0), d3, d5);
        tessellator.a((i + 1) - 0.015625D, (j + 0), (k + 0), d1, d5);
        tessellator.a(f, f, f);
        tessellator.a((i + 1) - 0.015625D, (j + 0), (k + 1), d1, d7 + 0.0625D);
        tessellator.a((i + 1) - 0.015625D, ((j + 1) + 0.021875F), (k + 1), d3, d7 + 0.0625D);
        tessellator.a((i + 1) - 0.015625D, ((j + 1) + 0.021875F), (k + 0), d3, d5 + 0.0625D);
        tessellator.a((i + 1) - 0.015625D, (j + 0), (k + 0), d1, d5 + 0.0625D);
      } 
      if (this.a.g(i, j, k - 1) && this.a.a(i, j + 1, k - 1) == yy.av.bM) {
        tessellator.a(f * f2, f * f3, f * f4);
        tessellator.a((i + 1), (j + 0), k + 0.015625D, d1, d7);
        tessellator.a((i + 1), ((j + 1) + 0.021875F), k + 0.015625D, d3, d7);
        tessellator.a((i + 0), ((j + 1) + 0.021875F), k + 0.015625D, d3, d5);
        tessellator.a((i + 0), (j + 0), k + 0.015625D, d1, d5);
        tessellator.a(f, f, f);
        tessellator.a((i + 1), (j + 0), k + 0.015625D, d1, d7 + 0.0625D);
        tessellator.a((i + 1), ((j + 1) + 0.021875F), k + 0.015625D, d3, d7 + 0.0625D);
        tessellator.a((i + 0), ((j + 1) + 0.021875F), k + 0.015625D, d3, d5 + 0.0625D);
        tessellator.a((i + 0), (j + 0), k + 0.015625D, d1, d5 + 0.0625D);
      } 
      if (this.a.g(i, j, k + 1) && this.a.a(i, j + 1, k + 1) == yy.av.bM) {
        tessellator.a(f * f2, f * f3, f * f4);
        tessellator.a((i + 1), ((j + 1) + 0.021875F), (k + 1) - 0.015625D, d3, d5);
        tessellator.a((i + 1), (j + 0), (k + 1) - 0.015625D, d1, d5);
        tessellator.a((i + 0), (j + 0), (k + 1) - 0.015625D, d1, d7);
        tessellator.a((i + 0), ((j + 1) + 0.021875F), (k + 1) - 0.015625D, d3, d7);
        tessellator.a(f, f, f);
        tessellator.a((i + 1), ((j + 1) + 0.021875F), (k + 1) - 0.015625D, d3, d5 + 0.0625D);
        tessellator.a((i + 1), (j + 0), (k + 1) - 0.015625D, d1, d5 + 0.0625D);
        tessellator.a((i + 0), (j + 0), (k + 1) - 0.015625D, d1, d7 + 0.0625D);
        tessellator.a((i + 0), ((j + 1) + 0.021875F), (k + 1) - 0.015625D, d3, d7 + 0.0625D);
      } 
    } 
    return true;
  }
  
  public boolean a(afr blockrail, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = this.a.d(i, j, k);
    int i1 = blockrail.a(0, l);
    if (this.e >= 0)
      i1 = this.e; 
    if (blockrail.s())
      l &= 0x7; 
    tessellator.b(blockrail.e(this.a, i, j, k));
    tessellator.a(1.0F, 1.0F, 1.0F);
    int j1 = (i1 & 0xF) << 4;
    int k1 = i1 & 0xF0;
    double d = (j1 / 256.0F);
    double d1 = ((j1 + 15.99F) / 256.0F);
    double d2 = (k1 / 256.0F);
    double d3 = ((k1 + 15.99F) / 256.0F);
    double d4 = 0.0625D;
    double d5 = (i + 1);
    double d6 = (i + 1);
    double d7 = (i + 0);
    double d8 = (i + 0);
    double d9 = (k + 0);
    double d10 = (k + 1);
    double d11 = (k + 1);
    double d12 = (k + 0);
    double d13 = j + d4;
    double d14 = j + d4;
    double d15 = j + d4;
    double d16 = j + d4;
    d5 = d6 = (i + 0);
    d7 = d8 = (i + 1);
    d9 = d12 = (k + 1);
    d10 = d11 = (k + 0);
    if (l == 9) {
      d5 = d8 = (i + 0);
      d6 = d7 = (i + 1);
      d9 = d10 = (k + 0);
      d11 = d12 = (k + 1);
    } 
    d5 = d8 = (i + 1);
    d6 = d7 = (i + 0);
    d9 = d10 = (k + 1);
    d11 = d12 = (k + 0);
    if (l != 2 && l != 4) {
      if (l == 3 || l == 5) {
        d14++;
        d15++;
      } 
    } else {
      d13++;
      d16++;
    } 
    tessellator.a(d5, d13, d9, d1, d2);
    tessellator.a(d6, d14, d10, d1, d3);
    tessellator.a(d7, d15, d11, d, d3);
    tessellator.a(d8, d16, d12, d, d2);
    tessellator.a(d8, d16, d12, d, d2);
    tessellator.a(d7, d15, d11, d, d3);
    tessellator.a(d6, d14, d10, d1, d3);
    tessellator.a(d5, d13, d9, d1, d2);
    return true;
  }
  
  public boolean h(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = block.b(0);
    if (this.e >= 0)
      l = this.e; 
    tessellator.b(block.e(this.a, i, j, k));
    float f = 1.0F;
    tessellator.a(f, f, f);
    int i1 = (l & 0xF) << 4;
    int j1 = l & 0xF0;
    double d = (i1 / 256.0F);
    double d1 = ((i1 + 15.99F) / 256.0F);
    double d2 = (j1 / 256.0F);
    double d3 = ((j1 + 15.99F) / 256.0F);
    int k1 = this.a.d(i, j, k);
    double d4 = 0.0D;
    double d5 = 0.05000000074505806D;
    if (k1 == 5) {
      tessellator.a(i + d5, (j + 1) + d4, (k + 1) + d4, d, d2);
      tessellator.a(i + d5, (j + 0) - d4, (k + 1) + d4, d, d3);
      tessellator.a(i + d5, (j + 0) - d4, (k + 0) - d4, d1, d3);
      tessellator.a(i + d5, (j + 1) + d4, (k + 0) - d4, d1, d2);
    } 
    if (k1 == 4) {
      tessellator.a((i + 1) - d5, (j + 0) - d4, (k + 1) + d4, d1, d3);
      tessellator.a((i + 1) - d5, (j + 1) + d4, (k + 1) + d4, d1, d2);
      tessellator.a((i + 1) - d5, (j + 1) + d4, (k + 0) - d4, d, d2);
      tessellator.a((i + 1) - d5, (j + 0) - d4, (k + 0) - d4, d, d3);
    } 
    if (k1 == 3) {
      tessellator.a((i + 1) + d4, (j + 0) - d4, k + d5, d1, d3);
      tessellator.a((i + 1) + d4, (j + 1) + d4, k + d5, d1, d2);
      tessellator.a((i + 0) - d4, (j + 1) + d4, k + d5, d, d2);
      tessellator.a((i + 0) - d4, (j + 0) - d4, k + d5, d, d3);
    } 
    if (k1 == 2) {
      tessellator.a((i + 1) + d4, (j + 1) + d4, (k + 1) - d5, d, d2);
      tessellator.a((i + 1) + d4, (j + 0) - d4, (k + 1) - d5, d, d3);
      tessellator.a((i + 0) - d4, (j + 0) - d4, (k + 1) - d5, d1, d3);
      tessellator.a((i + 0) - d4, (j + 1) + d4, (k + 1) - d5, d1, d2);
    } 
    return true;
  }
  
  public boolean i(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = block.b(0);
    if (this.e >= 0)
      l = this.e; 
    float f = 1.0F;
    tessellator.b(block.e(this.a, i, j, k));
    int i1 = block.a(this.a, i, j, k);
    float f1 = (i1 >> 16 & 0xFF) / 255.0F;
    float f2 = (i1 >> 8 & 0xFF) / 255.0F;
    float f3 = (i1 & 0xFF) / 255.0F;
    tessellator.a(f * f1, f * f2, f * f3);
    i1 = (l & 0xF) << 4;
    int j1 = l & 0xF0;
    double d = (i1 / 256.0F);
    double d1 = ((i1 + 15.99F) / 256.0F);
    double d2 = (j1 / 256.0F);
    double d3 = ((j1 + 15.99F) / 256.0F);
    double d4 = 0.05000000074505806D;
    int k1 = this.a.d(i, j, k);
    if ((k1 & 0x2) != 0) {
      tessellator.a(i + d4, (j + 1), (k + 1), d, d2);
      tessellator.a(i + d4, (j + 0), (k + 1), d, d3);
      tessellator.a(i + d4, (j + 0), (k + 0), d1, d3);
      tessellator.a(i + d4, (j + 1), (k + 0), d1, d2);
      tessellator.a(i + d4, (j + 1), (k + 0), d1, d2);
      tessellator.a(i + d4, (j + 0), (k + 0), d1, d3);
      tessellator.a(i + d4, (j + 0), (k + 1), d, d3);
      tessellator.a(i + d4, (j + 1), (k + 1), d, d2);
    } 
    if ((k1 & 0x8) != 0) {
      tessellator.a((i + 1) - d4, (j + 0), (k + 1), d1, d3);
      tessellator.a((i + 1) - d4, (j + 1), (k + 1), d1, d2);
      tessellator.a((i + 1) - d4, (j + 1), (k + 0), d, d2);
      tessellator.a((i + 1) - d4, (j + 0), (k + 0), d, d3);
      tessellator.a((i + 1) - d4, (j + 0), (k + 0), d, d3);
      tessellator.a((i + 1) - d4, (j + 1), (k + 0), d, d2);
      tessellator.a((i + 1) - d4, (j + 1), (k + 1), d1, d2);
      tessellator.a((i + 1) - d4, (j + 0), (k + 1), d1, d3);
    } 
    if ((k1 & 0x4) != 0) {
      tessellator.a((i + 1), (j + 0), k + d4, d1, d3);
      tessellator.a((i + 1), (j + 1), k + d4, d1, d2);
      tessellator.a((i + 0), (j + 1), k + d4, d, d2);
      tessellator.a((i + 0), (j + 0), k + d4, d, d3);
      tessellator.a((i + 0), (j + 0), k + d4, d, d3);
      tessellator.a((i + 0), (j + 1), k + d4, d, d2);
      tessellator.a((i + 1), (j + 1), k + d4, d1, d2);
      tessellator.a((i + 1), (j + 0), k + d4, d1, d3);
    } 
    if ((k1 & 0x1) != 0) {
      tessellator.a((i + 1), (j + 1), (k + 1) - d4, d, d2);
      tessellator.a((i + 1), (j + 0), (k + 1) - d4, d, d3);
      tessellator.a((i + 0), (j + 0), (k + 1) - d4, d1, d3);
      tessellator.a((i + 0), (j + 1), (k + 1) - d4, d1, d2);
      tessellator.a((i + 0), (j + 1), (k + 1) - d4, d1, d2);
      tessellator.a((i + 0), (j + 0), (k + 1) - d4, d1, d3);
      tessellator.a((i + 1), (j + 0), (k + 1) - d4, d, d3);
      tessellator.a((i + 1), (j + 1), (k + 1) - d4, d, d2);
    } 
    if (this.a.g(i, j + 1, k)) {
      tessellator.a((i + 1), (j + 1) - d4, (k + 0), d, d2);
      tessellator.a((i + 1), (j + 1) - d4, (k + 1), d, d3);
      tessellator.a((i + 0), (j + 1) - d4, (k + 1), d1, d3);
      tessellator.a((i + 0), (j + 1) - d4, (k + 0), d1, d2);
    } 
    return true;
  }
  
  public boolean a(uh blockpane, int i, int j, int k) {
    int l1, i2, l = this.a.b();
    cv tessellator = cv.a;
    tessellator.b(blockpane.e(this.a, i, j, k));
    float f = 1.0F;
    int i1 = blockpane.a(this.a, i, j, k);
    float f1 = (i1 >> 16 & 0xFF) / 255.0F;
    float f2 = (i1 >> 8 & 0xFF) / 255.0F;
    float f3 = (i1 & 0xFF) / 255.0F;
    if (adt.a) {
      float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    } 
    tessellator.a(f * f1, f * f2, f * f3);
    boolean flag = false;
    boolean flag1 = false;
    if (this.e >= 0) {
      l1 = this.e;
      i2 = this.e;
    } else {
      int j1 = this.a.d(i, j, k);
      l1 = blockpane.a(0, j1);
      i2 = blockpane.j();
    } 
    int k1 = (l1 & 0xF) << 4;
    int j2 = l1 & 0xF0;
    double d = (k1 / 256.0F);
    double d1 = ((k1 + 7.99F) / 256.0F);
    double d2 = ((k1 + 15.99F) / 256.0F);
    double d3 = (j2 / 256.0F);
    double d4 = ((j2 + 15.99F) / 256.0F);
    int k2 = (i2 & 0xF) << 4;
    int l2 = i2 & 0xF0;
    double d5 = ((k2 + 7) / 256.0F);
    double d6 = ((k2 + 8.99F) / 256.0F);
    double d7 = (l2 / 256.0F);
    double d8 = ((l2 + 8) / 256.0F);
    double d9 = ((l2 + 15.99F) / 256.0F);
    double d10 = i;
    double d11 = i + 0.5D;
    double d12 = (i + 1);
    double d13 = k;
    double d14 = k + 0.5D;
    double d15 = (k + 1);
    double d16 = i + 0.5D - 0.0625D;
    double d17 = i + 0.5D + 0.0625D;
    double d18 = k + 0.5D - 0.0625D;
    double d19 = k + 0.5D + 0.0625D;
    boolean flag2 = blockpane.e(this.a.a(i, j, k - 1));
    boolean flag3 = blockpane.e(this.a.a(i, j, k + 1));
    boolean flag4 = blockpane.e(this.a.a(i - 1, j, k));
    boolean flag5 = blockpane.e(this.a.a(i + 1, j, k));
    boolean flag6 = blockpane.a_(this.a, i, j + 1, k, 1);
    boolean flag7 = blockpane.a_(this.a, i, j - 1, k, 0);
    if ((!flag4 || !flag5) && (flag4 || flag5 || flag2 || flag3)) {
      if (flag4 && !flag5) {
        tessellator.a(d10, (j + 1), d14, d, d3);
        tessellator.a(d10, (j + 0), d14, d, d4);
        tessellator.a(d11, (j + 0), d14, d1, d4);
        tessellator.a(d11, (j + 1), d14, d1, d3);
        tessellator.a(d11, (j + 1), d14, d, d3);
        tessellator.a(d11, (j + 0), d14, d, d4);
        tessellator.a(d10, (j + 0), d14, d1, d4);
        tessellator.a(d10, (j + 1), d14, d1, d3);
        if (!flag3 && !flag2) {
          tessellator.a(d11, (j + 1), d19, d5, d7);
          tessellator.a(d11, (j + 0), d19, d5, d9);
          tessellator.a(d11, (j + 0), d18, d6, d9);
          tessellator.a(d11, (j + 1), d18, d6, d7);
          tessellator.a(d11, (j + 1), d18, d5, d7);
          tessellator.a(d11, (j + 0), d18, d5, d9);
          tessellator.a(d11, (j + 0), d19, d6, d9);
          tessellator.a(d11, (j + 1), d19, d6, d7);
        } 
        if (flag6 || (j < l - 1 && this.a.h(i - 1, j + 1, k))) {
          tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d9);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d9);
          tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d9);
          tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d9);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d8);
        } 
        if (flag7 || (j > 1 && this.a.h(i - 1, j - 1, k))) {
          tessellator.a(d10, j - 0.01D, d19, d6, d8);
          tessellator.a(d11, j - 0.01D, d19, d6, d9);
          tessellator.a(d11, j - 0.01D, d18, d5, d9);
          tessellator.a(d10, j - 0.01D, d18, d5, d8);
          tessellator.a(d11, j - 0.01D, d19, d6, d8);
          tessellator.a(d10, j - 0.01D, d19, d6, d9);
          tessellator.a(d10, j - 0.01D, d18, d5, d9);
          tessellator.a(d11, j - 0.01D, d18, d5, d8);
        } 
      } else if (!flag4 && flag5) {
        tessellator.a(d11, (j + 1), d14, d1, d3);
        tessellator.a(d11, (j + 0), d14, d1, d4);
        tessellator.a(d12, (j + 0), d14, d2, d4);
        tessellator.a(d12, (j + 1), d14, d2, d3);
        tessellator.a(d12, (j + 1), d14, d1, d3);
        tessellator.a(d12, (j + 0), d14, d1, d4);
        tessellator.a(d11, (j + 0), d14, d2, d4);
        tessellator.a(d11, (j + 1), d14, d2, d3);
        if (!flag3 && !flag2) {
          tessellator.a(d11, (j + 1), d18, d5, d7);
          tessellator.a(d11, (j + 0), d18, d5, d9);
          tessellator.a(d11, (j + 0), d19, d6, d9);
          tessellator.a(d11, (j + 1), d19, d6, d7);
          tessellator.a(d11, (j + 1), d19, d5, d7);
          tessellator.a(d11, (j + 0), d19, d5, d9);
          tessellator.a(d11, (j + 0), d18, d6, d9);
          tessellator.a(d11, (j + 1), d18, d6, d7);
        } 
        if (flag6 || (j < l - 1 && this.a.h(i + 1, j + 1, k))) {
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d7);
          tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d7);
          tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d7);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d7);
        } 
        if (flag7 || (j > 1 && this.a.h(i + 1, j - 1, k))) {
          tessellator.a(d11, j - 0.01D, d19, d6, d7);
          tessellator.a(d12, j - 0.01D, d19, d6, d8);
          tessellator.a(d12, j - 0.01D, d18, d5, d8);
          tessellator.a(d11, j - 0.01D, d18, d5, d7);
          tessellator.a(d12, j - 0.01D, d19, d6, d7);
          tessellator.a(d11, j - 0.01D, d19, d6, d8);
          tessellator.a(d11, j - 0.01D, d18, d5, d8);
          tessellator.a(d12, j - 0.01D, d18, d5, d7);
        } 
      } 
    } else {
      tessellator.a(d10, (j + 1), d14, d, d3);
      tessellator.a(d10, (j + 0), d14, d, d4);
      tessellator.a(d12, (j + 0), d14, d2, d4);
      tessellator.a(d12, (j + 1), d14, d2, d3);
      tessellator.a(d12, (j + 1), d14, d, d3);
      tessellator.a(d12, (j + 0), d14, d, d4);
      tessellator.a(d10, (j + 0), d14, d2, d4);
      tessellator.a(d10, (j + 1), d14, d2, d3);
      if (flag6) {
        tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d9);
        tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d7);
        tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d7);
        tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d9);
        tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d9);
        tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d7);
        tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d7);
        tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d9);
      } else {
        if (j < l - 1 && this.a.h(i - 1, j + 1, k)) {
          tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d9);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d9);
          tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d10, (j + 1) + 0.01D, d19, d6, d9);
          tessellator.a(d10, (j + 1) + 0.01D, d18, d5, d9);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d8);
        } 
        if (j < l - 1 && this.a.h(i + 1, j + 1, k)) {
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d7);
          tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d7);
          tessellator.a(d12, (j + 1) + 0.01D, d19, d6, d7);
          tessellator.a(d11, (j + 1) + 0.01D, d19, d6, d8);
          tessellator.a(d11, (j + 1) + 0.01D, d18, d5, d8);
          tessellator.a(d12, (j + 1) + 0.01D, d18, d5, d7);
        } 
      } 
      if (flag7) {
        tessellator.a(d10, j - 0.01D, d19, d6, d9);
        tessellator.a(d12, j - 0.01D, d19, d6, d7);
        tessellator.a(d12, j - 0.01D, d18, d5, d7);
        tessellator.a(d10, j - 0.01D, d18, d5, d9);
        tessellator.a(d12, j - 0.01D, d19, d6, d9);
        tessellator.a(d10, j - 0.01D, d19, d6, d7);
        tessellator.a(d10, j - 0.01D, d18, d5, d7);
        tessellator.a(d12, j - 0.01D, d18, d5, d9);
      } else {
        if (j > 1 && this.a.h(i - 1, j - 1, k)) {
          tessellator.a(d10, j - 0.01D, d19, d6, d8);
          tessellator.a(d11, j - 0.01D, d19, d6, d9);
          tessellator.a(d11, j - 0.01D, d18, d5, d9);
          tessellator.a(d10, j - 0.01D, d18, d5, d8);
          tessellator.a(d11, j - 0.01D, d19, d6, d8);
          tessellator.a(d10, j - 0.01D, d19, d6, d9);
          tessellator.a(d10, j - 0.01D, d18, d5, d9);
          tessellator.a(d11, j - 0.01D, d18, d5, d8);
        } 
        if (j > 1 && this.a.h(i + 1, j - 1, k)) {
          tessellator.a(d11, j - 0.01D, d19, d6, d7);
          tessellator.a(d12, j - 0.01D, d19, d6, d8);
          tessellator.a(d12, j - 0.01D, d18, d5, d8);
          tessellator.a(d11, j - 0.01D, d18, d5, d7);
          tessellator.a(d12, j - 0.01D, d19, d6, d7);
          tessellator.a(d11, j - 0.01D, d19, d6, d8);
          tessellator.a(d11, j - 0.01D, d18, d5, d8);
          tessellator.a(d12, j - 0.01D, d18, d5, d7);
        } 
      } 
    } 
    if ((!flag2 || !flag3) && (flag4 || flag5 || flag2 || flag3)) {
      if (flag2 && !flag3) {
        tessellator.a(d11, (j + 1), d13, d, d3);
        tessellator.a(d11, (j + 0), d13, d, d4);
        tessellator.a(d11, (j + 0), d14, d1, d4);
        tessellator.a(d11, (j + 1), d14, d1, d3);
        tessellator.a(d11, (j + 1), d14, d, d3);
        tessellator.a(d11, (j + 0), d14, d, d4);
        tessellator.a(d11, (j + 0), d13, d1, d4);
        tessellator.a(d11, (j + 1), d13, d1, d3);
        if (!flag5 && !flag4) {
          tessellator.a(d16, (j + 1), d14, d5, d7);
          tessellator.a(d16, (j + 0), d14, d5, d9);
          tessellator.a(d17, (j + 0), d14, d6, d9);
          tessellator.a(d17, (j + 1), d14, d6, d7);
          tessellator.a(d17, (j + 1), d14, d5, d7);
          tessellator.a(d17, (j + 0), d14, d5, d9);
          tessellator.a(d16, (j + 0), d14, d6, d9);
          tessellator.a(d16, (j + 1), d14, d6, d7);
        } 
        if (flag6 || (j < l - 1 && this.a.h(i, j + 1, k - 1))) {
          tessellator.a(d16, (j + 1), d13, d6, d7);
          tessellator.a(d16, (j + 1), d14, d6, d8);
          tessellator.a(d17, (j + 1), d14, d5, d8);
          tessellator.a(d17, (j + 1), d13, d5, d7);
          tessellator.a(d16, (j + 1), d14, d6, d7);
          tessellator.a(d16, (j + 1), d13, d6, d8);
          tessellator.a(d17, (j + 1), d13, d5, d8);
          tessellator.a(d17, (j + 1), d14, d5, d7);
        } 
        if (flag7 || (j > 1 && this.a.h(i, j - 1, k - 1))) {
          tessellator.a(d16, j, d13, d6, d7);
          tessellator.a(d16, j, d14, d6, d8);
          tessellator.a(d17, j, d14, d5, d8);
          tessellator.a(d17, j, d13, d5, d7);
          tessellator.a(d16, j, d14, d6, d7);
          tessellator.a(d16, j, d13, d6, d8);
          tessellator.a(d17, j, d13, d5, d8);
          tessellator.a(d17, j, d14, d5, d7);
        } 
      } else if (!flag2 && flag3) {
        tessellator.a(d11, (j + 1), d14, d1, d3);
        tessellator.a(d11, (j + 0), d14, d1, d4);
        tessellator.a(d11, (j + 0), d15, d2, d4);
        tessellator.a(d11, (j + 1), d15, d2, d3);
        tessellator.a(d11, (j + 1), d15, d1, d3);
        tessellator.a(d11, (j + 0), d15, d1, d4);
        tessellator.a(d11, (j + 0), d14, d2, d4);
        tessellator.a(d11, (j + 1), d14, d2, d3);
        if (!flag5 && !flag4) {
          tessellator.a(d17, (j + 1), d14, d5, d7);
          tessellator.a(d17, (j + 0), d14, d5, d9);
          tessellator.a(d16, (j + 0), d14, d6, d9);
          tessellator.a(d16, (j + 1), d14, d6, d7);
          tessellator.a(d16, (j + 1), d14, d5, d7);
          tessellator.a(d16, (j + 0), d14, d5, d9);
          tessellator.a(d17, (j + 0), d14, d6, d9);
          tessellator.a(d17, (j + 1), d14, d6, d7);
        } 
        if (flag6 || (j < l - 1 && this.a.h(i, j + 1, k + 1))) {
          tessellator.a(d16, (j + 1), d14, d5, d8);
          tessellator.a(d16, (j + 1), d15, d5, d9);
          tessellator.a(d17, (j + 1), d15, d6, d9);
          tessellator.a(d17, (j + 1), d14, d6, d8);
          tessellator.a(d16, (j + 1), d15, d5, d8);
          tessellator.a(d16, (j + 1), d14, d5, d9);
          tessellator.a(d17, (j + 1), d14, d6, d9);
          tessellator.a(d17, (j + 1), d15, d6, d8);
        } 
        if (flag7 || (j > 1 && this.a.h(i, j - 1, k + 1))) {
          tessellator.a(d16, j, d14, d5, d8);
          tessellator.a(d16, j, d15, d5, d9);
          tessellator.a(d17, j, d15, d6, d9);
          tessellator.a(d17, j, d14, d6, d8);
          tessellator.a(d16, j, d15, d5, d8);
          tessellator.a(d16, j, d14, d5, d9);
          tessellator.a(d17, j, d14, d6, d9);
          tessellator.a(d17, j, d15, d6, d8);
        } 
      } 
    } else {
      tessellator.a(d11, (j + 1), d15, d, d3);
      tessellator.a(d11, (j + 0), d15, d, d4);
      tessellator.a(d11, (j + 0), d13, d2, d4);
      tessellator.a(d11, (j + 1), d13, d2, d3);
      tessellator.a(d11, (j + 1), d13, d, d3);
      tessellator.a(d11, (j + 0), d13, d, d4);
      tessellator.a(d11, (j + 0), d15, d2, d4);
      tessellator.a(d11, (j + 1), d15, d2, d3);
      if (flag6) {
        tessellator.a(d17, (j + 1), d15, d6, d9);
        tessellator.a(d17, (j + 1), d13, d6, d7);
        tessellator.a(d16, (j + 1), d13, d5, d7);
        tessellator.a(d16, (j + 1), d15, d5, d9);
        tessellator.a(d17, (j + 1), d13, d6, d9);
        tessellator.a(d17, (j + 1), d15, d6, d7);
        tessellator.a(d16, (j + 1), d15, d5, d7);
        tessellator.a(d16, (j + 1), d13, d5, d9);
      } else {
        if (j < l - 1 && this.a.h(i, j + 1, k - 1)) {
          tessellator.a(d16, (j + 1), d13, d6, d7);
          tessellator.a(d16, (j + 1), d14, d6, d8);
          tessellator.a(d17, (j + 1), d14, d5, d8);
          tessellator.a(d17, (j + 1), d13, d5, d7);
          tessellator.a(d16, (j + 1), d14, d6, d7);
          tessellator.a(d16, (j + 1), d13, d6, d8);
          tessellator.a(d17, (j + 1), d13, d5, d8);
          tessellator.a(d17, (j + 1), d14, d5, d7);
        } 
        if (j < l - 1 && this.a.h(i, j + 1, k + 1)) {
          tessellator.a(d16, (j + 1), d14, d5, d8);
          tessellator.a(d16, (j + 1), d15, d5, d9);
          tessellator.a(d17, (j + 1), d15, d6, d9);
          tessellator.a(d17, (j + 1), d14, d6, d8);
          tessellator.a(d16, (j + 1), d15, d5, d8);
          tessellator.a(d16, (j + 1), d14, d5, d9);
          tessellator.a(d17, (j + 1), d14, d6, d9);
          tessellator.a(d17, (j + 1), d15, d6, d8);
        } 
      } 
      if (flag7) {
        tessellator.a(d17, j, d15, d6, d9);
        tessellator.a(d17, j, d13, d6, d7);
        tessellator.a(d16, j, d13, d5, d7);
        tessellator.a(d16, j, d15, d5, d9);
        tessellator.a(d17, j, d13, d6, d9);
        tessellator.a(d17, j, d15, d6, d7);
        tessellator.a(d16, j, d15, d5, d7);
        tessellator.a(d16, j, d13, d5, d9);
      } else {
        if (j > 1 && this.a.h(i, j - 1, k - 1)) {
          tessellator.a(d16, j, d13, d6, d7);
          tessellator.a(d16, j, d14, d6, d8);
          tessellator.a(d17, j, d14, d5, d8);
          tessellator.a(d17, j, d13, d5, d7);
          tessellator.a(d16, j, d14, d6, d7);
          tessellator.a(d16, j, d13, d6, d8);
          tessellator.a(d17, j, d13, d5, d8);
          tessellator.a(d17, j, d14, d5, d7);
        } 
        if (j > 1 && this.a.h(i, j - 1, k + 1)) {
          tessellator.a(d16, j, d14, d5, d8);
          tessellator.a(d16, j, d15, d5, d9);
          tessellator.a(d17, j, d15, d6, d9);
          tessellator.a(d17, j, d14, d6, d8);
          tessellator.a(d16, j, d15, d5, d8);
          tessellator.a(d16, j, d14, d5, d9);
          tessellator.a(d17, j, d14, d6, d9);
          tessellator.a(d17, j, d15, d6, d8);
        } 
      } 
    } 
    return true;
  }
  
  public boolean j(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    tessellator.b(block.e(this.a, i, j, k));
    float f = 1.0F;
    int l = block.a(this.a, i, j, k);
    float f1 = (l >> 16 & 0xFF) / 255.0F;
    float f2 = (l >> 8 & 0xFF) / 255.0F;
    float f3 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    } 
    tessellator.a(f * f1, f * f2, f * f3);
    double d = i;
    double d1 = j;
    double d2 = k;
    if (block == yy.X) {
      long l1 = (i * 3129871) ^ k * 116129781L ^ j;
      l1 = l1 * l1 * 42317861L + l1 * 11L;
      d += (((float)(l1 >> 16L & 0xFL) / 15.0F) - 0.5D) * 0.5D;
      d1 += (((float)(l1 >> 20L & 0xFL) / 15.0F) - 1.0D) * 0.2D;
      d2 += (((float)(l1 >> 24L & 0xFL) / 15.0F) - 0.5D) * 0.5D;
    } 
    a(block, this.a.d(i, j, k), d, d1, d2);
    return true;
  }
  
  public boolean k(yy block, int i, int j, int k) {
    pu blockstem = (pu)block;
    cv tessellator = cv.a;
    tessellator.b(blockstem.e(this.a, i, j, k));
    float f = 1.0F;
    int l = blockstem.a(this.a, i, j, k);
    float f1 = (l >> 16 & 0xFF) / 255.0F;
    float f2 = (l >> 8 & 0xFF) / 255.0F;
    float f3 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    } 
    tessellator.a(f * f1, f * f2, f * f3);
    blockstem.b(this.a, i, j, k);
    int i1 = blockstem.c(this.a, i, j, k);
    if (i1 < 0) {
      a((yy)blockstem, this.a.d(i, j, k), blockstem.bV, i, j, k);
    } else {
      a((yy)blockstem, this.a.d(i, j, k), 0.5D, i, j, k);
      a((yy)blockstem, this.a.d(i, j, k), i1, blockstem.bV, i, j, k);
    } 
    return true;
  }
  
  public boolean l(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    tessellator.b(block.e(this.a, i, j, k));
    tessellator.a(1.0F, 1.0F, 1.0F);
    b(block, this.a.d(i, j, k), i, (j - 0.0625F), k);
    return true;
  }
  
  public void a(yy block, double d, double d1, double d2, double d3, double d4) {
    cv tessellator = cv.a;
    int i = block.b(0);
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    float f = j / 256.0F;
    float f1 = (j + 15.99F) / 256.0F;
    float f2 = k / 256.0F;
    float f3 = (k + 15.99F) / 256.0F;
    double d5 = f + 0.02734375D;
    double d6 = f2 + 0.0234375D;
    double d7 = f + 0.03515625D;
    double d8 = f2 + 0.03125D;
    d += 0.5D;
    d2 += 0.5D;
    double d9 = d - 0.5D;
    double d10 = d + 0.5D;
    double d11 = d2 - 0.5D;
    double d12 = d2 + 0.5D;
    double d13 = 0.0625D;
    double d14 = 0.625D;
    tessellator.a(d + d3 * (1.0D - d14) - d13, d1 + d14, d2 + d4 * (1.0D - d14) - d13, d5, d6);
    tessellator.a(d + d3 * (1.0D - d14) - d13, d1 + d14, d2 + d4 * (1.0D - d14) + d13, d5, d8);
    tessellator.a(d + d3 * (1.0D - d14) + d13, d1 + d14, d2 + d4 * (1.0D - d14) + d13, d7, d8);
    tessellator.a(d + d3 * (1.0D - d14) + d13, d1 + d14, d2 + d4 * (1.0D - d14) - d13, d7, d6);
    tessellator.a(d - d13, d1 + 1.0D, d11, f, f2);
    tessellator.a(d - d13 + d3, d1 + 0.0D, d11 + d4, f, f3);
    tessellator.a(d - d13 + d3, d1 + 0.0D, d12 + d4, f1, f3);
    tessellator.a(d - d13, d1 + 1.0D, d12, f1, f2);
    tessellator.a(d + d13, d1 + 1.0D, d12, f, f2);
    tessellator.a(d + d3 + d13, d1 + 0.0D, d12 + d4, f, f3);
    tessellator.a(d + d3 + d13, d1 + 0.0D, d11 + d4, f1, f3);
    tessellator.a(d + d13, d1 + 1.0D, d11, f1, f2);
    tessellator.a(d9, d1 + 1.0D, d2 + d13, f, f2);
    tessellator.a(d9 + d3, d1 + 0.0D, d2 + d13 + d4, f, f3);
    tessellator.a(d10 + d3, d1 + 0.0D, d2 + d13 + d4, f1, f3);
    tessellator.a(d10, d1 + 1.0D, d2 + d13, f1, f2);
    tessellator.a(d10, d1 + 1.0D, d2 - d13, f, f2);
    tessellator.a(d10 + d3, d1 + 0.0D, d2 - d13 + d4, f, f3);
    tessellator.a(d9 + d3, d1 + 0.0D, d2 - d13 + d4, f1, f3);
    tessellator.a(d9, d1 + 1.0D, d2 - d13, f1, f2);
  }
  
  public void a(yy block, int i, double d, double d1, double d2) {
    cv tessellator = cv.a;
    int j = block.a(0, i);
    if (this.e >= 0)
      j = this.e; 
    int k = (j & 0xF) << 4;
    int l = j & 0xF0;
    double d3 = (k / 256.0F);
    double d4 = ((k + 15.99F) / 256.0F);
    double d5 = (l / 256.0F);
    double d6 = ((l + 15.99F) / 256.0F);
    double d7 = d + 0.5D - 0.45D;
    double d8 = d + 0.5D + 0.45D;
    double d9 = d2 + 0.5D - 0.45D;
    double d10 = d2 + 0.5D + 0.45D;
    tessellator.a(d7, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d10, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d7, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d10, d4, d5);
  }
  
  public void a(yy block, int i, double d, double d1, double d2, double d3) {
    cv tessellator = cv.a;
    int j = block.a(0, i);
    if (this.e >= 0)
      j = this.e; 
    int k = (j & 0xF) << 4;
    int l = j & 0xF0;
    double d4 = (k / 256.0F);
    double d5 = ((k + 15.99F) / 256.0F);
    double d6 = (l / 256.0F);
    double d7 = (l + 15.989999771118164D * d) / 256.0D;
    double d8 = d1 + 0.5D - 0.44999998807907104D;
    double d9 = d1 + 0.5D + 0.44999998807907104D;
    double d10 = d3 + 0.5D - 0.44999998807907104D;
    double d11 = d3 + 0.5D + 0.44999998807907104D;
    tessellator.a(d8, d2 + d, d10, d4, d6);
    tessellator.a(d8, d2 + 0.0D, d10, d4, d7);
    tessellator.a(d9, d2 + 0.0D, d11, d5, d7);
    tessellator.a(d9, d2 + d, d11, d5, d6);
    tessellator.a(d9, d2 + d, d11, d4, d6);
    tessellator.a(d9, d2 + 0.0D, d11, d4, d7);
    tessellator.a(d8, d2 + 0.0D, d10, d5, d7);
    tessellator.a(d8, d2 + d, d10, d5, d6);
    tessellator.a(d8, d2 + d, d11, d4, d6);
    tessellator.a(d8, d2 + 0.0D, d11, d4, d7);
    tessellator.a(d9, d2 + 0.0D, d10, d5, d7);
    tessellator.a(d9, d2 + d, d10, d5, d6);
    tessellator.a(d9, d2 + d, d10, d4, d6);
    tessellator.a(d9, d2 + 0.0D, d10, d4, d7);
    tessellator.a(d8, d2 + 0.0D, d11, d5, d7);
    tessellator.a(d8, d2 + d, d11, d5, d6);
  }
  
  public boolean m(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = block.bL;
    if (this.e >= 0)
      l = this.e; 
    int i1 = (l & 0xF) << 4;
    int j1 = l & 0xF0;
    float f = 0.015625F;
    double d = (i1 / 256.0F);
    double d1 = ((i1 + 15.99F) / 256.0F);
    double d2 = (j1 / 256.0F);
    double d3 = ((j1 + 15.99F) / 256.0F);
    long l1 = (i * 3129871) ^ k * 116129781L ^ j;
    l1 = l1 * l1 * 42317861L + l1 * 11L;
    int k1 = (int)(l1 >> 16L & 0x3L);
    tessellator.b(block.e(this.a, i, j, k));
    float f1 = i + 0.5F;
    float f2 = k + 0.5F;
    float f3 = (k1 & 0x1) * 0.5F * (1 - k1 / 2 % 2 * 2);
    float f4 = (k1 + 1 & 0x1) * 0.5F * (1 - (k1 + 1) / 2 % 2 * 2);
    tessellator.c(block.f());
    tessellator.a((f1 + f3 - f4), (j + f), (f2 + f3 + f4), d, d2);
    tessellator.a((f1 + f3 + f4), (j + f), (f2 - f3 + f4), d1, d2);
    tessellator.a((f1 - f3 + f4), (j + f), (f2 - f3 - f4), d1, d3);
    tessellator.a((f1 - f3 - f4), (j + f), (f2 + f3 - f4), d, d3);
    tessellator.c((block.f() & 0xFEFEFE) >> 1);
    tessellator.a((f1 - f3 - f4), (j + f), (f2 + f3 - f4), d, d3);
    tessellator.a((f1 - f3 + f4), (j + f), (f2 - f3 - f4), d1, d3);
    tessellator.a((f1 + f3 + f4), (j + f), (f2 - f3 + f4), d1, d2);
    tessellator.a((f1 + f3 - f4), (j + f), (f2 + f3 + f4), d, d2);
    return true;
  }
  
  public void a(yy block, int i, int j, double d, double d1, double d2, double d3) {
    cv tessellator = cv.a;
    int k = block.a(0, i) + 16;
    if (this.e >= 0)
      k = this.e; 
    int l = (k & 0xF) << 4;
    int i1 = k & 0xF0;
    double d4 = (l / 256.0F);
    double d5 = ((l + 15.99F) / 256.0F);
    double d6 = (i1 / 256.0F);
    double d7 = (i1 + 15.989999771118164D * d) / 256.0D;
    double d8 = d1 + 0.5D - 0.5D;
    double d9 = d1 + 0.5D + 0.5D;
    double d10 = d3 + 0.5D - 0.5D;
    double d11 = d3 + 0.5D + 0.5D;
    double d12 = d1 + 0.5D;
    double d13 = d3 + 0.5D;
    if ((j + 1) / 2 % 2 == 1) {
      double d14 = d5;
      d5 = d4;
      d4 = d14;
    } 
    if (j < 2) {
      tessellator.a(d8, d2 + d, d13, d4, d6);
      tessellator.a(d8, d2 + 0.0D, d13, d4, d7);
      tessellator.a(d9, d2 + 0.0D, d13, d5, d7);
      tessellator.a(d9, d2 + d, d13, d5, d6);
      tessellator.a(d9, d2 + d, d13, d5, d6);
      tessellator.a(d9, d2 + 0.0D, d13, d5, d7);
      tessellator.a(d8, d2 + 0.0D, d13, d4, d7);
      tessellator.a(d8, d2 + d, d13, d4, d6);
    } else {
      tessellator.a(d12, d2 + d, d11, d4, d6);
      tessellator.a(d12, d2 + 0.0D, d11, d4, d7);
      tessellator.a(d12, d2 + 0.0D, d10, d5, d7);
      tessellator.a(d12, d2 + d, d10, d5, d6);
      tessellator.a(d12, d2 + d, d10, d5, d6);
      tessellator.a(d12, d2 + 0.0D, d10, d5, d7);
      tessellator.a(d12, d2 + 0.0D, d11, d4, d7);
      tessellator.a(d12, d2 + d, d11, d4, d6);
    } 
  }
  
  public void b(yy block, int i, double d, double d1, double d2) {
    cv tessellator = cv.a;
    int j = block.a(0, i);
    if (this.e >= 0)
      j = this.e; 
    int k = (j & 0xF) << 4;
    int l = j & 0xF0;
    double d3 = (k / 256.0F);
    double d4 = ((k + 15.99F) / 256.0F);
    double d5 = (l / 256.0F);
    double d6 = ((l + 15.99F) / 256.0F);
    double d7 = d + 0.5D - 0.25D;
    double d8 = d + 0.5D + 0.25D;
    double d9 = d2 + 0.5D - 0.5D;
    double d10 = d2 + 0.5D + 0.5D;
    tessellator.a(d7, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d10, d4, d5);
    tessellator.a(d7, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d10, d4, d5);
    d7 = d + 0.5D - 0.5D;
    d8 = d + 0.5D + 0.5D;
    d9 = d2 + 0.5D - 0.25D;
    d10 = d2 + 0.5D + 0.25D;
    tessellator.a(d7, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d9, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d9, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d9, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d9, d4, d5);
    tessellator.a(d8, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d8, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d7, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d7, d1 + 1.0D, d10, d4, d5);
    tessellator.a(d7, d1 + 1.0D, d10, d3, d5);
    tessellator.a(d7, d1 + 0.0D, d10, d3, d6);
    tessellator.a(d8, d1 + 0.0D, d10, d4, d6);
    tessellator.a(d8, d1 + 1.0D, d10, d4, d5);
  }
  
  public boolean n(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    int l = block.a(this.a, i, j, k);
    float f = (l >> 16 & 0xFF) / 255.0F;
    float f1 = (l >> 8 & 0xFF) / 255.0F;
    float f2 = (l & 0xFF) / 255.0F;
    boolean flag = block.a_(this.a, i, j + 1, k, 1);
    boolean flag1 = block.a_(this.a, i, j - 1, k, 0);
    boolean[] aflag = { block.a_(this.a, i, j, k - 1, 2), block.a_(this.a, i, j, k + 1, 3), block.a_(this.a, i - 1, j, k, 4), block.a_(this.a, i + 1, j, k, 5) };
    if (!flag && !flag1 && !aflag[0] && !aflag[1] && !aflag[2] && !aflag[3])
      return false; 
    boolean flag2 = false;
    float f3 = 0.5F;
    float f4 = 1.0F;
    float f5 = 0.8F;
    float f6 = 0.6F;
    double d = 0.0D;
    double d1 = 1.0D;
    p material = block.bZ;
    int i1 = this.a.d(i, j, k);
    double d2 = a(i, j, k, material);
    double d3 = a(i, j, k + 1, material);
    double d4 = a(i + 1, j, k + 1, material);
    double d5 = a(i + 1, j, k, material);
    double d6 = 0.0010000000474974513D;
    if (this.g || flag) {
      flag2 = true;
      int j1 = block.a(1, i1);
      float f7 = (float)agw.a(this.a, i, j, k, material);
      if (f7 > -999.0F)
        j1 = block.a(2, i1); 
      d2 -= d6;
      d3 -= d6;
      d4 -= d6;
      d5 -= d6;
      int k2 = (j1 & 0xF) << 4;
      int l1 = j1 & 0xF0;
      double d7 = (k2 + 8.0D) / 256.0D;
      double d8 = (l1 + 8.0D) / 256.0D;
      if (f7 < -999.0F) {
        f7 = 0.0F;
      } else {
        d7 = ((k2 + 16) / 256.0F);
        d8 = ((l1 + 16) / 256.0F);
      } 
      double d10 = (me.a(f7) * 8.0F) / 256.0D;
      double d12 = (me.b(f7) * 8.0F) / 256.0D;
      tessellator.b(block.e(this.a, i, j, k));
      float f9 = 1.0F;
      tessellator.a(f4 * f9 * f, f4 * f9 * f1, f4 * f9 * f2);
      tessellator.a((i + 0), j + d2, (k + 0), d7 - d12 - d10, d8 - d12 + d10);
      tessellator.a((i + 0), j + d3, (k + 1), d7 - d12 + d10, d8 + d12 + d10);
      tessellator.a((i + 1), j + d4, (k + 1), d7 + d12 + d10, d8 + d12 - d10);
      tessellator.a((i + 1), j + d5, (k + 0), d7 + d12 - d10, d8 - d12 - d10);
    } 
    if (this.g || flag1) {
      tessellator.b(block.e(this.a, i, j - 1, k));
      float f8 = 1.0F;
      tessellator.a(f3 * f8, f3 * f8, f3 * f8);
      a(block, i, j + d6, k, block.b(0));
      flag2 = true;
    } 
    for (int k1 = 0; k1 < 4; k1++) {
      int j2 = i;
      int i2 = k;
      if (k1 == 0)
        i2 = k - 1; 
      if (k1 == 1)
        i2++; 
      if (k1 == 2)
        j2 = i - 1; 
      if (k1 == 3)
        j2++; 
      int l2 = block.a(k1 + 2, i1);
      int i3 = (l2 & 0xF) << 4;
      int j3 = l2 & 0xF0;
      if (this.g || aflag[k1]) {
        double d9, d11, d13, d14, d15, d16;
        if (k1 == 0) {
          d11 = d2;
          d9 = d5;
          d14 = i;
          d16 = (i + 1);
          d13 = k + d6;
          d15 = k + d6;
        } else if (k1 == 1) {
          d11 = d4;
          d9 = d3;
          d14 = (i + 1);
          d16 = i;
          d13 = (k + 1) - d6;
          d15 = (k + 1) - d6;
        } else if (k1 == 2) {
          d11 = d3;
          d9 = d2;
          d14 = i + d6;
          d16 = i + d6;
          d13 = (k + 1);
          d15 = k;
        } else {
          d11 = d5;
          d9 = d4;
          d14 = (i + 1) - d6;
          d16 = (i + 1) - d6;
          d13 = k;
          d15 = (k + 1);
        } 
        flag2 = true;
        double d17 = ((i3 + 0) / 256.0F);
        double d18 = ((i3 + 16) - 0.01D) / 256.0D;
        double d19 = (j3 + (1.0D - d11) * 16.0D) / 256.0D;
        double d20 = (j3 + (1.0D - d9) * 16.0D) / 256.0D;
        double d21 = ((j3 + 16) - 0.01D) / 256.0D;
        tessellator.b(block.e(this.a, j2, j, i2));
        float f10 = 1.0F;
        if (k1 < 2) {
          f10 *= f5;
        } else {
          f10 *= f6;
        } 
        tessellator.a(f4 * f10 * f, f4 * f10 * f1, f4 * f10 * f2);
        tessellator.a(d14, j + d11, d13, d17, d19);
        tessellator.a(d16, j + d9, d15, d18, d20);
        tessellator.a(d16, (j + 0), d15, d18, d21);
        tessellator.a(d14, (j + 0), d13, d17, d21);
      } 
    } 
    block.bS = d;
    block.bV = d1;
    return flag2;
  }
  
  public float a(int i, int j, int k, p material) {
    int l = 0;
    float f = 0.0F;
    for (int i1 = 0; i1 < 4; i1++) {
      int j1 = i - (i1 & 0x1);
      int k1 = k - (i1 >> 1 & 0x1);
      if (this.a.e(j1, j + 1, k1) == material)
        return 1.0F; 
      p material1 = this.a.e(j1, j, k1);
      if (material1 == material) {
        int l1 = this.a.d(j1, j, k1);
        if (l1 >= 8 || l1 == 0) {
          f += agw.e(l1) * 10.0F;
          l += 10;
        } 
        f += agw.e(l1);
        l++;
      } else if (!material1.b()) {
        f++;
        l++;
      } 
    } 
    return 1.0F - f / l;
  }
  
  public void a(yy block, ry world, int i, int j, int k) {
    float f = 0.5F;
    float f1 = 1.0F;
    float f2 = 0.8F;
    float f3 = 0.6F;
    cv tessellator = cv.a;
    tessellator.b();
    tessellator.b(block.e(world, i, j, k));
    float f4 = 1.0F;
    float f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f * f5, f * f5, f * f5);
    a(block, -0.5D, -0.5D, -0.5D, block.b(0));
    f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f1 * f5, f1 * f5, f1 * f5);
    b(block, -0.5D, -0.5D, -0.5D, block.b(1));
    f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f2 * f5, f2 * f5, f2 * f5);
    c(block, -0.5D, -0.5D, -0.5D, block.b(2));
    f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f2 * f5, f2 * f5, f2 * f5);
    d(block, -0.5D, -0.5D, -0.5D, block.b(3));
    f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f3 * f5, f3 * f5, f3 * f5);
    e(block, -0.5D, -0.5D, -0.5D, block.b(4));
    f5 = 1.0F;
    if (f5 < f4)
      f5 = f4; 
    tessellator.a(f3 * f5, f3 * f5, f3 * f5);
    f(block, -0.5D, -0.5D, -0.5D, block.b(5));
    tessellator.a();
  }
  
  public boolean o(yy block, int i, int j, int k) {
    int l = block.a(this.a, i, j, k);
    float f = (l >> 16 & 0xFF) / 255.0F;
    float f1 = (l >> 8 & 0xFF) / 255.0F;
    float f2 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f3 = (f * 30.0F + f1 * 59.0F + f2 * 11.0F) / 100.0F;
      float f4 = (f * 30.0F + f1 * 70.0F) / 100.0F;
      float f5 = (f * 30.0F + f2 * 70.0F) / 100.0F;
      f = f3;
      f1 = f4;
      f2 = f5;
    } 
    return (!Minecraft.t() || yy.q[block.bM] != 0) ? b(block, i, j, k, f, f1, f2) : a(block, i, j, k, f, f1, f2);
  }
  
  public boolean a(yy block, int i, int j, int k, float f, float f1, float f2) {
    this.n = true;
    boolean flag = false;
    float f3 = this.o;
    float f10 = this.o;
    float f17 = this.o;
    float f24 = this.o;
    boolean flag1 = true;
    boolean flag2 = true;
    boolean flag3 = true;
    boolean flag4 = true;
    boolean flag5 = true;
    boolean flag6 = true;
    this.o = block.f(this.a, i, j, k);
    this.p = block.f(this.a, i - 1, j, k);
    this.q = block.f(this.a, i, j - 1, k);
    this.r = block.f(this.a, i, j, k - 1);
    this.s = block.f(this.a, i + 1, j, k);
    this.t = block.f(this.a, i, j + 1, k);
    this.u = block.f(this.a, i, j, k + 1);
    int l = block.e(this.a, i, j, k);
    int i1 = l;
    int j1 = l;
    int k1 = l;
    int l1 = l;
    int i2 = l;
    int j2 = l;
    if (block.bS <= 0.0D)
      j1 = block.e(this.a, i, j - 1, k); 
    if (block.bV >= 1.0D)
      i2 = block.e(this.a, i, j + 1, k); 
    if (block.bR <= 0.0D)
      i1 = block.e(this.a, i - 1, j, k); 
    if (block.bU >= 1.0D)
      l1 = block.e(this.a, i + 1, j, k); 
    if (block.bT <= 0.0D)
      k1 = block.e(this.a, i, j, k - 1); 
    if (block.bW >= 1.0D)
      j2 = block.e(this.a, i, j, k + 1); 
    cv tessellator = cv.a;
    tessellator.b(983055);
    this.aB = yy.p[this.a.a(i + 1, j + 1, k)];
    this.aJ = yy.p[this.a.a(i + 1, j - 1, k)];
    this.aF = yy.p[this.a.a(i + 1, j, k + 1)];
    this.aH = yy.p[this.a.a(i + 1, j, k - 1)];
    this.aC = yy.p[this.a.a(i - 1, j + 1, k)];
    this.aK = yy.p[this.a.a(i - 1, j - 1, k)];
    this.aE = yy.p[this.a.a(i - 1, j, k - 1)];
    this.aG = yy.p[this.a.a(i - 1, j, k + 1)];
    this.aD = yy.p[this.a.a(i, j + 1, k + 1)];
    this.aA = yy.p[this.a.a(i, j + 1, k - 1)];
    this.aL = yy.p[this.a.a(i, j - 1, k + 1)];
    this.aI = yy.p[this.a.a(i, j - 1, k - 1)];
    if (block.bL == 3) {
      flag6 = false;
      flag5 = false;
      flag4 = false;
      flag3 = false;
      flag1 = false;
    } 
    if (this.e >= 0) {
      flag6 = false;
      flag5 = false;
      flag4 = false;
      flag3 = false;
      flag1 = false;
    } 
    if (this.g || block.a_(this.a, i, j - 1, k, 0)) {
      float f4, f11, f18, f25;
      if (this.aj > 0) {
        if (block.bS <= 0.0D)
          j--; 
        this.Q = block.e(this.a, i - 1, j, k);
        this.S = block.e(this.a, i, j, k - 1);
        this.T = block.e(this.a, i, j, k + 1);
        this.V = block.e(this.a, i + 1, j, k);
        this.w = block.f(this.a, i - 1, j, k);
        this.y = block.f(this.a, i, j, k - 1);
        this.z = block.f(this.a, i, j, k + 1);
        this.B = block.f(this.a, i + 1, j, k);
        if (!this.aI && !this.aK) {
          this.v = this.w;
          this.P = this.Q;
        } else {
          this.v = block.f(this.a, i - 1, j, k - 1);
          this.P = block.e(this.a, i - 1, j, k - 1);
        } 
        if (!this.aL && !this.aK) {
          this.x = this.w;
          this.R = this.Q;
        } else {
          this.x = block.f(this.a, i - 1, j, k + 1);
          this.R = block.e(this.a, i - 1, j, k + 1);
        } 
        if (!this.aI && !this.aJ) {
          this.A = this.B;
          this.U = this.V;
        } else {
          this.A = block.f(this.a, i + 1, j, k - 1);
          this.U = block.e(this.a, i + 1, j, k - 1);
        } 
        if (!this.aL && !this.aJ) {
          this.C = this.B;
          this.W = this.V;
        } else {
          this.C = block.f(this.a, i + 1, j, k + 1);
          this.W = block.e(this.a, i + 1, j, k + 1);
        } 
        if (block.bS <= 0.0D)
          j++; 
        f4 = (this.x + this.w + this.z + this.q) / 4.0F;
        f25 = (this.z + this.q + this.C + this.B) / 4.0F;
        f18 = (this.q + this.y + this.B + this.A) / 4.0F;
        f11 = (this.w + this.v + this.q + this.y) / 4.0F;
        this.ak = c(this.R, this.Q, this.T, j1);
        this.an = c(this.T, this.W, this.V, j1);
        this.am = c(this.S, this.V, this.U, j1);
        this.al = c(this.Q, this.P, this.S, j1);
      } else {
        f25 = this.q;
        f18 = this.q;
        f11 = this.q;
        f4 = this.q;
        this.ak = this.al = this.am = this.an = this.Q;
      } 
      this.ao = this.ap = this.aq = this.ar = (flag1 ? f : 1.0F) * 0.5F;
      this.as = this.at = this.au = this.av = (flag1 ? f1 : 1.0F) * 0.5F;
      this.aw = this.ax = this.ay = this.az = (flag1 ? f2 : 1.0F) * 0.5F;
      this.ao *= f4;
      this.as *= f4;
      this.aw *= f4;
      this.ap *= f11;
      this.at *= f11;
      this.ax *= f11;
      this.aq *= f18;
      this.au *= f18;
      this.ay *= f18;
      this.ar *= f25;
      this.av *= f25;
      this.az *= f25;
      a(block, i, j, k, block.a(this.a, i, j, k, 0));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j + 1, k, 1)) {
      float f5, f12, f19, f26;
      if (this.aj > 0) {
        if (block.bV >= 1.0D)
          j++; 
        this.Y = block.e(this.a, i - 1, j, k);
        this.ac = block.e(this.a, i + 1, j, k);
        this.aa = block.e(this.a, i, j, k - 1);
        this.ad = block.e(this.a, i, j, k + 1);
        this.E = block.f(this.a, i - 1, j, k);
        this.I = block.f(this.a, i + 1, j, k);
        this.G = block.f(this.a, i, j, k - 1);
        this.J = block.f(this.a, i, j, k + 1);
        if (!this.aA && !this.aC) {
          this.D = this.E;
          this.X = this.Y;
        } else {
          this.D = block.f(this.a, i - 1, j, k - 1);
          this.X = block.e(this.a, i - 1, j, k - 1);
        } 
        if (!this.aA && !this.aB) {
          this.H = this.I;
          this.ab = this.ac;
        } else {
          this.H = block.f(this.a, i + 1, j, k - 1);
          this.ab = block.e(this.a, i + 1, j, k - 1);
        } 
        if (!this.aD && !this.aC) {
          this.F = this.E;
          this.Z = this.Y;
        } else {
          this.F = block.f(this.a, i - 1, j, k + 1);
          this.Z = block.e(this.a, i - 1, j, k + 1);
        } 
        if (!this.aD && !this.aB) {
          this.K = this.I;
          this.ae = this.ac;
        } else {
          this.K = block.f(this.a, i + 1, j, k + 1);
          this.ae = block.e(this.a, i + 1, j, k + 1);
        } 
        if (block.bV >= 1.0D)
          j--; 
        f26 = (this.F + this.E + this.J + this.t) / 4.0F;
        f5 = (this.J + this.t + this.K + this.I) / 4.0F;
        f12 = (this.t + this.G + this.I + this.H) / 4.0F;
        f19 = (this.E + this.D + this.t + this.G) / 4.0F;
        this.an = c(this.Z, this.Y, this.ad, i2);
        this.ak = c(this.ad, this.ae, this.ac, i2);
        this.al = c(this.aa, this.ac, this.ab, i2);
        this.am = c(this.Y, this.X, this.aa, i2);
      } else {
        f26 = this.t;
        f19 = this.t;
        f12 = this.t;
        f5 = this.t;
        this.ak = this.al = this.am = this.an = i2;
      } 
      this.ao = this.ap = this.aq = this.ar = flag2 ? f : 1.0F;
      this.as = this.at = this.au = this.av = flag2 ? f1 : 1.0F;
      this.aw = this.ax = this.ay = this.az = flag2 ? f2 : 1.0F;
      this.ao *= f5;
      this.as *= f5;
      this.aw *= f5;
      this.ap *= f12;
      this.at *= f12;
      this.ax *= f12;
      this.aq *= f19;
      this.au *= f19;
      this.ay *= f19;
      this.ar *= f26;
      this.av *= f26;
      this.az *= f26;
      b(block, i, j, k, block.a(this.a, i, j, k, 1));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k - 1, 2)) {
      float f6, f13, f20, f27;
      if (this.aj > 0) {
        if (block.bT <= 0.0D)
          k--; 
        this.L = block.f(this.a, i - 1, j, k);
        this.y = block.f(this.a, i, j - 1, k);
        this.G = block.f(this.a, i, j + 1, k);
        this.M = block.f(this.a, i + 1, j, k);
        this.af = block.e(this.a, i - 1, j, k);
        this.S = block.e(this.a, i, j - 1, k);
        this.aa = block.e(this.a, i, j + 1, k);
        this.ag = block.e(this.a, i + 1, j, k);
        if (!this.aE && !this.aI) {
          this.v = this.L;
          this.P = this.af;
        } else {
          this.v = block.f(this.a, i - 1, j - 1, k);
          this.P = block.e(this.a, i - 1, j - 1, k);
        } 
        if (!this.aE && !this.aA) {
          this.D = this.L;
          this.X = this.af;
        } else {
          this.D = block.f(this.a, i - 1, j + 1, k);
          this.X = block.e(this.a, i - 1, j + 1, k);
        } 
        if (!this.aH && !this.aI) {
          this.A = this.M;
          this.U = this.ag;
        } else {
          this.A = block.f(this.a, i + 1, j - 1, k);
          this.U = block.e(this.a, i + 1, j - 1, k);
        } 
        if (!this.aH && !this.aA) {
          this.H = this.M;
          this.ab = this.ag;
        } else {
          this.H = block.f(this.a, i + 1, j + 1, k);
          this.ab = block.e(this.a, i + 1, j + 1, k);
        } 
        if (block.bT <= 0.0D)
          k++; 
        f6 = (this.L + this.D + this.r + this.G) / 4.0F;
        f13 = (this.r + this.G + this.M + this.H) / 4.0F;
        f20 = (this.y + this.r + this.A + this.M) / 4.0F;
        f27 = (this.v + this.L + this.y + this.r) / 4.0F;
        this.ak = c(this.af, this.X, this.aa, k1);
        this.al = c(this.aa, this.ag, this.ab, k1);
        this.am = c(this.S, this.U, this.ag, k1);
        this.an = c(this.P, this.af, this.S, k1);
      } else {
        f27 = this.r;
        f20 = this.r;
        f13 = this.r;
        f6 = this.r;
        this.ak = this.al = this.am = this.an = k1;
      } 
      this.ao = this.ap = this.aq = this.ar = (flag3 ? f : 1.0F) * 0.8F;
      this.as = this.at = this.au = this.av = (flag3 ? f1 : 1.0F) * 0.8F;
      this.aw = this.ax = this.ay = this.az = (flag3 ? f2 : 1.0F) * 0.8F;
      this.ao *= f6;
      this.as *= f6;
      this.aw *= f6;
      this.ap *= f13;
      this.at *= f13;
      this.ax *= f13;
      this.aq *= f20;
      this.au *= f20;
      this.ay *= f20;
      this.ar *= f27;
      this.av *= f27;
      this.az *= f27;
      int k2 = block.a(this.a, i, j, k, 2);
      c(block, i, j, k, k2);
      if (cfgGrassFix && k2 == 3 && this.e < 0) {
        this.ao *= f;
        this.ap *= f;
        this.aq *= f;
        this.ar *= f;
        this.as *= f1;
        this.at *= f1;
        this.au *= f1;
        this.av *= f1;
        this.aw *= f2;
        this.ax *= f2;
        this.ay *= f2;
        this.az *= f2;
        c(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k + 1, 3)) {
      float f7, f14, f21, f28;
      if (this.aj > 0) {
        if (block.bW >= 1.0D)
          k++; 
        this.N = block.f(this.a, i - 1, j, k);
        this.O = block.f(this.a, i + 1, j, k);
        this.z = block.f(this.a, i, j - 1, k);
        this.J = block.f(this.a, i, j + 1, k);
        this.ah = block.e(this.a, i - 1, j, k);
        this.ai = block.e(this.a, i + 1, j, k);
        this.T = block.e(this.a, i, j - 1, k);
        this.ad = block.e(this.a, i, j + 1, k);
        if (!this.aG && !this.aL) {
          this.x = this.N;
          this.R = this.ah;
        } else {
          this.x = block.f(this.a, i - 1, j - 1, k);
          this.R = block.e(this.a, i - 1, j - 1, k);
        } 
        if (!this.aG && !this.aD) {
          this.F = this.N;
          this.Z = this.ah;
        } else {
          this.F = block.f(this.a, i - 1, j + 1, k);
          this.Z = block.e(this.a, i - 1, j + 1, k);
        } 
        if (!this.aF && !this.aL) {
          this.C = this.O;
          this.W = this.ai;
        } else {
          this.C = block.f(this.a, i + 1, j - 1, k);
          this.W = block.e(this.a, i + 1, j - 1, k);
        } 
        if (!this.aF && !this.aD) {
          this.K = this.O;
          this.ae = this.ai;
        } else {
          this.K = block.f(this.a, i + 1, j + 1, k);
          this.ae = block.e(this.a, i + 1, j + 1, k);
        } 
        if (block.bW >= 1.0D)
          k--; 
        f7 = (this.N + this.F + this.u + this.J) / 4.0F;
        f28 = (this.u + this.J + this.O + this.K) / 4.0F;
        f21 = (this.z + this.u + this.C + this.O) / 4.0F;
        f14 = (this.x + this.N + this.z + this.u) / 4.0F;
        this.ak = c(this.ah, this.Z, this.ad, j2);
        this.an = c(this.ad, this.ai, this.ae, j2);
        this.am = c(this.T, this.W, this.ai, j2);
        this.al = c(this.R, this.ah, this.T, j2);
      } else {
        f28 = this.u;
        f21 = this.u;
        f14 = this.u;
        f7 = this.u;
        this.ak = this.al = this.am = this.an = j2;
      } 
      this.ao = this.ap = this.aq = this.ar = (flag4 ? f : 1.0F) * 0.8F;
      this.as = this.at = this.au = this.av = (flag4 ? f1 : 1.0F) * 0.8F;
      this.aw = this.ax = this.ay = this.az = (flag4 ? f2 : 1.0F) * 0.8F;
      this.ao *= f7;
      this.as *= f7;
      this.aw *= f7;
      this.ap *= f14;
      this.at *= f14;
      this.ax *= f14;
      this.aq *= f21;
      this.au *= f21;
      this.ay *= f21;
      this.ar *= f28;
      this.av *= f28;
      this.az *= f28;
      int l2 = block.a(this.a, i, j, k, 3);
      d(block, i, j, k, block.a(this.a, i, j, k, 3));
      if (cfgGrassFix && l2 == 3 && this.e < 0) {
        this.ao *= f;
        this.ap *= f;
        this.aq *= f;
        this.ar *= f;
        this.as *= f1;
        this.at *= f1;
        this.au *= f1;
        this.av *= f1;
        this.aw *= f2;
        this.ax *= f2;
        this.ay *= f2;
        this.az *= f2;
        d(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i - 1, j, k, 4)) {
      float f8, f15, f22, f29;
      if (this.aj > 0) {
        if (block.bR <= 0.0D)
          i--; 
        this.w = block.f(this.a, i, j - 1, k);
        this.L = block.f(this.a, i, j, k - 1);
        this.N = block.f(this.a, i, j, k + 1);
        this.E = block.f(this.a, i, j + 1, k);
        this.Q = block.e(this.a, i, j - 1, k);
        this.af = block.e(this.a, i, j, k - 1);
        this.ah = block.e(this.a, i, j, k + 1);
        this.Y = block.e(this.a, i, j + 1, k);
        if (!this.aE && !this.aK) {
          this.v = this.L;
          this.P = this.af;
        } else {
          this.v = block.f(this.a, i, j - 1, k - 1);
          this.P = block.e(this.a, i, j - 1, k - 1);
        } 
        if (!this.aG && !this.aK) {
          this.x = this.N;
          this.R = this.ah;
        } else {
          this.x = block.f(this.a, i, j - 1, k + 1);
          this.R = block.e(this.a, i, j - 1, k + 1);
        } 
        if (!this.aE && !this.aC) {
          this.D = this.L;
          this.X = this.af;
        } else {
          this.D = block.f(this.a, i, j + 1, k - 1);
          this.X = block.e(this.a, i, j + 1, k - 1);
        } 
        if (!this.aG && !this.aC) {
          this.F = this.N;
          this.Z = this.ah;
        } else {
          this.F = block.f(this.a, i, j + 1, k + 1);
          this.Z = block.e(this.a, i, j + 1, k + 1);
        } 
        if (block.bR <= 0.0D)
          i++; 
        f29 = (this.w + this.x + this.p + this.N) / 4.0F;
        f8 = (this.p + this.N + this.E + this.F) / 4.0F;
        f15 = (this.L + this.p + this.D + this.E) / 4.0F;
        f22 = (this.v + this.w + this.L + this.p) / 4.0F;
        this.an = c(this.Q, this.R, this.ah, i1);
        this.ak = c(this.ah, this.Y, this.Z, i1);
        this.al = c(this.af, this.X, this.Y, i1);
        this.am = c(this.P, this.Q, this.af, i1);
      } else {
        f29 = this.p;
        f22 = this.p;
        f15 = this.p;
        f8 = this.p;
        this.ak = this.al = this.am = this.an = i1;
      } 
      this.ao = this.ap = this.aq = this.ar = (flag5 ? f : 1.0F) * 0.6F;
      this.as = this.at = this.au = this.av = (flag5 ? f1 : 1.0F) * 0.6F;
      this.aw = this.ax = this.ay = this.az = (flag5 ? f2 : 1.0F) * 0.6F;
      this.ao *= f8;
      this.as *= f8;
      this.aw *= f8;
      this.ap *= f15;
      this.at *= f15;
      this.ax *= f15;
      this.aq *= f22;
      this.au *= f22;
      this.ay *= f22;
      this.ar *= f29;
      this.av *= f29;
      this.az *= f29;
      int i3 = block.a(this.a, i, j, k, 4);
      e(block, i, j, k, i3);
      if (cfgGrassFix && i3 == 3 && this.e < 0) {
        this.ao *= f;
        this.ap *= f;
        this.aq *= f;
        this.ar *= f;
        this.as *= f1;
        this.at *= f1;
        this.au *= f1;
        this.av *= f1;
        this.aw *= f2;
        this.ax *= f2;
        this.ay *= f2;
        this.az *= f2;
        e(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i + 1, j, k, 5)) {
      float f9, f16, f23, f30;
      if (this.aj > 0) {
        if (block.bU >= 1.0D)
          i++; 
        this.B = block.f(this.a, i, j - 1, k);
        this.M = block.f(this.a, i, j, k - 1);
        this.O = block.f(this.a, i, j, k + 1);
        this.I = block.f(this.a, i, j + 1, k);
        this.V = block.e(this.a, i, j - 1, k);
        this.ag = block.e(this.a, i, j, k - 1);
        this.ai = block.e(this.a, i, j, k + 1);
        this.ac = block.e(this.a, i, j + 1, k);
        if (!this.aJ && !this.aH) {
          this.A = this.M;
          this.U = this.ag;
        } else {
          this.A = block.f(this.a, i, j - 1, k - 1);
          this.U = block.e(this.a, i, j - 1, k - 1);
        } 
        if (!this.aJ && !this.aF) {
          this.C = this.O;
          this.W = this.ai;
        } else {
          this.C = block.f(this.a, i, j - 1, k + 1);
          this.W = block.e(this.a, i, j - 1, k + 1);
        } 
        if (!this.aB && !this.aH) {
          this.H = this.M;
          this.ab = this.ag;
        } else {
          this.H = block.f(this.a, i, j + 1, k - 1);
          this.ab = block.e(this.a, i, j + 1, k - 1);
        } 
        if (!this.aB && !this.aF) {
          this.K = this.O;
          this.ae = this.ai;
        } else {
          this.K = block.f(this.a, i, j + 1, k + 1);
          this.ae = block.e(this.a, i, j + 1, k + 1);
        } 
        if (block.bU >= 1.0D)
          i--; 
        f9 = (this.B + this.C + this.s + this.O) / 4.0F;
        f30 = (this.s + this.O + this.I + this.K) / 4.0F;
        f23 = (this.M + this.s + this.H + this.I) / 4.0F;
        f16 = (this.A + this.B + this.M + this.s) / 4.0F;
        this.ak = c(this.V, this.W, this.ai, l1);
        this.an = c(this.ai, this.ac, this.ae, l1);
        this.am = c(this.ag, this.ab, this.ac, l1);
        this.al = c(this.U, this.V, this.ag, l1);
      } else {
        f30 = this.s;
        f23 = this.s;
        f16 = this.s;
        f9 = this.s;
        this.ak = this.al = this.am = this.an = l1;
      } 
      this.ao = this.ap = this.aq = this.ar = (flag6 ? f : 1.0F) * 0.6F;
      this.as = this.at = this.au = this.av = (flag6 ? f1 : 1.0F) * 0.6F;
      this.aw = this.ax = this.ay = this.az = (flag6 ? f2 : 1.0F) * 0.6F;
      this.ao *= f9;
      this.as *= f9;
      this.aw *= f9;
      this.ap *= f16;
      this.at *= f16;
      this.ax *= f16;
      this.aq *= f23;
      this.au *= f23;
      this.ay *= f23;
      this.ar *= f30;
      this.av *= f30;
      this.az *= f30;
      int j3 = block.a(this.a, i, j, k, 5);
      f(block, i, j, k, j3);
      if (cfgGrassFix && j3 == 3 && this.e < 0) {
        this.ao *= f;
        this.ap *= f;
        this.aq *= f;
        this.ar *= f;
        this.as *= f1;
        this.at *= f1;
        this.au *= f1;
        this.av *= f1;
        this.aw *= f2;
        this.ax *= f2;
        this.ay *= f2;
        this.az *= f2;
        f(block, i, j, k, 38);
      } 
      flag = true;
    } 
    this.n = false;
    return flag;
  }
  
  public int c(int i, int j, int k, int l) {
    if (i == 0)
      i = l; 
    if (j == 0)
      j = l; 
    if (k == 0)
      k = l; 
    return i + j + k + l >> 2 & 0xFF00FF;
  }
  
  public boolean b(yy block, int i, int j, int k, float f, float f1, float f2) {
    this.n = false;
    cv tessellator = cv.a;
    boolean flag = false;
    float f3 = 0.5F;
    float f4 = 1.0F;
    float f5 = 0.8F;
    float f6 = 0.6F;
    float f7 = f4 * f;
    float f8 = f4 * f1;
    float f9 = f4 * f2;
    float f10 = f3;
    float f11 = f5;
    float f12 = f6;
    float f13 = f3;
    float f14 = f5;
    float f15 = f6;
    float f16 = f3;
    float f17 = f5;
    float f18 = f6;
    if (block != yy.u) {
      f10 = f3 * f;
      f11 = f5 * f;
      f12 = f6 * f;
      f13 = f3 * f1;
      f14 = f5 * f1;
      f15 = f6 * f1;
      f16 = f3 * f2;
      f17 = f5 * f2;
      f18 = f6 * f2;
    } 
    int l = block.e(this.a, i, j, k);
    if (this.g || block.a_(this.a, i, j - 1, k, 0)) {
      tessellator.b((block.bS <= 0.0D) ? block.e(this.a, i, j - 1, k) : l);
      tessellator.a(f10, f13, f16);
      a(block, i, j, k, block.a(this.a, i, j, k, 0));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j + 1, k, 1)) {
      tessellator.b((block.bV >= 1.0D) ? block.e(this.a, i, j + 1, k) : l);
      tessellator.a(f7, f8, f9);
      b(block, i, j, k, block.a(this.a, i, j, k, 1));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k - 1, 2)) {
      tessellator.b((block.bT <= 0.0D) ? block.e(this.a, i, j, k - 1) : l);
      tessellator.a(f11, f14, f17);
      int i1 = block.a(this.a, i, j, k, 2);
      c(block, i, j, k, i1);
      if (cfgGrassFix && i1 == 3 && this.e < 0) {
        tessellator.a(f11 * f, f14 * f1, f17 * f2);
        c(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k + 1, 3)) {
      tessellator.b((block.bW >= 1.0D) ? block.e(this.a, i, j, k + 1) : l);
      tessellator.a(f11, f14, f17);
      int j1 = block.a(this.a, i, j, k, 3);
      d(block, i, j, k, j1);
      if (cfgGrassFix && j1 == 3 && this.e < 0) {
        tessellator.a(f11 * f, f14 * f1, f17 * f2);
        d(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i - 1, j, k, 4)) {
      tessellator.b((block.bR <= 0.0D) ? block.e(this.a, i - 1, j, k) : l);
      tessellator.a(f12, f15, f18);
      int k1 = block.a(this.a, i, j, k, 4);
      e(block, i, j, k, k1);
      if (cfgGrassFix && k1 == 3 && this.e < 0) {
        tessellator.a(f12 * f, f15 * f1, f18 * f2);
        e(block, i, j, k, 38);
      } 
      flag = true;
    } 
    if (this.g || block.a_(this.a, i + 1, j, k, 5)) {
      tessellator.b((block.bU >= 1.0D) ? block.e(this.a, i + 1, j, k) : l);
      tessellator.a(f12, f15, f18);
      int l1 = block.a(this.a, i, j, k, 5);
      f(block, i, j, k, l1);
      if (cfgGrassFix && l1 == 3 && this.e < 0) {
        tessellator.a(f12 * f, f15 * f1, f18 * f2);
        f(block, i, j, k, 38);
      } 
      flag = true;
    } 
    return flag;
  }
  
  public boolean p(yy block, int i, int j, int k) {
    int l = block.a(this.a, i, j, k);
    float f = (l >> 16 & 0xFF) / 255.0F;
    float f1 = (l >> 8 & 0xFF) / 255.0F;
    float f2 = (l & 0xFF) / 255.0F;
    if (adt.a) {
      float f3 = (f * 30.0F + f1 * 59.0F + f2 * 11.0F) / 100.0F;
      float f4 = (f * 30.0F + f1 * 70.0F) / 100.0F;
      float f5 = (f * 30.0F + f2 * 70.0F) / 100.0F;
      f = f3;
      f1 = f4;
      f2 = f5;
    } 
    return c(block, i, j, k, f, f1, f2);
  }
  
  public boolean c(yy block, int i, int j, int k, float f, float f1, float f2) {
    cv tessellator = cv.a;
    boolean flag = false;
    float f3 = 0.5F;
    float f4 = 1.0F;
    float f5 = 0.8F;
    float f6 = 0.6F;
    float f7 = f3 * f;
    float f8 = f4 * f;
    float f9 = f5 * f;
    float f10 = f6 * f;
    float f11 = f3 * f1;
    float f12 = f4 * f1;
    float f13 = f5 * f1;
    float f14 = f6 * f1;
    float f15 = f3 * f2;
    float f16 = f4 * f2;
    float f17 = f5 * f2;
    float f18 = f6 * f2;
    float f19 = 0.0625F;
    int l = block.e(this.a, i, j, k);
    if (this.g || block.a_(this.a, i, j - 1, k, 0)) {
      tessellator.b((block.bS <= 0.0D) ? block.e(this.a, i, j - 1, k) : l);
      tessellator.a(f7, f11, f15);
      a(block, i, j, k, block.a(this.a, i, j, k, 0));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j + 1, k, 1)) {
      tessellator.b((block.bV >= 1.0D) ? block.e(this.a, i, j + 1, k) : l);
      tessellator.a(f8, f12, f16);
      b(block, i, j, k, block.a(this.a, i, j, k, 1));
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k - 1, 2)) {
      tessellator.b((block.bT <= 0.0D) ? block.e(this.a, i, j, k - 1) : l);
      tessellator.a(f9, f13, f17);
      tessellator.c(0.0F, 0.0F, f19);
      c(block, i, j, k, block.a(this.a, i, j, k, 2));
      tessellator.c(0.0F, 0.0F, -f19);
      flag = true;
    } 
    if (this.g || block.a_(this.a, i, j, k + 1, 3)) {
      tessellator.b((block.bW >= 1.0D) ? block.e(this.a, i, j, k + 1) : l);
      tessellator.a(f9, f13, f17);
      tessellator.c(0.0F, 0.0F, -f19);
      d(block, i, j, k, block.a(this.a, i, j, k, 3));
      tessellator.c(0.0F, 0.0F, f19);
      flag = true;
    } 
    if (this.g || block.a_(this.a, i - 1, j, k, 4)) {
      tessellator.b((block.bR <= 0.0D) ? block.e(this.a, i - 1, j, k) : l);
      tessellator.a(f10, f14, f18);
      tessellator.c(f19, 0.0F, 0.0F);
      e(block, i, j, k, block.a(this.a, i, j, k, 4));
      tessellator.c(-f19, 0.0F, 0.0F);
      flag = true;
    } 
    if (this.g || block.a_(this.a, i + 1, j, k, 5)) {
      tessellator.b((block.bU >= 1.0D) ? block.e(this.a, i + 1, j, k) : l);
      tessellator.a(f10, f14, f18);
      tessellator.c(-f19, 0.0F, 0.0F);
      f(block, i, j, k, block.a(this.a, i, j, k, 5));
      tessellator.c(f19, 0.0F, 0.0F);
      flag = true;
    } 
    return flag;
  }
  
  public boolean a(nz blockfence, int i, int j, int k) {
    boolean flag = false;
    float f = 0.375F;
    float f1 = 0.625F;
    blockfence.a(f, 0.0F, f, f1, 1.0F, f1);
    o(blockfence, i, j, k);
    flag = true;
    boolean flag1 = false;
    boolean flag2 = false;
    if (blockfence.c(this.a, i - 1, j, k) || blockfence.c(this.a, i + 1, j, k))
      flag1 = true; 
    if (blockfence.c(this.a, i, j, k - 1) || blockfence.c(this.a, i, j, k + 1))
      flag2 = true; 
    boolean flag3 = blockfence.c(this.a, i - 1, j, k);
    boolean flag4 = blockfence.c(this.a, i + 1, j, k);
    boolean flag5 = blockfence.c(this.a, i, j, k - 1);
    boolean flag6 = blockfence.c(this.a, i, j, k + 1);
    if (!flag1 && !flag2)
      flag1 = true; 
    f = 0.4375F;
    f1 = 0.5625F;
    float f2 = 0.75F;
    float f3 = 0.9375F;
    float f4 = flag3 ? 0.0F : f;
    float f5 = flag4 ? 1.0F : f1;
    float f6 = flag5 ? 0.0F : f;
    float f7 = flag6 ? 1.0F : f1;
    if (flag1) {
      blockfence.a(f4, f2, f, f5, f3, f1);
      o(blockfence, i, j, k);
      flag = true;
    } 
    if (flag2) {
      blockfence.a(f, f2, f6, f1, f3, f7);
      o(blockfence, i, j, k);
      flag = true;
    } 
    f2 = 0.375F;
    f3 = 0.5625F;
    if (flag1) {
      blockfence.a(f4, f2, f, f5, f3, f1);
      o(blockfence, i, j, k);
      flag = true;
    } 
    if (flag2) {
      blockfence.a(f, f2, f6, f1, f3, f7);
      o(blockfence, i, j, k);
      flag = true;
    } 
    blockfence.b(this.a, i, j, k);
    return flag;
  }
  
  public boolean a(aci blockdragonegg, int i, int j, int k) {
    boolean flag = false;
    int l = 0;
    for (int i1 = 0; i1 < 8; i1++) {
      int j1 = 0;
      byte byte0 = 1;
      if (i1 == 0)
        j1 = 2; 
      if (i1 == 1)
        j1 = 3; 
      if (i1 == 2)
        j1 = 4; 
      if (i1 == 3) {
        j1 = 5;
        byte0 = 2;
      } 
      if (i1 == 4) {
        j1 = 6;
        byte0 = 3;
      } 
      if (i1 == 5) {
        j1 = 7;
        byte0 = 5;
      } 
      if (i1 == 6) {
        j1 = 6;
        byte0 = 2;
      } 
      if (i1 == 7)
        j1 = 3; 
      float f = j1 / 16.0F;
      float f1 = 1.0F - l / 16.0F;
      float f2 = 1.0F - (l + byte0) / 16.0F;
      l += byte0;
      blockdragonegg.a(0.5F - f, f2, 0.5F - f, 0.5F + f, f1, 0.5F + f);
      o((yy)blockdragonegg, i, j, k);
    } 
    flag = true;
    blockdragonegg.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    return flag;
  }
  
  public boolean a(fp blockfencegate, int i, int j, int k) {
    boolean flag = true;
    int l = this.a.d(i, j, k);
    boolean flag1 = fp.b_(l);
    int i1 = fp.d(l);
    if (i1 != 3 && i1 != 1) {
      float f = 0.0F;
      float f8 = 0.125F;
      float f4 = 0.4375F;
      float f12 = 0.5625F;
      blockfencegate.a(f, 0.3125F, f4, f8, 1.0F, f12);
      o((yy)blockfencegate, i, j, k);
      f = 0.875F;
      f8 = 1.0F;
      blockfencegate.a(f, 0.3125F, f4, f8, 1.0F, f12);
      o((yy)blockfencegate, i, j, k);
    } else {
      float f1 = 0.4375F;
      float f9 = 0.5625F;
      float f5 = 0.0F;
      float f13 = 0.125F;
      blockfencegate.a(f1, 0.3125F, f5, f9, 1.0F, f13);
      o((yy)blockfencegate, i, j, k);
      f5 = 0.875F;
      f13 = 1.0F;
      blockfencegate.a(f1, 0.3125F, f5, f9, 1.0F, f13);
      o((yy)blockfencegate, i, j, k);
    } 
    if (!flag1) {
      if (i1 != 3 && i1 != 1) {
        float f2 = 0.375F;
        float f10 = 0.5F;
        float f6 = 0.4375F;
        float f14 = 0.5625F;
        blockfencegate.a(f2, 0.375F, f6, f10, 0.9375F, f14);
        o((yy)blockfencegate, i, j, k);
        f2 = 0.5F;
        f10 = 0.625F;
        blockfencegate.a(f2, 0.375F, f6, f10, 0.9375F, f14);
        o((yy)blockfencegate, i, j, k);
        f2 = 0.625F;
        f10 = 0.875F;
        blockfencegate.a(f2, 0.375F, f6, f10, 0.5625F, f14);
        o((yy)blockfencegate, i, j, k);
        blockfencegate.a(f2, 0.75F, f6, f10, 0.9375F, f14);
        o((yy)blockfencegate, i, j, k);
        f2 = 0.125F;
        f10 = 0.375F;
        blockfencegate.a(f2, 0.375F, f6, f10, 0.5625F, f14);
        o((yy)blockfencegate, i, j, k);
        blockfencegate.a(f2, 0.75F, f6, f10, 0.9375F, f14);
        o((yy)blockfencegate, i, j, k);
      } else {
        float f3 = 0.4375F;
        float f11 = 0.5625F;
        float f7 = 0.375F;
        float f15 = 0.5F;
        blockfencegate.a(f3, 0.375F, f7, f11, 0.9375F, f15);
        o((yy)blockfencegate, i, j, k);
        f7 = 0.5F;
        f15 = 0.625F;
        blockfencegate.a(f3, 0.375F, f7, f11, 0.9375F, f15);
        o((yy)blockfencegate, i, j, k);
        f7 = 0.625F;
        f15 = 0.875F;
        blockfencegate.a(f3, 0.375F, f7, f11, 0.5625F, f15);
        o((yy)blockfencegate, i, j, k);
        blockfencegate.a(f3, 0.75F, f7, f11, 0.9375F, f15);
        o((yy)blockfencegate, i, j, k);
        f7 = 0.125F;
        f15 = 0.375F;
        blockfencegate.a(f3, 0.375F, f7, f11, 0.5625F, f15);
        o((yy)blockfencegate, i, j, k);
        blockfencegate.a(f3, 0.75F, f7, f11, 0.9375F, f15);
        o((yy)blockfencegate, i, j, k);
      } 
    } else if (i1 == 3) {
      blockfencegate.a(0.8125F, 0.375F, 0.0F, 0.9375F, 0.9375F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.8125F, 0.375F, 0.875F, 0.9375F, 0.9375F, 1.0F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.5625F, 0.375F, 0.0F, 0.8125F, 0.5625F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.5625F, 0.375F, 0.875F, 0.8125F, 0.5625F, 1.0F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.5625F, 0.75F, 0.0F, 0.8125F, 0.9375F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.5625F, 0.75F, 0.875F, 0.8125F, 0.9375F, 1.0F);
      o((yy)blockfencegate, i, j, k);
    } else if (i1 == 1) {
      blockfencegate.a(0.0625F, 0.375F, 0.0F, 0.1875F, 0.9375F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.0625F, 0.375F, 0.875F, 0.1875F, 0.9375F, 1.0F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.1875F, 0.375F, 0.0F, 0.4375F, 0.5625F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.1875F, 0.375F, 0.875F, 0.4375F, 0.5625F, 1.0F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.1875F, 0.75F, 0.0F, 0.4375F, 0.9375F, 0.125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.1875F, 0.75F, 0.875F, 0.4375F, 0.9375F, 1.0F);
      o((yy)blockfencegate, i, j, k);
    } else if (i1 == 0) {
      blockfencegate.a(0.0F, 0.375F, 0.8125F, 0.125F, 0.9375F, 0.9375F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.375F, 0.8125F, 1.0F, 0.9375F, 0.9375F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.0F, 0.375F, 0.5625F, 0.125F, 0.5625F, 0.8125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.375F, 0.5625F, 1.0F, 0.5625F, 0.8125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.0F, 0.75F, 0.5625F, 0.125F, 0.9375F, 0.8125F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.75F, 0.5625F, 1.0F, 0.9375F, 0.8125F);
      o((yy)blockfencegate, i, j, k);
    } else if (i1 == 2) {
      blockfencegate.a(0.0F, 0.375F, 0.0625F, 0.125F, 0.9375F, 0.1875F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.375F, 0.0625F, 1.0F, 0.9375F, 0.1875F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.0F, 0.375F, 0.1875F, 0.125F, 0.5625F, 0.4375F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.375F, 0.1875F, 1.0F, 0.5625F, 0.4375F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.0F, 0.75F, 0.1875F, 0.125F, 0.9375F, 0.4375F);
      o((yy)blockfencegate, i, j, k);
      blockfencegate.a(0.875F, 0.75F, 0.1875F, 1.0F, 0.9375F, 0.4375F);
      o((yy)blockfencegate, i, j, k);
    } 
    blockfencegate.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    return flag;
  }
  
  public boolean q(yy block, int i, int j, int k) {
    boolean flag = false;
    int l = this.a.d(i, j, k);
    if (l == 0) {
      block.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
      o(block, i, j, k);
      block.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      o(block, i, j, k);
      flag = true;
    } else if (l == 1) {
      block.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
      o(block, i, j, k);
      block.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      o(block, i, j, k);
      flag = true;
    } else if (l == 2) {
      block.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
      o(block, i, j, k);
      block.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
      o(block, i, j, k);
      flag = true;
    } else if (l == 3) {
      block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
      o(block, i, j, k);
      block.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
      o(block, i, j, k);
      flag = true;
    } 
    block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    return flag;
  }
  
  public boolean r(yy block, int i, int j, int k) {
    cv tessellator = cv.a;
    uc blockdoor = (uc)block;
    boolean flag = false;
    float f = 0.5F;
    float f1 = 1.0F;
    float f2 = 0.8F;
    float f3 = 0.6F;
    int l = block.e(this.a, i, j, k);
    tessellator.b((block.bS <= 0.0D) ? block.e(this.a, i, j - 1, k) : l);
    tessellator.a(f, f, f);
    a(block, i, j, k, block.a(this.a, i, j, k, 0));
    flag = true;
    tessellator.b((block.bV >= 1.0D) ? block.e(this.a, i, j + 1, k) : l);
    tessellator.a(f1, f1, f1);
    b(block, i, j, k, block.a(this.a, i, j, k, 1));
    flag = true;
    tessellator.b((block.bT <= 0.0D) ? block.e(this.a, i, j, k - 1) : l);
    tessellator.a(f2, f2, f2);
    int i1 = block.a(this.a, i, j, k, 2);
    if (i1 < 0) {
      this.f = true;
      i1 = -i1;
    } 
    c(block, i, j, k, i1);
    flag = true;
    this.f = false;
    tessellator.b((block.bW >= 1.0D) ? block.e(this.a, i, j, k + 1) : l);
    tessellator.a(f2, f2, f2);
    i1 = block.a(this.a, i, j, k, 3);
    if (i1 < 0) {
      this.f = true;
      i1 = -i1;
    } 
    d(block, i, j, k, i1);
    flag = true;
    this.f = false;
    tessellator.b((block.bR <= 0.0D) ? block.e(this.a, i - 1, j, k) : l);
    tessellator.a(f3, f3, f3);
    i1 = block.a(this.a, i, j, k, 4);
    if (i1 < 0) {
      this.f = true;
      i1 = -i1;
    } 
    e(block, i, j, k, i1);
    flag = true;
    this.f = false;
    tessellator.b((block.bU >= 1.0D) ? block.e(this.a, i + 1, j, k) : l);
    tessellator.a(f3, f3, f3);
    i1 = block.a(this.a, i, j, k, 5);
    if (i1 < 0) {
      this.f = true;
      i1 = -i1;
    } 
    f(block, i, j, k, i1);
    flag = true;
    this.f = false;
    return flag;
  }
  
  public void a(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bR * 16.0D) / 256.0D;
    double d4 = (j + block.bU * 16.0D - 0.01D) / 256.0D;
    double d5 = (k + block.bT * 16.0D) / 256.0D;
    double d6 = (k + block.bW * 16.0D - 0.01D) / 256.0D;
    if (block.bR < 0.0D || block.bU > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bT < 0.0D || block.bW > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d7 = d4;
    double d8 = d3;
    double d9 = d5;
    double d10 = d6;
    if (this.m == 2) {
      d3 = (j + block.bT * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bU * 16.0D) / 256.0D;
      d4 = (j + block.bW * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bR * 16.0D) / 256.0D;
      d9 = d5;
      d10 = d6;
      d7 = d3;
      d8 = d4;
      d5 = d6;
      d6 = d9;
    } else if (this.m == 1) {
      d3 = ((j + 16) - block.bW * 16.0D) / 256.0D;
      d5 = (k + block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bT * 16.0D) / 256.0D;
      d6 = (k + block.bU * 16.0D) / 256.0D;
      d7 = d4;
      d8 = d3;
      d3 = d4;
      d4 = d8;
      d9 = d6;
      d10 = d5;
    } else if (this.m == 3) {
      d3 = ((j + 16) - block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bU * 16.0D - 0.01D) / 256.0D;
      d5 = ((k + 16) - block.bT * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bW * 16.0D - 0.01D) / 256.0D;
      d7 = d4;
      d8 = d3;
      d9 = d5;
      d10 = d6;
    } 
    double d11 = d + block.bR;
    double d12 = d + block.bU;
    double d13 = d1 + block.bS;
    double d14 = d2 + block.bT;
    double d15 = d2 + block.bW;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d11, d13, d15, d8, d10);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d11, d13, d14, d3, d5);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d12, d13, d14, d7, d9);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d12, d13, d15, d4, d6);
    } else {
      tessellator.a(d11, d13, d15, d8, d10);
      tessellator.a(d11, d13, d14, d3, d5);
      tessellator.a(d12, d13, d14, d7, d9);
      tessellator.a(d12, d13, d15, d4, d6);
    } 
  }
  
  public void b(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bR * 16.0D) / 256.0D;
    double d4 = (j + block.bU * 16.0D - 0.01D) / 256.0D;
    double d5 = (k + block.bT * 16.0D) / 256.0D;
    double d6 = (k + block.bW * 16.0D - 0.01D) / 256.0D;
    if (block.bR < 0.0D || block.bU > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bT < 0.0D || block.bW > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d7 = d4;
    double d8 = d3;
    double d9 = d5;
    double d10 = d6;
    if (this.l == 1) {
      d3 = (j + block.bT * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bU * 16.0D) / 256.0D;
      d4 = (j + block.bW * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bR * 16.0D) / 256.0D;
      d9 = d5;
      d10 = d6;
      d7 = d3;
      d8 = d4;
      d5 = d6;
      d6 = d9;
    } else if (this.l == 2) {
      d3 = ((j + 16) - block.bW * 16.0D) / 256.0D;
      d5 = (k + block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bT * 16.0D) / 256.0D;
      d6 = (k + block.bU * 16.0D) / 256.0D;
      d7 = d4;
      d8 = d3;
      d3 = d4;
      d4 = d8;
      d9 = d6;
      d10 = d5;
    } else if (this.l == 3) {
      d3 = ((j + 16) - block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bU * 16.0D - 0.01D) / 256.0D;
      d5 = ((k + 16) - block.bT * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bW * 16.0D - 0.01D) / 256.0D;
      d7 = d4;
      d8 = d3;
      d9 = d5;
      d10 = d6;
    } 
    double d11 = d + block.bR;
    double d12 = d + block.bU;
    double d13 = d1 + block.bV;
    double d14 = d2 + block.bT;
    double d15 = d2 + block.bW;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d12, d13, d15, d4, d6);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d12, d13, d14, d7, d9);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d11, d13, d14, d3, d5);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d11, d13, d15, d8, d10);
    } else {
      tessellator.a(d12, d13, d15, d4, d6);
      tessellator.a(d12, d13, d14, d7, d9);
      tessellator.a(d11, d13, d14, d3, d5);
      tessellator.a(d11, d13, d15, d8, d10);
    } 
  }
  
  public void c(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bR * 16.0D) / 256.0D;
    double d4 = (j + block.bU * 16.0D - 0.01D) / 256.0D;
    double d5 = ((k + 16) - block.bV * 16.0D) / 256.0D;
    double d6 = ((k + 16) - block.bS * 16.0D - 0.01D) / 256.0D;
    if (this.f) {
      double d7 = d3;
      d3 = d4;
      d4 = d7;
    } 
    if (block.bR < 0.0D || block.bU > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bS < 0.0D || block.bV > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d8 = d4;
    double d9 = d3;
    double d10 = d5;
    double d11 = d6;
    if (this.h == 2) {
      d3 = (j + block.bS * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bR * 16.0D) / 256.0D;
      d4 = (j + block.bV * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bU * 16.0D) / 256.0D;
      d10 = d5;
      d11 = d6;
      d8 = d3;
      d9 = d4;
      d5 = d6;
      d6 = d10;
    } else if (this.h == 1) {
      d3 = ((j + 16) - block.bV * 16.0D) / 256.0D;
      d5 = (k + block.bU * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bS * 16.0D) / 256.0D;
      d6 = (k + block.bR * 16.0D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d3 = d4;
      d4 = d9;
      d10 = d6;
      d11 = d5;
    } else if (this.h == 3) {
      d3 = ((j + 16) - block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bU * 16.0D - 0.01D) / 256.0D;
      d5 = (k + block.bV * 16.0D) / 256.0D;
      d6 = (k + block.bS * 16.0D - 0.01D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d10 = d5;
      d11 = d6;
    } 
    double d12 = d + block.bR;
    double d13 = d + block.bU;
    double d14 = d1 + block.bS;
    double d15 = d1 + block.bV;
    double d16 = d2 + block.bT;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d12, d15, d16, d8, d10);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d13, d15, d16, d3, d5);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d13, d14, d16, d9, d11);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d12, d14, d16, d4, d6);
    } else {
      tessellator.a(d12, d15, d16, d8, d10);
      tessellator.a(d13, d15, d16, d3, d5);
      tessellator.a(d13, d14, d16, d9, d11);
      tessellator.a(d12, d14, d16, d4, d6);
    } 
  }
  
  public void d(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bR * 16.0D) / 256.0D;
    double d4 = (j + block.bU * 16.0D - 0.01D) / 256.0D;
    double d5 = ((k + 16) - block.bV * 16.0D) / 256.0D;
    double d6 = ((k + 16) - block.bS * 16.0D - 0.01D) / 256.0D;
    if (this.f) {
      double d7 = d3;
      d3 = d4;
      d4 = d7;
    } 
    if (block.bR < 0.0D || block.bU > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bS < 0.0D || block.bV > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d8 = d4;
    double d9 = d3;
    double d10 = d5;
    double d11 = d6;
    if (this.i == 1) {
      d3 = (j + block.bS * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bR * 16.0D) / 256.0D;
      d4 = (j + block.bV * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bU * 16.0D) / 256.0D;
      d10 = d5;
      d11 = d6;
      d8 = d3;
      d9 = d4;
      d5 = d6;
      d6 = d10;
    } else if (this.i == 2) {
      d3 = ((j + 16) - block.bV * 16.0D) / 256.0D;
      d5 = (k + block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bS * 16.0D) / 256.0D;
      d6 = (k + block.bU * 16.0D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d3 = d4;
      d4 = d9;
      d10 = d6;
      d11 = d5;
    } else if (this.i == 3) {
      d3 = ((j + 16) - block.bR * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bU * 16.0D - 0.01D) / 256.0D;
      d5 = (k + block.bV * 16.0D) / 256.0D;
      d6 = (k + block.bS * 16.0D - 0.01D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d10 = d5;
      d11 = d6;
    } 
    double d12 = d + block.bR;
    double d13 = d + block.bU;
    double d14 = d1 + block.bS;
    double d15 = d1 + block.bV;
    double d16 = d2 + block.bW;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d12, d15, d16, d3, d5);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d12, d14, d16, d9, d11);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d13, d14, d16, d4, d6);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d13, d15, d16, d8, d10);
    } else {
      tessellator.a(d12, d15, d16, d3, d5);
      tessellator.a(d12, d14, d16, d9, d11);
      tessellator.a(d13, d14, d16, d4, d6);
      tessellator.a(d13, d15, d16, d8, d10);
    } 
  }
  
  public void e(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bT * 16.0D) / 256.0D;
    double d4 = (j + block.bW * 16.0D - 0.01D) / 256.0D;
    double d5 = ((k + 16) - block.bV * 16.0D) / 256.0D;
    double d6 = ((k + 16) - block.bS * 16.0D - 0.01D) / 256.0D;
    if (this.f) {
      double d7 = d3;
      d3 = d4;
      d4 = d7;
    } 
    if (block.bT < 0.0D || block.bW > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bS < 0.0D || block.bV > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d8 = d4;
    double d9 = d3;
    double d10 = d5;
    double d11 = d6;
    if (this.k == 1) {
      d3 = (j + block.bS * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bW * 16.0D) / 256.0D;
      d4 = (j + block.bV * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bT * 16.0D) / 256.0D;
      d10 = d5;
      d11 = d6;
      d8 = d3;
      d9 = d4;
      d5 = d6;
      d6 = d10;
    } else if (this.k == 2) {
      d3 = ((j + 16) - block.bV * 16.0D) / 256.0D;
      d5 = (k + block.bT * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bS * 16.0D) / 256.0D;
      d6 = (k + block.bW * 16.0D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d3 = d4;
      d4 = d9;
      d10 = d6;
      d11 = d5;
    } else if (this.k == 3) {
      d3 = ((j + 16) - block.bT * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bW * 16.0D - 0.01D) / 256.0D;
      d5 = (k + block.bV * 16.0D) / 256.0D;
      d6 = (k + block.bS * 16.0D - 0.01D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d10 = d5;
      d11 = d6;
    } 
    double d12 = d + block.bR;
    double d13 = d1 + block.bS;
    double d14 = d1 + block.bV;
    double d15 = d2 + block.bT;
    double d16 = d2 + block.bW;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d12, d14, d16, d8, d10);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d12, d14, d15, d3, d5);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d12, d13, d15, d9, d11);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d12, d13, d16, d4, d6);
    } else {
      tessellator.a(d12, d14, d16, d8, d10);
      tessellator.a(d12, d14, d15, d3, d5);
      tessellator.a(d12, d13, d15, d9, d11);
      tessellator.a(d12, d13, d16, d4, d6);
    } 
  }
  
  public void f(yy block, double d, double d1, double d2, int i) {
    cv tessellator = cv.a;
    if (this.e >= 0)
      i = this.e; 
    int j = (i & 0xF) << 4;
    int k = i & 0xF0;
    double d3 = (j + block.bT * 16.0D) / 256.0D;
    double d4 = (j + block.bW * 16.0D - 0.01D) / 256.0D;
    double d5 = ((k + 16) - block.bV * 16.0D) / 256.0D;
    double d6 = ((k + 16) - block.bS * 16.0D - 0.01D) / 256.0D;
    if (this.f) {
      double d7 = d3;
      d3 = d4;
      d4 = d7;
    } 
    if (block.bT < 0.0D || block.bW > 1.0D) {
      d3 = ((j + 0.0F) / 256.0F);
      d4 = ((j + 15.99F) / 256.0F);
    } 
    if (block.bS < 0.0D || block.bV > 1.0D) {
      d5 = ((k + 0.0F) / 256.0F);
      d6 = ((k + 15.99F) / 256.0F);
    } 
    double d8 = d4;
    double d9 = d3;
    double d10 = d5;
    double d11 = d6;
    if (this.j == 2) {
      d3 = (j + block.bS * 16.0D) / 256.0D;
      d5 = ((k + 16) - block.bT * 16.0D) / 256.0D;
      d4 = (j + block.bV * 16.0D) / 256.0D;
      d6 = ((k + 16) - block.bW * 16.0D) / 256.0D;
      d10 = d5;
      d11 = d6;
      d8 = d3;
      d9 = d4;
      d5 = d6;
      d6 = d10;
    } else if (this.j == 1) {
      d3 = ((j + 16) - block.bV * 16.0D) / 256.0D;
      d5 = (k + block.bW * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bS * 16.0D) / 256.0D;
      d6 = (k + block.bT * 16.0D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d3 = d4;
      d4 = d9;
      d10 = d6;
      d11 = d5;
    } else if (this.j == 3) {
      d3 = ((j + 16) - block.bT * 16.0D) / 256.0D;
      d4 = ((j + 16) - block.bW * 16.0D - 0.01D) / 256.0D;
      d5 = (k + block.bV * 16.0D) / 256.0D;
      d6 = (k + block.bS * 16.0D - 0.01D) / 256.0D;
      d8 = d4;
      d9 = d3;
      d10 = d5;
      d11 = d6;
    } 
    double d12 = d + block.bU;
    double d13 = d1 + block.bS;
    double d14 = d1 + block.bV;
    double d15 = d2 + block.bT;
    double d16 = d2 + block.bW;
    if (this.n) {
      tessellator.a(this.ao, this.as, this.aw);
      tessellator.b(this.ak);
      tessellator.a(d12, d13, d16, d9, d11);
      tessellator.a(this.ap, this.at, this.ax);
      tessellator.b(this.al);
      tessellator.a(d12, d13, d15, d4, d6);
      tessellator.a(this.aq, this.au, this.ay);
      tessellator.b(this.am);
      tessellator.a(d12, d14, d15, d8, d10);
      tessellator.a(this.ar, this.av, this.az);
      tessellator.b(this.an);
      tessellator.a(d12, d14, d16, d3, d5);
    } else {
      tessellator.a(d12, d13, d16, d9, d11);
      tessellator.a(d12, d13, d15, d4, d6);
      tessellator.a(d12, d14, d15, d8, d10);
      tessellator.a(d12, d14, d16, d3, d5);
    } 
  }
  
  public void a(yy block, int i, float f) {
    cv tessellator = cv.a;
    boolean flag = (block.bM == yy.u.bM);
    if (this.c) {
      int j = block.c(i);
      if (flag)
        j = 16777215; 
      float f1 = (j >> 16 & 0xFF) / 255.0F;
      float f3 = (j >> 8 & 0xFF) / 255.0F;
      float f7 = (j & 0xFF) / 255.0F;
      GL11.glColor4f(f1 * f, f3 * f, f7 * f, 1.0F);
    } 
    int k = block.c();
    if (k != 0 && k != 16) {
      if (k == 1) {
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        a(block, i, -0.5D, -0.5D, -0.5D);
        tessellator.a();
      } else if (k == 19) {
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        block.e();
        a(block, i, block.bV, -0.5D, -0.5D, -0.5D);
        tessellator.a();
      } else if (k == 23) {
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        block.e();
        tessellator.a();
      } else if (k == 13) {
        block.e();
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        float f2 = 0.0625F;
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        a(block, 0.0D, 0.0D, 0.0D, block.b(0));
        tessellator.a();
        tessellator.b();
        tessellator.b(0.0F, 1.0F, 0.0F);
        b(block, 0.0D, 0.0D, 0.0D, block.b(1));
        tessellator.a();
        tessellator.b();
        tessellator.b(0.0F, 0.0F, -1.0F);
        tessellator.c(0.0F, 0.0F, f2);
        c(block, 0.0D, 0.0D, 0.0D, block.b(2));
        tessellator.c(0.0F, 0.0F, -f2);
        tessellator.a();
        tessellator.b();
        tessellator.b(0.0F, 0.0F, 1.0F);
        tessellator.c(0.0F, 0.0F, -f2);
        d(block, 0.0D, 0.0D, 0.0D, block.b(3));
        tessellator.c(0.0F, 0.0F, f2);
        tessellator.a();
        tessellator.b();
        tessellator.b(-1.0F, 0.0F, 0.0F);
        tessellator.c(f2, 0.0F, 0.0F);
        e(block, 0.0D, 0.0D, 0.0D, block.b(4));
        tessellator.c(-f2, 0.0F, 0.0F);
        tessellator.a();
        tessellator.b();
        tessellator.b(1.0F, 0.0F, 0.0F);
        tessellator.c(-f2, 0.0F, 0.0F);
        f(block, 0.0D, 0.0D, 0.0D, block.b(5));
        tessellator.c(f2, 0.0F, 0.0F);
        tessellator.a();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      } else if (k == 22) {
        acl.a.a(block, i, f);
        GL11.glEnable(32826);
      } else if (k == 6) {
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        b(block, i, -0.5D, -0.5D, -0.5D);
        tessellator.a();
      } else if (k == 2) {
        tessellator.b();
        tessellator.b(0.0F, -1.0F, 0.0F);
        a(block, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D);
        tessellator.a();
      } else if (k == 10) {
        for (int l = 0; l < 2; l++) {
          if (l == 0)
            block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F); 
          if (l == 1)
            block.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F); 
          GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
          tessellator.b();
          tessellator.b(0.0F, -1.0F, 0.0F);
          a(block, 0.0D, 0.0D, 0.0D, block.b(0));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 1.0F, 0.0F);
          b(block, 0.0D, 0.0D, 0.0D, block.b(1));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, -1.0F);
          c(block, 0.0D, 0.0D, 0.0D, block.b(2));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, 1.0F);
          d(block, 0.0D, 0.0D, 0.0D, block.b(3));
          tessellator.a();
          tessellator.b();
          tessellator.b(-1.0F, 0.0F, 0.0F);
          e(block, 0.0D, 0.0D, 0.0D, block.b(4));
          tessellator.a();
          tessellator.b();
          tessellator.b(1.0F, 0.0F, 0.0F);
          f(block, 0.0D, 0.0D, 0.0D, block.b(5));
          tessellator.a();
          GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        } 
      } else if (k == 27) {
        int i1 = 0;
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        tessellator.b();
        for (int i2 = 0; i2 < 8; i2++) {
          int j2 = 0;
          byte byte0 = 1;
          if (i2 == 0)
            j2 = 2; 
          if (i2 == 1)
            j2 = 3; 
          if (i2 == 2)
            j2 = 4; 
          if (i2 == 3) {
            j2 = 5;
            byte0 = 2;
          } 
          if (i2 == 4) {
            j2 = 6;
            byte0 = 3;
          } 
          if (i2 == 5) {
            j2 = 7;
            byte0 = 5;
          } 
          if (i2 == 6) {
            j2 = 6;
            byte0 = 2;
          } 
          if (i2 == 7)
            j2 = 3; 
          float f10 = j2 / 16.0F;
          float f11 = 1.0F - i1 / 16.0F;
          float f12 = 1.0F - (i1 + byte0) / 16.0F;
          i1 += byte0;
          block.a(0.5F - f10, f12, 0.5F - f10, 0.5F + f10, f11, 0.5F + f10);
          tessellator.b(0.0F, -1.0F, 0.0F);
          a(block, 0.0D, 0.0D, 0.0D, block.b(0));
          tessellator.b(0.0F, 1.0F, 0.0F);
          b(block, 0.0D, 0.0D, 0.0D, block.b(1));
          tessellator.b(0.0F, 0.0F, -1.0F);
          c(block, 0.0D, 0.0D, 0.0D, block.b(2));
          tessellator.b(0.0F, 0.0F, 1.0F);
          d(block, 0.0D, 0.0D, 0.0D, block.b(3));
          tessellator.b(-1.0F, 0.0F, 0.0F);
          e(block, 0.0D, 0.0D, 0.0D, block.b(4));
          tessellator.b(1.0F, 0.0F, 0.0F);
          f(block, 0.0D, 0.0D, 0.0D, block.b(5));
        } 
        tessellator.a();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else if (k == 11) {
        for (int j1 = 0; j1 < 4; j1++) {
          float f4 = 0.125F;
          if (j1 == 0)
            block.a(0.5F - f4, 0.0F, 0.0F, 0.5F + f4, 1.0F, f4 * 2.0F); 
          if (j1 == 1)
            block.a(0.5F - f4, 0.0F, 1.0F - f4 * 2.0F, 0.5F + f4, 1.0F, 1.0F); 
          f4 = 0.0625F;
          if (j1 == 2)
            block.a(0.5F - f4, 1.0F - f4 * 3.0F, -f4 * 2.0F, 0.5F + f4, 1.0F - f4, 1.0F + f4 * 2.0F); 
          if (j1 == 3)
            block.a(0.5F - f4, 0.5F - f4 * 3.0F, -f4 * 2.0F, 0.5F + f4, 0.5F - f4, 1.0F + f4 * 2.0F); 
          GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
          tessellator.b();
          tessellator.b(0.0F, -1.0F, 0.0F);
          a(block, 0.0D, 0.0D, 0.0D, block.b(0));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 1.0F, 0.0F);
          b(block, 0.0D, 0.0D, 0.0D, block.b(1));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, -1.0F);
          c(block, 0.0D, 0.0D, 0.0D, block.b(2));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, 1.0F);
          d(block, 0.0D, 0.0D, 0.0D, block.b(3));
          tessellator.a();
          tessellator.b();
          tessellator.b(-1.0F, 0.0F, 0.0F);
          e(block, 0.0D, 0.0D, 0.0D, block.b(4));
          tessellator.a();
          tessellator.b();
          tessellator.b(1.0F, 0.0F, 0.0F);
          f(block, 0.0D, 0.0D, 0.0D, block.b(5));
          tessellator.a();
          GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        } 
        block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else if (k == 21) {
        for (int k1 = 0; k1 < 3; k1++) {
          float f5 = 0.0625F;
          if (k1 == 0)
            block.a(0.5F - f5, 0.3F, 0.0F, 0.5F + f5, 1.0F, f5 * 2.0F); 
          if (k1 == 1)
            block.a(0.5F - f5, 0.3F, 1.0F - f5 * 2.0F, 0.5F + f5, 1.0F, 1.0F); 
          f5 = 0.0625F;
          if (k1 == 2)
            block.a(0.5F - f5, 0.5F, 0.0F, 0.5F + f5, 1.0F - f5, 1.0F); 
          GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
          tessellator.b();
          tessellator.b(0.0F, -1.0F, 0.0F);
          a(block, 0.0D, 0.0D, 0.0D, block.b(0));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 1.0F, 0.0F);
          b(block, 0.0D, 0.0D, 0.0D, block.b(1));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, -1.0F);
          c(block, 0.0D, 0.0D, 0.0D, block.b(2));
          tessellator.a();
          tessellator.b();
          tessellator.b(0.0F, 0.0F, 1.0F);
          d(block, 0.0D, 0.0D, 0.0D, block.b(3));
          tessellator.a();
          tessellator.b();
          tessellator.b(-1.0F, 0.0F, 0.0F);
          e(block, 0.0D, 0.0D, 0.0D, block.b(4));
          tessellator.a();
          tessellator.b();
          tessellator.b(1.0F, 0.0F, 0.0F);
          f(block, 0.0D, 0.0D, 0.0D, block.b(5));
          tessellator.a();
          GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        } 
        block.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
        ModLoader.RenderInvBlock(this, block, i, k);
      } 
    } else {
      if (k == 16)
        i = 1; 
      block.e();
      GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
      tessellator.b();
      tessellator.b(0.0F, -1.0F, 0.0F);
      a(block, 0.0D, 0.0D, 0.0D, block.a(0, i));
      tessellator.a();
      if (flag && this.c) {
        int l1 = block.c(i);
        float f6 = (l1 >> 16 & 0xFF) / 255.0F;
        float f8 = (l1 >> 8 & 0xFF) / 255.0F;
        float f9 = (l1 & 0xFF) / 255.0F;
        GL11.glColor4f(f6 * f, f8 * f, f9 * f, 1.0F);
      } 
      tessellator.b();
      tessellator.b(0.0F, 1.0F, 0.0F);
      b(block, 0.0D, 0.0D, 0.0D, block.a(1, i));
      tessellator.a();
      if (flag && this.c)
        GL11.glColor4f(f, f, f, 1.0F); 
      tessellator.b();
      tessellator.b(0.0F, 0.0F, -1.0F);
      c(block, 0.0D, 0.0D, 0.0D, block.a(2, i));
      tessellator.a();
      tessellator.b();
      tessellator.b(0.0F, 0.0F, 1.0F);
      d(block, 0.0D, 0.0D, 0.0D, block.a(3, i));
      tessellator.a();
      tessellator.b();
      tessellator.b(-1.0F, 0.0F, 0.0F);
      e(block, 0.0D, 0.0D, 0.0D, block.a(4, i));
      tessellator.a();
      tessellator.b();
      tessellator.b(1.0F, 0.0F, 0.0F);
      f(block, 0.0D, 0.0D, 0.0D, block.a(5, i));
      tessellator.a();
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    } 
  }
  
  public static boolean a(int i) {
    return (i != 0) ? ((i != 13) ? ((i != 10) ? ((i != 11) ? ((i != 27) ? ((i != 22) ? ((i != 21) ? ModLoader.RenderBlockIsItemFull3D(i) : true) : true) : true) : true) : true) : true) : true;
  }
}
