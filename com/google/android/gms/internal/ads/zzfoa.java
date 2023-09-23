package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfoa {
    public static String zza(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (zze(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (zze(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (zzd(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (zzd(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                char charAt2 = charSequence2.charAt(i2);
                if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean zzd(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean zze(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int zzf(char c) {
        return (char) ((c | ' ') - 97);
    }
}
