package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView mstoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        mStoryIndex = 1;

        final int[] mDestini = {
                R.string.T1_Story, //0
                R.string.T1_Ans1, //1
                R.string.T1_Ans2, //2
                R.string.T2_Story, //3
                R.string.T2_Ans1, //4
                R.string.T2_Ans2, //5
                R.string.T3_Story, //6
                R.string.T3_Ans1, //7
                R.string.T3_Ans2,  //8
                R.string.T4_End, //9
                R.string.T5_End, //10
                R.string.T6_End  //11
        };

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mStoryIndex == 1 || mStoryIndex == 3 ) {
                    mStoryIndex = 6;
                    mstoryTextView.setText(mDestini[mStoryIndex]);
                    mButtonTop.setText(mDestini[mStoryIndex+1]);
                    mButtonBottom.setText(mDestini[mStoryIndex+2]);
                }
                else if (mStoryIndex == 6) {
                    mstoryTextView.setText(mDestini[11]);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 6) {
                    mButtonBottom.setVisibility(View.INVISIBLE);
                    mstoryTextView.setText(mDestini[10]);
                    mButtonTop.setVisibility(View.INVISIBLE);
                }
                if ( mStoryIndex ==1 ) {
                    mStoryIndex = 3;
                    mstoryTextView.setText(mDestini[mStoryIndex]);
                    mButtonTop.setText(mDestini[mStoryIndex+1]);
                    mButtonBottom.setText(mDestini[mStoryIndex+2]);
                }
                else if (mStoryIndex == 3) {
                    mstoryTextView.setText(mDestini[9]);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                }
            }
        } );
    }
}
