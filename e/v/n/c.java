package e.v.n;

import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public class c {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f2983d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2984d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2985e;

        /* renamed from: f  reason: collision with root package name */
        public final String f2986f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2987g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.b = str2;
            this.f2984d = z;
            this.f2985e = i2;
            int i4 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i4 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i4 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i4 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i4;
            this.f2986f = str3;
            this.f2987g = i3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2985e == aVar.f2985e && this.a.equals(aVar.a) && this.f2984d == aVar.f2984d) {
                if (this.f2987g != 1 || aVar.f2987g != 2 || (str3 = this.f2986f) == null || str3.equals(aVar.f2986f)) {
                    if (this.f2987g != 2 || aVar.f2987g != 1 || (str2 = aVar.f2986f) == null || str2.equals(this.f2986f)) {
                        int i2 = this.f2987g;
                        return (i2 == 0 || i2 != aVar.f2987g || ((str = this.f2986f) == null ? aVar.f2986f == null : str.equals(aVar.f2986f))) && this.c == aVar.c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.f2984d ? 1231 : 1237)) * 31) + this.f2985e;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Column{name='");
            A.append(this.a);
            A.append('\'');
            A.append(", type='");
            A.append(this.b);
            A.append('\'');
            A.append(", affinity='");
            A.append(this.c);
            A.append('\'');
            A.append(", notNull=");
            A.append(this.f2984d);
            A.append(", primaryKeyPosition=");
            A.append(this.f2985e);
            A.append(", defaultValue='");
            A.append(this.f2986f);
            A.append('\'');
            A.append('}');
            return A.toString();
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f2988d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f2989e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f2988d = Collections.unmodifiableList(list);
            this.f2989e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.f2988d.equals(bVar.f2988d)) {
                return this.f2989e.equals(bVar.f2989e);
            }
            return false;
        }

        public int hashCode() {
            int I = f.a.b.a.a.I(this.c, f.a.b.a.a.I(this.b, this.a.hashCode() * 31, 31), 31);
            return this.f2989e.hashCode() + ((this.f2988d.hashCode() + I) * 31);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("ForeignKey{referenceTable='");
            A.append(this.a);
            A.append('\'');
            A.append(", onDelete='");
            A.append(this.b);
            A.append('\'');
            A.append(", onUpdate='");
            A.append(this.c);
            A.append('\'');
            A.append(", columnNames=");
            A.append(this.f2988d);
            A.append(", referenceColumnNames=");
            A.append(this.f2989e);
            A.append('}');
            return A.toString();
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: e.v.n.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0059c implements Comparable<C0059c> {

        /* renamed from: f  reason: collision with root package name */
        public final int f2990f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2991g;

        /* renamed from: h  reason: collision with root package name */
        public final String f2992h;

        /* renamed from: i  reason: collision with root package name */
        public final String f2993i;

        public C0059c(int i2, int i3, String str, String str2) {
            this.f2990f = i2;
            this.f2991g = i3;
            this.f2992h = str;
            this.f2993i = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(C0059c c0059c) {
            C0059c c0059c2 = c0059c;
            int i2 = this.f2990f - c0059c2.f2990f;
            return i2 == 0 ? this.f2991g - c0059c2.f2991g : i2;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c.equals(dVar.c)) {
                if (this.a.startsWith("index_")) {
                    return dVar.a.startsWith("index_");
                }
                return this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Index{name='");
            A.append(this.a);
            A.append('\'');
            A.append(", unique=");
            A.append(this.b);
            A.append(", columns=");
            A.append(this.c);
            A.append('}');
            return A.toString();
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.f2983d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static c a(e.x.a.b bVar, String str) {
        int i2;
        int i3;
        List<C0059c> list;
        int i4;
        e.x.a.f.a aVar = (e.x.a.f.a) bVar;
        Cursor g2 = aVar.g(f.a.b.a.a.q("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (g2.getColumnCount() > 0) {
                int columnIndex = g2.getColumnIndex("name");
                int columnIndex2 = g2.getColumnIndex(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
                int columnIndex3 = g2.getColumnIndex("notnull");
                int columnIndex4 = g2.getColumnIndex("pk");
                int columnIndex5 = g2.getColumnIndex("dflt_value");
                while (g2.moveToNext()) {
                    String string = g2.getString(columnIndex);
                    int i5 = columnIndex;
                    hashMap.put(string, new a(string, g2.getString(columnIndex2), g2.getInt(columnIndex3) != 0, g2.getInt(columnIndex4), g2.getString(columnIndex5), 2));
                    columnIndex = i5;
                }
            }
            g2.close();
            HashSet hashSet = new HashSet();
            g2 = aVar.g("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = g2.getColumnIndex(Chapter.KEY_ID);
                int columnIndex7 = g2.getColumnIndex("seq");
                int columnIndex8 = g2.getColumnIndex("table");
                int columnIndex9 = g2.getColumnIndex("on_delete");
                int columnIndex10 = g2.getColumnIndex("on_update");
                List<C0059c> b2 = b(g2);
                int count = g2.getCount();
                int i6 = 0;
                while (i6 < count) {
                    g2.moveToPosition(i6);
                    if (g2.getInt(columnIndex7) != 0) {
                        i2 = columnIndex6;
                        i3 = columnIndex7;
                        list = b2;
                        i4 = count;
                    } else {
                        int i7 = g2.getInt(columnIndex6);
                        i2 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i3 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b2).iterator();
                        while (it.hasNext()) {
                            List<C0059c> list2 = b2;
                            C0059c c0059c = (C0059c) it.next();
                            int i8 = count;
                            if (c0059c.f2990f == i7) {
                                arrayList.add(c0059c.f2992h);
                                arrayList2.add(c0059c.f2993i);
                            }
                            b2 = list2;
                            count = i8;
                        }
                        list = b2;
                        i4 = count;
                        hashSet.add(new b(g2.getString(columnIndex8), g2.getString(columnIndex9), g2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i6++;
                    columnIndex6 = i2;
                    columnIndex7 = i3;
                    b2 = list;
                    count = i4;
                }
                g2.close();
                g2 = aVar.g("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = g2.getColumnIndex("name");
                    int columnIndex12 = g2.getColumnIndex("origin");
                    int columnIndex13 = g2.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (g2.moveToNext()) {
                            if ("c".equals(g2.getString(columnIndex12))) {
                                d c = c(aVar, g2.getString(columnIndex11), g2.getInt(columnIndex13) == 1);
                                if (c != null) {
                                    hashSet3.add(c);
                                }
                            }
                        }
                        g2.close();
                        hashSet2 = hashSet3;
                        return new c(str, hashMap, hashSet, hashSet2);
                    }
                    return new c(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static List<C0059c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Chapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new C0059c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(e.x.a.b bVar, String str, boolean z) {
        Cursor g2 = ((e.x.a.f.a) bVar).g(f.a.b.a.a.q("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = g2.getColumnIndex("seqno");
            int columnIndex2 = g2.getColumnIndex("cid");
            int columnIndex3 = g2.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (g2.moveToNext()) {
                    if (g2.getInt(columnIndex2) >= 0) {
                        int i2 = g2.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i2), g2.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            g2.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str == null ? cVar.a == null : str.equals(cVar.a)) {
            Map<String, a> map = this.b;
            if (map == null ? cVar.b == null : map.equals(cVar.b)) {
                Set<b> set2 = this.c;
                if (set2 == null ? cVar.c == null : set2.equals(cVar.c)) {
                    Set<d> set3 = this.f2983d;
                    if (set3 == null || (set = cVar.f2983d) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("TableInfo{name='");
        A.append(this.a);
        A.append('\'');
        A.append(", columns=");
        A.append(this.b);
        A.append(", foreignKeys=");
        A.append(this.c);
        A.append(", indices=");
        A.append(this.f2983d);
        A.append('}');
        return A.toString();
    }
}
