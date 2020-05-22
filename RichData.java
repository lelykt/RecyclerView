package com.dicoding.orangkaya;

import java.util.ArrayList;

public class RichData {
        private static String[] richNames = {
                "Jeff Bezos",
                "Bill Gates",
                "Amancio Ortega",
                "Warren Buffett",
                "Mark Zuckerberg",
                "Carlos Slim Helu",
                "Larry Ellison",
                "Michael Bloomberg",
                "Bernard Arnault",
                "Koch Bersaudara"
        };

        private static String[] richDetails = {
                "Jeff Bezos merupakan orang di balik kesuksesan Amazon, e-commerce terbesar di dunia saat ini. Jeff Bezos mendirikan raksasa ritel Amazon.com pada tahun 1994 setelah meninggalkan pekerjaannya di New York." +
                        "Industri: Teknologi\n" +
                        "Kekayaan Bersih: $90.6 miliar atau Rp 1.210 triliun",
                "Nama Bill Gates sudah lama dikenal sebagai orang terkaya di dunia. Meski sudah dilampaui oleh Jeff Bezos, namanya sepertinya sulit untuk keluar dari daftar 10 besar orang terkaya di dunia." +
                        "Industri: Teknologi\n" +
                        "Kekayaan Bersih: $90 miliar atau setara Rp 1.202 triliun",
                "Amancio Ortega, milyarder asal Spanyol, lebih dikenal sebagai sosok pendiri grup perusahaan Inditex yang bergerak di bidang fashion, induk perusahaan yang menaungi Zara dan beberapa perusahaan lainnya." +
                        "Industri: Ritel\n" +
                        "Kekayaan Bersih: $83,2 miliar atau setara Rp 1.111 triliun",
                "Nama Warrent Buffet mungkin sudah terngiang dalam ingatan orang sebagai sosok investor jenius. CEO Berkshire Hathaway ini merupakan figur ikonik yang membeli saham pertamanya di usia 11 tahun. Saat ini, Warren Buffet memiliki 60 lebih perusahaan." +
                        "Industri: Keuangan dan Pengalokasian Dana\n" +
                        "Kekayaan Bersih: $74,3 miliar atau setara Rp 992,4 triliun",
                "Mark Zuckerberg membuat versi pertama Facebook di tahun 2004 saat ia masih menjadi mahasiswa tingkat dua di Universitas Harvard. Meski tidak pernah lulus kuliah, Mark merupakan orang termuda dalam daftar orang terkaya di dunia saat berusia 33 tahun, sekaligus menjadi pemimpin dan CEO Facebook." +
                        "Industri: Teknologi\n" +
                        "Kekayaan Bersih: $72,2 miliar atau setara Rp 964,3 triliun",
                "Taipan bisnis asal Meksiko Carlos Slim Helu adalah sosok terkaya di negara asalnya dan saat ini membawahi 200 perusahaan di bidang ritel, perbankan hingga telekomunikasi. America Movil, salah satu perusahaan miliknya, merupakan perusahaan mobile seluler terbesar di Amerika Latin." +
                        "Industri: Telekomunikasi, ritel dan perbankan\n" +
                        "Kekayaan Bersih: $69,7 miliar atau setara Rp 930,2 triliun",
                "Larry Ellison, pendiri, pemimpin sekaligus mantan CEO Oracle yang merupakan perusahaan software terkemuka di dunia. Ia mendirikan perusahaan tersebut di tahun 1977, padahal sebenarnya belum pernah mengenyam pendidikan formal mengenai ilmu komputer di sekolah." +
                        "Industri: Software\n" +
                        "Kekayaan Bersih: $62,1 miliar atau setara Rp 828,8 triliun",
                "Selain sebagai seorang pengusaha, ia juga merupakan seorang dermawan dan politikus. Pada tahun 1981, ia mendirikan Bloomberg L.P., sebuah perusahaan sistem teknologi informasi dan media yang nilainya saat ini sudah tumbuh menjadi $45 miliar dengan lebih dari 100 kantor perwakilan di seluruh dunia. Sebelumnya, ia merupakan seorang mitra di Salomon Brothers, bank pengalokasian dana Wall Street." +
                        "Industri: Media\n" +
                        "Kekayaan Bersih: $53,3 miliar atau setara Rp 711,3 triliun",
                "Bulgari dan Louis Vuitton hanyalah dua di antara brand terkemuka di bawah naungan Bernard Arnault. Milyarder berkebangsaan Prancis tersebut merupakan pemimpin dan CEP LVMH, perusahaan barang-barang mewah terbesar di dunia. Industri: Ritel\n" +
                        "Kekayaan Bersih: $53 miliar atau setara Rp 707,4 triliun",
                "Charles Koch berusia lebih dari 81 tahun merupakan CEO, pemimpin dan pemilik Koch Industries, perusahaan swasta terbesar kedua di Amerika Serikat.\n" +
                        "\n" +
                        "Ia dan saudaranya masing-masing memiliki 42% kepemilikan Koch Industries yang memproduksi brand seperti Dixie Cup, Quilted Northern dan Stainmaster. Kedua bersaudara tersebut mewarisi Wichita, perusahaan yang berbasis di Kansas dari ayah mereka.\n" +
                        "\n" +
                        "Industri: Ritel\n" +
                        "Kekayaan Bersih: $48,5 miliar atau setara Rp 647,4 triliun"
        };

        private static int[] richImages = {
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j
        };

        static ArrayList<Rich> getListData() {
            ArrayList<Rich> list = new ArrayList<>();
            for (int position = 0; position < richNames.length; position++) {
                Rich hero = new Rich();
                hero.setName(richNames[position]);
                hero.setDetail(richDetails[position]);
                hero.setPhoto(richImages[position]);
                list.add(hero);
            }
            return list;
        }
}
