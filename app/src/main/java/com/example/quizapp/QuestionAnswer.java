package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={
            "What is the primary programming language used for Android app development?",
            "Which component in Android is responsible for managing the lifecycle of an application and serves as the entry point for the app's user interface?",
            "Which Android component is used to perform background tasks independently of the main user interface thread?",
            "Which XML file is used to declare the permissions required by an Android application?",
            "Which Android architecture component is designed to store and manage UI-related data in a lifecycle-conscious way?"
    };

    public static String choices[][] = {
            {"Python","C++","Swift","Java"},
            {"Activity","Intent","Fragment","BroadcastReceiver"},
            {"BroadcastReceiver","Activity","Service","ContentProvider"},
            {"activity_main.xml","AndroidManifest.xml","strings.xml","layout.xml"},
            {"ViewModel","LiveData","Room","BroadcastReceiver"}
    };

    public static String correctAnswers[] = {
            "Java",
            "Activity",
            "Service",
            "AndroidManifest.xml",
            "ViewModel"
    };


}
