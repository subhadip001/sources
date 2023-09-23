package com.google.android.gms.internal.common;

import f.a.b.a.a;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public final class zzy {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder E = a.E("<", str2, " threw ");
                    E.append(e2.getClass().getName());
                    E.append(">");
                    sb = E.toString();
                }
            }
            objArr[i3] = sb;
            i3++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i4, indexOf);
            sb2.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb2.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb2.append(", ");
                sb2.append(objArr[i5]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
