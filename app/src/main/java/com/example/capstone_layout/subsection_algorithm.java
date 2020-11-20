package com.example.capstone_layout;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class subsection_algorithm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subsection_algorithm);
        TabHost tabHost2 = (TabHost) findViewById(R.id.tabHost2);
        tabHost2.setup();

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost2.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.content1) ;
        ts1.setIndicator("알고리즘 설계") ;
        tabHost2.addTab(ts1) ;

        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost2.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.content2) ;
        ts2.setIndicator("알고리즘 분석") ;
        tabHost2.addTab(ts2) ;

    }
}
