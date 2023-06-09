package com.example.educheck.Modele;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class University implements Serializable {

    private String name;
    public University(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public JSONObject convertToJSONObject(){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", getName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
