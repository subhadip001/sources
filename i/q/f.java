package i.q;

import i.l.a.p;
import i.l.b.i;
import i.l.b.j;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public final class f extends j implements p<CharSequence, Integer, i.d<? extends Integer, ? extends Integer>> {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List<String> f8672g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f8673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<String> list, boolean z) {
        super(2);
        this.f8672g = list;
        this.f8673h = z;
    }

    @Override // i.l.a.p
    public i.d<? extends Integer, ? extends Integer> k(CharSequence charSequence, Integer num) {
        Object obj;
        i.d dVar;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        i.e(charSequence2, "$this$$receiver");
        List<String> list = this.f8672g;
        boolean z = this.f8673h;
        if (!z && list.size() == 1) {
            i.e(list, "<this>");
            i.e(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size == 1) {
                String str = list.get(0);
                int g2 = e.g(charSequence2, str, intValue, false, 4);
                if (g2 >= 0) {
                    dVar = new i.d(Integer.valueOf(g2), str);
                }
                dVar = null;
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            i.n.c cVar = new i.n.c(intValue, charSequence2.length());
            if (charSequence2 instanceof String) {
                int i2 = cVar.f8656g;
                int i3 = cVar.f8657h;
                if ((i3 > 0 && intValue <= i2) || (i3 < 0 && i2 <= intValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (f.n.a.n.i.Q(str2, 0, (String) charSequence2, intValue, str2.length(), z)) {
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 == null) {
                            if (intValue == i2) {
                                break;
                            }
                            intValue += i3;
                        } else {
                            dVar = new i.d(Integer.valueOf(intValue), str3);
                            break;
                        }
                    }
                }
                dVar = null;
            } else {
                int i4 = cVar.f8656g;
                int i5 = cVar.f8657h;
                if ((i5 > 0 && intValue <= i4) || (i5 < 0 && i4 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (e.i(str4, 0, charSequence2, intValue, str4.length(), z)) {
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 == null) {
                            if (intValue == i4) {
                                break;
                            }
                            intValue += i5;
                        } else {
                            dVar = new i.d(Integer.valueOf(intValue), str5);
                            break;
                        }
                    }
                }
                dVar = null;
            }
        }
        if (dVar != null) {
            return new i.d<>(dVar.f8606f, Integer.valueOf(((String) dVar.f8607g).length()));
        }
        return null;
    }
}
