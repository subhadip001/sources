package com.google.android.gms.internal.ads;

import android.util.Pair;
import f.a.b.a.a;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaih {
    public static X509Certificate[][] zza(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaii.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j2 = (-20) + longValue;
                if (j2 >= 0) {
                    randomAccessFile.seek(j2);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaie("ZIP64 APK not supported");
                    }
                }
                long zza = zzaii.zza(byteBuffer);
                if (zza < longValue) {
                    if (zzaii.zzb(byteBuffer) + zza == longValue) {
                        if (zza >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(zza - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                int i2 = 0;
                                long j3 = allocate.getLong(0);
                                if (j3 < allocate.capacity() || j3 > 2147483639) {
                                    StringBuilder sb = new StringBuilder(57);
                                    sb.append("APK Signing Block size out of range: ");
                                    sb.append(j3);
                                    throw new zzaie(sb.toString());
                                }
                                int i3 = (int) (8 + j3);
                                long j4 = zza - i3;
                                if (j4 >= 0) {
                                    ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                                    allocate2.order(byteOrder);
                                    randomAccessFile.seek(j4);
                                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                    long j5 = allocate2.getLong(0);
                                    if (j5 == j3) {
                                        Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                        long longValue2 = ((Long) create.second).longValue();
                                        if (byteBuffer2.order() == byteOrder) {
                                            int capacity = byteBuffer2.capacity() - 24;
                                            if (capacity >= 8) {
                                                int capacity2 = byteBuffer2.capacity();
                                                if (capacity <= byteBuffer2.capacity()) {
                                                    int limit = byteBuffer2.limit();
                                                    int position = byteBuffer2.position();
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(capacity);
                                                    byteBuffer2.position(8);
                                                    ByteBuffer slice = byteBuffer2.slice();
                                                    slice.order(byteBuffer2.order());
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    while (slice.hasRemaining()) {
                                                        i2++;
                                                        if (slice.remaining() >= 8) {
                                                            long j6 = slice.getLong();
                                                            if (j6 >= 4 && j6 <= 2147483647L) {
                                                                int i4 = (int) j6;
                                                                int position2 = slice.position() + i4;
                                                                if (i4 <= slice.remaining()) {
                                                                    if (slice.getInt() == 1896449818) {
                                                                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzaid(zze(slice, i4 - 4), longValue2, zza, longValue, byteBuffer, null));
                                                                        randomAccessFile.close();
                                                                        return zzl;
                                                                    }
                                                                    slice.position(position2);
                                                                } else {
                                                                    int remaining = slice.remaining();
                                                                    StringBuilder sb2 = new StringBuilder(91);
                                                                    sb2.append("APK Signing Block entry #");
                                                                    sb2.append(i2);
                                                                    sb2.append(" size out of range: ");
                                                                    sb2.append(i4);
                                                                    sb2.append(", available: ");
                                                                    sb2.append(remaining);
                                                                    throw new zzaie(sb2.toString());
                                                                }
                                                            } else {
                                                                StringBuilder sb3 = new StringBuilder(76);
                                                                sb3.append("APK Signing Block entry #");
                                                                sb3.append(i2);
                                                                sb3.append(" size out of range: ");
                                                                sb3.append(j6);
                                                                throw new zzaie(sb3.toString());
                                                            }
                                                        } else {
                                                            StringBuilder sb4 = new StringBuilder(70);
                                                            sb4.append("Insufficient data to read size of APK Signing Block entry #");
                                                            sb4.append(i2);
                                                            throw new zzaie(sb4.toString());
                                                        }
                                                    }
                                                    throw new zzaie("No APK Signature Scheme v2 block in APK Signing Block");
                                                }
                                                StringBuilder sb5 = new StringBuilder(41);
                                                sb5.append("end > capacity: ");
                                                sb5.append(capacity);
                                                sb5.append(" > ");
                                                sb5.append(capacity2);
                                                throw new IllegalArgumentException(sb5.toString());
                                            }
                                            StringBuilder sb6 = new StringBuilder(38);
                                            sb6.append("end < start: ");
                                            sb6.append(capacity);
                                            sb6.append(" < ");
                                            sb6.append(8);
                                            throw new IllegalArgumentException(sb6.toString());
                                        }
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                    StringBuilder sb7 = new StringBuilder(103);
                                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                                    sb7.append(j5);
                                    sb7.append(" vs ");
                                    sb7.append(j3);
                                    throw new zzaie(sb7.toString());
                                }
                                StringBuilder sb8 = new StringBuilder(59);
                                sb8.append("APK Signing Block offset out of range: ");
                                sb8.append(j4);
                                throw new zzaie(sb8.toString());
                            }
                            throw new zzaie("No APK Signing Block before ZIP Central Directory");
                        }
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(zza);
                        throw new zzaie(sb9.toString());
                    }
                    throw new zzaie("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                StringBuilder sb10 = new StringBuilder(122);
                sb10.append("ZIP Central Directory offset out of range: ");
                sb10.append(zza);
                sb10.append(". ZIP End of Central Directory offset: ");
                sb10.append(longValue);
                throw new zzaie(sb10.toString());
            }
            long length = randomAccessFile.length();
            StringBuilder sb11 = new StringBuilder(102);
            sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb11.append(length);
            sb11.append(" bytes");
            throw new zzaie(sb11.toString());
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 64;
            }
            throw new IllegalArgumentException(a.d(44, "Unknown content digest algorthm: ", i2));
        }
        return 32;
    }

    private static int zzc(int i2) {
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != 769) {
                    switch (i2) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i2));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(a.d(44, "Unknown content digest algorthm: ", i2));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i2) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (i3 >= position && i3 <= limit) {
            byteBuffer.limit(i3);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i3);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 >= 0) {
                if (i2 <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i2);
                }
                throw new IOException(a.e(101, "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(a.d(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            zzaic zzaicVar = new zzaic(fileChannel, 0L, j2);
            zzaic zzaicVar2 = new zzaic(fileChannel, j3, j4 - j3);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaii.zzd(duplicate, j2);
            zzaia zzaiaVar = new zzaia(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i2 = 0;
            for (Integer num : map.keySet()) {
                iArr[i2] = num.intValue();
                i2++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaib[]{zzaicVar, zzaicVar2, zzaiaVar});
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = iArr[i3];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), zzk[i3])) {
                        throw new SecurityException(zzd(i4).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e2) {
                throw new SecurityException("Failed to compute digest(s) of contents", e2);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt();
        if (i2 >= 0) {
            if (i2 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(a.e(90, "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r10);
        r12 = zzc(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaih.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaib[] zzaibVarArr) {
        long j2;
        int i2;
        int length;
        long j3 = 0;
        int i3 = 0;
        int i4 = 0;
        long j4 = 0;
        while (true) {
            j2 = 1048576;
            if (i4 >= 3) {
                break;
            }
            j4 += (zzaibVarArr[i4].zza() + 1048575) / 1048576;
            i4++;
        }
        if (j4 < 2097151) {
            int i5 = (int) j4;
            byte[][] bArr = new byte[iArr.length];
            int i6 = 0;
            while (true) {
                length = iArr.length;
                if (i6 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[(zzb(iArr[i6]) * i5) + 5];
                bArr2[0] = 90;
                zzg(i5, bArr2, 1);
                bArr[i6] = bArr2;
                i6++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                String zzd = zzd(iArr[i7]);
                try {
                    messageDigestArr[i7] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e2);
                }
            }
            int i8 = 0;
            int i9 = 0;
            for (i2 = 3; i8 < i2; i2 = 3) {
                zzaib zzaibVar = zzaibVarArr[i8];
                int i10 = i8;
                int i11 = i9;
                long zza = zzaibVar.zza();
                long j5 = j2;
                long j6 = j3;
                while (zza > j3) {
                    int min = (int) Math.min(zza, j5);
                    zzg(min, bArr3, 1);
                    for (int i12 = 0; i12 < length; i12++) {
                        messageDigestArr[i12].update(bArr3);
                    }
                    try {
                        zzaibVar.zzb(messageDigestArr, j6, min);
                        int i13 = 0;
                        while (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            byte[] bArr4 = bArr[i13];
                            int zzb = zzb(i14);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i11 * zzb) + 5, zzb);
                            if (digest != zzb) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                            i13++;
                            bArr3 = bArr5;
                            messageDigestArr = messageDigestArr2;
                        }
                        long j7 = min;
                        j6 += j7;
                        zza -= j7;
                        i11++;
                        j3 = 0;
                        j5 = 1048576;
                    } catch (IOException e3) {
                        throw new DigestException(a.e(59, "Failed to digest chunk #", i11, " of section #", i3), e3);
                    }
                }
                i9 = i11;
                i3++;
                i8 = i10 + 1;
                j3 = 0;
                j2 = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int i16 = iArr[i15];
                byte[] bArr7 = bArr[i15];
                String zzd2 = zzd(i16);
                try {
                    bArr6[i15] = MessageDigest.getInstance(zzd2).digest(bArr7);
                } catch (NoSuchAlgorithmException e4) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e4);
                }
            }
            return bArr6;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Too many chunks: ");
        sb2.append(j4);
        throw new DigestException(sb2.toString());
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaid zzaidVar) {
        ByteBuffer byteBuffer;
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaidVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i2 = 0;
                while (zzf.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 > 0) {
                    if (!hashMap.isEmpty()) {
                        j2 = zzaidVar.zzb;
                        j3 = zzaidVar.zzc;
                        j4 = zzaidVar.zzd;
                        byteBuffer2 = zzaidVar.zze;
                        zzh(hashMap, fileChannel, j2, j3, j4, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }
}
