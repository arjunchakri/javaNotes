[required jar: Gson(2.8)]

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//converstion
    //object to JSON
    Gson gson = new Gson();
    StudentData student = new StudentData("abc", "def", "507");
    String json = gson.toJson(student);

    //Json to object
    Gson gson = new Gson();
    String json = getJsonString();

    StudentData student = gson.toJson(json, StudentData.class);
    //  or
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



//XML Xpath---------------------
FileInputStream fileInputStream = new FileInputStream(file);
InputSource is = new InputSource(fileInputStream);

DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
documentBuilderFactory.setNamespaceAware(true);
DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
Document document = documentBuilder.parse(is);

XPath xPath = XPathFactory.newInstance().newXPath();
String xpathQuery = "configuration/configdescription";
String[] eachArr = {};
NodeList nodes = (NodeList) xPath.compile(xpathQuery).evaluate(document, XPathConstants.NODESET);
for (int i = 0; i < nodes.getLength(); i++) {
  if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {//filtering elements
    if (nodes.item(i).getAttributes().getNamedItem("key") != null)
        nodes.item(i).getAttributes().getNamedItem("key").getNodeValue(); // xml node values
        NodeList configList = nodes.item(i).getChildNodes(); //getting childnodes
        
    }
}
  
//Serialization------------------------
public class C3Serialization {
	static void serializeObject(Object object, File file) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(object);
	}

	static Object deserializeObject(File file) throws Exception {
		Object object = null;
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return objectInputStream.readObject();

	}

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("10", "abc", "a", "nowhreer");
		File file = new File("employee.txt");
		serializeObject(employee, file);
		System.out.println(deserializeObject(file).toString());
	}
}

