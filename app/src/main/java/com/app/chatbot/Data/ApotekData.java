package com.app.chatbot.Data;

import com.app.chatbot.Model.Apotek;
import com.app.chatbot.R;

import java.util.ArrayList;

public class ApotekData {

    private static final String [] nameObat = {
            "Anadin",
            "Paracetamol",
            "Antiprestisin",
            "Stablon",
            "Sandepril",
            "Sertraline"
    };

    private static final String [] alamat = {
            "JL.Garuda Sakti KM 1",
            "Panam",
            "JL.HR Soebrantas",
            "JL.Naga Sakti",
            "JL.S.M Amin",
            "JL.Soekarno-Hatta",
    };

    private static final int [] gambarObat = {
            R.drawable.anadin,
            R.drawable.paracetamol,
            R.drawable.antiprestin,
            R.drawable.stablon,
            R.drawable.sandepril,
            R.drawable.sertraline,
    };
    public static ArrayList<Apotek> getList(){
        ArrayList<Apotek> list = new ArrayList<>();
        for (int pos = 0; pos < nameObat.length; pos++ ){
            Apotek apotek = new Apotek();
            apotek.setNama(nameObat[pos]);
            apotek.setAlamat(alamat[pos]);
            apotek.setGambar(gambarObat[pos]);
            list.add(apotek);
        }
        return list;
    }
}
