class Codec {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
    {
        StringBuilder url = new StringBuilder(longUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));          
        }    
        return url.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder url = new StringBuilder(shortUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));          
        }    
        return url.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

