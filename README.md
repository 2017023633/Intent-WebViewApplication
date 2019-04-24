# Intent-WebViewApplication  
### 内容：使用intent和webview实现简易的浏览网页功能  
### 代码： 
### Intent  
```
public class MainActivity extends AppCompatActivity {
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(android.view.View view){
        EditText text=(EditText)findViewById(R.id.text);
        url=text.getText().toString();
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.putExtra("signal",url);
        startActivity(intent);
    }
}
```  
### layout  
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
       <EditText
           android:id="@+id/text"
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:gravity="center"
           android:hint="输入网址"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="搜索"
            android:onClick="click" />
    </LinearLayout>
</LinearLayout>
```  
### WebView  
```
public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            String signal=bundle.getString("signal");
            webView.loadUrl(signal);
        }
    }
}
```  
### 截图：  
<img src="https://github.com/2017023633/Intent-WebViewApplication/blob/master/image/1.jpg" width="300" />  
<img src="https://github.com/2017023633/Intent-WebViewApplication/blob/master/image/2.jpg" width="300" />  
