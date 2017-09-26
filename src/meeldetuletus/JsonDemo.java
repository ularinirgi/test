package meeldetuletus;

	import org.json.simple.JSONObject;

	class JsonDemo {

	   public static void main(String[] args){
	      JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));
	      
	      
	      JSONObject obj2 = new JSONObject();
	      obj2.put("name", "rrrrrrrr");
	      obj2.put("num", new Integer(151510));
	      obj2.put("balance", new Double(102200.21));
	      obj2.put("is_vip", new Boolean(false));
	      System.out.println(obj);
	      System.out.print(obj2);
	   }
	}