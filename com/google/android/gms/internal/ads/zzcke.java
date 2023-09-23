package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcke extends SSLSocketFactory {
    public final SSLSocketFactory zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    public final /* synthetic */ zzckf zzb;

    public zzcke(zzckf zzckfVar) {
        this.zzb = zzckfVar;
    }

    private final Socket zza(Socket socket) {
        int i2;
        int i3;
        zzckf zzckfVar = this.zzb;
        i2 = zzckfVar.zzr;
        if (i2 > 0) {
            i3 = zzckfVar.zzr;
            socket.setReceiveBufferSize(i3);
        }
        this.zzb.zzs.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        Socket createSocket = this.zza.createSocket(str, i2);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = this.zza.createSocket(str, i2, inetAddress, i3);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        Socket createSocket = this.zza.createSocket(inetAddress, i2);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        Socket createSocket = this.zza.createSocket(inetAddress, i2, inetAddress2, i3);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        Socket createSocket = this.zza.createSocket(socket, str, i2, z);
        zza(createSocket);
        return createSocket;
    }
}
