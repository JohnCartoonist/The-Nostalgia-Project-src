import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ah {
  private Map m;
  
  public static ah a = new ah();
  
  private abe n;
  
  public static double b;
  
  public static double c;
  
  public static double d;
  
  public zh e;
  
  public ry f;
  
  public nq g;
  
  public float h;
  
  public float i;
  
  public double j;
  
  public double k;
  
  public double l;
  
  private ah() {
    this.m = new HashMap<Object, Object>();
    this.m.put(u.class, new aeu());
    this.m.put(ze.class, new on());
    this.m.put(agb.class, new xd());
    this.m.put(rq.class, new wn());
    this.m.put(yg.class, new abi());
    for (Iterator<du> iterator = this.m.values().iterator(); iterator.hasNext(); tileentityspecialrenderer.a(this))
      du tileentityspecialrenderer = iterator.next(); 
  }
  
  public du a(Class<bq> class1) {
    du tileentityspecialrenderer = (du)this.m.get(class1);
    if (tileentityspecialrenderer == null && class1 != bq.class) {
      tileentityspecialrenderer = a(class1.getSuperclass());
      this.m.put(class1, tileentityspecialrenderer);
    } 
    return tileentityspecialrenderer;
  }
  
  public boolean a(bq tileentity) {
    return (b(tileentity) != null);
  }
  
  public du b(bq tileentity) {
    if (tileentity == null)
      return null; 
    return a(tileentity.getClass());
  }
  
  public void a(ry world, zh renderengine, abe fontrenderer, nq entityliving, float f) {
    if (this.f != world)
      a(world); 
    this.e = renderengine;
    this.g = entityliving;
    this.n = fontrenderer;
    this.h = entityliving.A + (entityliving.y - entityliving.A) * f;
    this.i = entityliving.B + (entityliving.z - entityliving.B) * f;
    this.j = entityliving.R + (entityliving.s - entityliving.R) * f;
    this.k = entityliving.S + (entityliving.t - entityliving.S) * f;
    this.l = entityliving.T + (entityliving.u - entityliving.T) * f;
  }
  
  public void a() {}
  
  public void a(bq tileentity, float f) {
    if (tileentity.a(this.j, this.k, this.l) < 4096.0D) {
      int i = this.f.a(tileentity.d, tileentity.e, tileentity.f, 0);
      int j = i % 65536;
      int k = i / 65536;
      adx.a(adx.b, j / 1.0F, k / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      a(tileentity, tileentity.d - b, tileentity.e - c, tileentity.f - d, f);
    } 
  }
  
  public void a(bq tileentity, double d, double d1, double d2, float f) {
    du tileentityspecialrenderer = b(tileentity);
    if (tileentityspecialrenderer != null)
      tileentityspecialrenderer.a(tileentity, d, d1, d2, f); 
  }
  
  public void a(ry world) {
    this.f = world;
    Iterator<du> iterator = this.m.values().iterator();
    while (iterator.hasNext()) {
      du tileentityspecialrenderer = iterator.next();
      if (tileentityspecialrenderer != null)
        tileentityspecialrenderer.a(world); 
    } 
  }
  
  public abe b() {
    return this.n;
  }
}
