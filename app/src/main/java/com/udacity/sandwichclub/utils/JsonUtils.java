package com.udacity.sandwichclub.utils;

import android.util.Log;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    private static final String TAG = JsonUtils.class.getSimpleName();

    public static Sandwich parseSandwichJson(String sandwichJsonStr) throws JSONException {

        final String SANDWICH_NAME = "name";
        final String SANDWICH_MAIN_NAME = "mainName";
        final String SANDWICH_ALSO_KNOWN_AS = "alsoKnownAs";
        final String SANDWICH_PLACE_OF_ORIGIN = "placeOfOrigin";
        final String SANDWICH_DESCRIPTION = "description";
        final String SANDWICH_IMAGE = "image";
        final String SANDWICH_INGREDIENTS = "ingredients";

        Log.i(TAG, "parseSandwichJson: " + sandwichJsonStr);

        JSONObject sandwichJsonObject = new JSONObject(sandwichJsonStr);

        Log.i(TAG, "sandwichJsonObject: " + sandwichJsonObject.toString());

        // To reach mainName & alsoKnownAs using Object on the Object
        // sandwichJsonObject.getJSONObject(SANDWICH_NAME)

        String sandwichName = sandwichJsonObject.getJSONObject(SANDWICH_NAME).getString(SANDWICH_MAIN_NAME);

        List<String> sandwichAlsoKnownAs = new ArrayList<>();
        JSONArray sandwichAlsoKnownAsArray = sandwichJsonObject.getJSONObject(SANDWICH_NAME).getJSONArray(SANDWICH_ALSO_KNOWN_AS);
        for (int i = 0; i < sandwichAlsoKnownAsArray.length(); i++) {
            Log.i(TAG, "sandwichAlsoKnownAsArray: " + sandwichAlsoKnownAsArray.getString(i));
            sandwichAlsoKnownAs.add( sandwichAlsoKnownAsArray.getString(i) );
        }

        String sandwichPlaceOfOrigin = sandwichJsonObject.getString(SANDWICH_PLACE_OF_ORIGIN);
        String sandwichDescription = sandwichJsonObject.getString(SANDWICH_DESCRIPTION);
        String sandwichImage = sandwichJsonObject.getString(SANDWICH_IMAGE);

        List<String> sandwichIngredients = new ArrayList<>();
        JSONArray sandwichIngredientsArray = sandwichJsonObject.getJSONArray(SANDWICH_INGREDIENTS);
        for (int i = 0; i < sandwichIngredientsArray.length(); i++) {
            Log.i(TAG, "sandwichIngredientsArray: " + sandwichIngredientsArray.getString(i));
            sandwichIngredients.add( sandwichIngredientsArray.getString(i) );
        }

        Log.i(TAG, "sandwichName: " + sandwichName);
        Log.i(TAG, "sandwichPlaceOfOrigin: " + sandwichPlaceOfOrigin);
        Log.i(TAG, "sandwichDescription: " + sandwichDescription);
        Log.i(TAG, "sandwichImage: " + sandwichImage);
        Log.i(TAG, "sandwichIngredients: " + sandwichIngredients);

        Sandwich sandwich = new Sandwich(sandwichName, sandwichAlsoKnownAs, sandwichPlaceOfOrigin, sandwichDescription, sandwichImage, sandwichIngredients);

        return sandwich;
    }

}
