[required jar: Gson(2.8)]

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//object to JSON
Gson gson = new Gson();
StudentData student = new StudentData("abc", "def", "507");
String json = gson.toJson(student);

//Json to object
Gson gson = new Gson();
String json = getJsonString();

StudentData student = gson.toJson(json, StudentData.class);
//or
Type type = new TypeToken < StudentData > () {}.getType();
StudentData student = gson.toJson(json, type);



//parsing json string
JsonObject jsonobj = new JsonParser().parse(results).getAsJsonObject();

//selecting a child with name
//object direct-chile ( "keyname":{ "some":"thing" })
JsonObject jsonobj = jsonobj.getAsJsonObject("keyname");
String entireJsondom = jsonobj.toString();

//selecting direct-child value( "keyname":"thisvalue" ) 
JsonElement element = jsonobject.get("keyname");
String value = element.toString();

//array direct-child ( "keyname" : ["abcd","abbc",{"some" : "thing"}] )
JsonArray array = jsonobj.getAsJsonArray("keyname");
for (int i = 0; i < array.size(); i++) {
    JsonElement element = array.get(i);
    if (element.isJsonNull()) {

    } else {
        element.toString()
    }
}
