package com.tonyshark.store;

public interface StoreListener {
    void onSuccess(int pValue);

    void onSuccess(String pValue);

    void onSuccess(Color pValue);
}
