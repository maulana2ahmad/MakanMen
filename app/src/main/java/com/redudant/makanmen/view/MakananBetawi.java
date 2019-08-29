package com.redudant.makanmen.view;

import android.view.Menu;

import com.redudant.makanmen.model.MenuMakanan;

import java.util.ArrayList;

public class MakananBetawi {

    public static String[][] data = new String[][]{
            {"Kerak Telor", "Makanan", "Kerak telor memiliki rasa gurih dan legit ini memang favorit warga Jakarta. Hidangan khas Betawi ini dibuat dari bahan-bahan makanan seperti, beras ketan putih, telur ayam atau bebek, ebi yang disangrai kering sampai menjadi serundeng, lalu ditambah bawang goreng, kemudian diberi bumbu halus seperti kelapa sangrai dan lainnya. Hal unik dari kuliner khas betawi ini adalah cara memasaknya. Telur dimasak ketika setengah matang akan dibalik wajannya menghadap panas arang dari anglo lalu dibiarkan seperti itu sampai matang sehingga menjadi kerak.", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-1.jpg"},
            {"Nasi Uduk Betawi", "Makanan", "Nasi Uduk adalah kuliner khas Betawi lainnya. Proses memasak beras untuk nasi uduk adalah dengandiaron dengan menggunakan air santan, daun salam, daun jeruk, laos, dan serai lalu dikukus sampai matang. Rasanya gurih dan memiliki aromanya tersendiri.Nasi uduk Betawi biasanya disajikan dengan taburan bawang goreng, dengan lauk seperti ayam goreng, sambal dan pelengkap lainnya beserta daun kemangi.", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-2.jpg"},
            {"Gado-gado Betawi", "Makanan", "Makanan tradisional betawi selanjutnya adalah gado-gado betawi. Gado-gado sendiri berarti campur aduk dalam bahasa Betawi adalah favorit masyarakat Betawi. Berbagai jenis sayur yang di rebus bersama kentang, tahu, tempe dan telur yang disiram dengan bumbu kacang dan taburan kerupuk menjadikan hidangan ini digemari banyak orang. Kuliner khas betawi ini sangat nikmat disantap dengan nasi atau disajikan bersama lontong.", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-3.jpg"},
            {"Semur Jengkol", "Makanan", "Semur jengkol hidangan khas Betawi ini terkenal dengan bau nya. Untuk beberapa orang, bau jengkol dapat membuatnya tidak suka, tetapi untuk penggemar jengkol, hidangan ini sangatlah digemari. Masakan ini dimasak dengan jengkol yang memiliki rasa pahit, namun setelah dimasak menggunakan berbagai bumbu dan rempah, jengkol menjadi lezat untuk disantap. Semur jengkol biasanya disajikan dengan nasi putih atau nasi uduk hangat. Jangan lupa mencoba hidangan khas Betawi satu ini ya, kalau berkunjug ke Jakarta!", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-4.jpg"},
            {"Soto Betawi", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-5.jpg"},
            {"Roti Buaya", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-6.jpg"},
            {"Asinan Betawi", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-7.jpg"},
            {"Kue Cucur", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-8.jpg", ""},
            {"Dodol Betawi", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-9.jpg"},
            {"Putu Mayang", "ES", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-10.jpg"},
            {"Kue Rangi", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-11.jpg"},
            {"Kue Talam", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-12.jpg"},
            {"Kue Cente Manis", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-13.jpg"},
            {"Getuk Lindri", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-14.jpg"},
            {"Roti Gambang", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-15.jpg"},
            {"Bir Pletok", "Minuman", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-16.jpg"},
            {"Es Doger", "Minuman", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-17.jpg"},
            {"Kue Pancong", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-18.jpg"},
            {"Nasi Ulam", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-19.jpg"},
            {"Kue Ape", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-20.jpg"},
            {"Soto Tangkar", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-21.jpg"},
            {"Kembang Goyang", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-22.jpg"},
            {"Selendang Mayang", "ES", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-23.jpg"},
            {"Kue Lupis", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kue-lupis.jpg"},
            {"Ketupat/Lontong Sayur", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-25.jpg"},
            {"Kue Geplak", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-26.jpg"},
            {"Ketupat Babanci", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-27.jpg"},
            {"Gabus Pucung", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-28.jpg"},
            {"Sengkulun", "Kue", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-29.jpg"},
            {"Sayur Besan", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-30.jpg"},
            {"Bubur Ase", "Makanan", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-31.jpg"},
            {"Es Goyang", "ES", "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2017/09/kuliner-betawi-32.jpg"}
    };

    public static ArrayList<MenuMakanan> getListmakanan() {
        ArrayList<MenuMakanan> list = new ArrayList<>();
        for (String[] aMakanan : data) {
            MenuMakanan menuMakanan = new MenuMakanan();
            menuMakanan.setTitle(aMakanan[0]);
            menuMakanan.setSubtitle(aMakanan[1]);
            menuMakanan.setPhoto(aMakanan[2]);
            //menuMakanan.setDesription(aMakanan[3]);

            list.add(menuMakanan);
        }

        return list;
    }
}
