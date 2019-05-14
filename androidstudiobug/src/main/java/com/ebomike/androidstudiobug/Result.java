package com.ebomike.androidstudiobug;

public class Result<T> {
    private void executeCallback(Runnable runnable) {
    }

    private void executeErrorCallback() {
        executeCallback(() -> handleError());
    }

    protected void handleError() {
    }
}
