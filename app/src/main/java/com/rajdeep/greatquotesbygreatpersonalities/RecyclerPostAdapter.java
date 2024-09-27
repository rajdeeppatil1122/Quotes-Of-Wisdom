package com.rajdeep.greatquotesbygreatpersonalities;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RecyclerPostAdapter extends RecyclerView.Adapter<RecyclerPostAdapter.ViewHolder> {       // We are creating a custom ViewHolder (whatever written inside those <> signs). Basically, it is a reference of the ViewHolder and on which class it belongs too.

    Context context;
    ArrayList<PostModel> arrPosts;
    String fontPath = "";
    String currentNameOfAuthor = "";
    int order;

    int num = 1;        //if num odd means the post is to be added into the database and num even means to be removed

    public RecyclerPostAdapter(Context context, ArrayList<PostModel> arrPosts, int order, String path) {
        this.context = context;
        this.arrPosts = arrPosts;
        this.order = order;
        this.fontPath = path;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {     // Creates ViewHolder (Before creating a ViewHolder, we should create a view because on creating a ViewHolder, it will call its constructor which will need the View. So create View first then ViewHolder.

        View view = LayoutInflater.from(context).inflate(R.layout.row, parent, false);      // Whenever we want to GENERATE the View from the Layout (XML), we have to use the LayoutInflater class. /* We need context in the from() method. But we are not in the activity class so we directly cannot take the context. So we take the Context from the constructor of the RecyclerContactAdapter class while creating its object and will set the context to create a view.*/
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;    // We should pass the reference of ViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {        // Sets the data in the views.
        String strImgName = "";
        int flagNo = 0;
        int quoteNo = 0;

        if (order == 1) {       // descending
            strImgName = arrPosts.get(arrPosts.size() - 1 - position).img;   // we are doing arrPost.size() because we want it in lasted liked should be shown first
            flagNo = arrPosts.get(arrPosts.size() - 1 - position).flag;       // author number (flag no)
            quoteNo = arrPosts.get(arrPosts.size() - 1 - position).text;    // gives no. of textview in flag
        } else if (order == 0) {      // ascending
            strImgName = arrPosts.get(position).img;
            flagNo = arrPosts.get(position).flag;
            quoteNo = arrPosts.get(position).text;
        }

        DatabaseHelper databaseHelper = new DatabaseHelper(context);

        QuotesActivity q = new QuotesActivity(context);
        String quote = "";

        if (flagNo == 1) {
            currentNameOfAuthor = "Albert Einstein";
            quote = q.arrayAlbert[quoteNo];
        } else if (flagNo == 2) {
            currentNameOfAuthor = "A.P.J. Abdul Kalam";
            quote = q.arrayApj[quoteNo];
        } else if (flagNo == 3) {
            currentNameOfAuthor = "Steve Jobs";
            quote = q.arraySteve[quoteNo];
        } else if (flagNo == 4) {
            currentNameOfAuthor = "Henry Ford";
            quote = q.arrayHenry[quoteNo];
        } else if (flagNo == 5) {
            currentNameOfAuthor = "Gautama Buddha";
            quote = q.arrayGautamaBuddha[quoteNo];
        } else if (flagNo == 6) {
            currentNameOfAuthor = "Dalai Lama";
            quote = q.arrayDalaiLama[quoteNo];
        } else if (flagNo == 7) {
            currentNameOfAuthor = "Bruce Lee";
            quote = q.arrayBruceLee[quoteNo];
        } else if (flagNo == 8) {
            currentNameOfAuthor = "Martin Luther King Jr.";
            quote = q.arrayMartinLuther[quoteNo];
        } else if (flagNo == 9) {
            currentNameOfAuthor = "Thomas Edison";
            quote = q.arrayThomas[quoteNo];
        } else if (flagNo == 10) {
            currentNameOfAuthor = "Bill Gates";
            quote = q.arrayBill[quoteNo];
        }
        else if (flagNo == 11) {
            currentNameOfAuthor = "Abraham Lincoln";
            quote = q.arrayAbrahamLincoln[quoteNo];
        } else if (flagNo == 12) {
            currentNameOfAuthor = "Alan Watts";
            quote = q.arrayAlanWatts[quoteNo];
        } else if (flagNo == 13) {
            currentNameOfAuthor = "Aesop";
            quote = q.arrayAesop[quoteNo];
        } else if (flagNo == 14) {
            currentNameOfAuthor = "Albert Camus";
            quote = q.arrayAlbertCamus[quoteNo];
        } else if (flagNo == 15) {
            currentNameOfAuthor = "Benjamin Franklin";
            quote = q.arrayBenjaminFranklin[quoteNo];
        } else if (flagNo == 16) {
            currentNameOfAuthor = "Barack Obama";
            quote = q.arrayBarackObama[quoteNo];
        } else if (flagNo == 17) {
            currentNameOfAuthor = "Charlie Chaplin";
            quote = q.arrayCharlieChaplin[quoteNo];
        } else if (flagNo == 18) {
            currentNameOfAuthor = "Christopher Dawson";
            quote = q.arrayChristopherDawson[quoteNo];
        } else if (flagNo == 19) {
            currentNameOfAuthor = "Charles Dickens";
            quote = q.arrayCharlesDickens[quoteNo];
        } else if (flagNo == 20) {
            currentNameOfAuthor = "Antony Robbin";
            quote = q.arrayAntonyRobbin[quoteNo];
        } else if (flagNo == 21) {
            currentNameOfAuthor = "ATG";
            quote = q.arrayATG[quoteNo];
        } else if (flagNo == 22) {
            currentNameOfAuthor = "Christopher Hitchens";
            quote = q.arrayChristopherHitchens[quoteNo];
        } else if (flagNo == 23) {
            currentNameOfAuthor = "Charles Darwin";
            quote = q.arrayCharlesDarwin[quoteNo];
        } else if (flagNo == 24) {
            currentNameOfAuthor = "Bernard Baruch";
            quote = q.arrayBernardBaruch[quoteNo];
        } else if (flagNo == 25) {
            currentNameOfAuthor = "Vivekananda";
            quote = q.arrayVivekananda[quoteNo];
        } else if (flagNo == 26) {
            currentNameOfAuthor = "Deepak Chopra";
            quote = q.arrayDeepakChopra[quoteNo];
        } else if (flagNo == 27) {
            currentNameOfAuthor = "Elon";
            quote = q.arrayElon[quoteNo];
        } else if (flagNo == 28) {
            currentNameOfAuthor = "William";
            quote = q.arrayWilliam[quoteNo];
        } else if (flagNo == 29) {
            currentNameOfAuthor = "Plato";
            quote = q.arrayPlato[quoteNo];
        } else if (flagNo == 30) {
            currentNameOfAuthor = "Socrates";
            quote = q.arraySocrates[quoteNo];
        } else if (flagNo == 31) {
            currentNameOfAuthor = "Sivanand";
            quote = q.arraySivanand[quoteNo];
        } else if (flagNo == 32) {
            currentNameOfAuthor = "Mark Twain";
            quote = q.arrayMarkTwain[quoteNo];
        } else if (flagNo == 33) {
            currentNameOfAuthor = "Gandhi";
            quote = q.arrayGandhi[quoteNo];
        } else if (flagNo == 34) {
            currentNameOfAuthor = "Leonardo";
            quote = q.arrayLeonardo[quoteNo];
        } else if (flagNo == 35) {
            currentNameOfAuthor = "Usain Bolt";
            quote = q.arrayUsainBolt[quoteNo];
        } else if (flagNo == 36) {
            currentNameOfAuthor = "Helen";
            quote = q.arrayHelen[quoteNo];
        } else if (flagNo == 37) {
            currentNameOfAuthor = "Karl Marx";
            quote = q.arrayKarlMarx[quoteNo];
        } else if (flagNo == 38) {
            currentNameOfAuthor = "Christ Jesus";
            quote = q.arrayChristJesus[quoteNo];
        } else if (flagNo == 39) {
            currentNameOfAuthor = "Washington";
            quote = q.arrayWashington[quoteNo];
        } else if (flagNo == 40) {
            currentNameOfAuthor = "Mahummad";
            quote = q.arrayMahummad[quoteNo];
        } else if (flagNo == 41) {
            currentNameOfAuthor = "Emily";
            quote = q.arrayEmily[quoteNo];
        } else if (flagNo == 42) {
            currentNameOfAuthor = "Fyodor";
            quote = q.arrayFyodor[quoteNo];
        } else if (flagNo == 43) {
            currentNameOfAuthor = "Jane Austin";
            quote = q.arrayJaneAustin[quoteNo];
        } else if (flagNo == 44) {
            currentNameOfAuthor = "Osho";
            quote = q.arrayOsho[quoteNo];
        } else if (flagNo == 45) {
            currentNameOfAuthor = "Confucius";
            quote = q.arrayConfucius[quoteNo];
        } else if (flagNo == 46) {
            currentNameOfAuthor = "Neil";
            quote = q.arrayNeil[quoteNo];
        } else if (flagNo == 47) {
            currentNameOfAuthor = "Newton";
            quote = q.arrayNewton[quoteNo];
        } else if (flagNo == 48) {
            currentNameOfAuthor = "Tonny";
            quote = q.arrayTonny[quoteNo];
        } else if (flagNo == 49) {
            currentNameOfAuthor = "Van";
            quote = q.arrayVan[quoteNo];
        } else if (flagNo == 50) {
            currentNameOfAuthor = "Warren";
            quote = q.arrayWarren[quoteNo];
        } else if (flagNo == 51) {
            currentNameOfAuthor = "Chanakya";
            quote = q.arrayChanakya[quoteNo];
        } else if (flagNo == 52) {
            currentNameOfAuthor = "Denis";
            quote = q.arrayDenis[quoteNo];
        } else if (flagNo == 53) {
            currentNameOfAuthor = "Walt Disney";
            quote = q.arrayWaltDisney[quoteNo];
        } else if (flagNo == 54) {
            currentNameOfAuthor = "Walt Whitman";
            quote = q.arrayWaltWhitman[quoteNo];
        } else if (flagNo == 55) {
            currentNameOfAuthor = "Nikola Tesla";
            quote = q.arrayNikolaTesla[quoteNo];
        }


//        Log.d("Image NAME : ", strImgName);

        Uri imgUri = q.giveUri(strImgName);     // giving context firstly then only it will be able to find the imageUri for recyclerView

        holder.imgPostImage.setImageURI(imgUri);

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontPath); // Replace "your_font.ttf" with the actual font file name in your assets folder
        holder.txtPostText.setTypeface(typeface);
        if (fontPath.equals("greatvibes_regular.ttf")) {
            holder.txtPostText.setTextSize(35);
        } else if (fontPath.equals("tangerine_bold.ttf")) {
            holder.txtPostText.setTextSize(42);
        } else if (fontPath.equals("cookie_regular.ttf")) {
            holder.txtPostText.setTextSize(37);
        }
        holder.txtPostText.setText(quote);

        if ((num / 2f) != 0) {
            holder.likedOrNotText.setText("Added To Favorites!");
        } else {
            holder.likedOrNotText.setText("Like");
        }

        // storing data in some another variables
        int finalQuoteNo = quoteNo;
        int finalFlagNo = flagNo;
        String finalStrImgName = strImgName;

        holder.heartLikeAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.heartLikeAnimation.playAnimation();
                if ((num % 2f) != 0) {     // if num is odd
                    databaseHelper.deleteLike(finalQuoteNo, finalFlagNo);
                    holder.likedOrNotText.setText("Like");
//                    System.out.println("In IF");
                    num++;
                } else {
//                    Log.d("ELSE:", "IN ELSE :))");
                    databaseHelper.insertLike(Integer.parseInt(finalStrImgName.substring(2)), finalQuoteNo, finalFlagNo);
                    holder.likedOrNotText.setText("Added To Favorites!");
                    num++;
                }
            }
        });

        holder.txtEnumerate.setText("Quote - " + (position + 1));

        holder.downloadIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.downloadIcon.playAnimation();
                Bitmap bitmap = Bitmap.createBitmap(holder.cardView.getWidth(), holder.cardView.getHeight(), Bitmap.Config.ARGB_8888);        // Holds image data
                Canvas canvas = new Canvas(bitmap);     // This will help to draw canvas on bitmap (dekhne main aisa lagata hain ki bas canvas object ko bitmap object ki jarurat hain aur bitmap object ko bilkul bhi jararat nahi hain par asal main toh bitmap object bhi indirectly impact hota hain jab ham canvas object ko bitmap send karte hain aur bitmap object ke upar esi waje se canvas draw kiya ja sakta hain. Yahi ek fayada hain bitmap ko.
                holder.cardView.draw(canvas);      // Will help to draw CardView on canvas


// Generate a unique file name for the image
                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
                String fileName = "image_" + timeStamp + ".png";


                ContentResolver contentResolver = context.getContentResolver();

// Insert the image file into the media database (for getting visible it into Gallery)

                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.DISPLAY_NAME, fileName);
                values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");
                values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/Great Quotes By Nobel People");
                Uri imageUri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

// Open an output stream to the image URI and copy the file contents
                try (OutputStream outputStream = contentResolver.openOutputStream(imageUri)) {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Toast.makeText(context, "Quote Saved To Gallery!", Toast.LENGTH_SHORT).show();
            }
        });

        holder.shareIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.shareIcon.playAnimation();
                Bitmap bitmap = Bitmap.createBitmap(holder.cardView.getWidth(), holder.cardView.getHeight(), Bitmap.Config.ARGB_8888);        // Holds image data
                Canvas canvas = new Canvas(bitmap);     // This will help to draw canvas on bitmap (dekhne main aisa lagata hain ki bas canvas object ko bitmap object ki jarurat hain aur bitmap object ko bilkul bhi jararat nahi hain par asal main toh bitmap object bhi indirectly impact hota hain jab ham canvas object ko bitmap send karte hain aur bitmap object ke upar esi waje se canvas draw kiya ja sakta hain. Yahi ek fayada hain bitmap ko.
                holder.cardView.draw(canvas);      // Will help to draw CardView on canvas

                String imagePath = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/my_image.png";

                try {
                    FileOutputStream outputStream = new FileOutputStream(imagePath);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);

                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Sharing the image:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("image/*");

                Uri imageUri = Uri.parse(imagePath);    // Getting URI of Image

                // Set the URI of the image file to be shared as the intent's extra
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                // Optionally, you can set a subject for the shared content
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Shared Image");
                // Optionally, you can set a text message to accompany the shared image
                shareIntent.putExtra(Intent.EXTRA_TEXT, "A Quote By " + currentNameOfAuthor + "~");


                // Create an intent chooser with a title
                Intent chooserIntent = Intent.createChooser(shareIntent, "Share Image");

                // Verify that at least one app can handle the share intent
                if (shareIntent.resolveActivity(context.getPackageManager()) != null) {
                    // Start the activity with the intent chooser
                    context.startActivity(chooserIntent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {     // Size of the data set
        return arrPosts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {    // The Java programming language allows you to define a class within another class.

        TextView txtPostText;
        CardView cardView;
        ImageView imgPostImage;
        LottieAnimationView downloadIcon, shareIcon;
        LottieAnimationView heartLikeAnimation;
        TextView likedOrNotText, txtEnumerate;

        public ViewHolder(View itemView) {     // The views will be thrown in the ViewHolder class. The ViewHolder class will get the view and it will pass it to its parent class.
            super(itemView);
            imgPostImage = itemView.findViewById(R.id.ImgId);    // We cannot directly access the ID coz we are not in the activity class. So, we have to use the 'itemView' are reference which we got while creating the ViewHolder object and passed that view here.
            txtPostText = itemView.findViewById(R.id.textview);
            heartLikeAnimation = itemView.findViewById(R.id.lottie_like);
            likedOrNotText = itemView.findViewById(R.id.txtLike);
            txtEnumerate = itemView.findViewById(R.id.txtEnumerate);
            downloadIcon = itemView.findViewById(R.id.downloadIcon);
            shareIcon = itemView.findViewById(R.id.shareIcon);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }


}
