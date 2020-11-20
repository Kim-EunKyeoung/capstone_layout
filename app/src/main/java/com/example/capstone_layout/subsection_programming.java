package com.example.capstone_layout;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class subsection_programming extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subsection_programming);
        TabHost tabHost3 = (TabHost) findViewById(R.id.tabHost3) ;
        tabHost3.setup() ;

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost3.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.content1) ;
        ts1.setIndicator("프로그래밍 환경") ;
        tabHost3.addTab(ts1)  ;

        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost3.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.content2) ;
        ts2.setIndicator("변수와 자료형") ;
        tabHost3.addTab(ts2) ;

        // 세 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3")
        TabHost.TabSpec ts3 = tabHost3.newTabSpec("Tab Spec 3") ;
        ts3.setContent(R.id.content3) ;
        ts3.setIndicator("연산자") ;
        tabHost3.addTab(ts3) ;

        // 네 번째 Tab. (탭 표시 텍스트:"TAB 4"), (페이지 뷰:"content4")
         TabHost.TabSpec ts4 = tabHost3.newTabSpec("Tab Spec 4") ;
        ts4.setContent(R.id.content4) ;
        ts4.setIndicator("표준입출력과 파일입출력") ;
        tabHost3.addTab(ts4)  ;

        // 다섯 번째 Tab. (탭 표시 텍스트:"TAB 5"), (페이지 뷰:"content5")
        TabHost.TabSpec ts5 = tabHost3.newTabSpec("Tab Spec 5") ;
        ts5.setContent(R.id.content5) ;
        ts5.setIndicator("제어구조의 활용") ;
        tabHost3.addTab(ts5) ;

        // 여섯 번째 Tab. (탭 표시 텍스트:"TAB 6"), (페이지 뷰:"content6")
        TabHost.TabSpec ts6 = tabHost3.newTabSpec("Tab Spec 6") ;
        ts6.setContent(R.id.content6) ;
        ts6.setIndicator("배열의 활용") ;
        tabHost3.addTab(ts6) ;

        // 일곱 번째 Tab. (탭 표시 텍스트:"TAB 7"), (페이지 뷰:"content7")
        TabHost.TabSpec ts7 = tabHost3.newTabSpec("Tab Spec 7") ;
        ts7.setContent(R.id.content7) ;
        ts7.setIndicator("함수의 활용") ;
        tabHost3.addTab(ts7)  ;

        // 여덟 번째 Tab. (탭 표시 텍스트:"TAB 8"), (페이지 뷰:"content8")
        TabHost.TabSpec ts8 = tabHost3.newTabSpec("Tab Spec 8") ;
        ts8.setContent(R.id.content8) ;
        ts8.setIndicator("프로그래밍 응용") ;
        tabHost3.addTab(ts8) ;
    }
}