package com.workspace.recyclerviewsubmit.resources;

import com.workspace.recyclerviewsubmit.R;

import java.util.ArrayList;

public class BukuData {
    private static String[] judulBuku = {
            "Kotlin Android",
            "Android Expert",
            "Love is Flutter",
            "Java Komplet",
            "Spring4",
            "Sillicon V Mindset",
            "Phyton Algorithms",
            "Pro Mern Stack",
            "Marketing 4.0",
            "Lean StartUp"
    };
    private static String[] descJudul = {
            "Belajar Kotlin Expert Android DICODING",
            "Menjadi Android Developer Expert",
            "Buku Flutter seri ketiga UDACODING",
            "Java mulai dari Nol sampai Master",
            "Pemrograman java dengan Spring 4",
            "Membangun ekosistem startup digital indonesia",
            "Mastering Basic Algoritms in the Phyton",
            "Full Stack Web App Development",
            "Bergerak dari tradisional ke digital",
            "The Lean Startup(Indonesia Edition)"
    };

    private static String[] stock = {
            "30",
            "20",
            "10",
            "10",
            "30",
            "5",
            "2",
            "1",
            "4",
            "3"
    };
    private static  String[] penulis = {
            "Nur Rohman & Rendra Toro",
            "Naruto uzumaki",
            "Jiraiya Sensei", //blm sempet research
            "Jubilee Enterprise",
            "Feri Djuandi",
            "Indra Utoyo",
            "Magnus Lie Hetland",
            "Vasan Subramanian",
            "Iwan Setiawan",
            "Eric Ries"
    };

    private static String[] penerbit = {
            "PT Presentologics",
            "PT Presentologics",
            "Udacoding",
            "Elex Media",
            "Elex Media",
            "Gramedia Pustaka",
            "Packt Publishing",
            "Apress",
            "Gramedia Pustaka",
            "Bentang Pustaka"
    };

    private static String[] harga = {
            "500000",
            "1100000",
            "911200",
            "74000",
            "54000",
            "67000",
            "110000",
            "175000",
            "212000",
            "85000",
            "72500"
    };
    private static String[] rating = {
            //sempurna hanya djisamsoe
            "4.9",
            "4.9",
            "4.9",
            "4.8",
            "4.7",
            "4.6",
            "3.3",
            "4.4",
            "4.5",
            "4.2"
    };

    private static String[] jmlReview = {
            "365Jt Review",
            "365Jt Review",
            "360Jt Review",
            "128 Review",
            "114 Review",
            "220 Review",
            "180 Review",
            "100 Review",
            "50 Review",
            "25 Review"
    };
    private static String[] halaman = {
            "284",
            "384",
            "322",
            "180",
            "190",
            "156",
            "240",
            "210",
            "120",
            "190"
    };

    private static String[] namaUlas = {
            "Robby diantaputra",
            "Rio",
            "Victor",
            "Ben",
            "Arridwan",
            "Tsunade",
            "Kakashi",
            "Saitama",
            "Bintang",
            "Nami chan"
    };
    private static String[] ulasan = {
            "Tidak berbeda dengan versi web buku lebih kecil dari java android expert",
            "Pengen punya belum ada kesempatan",
            "Flutter is awasome when react native tapi ebook ini ada bagian yang kurang pada rxdart",
            "Good",
            "Not bad",
            "Excelent",
            "mantap bosku",
            "sulit dimengerti ",
            "Good",
            "Metode yang simpel"
    };

    private static String[] tentangBuku = {
            "Penulis adalah auditor Badan Pemeriksa Keuangan Republik Indonesia (BPK RI) yang memiliki pengalaman lebih dari 20 tahun melakukan audit keuangan, audit kinerja, dan audit dengan tujuan tertentu pada berbagai",
            "Penulis menyelesaikan pendidikan Doktor Akuntansi di Fakultas Ekonomika dan Bisnis (FEB) Universitas Gadjah Mada (UGM) pada 2017. Sebelumnya, penulis meraih Master of Science bidang Manajemen, Teknologi Informasi, dan Perubahan Organisasi dari Lancaster University",
            "Rizki kecil lahir di Balai Tangah, Kecamatan Lintau Buo Utara, Kabupaten Tanah Datar,Sumatera Barat. Lahir dari keluarga kecil yang sederhana, Rizki mempunyai cita-cita untuk bisa bekerja secara professional di Bidang Teknologi",
            "Jika Anda mengetikkan top list java framework pada mesin pencari di Internet maka Spring hampir selalu muncul dalam daftar teratas dari berbagai situs web yang ditemukan. Saat ini secara de facto, Spring adalah salah satu framework paling populer dan menjadi pilihan",
            "Buku ini bisa menjadi dasar untuk setiap orang agar bisa mengenal Java dari nol lewat pembahasan yang komprehensif. Semoga setelah membaca buku ini, para pembaca siap untuk mempelajari Java dengan materi tingkat lanjut",
            "Berkolaborasi bersama Telkom Indonesia, Bank Mandiri melahirkan inkubator bisnis bernama Mandiri Capital Indonesia yang bertujuan memacu kelahiran startup digital Indonesia, khususnya di bidang financial technology. Segala pemikiran, ide, dan faktor yang dibutuhkan startup",
            "Python Algorithms, Second Edition explains the Python approach to algorithm analysis and design. Written by Magnus Lie Hetland, author of Beginning Python, this book is sharply focused on classical algorithms, but it also gives solid understanding of fundamental algorithmic",
            "This book will also cover many other tools that go into building a complete web application: React Router, React-Bootstrap, Redux, Babel, and webpack.\n" +
                    "Though the primary focus of Pro MERN Stack is to equip you with all that is required to build a full-fledged web application.",
            "Marketing 4.0 menawarkan pengetahuan baru yang akan menjadi titik awal dan sumber daya yang berharga untuk semua orang yang mencoba menciptakan serta memahami masa depan digital dan mobile",
            "Lewat riset ilmiah serta pengalamannya dalam mendirikan dan membesarkan berbagai startup selama bertahun-tahun, Eric Ries mencetuskan metode baru, Lean Startup. Sebuah sistem luar biasa yang membuat para enterpreneur segera mendapatkan jawaban"

    };

    private static int[] fotoBuku = {
            R.drawable.kotlin,
            R.drawable.androidexpert,
            R.drawable.loveflutter,
            R.drawable.javakomplet,
            R.drawable.spring4,
            R.drawable.mindset,
            R.drawable.phytona,
            R.drawable.promern,
            R.drawable.marketing40,
            R.drawable.leanstartup
    };



    public static ArrayList<Buku> getListData() {
        ArrayList<Buku> List = new ArrayList<>();
        for (int position = 0; position < judulBuku.length; position++) {
            Buku buku = new Buku();
            buku.setFotoBuku(fotoBuku[position]);
            buku.setJudul(judulBuku[position]);
            buku.setDescJudul(descJudul[position]);
            buku.setStock(stock[position]);
            buku.setPenulis(penulis[position]);
            buku.setPenerbit(penerbit[position]);
            buku.setHarga(harga[position]);
            buku.setRating(rating[position]);
            buku.setJmlReview(jmlReview[position]);
            buku.setHalaman(halaman[position]);
            buku.setNamaUlas(namaUlas[position]);
            buku.setUlasan(ulasan[position]);
            buku.setTentangBuku(tentangBuku[position]);

            List.add(buku);

        }
        return  List;
    }
}