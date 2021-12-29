import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class eh extends xe {
  private static final Random a = new Random();
  
  private float b;
  
  private String c;
  
  private ct d;
  
  private int e;
  
  private LogoEffectRandomizer[][] logoEffects;
  
  private int f;
  
  String[] minecraftLogo = new String[] { " *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * " };
  
  public eh() {
    this.b = 0.0F;
    this.e = 0;
    this.c = "missingno";
    try {
      ArrayList<String> arraylist = new ArrayList();
      BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(eh.class.getResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));
      String s = "";
      String s1;
      while ((s1 = bufferedreader.readLine()) != null) {
        s1 = s1.trim();
        if (s1.length() > 0)
          arraylist.add(s1); 
      } 
      do {
        this.c = arraylist.get(a.nextInt(arraylist.size()));
      } while (this.c.hashCode() == 125780783);
    } catch (Exception exception) {}
    this.b = a.nextFloat();
  }
  
  public static Random func_592_j() {
    return a;
  }
  
  public void s_() {
    this.e++;
    if (this.logoEffects != null)
      for (int i = 0; i < this.logoEffects.length; i++) {
        for (int j = 0; j < (this.logoEffects[i]).length; j++)
          this.logoEffects[i][j].func_875_a(); 
      }  
  }
  
  public boolean b() {
    return false;
  }
  
  protected void a(char c, int i) {}
  
  public void a() {
    this.f = this.l.p.a(new BufferedImage(256, 256, 2));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    if (calendar.get(2) + 1 == 11 && calendar.get(5) == 9) {
      this.c = "Happy birthday, ez!";
    } else if (calendar.get(2) + 1 == 6 && calendar.get(5) == 1) {
      this.c = "Happy birthday, Notch!";
    } else if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
      this.c = "Merry X-mas!";
    } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
      this.c = "Happy new year!";
    } 
    qp stringtranslate = qp.a();
    int i = this.n / 4 + 48;
    this.o.add(new ct(1, this.m / 2 - 100, i, stringtranslate.a("menu.singleplayer")));
    this.o.add(this.d = new ct(2, this.m / 2 - 100, i + 24, stringtranslate.a("menu.multiplayer")));
    this.o.add(new ct(3, this.m / 2 - 100, i + 48, stringtranslate.a("menu.mods")));
    if (this.l.n) {
      this.o.add(new ct(0, this.m / 2 - 100, i + 72, stringtranslate.a("menu.options")));
    } else {
      this.o.add(new ct(0, this.m / 2 - 100, i + 72 + 12, 98, 20, stringtranslate.a("menu.options")));
      this.o.add(new ct(4, this.m / 2 + 2, i + 72 + 12, 98, 20, stringtranslate.a("menu.quit")));
    } 
    if (this.l.k == null)
      this.d.g = false; 
  }
  
  protected void a(ct guibutton) {
    if (guibutton.f == 0)
      this.l.a((xe)new ex(this, this.l.A)); 
    if (guibutton.f == 1)
      this.l.a((xe)new xz(this)); 
    if (guibutton.f == 2)
      this.l.a((xe)new xi(this)); 
    if (guibutton.f == 3)
      this.l.a((xe)new lb(this)); 
    if (guibutton.f == 4)
      this.l.f(); 
  }
  
  private void b(int i, int j, float f) {
    cv tessellator = cv.a;
    GL11.glMatrixMode(5889);
    GL11.glPushMatrix();
    GL11.glLoadIdentity();
    GLU.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
    GL11.glMatrixMode(5888);
    GL11.glPushMatrix();
    GL11.glLoadIdentity();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glEnable(3042);
    GL11.glDisable(3008);
    GL11.glDisable(2884);
    GL11.glDepthMask(false);
    GL11.glBlendFunc(770, 771);
    int k = 8;
    for (int l = 0; l < k * k; l++) {
      GL11.glPushMatrix();
      float f1 = ((l % k) / k - 0.5F) / 64.0F;
      float f2 = ((l / k) / k - 0.5F) / 64.0F;
      float f3 = 0.0F;
      GL11.glTranslatef(f1, f2, f3);
      GL11.glRotatef(me.a((this.e + f) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-(this.e + f) * 0.1F, 0.0F, 1.0F, 0.0F);
      for (int i1 = 0; i1 < 6; i1++) {
        GL11.glPushMatrix();
        if (i1 == 1)
          GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); 
        if (i1 == 2)
          GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); 
        if (i1 == 3)
          GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); 
        if (i1 == 4)
          GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F); 
        if (i1 == 5)
          GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F); 
        GL11.glBindTexture(3553, this.l.p.b("/title/bg/panorama" + i1 + ".png"));
        tessellator.b();
        tessellator.a(16777215, 255 / (l + 1));
        float f4 = 0.0F;
        tessellator.a(-1.0D, -1.0D, 1.0D, (0.0F + f4), (0.0F + f4));
        tessellator.a(1.0D, -1.0D, 1.0D, (1.0F - f4), (0.0F + f4));
        tessellator.a(1.0D, 1.0D, 1.0D, (1.0F - f4), (1.0F - f4));
        tessellator.a(-1.0D, 1.0D, 1.0D, (0.0F + f4), (1.0F - f4));
        tessellator.a();
        GL11.glPopMatrix();
      } 
      GL11.glPopMatrix();
      GL11.glColorMask(true, true, true, false);
    } 
    tessellator.b(0.0D, 0.0D, 0.0D);
    GL11.glColorMask(true, true, true, true);
    GL11.glMatrixMode(5889);
    GL11.glPopMatrix();
    GL11.glMatrixMode(5888);
    GL11.glPopMatrix();
    GL11.glDepthMask(true);
    GL11.glEnable(2884);
    GL11.glEnable(3008);
    GL11.glEnable(2929);
  }
  
  private void a(float f) {
    GL11.glBindTexture(3553, this.f);
    GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColorMask(true, true, true, false);
    cv tessellator = cv.a;
    tessellator.b();
    byte byte0 = 3;
    for (int i = 0; i < byte0; i++) {
      tessellator.a(1.0F, 1.0F, 1.0F, 1.0F / (i + 1));
      int j = this.m;
      int k = this.n;
      float f1 = (i - byte0 / 2) / 256.0F;
      tessellator.a(j, k, this.i, (0.0F + f1), 0.0D);
      tessellator.a(j, 0.0D, this.i, (1.0F + f1), 0.0D);
      tessellator.a(0.0D, 0.0D, this.i, (1.0F + f1), 1.0D);
      tessellator.a(0.0D, k, this.i, (0.0F + f1), 1.0D);
    } 
    tessellator.a();
    GL11.glColorMask(true, true, true, true);
  }
  
  private void c(int i, int j, float f) {
    GL11.glViewport(0, 0, 256, 256);
    b(i, j, f);
    GL11.glDisable(3553);
    GL11.glEnable(3553);
    a(f);
    a(f);
    a(f);
    a(f);
    a(f);
    a(f);
    a(f);
    a(f);
    GL11.glViewport(0, 0, this.l.d, this.l.e);
    cv tessellator = cv.a;
    tessellator.b();
    float f1 = (this.m <= this.n) ? (120.0F / this.n) : (120.0F / this.m);
    float f2 = this.n * f1 / 256.0F;
    float f3 = this.m * f1 / 256.0F;
    GL11.glTexParameteri(3553, 10241, 9729);
    GL11.glTexParameteri(3553, 10240, 9729);
    tessellator.a(1.0F, 1.0F, 1.0F, 1.0F);
    int k = this.m;
    int l = this.n;
    tessellator.a(0.0D, l, this.i, (0.5F - f2), (0.5F + f3));
    tessellator.a(k, l, this.i, (0.5F - f2), (0.5F - f3));
    tessellator.a(k, 0.0D, this.i, (0.5F + f2), (0.5F - f3));
    tessellator.a(0.0D, 0.0D, this.i, (0.5F + f2), (0.5F + f3));
    tessellator.a();
  }
  
  private void drawLogo(float f) {
    GL11.glEnable(2929);
    if (this.logoEffects == null) {
      this.logoEffects = new LogoEffectRandomizer[this.minecraftLogo[0].length()][this.minecraftLogo.length];
      for (int i = 0; i < this.logoEffects.length; i++) {
        for (int j = 0; j < (this.logoEffects[i]).length; j++)
          this.logoEffects[i][j] = new LogoEffectRandomizer(this, i, j); 
      } 
    } 
    GL11.glMatrixMode(5889);
    GL11.glPushMatrix();
    GL11.glLoadIdentity();
    ef scaledresolution = new ef(this.l.A, this.l.d, this.l.e);
    int k = 120 * scaledresolution.c;
    GLU.gluPerspective(70.0F, this.l.d / k, 0.05F, 100.0F);
    GL11.glViewport(0, this.l.e - k, this.l.d, k);
    GL11.glMatrixMode(5888);
    GL11.glPushMatrix();
    GL11.glLoadIdentity();
    GL11.glDisable(2884);
    GL11.glCullFace(1029);
    GL11.glDepthMask(true);
    acr renderblocks = new acr();
    for (int l = 0; l < 3; l++) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.4F, 0.6F, -13.0F);
      if (l == 0) {
        GL11.glClear(256);
        GL11.glTranslatef(0.0F, -0.4F, 0.0F);
        GL11.glScalef(0.98F, 1.0F, 1.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
      } 
      if (l == 1) {
        GL11.glDisable(3042);
        GL11.glClear(256);
      } 
      if (l == 2) {
        GL11.glEnable(3042);
        GL11.glBlendFunc(768, 1);
      } 
      GL11.glScalef(1.0F, -1.0F, 1.0F);
      GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(0.89F, 1.0F, 0.4F);
      GL11.glTranslatef(-this.minecraftLogo[0].length() * 0.5F, -this.minecraftLogo.length * 0.5F, 0.0F);
      GL11.glBindTexture(3553, this.l.p.b("/terrain.png"));
      if (l == 0)
        GL11.glBindTexture(3553, this.l.p.b("/title/black.png")); 
      for (int i1 = 0; i1 < this.minecraftLogo.length; i1++) {
        for (int j1 = 0; j1 < this.minecraftLogo[i1].length(); j1++) {
          char c = this.minecraftLogo[i1].charAt(j1);
          if (c != ' ') {
            GL11.glPushMatrix();
            LogoEffectRandomizer logoeffectrandomizer = this.logoEffects[j1][i1];
            float f1 = (float)(logoeffectrandomizer.field_1311_b + (logoeffectrandomizer.field_1312_a - logoeffectrandomizer.field_1311_b) * f);
            float f2 = 1.0F;
            float f3 = 1.0F;
            float f4 = 0.0F;
            if (l == 0) {
              f2 = f1 * 0.04F + 1.0F;
              f3 = 1.0F / f2;
              f1 = 0.0F;
            } 
            GL11.glTranslatef(j1, i1, f1);
            GL11.glScalef(f2, f2, f2);
            GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
            mod_noBiomesX.drawLogoBlock(renderblocks, yy.t, f3);
            GL11.glPopMatrix();
          } 
        } 
      } 
      GL11.glPopMatrix();
    } 
    GL11.glDisable(3042);
    GL11.glMatrixMode(5889);
    GL11.glPopMatrix();
    GL11.glMatrixMode(5888);
    GL11.glPopMatrix();
    GL11.glViewport(0, 0, this.l.d, this.l.e);
    GL11.glEnable(2884);
  }
  
  public void a(int i, int j, float f) {
    boolean drawMenuStyle = ((Boolean)mod_noBiomesX.OldMainMenu.get()).booleanValue();
    if (!drawMenuStyle) {
      c(i, j, f);
    } else {
      j();
    } 
    cv tessellator = cv.a;
    if (!drawMenuStyle) {
      char c = 'Ē';
      int k = this.m / 2 - c / 2;
      byte byte0 = 30;
      a(0, 0, this.m, this.n, -2130706433, 16777215);
      a(0, 0, this.m, this.n, 0, -2147483648);
      GL11.glBindTexture(3553, this.l.p.b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.b < 1.0E-4D) {
        b(k + 0, byte0 + 0, 0, 0, 99, 44);
        b(k + 99, byte0 + 0, 129, 0, 27, 44);
        b(k + 99 + 26, byte0 + 0, 126, 0, 3, 44);
        b(k + 99 + 26 + 3, byte0 + 0, 99, 0, 26, 44);
        b(k + 155, byte0 + 0, 0, 45, 155, 44);
      } else {
        b(k + 0, byte0 + 0, 0, 0, 155, 44);
        b(k + 155, byte0 + 0, 0, 45, 155, 44);
      } 
    } else {
      drawLogo(f);
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    tessellator.c(16777215);
    GL11.glPushMatrix();
    GL11.glTranslatef((this.m / 2 + 90), 70.0F, 0.0F);
    GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
    float f1 = 1.8F - me.e(me.a((float)(System.currentTimeMillis() % 1000L) / 1000.0F * 3.141593F * 2.0F) * 0.1F);
    f1 = f1 * 100.0F / (this.q.a(this.c) + 32);
    GL11.glScalef(f1, f1, f1);
    a(this.q, this.c, 0, -8, 16776960);
    GL11.glPopMatrix();
    b(this.q, "Minecraft 1.0.0", 2, this.n - 10, 16777215);
    String s = "Copyright Mojang AB. Do not distribute!";
    b(this.q, s, this.m - this.q.a(s) - 2, this.n - 10, 16777215);
    super.a(i, j, f);
  }
}
