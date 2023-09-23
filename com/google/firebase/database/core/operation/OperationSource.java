package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class OperationSource {
    private final QueryParams queryParams;
    private final Source source;
    private final boolean tagged;
    public static final OperationSource USER = new OperationSource(Source.User, null, false);
    public static final OperationSource SERVER = new OperationSource(Source.Server, null, false);

    /* loaded from: classes2.dex */
    public enum Source {
        User,
        Server
    }

    public OperationSource(Source source, QueryParams queryParams, boolean z) {
        this.source = source;
        this.queryParams = queryParams;
        this.tagged = z;
        Utilities.hardAssert(!z || isFromServer());
    }

    public static OperationSource forServerTaggedQuery(QueryParams queryParams) {
        return new OperationSource(Source.Server, queryParams, true);
    }

    public QueryParams getQueryParams() {
        return this.queryParams;
    }

    public boolean isFromServer() {
        return this.source == Source.Server;
    }

    public boolean isFromUser() {
        return this.source == Source.User;
    }

    public boolean isTagged() {
        return this.tagged;
    }

    public String toString() {
        StringBuilder A = a.A("OperationSource{source=");
        A.append(this.source);
        A.append(", queryParams=");
        A.append(this.queryParams);
        A.append(", tagged=");
        A.append(this.tagged);
        A.append('}');
        return A.toString();
    }
}
