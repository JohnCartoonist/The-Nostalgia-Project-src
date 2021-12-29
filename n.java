import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class n {
  private Minecraft a;
  
  private dk b;
  
  private float c;
  
  private float d;
  
  private acr e;
  
  private sg f;
  
  private int g;
  
  public n(Minecraft minecraft) {
    this.b = null;
    this.c = 0.0F;
    this.d = 0.0F;
    this.e = new acr();
    this.g = -1;
    this.a = minecraft;
    this.f = new sg(minecraft.q, minecraft.A, minecraft.p);
  }
  
  public void a(nq entityliving, dk itemstack, int i) {
    GL11.glPushMatrix();
    if (itemstack.c < 256 && acr.a(yy.k[itemstack.c].c())) {
      GL11.glBindTexture(3553, this.a.p.b("/terrain.png"));
      this.e.a(yy.k[itemstack.c], itemstack.i(), 1.0F);
    } else {
      if (itemstack.c < 256) {
        GL11.glBindTexture(3553, this.a.p.b("/terrain.png"));
      } else {
        GL11.glBindTexture(3553, this.a.p.b("/gui/items.png"));
      } 
      cv tessellator = cv.a;
      int j = entityliving.a(itemstack, i);
      float f = ((j % 16 * 16) + 0.0F) / 256.0F;
      float f1 = ((j % 16 * 16) + 15.99F) / 256.0F;
      float f2 = ((j / 16 * 16) + 0.0F) / 256.0F;
      float f3 = ((j / 16 * 16) + 15.99F) / 256.0F;
      float f4 = 0.0F;
      float f5 = 0.3F;
      GL11.glEnable(32826);
      GL11.glTranslatef(-f4, -f5, 0.0F);
      float f6 = 1.5F;
      GL11.glScalef(f6, f6, f6);
      GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
      a(tessellator, f1, f2, f, f3);
      if (itemstack != null && itemstack.r() && i == 0) {
        GL11.glDepthFunc(514);
        GL11.glDisable(2896);
        this.a.p.b(this.a.p.b("%blur%/misc/glint.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(768, 1);
        float f7 = 0.76F;
        GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
        GL11.glMatrixMode(5890);
        GL11.glPushMatrix();
        float f8 = 0.125F;
        GL11.glScalef(f8, f8, f8);
        float f9 = (float)(System.currentTimeMillis() % 3000L) / 3000.0F * 8.0F;
        GL11.glTranslatef(f9, 0.0F, 0.0F);
        GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
        a(tessellator, 0.0F, 0.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(f8, f8, f8);
        f9 = (float)(System.currentTimeMillis() % 4873L) / 4873.0F * 8.0F;
        GL11.glTranslatef(-f9, 0.0F, 0.0F);
        GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
        a(tessellator, 0.0F, 0.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glDepthFunc(515);
      } 
      GL11.glDisable(32826);
    } 
    GL11.glPopMatrix();
  }
  
  private void a(cv tessellator, float f, float f1, float f2, float f3) {
    float f4 = 1.0F;
    float f5 = 0.0625F;
    tessellator.b();
    tessellator.b(0.0F, 0.0F, 1.0F);
    tessellator.a(0.0D, 0.0D, 0.0D, f, f3);
    tessellator.a(f4, 0.0D, 0.0D, f2, f3);
    tessellator.a(f4, 1.0D, 0.0D, f2, f1);
    tessellator.a(0.0D, 1.0D, 0.0D, f, f1);
    tessellator.a();
    tessellator.b();
    tessellator.b(0.0F, 0.0F, -1.0F);
    tessellator.a(0.0D, 1.0D, (0.0F - f5), f, f1);
    tessellator.a(f4, 1.0D, (0.0F - f5), f2, f1);
    tessellator.a(f4, 0.0D, (0.0F - f5), f2, f3);
    tessellator.a(0.0D, 0.0D, (0.0F - f5), f, f3);
    tessellator.a();
    tessellator.b();
    tessellator.b(-1.0F, 0.0F, 0.0F);
    for (int i = 0; i < 16; i++) {
      float f6 = i / 16.0F;
      float f10 = f + (f2 - f) * f6 - 0.001953125F;
      float f14 = f4 * f6;
      tessellator.a(f14, 0.0D, (0.0F - f5), f10, f3);
      tessellator.a(f14, 0.0D, 0.0D, f10, f3);
      tessellator.a(f14, 1.0D, 0.0D, f10, f1);
      tessellator.a(f14, 1.0D, (0.0F - f5), f10, f1);
    } 
    tessellator.a();
    tessellator.b();
    tessellator.b(1.0F, 0.0F, 0.0F);
    for (int j = 0; j < 16; j++) {
      float f7 = j / 16.0F;
      float f11 = f + (f2 - f) * f7 - 0.001953125F;
      float f15 = f4 * f7 + 0.0625F;
      tessellator.a(f15, 1.0D, (0.0F - f5), f11, f1);
      tessellator.a(f15, 1.0D, 0.0D, f11, f1);
      tessellator.a(f15, 0.0D, 0.0D, f11, f3);
      tessellator.a(f15, 0.0D, (0.0F - f5), f11, f3);
    } 
    tessellator.a();
    tessellator.b();
    tessellator.b(0.0F, 1.0F, 0.0F);
    for (int k = 0; k < 16; k++) {
      float f8 = k / 16.0F;
      float f12 = f3 + (f1 - f3) * f8 - 0.001953125F;
      float f16 = f4 * f8 + 0.0625F;
      tessellator.a(0.0D, f16, 0.0D, f, f12);
      tessellator.a(f4, f16, 0.0D, f2, f12);
      tessellator.a(f4, f16, (0.0F - f5), f2, f12);
      tessellator.a(0.0D, f16, (0.0F - f5), f, f12);
    } 
    tessellator.a();
    tessellator.b();
    tessellator.b(0.0F, -1.0F, 0.0F);
    for (int l = 0; l < 16; l++) {
      float f9 = l / 16.0F;
      float f13 = f3 + (f1 - f3) * f9 - 0.001953125F;
      float f17 = f4 * f9;
      tessellator.a(f4, f17, 0.0D, f2, f13);
      tessellator.a(0.0D, f17, 0.0D, f, f13);
      tessellator.a(0.0D, f17, (0.0F - f5), f, f13);
      tessellator.a(f4, f17, (0.0F - f5), f2, f13);
    } 
    tessellator.a();
  }
  
  public void a(float f) {
    float f1 = this.d + (this.c - this.d) * f;
    di entityplayersp = this.a.h;
    float f2 = ((vi)entityplayersp).B + (((vi)entityplayersp).z - ((vi)entityplayersp).B) * f;
    GL11.glPushMatrix();
    GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(((vi)entityplayersp).A + (((vi)entityplayersp).y - ((vi)entityplayersp).A) * f, 0.0F, 1.0F, 0.0F);
    rt.b();
    GL11.glPopMatrix();
    if (entityplayersp instanceof di && ((Boolean)mod_noBiomesX.NoItemSway.get()).booleanValue()) {
      di entityplayersp1 = entityplayersp;
      float f3 = entityplayersp1.i + (entityplayersp1.g - entityplayersp1.i) * f;
      float f5 = entityplayersp1.h + (entityplayersp1.f - entityplayersp1.h) * f;
      GL11.glRotatef((((vi)entityplayersp).z - f3) * 0.1F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef((((vi)entityplayersp).y - f5) * 0.1F, 0.0F, 1.0F, 0.0F);
    } 
    dk itemstack = this.b;
    float f4 = this.a.f.c(me.c(((vi)entityplayersp).s), me.c(((vi)entityplayersp).t), me.c(((vi)entityplayersp).u));
    f4 = 1.0F;
    int i = this.a.f.a(me.c(((vi)entityplayersp).s), me.c(((vi)entityplayersp).t), me.c(((vi)entityplayersp).u), 0);
    int k = i % 65536;
    int l = i / 65536;
    adx.a(adx.b, k / 1.0F, l / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    if (itemstack != null) {
      int j = acy.d[itemstack.c].c(itemstack.i());
      float f9 = (j >> 16 & 0xFF) / 255.0F;
      float f14 = (j >> 8 & 0xFF) / 255.0F;
      float f20 = (j & 0xFF) / 255.0F;
      GL11.glColor4f(f4 * f9, f4 * f14, f4 * f20, 1.0F);
    } else {
      GL11.glColor4f(f4, f4, f4, 1.0F);
    } 
    if (itemstack != null && itemstack.c == acy.bc.bM) {
      GL11.glPushMatrix();
      float f6 = 0.8F;
      float f10 = entityplayersp.d(f);
      float f15 = me.a(f10 * 3.141593F);
      float f21 = me.a(me.c(f10) * 3.141593F);
      GL11.glTranslatef(-f21 * 0.4F, me.a(me.c(f10) * 3.141593F * 2.0F) * 0.2F, -f15 * 0.2F);
      f10 = 1.0F - f2 / 45.0F + 0.1F;
      if (f10 < 0.0F)
        f10 = 0.0F; 
      if (f10 > 1.0F)
        f10 = 1.0F; 
      f10 = -me.b(f10 * 3.141593F) * 0.5F + 0.5F;
      GL11.glTranslatef(0.0F, 0.0F * f6 - (1.0F - f1) * 1.2F - f10 * 0.5F + 0.04F, -0.9F * f6);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(f10 * -85.0F, 0.0F, 0.0F, 1.0F);
      GL11.glEnable(32826);
      GL11.glBindTexture(3553, this.a.p.a(this.a.h.ad, this.a.h.I()));
      for (f15 = 0.0F; f15 < 2.0F; f15++) {
        f21 = f15 * 2.0F - 1.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(-0.0F, -0.6F, 1.1F * f21);
        GL11.glRotatef(-45.0F * f21, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-65.0F * f21, 0.0F, 1.0F, 0.0F);
        rg render1 = wb.a.a((ia)this.a.h);
        zr renderplayer1 = (zr)render1;
        float f32 = 1.0F;
        GL11.glScalef(f32, f32, f32);
        renderplayer1.b();
        GL11.glPopMatrix();
      } 
      f15 = entityplayersp.d(f);
      f21 = me.a(f15 * f15 * 3.141593F);
      float f27 = me.a(me.c(f15) * 3.141593F);
      GL11.glRotatef(-f21 * 20.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f27 * 20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(-f27 * 80.0F, 1.0F, 0.0F, 0.0F);
      f15 = 0.38F;
      GL11.glScalef(f15, f15, f15);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
      f21 = 0.015625F;
      GL11.glScalef(f21, f21, f21);
      this.a.p.b(this.a.p.b("/misc/mapbg.png"));
      cv tessellator = cv.a;
      GL11.glNormal3f(0.0F, 0.0F, -1.0F);
      tessellator.b();
      byte byte0 = 7;
      tessellator.a((0 - byte0), (128 + byte0), 0.0D, 0.0D, 1.0D);
      tessellator.a((128 + byte0), (128 + byte0), 0.0D, 1.0D, 1.0D);
      tessellator.a((128 + byte0), (0 - byte0), 0.0D, 1.0D, 0.0D);
      tessellator.a((0 - byte0), (0 - byte0), 0.0D, 0.0D, 0.0D);
      tessellator.a();
      kl mapdata = acy.bc.a(itemstack, this.a.f);
      this.f.a((vi)this.a.h, this.a.p, mapdata);
      GL11.glPopMatrix();
    } else if (itemstack != null) {
      GL11.glPushMatrix();
      float f7 = 0.8F;
      if (entityplayersp.ay() > 0) {
        ps enumaction = itemstack.m();
        if (enumaction == ps.b || enumaction == ps.c) {
          float f16 = entityplayersp.ay() - f + 1.0F;
          float f22 = 1.0F - f16 / itemstack.l();
          float f28 = f22;
          float f30 = 1.0F - f28;
          f30 = f30 * f30 * f30;
          f30 = f30 * f30 * f30;
          f30 = f30 * f30 * f30;
          float f33 = 1.0F - f30;
          GL11.glTranslatef(0.0F, me.e(me.b(f16 / 4.0F * 3.141593F) * 0.1F) * ((f28 <= 0.2D) ? false : true), 0.0F);
          GL11.glTranslatef(f33 * 0.6F, -f33 * 0.5F, 0.0F);
          GL11.glRotatef(f33 * 90.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(f33 * 10.0F, 1.0F, 0.0F, 0.0F);
          GL11.glRotatef(f33 * 30.0F, 0.0F, 0.0F, 1.0F);
        } 
      } else {
        float f11 = entityplayersp.d(f);
        float f17 = me.a(f11 * 3.141593F);
        float f23 = me.a(me.c(f11) * 3.141593F);
        GL11.glTranslatef(-f23 * 0.4F, me.a(me.c(f11) * 3.141593F * 2.0F) * 0.2F, -f17 * 0.2F);
      } 
      GL11.glTranslatef(0.7F * f7, -0.65F * f7 - (1.0F - f1) * 0.6F, -0.9F * f7);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      float f12 = entityplayersp.d(f);
      float f18 = me.a(f12 * f12 * 3.141593F);
      float f24 = me.a(me.c(f12) * 3.141593F);
      GL11.glRotatef(-f18 * 20.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f24 * 20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(-f24 * 80.0F, 1.0F, 0.0F, 0.0F);
      f12 = 0.4F;
      GL11.glScalef(f12, f12, f12);
      if (entityplayersp.ay() > 0) {
        ps enumaction1 = itemstack.m();
        if (enumaction1 == ps.d) {
          GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
          GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
          GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
        } else if (enumaction1 == ps.e) {
          GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
          GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
          GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
          float f25 = itemstack.l() - entityplayersp.ay() - f + 1.0F;
          float f29 = f25 / 20.0F;
          f29 = (f29 * f29 + f29 * 2.0F) / 3.0F;
          if (f29 > 1.0F)
            f29 = 1.0F; 
          if (f29 > 0.1F)
            GL11.glTranslatef(0.0F, me.a((f25 - 0.1F) * 1.3F) * 0.01F * (f29 - 0.1F), 0.0F); 
          GL11.glTranslatef(0.0F, 0.0F, f29 * 0.1F);
          GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
          GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
          GL11.glTranslatef(0.0F, 0.5F, 0.0F);
          float f31 = 1.0F + f29 * 0.2F;
          GL11.glScalef(1.0F, 1.0F, f31);
          GL11.glTranslatef(0.0F, -0.5F, 0.0F);
          GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
        } 
      } 
      if (itemstack.a().b())
        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); 
      if (itemstack.c == acy.br.bM) {
        a((nq)entityplayersp, itemstack, 0);
        GL11.glColor4f(f4, f4, f4, 1.0F);
        a((nq)entityplayersp, itemstack, 1);
      } else {
        a((nq)entityplayersp, itemstack, 0);
      } 
      GL11.glPopMatrix();
    } else {
      GL11.glPushMatrix();
      float f8 = 0.8F;
      float f13 = entityplayersp.d(f);
      float f19 = me.a(f13 * 3.141593F);
      float f26 = me.a(me.c(f13) * 3.141593F);
      GL11.glTranslatef(-f26 * 0.3F, me.a(me.c(f13) * 3.141593F * 2.0F) * 0.4F, -f19 * 0.4F);
      GL11.glTranslatef(0.8F * f8, -0.75F * f8 - (1.0F - f1) * 0.6F, -0.9F * f8);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      f13 = entityplayersp.d(f);
      f19 = me.a(f13 * f13 * 3.141593F);
      f26 = me.a(me.c(f13) * 3.141593F);
      GL11.glRotatef(f26 * 70.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f19 * 20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glBindTexture(3553, this.a.p.a(this.a.h.ad, this.a.h.I()));
      GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
      GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glTranslatef(5.6F, 0.0F, 0.0F);
      rg render = wb.a.a((ia)this.a.h);
      zr renderplayer = (zr)render;
      f26 = 1.0F;
      GL11.glScalef(f26, f26, f26);
      renderplayer.b();
      GL11.glPopMatrix();
    } 
    GL11.glDisable(32826);
    rt.a();
  }
  
  public void b(float f) {
    GL11.glDisable(3008);
    if (this.a.h.V()) {
      int i = this.a.p.b("/terrain.png");
      GL11.glBindTexture(3553, i);
      d(f);
    } 
    if (this.a.h.L()) {
      int j = me.c(this.a.h.s);
      int l = me.c(this.a.h.t);
      int i1 = me.c(this.a.h.u);
      int j1 = this.a.p.b("/terrain.png");
      GL11.glBindTexture(3553, j1);
      int k1 = this.a.f.a(j, l, i1);
      if (this.a.f.g(j, l, i1)) {
        a(f, yy.k[k1].b(2));
      } else {
        for (int l1 = 0; l1 < 8; l1++) {
          float f1 = (((l1 >> 0) % 2) - 0.5F) * this.a.h.M * 0.9F;
          float f2 = (((l1 >> 1) % 2) - 0.5F) * this.a.h.N * 0.2F;
          float f3 = (((l1 >> 2) % 2) - 0.5F) * this.a.h.M * 0.9F;
          int i2 = me.d(j + f1);
          int j2 = me.d(l + f2);
          int k2 = me.d(i1 + f3);
          if (this.a.f.g(i2, j2, k2))
            k1 = this.a.f.a(i2, j2, k2); 
        } 
      } 
      if (yy.k[k1] != null)
        a(f, yy.k[k1].b(2)); 
    } 
    if (this.a.h.a(p.g)) {
      int k = this.a.p.b("/misc/water.png");
      GL11.glBindTexture(3553, k);
      c(f);
    } 
    GL11.glEnable(3008);
  }
  
  private void a(float f, int i) {
    cv tessellator = cv.a;
    float f1 = this.a.h.b(f);
    f1 = 0.1F;
    GL11.glColor4f(f1, f1, f1, 0.5F);
    GL11.glPushMatrix();
    float f2 = -1.0F;
    float f3 = 1.0F;
    float f4 = -1.0F;
    float f5 = 1.0F;
    float f6 = -0.5F;
    float f7 = 0.0078125F;
    float f8 = (i % 16) / 256.0F - f7;
    float f9 = ((i % 16) + 15.99F) / 256.0F + f7;
    float f10 = (i / 16) / 256.0F - f7;
    float f11 = ((i / 16) + 15.99F) / 256.0F + f7;
    tessellator.b();
    tessellator.a(f2, f4, f6, f9, f11);
    tessellator.a(f3, f4, f6, f8, f11);
    tessellator.a(f3, f5, f6, f8, f10);
    tessellator.a(f2, f5, f6, f9, f10);
    tessellator.a();
    GL11.glPopMatrix();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void c(float f) {
    cv tessellator = cv.a;
    float f1 = this.a.h.b(f);
    GL11.glColor4f(f1, f1, f1, 0.5F);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glPushMatrix();
    float f2 = 4.0F;
    float f3 = -1.0F;
    float f4 = 1.0F;
    float f5 = -1.0F;
    float f6 = 1.0F;
    float f7 = -0.5F;
    float f8 = -this.a.h.y / 64.0F;
    float f9 = this.a.h.z / 64.0F;
    tessellator.b();
    tessellator.a(f3, f5, f7, (f2 + f8), (f2 + f9));
    tessellator.a(f4, f5, f7, (0.0F + f8), (f2 + f9));
    tessellator.a(f4, f6, f7, (0.0F + f8), (0.0F + f9));
    tessellator.a(f3, f6, f7, (f2 + f8), (0.0F + f9));
    tessellator.a();
    GL11.glPopMatrix();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
  }
  
  private void d(float f) {
    cv tessellator = cv.a;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    float f1 = 1.0F;
    for (int i = 0; i < 2; i++) {
      GL11.glPushMatrix();
      int j = yy.ar.bL + i * 16;
      int k = (j & 0xF) << 4;
      int l = j & 0xF0;
      float f2 = k / 256.0F;
      float f3 = (k + 15.99F) / 256.0F;
      float f4 = l / 256.0F;
      float f5 = (l + 15.99F) / 256.0F;
      float f6 = (0.0F - f1) / 2.0F;
      float f7 = f6 + f1;
      float f8 = 0.0F - f1 / 2.0F;
      float f9 = f8 + f1;
      float f10 = -0.5F;
      GL11.glTranslatef(-(i * 2 - 1) * 0.24F, -0.3F, 0.0F);
      GL11.glRotatef((i * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
      tessellator.b();
      tessellator.a(f6, f8, f10, f3, f5);
      tessellator.a(f7, f8, f10, f2, f5);
      tessellator.a(f7, f9, f10, f2, f4);
      tessellator.a(f6, f9, f10, f3, f4);
      tessellator.a();
      GL11.glPopMatrix();
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
  }
  
  public void a() {
    this.d = this.c;
    di entityplayersp = this.a.h;
    dk itemstack = ((vi)entityplayersp).by.a();
    dk itemstack1 = itemstack;
    boolean flag = (this.g == ((vi)entityplayersp).by.c && itemstack1 == this.b);
    if (this.b == null && itemstack1 == null)
      flag = true; 
    if (itemstack1 != null && this.b != null && itemstack1 != this.b && itemstack1.c == this.b.c && itemstack1.i() == this.b.i()) {
      this.b = itemstack1;
      flag = true;
    } 
    float f = 0.4F;
    float f1 = flag ? 1.0F : 0.0F;
    float f2 = f1 - this.c;
    if (f2 < -f)
      f2 = -f; 
    if (f2 > f)
      f2 = f; 
    this.c += f2;
    if (this.c < 0.1F) {
      this.b = itemstack1;
      this.g = ((vi)entityplayersp).by.c;
    } 
  }
  
  public void b() {
    this.c = 0.0F;
  }
  
  public void c() {
    this.c = 0.0F;
  }
}
