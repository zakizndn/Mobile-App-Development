package com.example.myfoe;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Laboratory extends AppCompatActivity {

    Button d1, d2, d3, d4, d5, d6, d7, d8;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratory);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download2();
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download3();
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download4();
            }
        });

        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download5();
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download6();
            }
        });

        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download7();
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download8();
            }
        });
    }

    public void download1()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("BETA_Lab_Schedule.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Beta_Lab_Schedule", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download2()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("GAMMA-Lab-Schedule.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Gamma_Lab_Schedule", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download3()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("DELTA-Lab-Schedule.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Delta_Lab_Schedule", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download4()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("EPSILON-Lab-Schedule.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Epsilon_Lab_Schedule", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download5()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("BETA-Lab-Group.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "BETA_Lab_Group", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download6()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("GAMMA-Lab-Group.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Gamma_Lab_Group", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download7()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("DELTA-Lab-Group.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Delta_Lab_Group", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void download8()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("EPSILON-Lab-Group.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Toast.makeText(Laboratory.this, "Downloaded Successfully", Toast.LENGTH_SHORT).show();
                String url = uri.toString();
                downloadFile(Laboratory.this, "Epsilon_Lab_Group", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Laboratory.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url)
    {
        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }
}