package com.rajdeep.greatquotesbygreatpersonalities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class LikeActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    TextView sortByText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);

        // setting the font style

        // Creating database object...
        DatabaseHelper db = new DatabaseHelper(LikeActivity.this);

        // setting up the imageview's background
        int info[] = db.getStyleInfo(); //info[0] = "1" (no. indicating font style) info[1] = "2" (no. indicating background image)
        String fontNumber = String.valueOf(info[0]);


        // setting font style:
        String path = "";

        if (fontNumber.equals("1")) {
            path = "bariol_bold_webfont.ttf";
        } else if (fontNumber.equals("2")) {
            path = "arial_regular.ttf";
        } else if (fontNumber.equals("3")) {
            path = "arial_bold.ttf";
        } else if (fontNumber.equals("4")) {
            path = "articulat_normal.otf";
        } else if (fontNumber.equals("5")) {
            path = "articulat_bold.otf";
        } else if (fontNumber.equals("6")) {
            path = "bariol_regular.otf";
        } else if (fontNumber.equals("7")) {
            path = "basecoat_regular.otf";
        } else if (fontNumber.equals("8")) {
            path = "basecoat_bold.otf";
        } else if (fontNumber.equals("9")) {
            path = "casual_regular.ttf";
        } else if (fontNumber.equals("10")) {
            path = "greatvibes_regular.ttf";
        } else if (fontNumber.equals("11")) {
            path = "monospace_external.ttf";
        } else if (fontNumber.equals("12")) {
            path = "nunito_regular.ttf";
        } else if (fontNumber.equals("13")) {
            path = "nunito_bold.ttf";
        } else if (fontNumber.equals("14")) {
            path = "nunito_black.ttf";
        } else if (fontNumber.equals("15")) {
            path = "proxima_nova_regular.ttf";
        } else if (fontNumber.equals("16")) {
            path = "proxima_nova_semibold.otf";
        } else if (fontNumber.equals("17")) {
            path = "proxima_nova_bold.ttf";
        } else if (fontNumber.equals("18")) {
            path = "roboto_regular.ttf";
        } else if (fontNumber.equals("19")) {
            path = "afta_saerif_thin_regular.otf";
        } else if (fontNumber.equals("20")) {
            path = "tangerine_bold.ttf";
        } else if (fontNumber.equals("21")) {
            path = "cookie_regular.ttf";
        }



        int order = 1;      // descending by default

        Intent intent = getIntent();
        int position = intent.getIntExtra("order", -1);
        if(position == 0){
            order = position;
        }

        floatingActionButton = findViewById(R.id.fabButton);
        sortByText = findViewById(R.id.sortByText);

        if(order == 1){
            sortByText.setText("Arranged By -  Newest Liked First");
        }
        else{
            sortByText.setText("Arranged By -  Oldest Liked First");
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerViewer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setVerticalScrollBarEnabled(true);

        DatabaseHelper obj = new DatabaseHelper(LikeActivity.this);
        ArrayList<PostModel> arrayList = obj.makeArrayList();
        Log.d("CALL MADE", "Call made");


        RecyclerPostAdapter recyclerPostAdapter = new RecyclerPostAdapter(this, arrayList, order, path);  // In RecyclerView, we have to make our own adapter and for using that adapter, we have to make an object of it. In ListView, we directly make the object of ArrayAdapter (not custom).
        recyclerView.setAdapter(recyclerPostAdapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Create an array of items for the ListView
                String[] items = {"Ascending (Oldest First)", "Descending (Newest First)"};

// Create a new AlertDialog builder
                AlertDialog.Builder builder = new AlertDialog.Builder(LikeActivity.this);
//                builder.setTitle("Sort the Quotes - By time liked");      // not setting title coz of no custom margin

// Create a custom layout for the dialog
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_layout, null);
                builder.setView(dialogView);

// Find the ListView in the custom dialog layout
                ListView listView = dialogView.findViewById(R.id.listView);

// Create an Custome ArrayAdapter to populate the ListView coz we want to put textColor as black
                CustomAdapter adapter = new CustomAdapter(LikeActivity.this, items);
                listView.setAdapter(adapter);



// Add a cancel button to the dialog
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss(); // Close the dialog
                    }
                });


                // Create and show the dialog
                AlertDialog dialog = builder.create();

// Set a click listener for the ListView items
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // Handle item click
                        String selectedItem = items[position];
//                        Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();

                        if(position == 0){      // 0 = Ascending and 1 = Descending (default)
                            Intent intent = new Intent(LikeActivity.this, LikeActivity.class);
                            intent.putExtra("order", position);
                            startActivity(intent);

                            finish();   // finishing the current activity
                        }
                        if(position == 1){      // 0 = Ascending and 1 = Descending (default)
                            Intent intent = new Intent(LikeActivity.this, LikeActivity.class);
                            intent.putExtra("order", position);
                            startActivity(intent);

                            finish();   // finishing the current activity
                        }

                        dialog.dismiss(); // Close the dialog
                    }
                });

                dialog.show();

            }
        });


    }
}