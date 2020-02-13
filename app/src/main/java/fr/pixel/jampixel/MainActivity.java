package fr.pixel.jampixel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Handler;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int flag = 1;
    public Boolean f1=false,f2=false,f3=false,f4 =false;
    private TextView textView2,textView3;
    private Button mB1;
    private Button mB2;
    private Button mB3;
    private Button mB4;
    private Button mBf;
    private MediaPlayer mediaPlayer;
    private int length;
    private LinearLayout currentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mediaPlayer = MediaPlayer.create(this.getBaseContext(),R.raw.n);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        flag=1;
        currentLayout = (LinearLayout) findViewById(R.id.main_layout);
        textView3 = (TextView)findViewById(R.id.txt);
        textView2= (TextView)findViewById(R.id.txt2);
        mB1 = (Button)findViewById(R.id.B1);
        mB2 = (Button)findViewById(R.id.B2);
        mB3 = (Button)findViewById(R.id.B3);
        mB4 = (Button)findViewById(R.id.B4);
        mBf=(Button)findViewById(R.id.Bf);
        mB1.setVisibility(View.GONE);
        mB2.setVisibility(View.GONE);
        mB3.setVisibility(View.GONE);
        mB4.setVisibility(View.GONE);
        mBf.setVisibility(View.GONE);
        mBf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mB1.setBackgroundResource(R.drawable.a5);
                mB2.setBackgroundResource(R.drawable.b5);
                mB3.setBackgroundResource(R.drawable.c5);
                mB4.setBackgroundResource(R.drawable.d5);
                mBf.setText("");
                /*texxxxtt
                 * */

                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(v.getContext(),R.raw.outro);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            }
        });
        textView2.setVisibility(View.GONE);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView2.setVisibility(View.VISIBLE);
            }
        }, 3000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView3.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
            }
        }, 6000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                currentLayout.setBackgroundColor(Color.BLACK);

                mB1.setVisibility(View.VISIBLE);
                mB2.setVisibility(View.VISIBLE);
                mB3.setVisibility(View.VISIBLE);
                mB4.setVisibility(View.VISIBLE);
            }
        }, 7000);


        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=a3VCtSYcpBQ&feature=youtu.be&fbclid=IwAR3cHO5jQT49ER5uDh_VDkHlNVz6qnXwj90wI73_WXhcMo4FYJ9wVe0fGvY")));
                if(!f1){
                    setBg1();
                    setBg2();
                    setBg3();
                    setBg4();

                    flag++;
                }
                f1=true;
                setf();

            }
        });
        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YII6Zd0-A00&feature=youtu.be&fbclid=IwAR05OtJB31KuNxQYvE1uR0w5W0KxzgbLY281Fhp6cpX_NARvNTUtTdnyItE")));
                if(!f2){
                    setBg1();
                    setBg2();
                    setBg3();
                    setBg4();

                    flag++;
                }
                f2=true;
                setf();

            }
        });
        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1SSUUuaMBco&feature=youtu.be&fbclid=IwAR0BAM-PtMoStwBujEGRUyQH1DKumg7niomtc7_aTd_ZErrSVhhbX66hrJ8")));
                if(!f3){
                    setBg1();
                    setBg2();
                    setBg3();
                    setBg4();

                    flag++;
                }
                f3=true;
                setf();

            }
        });
        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IDm0YVJb4Wg&feature=youtu.be&fbclid=IwAR2Gc2KGFGHthnvF1j4kMbfxTTlwuQapOYz7kqkXq58xltvpKmwEFFG7FXc")));
                if(!f4){
                    setBg1();
                    setBg2();
                    setBg3();
                    setBg4();

                    flag++;
                }
                f4=true;
                setf();
            }
        });
    }

    public void setBg1(){

        if(flag==1){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mB1.setBackgroundResource(R.drawable.a1);
                    mB2.setBackgroundResource(R.drawable.b1);
                    mB3.setBackgroundResource(R.drawable.c1);
                    mB4.setBackgroundResource(R.drawable.d1);
                }
            }, 2000);

        }

    }
    public void setBg2(){
        if(flag==2){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mB1.setBackgroundResource(R.drawable.a2);
                    mB2.setBackgroundResource(R.drawable.b2);
                    mB3.setBackgroundResource(R.drawable.c2);
                    mB4.setBackgroundResource(R.drawable.d2);
                }
            }, 2000);
        }

    }
    public void setBg3(){
        if(flag==3){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mB1.setBackgroundResource(R.drawable.a3);
                    mB2.setBackgroundResource(R.drawable.b3);
                    mB3.setBackgroundResource(R.drawable.c3);
                    mB4.setBackgroundResource(R.drawable.d3);
                }
            }, 2000);
        }

    }
    public void setBg4(){
        if(flag==4){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mB1.setBackgroundResource(R.drawable.a4);
                    mB2.setBackgroundResource(R.drawable.b4);
                    mB3.setBackgroundResource(R.drawable.c4);
                    mB4.setBackgroundResource(R.drawable.d4);
                }
            }, 2000);
        }

    }
    public void setf(){
        if(f1 && f2 && f3 && f4){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mBf.setVisibility(View.VISIBLE);
                }
            }, 2000);


        }

    }


    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer = MediaPlayer.create(this.getBaseContext(),R.raw.n);
        mediaPlayer.seekTo(length);
        mediaPlayer.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.pause();
        length = mediaPlayer.getCurrentPosition();
    }

    @Override
    public void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }

}
