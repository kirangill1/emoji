package com.example.priyanka.emoji;

import android.net.Uri;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.priyanka.emoji.R.drawable.embrassed;
import static com.example.priyanka.emoji.R.drawable.firstsmile1;
import static com.example.priyanka.emoji.R.drawable.sad;
import static com.example.priyanka.emoji.R.drawable.smile;
import static com.example.priyanka.emoji.R.drawable.thief;

public class MainActivity extends AppCompatActivity {
    TextView Faces_text;
    Button happy_btn, sad_btn, thief_btn, smile_btn, love_btn;
    ImageView mood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Faces_text = (TextView) findViewById(R.id.text_view);
        happy_btn = (Button) findViewById(R.id.button1);
        sad_btn = (Button) findViewById(R.id.button2);
        thief_btn = (Button) findViewById(R.id.button3);
        smile_btn = (Button) findViewById(R.id.button4);
        love_btn = (Button) findViewById(R.id.button5);
        mood = (ImageView) findViewById(R.id.image_view);
        sad_btn.setOnClickListener(onbuttonclick);
        happy_btn.setOnClickListener(onbuttonclick);
        smile_btn.setOnClickListener(onbuttonclick);
        thief_btn.setOnClickListener(onbuttonclick);
        love_btn.setOnClickListener(onbuttonclick);
    }


    public View.OnClickListener onbuttonclick = new View.OnClickListener()

    {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.button1) {
                mood.setImageDrawable(getResources().getDrawable(firstsmile1));
            }
            if (v.getId() == R.id.button2) {
                mood.setImageDrawable(getResources().getDrawable(sad));
            }
            if (v.getId() == R.id.button3) {
                mood.setImageDrawable(getResources().getDrawable(thief));
            }
            if (v.getId() == R.id.button4) {
                mood.setImageDrawable(getResources().getDrawable(smile));
            }
            if (v.getId() == R.id.button5) {
                mood.setImageDrawable(getResources().getDrawable(embrassed));
            }

        }

    };
}


