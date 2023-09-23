package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i2) {
        zzb(parcel, i2);
    }

    public static void writeBigDecimal(Parcel parcel, int i2, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        zzb(parcel, zza);
    }

    public static void writeBigDecimalArray(Parcel parcel, int i2, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i3 = 0; i3 < length; i3++) {
            parcel.writeByteArray(bigDecimalArr[i3].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i3].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(Parcel parcel, int i2, BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bigInteger.toByteArray());
        zzb(parcel, zza);
    }

    public static void writeBigIntegerArray(Parcel parcel, int i2, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(Parcel parcel, int i2, boolean z) {
        zzc(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i2, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBooleanArray(zArr);
        zzb(parcel, zza);
    }

    public static void writeBooleanList(Parcel parcel, int i2, List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            zzc(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBundle(bundle);
        zzb(parcel, zza);
    }

    public static void writeByte(Parcel parcel, int i2, byte b) {
        zzc(parcel, i2, 4);
        parcel.writeInt(b);
    }

    public static void writeByteArray(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bArr);
        zzb(parcel, zza);
    }

    public static void writeByteArrayArray(Parcel parcel, int i2, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i2, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeByteArray(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(Parcel parcel, int i2, char c) {
        zzc(parcel, i2, 4);
        parcel.writeInt(c);
    }

    public static void writeCharArray(Parcel parcel, int i2, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeCharArray(cArr);
        zzb(parcel, zza);
    }

    public static void writeDouble(Parcel parcel, int i2, double d2) {
        zzc(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void writeDoubleArray(Parcel parcel, int i2, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeDoubleArray(dArr);
        zzb(parcel, zza);
    }

    public static void writeDoubleList(Parcel parcel, int i2, List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeDouble(list.get(i3).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(Parcel parcel, int i2, Double d2, boolean z) {
        if (d2 != null) {
            zzc(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i2, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeDouble(sparseArray.valueAt(i3).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(Parcel parcel, int i2, float f2) {
        zzc(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void writeFloatArray(Parcel parcel, int i2, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeFloatArray(fArr);
        zzb(parcel, zza);
    }

    public static void writeFloatList(Parcel parcel, int i2, List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeFloat(list.get(i3).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(Parcel parcel, int i2, Float f2, boolean z) {
        if (f2 != null) {
            zzc(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i2, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeFloat(sparseArray.valueAt(i3).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        zzb(parcel, zza);
    }

    public static void writeIBinderArray(Parcel parcel, int i2, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBinderArray(iBinderArr);
        zzb(parcel, zza);
    }

    public static void writeIBinderList(Parcel parcel, int i2, List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBinderList(list);
        zzb(parcel, zza);
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i2, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeStrongBinder(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(Parcel parcel, int i2, int i3) {
        zzc(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void writeIntArray(Parcel parcel, int i2, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeIntArray(iArr);
        zzb(parcel, zza);
    }

    public static void writeIntegerList(Parcel parcel, int i2, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(Parcel parcel, int i2, Integer num, boolean z) {
        if (num != null) {
            zzc(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeList(Parcel parcel, int i2, List list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeList(list);
        zzb(parcel, zza);
    }

    public static void writeLong(Parcel parcel, int i2, long j2) {
        zzc(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void writeLongArray(Parcel parcel, int i2, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeLongArray(jArr);
        zzb(parcel, zza);
    }

    public static void writeLongList(Parcel parcel, int i2, List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeLong(list.get(i3).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(Parcel parcel, int i2, Long l2, boolean z) {
        if (l2 != null) {
            zzc(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i2, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        zzb(parcel, zza);
    }

    public static void writeParcelArray(Parcel parcel, int i2, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(Parcel parcel, int i2, List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcel parcel2 = list.get(i3);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i2, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            Parcel valueAt = sparseArray.valueAt(i3);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        zzb(parcel, zza);
    }

    public static void writePendingIntent(Parcel parcel, int i2, PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        zzb(parcel, zza);
    }

    public static void writeShort(Parcel parcel, int i2, short s) {
        zzc(parcel, i2, 4);
        parcel.writeInt(s);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i2, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        zzb(parcel, zza);
    }

    public static void writeSparseIntArray(Parcel parcel, int i2, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseIntArray.keyAt(i3));
            parcel.writeInt(sparseIntArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(Parcel parcel, int i2, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseLongArray.keyAt(i3));
            parcel.writeLong(sparseLongArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeString(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeString(str);
        zzb(parcel, zza);
    }

    public static void writeStringArray(Parcel parcel, int i2, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStringArray(strArr);
        zzb(parcel, zza);
    }

    public static void writeStringList(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStringList(list);
        zzb(parcel, zza);
    }

    public static void writeStringSparseArray(Parcel parcel, int i2, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeString(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, i3);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i2, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            T valueAt = sparseArray.valueAt(i3);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
