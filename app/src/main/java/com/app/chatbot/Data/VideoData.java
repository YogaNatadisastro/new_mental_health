package com.app.chatbot.Data;

import com.app.chatbot.Model.Video;
import com.app.chatbot.R;

import java.util.ArrayList;

public class VideoData {
    private static final String [] nameVid = {
            "Kucing Lucu",
            "Kucing Gelud",
            "Kucing Lucuuuu",
            "Cats and Dogs",
            "Funniest Animal"
    };
    private static final String [] durasiVid = {
            "17 : 22",
            "08 : 25",
            "10 : 51",
            "06 : 41",
            "03 : 31"

    };
    private static final String [] urlVid = {
            "https://firebasestorage.googleapis.com/v0/b/mental-app-7fdce.appspot.com/o/1%20(1).mp4?alt=media&token=e4b40783-6d93-4ecc-ad29-e5b2eb738d78",
            "https://firebasestorage.googleapis.com/v0/b/mental-app-7fdce.appspot.com/o/1%20(2).mp4?alt=media&token=6baf3a26-1bd6-4c48-aa0b-47f337fb5f98",
            "https://firebasestorage.googleapis.com/v0/b/mental-app-7fdce.appspot.com/o/1%20(3).mp4?alt=media&token=59d3c7b3-8111-43d5-b938-69cf977c9d45",
            "https://firebasestorage.googleapis.com/v0/b/mental-app-7fdce.appspot.com/o/1%20(4).mp4?alt=media&token=981dff91-5023-479c-b7b2-88841a25b123",
            "https://firebasestorage.googleapis.com/v0/b/mental-app-7fdce.appspot.com/o/1%20(5).mp4?alt=media&token=22933644-38f8-42dc-8841-7b078477c8a1",
    };
    private static final int [] gambarVid = {
            R.drawable.kucing_1,
            R.drawable.kucing_2,
            R.drawable.kucing_3,
            R.drawable.kucing_4,
            R.drawable.kucing_5
    };

    public static ArrayList<Video> getListData() {
        ArrayList<Video> list = new ArrayList<>();
        for (int position = 0; position < nameVid.length; position++) {
            Video video = new Video();
            video.setName(nameVid[position]);
            video.setDurasi(durasiVid[position]);
            video.setUrl(urlVid[position]);
            video.setGambar(gambarVid[position]);
            list.add(video);
        }
        return list;
    }
}
