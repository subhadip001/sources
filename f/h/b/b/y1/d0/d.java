package f.h.b.b.y1.d0;

import com.arthenica.ffmpegkit.MediaInformation;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.h.b.b.g2.t;
import f.h.b.b.y1.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes.dex */
public final class d extends TagPayloadReader {
    public long b;
    public long[] c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f4723d;

    public d() {
        super(new g());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.f4723d = new long[0];
    }

    public static Object d(t tVar, int i2) {
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(tVar.l()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(tVar.r() == 1);
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 != 11) {
                            return null;
                        }
                        Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(tVar.l())).doubleValue());
                        tVar.D(2);
                        return date;
                    }
                    int u = tVar.u();
                    ArrayList arrayList = new ArrayList(u);
                    for (int i3 = 0; i3 < u; i3++) {
                        Object d2 = d(tVar, tVar.r());
                        if (d2 != null) {
                            arrayList.add(d2);
                        }
                    }
                    return arrayList;
                }
                return e(tVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String f2 = f(tVar);
                int r = tVar.r();
                if (r == 9) {
                    return hashMap;
                }
                Object d3 = d(tVar, r);
                if (d3 != null) {
                    hashMap.put(f2, d3);
                }
            }
        } else {
            return f(tVar);
        }
    }

    public static HashMap<String, Object> e(t tVar) {
        int u = tVar.u();
        HashMap<String, Object> hashMap = new HashMap<>(u);
        for (int i2 = 0; i2 < u; i2++) {
            String f2 = f(tVar);
            Object d2 = d(tVar, tVar.r());
            if (d2 != null) {
                hashMap.put(f2, d2);
            }
        }
        return hashMap;
    }

    public static String f(t tVar) {
        int w = tVar.w();
        int i2 = tVar.b;
        tVar.D(w);
        return new String(tVar.a, i2, w);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j2) {
        if (tVar.r() == 2 && "onMetaData".equals(f(tVar)) && tVar.r() == 8) {
            HashMap<String, Object> e2 = e(tVar);
            Object obj = e2.get(MediaInformation.KEY_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = e2.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.c = new long[size];
                    this.f4723d = new long[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj5 = list.get(i2);
                        Object obj6 = list2.get(i2);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f4723d[i2] = ((Double) obj5).longValue();
                        } else {
                            this.c = new long[0];
                            this.f4723d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
