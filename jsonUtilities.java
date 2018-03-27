//parsing json string
JsonObject jsonobj = new JsonParser().parse(results).getAsJsonObject();

//selecting a child with name
  //object
  jsonobj = jsonobj.getAsJsonObject("hits");
  //array
