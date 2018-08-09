package com.example.android.motivationalapp.data;

import com.example.android.motivationalapp.model.Quote;

import java.util.ArrayList;

public interface  QuoteAsyncResponse {
    void processFinished(ArrayList<Quote> quotes);
}
