import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class we {
  private static HashMap b = new HashMap<Object, Object>();
  
  private static Set oldEligibleChunksForSpawning = new HashSet();
  
  protected static am a(ry world, int i, int j) {
    int k = i + world.w.nextInt(16);
    int l = world.w.nextInt(world.c);
    int i1 = j + world.w.nextInt(16);
    return new am(k, l, i1);
  }
  
  public static final int a(ry var0, boolean var1, boolean var2) {
    if (!var1 && !var2)
      return 0; 
    oldEligibleChunksForSpawning.clear();
    int var3;
    for (var3 = 0; var3 < var0.i.size(); var3++) {
      vi var4 = var0.i.get(var3);
      int var5 = me.c(var4.s / 16.0D);
      int i = me.c(var4.u / 16.0D);
      byte var7 = 8;
      for (int var8 = -var7; var8 <= var7; var8++) {
        for (int var9 = -var7; var9 <= var7; var9++)
          oldEligibleChunksForSpawning.add(new acm(var8 + var5, var9 + i)); 
      } 
    } 
    var3 = 0;
    dh var33 = var0.v();
    jf[] var34 = jf.values();
    int var6 = var34.length;
    for (int var35 = 0; var35 < var6; var35++) {
      jf var36 = var34[var35];
      if ((!var36.d() || var2) && (var36.d() || var1) && var0.b(var36.a()) <= var36.b() * oldEligibleChunksForSpawning.size() / 256) {
        Iterator<acm> var37 = oldEligibleChunksForSpawning.iterator();
        label67: while (var37.hasNext()) {
          acm var10 = var37.next();
          OldBiomeGenBase var11 = var0.a().oldGetBiomeGenAtChunkCoord(var10);
          List var12 = var11.getSpawnableList(var36);
          if (var12 != null && !var12.isEmpty()) {
            yx var13 = (yx)nc.a(var0.w, var12);
            am var14 = a(var0, var10.a * 16, var10.b * 16);
            int var15 = var14.a;
            int var16 = var14.b;
            int var17 = var14.c;
            if (!var0.g(var15, var16, var17) && var0.e(var15, var16, var17) == var36.c()) {
              int var18 = 0;
              for (int var19 = 0; var19 < 3; var19++) {
                int var20 = var15;
                int var21 = var16;
                int var22 = var17;
                byte var23 = 6;
                for (int var24 = 0; var24 < 4; var24++) {
                  var20 += var0.w.nextInt(var23) - var0.w.nextInt(var23);
                  var21 += var0.w.nextInt(1) - var0.w.nextInt(1);
                  var22 += var0.w.nextInt(var23) - var0.w.nextInt(var23);
                  if (a(var36, var0, var20, var21, var22)) {
                    float var25 = var20 + 0.5F;
                    float var26 = var21;
                    float var27 = var22 + 0.5F;
                    if (var0.a(var25, var26, var27, 24.0D) == null) {
                      float var28 = var25 - var33.a;
                      float var29 = var26 - var33.b;
                      float var30 = var27 - var33.c;
                      float var31 = var28 * var28 + var29 * var29 + var30 * var30;
                      if (var31 >= 576.0F) {
                        nq var38;
                        try {
                          var38 = var13.a.getConstructor(new Class[] { ry.class }).newInstance(new Object[] { var0 });
                        } catch (Exception var32) {
                          var32.printStackTrace();
                          return var3;
                        } 
                        var38.c(var25, var26, var27, var0.w.nextFloat() * 360.0F, 0.0F);
                        if (var38.i()) {
                          var18++;
                          var0.a(var38);
                          a(var38, var0, var25, var26, var27);
                          if (var18 >= var38.g_())
                            continue label67; 
                        } 
                        var3 += var18;
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    return var3;
  }
  
  private static boolean a(jf enumcreaturetype, ry world, int i, int j, int k) {
    if (enumcreaturetype.c() == p.g)
      return (world.e(i, j, k).a() && !world.g(i, j + 1, k)); 
    return (world.g(i, j - 1, k) && !world.g(i, j, k) && !world.e(i, j, k).a() && !world.g(i, j + 1, k));
  }
  
  private static void a(nq entityliving, ry world, float f, float f1, float f2) {
    if (entityliving instanceof vq && world.w.nextInt(100) == 0) {
      it entityskeleton = new it(world);
      entityskeleton.c(f, f1, f2, entityliving.y, 0.0F);
      world.a((ia)entityskeleton);
      entityskeleton.g(entityliving);
    } else if (entityliving instanceof hm) {
      ((hm)entityliving).c(hm.a(world.w));
    } 
  }
  
  public static void a(ry world, sr biomegenbase, int i, int j, int k, int l, Random random) {
    List list = biomegenbase.a(jf.b);
    if (list.isEmpty())
      return; 
    while (random.nextFloat() < biomegenbase.d()) {
      yx spawnlistentry = (yx)nc.a(world.w, list);
      int i1 = spawnlistentry.b + random.nextInt(1 + spawnlistentry.c - spawnlistentry.b);
      int j1 = i + random.nextInt(k);
      int k1 = j + random.nextInt(l);
      int l1 = j1;
      int i2 = k1;
      int j2 = 0;
      while (j2 < i1) {
        boolean flag = false;
        for (int k2 = 0; !flag && k2 < 4; k2++) {
          int l2 = world.f(j1, k1);
          if (a(jf.b, world, j1, l2, k1)) {
            nq entityliving;
            float f = j1 + 0.5F;
            float f1 = l2;
            float f2 = k1 + 0.5F;
            try {
              entityliving = spawnlistentry.a.getConstructor(new Class[] { ry.class }).newInstance(new Object[] { world });
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            entityliving.c(f, f1, f2, random.nextFloat() * 360.0F, 0.0F);
            world.a(entityliving);
            a(entityliving, world, f, f1, f2);
            flag = true;
          } 
          j1 += random.nextInt(5) - random.nextInt(5);
          for (k1 += random.nextInt(5) - random.nextInt(5); j1 < i || j1 >= i + k || k1 < j || k1 >= j + k; k1 = i2 + random.nextInt(5) - random.nextInt(5))
            j1 = l1 + random.nextInt(5) - random.nextInt(5); 
        } 
        j2++;
      } 
    } 
  }
  
  protected static final Class[] a = new Class[] { vq.class, gr.class, it.class };
}
