package com.memorycards.princess;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Stars extends Activity implements OnClickListener{

	SharedPreferences myPrefs;
	ImageView iv1,iv2,iv3,level2_1,level2_2,level2_3,level3_1,level3_2,level3_3,level4_1,level4_2,level4_3,level5_1,level5_2,level5_3,level6_1,level6_2,
	level6_3,level7_1,level7_2,level7_3,level8_1,level8_2,level8_3, level9_1, level9_2, level9_3, level10_1, level10_2,
	level10_3, level11_1, level11_2, level11_3, level12_1, level12_2, level12_3, level13_1, level13_2, level13_3, 
	level14_1, level14_2, level14_3, level15_1, level15_2, level15_3, level16_1, level16_2, level16_3, level17_1,
	level17_2, level17_3, level18_1, level18_2, level18_3, level19_1, level19_2, level19_3, level20_1, level20_2, level20_3;
	Bitmap bm3,bm4;
	
	LinearLayout lay1, lay2, lay3, lay4, lay5, lay6, lay7, lay8, lay9, lay10, lay11, lay12, lay13, lay14, lay15, lay16, lay17, lay18, lay19, lay20;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_new);
		Button iv=(Button)findViewById(R.id.imageView1); 
		Button ivv1=(Button)findViewById(R.id.imageView2); 
		Button ivv2=(Button)findViewById(R.id.imageView3); 
		Button ivv3=(Button)findViewById(R.id.imageView4); 
		Button ivv4=(Button)findViewById(R.id.imageView5); 
		Button ivv5=(Button)findViewById(R.id.imageView6); 
		Button ivv6=(Button)findViewById(R.id.imageView7); 
		Button ivv7=(Button)findViewById(R.id.imageView8); 
		Button ivv9=(Button)findViewById(R.id.imglevel9);
		Button ivv10=(Button)findViewById(R.id.imglevel10);
		Button ivv11=(Button)findViewById(R.id.imglevel11);
		Button ivv12=(Button)findViewById(R.id.imglevel12);
		Button ivv13=(Button)findViewById(R.id.imglevel13);
		Button ivv14=(Button)findViewById(R.id.imglevel14);
		Button ivv15=(Button)findViewById(R.id.imglevel15);
//		Button ivv16=(Button)findViewById(R.id.imglevel16);
//		Button ivv17=(Button)findViewById(R.id.imglevel17);
//		Button ivv18=(Button)findViewById(R.id.imglevel18);
//		Button ivv19=(Button)findViewById(R.id.imglevel19);
//		Button ivv20=(Button)findViewById(R.id.imglevel20);
		
		lay1=(LinearLayout) findViewById(R.id.lay1);
		lay1.setOnClickListener(this);
		lay2=(LinearLayout) findViewById(R.id.lay2);
		lay2.setOnClickListener(this);
		lay3=(LinearLayout) findViewById(R.id.lay3);
		lay3.setOnClickListener(this);
		lay4=(LinearLayout) findViewById(R.id.lay4);
		lay4.setOnClickListener(this);
		lay5=(LinearLayout) findViewById(R.id.lay5);
		lay5.setOnClickListener(this);
		lay6=(LinearLayout) findViewById(R.id.lay6);
		lay6.setOnClickListener(this);
		lay7=(LinearLayout) findViewById(R.id.lay7);
		lay7.setOnClickListener(this);
		lay8=(LinearLayout) findViewById(R.id.lay8);
		lay8.setOnClickListener(this);
		lay9=(LinearLayout) findViewById(R.id.lay9);
		lay9.setOnClickListener(this);
		lay10=(LinearLayout) findViewById(R.id.lay10);
		lay10.setOnClickListener(this);
		lay11=(LinearLayout) findViewById(R.id.lay11);
		lay11.setOnClickListener(this);
		lay12=(LinearLayout) findViewById(R.id.lay12);
		lay12.setOnClickListener(this);
		lay13=(LinearLayout) findViewById(R.id.lay13);
		lay13.setOnClickListener(this);
		lay14=(LinearLayout) findViewById(R.id.lay14);
		lay14.setOnClickListener(this);
		lay15=(LinearLayout) findViewById(R.id.lay15);
		lay15.setOnClickListener(this);
//		lay16=(LinearLayout) findViewById(R.id.lay16);
//		lay16.setOnClickListener(this);
//		lay17=(LinearLayout) findViewById(R.id.lay17);
//		lay17.setOnClickListener(this);
//		lay18=(LinearLayout) findViewById(R.id.lay18);
//		lay18.setOnClickListener(this);
//		lay19=(LinearLayout) findViewById(R.id.lay19);
//		lay19.setOnClickListener(this);
//		lay20=(LinearLayout) findViewById(R.id.lay20);
//		lay20.setOnClickListener(this);
		 
		iv1=(ImageView)findViewById(R.id.image_level1_3);
		 iv2=(ImageView)findViewById(R.id.image_level1_2);
		 iv3=(ImageView)findViewById(R.id.image_level1_1);
		 
		 level2_1=(ImageView)findViewById(R.id.image_level2_3);
		 level2_2=(ImageView)findViewById(R.id.image_level2_2);
		 level2_3=(ImageView)findViewById(R.id.image_level2_1);
		 
		 level3_1=(ImageView)findViewById(R.id.image_level3_3);
		 level3_2=(ImageView)findViewById(R.id.image_level3_2);
		 level3_3=(ImageView)findViewById(R.id.image_level3_1);
		 
		 level4_1=(ImageView)findViewById(R.id.image_level4_3);
		 level4_2=(ImageView)findViewById(R.id.image_level4_2);
		 level4_3=(ImageView)findViewById(R.id.image_level4_1);
		 
		 level5_1=(ImageView)findViewById(R.id.image_level5_3);
		 level5_2=(ImageView)findViewById(R.id.image_level5_2);
		 level5_3=(ImageView)findViewById(R.id.image_level5_1);
		 
		 level6_1=(ImageView)findViewById(R.id.image_level6_3);
		 level6_2=(ImageView)findViewById(R.id.image_level6_2);
		 level6_3=(ImageView)findViewById(R.id.image_level6_1);
		 
		 level7_1=(ImageView)findViewById(R.id.image_level7_3);
		 level7_2=(ImageView)findViewById(R.id.image_level7_2);
		 level7_3=(ImageView)findViewById(R.id.image_level7_1);
		 
		 level8_1=(ImageView)findViewById(R.id.image_level8_3);
		 level8_2=(ImageView)findViewById(R.id.image_level8_2);
		 level8_3=(ImageView)findViewById(R.id.image_level8_1);
		
		 level9_1=(ImageView)findViewById(R.id.imageView9_1);
		 level9_2=(ImageView)findViewById(R.id.imageView9_2);
		 level9_3=(ImageView)findViewById(R.id.imageView9_3);
		 
		 level10_1=(ImageView)findViewById(R.id.imageView10_1);
		 level10_2=(ImageView)findViewById(R.id.imageView10_2);
		 level10_3=(ImageView)findViewById(R.id.imageView10_3);
		 
		 level11_1=(ImageView)findViewById(R.id.imageView11_1);
		 level11_2=(ImageView)findViewById(R.id.imageView11_2);
		 level11_3=(ImageView)findViewById(R.id.imageView11_3);
	
		 level12_1=(ImageView)findViewById(R.id.imageView12_1);
		 level12_2=(ImageView)findViewById(R.id.imageView12_2);
		 level12_3=(ImageView)findViewById(R.id.imageView12_3);
		
		 level13_1=(ImageView)findViewById(R.id.imageView13_1);
		 level13_2=(ImageView)findViewById(R.id.imageView13_2);
		 level13_3=(ImageView)findViewById(R.id.imageView13_3);
	
		 level14_1=(ImageView)findViewById(R.id.imageView14_1);
		 level14_2=(ImageView)findViewById(R.id.imageView14_2);
		 level14_3=(ImageView)findViewById(R.id.imageView14_3);
	
		 level15_1=(ImageView)findViewById(R.id.imageView15_1);
		 level15_2=(ImageView)findViewById(R.id.imageView15_2);
		 level15_3=(ImageView)findViewById(R.id.imageView15_3);
	
//		 level16_1=(ImageView)findViewById(R.id.imageView16_1);
//		 level16_2=(ImageView)findViewById(R.id.imageView16_2);
//		 level16_3=(ImageView)findViewById(R.id.imageView16_3);
//	
//		 level17_1=(ImageView)findViewById(R.id.imageView17_1);
//		 level17_2=(ImageView)findViewById(R.id.imageView17_2);
//		 level17_3=(ImageView)findViewById(R.id.imageView17_3);
//		
//		 level18_1=(ImageView)findViewById(R.id.imageView18_1);
//		 level18_2=(ImageView)findViewById(R.id.imageView18_2);
//		 level18_3=(ImageView)findViewById(R.id.imageView18_3);
//		
//		 level19_1=(ImageView)findViewById(R.id.imageView19_1);
//		 level19_2=(ImageView)findViewById(R.id.imageView19_2);
//		 level19_3=(ImageView)findViewById(R.id.imageView19_3);
//		
//		 level20_1=(ImageView)findViewById(R.id.imageView20_1);
//		 level20_2=(ImageView)findViewById(R.id.imageView20_2);
//		 level20_3=(ImageView)findViewById(R.id.imageView20_3);
		 
	    bm3	 = BitmapFactory.decodeResource(getResources(), R.drawable.star);
	    bm4	 = BitmapFactory.decodeResource(getResources(), R.drawable.star2);
	    
	    myPrefs = this.getSharedPreferences("hello", MODE_WORLD_READABLE);
	      iv1.setImageBitmap(bm4);
	      iv2.setImageBitmap(bm4);
	      iv3.setImageBitmap(bm4);
	      
	      level2_1.setImageBitmap(bm4);
	      level2_2.setImageBitmap(bm4);
	      level2_3.setImageBitmap(bm4);
	      
	      level3_1.setImageBitmap(bm4);
	      level3_2.setImageBitmap(bm4);
	      level3_3.setImageBitmap(bm4);
	      
	      level4_1.setImageBitmap(bm4);
	      level4_2.setImageBitmap(bm4);
	      level4_3.setImageBitmap(bm4);
	      
	      level5_1.setImageBitmap(bm4);
	      level5_2.setImageBitmap(bm4);
	      level5_3.setImageBitmap(bm4);
	      
	      level6_1.setImageBitmap(bm4);
	      level6_2.setImageBitmap(bm4);
	      level6_3.setImageBitmap(bm4);
	      
	      level7_1.setImageBitmap(bm4);
	      level7_2.setImageBitmap(bm4);
	      level7_3.setImageBitmap(bm4);
	      
	      level8_1.setImageBitmap(bm4);
	      level8_2.setImageBitmap(bm4);
	      level8_3.setImageBitmap(bm4);
	      
	      level9_1.setImageBitmap(bm4);
	      level9_2.setImageBitmap(bm4);
	      level9_3.setImageBitmap(bm4);
	      
	      level10_1.setImageBitmap(bm4);
	      level10_2.setImageBitmap(bm4);
	      level10_3.setImageBitmap(bm4);
	
	      level11_1.setImageBitmap(bm4);
	      level11_2.setImageBitmap(bm4);
	      level11_3.setImageBitmap(bm4);
	      
	      level12_1.setImageBitmap(bm4);
	      level12_2.setImageBitmap(bm4);
	      level12_3.setImageBitmap(bm4);
	      
	      level13_1.setImageBitmap(bm4);
	      level13_2.setImageBitmap(bm4);
	      level13_3.setImageBitmap(bm4);
	      
	      level14_1.setImageBitmap(bm4);
	      level14_2.setImageBitmap(bm4);
	      level14_3.setImageBitmap(bm4);
	      
	      level15_1.setImageBitmap(bm4);
	      level15_2.setImageBitmap(bm4);
	      level15_3.setImageBitmap(bm4);
	      
//	      level16_1.setImageBitmap(bm4);
//	      level16_2.setImageBitmap(bm4);
//	      level16_3.setImageBitmap(bm4);
//	      
//	      level17_1.setImageBitmap(bm4);
//	      level17_2.setImageBitmap(bm4);
//	      level17_3.setImageBitmap(bm4);
//	      
//	      level18_1.setImageBitmap(bm4);
//	      level18_2.setImageBitmap(bm4);
//	      level18_3.setImageBitmap(bm4);
//	      
//	      level19_1.setImageBitmap(bm4);
//	      level19_2.setImageBitmap(bm4);
//	      level19_3.setImageBitmap(bm4);
//	      
//	      level20_1.setImageBitmap(bm4);
//	      level20_2.setImageBitmap(bm4);
//	      level20_3.setImageBitmap(bm4);
	      iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,FourCards.class));
			}
		});
		
       ivv1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,FourCards1.class));
			}
		});

      ivv2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Stars.this.startActivity(new Intent(Stars.this,SixCards.class));
	}
    });
      
      ivv3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,SixCards1.class));
			}
		});
      
      ivv4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,EightCards.class));
			}
		});
		
      ivv5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,EightCards1.class));
			}
		});
      
      
      ivv6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,TenCard.class));
			}
		});
      
      ivv7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Stars.this.startActivity(new Intent(Stars.this,MemoryCard1.class));  
			}
		});
      
      File f = new File("/data/data/com.memorycards.princess/shared_prefs/hello.xml");
		 if(!f.exists()){
			 
	           SharedPreferences.Editor prefsEditor = myPrefs.edit();
	           prefsEditor.putString("level1","0");   
	           prefsEditor.putString("level2","0");
	           prefsEditor.putString("level3","0");
	           prefsEditor.putString("level4","0");
	           prefsEditor.putString("level5","0");
	           prefsEditor.putString("level6","0");
	           prefsEditor.putString("level7","0");
	           prefsEditor.putString("level8","0");
	           prefsEditor.putString("level9", "0");
	           prefsEditor.putString("level10", "0");
	           prefsEditor.putString("level11", "0");
	           prefsEditor.putString("level12", "0");
	           prefsEditor.putString("level13", "0");
	           prefsEditor.putString("level14", "0");
	           prefsEditor.putString("level15", "0");
	         
	           prefsEditor.commit();
		 }
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		// myPrefs = this.getSharedPreferences("hello", MODE_WORLD_READABLE);
		   	String  ss= myPrefs.getString("level1", "0");
				int a=Integer.parseInt(ss);
				System.out.println("in on resume "+a);  
				if(a==2){
					iv1.setImageBitmap(bm3);
					iv2.setImageBitmap(bm3);                   
					iv3.setImageBitmap(bm3);
				}
				if(a==3){
					iv1.setImageBitmap(bm3);
					iv2.setImageBitmap(bm3);                   
					
				}
				if(a>3){
					iv1.setImageBitmap(bm3);
					                   
					
				}
				
				
				
				String  ss1= myPrefs.getString("level2", "0");
				int b=Integer.parseInt(ss1);   
				if(b==2){
					level2_1.setImageBitmap(bm3);
					level2_2.setImageBitmap(bm3);                   
					level2_3.setImageBitmap(bm3);
				}
				if(b==3){
					level2_1.setImageBitmap(bm3);
					level2_2.setImageBitmap(bm3);                   
					
				}
				if(b>3){
					level2_1.setImageBitmap(bm3);
					                   
					
				}
				
				
				String  ss2= myPrefs.getString("level3", "0");
				int c=Integer.parseInt(ss2); 
				if(c==3){
					level3_1.setImageBitmap(bm3);
					level3_2.setImageBitmap(bm3);                   
					level3_3.setImageBitmap(bm3);
				}
				if(c>3 && c<=6){
					level3_1.setImageBitmap(bm3);
					level3_2.setImageBitmap(bm3);                   
					
				}
				if(c>6){
					level3_1.setImageBitmap(bm3);       
					 }
				
				
				String  ss3= myPrefs.getString("level4", "0");
				int d=Integer.parseInt(ss3); 
				if(d==3){
					level4_1.setImageBitmap(bm3);
					level4_2.setImageBitmap(bm3);                   
					level4_3.setImageBitmap(bm3);
				}
				if(d>3 && d<=6){
					level4_1.setImageBitmap(bm3);
					level4_2.setImageBitmap(bm3);                   
					
				}
				if(d>6){
					level4_1.setImageBitmap(bm3);       
					 }
				
				
				String  ss4= myPrefs.getString("level5", "0");
				int e=Integer.parseInt(ss4);
				if(e==4){
					level5_1.setImageBitmap(bm3);
					level5_2.setImageBitmap(bm3);                   
					level5_3.setImageBitmap(bm3);
				}
				if(e>4 && e<=8){
					level5_1.setImageBitmap(bm3);
					level5_2.setImageBitmap(bm3);                   
					
				}
				if(e>8){  
					level5_1.setImageBitmap(bm3);  
				}
				
				String  ss5= myPrefs.getString("level6", "0");
				int f=Integer.parseInt(ss5);
				if(f==4){
					level6_1.setImageBitmap(bm3);
					level6_2.setImageBitmap(bm3);                   
					level6_3.setImageBitmap(bm3);
				}
				if(f>4 && f<=8){
					level6_1.setImageBitmap(bm3);
					level6_2.setImageBitmap(bm3);                   
					
				}
				if(f>8){  
					level6_1.setImageBitmap(bm3);  
				}
				
				String  ss6= myPrefs.getString("level7", "0");
				int ff=Integer.parseInt(ss6);
				if(ff==8){
					level7_1.setImageBitmap(bm3);
					level7_2.setImageBitmap(bm3);                   
					level7_3.setImageBitmap(bm3);
				}
				if(ff>8 && ff<=12){
					level7_1.setImageBitmap(bm3);
					level7_2.setImageBitmap(bm3);                   
					
				}
				if(ff>12){  
					level7_1.setImageBitmap(bm3); 
				}
				
				String  ss7= myPrefs.getString("level8", "0");
				int g=Integer.parseInt(ss7);
				if(g==8){
					level8_1.setImageBitmap(bm3);
					level8_2.setImageBitmap(bm3);                   
					level8_3.setImageBitmap(bm3);
				}
				if(g>8 && g<=12){
					level8_1.setImageBitmap(bm3);
					level8_2.setImageBitmap(bm3);                   
					
				}
				if(g>12){  
					level8_1.setImageBitmap(bm3); 
				}   
				
				String ss8=myPrefs.getString("level9","0");
				int h=Integer.parseInt(ss8);
				if(h==5){
					level9_1.setImageBitmap(bm3);
					level9_2.setImageBitmap(bm3);                   
					level9_3.setImageBitmap(bm3);
				}
				if(h>5 && h<=10){
					level9_1.setImageBitmap(bm3);
					level9_2.setImageBitmap(bm3);                   
					
				}
				if(h>10){  
					level8_1.setImageBitmap(bm3); 
				}    
				
				String ss9=myPrefs.getString("level10","0");
				int i=Integer.parseInt(ss9);
				if(i==6){
					level10_1.setImageBitmap(bm3);
					level10_2.setImageBitmap(bm3);                   
					level10_3.setImageBitmap(bm3);
				}
				if(i>6 && i<=14){
					level10_1.setImageBitmap(bm3);
					level10_2.setImageBitmap(bm3);                   
					
				}
				if(i>14){  
					level10_1.setImageBitmap(bm3); 
				}    
			
				String ss10=myPrefs.getString("level11","0");
				int ii=Integer.parseInt(ss10);
				if(i==6){
					level11_1.setImageBitmap(bm3);
					level11_2.setImageBitmap(bm3);                   
					level11_3.setImageBitmap(bm3);
				}
				if(i>6 && i<=16){
					level11_1.setImageBitmap(bm3);
					level11_2.setImageBitmap(bm3);                   
					
				}
				if(i>16){  
					level10_1.setImageBitmap(bm3); 
				}    
				
				String ss11=myPrefs.getString("level12","0");
				int j=Integer.parseInt(ss11);
				if(j==8){
					level12_1.setImageBitmap(bm3);
					level12_2.setImageBitmap(bm3);                   
					level12_3.setImageBitmap(bm3);
				}
				if(j>8 && j<=18){
					level12_1.setImageBitmap(bm3);
					level12_2.setImageBitmap(bm3);                   
					
				}
				if(j>18){  
					level12_1.setImageBitmap(bm3); 
				}    
				
				String ss12=myPrefs.getString("level13","0");
				int jj=Integer.parseInt(ss12);
				if(jj==9){
					level13_1.setImageBitmap(bm3);
					level13_2.setImageBitmap(bm3);                   
					level13_3.setImageBitmap(bm3);
				}
				if(jj>9 && jj<=20){
					level13_1.setImageBitmap(bm3);
					level13_2.setImageBitmap(bm3);                   
					
				}
				if(j>20){  
					level13_1.setImageBitmap(bm3); 
				}    
				
				String ss13=myPrefs.getString("level14","0");
				int k=Integer.parseInt(ss13);
				if(k==10){
					level14_1.setImageBitmap(bm3);
					level14_2.setImageBitmap(bm3);                   
					level14_3.setImageBitmap(bm3);
				}
				if(k>10 && k<=22){
					level14_1.setImageBitmap(bm3);
					level14_2.setImageBitmap(bm3);                   
					
				}
				if(k>22){  
					level14_1.setImageBitmap(bm3); 
				}    
				
				String ss14=myPrefs.getString("level15","0");
				int kk=Integer.parseInt(ss14);
				if(kk==12){
					level15_1.setImageBitmap(bm3);
					level15_2.setImageBitmap(bm3);                   
					level15_3.setImageBitmap(bm3);
				}
				if(kk>12 && kk<=24){
					level15_1.setImageBitmap(bm3);
					level15_2.setImageBitmap(bm3);                   
					
				}
				if(kk>24){  
					level15_1.setImageBitmap(bm3); 
				}    
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.lay1)
		{
			Stars.this.startActivity(new Intent(Stars.this,FourCards.class));
		}
		if(v.getId()==R.id.lay2)
		{
			Stars.this.startActivity(new Intent(Stars.this,FourCards1.class));
		}
		if(v.getId()==R.id.lay3)
		{
			Stars.this.startActivity(new Intent(Stars.this,SixCards.class));
		}
		if(v.getId()==R.id.lay4)
		{
			Stars.this.startActivity(new Intent(Stars.this,SixCards1.class));
		}
		if(v.getId()==R.id.lay5)
		{
			Stars.this.startActivity(new Intent(Stars.this,EightCards.class));
		}
		if(v.getId()==R.id.lay6)
		{
			Stars.this.startActivity(new Intent(Stars.this,EightCards1.class));
		}
		if(v.getId()==R.id.lay7)
		{
			Stars.this.startActivity(new Intent(Stars.this,TenCard.class));
		}
		if(v.getId()==R.id.lay8)
		{
			Stars.this.startActivity(new Intent(Stars.this,MemoryCard1.class));
		}
		if(v.getId()==R.id.lay9)
		{
			Stars.this.startActivity(new Intent(Stars.this, MemoryCard2.class));
		}
		if(v.getId()==R.id.lay10)
		{
			Stars.this.startActivity(new Intent(Stars.this, FourteenCard.class));

		}
		if(v.getId()==R.id.lay11)
		{
			Stars.this.startActivity(new Intent(Stars.this, SixteenCards.class));

		}
		if(v.getId()==R.id.lay12)
		{
			Stars.this.startActivity(new Intent(Stars.this, EighteenCard.class));

		}
		if(v.getId()==R.id.lay13)
		{
			Stars.this.startActivity(new Intent(Stars.this, TwentyCard.class));

		}
		if(v.getId()==R.id.lay14)
		{
			Stars.this.startActivity(new Intent(Stars.this, TwentyTwo.class));

		}
		if(v.getId()==R.id.lay15)
		{
			Stars.this.startActivity(new Intent(Stars.this, TwentyFour.class));

		}
	}
	
	

}
