import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class qd extends ht {
  private static iw d = new iw();
  
  private List e;
  
  private Random f;
  
  private Minecraft g;
  
  public String a;
  
  private int h;
  
  private String j;
  
  private int k;
  
  private boolean l;
  
  public float b;
  
  float c;
  
  public qd(Minecraft minecraft) {
    this.e = new ArrayList();
    this.f = new Random();
    this.a = null;
    this.h = 0;
    this.j = "";
    this.k = 0;
    this.l = false;
    this.c = 1.0F;
    this.g = minecraft;
  }
  
  public void a(float f, boolean flag, int i, int j) {
    ef scaledresolution = new ef(this.g.A, this.g.d, this.g.e);
    int k = scaledresolution.a();
    int l = scaledresolution.b();
    abe fontrenderer = this.g.q;
    this.g.u.b();
    GL11.glEnable(3042);
    if (Minecraft.s()) {
      a(this.g.h.b(f), k, l);
    } else {
      GL11.glBlendFunc(770, 771);
    } 
    dk itemstack = this.g.h.by.e(3);
    if (this.g.A.E == 0 && itemstack != null && itemstack.c == yy.ba.bM)
      a(k, l); 
    if (!this.g.h.a(abg.k)) {
      float f1 = this.g.h.cb + (this.g.h.ca - this.g.h.cb) * f;
      if (f1 > 0.0F)
        b(f1, k, l); 
    } 
    if (!this.g.c.i()) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, this.g.p.b("/gui/gui.png"));
      x inventoryplayer = this.g.h.by;
      this.i = -90.0F;
      b(k / 2 - 91, l - 22, 0, 0, 182, 22);
      b(k / 2 - 91 - 1 + inventoryplayer.c * 20, l - 22 - 1, 0, 22, 24, 22);
      GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(775, 769);
      b(k / 2 - 7, l / 2 - 7, 0, 0, 16, 16);
      GL11.glDisable(3042);
      boolean flag2 = (this.g.h.ac / 3 % 2 == 1);
      if (this.g.h.ac < 10)
        flag2 = false; 
      int i2 = this.g.h.ag();
      int j3 = this.g.h.aN;
      this.f.setSeed((this.h * 312871));
      boolean flag4 = false;
      eq foodstats = this.g.h.aO();
      int i5 = foodstats.a();
      int k5 = foodstats.b();
      c();
      if (this.g.c.a()) {
        int k6 = k / 2 - 91;
        int j7 = k / 2 + 91;
        int l7 = this.g.h.aN();
        int k8 = l - 39;
        int j9 = k8 - 10;
        if (((Boolean)mod_noBiomesX.XPSystem.get()).booleanValue()) {
          if (l7 > 0) {
            char c = '¶';
            int i9 = (int)(this.g.h.cf * (c + 1));
            int l9 = l - 32 + 3;
            b(k6, l9, 0, 64, c, 5);
            if (i9 > 0)
              b(k6, l9, 0, 69, i9, 5); 
          } 
        } else {
          k8 += 7;
          j9 += 7;
        } 
        int i10 = this.g.h.p();
        int j10 = -1;
        if (this.g.h.a(abg.l))
          j10 = this.h % 25; 
        for (int l10 = 0; l10 < 10; l10++) {
          if (i10 > 0)
            if (((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
              int k11 = k6 + l10 * 8;
              if (l10 * 2 + 1 < i10)
                b(k11, j9, 34, 9, 9, 9); 
              if (l10 * 2 + 1 == i10)
                b(k11, j9, 25, 9, 9, 9); 
              if (l10 * 2 + 1 > i10)
                b(k11, j9, 16, 9, 9, 9); 
            } else {
              int k11 = j7 - l10 * 8 - 9;
              if (l10 * 2 + 1 < i10)
                b(k11, k8, 34, 9, 9, 9); 
              if (l10 * 2 + 1 == i10)
                b(k11, k8, 25, 9, 9, 9); 
              if (l10 * 2 + 1 > i10)
                b(k11, k8, 16, 9, 9, 9); 
            }  
          int l11 = 16;
          if (this.g.h.a(abg.u))
            l11 += 36; 
          int k12 = 0;
          if (flag2)
            k12 = 1; 
          int j13 = k6 + l10 * 8;
          int k13 = k8;
          if (i2 <= 4)
            k13 += this.f.nextInt(2); 
          if (l10 == j10)
            k13 -= 2; 
          byte byte5 = 0;
          if (this.g.f.z().s())
            byte5 = 5; 
          b(j13, k13, 16 + k12 * 9, 9 * byte5, 9, 9);
          if (flag2) {
            if (l10 * 2 + 1 < j3)
              b(j13, k13, l11 + 54, 9 * byte5, 9, 9); 
            if (l10 * 2 + 1 == j3)
              b(j13, k13, l11 + 63, 9 * byte5, 9, 9); 
          } 
          if (l10 * 2 + 1 < i2)
            b(j13, k13, l11 + 36, 9 * byte5, 9, 9); 
          if (l10 * 2 + 1 == i2)
            b(j13, k13, l11 + 45, 9 * byte5, 9, 9); 
        } 
        if (((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue())
          for (int i11 = 0; i11 < 10; i11++) {
            int i12 = k8;
            int l12 = 16;
            byte byte4 = 0;
            if (this.g.h.a(abg.s)) {
              l12 += 36;
              byte4 = 13;
            } 
            if (this.g.h.aO().d() <= 0.0F && this.h % (i5 * 3 + 1) == 0)
              i12 += this.f.nextInt(3) - 1; 
            if (flag4)
              byte4 = 1; 
            int l13 = j7 - i11 * 8 - 9;
            b(l13, i12, 16 + byte4 * 9, 27, 9, 9);
            if (flag4) {
              if (i11 * 2 + 1 < k5)
                b(l13, i12, l12 + 54, 27, 9, 9); 
              if (i11 * 2 + 1 == k5)
                b(l13, i12, l12 + 63, 27, 9, 9); 
            } 
            if (i11 * 2 + 1 < i5)
              b(l13, i12, l12 + 36, 27, 9, 9); 
            if (i11 * 2 + 1 == i5)
              b(l13, i12, l12 + 45, 27, 9, 9); 
          }  
        if (this.g.h.a(p.g)) {
          int j11 = (int)Math.ceil((this.g.h.Z() - 2) * 10.0D / 300.0D);
          int j12 = (int)Math.ceil(this.g.h.Z() * 10.0D / 300.0D) - j11;
          for (int i13 = 0; i13 < j11 + j12; i13++) {
            if (((Boolean)mod_noBiomesX.HungerSystem.get()).booleanValue()) {
              if (i13 < j11) {
                b(j7 - i13 * 8 - 9, j9, 16, 18, 9, 9);
              } else {
                b(j7 - i13 * 8 - 9, j9, 25, 18, 9, 9);
              } 
            } else if (i13 < j11) {
              b(k6 + i13 * 8, j9, 16, 18, 9, 9);
            } else {
              b(k6 + i13 * 8, j9, 25, 18, 9, 9);
            } 
          } 
        } 
      } 
      GL11.glDisable(3042);
      GL11.glEnable(32826);
      rt.c();
      for (int l6 = 0; l6 < 9; l6++) {
        int k7 = k / 2 - 90 + l6 * 20 + 2;
        int i8 = l - 16 - 3;
        a(l6, k7, i8, f);
      } 
      rt.a();
      GL11.glDisable(32826);
    } 
    if (this.g.h.aL() > 0) {
      GL11.glDisable(2929);
      GL11.glDisable(3008);
      int i1 = this.g.h.aL();
      float f3 = i1 / 100.0F;
      if (f3 > 1.0F)
        f3 = 1.0F - (i1 - 100) / 10.0F; 
      int j2 = (int)(220.0F * f3) << 24 | 0x101020;
      a(0, 0, k, l, j2);
      GL11.glEnable(3008);
      GL11.glEnable(2929);
    } 
    if (this.g.c.e() && this.g.h.cd > 0) {
      boolean flag1 = false;
      int j1 = flag1 ? 16777215 : 8453920;
      String s = "" + this.g.h.cd;
      int k3 = (k - fontrenderer.a(s)) / 2;
      int l3 = l - 31 - 4;
      fontrenderer.b(s, k3 + 1, l3, 0);
      fontrenderer.b(s, k3 - 1, l3, 0);
      fontrenderer.b(s, k3, l3 + 1, 0);
      fontrenderer.b(s, k3, l3 - 1, 0);
      fontrenderer.b(s, k3, l3, j1);
    } 
    if (this.g.A.F) {
      GL11.glPushMatrix();
      if (Minecraft.J > 0L)
        GL11.glTranslatef(0.0F, 32.0F, 0.0F); 
      fontrenderer.a("Minecraft 1.0.0 (" + this.g.M + ")", 2, 2, 16777215);
      fontrenderer.a(this.g.m(), 2, 12, 16777215);
      fontrenderer.a(this.g.n(), 2, 22, 16777215);
      fontrenderer.a(this.g.p(), 2, 32, 16777215);
      fontrenderer.a(this.g.o(), 2, 42, 16777215);
      long l1 = Runtime.getRuntime().maxMemory();
      long l2 = Runtime.getRuntime().totalMemory();
      long l4 = Runtime.getRuntime().freeMemory();
      long l5 = l2 - l4;
      String s1 = "Used memory: " + (l5 * 100L / l1) + "% (" + (l5 / 1024L / 1024L) + "MB) of " + (l1 / 1024L / 1024L) + "MB";
      b(fontrenderer, s1, k - fontrenderer.a(s1) - 2, 2, 14737632);
      s1 = "Allocated memory: " + (l2 * 100L / l1) + "% (" + (l2 / 1024L / 1024L) + "MB)";
      b(fontrenderer, s1, k - fontrenderer.a(s1) - 2, 12, 14737632);
      b(fontrenderer, "x: " + this.g.h.s, 2, 64, 14737632);
      b(fontrenderer, "y: " + this.g.h.t, 2, 72, 14737632);
      b(fontrenderer, "z: " + this.g.h.u, 2, 80, 14737632);
      b(fontrenderer, "f: " + (me.c((this.g.h.y * 4.0F / 360.0F) + 0.5D) & 0x3), 2, 88, 14737632);
      b(fontrenderer, "Seed: " + this.g.f.t(), 2, 104, 14737632);
      OldBiomeGenBase currentBiome = this.g.f.a().oldGetBiomeGenAt((int)this.g.h.s, (int)this.g.h.u);
      b(fontrenderer, "Biome: " + currentBiome.biomeName, 2, 114, 14737632);
      b(fontrenderer, "Armor rating: " + this.g.h.p(), 2, 124, 14737632);
      GL11.glPopMatrix();
    } 
    if (this.k > 0) {
      float f2 = this.k - f;
      int k1 = (int)(f2 * 256.0F / 20.0F);
      if (k1 > 255)
        k1 = 255; 
      if (k1 > 0) {
        GL11.glPushMatrix();
        GL11.glTranslatef((k / 2), (l - 48), 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        int k2 = 16777215;
        if (this.l)
          k2 = Color.HSBtoRGB(f2 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF; 
        fontrenderer.b(this.j, -fontrenderer.a(this.j) / 2, -4, k2 + (k1 << 24));
        GL11.glDisable(3042);
        GL11.glPopMatrix();
      } 
    } 
    byte byte0 = 10;
    boolean flag3 = false;
    if (this.g.s instanceof gx) {
      byte0 = 20;
      flag3 = true;
    } 
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glDisable(3008);
    GL11.glPushMatrix();
    GL11.glTranslatef(0.0F, (l - 48), 0.0F);
    for (int i3 = 0; i3 < this.e.size() && i3 < byte0; i3++) {
      if (((ahe)this.e.get(i3)).b < 200 || flag3) {
        double d = ((ahe)this.e.get(i3)).b / 200.0D;
        d = 1.0D - d;
        d *= 10.0D;
        if (d < 0.0D)
          d = 0.0D; 
        if (d > 1.0D)
          d = 1.0D; 
        d *= d;
        int j4 = (int)(255.0D * d);
        if (flag3)
          j4 = 255; 
        if (j4 > 0) {
          byte byte1 = 2;
          int i6 = -i3 * 9;
          String s2 = ((ahe)this.e.get(i3)).a;
          a(byte1, i6 - 1, byte1 + 320, i6 + 8, j4 / 2 << 24);
          GL11.glEnable(3042);
          fontrenderer.a(s2, byte1, i6, 16777215 + (j4 << 24));
        } 
      } 
    } 
    GL11.glPopMatrix();
    if (this.g.h instanceof cx && this.g.A.y.e) {
      abp netclienthandler = ((cx)this.g.h).a;
      List<ao> list = netclienthandler.c;
      int i4 = netclienthandler.d;
      int k4 = i4;
      int j5 = 1;
      for (; k4 > 20; k4 = (i4 + j5 - 1) / j5)
        j5++; 
      int j6 = 300 / j5;
      if (j6 > 150)
        j6 = 150; 
      int i7 = (k - j5 * j6) / 2;
      byte byte2 = 10;
      a(i7 - 1, byte2 - 1, i7 + j6 * j5, byte2 + 9 * k4, -2147483648);
      for (int j8 = 0; j8 < i4; j8++) {
        int l8 = i7 + j8 % j5 * j6;
        int k9 = byte2 + j8 / j5 * 9;
        a(l8, k9, l8 + j6 - 1, k9 + 8, 553648127);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(3008);
        if (j8 < list.size()) {
          ao guisavinglevelstring = list.get(j8);
          fontrenderer.a(guisavinglevelstring.a, l8, k9, 16777215);
          this.g.p.b(this.g.p.b("/gui/icons.png"));
          int k10 = 0;
          byte byte3 = 0;
          k10 = 0;
          byte3 = 0;
          if (guisavinglevelstring.b < 0) {
            byte3 = 5;
          } else if (guisavinglevelstring.b < 150) {
            byte3 = 0;
          } else if (guisavinglevelstring.b < 300) {
            byte3 = 1;
          } else if (guisavinglevelstring.b < 600) {
            byte3 = 2;
          } else if (guisavinglevelstring.b < 1000) {
            byte3 = 3;
          } else {
            byte3 = 4;
          } 
          this.i += 100.0F;
          b(l8 + j6 - 12, k9, 0 + k10 * 10, 176 + byte3 * 8, 10, 8);
          this.i -= 100.0F;
        } 
      } 
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(2896);
    GL11.glEnable(3008);
  }
  
  private void c() {
    if (ado.a == null)
      return; 
    oo entitydragon = ado.a;
    ado.a = null;
    abe fontrenderer = this.g.q;
    ef scaledresolution = new ef(this.g.A, this.g.d, this.g.e);
    int i = scaledresolution.a();
    char c = '¶';
    int j = i / 2 - c / 2;
    int k = (int)(entitydragon.ax() / entitydragon.f_() * (c + 1));
    byte byte0 = 12;
    b(j, byte0, 0, 74, c, 5);
    b(j, byte0, 0, 74, c, 5);
    if (k > 0)
      b(j, byte0, 0, 79, k, 5); 
    String s = "Boss health";
    fontrenderer.a(s, i / 2 - fontrenderer.a(s) / 2, byte0 - 10, 16711935);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
  }
  
  private void a(int i, int j) {
    GL11.glDisable(2929);
    GL11.glDepthMask(false);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3008);
    GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/pumpkinblur.png"));
    cv tessellator = cv.a;
    tessellator.b();
    tessellator.a(0.0D, j, -90.0D, 0.0D, 1.0D);
    tessellator.a(i, j, -90.0D, 1.0D, 1.0D);
    tessellator.a(i, 0.0D, -90.0D, 1.0D, 0.0D);
    tessellator.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
    tessellator.a();
    GL11.glDepthMask(true);
    GL11.glEnable(2929);
    GL11.glEnable(3008);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void a(float f, int i, int j) {
    f = 1.0F - f;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    this.c = (float)(this.c + (f - this.c) * 0.01D);
    GL11.glDisable(2929);
    GL11.glDepthMask(false);
    GL11.glBlendFunc(0, 769);
    GL11.glColor4f(this.c, this.c, this.c, 1.0F);
    GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/vignette.png"));
    cv tessellator = cv.a;
    tessellator.b();
    tessellator.a(0.0D, j, -90.0D, 0.0D, 1.0D);
    tessellator.a(i, j, -90.0D, 1.0D, 1.0D);
    tessellator.a(i, 0.0D, -90.0D, 1.0D, 0.0D);
    tessellator.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
    tessellator.a();
    GL11.glDepthMask(true);
    GL11.glEnable(2929);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glBlendFunc(770, 771);
  }
  
  private void b(float f, int i, int j) {
    if (f < 1.0F) {
      f *= f;
      f *= f;
      f = f * 0.8F + 0.2F;
    } 
    GL11.glDisable(3008);
    GL11.glDisable(2929);
    GL11.glDepthMask(false);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
    GL11.glBindTexture(3553, this.g.p.b("/terrain.png"));
    float f1 = (yy.be.bL % 16) / 16.0F;
    float f2 = (yy.be.bL / 16) / 16.0F;
    float f3 = (yy.be.bL % 16 + 1) / 16.0F;
    float f4 = (yy.be.bL / 16 + 1) / 16.0F;
    cv tessellator = cv.a;
    tessellator.b();
    tessellator.a(0.0D, j, -90.0D, f1, f4);
    tessellator.a(i, j, -90.0D, f3, f4);
    tessellator.a(i, 0.0D, -90.0D, f3, f2);
    tessellator.a(0.0D, 0.0D, -90.0D, f1, f2);
    tessellator.a();
    GL11.glDepthMask(true);
    GL11.glEnable(2929);
    GL11.glEnable(3008);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void a(int i, int j, int k, float f) {
    dk itemstack = this.g.h.by.a[i];
    if (itemstack == null)
      return; 
    float f1 = itemstack.b - f;
    if (f1 > 0.0F) {
      GL11.glPushMatrix();
      float f2 = 1.0F + f1 / 5.0F;
      GL11.glTranslatef((j + 8), (k + 12), 0.0F);
      GL11.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
      GL11.glTranslatef(-(j + 8), -(k + 12), 0.0F);
    } 
    d.a(this.g.q, this.g.p, itemstack, j, k);
    if (f1 > 0.0F)
      GL11.glPopMatrix(); 
    d.b(this.g.q, this.g.p, itemstack, j, k);
  }
  
  public void a() {
    if (this.k > 0)
      this.k--; 
    this.h++;
    for (int i = 0; i < this.e.size(); i++)
      ((ahe)this.e.get(i)).b++; 
  }
  
  public void b() {
    this.e.clear();
  }
  
  public void a(String s) {
    for (; this.g.q.a(s) > 320; s = s.substring(i)) {
      int i;
      for (i = 1; i < s.length() && this.g.q.a(s.substring(0, i + 1)) <= 320; i++);
      a(s.substring(0, i));
    } 
    this.e.add(0, new ahe(s));
    for (; this.e.size() > 50; this.e.remove(this.e.size() - 1));
  }
  
  public void b(String s) {
    this.j = "Now playing: " + s;
    this.k = 60;
    this.l = true;
  }
  
  public void c(String s) {
    qp stringtranslate = qp.a();
    String s1 = stringtranslate.a(s);
    a(s1);
  }
}
