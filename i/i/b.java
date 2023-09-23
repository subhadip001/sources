package i.i;

import com.google.firebase.analytics.FirebaseAnalytics;
import i.l.a.l;
import i.l.b.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: _Arrays.kt */
/* loaded from: classes2.dex */
public class b extends a {
    public static final <T> List<T> a(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        i.e(iterable, "<this>");
        return h(new LinkedHashSet((Collection) iterable));
    }

    public static String b(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i3 & 2) != 0 ? "" : null;
        String str2 = (i3 & 4) == 0 ? null : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        String str3 = (i3 & 16) != 0 ? "..." : null;
        int i4 = i3 & 32;
        i.e(objArr, "<this>");
        i.e(charSequence, "separator");
        i.e(str, "prefix");
        i.e(str2, "postfix");
        i.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        i.e(objArr, "<this>");
        i.e(sb, "buffer");
        i.e(charSequence, "separator");
        i.e(str, "prefix");
        i.e(str2, "postfix");
        i.e(str3, "truncated");
        sb.append(str);
        int length = objArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = objArr[i6];
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i5 > i2) {
                break;
            }
            i.e(sb, "<this>");
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        if (i2 >= 0 && i5 > i2) {
            sb.append((CharSequence) str3);
        }
        sb.append((CharSequence) str2);
        String sb2 = sb.toString();
        i.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> List<T> c(T... tArr) {
        i.e(tArr, "elements");
        return tArr.length > 0 ? f.n.a.n.i.e(tArr) : d.f8613f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> d(List<? extends T> list) {
        i.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : f.n.a.n.i.F(list.get(0));
        }
        return d.f8613f;
    }

    public static final char e(char[] cArr) {
        i.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void f() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final <T, C extends Collection<? super T>> C g(Iterable<? extends T> iterable, C c) {
        i.e(iterable, "<this>");
        i.e(c, FirebaseAnalytics.Param.DESTINATION);
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        List list;
        i.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return j(collection);
                }
                return f.n.a.n.i.F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return d.f8613f;
        }
        i.e(iterable, "<this>");
        if (z) {
            list = j((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            g(iterable, arrayList);
            list = arrayList;
        }
        return d(list);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M i(Iterable<? extends i.d<? extends K, ? extends V>> iterable, M m2) {
        i.e(iterable, "<this>");
        i.e(m2, FirebaseAnalytics.Param.DESTINATION);
        i.e(m2, "<this>");
        i.e(iterable, "pairs");
        for (i.d<? extends K, ? extends V> dVar : iterable) {
            m2.put(dVar.f8606f, dVar.f8607g);
        }
        return m2;
    }

    public static final <T> List<T> j(Collection<? extends T> collection) {
        i.e(collection, "<this>");
        return new ArrayList(collection);
    }
}
