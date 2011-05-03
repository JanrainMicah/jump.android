/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 Copyright (c) 2011, Janrain, Inc.

 All rights reserved.

 Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation and/or
   other materials provided with the distribution.
 * Neither the name of the Janrain, Inc. nor the names of its
   contributors may be used to endorse or promote products derived from this
   software without specific prior written permission.


 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 File:   DeeperWebViewActivity.java
 Author: Lilli Szafranski - lilli@janrain.com
 Date:   April 25, 2011
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package com.janrain.android.quickshare;

import android.app.Activity;
import android.os.Bundle;
import android.util.Config;
import android.util.Log;
import android.webkit.WebView;

public class DeeperWebViewActivity extends Activity {
    private static final String TAG = DeeperWebViewActivity.class.getSimpleName();

    private WebView mWebview;
    //private String mUrl;

    public void onCreate(Bundle savedInstanceState) {
        if (Config.LOGD)
            Log.d(TAG, "[onCreate]");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.deeper_webview);

        mWebview = (WebView)findViewById(R.id.deeper_webview);
        mWebview.loadUrl(FeedData.getInstance(this).getUrlToBeLoaded());

        if (Config.LOGD)
            Log.d(TAG, "[onCreate] loading url: " + FeedData.getInstance(this).getUrlToBeLoaded());
    }

//    public void loadUrl(String url) {
//        //mUrl = url;
//
//        mWebview.loadUrl(url);
//    }
}