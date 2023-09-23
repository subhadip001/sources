package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import f.h.b.b.f2.e;
import f.h.b.b.f2.j;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* loaded from: classes.dex */
public final class UdpDataSource extends e {

    /* renamed from: e  reason: collision with root package name */
    public final int f1013e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f1014f;

    /* renamed from: g  reason: collision with root package name */
    public final DatagramPacket f1015g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f1016h;

    /* renamed from: i  reason: collision with root package name */
    public DatagramSocket f1017i;

    /* renamed from: j  reason: collision with root package name */
    public MulticastSocket f1018j;

    /* renamed from: k  reason: collision with root package name */
    public InetAddress f1019k;

    /* renamed from: l  reason: collision with root package name */
    public InetSocketAddress f1020l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1021m;
    public int n;

    /* loaded from: classes.dex */
    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f1013e = 8000;
        byte[] bArr = new byte[2000];
        this.f1014f = bArr;
        this.f1015g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.f1017i.receive(this.f1015g);
                int length = this.f1015g.getLength();
                this.n = length;
                p(length);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2);
            }
        }
        int length2 = this.f1015g.getLength();
        int i4 = this.n;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f1014f, length2 - i4, bArr, i2, min);
        this.n -= min;
        return min;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.f1016h = null;
        MulticastSocket multicastSocket = this.f1018j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f1019k);
            } catch (IOException unused) {
            }
            this.f1018j = null;
        }
        DatagramSocket datagramSocket = this.f1017i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f1017i = null;
        }
        this.f1019k = null;
        this.f1020l = null;
        this.n = 0;
        if (this.f1021m) {
            this.f1021m = false;
            q();
        }
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        Uri uri = jVar.a;
        this.f1016h = uri;
        String host = uri.getHost();
        int port = this.f1016h.getPort();
        r(jVar);
        try {
            this.f1019k = InetAddress.getByName(host);
            this.f1020l = new InetSocketAddress(this.f1019k, port);
            if (this.f1019k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f1020l);
                this.f1018j = multicastSocket;
                multicastSocket.joinGroup(this.f1019k);
                this.f1017i = this.f1018j;
            } else {
                this.f1017i = new DatagramSocket(this.f1020l);
            }
            try {
                this.f1017i.setSoTimeout(this.f1013e);
                this.f1021m = true;
                s(jVar);
                return -1L;
            } catch (SocketException e2) {
                throw new UdpDataSourceException(e2);
            }
        } catch (IOException e3) {
            throw new UdpDataSourceException(e3);
        }
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.f1016h;
    }
}
