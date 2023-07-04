package pt.atec.xilofone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int Do;
    private int re;
    private int mi;
    private int fa;
    private int sol;
    private int la;
    private int si;
    private int Do2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);

        Do = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        re = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mi = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        fa = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        sol = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        la = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        si = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        Do2 = mSoundPool.load(getApplicationContext(),R.raw.note8_cm,1);



    }


    public void Clica(View v) {
        switch (v.getId()) {
            case R.id.button:
                mSoundPool.play(Do,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Do", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                mSoundPool.play(re,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Re", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                mSoundPool.play(mi,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Mi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                mSoundPool.play(fa,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Fa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                mSoundPool.play(sol,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Sol", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                mSoundPool.play(la,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "La", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                mSoundPool.play(si,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Si", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                mSoundPool.play(Do2,1.0f,1.0f,0,0,1.0f);
                Toast.makeText(this, "Do", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
