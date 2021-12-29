import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OldSpawnerAnimals {
  private int maxSpawns;
  
  private Class spawnBaseClass;
  
  private Class[] spawnSubclasses;
  
  private Set nearbyChunkSet;
  
  public OldSpawnerAnimals(int i, Class class1, Class[] aclass) {
    this.nearbyChunkSet = new HashSet();
    this.maxSpawns = i;
    this.spawnBaseClass = class1;
    this.spawnSubclasses = aclass;
  }
  
  public void func_1150_a(ry world) {
    int i = world.b(this.spawnBaseClass);
    if (i < this.maxSpawns)
      for (int j = 0; j < 3; j++)
        func_1149_a(world, 1, null);  
  }
  
  protected am func_1151_a(ry world, int i, int j) {
    int k = i + world.w.nextInt(16);
    int l = world.w.nextInt(128);
    int i1 = j + world.w.nextInt(16);
    return new am(k, l, i1);
  }
  
  private int func_1149_a(ry world, int i, rz iprogressupdate) {
    this.nearbyChunkSet.clear();
    for (int j = 0; j < world.i.size(); j++) {
      vi entityplayer = world.i.get(j);
      int l = me.c(entityplayer.s / 16.0D);
      int i1 = me.c(entityplayer.u / 16.0D);
      byte byte0 = 4;
      for (int k1 = -byte0; k1 <= byte0; k1++) {
        for (int i2 = -byte0; i2 <= byte0; i2++)
          this.nearbyChunkSet.add(new acm(k1 + l, i2 + i1)); 
      } 
    } 
    int k = 0;
    Iterator<acm> iterator = this.nearbyChunkSet.iterator();
    while (iterator.hasNext()) {
      acm chunkcoordintpair = iterator.next();
      if (world.w.nextInt(10) == 0) {
        int j1 = world.w.nextInt(this.spawnSubclasses.length);
        am chunkposition = func_1151_a(world, chunkcoordintpair.a * 16, chunkcoordintpair.b * 16);
        int l1 = chunkposition.a;
        int j2 = chunkposition.b;
        int k2 = chunkposition.c;
        if (world.f(l1, j2, k2))
          return 0; 
        if (world.e(l1, j2, k2) != p.a)
          return 0; 
        int l2 = 0;
        while (l2 < 3) {
          int i3 = l1;
          int j3 = j2;
          int k3 = k2;
          byte byte1 = 6;
          for (int l3 = 0; l3 < 2; l3++) {
            i3 += world.w.nextInt(byte1) - world.w.nextInt(byte1);
            j3 += world.w.nextInt(1) - world.w.nextInt(1);
            k3 += world.w.nextInt(byte1) - world.w.nextInt(byte1);
            if (world.f(i3, j3 - 1, k3) && !world.f(i3, j3, k3) && !world.e(i3, j3, k3).a() && !world.f(i3, j3 + 1, k3)) {
              float f = i3 + 0.5F;
              float f1 = j3;
              float f2 = k3 + 0.5F;
              if (world.a(f, f1, f2, 24.0D) == null) {
                float f3 = f - world.C.c();
                float f4 = f1 - world.C.d();
                float f5 = f2 - world.C.e();
                float f6 = f3 * f3 + f4 * f4 + f5 * f5;
                if (f6 >= 576.0F) {
                  nq entityliving;
                  try {
                    entityliving = this.spawnSubclasses[j1].getConstructor(new Class[] { ry.class }).newInstance(new Object[] { world });
                  } catch (Exception exception) {
                    exception.printStackTrace();
                    return k;
                  } 
                  entityliving.c(f, f1, f2, world.w.nextFloat() * 360.0F, 0.0F);
                  if (entityliving.i()) {
                    k++;
                    world.a(entityliving);
                    if (entityliving instanceof vq && world.w.nextInt(100) == 0) {
                      it entityskeleton = new it(world);
                      entityskeleton.c(f, f1, f2, entityliving.y, 0.0F);
                      world.a((ia)entityskeleton);
                      entityskeleton.g(entityliving);
                    } 
                  } 
                } 
              } 
            } 
          } 
          l2++;
        } 
      } 
    } 
    return k;
  }
}
