public class Codec {

    private Map<String,String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
      
      if(map.containsKey(longUrl)) return map.get(longUrl);
      
        String[] urlArr = longUrl.split("/");
       String code = getCode(urlArr);
       map.put(code,longUrl);
       map.put(longUrl,code);
      
      return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
  
  
  private String getCode(String[] array){
    
    char c = 65;
    StringBuilder builder = new StringBuilder();
    builder.append("https://tinyurl.com/");
    for(String a : array){
      if(!a.isEmpty()){
          builder.append(a.charAt(0)).append(c).append("X");
      } 
        c++;
      
      if(c == 90) c = 97;
      else if(c == 122) c = 65;
    }
    
    return builder.toString();
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));