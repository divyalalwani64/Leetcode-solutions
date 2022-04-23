public class Codec {
     HashMap<String,String> url = new HashMap(); //1st string will store tinyUrl and other one will store longUr
     StringBuilder random = new StringBuilder();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        random.append((char)Math.floor(Math.random()*100));
        while(url.containsKey(random))
            random.append((char)Math.floor(Math.random()*100));
        url.put(random.toString(),longUrl);  
        return random.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return url.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));