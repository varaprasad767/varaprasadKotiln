# Introduction Android Studio
System Requirements

Before downloading and installing Android Studio, the following requirements are 

essential. ∙ Operating System Version - Microsoft Windows 7/8/10 (32-bit or 64-bit). 

∙
Random Access Memory (RAM) - Minimum 4 GB RAM and 8 GB RAM recommended. 

∙ Free Disk Space - Minimum 4 GB and 8 GB recommended.

∙ Minimum Required JDK Version - Java Development Kit (JDK) 8. 

∙ Minimum Screen Resolution - 1280 * 800.resolution 

## Download and Install Android Studio

### Step 1

To download the Android Studio, visit the official Android Studio website in your web browser

### Step 2

Click on the "Download Android Studio" option. 

## CountApp

### Activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/resultTV"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
       android:gravity="center"
        android:textSize="40sp"
        android:text="0"

        />

    <Button
        android:id="@+id/btnInc"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Increment"
        android:layout_gravity="center"

         />

</LinearLayout>

### MainActivity.kt

package com.example.countapp

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.view.View

import android.widget.Button

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //1: Initial Object
    
    var btnIncObj: Button? = null
    
    var resultTvObj: TextView? = null
    
    var counter: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
    
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_main)


        //2:Linking UI Components
        val btnIncObj:Button = findViewById(R.id.btnInc);
        resultTvObj = findViewById(R.id.resultTV);
       btnIncObj.setOnClickListener(View.OnClickListener {
           counter++;

           //Set the Value in Result TV Object
           resultTvObj!!.text = counter.toString();

       })
    }
}


## Output


![CountApp](https://raw.githubusercontent.com/varaprasad767/varaprasadKotiln/master/countapp.png)


## DiceRoleApp

### Activity_main.xml

<?xml version="1.0" encoding="utf-8"?>

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:app="http://schemas.android.com/apk/res-auto"
    
    xmlns:tools="http://schemas.android.com/tools"
    
    android:layout_width="match_parent"
    
    android:layout_height="match_parent"
    
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/rollTV"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginBottom="20dp"
        android:text="1"
        android:textColor="@color/black"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/rollBTN"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="16dp"
        android:layout_marginLeft="16dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="16dp"
        android:layout_marginRight="16dp"
        android:text="Roll"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/rollTV" />

    <ImageView
        android:id="@+id/rollImageView"
        android:layout_width="249dp"
        android:layout_height="237dp"
        android:layout_marginStart="20dp"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginBottom="20dp"
        app:layout_constraintBottom_toTopOf="@+id/rollTV"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/dice_1" />
</androidx.constraintlayout.widget.ConstraintLayout>

### MainActivity.kt

package com.example.diceroleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    //1: Initlizers
    var rollTVObj : TextView? = null
    var rollBTNObj : Button? = null
    var rollImageViewObj : ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking
        rollTVObj = findViewById(R.id.rollTV);
        rollBTNObj = findViewById(R.id.rollBTN);
        rollImageViewObj = findViewById(R.id.rollImageView)

        rollBTNObj!!.setOnClickListener { rollDice() }

    }

    private fun rollDice() {

        val dice = Dice(6)
        val diceRoll = dice.roll()

        rollTVObj!!.text = diceRoll.toString()

        when(diceRoll){
            1->rollImageViewObj!!.setImageResource(R.drawable.dice_1)
            2->rollImageViewObj!!.setImageResource(R.drawable.dice_2)
            3->rollImageViewObj!!.setImageResource(R.drawable.dice_3)
            4->rollImageViewObj!!.setImageResource(R.drawable.dice_4)
            5->rollImageViewObj!!.setImageResource(R.drawable.dice_5)
            6->rollImageViewObj!!.setImageResource(R.drawable.dice_6)

        }
    }
}

//Class for Generate a Random Number Between 1 to 6

class Dice(private val numSide: Int){

    fun roll():Int{
    
        return (1..numSide).random();
    }
}




## Output



![Rolesdice](https://raw.githubusercontent.com/varaprasad767/varaprasadKotiln/master/Rolesdice.png)


## Layouts  Introduction.

### Layouts 

are specific types of ViewGroups (subclasses of ViewGroup)

contain child views

can be in a row, column, grid, table, absolute

### Common Layout Classes

1.ConstraintLayout: Connect views with constraints 

2.LinearLayout: Horizontal or vertical row

3.RelativeLayout: Child views relative to each other

4.TableLayout: Rows and columns

5.FrameLayout: Shows one child of a stack of children

![layo]varaprasad767/varaprasadKotiln/blob/master/layo.png
















