package robbydeveloper.taukahanda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MateriActivity extends AppCompatActivity {

    TextView tvParagraf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        TextView tvParagraf = (TextView) findViewById(R.id.paragraf);
        tvParagraf.setText(" - Patimura Lahir Di Haria, Saparua Pada Tanggal 8-Juni-1783 \ndan wafat pada 16-December-1817, Ambon, Maluku\n\n" +
                "- Washington DC adalah ibukota Amerika Serikat, Sedangkan \nNew York adalah sebuah negara bagian Amerika Serikat yang terletak di wilayah (region) antara Atlantik Tengah, dan Timur \n\n"+
                "- Kota Manado adalah ibu kota dari provinsi Sulawesi Utara, \nManado terletak di Teluk Manado, dan dikelilingi oleh daerah pegunungan. \nKota ini memiliki 408.354 penduduk pada Sensus 2010 \n\n" +
                "- Komodo, atau yang selengkapnya disebut biawak komodo (Varanus komodoensis), \nadalah spesies kadal terbesar di dunia yang hidup di pulau \n -Komodo \n -Rinca \n -Flores \n -Gili Motang \ndan Gili Dasami di Nusa Tenggara. \nBiawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora.\n\n" +
                "- Adipura Kencana adalah penghargaan Adipura yang diberikan kepada kabupaten/kota \nyang selain memenuhi syarat kota berkelanjutan juga telah meraih anugerah Adipura minimal tiga kali berturut-turut. \nAdipura Kencana Tahun 2017 diberikan kepada 6 kota dan kabupaten di Indonesia. \n Sebagai Berikut : \n" +
                "1.Kota Surabaya, Jawa Timur\n" +
                "2.Kota Tangerang, Banten\n" +
                "3.Kota Balikpapan, Kalimantan Timur\n" +
                "4.Kota Malang, Jawa Timur\n" +
                "5.Kabupaten Kudus, Jawa Tengah\n" +
                "6.Kabupaten Jombang, Jawa Timur" +
                "\n\n" +
                "- Faktanya Palung Mariana atau Palung Marianas adalah palung yang paling dalam yang diketahui, dan lokasi terdalamnya berada di kerak Bumi. Palung ini terletak di dasar barat laut Samudra Pasifik, Palung ini memiliki kedalaman maksimum 10.911 meter (35.798 kaki) di bawah permukaan laut.\n\n" +
                "- Faktanya Google didirikan oleh Larry Page dan Sergey Brin saat masih mahasiswa Ph.D. di Universitas Stanford. Mereka berdua memegang 16 persen saham perusahaan. Mereka menjadikan Google sebagai perusahaan swasta pada tanggal 4 September 1998.\n\n" +
                "- Faktanya satu-satunya indera manusia yang tidak berfungsi saat tidur adalah indera penciuman." +
                "\n\n");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
