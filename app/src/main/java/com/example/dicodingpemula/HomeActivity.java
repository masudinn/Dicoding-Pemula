package com.example.dicodingpemula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView =findViewById(R.id.rc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMyList());
        recyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m= new Model();
        m.setTittle("BUMI");
        m.setDescription("Bumi merupakan planet ketiga dari delapan planet dalam Tata Surya." +
                "Diperkirakan usianya mencapai 4,6 milyar tahun. Jarak antara Bumi dengan matahari adalah 149.6 juta kilometer." +
                "Bumi mempunyai lapisan udara (atmosfer) dan medan magnet yang disebut (magnetosfer) " +
                "yang melindung permukaan Bumi dari angin matahari,sinar ultraungu,dan radiasi dari luar angkasa.");
        m.setImg(R.drawable.bumi);
        models.add(m);

        m= new Model();
        m.setTittle("BULAN");
        m.setDescription("Bulan adalah satelit alami Bumi satu-satunya dan merupakan satelit terbesar kelima dalam Tata Surya." +
                "Bulan juga merupakan satelit alami terbesar di Tata Surya menurut ukuran planet yang diorbitnya,dengan diameter 27%,kepadatan 60%,dan massa \u200B¹⁄₈₁ dari Bumi");
        m.setImg(R.drawable.bulan);
        models.add(m);

        m= new Model();
        m.setTittle("PLUTO");
        m.setDescription("Pluto planet katai di sabuk Kuiper dan objek trans-Neptunus pertama yang ditemukan." +
                "Pluto merupakan planet katai terbesar dan bermassa terbesar kedua di Tata Surya " +
                "dan benda terbesar kesembilan dan bermassa terbesar kesepuluh yang mengorbit Matahari secara langsung.");
        m.setImg(R.drawable.pluto);
        models.add(m);

        m= new Model();
        m.setTittle("JUPITER");
        m.setDescription("Jupiter merupakan planet terdekat kelima dari matahari setelah Merkurius, Venus, Bumi, dan Mars.\n" +
                "\n" +
                "Jarak rata-rata antara Jupiter dan Matahari adalah 778,3 juta km." +
                "Jupiter adalah planet terbesar dan terberat dengan diameter 14.980 km dan memiliki massa 318 kali massa bumi." +
                "Periode rotasi planet ini adalah 9,8 jam,sedangkan periode revolusi adalah 11,86 tahun.");
        m.setImg(R.drawable.jupiter);
        models.add(m);

        m= new Model();
        m.setTittle("MERKURIUS");
        m.setDescription("Merkurius adalah planet di terkecil di dalam tata surya dan juga yang terdekat dengan Matahari dengan kala revolusi 88 hari." +
                "Kecerahan planet ini berkisar diantara -2 sampai 5,5 dalam magnitudo tampak namun " +
                "tidak mudah terlihat karena sudut pandangnya dengan matahari kecil (dengan rentangan paling jauh sebesar 28,3 derajat");
        m.setImg(R.drawable.merkurius);
        models.add(m);

        m= new Model();
        m.setTittle("NEPTUNUS");
        m.setDescription("Neptunus merupakan planet terjauh jika ditinjau dari Matahari.Planet ini dinamai dari dewa lautan Romawi." +
                "Neptunus merupakan planet terbesar keempat berdasarkan diameter dan terbesar ketiga berdasarkan massa." +
                "Massa Neptunus tercatat 17 kali lebih besar daripada Bumi, dan sedikit lebih besar");
        m.setImg(R.drawable.neptunus);
        models.add(m);

        m= new Model();
        m.setTittle("SATURNUS");
        m.setDescription("Saturnus adalah sebuah planet di tata surya yang dikenal juga sebagai planet bercincin." +
                "Jarak Saturnus sangat jauh dari Matahari, karena itulah Saturnus tampak tidak terlalu jelas dari Bumi." +
                "Saturnus berevolusi dalam waktu 29,46 tahun. Setiap 378 hari, Bumi, Saturnus, dan Matahari akan berada dalam satu garis lurus." +
                "Selain berevolusi,Saturnus juga berotasi dalam waktu yang sangat singkat, yaitu 10 jam 14 menit.");
        m.setImg(R.drawable.saturnus);
        models.add(m);

        m= new Model();
        m.setTittle("URANUS");
        m.setDescription("Uranus merupakan planet ketujuh dari Matahari dan planet yang terbesar ketiga dan terberat keempat dalam Tata Surya." +
                "Ia dinamai dari nama dewa langit Yunani kuno Uranus (Οὐρανός) ayah dari Kronos (Saturnus) dan kakek dari Zeus (Jupiter)");
        m.setImg(R.drawable.uranus);
        models.add(m);

        m= new Model();
        m.setTittle("VENUS");
        m.setDescription("Venus adalah planet terdekat kedua dari matahari setelah Merkurius." +
                "Planet ini memiliki radius 6.052 km dan mengelilingi matahari dalam waktu 225 hari." +
                "Atmosfer Venus mengandung 97% karbondioksida (CO2) dan 3% nitrogen,sehingga hampir tidak mungkin terdapat kehidupan.");
        m.setImg(R.drawable.venus);
        models.add(m);

        m= new Model();
        m.setTittle("MATAHARI");
        m.setDescription("Matahari itu adalah bintang di pusat tata surya.Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet." +
                "Diameternya sekitar 1.392.684 km, kira-kira 109 kali diameter Bumi.");
        m.setImg(R.drawable.matahari);
        models.add(m);

        return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.barAbout) {
            Intent intent = new Intent(HomeActivity.this, MeActivity.class);
            startActivity(intent);
        }return true;
    }
}
