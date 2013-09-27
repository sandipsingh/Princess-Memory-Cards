package com.memorycards.princess;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Help extends Activity {
	 RelativeLayout rr;
	   private AdView ad; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		rr = (RelativeLayout) findViewById(R.id.relative_home);      
		 String id = "a14feda38692f9a";       
			ad = new AdView(this, AdSize.SMART_BANNER, id);                       
		 rr.addView(ad);                             
		 ad.loadAd(new AdRequest());                                                           
	
	
	}

	
}
