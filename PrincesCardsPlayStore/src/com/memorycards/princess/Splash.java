package com.memorycards.princess;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;

public class Splash extends Activity implements AdListener
{
		RelativeLayout rl2;
	   private AdView ad; 
	   private InterstitialAd interstitial;
	    private com.pad.android.xappad.AdController myController,myController1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {               
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		ImageView iv=(ImageView)findViewById(R.id.imageView1);
		
		 interstitial = new InterstitialAd(this, "a150096d76a7e6e");

	      // Create ad request
	      AdRequest adRequest = new AdRequest();

	      // Begin loading your interstitial
	      interstitial.loadAd(adRequest);
	      interstitial.setAdListener(this);
		ImageView iv2=(ImageView)findViewById(R.id.imageView2);
		ImageView iv3=(ImageView)findViewById(R.id.imageView4);
		ImageView fb=(ImageView) findViewById(R.id.imageView3);
		fb.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri=Uri.parse("https://www.facebook.com/KewlApps");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				 startActivity(intent); 
			}
			
		})
		;
		rl2 = (RelativeLayout) findViewById(R.id.relative_home);           
		 String id = "a1500d017994319";
			ad = new AdView(this, AdSize.SMART_BANNER, id);     
		 rl2.addView(ad);
		 ad.loadAd(new AdRequest());    
		
		   myController = new com.pad.android.xappad.AdController(getApplicationContext(), "904914455");          
		     myController.loadIcon();     
		     
		     myController1 = new com.pad.android.xappad.AdController(getApplicationContext(), 
		       "648169806");
		     
		       myController1.loadNotification();    
		 
	
		
      iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			Splash.this.startActivity(new Intent(Splash.this,Stars.class));	
			}
		});
	
	 iv2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
				Uri uri=Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.painting.spider&showAll=1");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
				 startActivity(intent); 
				
			}
		});

	 iv3.setOnClickListener(new OnClickListener() {                       
			
			@Override
			public void onClick(View v) {
				
			Splash.this.startActivity(new Intent(Splash.this,Help.class));                 	         
			}
		});   
	}
	@Override
	public void onDismissScreen(Ad arg0) {
		
		
	}
	@Override
	public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
		
		
	}
	@Override
	public void onLeaveApplication(Ad arg0) {
		
	}
	@Override
	public void onPresentScreen(Ad arg0) {
	
		
	}
	@Override
	public void onReceiveAd(Ad ad) {
	 if (ad == interstitial) {
		       interstitial.show();
		     }
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
        if (event.getAction() == KeyEvent.ACTION_DOWN) 
        {
            switch (keyCode) 
            {
            
            case KeyEvent.KEYCODE_HOME:
                System.out.println("Home clicked....");
            return true;

            }
        }
        return super.onKeyDown(keyCode, event);
    }
	
	public void onStop()
	{
		super.onStop();
	//	finish();
	}
	
	public void onDestroy()
	{
		super.onDestroy();
	}
}
