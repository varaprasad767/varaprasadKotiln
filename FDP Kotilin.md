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





