
package com.memorycards.princess;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


import android.app.Activity;
import android.app.Dialog;

import android.content.Intent;
import android.content.SharedPreferences;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SixteenCards extends Activity implements OnClickListener {
 RelativeLayout rr;
	 SharedPreferences myPrefs;
	private AdView ad; 
	private MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;
	private TextView tv;
	private int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0, count8=0, success1=0;
	private Bitmap bm, bm1, bm2, bm3, bm4, bm5, bm6, bm7, bm8, bm9, bm10, bm11,
			bm12,star_1,star_2;
	private ImageView i, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12,
			i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25,
			i26,myim, ii1, ii2, ii3, ii4, ii5, ii6, iii1,iii2,iii3, iii4, iii5, iii6;
	private Intent in;
	
	private static int k = 1;
	private int match=0,match1=0;
	int count=0,match3=0;
	Handler hRefresh;
	private boolean isFirstImage = true;                                               
	private boolean isSecondImage = true;                      
	private boolean isThirdImage = true;
	private boolean isFourthImage = true;                      
	private boolean isFifthImage = true;
	private boolean isSixthImage = true;
	private boolean isSeventhImage = true;
	private boolean isEigthImage = true;
	private boolean isNinthImage = true;
	private boolean isTenthImage = true;
	private boolean isEleventhImage = true;
	private boolean isTwelvethImage = true;
	private boolean isThirteenthImage = true;
	private boolean isFifteenthImage = true;
	private boolean isFourteenthImage = true;
	private boolean isSixteenthImage = true;
	private boolean isSeventeenthImage = true;
	private boolean isEightteenthImage = true;
	
	
	private Handler handler;        
	private int temp = 0;
	private int m;
	private RelativeLayout rl, rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8, rl9,
			rl10, rl11, rl13, rl14, rl15, rl16, rl17, rl18;
	private String g, h;
	public Object s, s1, ro, ro1, no, no1;
	private int success = 0;
	
  private Button button_next;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		System.gc();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixteen_cards);
		 
          tv=(TextView)findViewById(R.id.textView1);
          bm3 = BitmapFactory.decodeResource(getResources(), R.drawable.mem);//Meldoy
  		bm4 = BitmapFactory.decodeResource(getResources(), R.drawable.mem2);//Baby-belle
  		bm5 = BitmapFactory.decodeResource(getResources(), R.drawable.mem3);//Belle
  		bm6 = BitmapFactory.decodeResource(getResources(), R.drawable.mem4);//Aurora
  		bm7 = BitmapFactory.decodeResource(getResources(), R.drawable.mem5);//Zelda
  		bm8 = BitmapFactory.decodeResource(getResources(), R.drawable.mem6);     //Eilonway
		
		//*************NEW
		bm9= BitmapFactory.decodeResource(getResources(), R.drawable.memmm);//Magera
		bm10= BitmapFactory.decodeResource(getResources(), R.drawable.memmm2);//Pocahontus
		
		star_1 = BitmapFactory.decodeResource(getResources(), R.drawable.star);
		star_2 = BitmapFactory.decodeResource(getResources(), R.drawable.star2);
		
		//12
		i14 = (ImageView) findViewById(R.id.imageView4);
		i15 = (ImageView) findViewById(R.id.imageView6);
		i16 = (ImageView) findViewById(R.id.imageView8);
		i17 = (ImageView) findViewById(R.id.imageView10);
		i18 = (ImageView) findViewById(R.id.imageView12);
		i19 = (ImageView) findViewById(R.id.imageView14);
		i20 = (ImageView) findViewById(R.id.imageView16);
	//	i21 = (ImageView) findViewById(R.id.imageView18);
		i22 = (ImageView) findViewById(R.id.imageView20);
		i23 = (ImageView) findViewById(R.id.imageView22);
	//	i24 = (ImageView) findViewById(R.id.imageView24);                     
		i25 = (ImageView) findViewById(R.id.imageView26);
	
		
		//***************NEW
		ii1 = (ImageView) findViewById(R.id.img2);
		ii2 = (ImageView) findViewById(R.id.img4);
		ii3 = (ImageView) findViewById(R.id.img6);
		ii4 = (ImageView) findViewById(R.id.img8);
		ii5 = (ImageView) findViewById(R.id.img10);
		ii6 = (ImageView) findViewById(R.id.img12);
		
//		mediaPlayer1=MediaPlayer.create(MemoryCard2.this, R.raw.pop);    
//	    mediaPlayer2=MediaPlayer.create(MemoryCard2.this, R.raw.trumpet);  
//		mediaPlayer3=MediaPlayer.create(MemoryCard2.this, R.raw.correct); 
		
		rr = (RelativeLayout) findViewById(R.id.relative_home); 
		 String id = "a1500d017994319";
			ad = new AdView(this, AdSize.SMART_BANNER, id);
		 rr.addView(ad);
		 ad.loadAd(new AdRequest());  
		
		 int j=0 + (int)(Math.random() * ((5 -0) + 1));
		 System.out.println("random no is  "+j);
		if (j == 0) {
			i14.setImageBitmap(bm3);                  
			i14.setTag("Meldoy");
			i15.setImageBitmap(bm4);     
			i15.setTag("Baby-belle");
			i16.setImageBitmap(bm5);
			i16.setTag("Belle");
			i17.setImageBitmap(bm6);    
			i17.setTag("Aurora");
			i18.setImageBitmap(bm7);
			i18.setTag("Zelda");
			i19.setImageBitmap(bm8);
			i19.setTag("Eilonway");
			i20.setImageBitmap(bm9);
			i20.setTag("Magera");
			i22.setImageBitmap(bm10);
			i22.setTag("Pocahontus");
			
			i23.setImageBitmap(bm10);
			i23.setTag("Pocahontus");
			i25.setImageBitmap(bm9);
			i25.setTag("Magera");
			ii1.setImageBitmap(bm8);
			ii1.setTag("Eilonway");
			ii2.setImageBitmap(bm7);
			ii2.setTag("Zelda");
			ii3.setImageBitmap(bm6);
			ii3.setTag("Aurora");
			ii4.setImageBitmap(bm5);
			ii4.setTag("Belle");
			ii5.setImageBitmap(bm4);
			ii5.setTag("Baby-belle");
			ii6.setImageBitmap(bm3);
			ii6.setTag("Meldoy");
		}
		if (j == 1) {
			i14.setImageBitmap(bm5);
			i14.setTag("Belle");
			i15.setImageBitmap(bm6);
			i15.setTag("Aurora");
			i16.setImageBitmap(bm7);
			i16.setTag("Zelda");
			i17.setImageBitmap(bm8);
			i17.setTag("Eilonway");
			i18.setImageBitmap(bm9);
			i18.setTag("Magera");
			i19.setImageBitmap(bm10);
			i19.setTag("Pocahontus");
			i20.setImageBitmap(bm3);
			i20.setTag("Meldoy");
			i22.setImageBitmap(bm4);
			i22.setTag("Baby-belle");
		
			i23.setImageBitmap(bm4);
			i23.setTag("Baby-belle");
			i25.setImageBitmap(bm3);
			i25.setTag("Meldoy");
			ii1.setImageBitmap(bm10);
			ii1.setTag("Pocahontus");
			ii2.setImageBitmap(bm9);
			ii2.setTag("Magera");
			ii3.setImageBitmap(bm8);
			ii3.setTag("Eilonway");
			ii4.setImageBitmap(bm7);
			ii4.setTag("Zelda");
			ii5.setImageBitmap(bm6);
			ii5.setTag("Aurora");
			ii6.setImageBitmap(bm5);
			ii6.setTag("Belle");
		}
		if (j == 2) {
			i14.setImageBitmap(bm6);
			i14.setTag("Aurora");
			i15.setImageBitmap(bm7);
			i15.setTag("Zelda");
			i16.setImageBitmap(bm8);
			i16.setTag("Eilonway");
			i17.setImageBitmap(bm9);
			i17.setTag("Magera");
			i18.setImageBitmap(bm10);
			i18.setTag("Pocahontus");
			i19.setImageBitmap(bm3);
			i19.setTag("Meldoy");
			i20.setImageBitmap(bm4);
			i20.setTag("Baby-belle");
			i22.setImageBitmap(bm5);
			i22.setTag("Belle");
		
			i23.setImageBitmap(bm5);
			i23.setTag("Belle");
			i25.setImageBitmap(bm4);
			i25.setTag("Baby-belle");
			ii1.setImageBitmap(bm3);
			ii1.setTag("Meldoy");
			ii2.setImageBitmap(bm10);
			ii2.setTag("Pocahontus");
			ii3.setImageBitmap(bm9);
			ii3.setTag("Magera");
			ii4.setImageBitmap(bm8);
			ii4.setTag("Eilonway");
			ii5.setImageBitmap(bm7);
			ii5.setTag("Zelda");
			ii6.setImageBitmap(bm6);
			ii6.setTag("Aurora");
		}
		if (j == 3) {
			i14.setImageBitmap(bm7);
			i14.setTag("Zelda");
			i15.setImageBitmap(bm8);
			i15.setTag("Eilonway");
			i16.setImageBitmap(bm9);
			i16.setTag("Magera");
			i17.setImageBitmap(bm10);
			i17.setTag("Pocahontus");
			i18.setImageBitmap(bm3);
			i18.setTag("Meldoy");
			i19.setImageBitmap(bm4);
			i19.setTag("Baby-belle");
			i20.setImageBitmap(bm5);
			i20.setTag("Belle");
			i22.setImageBitmap(bm6);
			i22.setTag("Aurora");
			
			i23.setImageBitmap(bm6);
			i23.setTag("Aurora");
			i25.setImageBitmap(bm5);
			i25.setTag("Belle");
			ii1.setImageBitmap(bm4);
			ii1.setTag("Baby-belle");
			ii2.setImageBitmap(bm3);
			ii2.setTag("Meldoy");
			ii3.setImageBitmap(bm10);
			ii3.setTag("Pocahontus");
			ii4.setImageBitmap(bm9);
			ii4.setTag("Magera");
			ii5.setImageBitmap(bm8);
			ii5.setTag("Eilonway");
			ii6.setImageBitmap(bm7);
			ii6.setTag("Zelda");
		}
		if (j == 4) {
			i14.setImageBitmap(bm8); 
			i14.setTag("Eilonway");
			i15.setImageBitmap(bm9);
			i15.setTag("Magera");
			i16.setImageBitmap(bm10);
			i16.setTag("Pocahontus");
			i17.setImageBitmap(bm3);
			i17.setTag("Meldoy");
			i18.setImageBitmap(bm4);
			i18.setTag("Baby-belle");
			i19.setImageBitmap(bm5);
			i19.setTag("Belle");
			i20.setImageBitmap(bm6);
			i20.setTag("Aurora");
			i22.setImageBitmap(bm7);
			i22.setTag("Zelda");
		
			i23.setImageBitmap(bm7);
			i23.setTag("Zelda");
			i25.setImageBitmap(bm6);
			i25.setTag("Aurora");
			ii1.setImageBitmap(bm5);
			ii1.setTag("Belle");
			ii2.setImageBitmap(bm4);
			ii2.setTag("Baby-belle");
			ii3.setImageBitmap(bm3);
			ii3.setTag("Meldoy");
			ii4.setImageBitmap(bm10);
			ii4.setTag("Pocahontus");
			ii5.setImageBitmap(bm9);
			ii5.setTag("Magera");
			ii6.setImageBitmap(bm8);
			ii6.setTag("Eilonway");
		}
		if (j == 5) {
			i14.setImageBitmap(bm9);
			i14.setTag("Magera");
			i15.setImageBitmap(bm10);
			i15.setTag("Pocahontus");
			i16.setImageBitmap(bm3);
			i16.setTag("Meldoy");
			i17.setImageBitmap(bm4);
			i17.setTag("Baby-belle");
			i18.setImageBitmap(bm5);    
			i18.setTag("Belle");
			i19.setImageBitmap(bm6);
			i19.setTag("Aurora");
			i20.setImageBitmap(bm7);
			i20.setTag("Zelda");
			i22.setImageBitmap(bm8);
			i22.setTag("Eilonway");
		
			i23.setImageBitmap(bm8);
			i23.setTag("Eilonway");
			i25.setImageBitmap(bm7);
			i25.setTag("Zelda");
			ii1.setImageBitmap(bm6);
			ii1.setTag("Aurora");
			ii2.setImageBitmap(bm5);
			ii2.setTag("Belle");
			ii3.setImageBitmap(bm4);
			ii3.setTag("Baby-belle");
			ii4.setImageBitmap(bm3);
			ii4.setTag("Meldoy");
			ii5.setImageBitmap(bm10);
			ii5.setTag("Pocahontus");
			ii6.setImageBitmap(bm9);
			ii6.setTag("Magera");
		}
		
//	ImageView iv_help=(ImageView)findViewById(R.id.imageView3);
//		iv_help.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//			MemoryCard2.this.startActivity(new Intent(MemoryCard2.this,Help.class));	
//			}
//		});
		
		
		
		
		
				i = (ImageView) findViewById(R.id.imageView1);

		bm1 = BitmapFactory.decodeResource(getResources(),               
				R.drawable.ic_memory_frnt);
		i1 = (ImageView) findViewById(R.id.imageView5);
		i1.setImageBitmap(bm1);
		i1.setTag("isFirstImage");
		i14.setVisibility(View.GONE);                 
		
		i2 = (ImageView) findViewById(R.id.imageView7);
		i2.setImageBitmap(bm1);
		i2.setTag("isSecondImage");
		i15.setVisibility(View.GONE);      
		
		i3 = (ImageView) findViewById(R.id.imageView9);
		i3.setImageBitmap(bm1);
		i3.setTag("isThirdImage");
		i16.setVisibility(View.GONE);
		
		i4 = (ImageView) findViewById(R.id.imageView11);
		i4.setImageBitmap(bm1);
		i4.setTag("isFourthImage");
		i17.setVisibility(View.GONE);
		
		i5 = (ImageView) findViewById(R.id.imageView13);
		i5.setImageBitmap(bm1);
		i5.setTag("isFifthImage");
		i18.setVisibility(View.GONE);
		
		i6 = (ImageView) findViewById(R.id.imageView15);
		i6.setImageBitmap(bm1);
		i6.setTag("isSixthImage");
		i19.setVisibility(View.GONE);
		
		i7 = (ImageView) findViewById(R.id.imageView17);
		i7.setImageBitmap(bm1);
		i7.setTag("isSeventhImage");
		i20.setVisibility(View.GONE);
//		
//		i8 = (ImageView) findViewById(R.id.imageView19);
//		i8.setImageBitmap(bm1);
//		i8.setTag("isEigthImage");
//		i21.setVisibility(View.GONE);
		
		i9 = (ImageView) findViewById(R.id.imageView21);
		i9.setImageBitmap(bm1);
		i9.setTag("isNinthImage");
		i22.setVisibility(View.GONE);
		
		i10 = (ImageView) findViewById(R.id.imageView23);
		i10.setImageBitmap(bm1);
		i10.setTag("isTenthImage");
		i23.setVisibility(View.GONE);
		
//		i11 = (ImageView) findViewById(R.id.imageView25);
//		i11.setImageBitmap(bm1);
//		i11.setTag("isEleventhImage");
//		i24.setVisibility(View.GONE);
		
		i12 = (ImageView) findViewById(R.id.imageView27);
		i12.setImageBitmap(bm1);
		i12.setTag("isTwelvethImage");
		i25.setVisibility(View.GONE);
		
		iii1 = (ImageView) findViewById(R.id.img1);
		iii1.setImageBitmap(bm1);
		iii1.setTag("isThirteenthImage");
		ii1.setVisibility(View.GONE);
		
		iii2 = (ImageView) findViewById(R.id.img3);
		iii2.setImageBitmap(bm1);
		iii2.setTag("isFourteenthImage");
		ii2.setVisibility(View.GONE);
		
		iii3 = (ImageView) findViewById(R.id.img5);
		iii3.setImageBitmap(bm1);
		iii3.setTag("isFifteenthImage");
		ii3.setVisibility(View.GONE);
		
		iii4 = (ImageView) findViewById(R.id.img7);
		iii4.setImageBitmap(bm1);
		iii4.setTag("isSixteenthImage");
		ii4.setVisibility(View.GONE);
		
		iii5 = (ImageView) findViewById(R.id.img9);
		iii5.setImageBitmap(bm1);
		iii5.setTag("isSeventeenthImage");
		ii5.setVisibility(View.GONE);
		
		iii6 = (ImageView) findViewById(R.id.img11);
		iii6.setImageBitmap(bm1);
		iii6.setTag("isEightteenthImage");
		ii6.setVisibility(View.GONE);
		
		i13 = (ImageView) findViewById(R.id.imageView2);
		bm2 = BitmapFactory.decodeResource(getResources(), R.drawable.home_lable);
		i13.setImageBitmap(bm2);
		//i13.setPadding(10, 10, 10, 10);
		
		
		i.setOnClickListener(this);
		i1.setOnClickListener(this);
		i2.setOnClickListener(this);
		i3.setOnClickListener(this);
		i4.setOnClickListener(this);
		i5.setOnClickListener(this);
		i6.setOnClickListener(this);
		i7.setOnClickListener(this);
	//	i8.setOnClickListener(this);
		i9.setOnClickListener(this);
		i10.setOnClickListener(this);
	//	i11.setOnClickListener(this);
		i12.setOnClickListener(this);
		iii1.setOnClickListener(this);
		iii2.setOnClickListener(this);
		iii3.setOnClickListener(this);
		iii4.setOnClickListener(this);
		iii5.setOnClickListener(this);
		iii6.setOnClickListener(this);
		
		i13.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				SixteenCards.this.startActivity(new Intent(SixteenCards.this,Splash.class));
				SixteenCards.this.finish();
				
			}

		});
		if(count==1){
			
		}
	}

	

	

	private void applyRotation(float start, float end) {                            
		// Find the center of image
		final float centerX = i1.getWidth() / 2.0f;
		final float centerY = i14.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,                        
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFirstImage, i1, i14));
		if (isFirstImage) {
			
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}                    
				i1.startAnimation(rotation);
			   i1.setClickable(false);
		} else {
			i14.startAnimation(rotation);
		}
	}

	private void applyRotation1(float start, float end) {
		// Find the center of image
		final float centerX = i2.getWidth() / 2.0f;
		final float centerY = i15.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSecondImage, i2,
				i15));
		if (isSecondImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i2.startAnimation(rotation);
			i2.setClickable(false);
		} else {
			i15.startAnimation(rotation);
		}
	}

	private void applyRotation2(float start, float end) {
		// Find the center of image
		final float centerX = i3.getWidth() / 2.0f;
		final float centerY = i16.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isThirdImage, i3, i16));
		if (isThirdImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i3.setClickable(false);
			i3.startAnimation(rotation);         
		} else {
			i16.startAnimation(rotation);                  
		}
	}

	private void applyRotation3(float start, float end) {
		// Find the center of image
		final float centerX = i4.getWidth() / 2.0f;
		final float centerY = i17.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFourthImage, i4,
				i17));
		if (isFourthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i4.setClickable(false);
			i4.startAnimation(rotation);
		} else {
			i17.startAnimation(rotation);
		}
	}

	private void applyRotation4(float start, float end) {
		// Find the center of image
		final float centerX = i5.getWidth() / 2.0f;
		final float centerY = i18.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFifthImage, i5, i18));
		if (isFifthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i5.setClickable(false);
			i5.startAnimation(rotation);            
		} else {
			i18.startAnimation(rotation);            
		}
	}

	private void applyRotation6(float start, float end) {
		// Find the center of image
		final float centerX = i6.getWidth() / 2.0f;
		final float centerY = i19.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSixthImage, i6, i19));
		if (isSixthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i6.setClickable(false);
			i6.startAnimation(rotation);
		} else {
			i19.startAnimation(rotation);
		}
	}

	private void applyRotation7(float start, float end) {
		// Find the center of image
		final float centerX = i7.getWidth() / 2.0f;
		final float centerY = i20.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSeventhImage, i7,
				i20));
		if (isSeventhImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i7.setClickable(false);
			i7.startAnimation(rotation);
		} else {
			i20.startAnimation(rotation);
		}
	}

	private void applyRotation8(float start, float end) {
		// Find the center of image
		final float centerX = i8.getWidth() / 2.0f;
		final float centerY = i21.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isEigthImage, i8, i21));
		if (isEigthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i8.setClickable(false);
			i8.startAnimation(rotation);
		} else {                                                                    
			i21.startAnimation(rotation);
		}
	}

	private void applyRotation9(float start, float end) {
		// Find the center of image
		final float centerX = i9.getWidth() / 2.0f;
		final float centerY = i22.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isNinthImage, i9, i22));
		if (isNinthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i9.setClickable(false);
			i9.startAnimation(rotation);
		} else {
			i22.startAnimation(rotation);
		}
	}

	private void applyRotation10(float start, float end) {
		// Find the center of image
		final float centerX = i10.getWidth() / 2.0f;
		final float centerY = i23.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isTenthImage, i10,
				i23));
		if (isTenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i10.setClickable(false);
			i10.startAnimation(rotation);
		} else {
			i23.startAnimation(rotation);
		}
	}

	private void applyRotation11(float start, float end) {
		// Find the center of image
		final float centerX = i11.getWidth() / 2.0f;
		final float centerY = i24.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		// The animation listener is used to trigger the next animation
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isEleventhImage, i11,
				i24));
		if (isEleventhImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i11.setClickable(false);
			i11.startAnimation(rotation);
		} else {
			i24.startAnimation(rotation);
		}
	}

	private void applyRotation12(float start, float end) {
		// Find the center of image
		final float centerX = i12.getWidth() / 2.0f;
		final float centerY = i25.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isTwelvethImage, i12,
				i25));
		if (isTwelvethImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			i12.setClickable(false);
			i12.startAnimation(rotation);
		} else {
			i25.startAnimation(rotation);
		}
	}
	private void applyRotation13(float start, float end) {
		// Find the center of image
		final float centerX = iii1.getWidth() / 2.0f;
		final float centerY = ii1.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isThirteenthImage, iii1,
				ii1));
		if (isThirteenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii1.setClickable(false);
			iii1.startAnimation(rotation);
		} else {
			ii1.startAnimation(rotation);
		}
	}
	private void applyRotation14(float start, float end) {
		// Find the center of image
		final float centerX = iii2.getWidth() / 2.0f;
		final float centerY = ii2.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFourteenthImage, iii2,
				ii2));
		if (isFourteenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii2.setClickable(false);
			iii2.startAnimation(rotation);
		} else {
			ii2.startAnimation(rotation);
		}
	}
	private void applyRotation15(float start, float end) {
		// Find the center of image
		final float centerX = iii3.getWidth() / 2.0f;
		final float centerY = ii3.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isFifteenthImage, iii3,
				ii3));
		if (isFifteenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii3.setClickable(false);
			iii3.startAnimation(rotation);
		} else {
			ii3.startAnimation(rotation);
		}
	}
	
	private void applyRotation16(float start, float end) {
		// Find the center of image
		final float centerX = iii4.getWidth() / 2.0f;
		final float centerY = ii4.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSixteenthImage, iii4,
				ii4));
		if (isSixteenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii4.setClickable(false);
			iii4.startAnimation(rotation);
		} else {
			ii4.startAnimation(rotation);
		}
	}
	
	private void applyRotation17(float start, float end) {
		// Find the center of image
		final float centerX = iii5.getWidth() / 2.0f;
		final float centerY = ii5.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isSeventeenthImage, iii5,
				ii5));
		if (isSeventeenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii5.setClickable(false);
			iii5.startAnimation(rotation);
		} else {
			ii5.startAnimation(rotation);
		}
	}
	
	private void applyRotation18(float start, float end) {
		// Find the center of image
		final float centerX = iii6.getWidth() / 2.0f;
		final float centerY = ii6.getHeight() / 2.0f;
		// Create a new 3D rotation with the supplied parameter
		
		final Flip3dAnimation rotation = new Flip3dAnimation(start, end,
				centerX, centerY);
		rotation.setDuration(250);
		rotation.setFillAfter(true);
		rotation.setInterpolator(new AccelerateInterpolator());
		rotation.setAnimationListener(new DisplayNextView(isEightteenthImage, iii6,
				ii6));
		if (isEightteenthImage) {
			if (mediaPlayer1 != null) {
				mediaPlayer1.start();
			} else {
				initiallizeMediaPlayer(1);
				mediaPlayer1.start();
			}
			iii6.setClickable(false);
			iii6.startAnimation(rotation);
		} else {
			ii6.startAnimation(rotation);
		}
	}
	public int value() {        
		return temp;
	}
	
	public void compare(Object a, Object b, Object c, Object d) {
		
		String e = a.toString();
		String f = b.toString();
		g = c.toString();
		h = d.toString();
		temp = 0;
		if (a == b) {
			if (e == "Eilonway" && b == "Eilonway") {
				System.out.println("bird");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Eilonway", Toast.LENGTH_SHORT);
				toast.show();
                 count=1;

                 new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000); 
								
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(2);
							} catch (Exception e) {                       
							}
						}
					}.start();
				
     			System.out.println("count is executed");
				success++;

			}
			if (e == "Zelda" && b == "Zelda") {
				System.out.println("ni");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Zelda", Toast.LENGTH_SHORT);
				toast.show();
                   temp=0;
                  
        			  new Thread() {
  						public void run() {
  							try {
  								hRefresh.sendEmptyMessage(8);
  								Thread.sleep(1000); 
  								
  								System.out.println("in the thread"); 
  								hRefresh.sendEmptyMessage(3);
  							} catch (Exception e) {                       
  							}
  						}
  					}.start();
  					
				success++;

			}
			if (e == "Aurora" && b == "Aurora") {
				System.out.println("rabit");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Aurora", Toast.LENGTH_SHORT);
				toast.show();
                  temp=0;
                
      			
      			new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000);        
								
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(6);
							} catch (Exception e) {                       
							}
						}
					}.start();
					
				success++;

			}
			if (e == "Belle" && b == "Belle") {
				System.out.println("deer");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Belle", Toast.LENGTH_SHORT);
				toast.show();
                     temp=0;
               
           		 new Thread() {
						public void run() {
							try {
								hRefresh.sendEmptyMessage(8);
								Thread.sleep(1000); 
							
								System.out.println("in the thread"); 
								hRefresh.sendEmptyMessage(4);
							} catch (Exception e) {                       
							}
						}
					}.start();
					
				success++;

			}
			if (e == "Meldoy" && b == "Meldoy") {
				System.out.println("squirel");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Meldoy", Toast.LENGTH_SHORT);
				toast.show();
                  temp=0;
  
         			 new Thread() {
   						public void run() {
   							try {
   								hRefresh.sendEmptyMessage(8);
   								Thread.sleep(1000);  
   							
   								System.out.println("in the thread"); 
   								hRefresh.sendEmptyMessage(11);
   							} catch (Exception e) {                       
   							}
   						}
   					}.start();
   					
				success++;

			}
			if (e == "Baby-belle" && b == "Baby-belle") {
				System.out.println("one");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Baby-belle", Toast.LENGTH_SHORT);
				toast.show();
                   temp=0;
                 
          			 new Thread() {
    						public void run() {
    							try {
    								hRefresh.sendEmptyMessage(8);
    								Thread.sleep(1000); 
    								System.out.println("in the thread"); 
    								hRefresh.sendEmptyMessage(7);
    							} catch (Exception e) {                       
    							}
    						}
    					}.start();
    					
				success++;
     
			}
			if (e == "Magera" && b == "Magera") {
				System.out.println("one");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Magera", Toast.LENGTH_SHORT);
				toast.show();
				temp = 0;
				new Thread() {
					public void run() {
						try {

							hRefresh.sendEmptyMessage(8);
							Thread.sleep(1000); 
							System.out.println("in the thread"); 
							hRefresh.sendEmptyMessage(10);
						} catch (Exception e) {                       
						
						}
					}
				}.start();

				success++;

			}
			if (e == "Pocahontus" && b == "Pocahontus") {
				System.out.println("squirel");
				Toast toast = Toast.makeText(getApplicationContext(),
						"Pocahontus", Toast.LENGTH_SHORT);
				toast.show();
				temp = 0;
				new Thread() {
					public void run() {
						try {

							Thread.sleep(1000);
							hRefresh.sendEmptyMessage(8);
							hRefresh.sendEmptyMessage(5);
							System.out.println("in the thread");

						} catch (Exception e) {
						}
					}
				}.start();

				success++;

			}
			if (e == "two" && b == "two") {                    
				System.out.println("two");
                   temp=0;
				success++;
				
			}
			if (e == "three" && b == "three") {  
				System.out.println("three");
                   temp=0;
				success++;
				
			}
			if (e == "thank" && b == "thank") {
				System.out.println("thank");
                temp=0;
				success++;
				
			}
			if (e == "zaijan" && b == "zaijan") {        
				System.out.println("zaijan");    
                   temp=0;
				success++;
				
			}
		}
		
		if (a != b) {                        
			hRefresh.sendEmptyMessage(8);
			System.out.println("Failure" + a + b + c + d);                                       
			match=0;
			match1=0;
			
			shake();           
		}
		
	}
       public void win(){
    	   System.out.println("win is called");     
    	
    	 rotate();
			
    	 	i14.setVisibility(View.VISIBLE);    
			i15.setVisibility(View.VISIBLE);      
			i17.setVisibility(View.VISIBLE);
			i18.setVisibility(View.VISIBLE);
			i20.setVisibility(View.VISIBLE);
			//i21.setVisibility(View.VISIBLE);
			i23.setVisibility(View.VISIBLE);
			//i24.setVisibility(View.VISIBLE);
			i16.setVisibility(View.VISIBLE);
			i19.setVisibility(View.VISIBLE);   
			i22.setVisibility(View.VISIBLE);
			i25.setVisibility(View.VISIBLE);  
			ii1.setVisibility(View.VISIBLE);
			ii2.setVisibility(View.VISIBLE);
			ii3.setVisibility(View.VISIBLE);
			ii4.setVisibility(View.VISIBLE);
			ii5.setVisibility(View.VISIBLE);
			ii6.setVisibility(View.VISIBLE);
			
			 new Thread() {
					public void run() {
						try {
							
							Thread.sleep(2000); 
							hRefresh.sendEmptyMessage(9);
						} catch (Exception e) {                       
						}
					}
				}.start();

       }
	public void rotate() {
		System.out.println("rotate is called");      
		rl = (RelativeLayout) findViewById(R.id.m);
		rl1 = (RelativeLayout) findViewById(R.id.m1);
		rl2 = (RelativeLayout) findViewById(R.id.m2);
		rl3 = (RelativeLayout) findViewById(R.id.m4);
		rl4 = (RelativeLayout) findViewById(R.id.m5);
		rl5 = (RelativeLayout) findViewById(R.id.m6);
		rl6 = (RelativeLayout) findViewById(R.id.m7);
		rl7 = (RelativeLayout) findViewById(R.id.m8);
		rl8 = (RelativeLayout) findViewById(R.id.m9);
		rl9 = (RelativeLayout) findViewById(R.id.m10);
		rl10 = (RelativeLayout) findViewById(R.id.m11);
		rl11 = (RelativeLayout) findViewById(R.id.m12);
		rl13 = (RelativeLayout) findViewById(R.id.m13);
		rl14 = (RelativeLayout) findViewById(R.id.m14);
		rl15 = (RelativeLayout) findViewById(R.id.m15);
		rl16 = (RelativeLayout) findViewById(R.id.m16);
		rl17 = (RelativeLayout) findViewById(R.id.m17);
		rl18 = (RelativeLayout) findViewById(R.id.m18);
		
		final Animation a = AnimationUtils.loadAnimation(SixteenCards.this,
				R.anim.rotate);
		a.setDuration(2000);
		a.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				
			      rl.setVisibility(View.VISIBLE);                           
			      rl1.setVisibility(View.VISIBLE);                      
			      rl2.setVisibility(View.VISIBLE);                  
			      rl3.setVisibility(View.VISIBLE);                            
			      rl4.setVisibility(View.VISIBLE);                     
			      rl5.setVisibility(View.VISIBLE);                 
			      rl6.setVisibility(View.VISIBLE);               
			      rl7.setVisibility(View.VISIBLE);              
			      rl8.setVisibility(View.VISIBLE);
			      rl9.setVisibility(View.VISIBLE);
			      rl10.setVisibility(View.VISIBLE);                             
			      rl11.setVisibility(View.VISIBLE);   
			      rl13.setVisibility(View.VISIBLE);
			      rl14.setVisibility(View.VISIBLE);
			      rl15.setVisibility(View.VISIBLE);
			      rl16.setVisibility(View.VISIBLE);
			      rl17.setVisibility(View.VISIBLE);
			      rl18.setVisibility(View.VISIBLE);
			      
				setButtonClicableState(false);                
				
				System.out.println("in end");              
			}                                 

			public void onAnimationRepeat(Animation animation) {                          
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {   
				
				if (mediaPlayer2 != null) {
					mediaPlayer2.start();
				} else {
					initiallizeMediaPlayer(2);
					mediaPlayer2.start();
				}
				// TODO Auto-generated method stub                                 
     System.out.println("in start");
			}
		});
		
		rl.startAnimation(a);
		rl1.startAnimation(a);
		rl2.startAnimation(a);
		rl3.startAnimation(a);
		rl4.startAnimation(a);
		rl5.startAnimation(a);
		rl6.startAnimation(a);
		rl7.startAnimation(a);
		rl8.startAnimation(a);     
		rl9.startAnimation(a);
		rl10.startAnimation(a);
		rl11.startAnimation(a);
		rl13.startAnimation(a);
		rl14.startAnimation(a);
		rl15.startAnimation(a);
		rl16.startAnimation(a);
		rl17.startAnimation(a);
		rl18.startAnimation(a);
	}

	
	public void shake() {
		
		Animation a = AnimationUtils.loadAnimation(SixteenCards.this,
				R.anim.shake);
		a.setDuration(500);
		ImageView iv = (ImageView) findViewById(R.id.imageView28);
		a.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				if (g == "isFirstImage" || h == "isFirstImage") {
					applyRotation(0, -90);
					isFirstImage = !isFirstImage;
				}
				if (g == "isSecondImage" || h == "isSecondImage") {
					applyRotation1(0, -90);
					isSecondImage = !isSecondImage;
				}
				if (g == "isThirdImage" || h == "isThirdImage") {
					applyRotation2(0, -90);
					isThirdImage = !isThirdImage;
				}
				if (g == "isFourthImage" || h == "isFourthImage") {
					applyRotation3(0, -90);
					isFourthImage = !isFourthImage;
				}
				if (g == "isFifthImage" || h == "isFifthImage") {
					applyRotation4(0, -90);
					isFifthImage = !isFifthImage;
				}
				if (g == "isSixthImage" || h == "isSixthImage") {
					applyRotation6(0, -90);
					isSixthImage = !isSixthImage;
				}
				if (g == "isSeventhImage" || h == "isSeventhImage") {
					applyRotation7(0, -90);
					isSeventhImage = !isSeventhImage;
				}
				if (g == "isEigthImage" || h == "isEigthImage") {
					applyRotation8(0, -90);
					isEigthImage = !isEigthImage;
				}
				if (g == "isNinthImage" || h == "isNinthImage") {
					applyRotation9(0, -90);
					isNinthImage = !isNinthImage;
				}
				if (g == "isTenthImage" || h == "isTenthImage") {
					applyRotation10(0, -90);
					isTenthImage = !isTenthImage;
				}
				if (g == "isEleventhImage" || h == "isEleventhImage") {
					applyRotation11(0, -90);
					isEleventhImage = !isEleventhImage;
				}
				if (g == "isTwelvethImage" || h == "isTwelvethImage") {
					applyRotation12(0, -90);
					isTwelvethImage = !isTwelvethImage;
				}
				if (g == "isThirteenthImage" || h == "isThirteenthImage") {
					applyRotation13(0, -90);
					isThirteenthImage = !isThirteenthImage;
				}
				if (g == "isFourteenthImage" || h == "isFourteenthImage") {
					applyRotation14(0, -90);
					isFourteenthImage = !isFourteenthImage;
				}
				if (g == "isFifteenthImage" || h == "isFifteenthImage") {
					applyRotation15(0, -90);
					isFifteenthImage = !isFifteenthImage;
				}
				if (g == "isSixteenthImage" || h == "isSixteenthImage") {
					applyRotation16(0, -90);
					isSixteenthImage = !isSixteenthImage;
				}
				if (g == "isSeventeenthImage" || h == "isSeventeenthImage") {
					applyRotation17(0, -90);
					isSeventeenthImage = !isSeventeenthImage;
				}
				if (g == "isEightteenthImage" || h == "isEightteenthImage") {
					applyRotation18(0, -90);
					isEightteenthImage = !isEightteenthImage;
				}
				i13.setVisibility(View.VISIBLE);    
				
				System.out.println("end of shake");
			}    

			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
			}
			
		});
		iv.startAnimation(a);     
		
		System.out.println("check out");       
	}
   
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
		case R.id.imageView5:
			
				
			System.out.println("first one image");
			if( match==0 && match1==0)
			{
			match=R.id.m;
			}
			if(temp==1)	
			{
				match1=R.id.m;
			}
			
			if (temp == 0 || temp == 1) {
				if (isFirstImage) {
					applyRotation(0, 90);
					isFirstImage = !isFirstImage;               
				}
				if (temp == 0) {
					s = i14.getTag();
					no = i1.getTag();
				}
				if (temp == 1) {
					s1 = i14.getTag();
					no1 = i1.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			
			break;
		case R.id.imageView7:
          
			if( match==0 && match1==0)
			{
			match=R.id.m1;
			}
			if(temp==1)	
			{
				match1=R.id.m1;
			}
			
			
			
			
			if (temp == 0 || temp == 1) {
				if (isSecondImage) {
					applyRotation1(0, 90);
					isSecondImage = !isSecondImage;
				}
				if (temp == 0) {
					s = i15.getTag();
					no = i2.getTag();
				}
				if (temp == 1) {
					s1 = i15.getTag();
					no1 = i2.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			
			break;
		case R.id.imageView9:
			
			if( match==0 && match1==0)
			{
			match=R.id.m2;
			}
			if(temp==1)	
			{
				match1=R.id.m2;
			}
			
			if (temp == 0 || temp == 1) {
				if (isThirdImage) {
					applyRotation2(0, 90);
					isThirdImage = !isThirdImage;

				}
				if (temp == 0) {
					s = i16.getTag();
					no = i3.getTag();
				}
				if (temp == 1) {
					s1 = i16.getTag();
					no1 = i3.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			break;
		case R.id.imageView11 :
			
			if( match==0 && match1==0)
			{
			match=R.id.m4;
			}
			if(temp==1)	
			{
				match1=R.id.m4;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isFourthImage) {
					applyRotation3(0, 90);
					isFourthImage = !isFourthImage;

				}
				if (temp == 0) {
					s = i17.getTag();
					no = i4.getTag();
				}
				if (temp == 1) {
					s1 = i17.getTag();
					no1 = i4.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			
			break;
		case R.id.imageView13:
			
			if( match==0 && match1==0)
			{
			match=R.id.m5;
			}
			if(temp==1)	
			{
				match1=R.id.m5;
			}
			
			if (temp == 0 || temp == 1) {
				if (isFifthImage) {
					applyRotation4(0, 90);
					isFifthImage = !isFifthImage;
          
				}
				if (temp == 0) {
					s = i18.getTag();
					no = i5.getTag();
				}
				if (temp == 1) {
					s1 = i18.getTag();
					no1 = i5.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);         
				}
			}
			System.out.println(value());
			break;
			
		case R.id.imageView15:
              
			
			if( match==0 && match1==0)
			{
			match=R.id.m6;
			}
			if(temp==1)	
			{
				match1=R.id.m6;
			}
			
			if (temp == 0 || temp == 1) {
				if (isSixthImage) {
					applyRotation6(0, 90);
					isSixthImage = !isSixthImage;

				}
				if (temp == 0) {
					s = i19.getTag();
					no = i6.getTag();
				}
				if (temp == 1) {
					s1 = i19.getTag();
					no1 = i6.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		case R.id.imageView17 :

			if( match==0 && match1==0)
			{
			match=R.id.m7;
			}
			if(temp==1)	
			{
				match1=R.id.m7;
			}
			
			if (temp == 0 || temp == 1) {
				if (isSeventhImage) {
					applyRotation7(0, 90);
					isSeventhImage = !isSeventhImage;

				}
				if (temp == 0) {
					s = i20.getTag();
					no = i7.getTag();
				}
				if (temp == 1) {
					s1 = i20.getTag();
					no1 = i7.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		case R.id.imageView19:

			if( match==0 && match1==0)
			{
			match=R.id.m8;
			}
			if(temp==1)	
			{
				match1=R.id.m8;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isEigthImage) {
					applyRotation8(0, 90);
					isEigthImage = !isEigthImage;
				}
				if (temp == 0) {
					s = i21.getTag();
					no = i8.getTag();
				}
				if (temp == 1) {
					s1 = i21.getTag();
					no1 = i8.getTag();
				}
				temp++;
				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
		case R.id.imageView21:
  
			if( match==0 && match1==0)
			{
			match=R.id.m9;
			}
			if(temp==1)	
			{
				match1=R.id.m9;
			}
			
			if (temp == 0 || temp == 1) {
				if (isNinthImage) {
					applyRotation9(0, 90);
					isNinthImage = !isNinthImage;

				}
				if (temp == 0) {
					s = i22.getTag();
					no = i9.getTag();
				}
				if (temp == 1) {
					s1 = i22.getTag();
					no1 = i9.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			break;
		case R.id.imageView23:

			if( match==0 && match1==0)
			{
			match=R.id.m10;
			}
			if(temp==1)	
			{
				match1=R.id.m10;
			}
			
			if (temp == 0 || temp == 1) {
				if (isTenthImage) {
					applyRotation10(0, 90);
					isTenthImage = !isTenthImage;

				}
				if (temp == 0) {
					s = i23.getTag();
					no = i10.getTag();
				}
				if (temp == 1) {
					s1 = i23.getTag();
					no1 = i10.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			break;
		case R.id.imageView25:

			if( match==0 && match1==0)
			{
			match=R.id.m11;
			}
			if(temp==1)	
			{
				match1=R.id.m11;
			}
			
			if (temp == 0 || temp == 1) {
				if (isEleventhImage) {
					applyRotation11(0, 90);
					isEleventhImage = !isEleventhImage;

				}
				if (temp == 0) {
					s = i24.getTag();
					no = i11.getTag();
				}
				if (temp == 1) {
					no1 = i11.getTag();
					s1 = i24.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}

			}
			System.out.println(value());
			break;
		case R.id.imageView27:

			if( match==0 && match1==0)
			{
			match=R.id.m12;
			}
			if(temp==1)	
			{
				match1=R.id.m12;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isTwelvethImage) {
					applyRotation12(0, 90);
					isTwelvethImage = !isTwelvethImage;

				}
				if (temp == 0) {
					no = i12.getTag();
					s = i25.getTag();
				}
				if (temp == 1) {
					no1 = i12.getTag();
					s1 = i25.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
			
		case R.id.img1:

			if( match==0 && match1==0)
			{
			match=R.id.m13;
			}
			if(temp==1)	
			{
				match1=R.id.m13;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isThirteenthImage) {
					applyRotation13(0, 90);
					isThirteenthImage = !isThirteenthImage;

				}
				if (temp == 0) {
					no = iii1.getTag();
					s = ii1.getTag();
				}
				if (temp == 1) {
					no1 = iii1.getTag();
					s1 = ii1.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
			
		case R.id.img3:

			if( match==0 && match1==0)
			{
			match=R.id.m14;
			}
			if(temp==1)	
			{
				match1=R.id.m14;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isFourteenthImage) {
					applyRotation14(0, 90);
					isFourteenthImage = !isFourteenthImage;

				}
				if (temp == 0) {
					no = iii2.getTag();
					s = ii2.getTag();
				}
				if (temp == 1) {
					no1 = iii2.getTag();
					s1 = ii2.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
			
		case R.id.img5:

			if( match==0 && match1==0)
			{
			match=R.id.m15;
			}
			if(temp==1)	
			{
				match1=R.id.m15;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isFifteenthImage) {
					applyRotation15(0, 90);
					isFifteenthImage = !isFifteenthImage;

				}
				if (temp == 0) {
					no = iii3.getTag();
					s = ii3.getTag();
				}
				if (temp == 1) {
					no1 = iii3.getTag();
					s1 = ii3.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;
			
		case R.id.img7:

			if( match==0 && match1==0)
			{
			match=R.id.m16;
			}
			if(temp==1)	
			{
				match1=R.id.m16;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isSixteenthImage) {
					applyRotation16(0, 90);
					isSixteenthImage = !isSixteenthImage;

				}
				if (temp == 0) {
					no = iii4.getTag();
					s = ii4.getTag();
				}
				if (temp == 1) {
					no1 = iii4.getTag();
					s1 = ii4.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;	
			
		case R.id.img9:

			if( match==0 && match1==0)
			{
			match=R.id.m17;
			}
			if(temp==1)	
			{
				match1=R.id.m17;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isSeventeenthImage) {
					applyRotation17(0, 90);
					isSeventeenthImage = !isSeventeenthImage;

				}
				if (temp == 0) {
					no = iii5.getTag();
					s = ii5.getTag();
				}
				if (temp == 1) {
					no1 = iii5.getTag();
					s1 = ii5.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;	
			
		case R.id.img11:

			if( match==0 && match1==0)
			{
			match=R.id.m18;
			}
			if(temp==1)	
			{
				match1=R.id.m18;
			}
			
			
			if (temp == 0 || temp == 1) {
				if (isEightteenthImage) {
					applyRotation18(0, 90);
					isEightteenthImage = !isEightteenthImage;

				}
				if (temp == 0) {
					no = iii6.getTag();
					s = ii6.getTag();
				}
				if (temp == 1) {
					no1 = iii6.getTag();
					s1 = ii6.getTag();
				}
				temp++;

				if (temp == 2) {
					hRefresh.sendEmptyMessage(1);
				}
			}
			System.out.println(value());
			break;	
		default:
			break;
		}
		if(temp==2){
			setButtonClicableState(false);
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					setButtonClicableState(true);
				}
			}, 600);                
		}
		 hRefresh = new Handler() {
			public void handleMessage(Message msg) { 
				switch (msg.what) {
				case 1:

					compare(s, s1, no, no1);                 
								break;      
							
				case 2:
					if(count1==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler1");
					RelativeLayout l1=(RelativeLayout)findViewById(match); 
		     		RelativeLayout l2=(RelativeLayout)findViewById(match1);
		     			l1.setVisibility(View.INVISIBLE);
		     			l2.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count1++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();}                  
		     			}}
					break;
					
				case 3:
					if(count2==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler2");
					RelativeLayout l3=(RelativeLayout)findViewById(match);
		     		RelativeLayout l4=(RelativeLayout)findViewById(match1);
		     			l3.setVisibility(View.INVISIBLE);
		     			l4.setVisibility(View.INVISIBLE);
		     			count2++;
		     			success1++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;
				case 4:
					if(count3==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler3");
					RelativeLayout l5=(RelativeLayout)findViewById(match);
		     		RelativeLayout l6=(RelativeLayout)findViewById(match1);
		     			l5.setVisibility(View.INVISIBLE);
		     			l6.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count3++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;
					
				case 11:
					if(count8==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler11");
					RelativeLayout l15=(RelativeLayout)findViewById(match);
		     		RelativeLayout l16=(RelativeLayout)findViewById(match1);
		     			l15.setVisibility(View.INVISIBLE);
		     			l16.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count8++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;
					
					
				case 5:
					if(count4==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler4");
					RelativeLayout l7=(RelativeLayout)findViewById(match);
		     		RelativeLayout l8=(RelativeLayout)findViewById(match1);
		     			l7.setVisibility(View.INVISIBLE);
		     			l8.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count4++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;
				case 6:
					if(count5==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);                  
					System.out.println("in handler5");                      
					RelativeLayout l9=(RelativeLayout)findViewById(match);                      
		     		RelativeLayout l10=(RelativeLayout)findViewById(match1);             
		     			l9.setVisibility(View.INVISIBLE);
		     			l10.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count5++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
		     			
					}}
					break;
				case 7:
					if(count6==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler6");
					RelativeLayout l11=(RelativeLayout)findViewById(match);
		     		RelativeLayout l12=(RelativeLayout)findViewById(match1);
		     			l11.setVisibility(View.INVISIBLE);
		     			l12.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count6++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;  
				case 10:
					if(count7==0){
						if(match!=0&&match1!=0){
							if (mediaPlayer3 != null) {
								mediaPlayer3.start();
							} else {
								initiallizeMediaPlayer(3);
								mediaPlayer3.start();
							}
							setButtonClicableState(false);
						System.out.println(match+"   "+match1);
					System.out.println("in handler7");
					RelativeLayout l13=(RelativeLayout)findViewById(match);
		     		RelativeLayout l14=(RelativeLayout)findViewById(match1);
		     			l13.setVisibility(View.INVISIBLE);
		     			l14.setVisibility(View.INVISIBLE);
		     			success1++;
		     			count7++;
		     			match=0;
    					match1=0;
    					setButtonClicableState(true);
		     			if(success1==8){win();} 
					}}
					break;  
				case 8:
					int a=Integer.parseInt(tv.getText().toString());                              
					a=a+1;
					tv.setText(Integer.toString(a));
					break;
				case 9:
					final Dialog dialog = new Dialog(SixteenCards.this);
			        dialog.setContentView(R.layout.custom);
					dialog.setTitle("Level Cleared");
					 TextView tv1=(TextView)dialog.findViewById(R.id.textView1);     
			        ImageView iv1=(ImageView)dialog.findViewById(R.id.imageView2);            
			        ImageView iv2=(ImageView)dialog.findViewById(R.id.imageView1);     
			        ImageView iv3=(ImageView)dialog.findViewById(R.id.imageView3); 
			        Button next=(Button)dialog.findViewById(R.id.button1);
			        Button restart=(Button)dialog.findViewById(R.id.button2);
			        
			        next.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							SixteenCards.this.finish();
							SixteenCards.this.startActivity(new Intent(SixteenCards.this,EighteenCard.class));
						}
					});
			        restart.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							SixteenCards.this.finish();
							SixteenCards.this.startActivity(new Intent(SixteenCards.this,SixteenCards.class));        
						}
					});
			        
			        tv1.setText("No of moves is :"+tv.getText().toString());
					iv1.setImageBitmap(star_2);
					iv2.setImageBitmap(star_2);                   
					iv3.setImageBitmap(star_2);
					int b = Integer.parseInt(tv.getText().toString());
					if(b==6){
						iv1.setImageBitmap(star_1);
						iv2.setImageBitmap(star_1);                   
						iv3.setImageBitmap(star_1);
					}
					if(b>6 && b<=16){
						iv1.setImageBitmap(star_1);
						iv2.setImageBitmap(star_1);                   
						
					}
					if(b>16){  
						iv1.setImageBitmap(star_1);       
						                   
						
					}
					dialog.show();
					myPrefs = SixteenCards.this.getSharedPreferences("hello", MODE_WORLD_READABLE);
			           SharedPreferences.Editor prefsEditor = myPrefs.edit();
			           prefsEditor.putString("level11",tv.getText().toString());
			           prefsEditor.commit();
				default:             
					break;                   
				}
			}
			};     
	}

	private void setButtonClicableState(Boolean state){                                          
		i1.setClickable(state);      
		i2.setClickable(state);      
		i3.setClickable(state);       
		i4.setClickable(state);      
		i5.setClickable(state);                
		i6.setClickable(state);    
		i7.setClickable(state);     
		//i8.setClickable(state);    
		i9.setClickable(state);    
		i10.setClickable(state);   
	//	i11.setClickable(state);     
		i12.setClickable(state);   
		iii1.setClickable(state);
		iii2.setClickable(state);
		iii3.setClickable(state);
		iii4.setClickable(state);
		iii5.setClickable(state);
		iii6.setClickable(state);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {                    
		// TODO Auto-generated method stub
		 if ((keyCode == KeyEvent.KEYCODE_BACK)) {
			 SixteenCards.this.finish();
		    }
		
		return super.onKeyDown(keyCode, event);
	}
	
	private void initiallizeMediaPlayer(int which) {
		switch (which) {
		case 1:
			mediaPlayer1 = MediaPlayer.create(SixteenCards.this, R.raw.pop); 
			break;
		case 2:
			mediaPlayer2 = MediaPlayer.create(SixteenCards.this, R.raw.trumpet);
			break;
		case 3:
			mediaPlayer3 = MediaPlayer.create(SixteenCards.this, R.raw.correct);
			break;
		default:
			break;
		}
	}
  
	
}