package com.udacity.sandwichclub.utils;

import android.util.Log;

import com.udacity.sandwichclub.model.Sandwich;

public class JsonUtils {

    private static final String TAG = JsonUtils.class.getSimpleName();

    public static Sandwich parseSandwichJson(String json) {

        Log.i(TAG, "parseSandwichJson: " + json);

        // Returns Json data...
        // parseSandwichJson: {"name":{"mainName":"Pljeskavica","alsoKnownAs":[]},"placeOfOrigin":"Serbia","description":"Pljeskavica, a grilled dish of spiced meat patty mixture of pork, beef and lamb, is a national dish of Serbia, also popular in Bosnia and Herzegovina and Croatia. It is a main course served with onions, kajmak (milk cream), ajvar (relish), and urnebes (spicy cheese salad), either on plate with side dishes, or with lepinja (flatbread, as a type of hamburger). Recently, Pljeskavica has gained popularity elsewhere in Europe and is served in a few speciality fast food restaurants in Germany, Sweden, and Austria.","image":"https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Pljeskavica_%286883073017%29.jpg/800px-Pljeskavica_%286883073017%29.jpg","ingredients":["Two or more of beef, lamb, pork, veal","Onions","Bread crumbs","Lard"]}

        return null;
    }


}
