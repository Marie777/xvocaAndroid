package voca.xvocaandroid.models;


import org.json.JSONException;
import org.json.JSONObject;

public class Word {
    private String word;
    private int frequency;
    private int weight;

    public Word(JSONObject j) {

        try {
            word = j.has("word") ? j.getString("word"):"";
            frequency = j.has("frequency") ? j.getInt("frequency"):0;
            weight = j.has("weight") ? j.getInt("weight"): 0;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
