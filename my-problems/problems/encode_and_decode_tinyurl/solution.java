public class Codec {

   Map<String, String> db = new HashMap<>();
    
	private String getCode(String[] urlArray) {
		
		int c = 65;
		StringBuilder builder  = new StringBuilder();
		builder.append("http://myurl/");
		
		for(String string : urlArray) {
			if(!string.isEmpty() || !string.isEmpty()) {
				builder.append(string.charAt(0)).append(c).append((char)c);
			}
			if(c == 90) c = 97;
			else if(c == 122) c = 65;
			
			c++;
		}
		return builder.toString();
	}
	
    public String encode(String longUrl) {
    	
    	if(db.containsKey(longUrl)) return db.get(longUrl);
    	
    	String[] urlArray = longUrl.split("/");
    	String code = getCode(urlArray);
    	
    	db.put(code, longUrl);
    	db.put(longUrl, code);
    	
    	return code;
    }

    public String decode(String shortUrl) {
    	
    	return db.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));