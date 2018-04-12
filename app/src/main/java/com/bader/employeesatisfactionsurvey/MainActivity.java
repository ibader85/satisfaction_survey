package com.bader.employeesatisfactionsurvey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    // Question 1
    RadioButton question1_choice1;
    RadioButton question1_choice2;
    RadioButton question1_choice3;
    RadioButton question1_choice4;
    RadioButton question1_choice5;
    // Question 2
    RadioButton question2_choice1;
    RadioButton question2_choice2;
    RadioButton question2_choice3;
    RadioButton question2_choice4;
    RadioButton question2_choice5;
    // Question 3
    RadioButton question3_choice1;
    RadioButton question3_choice2;
    RadioButton question3_choice3;
    RadioButton question3_choice4;
    RadioButton question3_choice5;
    // Question 4
    RadioButton question4_choice1;
    RadioButton question4_choice2;
    RadioButton question4_choice3;
    RadioButton question4_choice4;
    RadioButton question4_choice5;
    // Question 5
    RadioButton question5_choice1;
    RadioButton question5_choice2;
    RadioButton question5_choice3;
    RadioButton question5_choice4;
    RadioButton question5_choice5;
    // Question 6
    RadioButton question6_choice1;
    RadioButton question6_choice2;
    RadioButton question6_choice3;
    RadioButton question6_choice4;
    RadioButton question6_choice5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {

        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        double final_score;

        //------------------------------------------------------------------------------------------
        // Question 1
        //------------------------------------------------------------------------------------------
        question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        question1_choice4 = (RadioButton) this.findViewById(R.id.question1_choice4);
        question1_choice5 = (RadioButton) this.findViewById(R.id.question1_choice5);
        if(question1_choice1.isChecked())
            answer1_score = 1;
        else if(question1_choice2.isChecked())
            answer1_score = 2;
        else if(question1_choice3.isChecked())
            answer1_score = 3;
        else if(question1_choice4.isChecked())
            answer1_score = 4;
        else if(question1_choice5.isChecked())
            answer1_score = 5;
        else
            answer1_score = 0;

        //------------------------------------------------------------------------------------------
        // Question 2
        //------------------------------------------------------------------------------------------
        question2_choice1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        question2_choice2 = (RadioButton) this.findViewById(R.id.question2_choice2);
        question2_choice3 = (RadioButton) this.findViewById(R.id.question2_choice3);
        question2_choice4 = (RadioButton) this.findViewById(R.id.question2_choice4);
        question2_choice5 = (RadioButton) this.findViewById(R.id.question2_choice5);
        if(question2_choice1.isChecked())
            answer2_score = 1;
        else if(question2_choice2.isChecked())
            answer2_score = 2;
        else if(question2_choice3.isChecked())
            answer2_score = 3;
        else if(question2_choice4.isChecked())
            answer2_score = 4;
        else if(question2_choice5.isChecked())
            answer2_score = 5;
        else
            answer2_score = 0;

        //------------------------------------------------------------------------------------------
        // Question 3
        //------------------------------------------------------------------------------------------
        question3_choice1 = (RadioButton) this.findViewById(R.id.question3_choice1);
        question3_choice2 = (RadioButton) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (RadioButton) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (RadioButton) this.findViewById(R.id.question3_choice4);
        question3_choice5 = (RadioButton) this.findViewById(R.id.question3_choice5);
        if(question3_choice1.isChecked())
            answer3_score = 1;
        else if(question3_choice2.isChecked())
            answer3_score = 2;
        else if(question3_choice3.isChecked())
            answer3_score = 3;
        else if(question3_choice4.isChecked())
            answer3_score = 4;
        else if(question3_choice5.isChecked())
            answer3_score = 5;
        else
            answer3_score = 0;

        //------------------------------------------------------------------------------------------
        // Question 4
        //------------------------------------------------------------------------------------------
        question4_choice1 = (RadioButton) this.findViewById(R.id.question4_choice1);
        question4_choice2 = (RadioButton) this.findViewById(R.id.question4_choice2);
        question4_choice3 = (RadioButton) this.findViewById(R.id.question4_choice3);
        question4_choice4 = (RadioButton) this.findViewById(R.id.question4_choice4);
        question4_choice5 = (RadioButton) this.findViewById(R.id.question4_choice5);
        if(question4_choice1.isChecked())
            answer4_score = 1;
        else if(question4_choice2.isChecked())
            answer4_score = 2;
        else if(question4_choice3.isChecked())
            answer4_score = 3;
        else if(question4_choice4.isChecked())
            answer4_score = 4;
        else if(question4_choice5.isChecked())
            answer4_score = 5;
        else
            answer4_score = 0;


        //------------------------------------------------------------------------------------------
        // Question 5
        //------------------------------------------------------------------------------------------
        question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice1);
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        question5_choice3 = (RadioButton) this.findViewById(R.id.question5_choice3);
        question5_choice4 = (RadioButton) this.findViewById(R.id.question5_choice4);
        question5_choice5 = (RadioButton) this.findViewById(R.id.question5_choice5);
        if(question5_choice1.isChecked())
            answer5_score = 1;
        else if(question5_choice2.isChecked())
            answer5_score = 2;
        else if(question5_choice3.isChecked())
            answer5_score = 3;
        else if(question5_choice4.isChecked())
            answer5_score = 4;
        else if(question5_choice5.isChecked())
            answer5_score = 5;
        else
            answer5_score = 0;

        //------------------------------------------------------------------------------------------
        // Question 6
        //------------------------------------------------------------------------------------------
        question6_choice1 = (RadioButton) this.findViewById(R.id.question6_choice1);
        question6_choice2 = (RadioButton) this.findViewById(R.id.question6_choice2);
        question6_choice3 = (RadioButton) this.findViewById(R.id.question6_choice3);
        question6_choice4 = (RadioButton) this.findViewById(R.id.question6_choice4);
        question6_choice5 = (RadioButton) this.findViewById(R.id.question6_choice5);
        if(question6_choice1.isChecked())
            answer6_score = 1;
        else if(question6_choice2.isChecked())
            answer6_score = 2;
        else if(question6_choice3.isChecked())
            answer6_score = 3;
        else if(question6_choice4.isChecked())
            answer6_score = 4;
        else if(question6_choice5.isChecked())
            answer6_score = 5;
        else
            answer6_score = 0;


        final_score = (answer1_score + answer2_score +answer3_score + answer4_score +answer5_score + answer6_score) / 6;

        String resultsDisplay = "Average satisfaction is : " + final_score;
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}
