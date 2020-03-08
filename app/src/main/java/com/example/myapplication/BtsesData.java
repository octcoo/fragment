package com.example.myapplication;

import java.util.ArrayList;

public class BtsesData {
    private static String[] btsesNames = {
            "Min Yoongi",
            "Kim Taehyung",
            "Jeon Jungkook",
            "Kim Namjoon",
            "Park Jimin",
            "Jung Hoseok",
            "Kim Seokjin"
    };

    private static String[] btsesDetails = {
            "Min Yoon Gi atau yang lebih dikenal sebagai Suga memiliki satu orang kakak laki laki dalam keluarga. Suga merupakan lulusan Apujeong High School. Sekolah SMA Suga merupakan sekolah khusus untuk pria.",
            "Member selanjutnya memiliki nama panggung V, pindah dari daerah kelahirannya ke Geochang dan tumbuh besar di sana, sebelum pada akhirnya pindah ke Seoul. Ia memiliki dua orang adik, satu orang perempuan dan laki laki. V bersekolah di Korea Arts School.",
            "Saat dirinya belum tergabung bersama boy group BTS, Jungkook yang masih berusia 13 tahun telah mengikuti audisi Superstar K3. Namun, ia gagal saat audisi tersebut. Meski begitu, audisi tersebut menjadi jalan pembuka bagi dirinya, ia ternyata telah diincar oleh beberapa agensi yang berbeda dan salah satunya adalah Big Hit Entertainment.",
            "Kim Nam Joon atau yang memiliki nama panggung RM ini dulu lebih dikenal dengan sebutan Rap Monster. Namun, kini hanya lebih sering dipanggil dengan nama RM BTS. Dia merupakan leader sekaligus main rapper dari BTS. Walaupun RM bukan member tertua, namun ia dipercaya untuk menjadi seorang leader di boy group Bangtan Boys ini",
            "Park Ji Min atau yang biasa dikenal sebagai Jimin, memiliki beberapa nama panggilan yang akrab bagi penggemar. Ia sering dipanggil dengan Chim Chim, Dolly, atau Park Jimine.",
            "Sebelum bergabung dengan BTS, J-Hope tergabung dalam sebuah grup street dance yang bernama NEURON. Bersama grup street dance NEURON ini, J-Hope sering mengikuti berbagai ajang kompetisi dan kejuaraan tari. Di BTS, J-Hope termasuk ke dalam line dancer bersama dengan Jungkook dan Jimin.",
            "Member BTS yang satu ini merupakan member tertua dalam grup BTS. Jin memiliki hobi memasak. Sebelum resmi debut dengan BTS, Jin menjalani masa training selama tiga tahun. Saat menjadi seorang trainee, member yang menjadi teman pertamanya pada saat itu adalah V. Mereka berdua memiliki banyak kesamaan dan hobi yang sama."
    };

    private static int[] btsesImages = {
            R.drawable.suga,
            R.drawable.v,
            R.drawable.jk,
            R.drawable.rm,
            R.drawable.jimin,
            R.drawable.jhope,
            R.drawable.jin
    };

    public static ArrayList<BtsesModel> getBtsList(){
        BtsesModel btses = null;
        ArrayList<BtsesModel> list = new ArrayList<>();

        for (int i = 0; i < btsesNames.length; i++){
            btses = new BtsesModel();
            btses.setBtsName(btsesNames[i]);
            btses.setBtsDetail(btsesDetails[i]);
            btses.setBtsImg(btsesImages[i]);
            list.add(btses);
        }
        return list;
    }
}

